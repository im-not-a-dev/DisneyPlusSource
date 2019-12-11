package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.n */
public final class C9665n {

    /* renamed from: b */
    private static C9665n f22682b;

    /* renamed from: a */
    private C9654c f22683a;

    private C9665n(Context context) {
        this.f22683a = C9654c.m29983a(context);
        this.f22683a.mo24949b();
        this.f22683a.mo24950c();
    }

    /* renamed from: a */
    public static synchronized C9665n m30015a(Context context) {
        C9665n b;
        synchronized (C9665n.class) {
            b = m30016b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C9665n m30016b(Context context) {
        C9665n nVar;
        synchronized (C9665n.class) {
            if (f22682b == null) {
                f22682b = new C9665n(context);
            }
            nVar = f22682b;
        }
        return nVar;
    }

    /* renamed from: a */
    public final synchronized void mo24969a() {
        this.f22683a.mo24947a();
    }

    /* renamed from: a */
    public final synchronized void mo24970a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f22683a.mo24948a(googleSignInAccount, googleSignInOptions);
    }
}
