package com.google.android.gms.common.p400p;

import android.content.Context;

/* renamed from: com.google.android.gms.common.p.c */
public class C9931c {

    /* renamed from: b */
    private static C9931c f23208b = new C9931c();

    /* renamed from: a */
    private C9930b f23209a = null;

    /* renamed from: a */
    public static C9930b m30956a(Context context) {
        return f23208b.m30957b(context);
    }

    /* renamed from: b */
    private final synchronized C9930b m30957b(Context context) {
        if (this.f23209a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f23209a = new C9930b(context);
        }
        return this.f23209a;
    }
}
