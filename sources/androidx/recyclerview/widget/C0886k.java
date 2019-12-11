package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.view.View;
import p096e.p121h.p135s.C4187x;
import p096e.p153o.C4259b;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: ItemTouchUIUtilImpl */
class C0886k implements C0885j {

    /* renamed from: a */
    static final C0885j f3608a = new C0886k();

    C0886k() {
    }

    /* renamed from: a */
    private static float m4899a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float j = C4187x.m14395j(childAt);
                if (j > f) {
                    f = j;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo5092a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    /* renamed from: b */
    public void mo5094b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(C4259b.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C4187x.m14395j(view));
            C4187x.m14372b(view, m4899a(recyclerView, view) + 1.0f);
            view.setTag(C4259b.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* renamed from: b */
    public void mo5095b(View view) {
    }

    /* renamed from: a */
    public void mo5093a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(C4259b.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C4187x.m14372b(view, ((Float) tag).floatValue());
            }
            view.setTag(C4259b.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
