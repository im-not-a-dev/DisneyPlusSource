package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C9644a;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9874h;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C9660i extends C9874h<C9670s> {

    /* renamed from: E */
    private final GoogleSignInOptions f22679E;

    public C9660i(Context context, Looper looper, C9864d dVar, GoogleSignInOptions googleSignInOptions, C9700b bVar, C9701c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C9644a().mo24922a();
        }
        if (!dVar.mo25358d().isEmpty()) {
            C9644a aVar = new C9644a(googleSignInOptions);
            for (Scope a : dVar.mo25358d()) {
                aVar.mo24921a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo24922a();
        }
        this.f22679E = googleSignInOptions;
    }

    /* renamed from: D */
    public final GoogleSignInOptions mo24959D() {
        return this.f22679E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C9670s) {
            return (C9670s) queryLocalInterface;
        }
        return new C9671t(iBinder);
    }

    /* renamed from: d */
    public final boolean mo24961d() {
        return true;
    }

    /* renamed from: i */
    public final int mo24962i() {
        return C9832i.f23040a;
    }

    /* renamed from: k */
    public final Intent mo24963k() {
        return C9661j.m30009a(mo25332t(), this.f22679E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo24964y() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo24965z() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
