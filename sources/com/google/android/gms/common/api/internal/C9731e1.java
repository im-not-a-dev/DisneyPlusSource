package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.C9810l;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
public final class C9731e1<O extends C9682d> extends C9790u {

    /* renamed from: c */
    private final C9695e<O> f22828c;

    public C9731e1(C9695e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f22828c = eVar;
    }

    /* renamed from: a */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25058a(T t) {
        this.f22828c.mo25047a(t);
        return t;
    }

    /* renamed from: a */
    public final void mo25060a(C9783r1 r1Var) {
    }

    /* renamed from: b */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25063b(T t) {
        this.f22828c.mo25049b(t);
        return t;
    }

    /* renamed from: e */
    public final Context mo25066e() {
        return this.f22828c.mo25052d();
    }

    /* renamed from: f */
    public final Looper mo25067f() {
        return this.f22828c.mo25054f();
    }
}
