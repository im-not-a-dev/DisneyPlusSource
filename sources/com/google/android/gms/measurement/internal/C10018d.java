package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C10018d extends C10101k5 {

    /* renamed from: c */
    private long f23350c;

    /* renamed from: d */
    private String f23351d;

    /* renamed from: e */
    private Boolean f23352e;

    /* renamed from: f */
    private AccountManager f23353f;

    /* renamed from: g */
    private Boolean f23354g;

    /* renamed from: h */
    private long f23355h;

    C10018d(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: a */
    public final boolean mo25654a(Context context) {
        if (this.f23352e == null) {
            mo25894a();
            this.f23352e = Boolean.valueOf(false);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f23352e = Boolean.valueOf(true);
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.f23352e.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        Calendar instance = Calendar.getInstance();
        this.f23350c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f23351d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final long mo25656t() {
        mo25884p();
        return this.f23350c;
    }

    /* renamed from: u */
    public final String mo25657u() {
        mo25884p();
        return this.f23351d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final long mo25658v() {
        mo25662j();
        return this.f23355h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo25659w() {
        mo25662j();
        this.f23354g = null;
        this.f23355h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo25660x() {
        String str = "com.google";
        mo25662j();
        long c = mo25896c().mo25474c();
        if (c - this.f23355h > 86400000) {
            this.f23354g = null;
        }
        Boolean bool = this.f23354g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C4025a.m13789a(mo25895b(), "android.permission.GET_ACCOUNTS") != 0) {
            mo25898e().mo25878x().mo25908a("Permission error checking for dasher/unicorn accounts");
            this.f23355h = c;
            this.f23354g = Boolean.valueOf(false);
            return false;
        }
        if (this.f23353f == null) {
            this.f23353f = AccountManager.get(mo25895b());
        }
        try {
            Account[] accountArr = (Account[]) this.f23353f.getAccountsByTypeAndFeatures(str, new String[]{"service_HOSTED"}, null, null).getResult();
            if (accountArr == null || accountArr.length <= 0) {
                Account[] accountArr2 = (Account[]) this.f23353f.getAccountsByTypeAndFeatures(str, new String[]{"service_uca"}, null, null).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    this.f23354g = Boolean.valueOf(true);
                    this.f23355h = c;
                    return true;
                }
                this.f23355h = c;
                this.f23354g = Boolean.valueOf(false);
                return false;
            }
            this.f23354g = Boolean.valueOf(true);
            this.f23355h = c;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mo25898e().mo25875u().mo25909a("Exception checking account types", e);
        }
    }
}
