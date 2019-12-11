package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import com.google.android.gms.common.internal.C9864d;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: com.google.android.gms.common.api.internal.m2 */
public final class C9765m2<O extends C9682d> extends C9695e<O> {

    /* renamed from: i */
    private final C9689f f22900i;

    /* renamed from: j */
    private final C9740g2 f22901j;

    /* renamed from: k */
    private final C9864d f22902k;

    /* renamed from: l */
    private final C9679a<? extends C11423f, C11406a> f22903l;

    public C9765m2(Context context, C9678a<O> aVar, Looper looper, C9689f fVar, C9740g2 g2Var, C9864d dVar, C9679a<? extends C11423f, C11406a> aVar2) {
        super(context, aVar, looper);
        this.f22900i = fVar;
        this.f22901j = g2Var;
        this.f22902k = dVar;
        this.f22903l = aVar2;
        this.f22716h.mo25136a((C9695e<?>) this);
    }

    /* renamed from: a */
    public final C9689f mo25045a(Looper looper, C9727a<O> aVar) {
        this.f22901j.mo25174a((C9744h2) aVar);
        return this.f22900i;
    }

    /* renamed from: h */
    public final C9689f mo25216h() {
        return this.f22900i;
    }

    /* renamed from: a */
    public final C9768n1 mo25048a(Context context, Handler handler) {
        return new C9768n1(context, handler, this.f22902k, this.f22903l);
    }
}
