package p163g.p174d.p178b.p196m0;

import android.view.View;
import java.util.List;

/* renamed from: g.d.b.m0.f */
/* compiled from: ViewUtils */
public class C5311f {
    /* renamed from: a */
    public static boolean m17968a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: b */
    public static void m17969b(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m17967a(List<View> list, int i) {
        if (list != null) {
            for (View a : list) {
                m17965a(a, i);
            }
        }
    }

    /* renamed from: a */
    public static void m17965a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m17966a(View view, boolean z) {
        if (view != null) {
            view.setActivated(z);
        }
    }
}
