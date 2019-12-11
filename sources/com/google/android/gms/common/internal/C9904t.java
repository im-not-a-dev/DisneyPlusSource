package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C9692b;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.C9702g.C9703a;
import com.google.android.gms.common.api.C9809k;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.internal.t */
public class C9904t {

    /* renamed from: a */
    private static final C9906b f23179a = new C9869e0();

    /* renamed from: com.google.android.gms.common.internal.t$a */
    public interface C9905a<R extends C9810l, T> {
        /* renamed from: a */
        T mo25374a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.t$b */
    public interface C9906b {
        /* renamed from: a */
        C9692b mo25371a(Status status);
    }

    /* renamed from: a */
    public static <R extends C9810l, T> C11435h<T> m30847a(C9702g<R> gVar, C9905a<R, T> aVar) {
        C9906b bVar = f23179a;
        C11436i iVar = new C11436i();
        gVar.mo25080a((C9703a) new C9871f0(gVar, iVar, aVar, bVar));
        return iVar.mo29271a();
    }

    /* renamed from: a */
    public static <R extends C9810l, T extends C9809k<R>> C11435h<T> m30846a(C9702g<R> gVar, T t) {
        return m30847a(gVar, (C9905a<R, T>) new C9873g0<R,T>(t));
    }

    /* renamed from: a */
    public static <R extends C9810l> C11435h<Void> m30845a(C9702g<R> gVar) {
        return m30847a(gVar, (C9905a<R, T>) new C9875h0<R,T>());
    }
}
