package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.leanback.widget.y */
/* compiled from: Util */
public class C0697y {
    /* renamed from: a */
    public static boolean m3675a(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }
}
