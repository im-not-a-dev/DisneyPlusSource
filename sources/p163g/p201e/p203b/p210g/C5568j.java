package p163g.p201e.p203b.p210g;

import com.jakewharton.rxrelay2.C10534d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.e.b.g.j */
/* compiled from: OfflineStateTracker.kt */
public final class C5568j {

    /* renamed from: a */
    private final C10534d<Boolean> f13130a;

    public C5568j() {
        C10534d<Boolean> c = C10534d.m33233c(2);
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "ReplayRelay.createWithSize(2)");
        this.f13130a = c;
    }

    /* renamed from: a */
    public final void mo17323a(boolean z) {
        this.f13130a.accept(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo17324b() {
        this.f13130a.accept(Boolean.valueOf(true));
    }

    /* renamed from: c */
    public final boolean mo17325c() {
        return Intrinsics.areEqual((Object) (Boolean) m18374a(this.f13130a, 0), (Object) Boolean.valueOf(false)) && Intrinsics.areEqual((Object) (Boolean) m18374a(this.f13130a, 1), (Object) Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo17322a() {
        this.f13130a.accept(Boolean.valueOf(false));
    }

    /* renamed from: a */
    private final <T> T m18374a(C10534d<T> dVar, int i) {
        if (i < dVar.mo27422n().length) {
            return dVar.mo27422n()[i];
        }
        return null;
    }
}
