package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C9948l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;
import p163g.p449j.p482b.C11512c;

/* renamed from: com.google.firebase.iid.i */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10477i {

    /* renamed from: a */
    private final Context f24829a;

    /* renamed from: b */
    private String f24830b;

    /* renamed from: c */
    private String f24831c;

    /* renamed from: d */
    private int f24832d;

    /* renamed from: e */
    private int f24833e = 0;

    public C10477i(Context context) {
        this.f24829a = context;
    }

    /* renamed from: e */
    private final synchronized void m33058e() {
        PackageInfo a = m33055a(this.f24829a.getPackageName());
        if (a != null) {
            this.f24830b = Integer.toString(a.versionCode);
            this.f24831c = a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo27315a() {
        if (this.f24833e != 0) {
            return this.f24833e;
        }
        PackageManager packageManager = this.f24829a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C9948l.m30996i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f24833e = 1;
                return this.f24833e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C9948l.m30996i()) {
                this.f24833e = 2;
            } else {
                this.f24833e = 1;
            }
            return this.f24833e;
        }
        this.f24833e = 2;
        return this.f24833e;
    }

    /* renamed from: b */
    public final synchronized String mo27316b() {
        if (this.f24830b == null) {
            m33058e();
        }
        return this.f24830b;
    }

    /* renamed from: c */
    public final synchronized String mo27317c() {
        if (this.f24831c == null) {
            m33058e();
        }
        return this.f24831c;
    }

    /* renamed from: d */
    public final synchronized int mo27318d() {
        if (this.f24832d == 0) {
            PackageInfo a = m33055a("com.google.android.gms");
            if (a != null) {
                this.f24832d = a.versionCode;
            }
        }
        return this.f24832d;
    }

    /* renamed from: a */
    public static String m33056a(C11512c cVar) {
        String b = cVar.mo29431c().mo29443b();
        if (b != null) {
            return b;
        }
        String a = cVar.mo29431c().mo29442a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m33057a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    private final PackageInfo m33055a(String str) {
        try {
            return this.f24829a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
