package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C9908u;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p163g.p449j.p450a.p451a.p457d.p463f.C11011j;
import p163g.p449j.p450a.p451a.p457d.p463f.C11014m;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11439k;

/* renamed from: com.google.firebase.messaging.m */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
final class C10525m implements Closeable {

    /* renamed from: U */
    private C11435h<Bitmap> f24934U;

    /* renamed from: V */
    private volatile InputStream f24935V;

    /* renamed from: c */
    private final URL f24936c;

    private C10525m(URL url) {
        this.f24936c = url;
    }

    /* renamed from: e */
    public static C10525m m33212e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C10525m(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* renamed from: a */
    public final void mo27393a(Executor executor) {
        this.f24934U = C11439k.m36960a(executor, (Callable<TResult>) new C10526n<TResult>(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        m33211a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        m33211a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo27394b() throws java.io.IOException {
        /*
            r7 = this;
            java.net.URL r0 = r7.f24936c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Starting download of: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.i(r1, r0)
            java.net.URL r0 = r7.f24936c     // Catch:{ IOException -> 0x00ae }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00ae }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00ae }
            r2 = 1048576(0x100000, double:5.180654E-318)
            java.io.InputStream r2 = p163g.p449j.p450a.p451a.p457d.p463f.C11010i.m34724a(r0, r2)     // Catch:{ all -> 0x00a5 }
            r7.f24935V = r0     // Catch:{ all -> 0x009e }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0074
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x006a
            java.net.URL r4 = r7.f24936c     // Catch:{ all -> 0x009e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009e }
            int r5 = r5.length()     // Catch:{ all -> 0x009e }
            int r5 = r5 + 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r6.<init>(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "Successfully downloaded image: "
            r6.append(r5)     // Catch:{ all -> 0x009e }
            r6.append(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x009e }
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x009e }
        L_0x006a:
            r4 = 0
            m33211a(r4, r2)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0073
            m33211a(r4, r0)     // Catch:{ IOException -> 0x00ae }
        L_0x0073:
            return r3
        L_0x0074:
            java.net.URL r3 = r7.f24936c     // Catch:{ all -> 0x009e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x009e }
            int r4 = r4.length()     // Catch:{ all -> 0x009e }
            int r4 = r4 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r5.<init>(r4)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Failed to decode image: "
            r5.append(r4)     // Catch:{ all -> 0x009e }
            r5.append(r3)     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009e }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x009e }
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009e }
            r4.<init>(r3)     // Catch:{ all -> 0x009e }
            throw r4     // Catch:{ all -> 0x009e }
        L_0x009e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r4 = move-exception
            m33211a(r3, r2)     // Catch:{ all -> 0x00a5 }
            throw r4     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r3 = move-exception
            if (r0 == 0) goto L_0x00ad
            m33211a(r2, r0)     // Catch:{ IOException -> 0x00ae }
        L_0x00ad:
            throw r3     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            java.net.URL r2 = r7.f24936c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to download image: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C10525m.mo27394b():android.graphics.Bitmap");
    }

    public final void close() {
        C11011j.m34725a(this.f24935V);
    }

    /* renamed from: a */
    public final C11435h<Bitmap> mo27392a() {
        C11435h<Bitmap> hVar = this.f24934U;
        C9908u.m30853a(hVar);
        return hVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m33211a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C11014m.m34728a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }
}
