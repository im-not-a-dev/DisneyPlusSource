package p163g.p449j.p450a.p468b.p469l;

import android.util.Property;
import android.view.ViewGroup;
import p163g.p449j.p450a.p468b.C11462f;

/* renamed from: g.j.a.b.l.d */
/* compiled from: ChildrenAlphaProperty */
public class C11471d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f26821a = new C11471d("childrenAlpha");

    private C11471d(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C11462f.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C11462f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
