package p096e.p154p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p096e.p121h.p135s.C4187x;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.d */
/* compiled from: Fade */
public class C4280d extends C4299i0 {

    /* renamed from: e.p.d$a */
    /* compiled from: Fade */
    class C4281a extends C4316n {

        /* renamed from: a */
        final /* synthetic */ View f10656a;

        C4281a(C4280d dVar, View view) {
            this.f10656a = view;
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            C4283d0.m14703a(this.f10656a, 1.0f);
            C4283d0.m14702a(this.f10656a);
            mVar.mo15099b((C4315f) this);
        }
    }

    /* renamed from: e.p.d$b */
    /* compiled from: Fade */
    private static class C4282b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f10657a;

        /* renamed from: b */
        private boolean f10658b = false;

        C4282b(View view) {
            this.f10657a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C4283d0.m14703a(this.f10657a, 1.0f);
            if (this.f10658b) {
                this.f10657a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C4187x.m14336A(this.f10657a) && this.f10657a.getLayerType() == 0) {
                this.f10658b = true;
                this.f10657a.setLayerType(2, null);
            }
        }
    }

    public C4280d(int i) {
        mo15067a(i);
    }

    /* renamed from: a */
    private Animator m14696a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C4283d0.m14703a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C4283d0.f10662d, new float[]{f2});
        ofFloat.addListener(new C4282b(view));
        mo15085a((C4315f) new C4281a(this, view));
        return ofFloat;
    }

    /* renamed from: b */
    public Animator mo15043b(ViewGroup viewGroup, View view, C4325s sVar, C4325s sVar2) {
        C4283d0.m14711e(view);
        return m14696a(view, m14695a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo15008c(C4325s sVar) {
        super.mo15008c(sVar);
        sVar.f10769a.put("android:fade:transitionAlpha", Float.valueOf(C4283d0.m14709c(sVar.f10770b)));
    }

    /* renamed from: a */
    public Animator mo15042a(ViewGroup viewGroup, View view, C4325s sVar, C4325s sVar2) {
        float f = 0.0f;
        float a = m14695a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m14696a(view, f, 1.0f);
    }

    /* renamed from: a */
    private static float m14695a(C4325s sVar, float f) {
        if (sVar == null) {
            return f;
        }
        Float f2 = (Float) sVar.f10769a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }
}
