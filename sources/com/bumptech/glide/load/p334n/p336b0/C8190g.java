package com.bumptech.glide.load.p334n.p336b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p336b0.C8191h.C8192a;
import p163g.p413f.p414a.p424w.C10771g;

/* renamed from: com.bumptech.glide.load.n.b0.g */
/* compiled from: LruResourceCache */
public class C8190g extends C10771g<C8111g, C8258v<?>> implements C8191h {

    /* renamed from: d */
    private C8192a f17487d;

    public C8190g(long j) {
        super(j);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C8258v mo21280a(C8111g gVar, C8258v vVar) {
        return (C8258v) super.mo27807b(gVar, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21283a(C8111g gVar, C8258v<?> vVar) {
        C8192a aVar = this.f17487d;
        if (aVar != null && vVar != null) {
            aVar.mo21287a(vVar);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C8258v mo21279a(C8111g gVar) {
        return (C8258v) super.mo27808c(gVar);
    }

    /* renamed from: a */
    public void mo21282a(C8192a aVar) {
        this.f17487d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo21284b(C8258v<?> vVar) {
        if (vVar == null) {
            return super.mo21284b(null);
        }
        return vVar.getSize();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo21281a(int i) {
        if (i >= 40) {
            mo27804a();
        } else if (i >= 20 || i == 15) {
            mo27805a(mo27806b() / 2);
        }
    }
}
