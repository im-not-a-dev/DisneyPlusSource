package p096e.p121h.p135s;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.h.s.r */
/* compiled from: NestedScrollingParentHelper */
public class C4181r {

    /* renamed from: a */
    private int f10475a;

    /* renamed from: b */
    private int f10476b;

    public C4181r(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo14825a(View view, View view2, int i) {
        mo14826a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo14826a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f10476b = i;
        } else {
            this.f10475a = i;
        }
    }

    /* renamed from: a */
    public int mo14822a() {
        return this.f10475a | this.f10476b;
    }

    /* renamed from: a */
    public void mo14823a(View view) {
        mo14824a(view, 0);
    }

    /* renamed from: a */
    public void mo14824a(View view, int i) {
        if (i == 1) {
            this.f10476b = 0;
        } else {
            this.f10475a = 0;
        }
    }
}
