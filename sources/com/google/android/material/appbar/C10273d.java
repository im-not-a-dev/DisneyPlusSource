package com.google.android.material.appbar;

import android.view.View;
import p096e.p121h.p135s.C4187x;

/* renamed from: com.google.android.material.appbar.d */
/* compiled from: ViewOffsetHelper */
class C10273d {

    /* renamed from: a */
    private final View f24143a;

    /* renamed from: b */
    private int f24144b;

    /* renamed from: c */
    private int f24145c;

    /* renamed from: d */
    private int f24146d;

    /* renamed from: e */
    private int f24147e;

    public C10273d(View view) {
        this.f24143a = view;
    }

    /* renamed from: c */
    private void m32123c() {
        View view = this.f24143a;
        C4187x.m14386e(view, this.f24146d - (view.getTop() - this.f24144b));
        View view2 = this.f24143a;
        C4187x.m14383d(view2, this.f24147e - (view2.getLeft() - this.f24145c));
    }

    /* renamed from: a */
    public boolean mo26379a(int i) {
        if (this.f24147e == i) {
            return false;
        }
        this.f24147e = i;
        m32123c();
        return true;
    }

    /* renamed from: b */
    public void mo26380b() {
        this.f24144b = this.f24143a.getTop();
        this.f24145c = this.f24143a.getLeft();
        m32123c();
    }

    /* renamed from: a */
    public int mo26378a() {
        return this.f24146d;
    }

    /* renamed from: b */
    public boolean mo26381b(int i) {
        if (this.f24146d == i) {
            return false;
        }
        this.f24146d = i;
        m32123c();
        return true;
    }
}
