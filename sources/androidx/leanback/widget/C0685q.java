package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.leanback.widget.q */
/* compiled from: ParallaxEffect */
public abstract class C0685q {

    /* renamed from: a */
    final List<Object> f2937a = new ArrayList(2);

    /* renamed from: b */
    final List<C0686r> f2938b;

    C0685q() {
        new ArrayList(2);
        new ArrayList(2);
        this.f2938b = new ArrayList(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Number mo4048a(C0675p pVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract float mo4049b(C0675p pVar);

    /* renamed from: c */
    public final void mo4050c(C0675p pVar) {
        if (this.f2937a.size() >= 2) {
            pVar.mo3993b();
            Number number = null;
            boolean z = false;
            float f = 0.0f;
            for (int i = 0; i < this.f2938b.size(); i++) {
                C0686r rVar = (C0686r) this.f2938b.get(i);
                if (rVar.mo4053a()) {
                    if (number == null) {
                        number = mo4048a(pVar);
                    }
                    rVar.mo4052a(number);
                } else {
                    if (!z) {
                        f = mo4049b(pVar);
                        z = true;
                    }
                    rVar.mo4051a(f);
                }
            }
        }
    }
}
