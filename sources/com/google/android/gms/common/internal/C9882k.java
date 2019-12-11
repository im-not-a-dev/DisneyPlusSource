package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C9882k {

    /* renamed from: a */
    private final String f23151a;

    /* renamed from: b */
    private final String f23152b;

    public C9882k(String str, String str2) {
        C9908u.m30854a(str, (Object) "log tag cannot be null");
        C9908u.m30862a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f23151a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f23152b = null;
        } else {
            this.f23152b = str2;
        }
    }

    /* renamed from: a */
    public final boolean mo25401a(int i) {
        return Log.isLoggable(this.f23151a, i);
    }

    /* renamed from: b */
    public final void mo25402b(String str, String str2) {
        if (mo25401a(6)) {
            Log.e(str, m30797a(str2));
        }
    }

    /* renamed from: c */
    public final void mo25403c(String str, String str2) {
        if (mo25401a(2)) {
            Log.v(str, m30797a(str2));
        }
    }

    /* renamed from: a */
    public final void mo25399a(String str, String str2) {
        if (mo25401a(3)) {
            Log.d(str, m30797a(str2));
        }
    }

    /* renamed from: a */
    public final void mo25400a(String str, String str2, Throwable th) {
        if (mo25401a(6)) {
            Log.e(str, m30797a(str2), th);
        }
    }

    /* renamed from: a */
    private final String m30797a(String str) {
        String str2 = this.f23152b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    public C9882k(String str) {
        this(str, null);
    }
}
