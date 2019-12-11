package p096e.p154p;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.p.l */
/* compiled from: Scene */
public class C4307l {

    /* renamed from: a */
    private ViewGroup f10707a;

    /* renamed from: b */
    private Runnable f10708b;

    /* renamed from: a */
    public void mo15081a() {
        if (m14783a(this.f10707a) == this) {
            Runnable runnable = this.f10708b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    static void m14784a(View view, C4307l lVar) {
        view.setTag(C4303j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    static C4307l m14783a(View view) {
        return (C4307l) view.getTag(C4303j.transition_current_scene);
    }
}
