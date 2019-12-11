package androidx.leanback.widget;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.leanback.widget.p */
/* compiled from: Parallax */
public abstract class C0675p<PropertyT extends Property> {

    /* renamed from: a */
    final List<PropertyT> f2884a = new ArrayList();

    /* renamed from: b */
    private int[] f2885b;

    /* renamed from: c */
    private float[] f2886c;

    /* renamed from: d */
    private final List<C0685q> f2887d;

    public C0675p() {
        Collections.unmodifiableList(this.f2884a);
        this.f2885b = new int[4];
        this.f2886c = new float[4];
        this.f2887d = new ArrayList(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo3991a(int i) {
        return this.f2886c[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3993b() throws IllegalStateException {
        if (this.f2884a.size() >= 2) {
            float a = mo3991a(0);
            int i = 1;
            while (i < this.f2884a.size()) {
                float a2 = mo3991a(i);
                if (a2 < a) {
                    int i2 = i - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", new Object[]{Integer.valueOf(i), ((Property) this.f2884a.get(i)).getName(), Integer.valueOf(i2), ((Property) this.f2884a.get(i2)).getName()}));
                } else if (a == -3.4028235E38f && a2 == Float.MAX_VALUE) {
                    int i3 = i - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", new Object[]{Integer.valueOf(i3), ((Property) this.f2884a.get(i3)).getName(), Integer.valueOf(i), ((Property) this.f2884a.get(i)).getName()}));
                } else {
                    i++;
                    a = a2;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3992a() {
        for (int i = 0; i < this.f2887d.size(); i++) {
            ((C0685q) this.f2887d.get(i)).mo4050c(this);
        }
    }
}
