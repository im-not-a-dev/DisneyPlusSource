package com.bamtech.player.exo.p041i;

import android.annotation.SuppressLint;
import p163g.p174d.p178b.C5326w;
import p163g.p426g.p427a.p428i.C10819a;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtech.player.exo.i.c */
/* compiled from: BamPlayerClientMeasureInterface */
public class C1712c implements C10819a {

    /* renamed from: a */
    private long f5969a = -1;

    /* renamed from: b */
    private long f5970b = -1;

    @SuppressLint({"CheckResult"})
    public C1712c(C5326w wVar) {
        wVar.mo7618d().mo16938C0().mo30192f((Consumer<? super T>) new C1710a<Object>(this));
        wVar.mo7618d().mo17066s().mo30192f((Consumer<? super T>) new C1711b<Object>(this));
    }

    /* renamed from: a */
    public void mo7658a(long j) {
        this.f5970b = j;
    }

    /* renamed from: b */
    public void mo7660b(long j) {
        this.f5969a = j;
    }

    /* renamed from: a */
    public int mo7657a() {
        return (int) this.f5970b;
    }

    /* renamed from: b */
    public long mo7659b() {
        return this.f5969a;
    }
}
