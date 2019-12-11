package p163g.p174d.p178b.p185g0.p186v5;

import android.annotation.SuppressLint;
import android.media.AudioManager.OnAudioFocusChangeListener;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p185g0.C5271z3;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

/* renamed from: g.d.b.g0.v5.d */
/* compiled from: AudioFocusDelegate */
public class C5175d implements C5271z3, OnAudioFocusChangeListener {

    /* renamed from: U */
    boolean f12499U;

    /* renamed from: c */
    private final C5326w f12500c;

    @SuppressLint({"CheckResult"})
    public C5175d(C5177f fVar, boolean z, C5326w wVar, C5300m mVar) {
        this.f12500c = wVar;
        if (z) {
            C5176e a = fVar.mo16681a(this);
            Observable L = mVar.mo16955L();
            a.getClass();
            L.mo30192f((Consumer<? super T>) new C5174c<Object>(a));
            Observable M = mVar.mo16957M();
            a.getClass();
            Observable c = M.mo30180c((C11945a) new C5172a(a));
            a.getClass();
            c.mo30192f((Consumer<? super T>) new C5173b<Object>(a));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16676a() {
        if (this.f12499U) {
            this.f12500c.mo7628i();
        }
    }

    public void onAudioFocusChange(int i) {
        if (i == -3) {
            C14100a.m44529c("Audio Focus Lost (Can Duck)", new Object[0]);
        } else if (i == -2) {
            C14100a.m44529c("Audio Focus Lost (Transient)", new Object[0]);
            this.f12499U = this.f12500c.mo7609a();
            this.f12500c.mo7611b();
        } else if (i == -1) {
            C14100a.m44529c("Audio Focus Lost", new Object[0]);
            this.f12499U = this.f12500c.mo7609a();
            this.f12500c.mo7611b();
        } else if (i == 1) {
            C14100a.m44529c("Audio Focus Gained", new Object[0]);
            mo16676a();
        }
    }
}
