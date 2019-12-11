package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0813p;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: OrientationHelper */
public abstract class C0892p {

    /* renamed from: a */
    protected final C0808o f3625a;

    /* renamed from: b */
    private int f3626b;

    /* renamed from: c */
    final Rect f3627c;

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* compiled from: OrientationHelper */
    static class C0893a extends C0892p {
        C0893a(C0808o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo5109a() {
            return this.f3625a.mo4758r();
        }

        /* renamed from: b */
        public int mo5112b() {
            return this.f3625a.mo4758r() - this.f3625a.mo4756p();
        }

        /* renamed from: c */
        public int mo5115c(View view) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            return this.f3625a.mo4738g(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: d */
        public int mo5117d(View view) {
            return this.f3625a.mo3898f(view) - ((C0813p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo5119e(View view) {
            this.f3625a.mo4698a(view, true, this.f3627c);
            return this.f3627c.right;
        }

        /* renamed from: f */
        public int mo5120f() {
            return this.f3625a.mo4754o();
        }

        /* renamed from: g */
        public int mo5122g() {
            return (this.f3625a.mo4758r() - this.f3625a.mo4754o()) - this.f3625a.mo4756p();
        }

        /* renamed from: a */
        public void mo5111a(int i) {
            this.f3625a.mo4733e(i);
        }

        /* renamed from: b */
        public int mo5113b(View view) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            return this.f3625a.mo4742h(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo5121f(View view) {
            this.f3625a.mo4698a(view, true, this.f3627c);
            return this.f3627c.left;
        }

        /* renamed from: a */
        public int mo5110a(View view) {
            return this.f3625a.mo3902i(view) + ((C0813p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: c */
        public int mo5114c() {
            return this.f3625a.mo4756p();
        }

        /* renamed from: d */
        public int mo5116d() {
            return this.f3625a.mo4759s();
        }

        /* renamed from: e */
        public int mo5118e() {
            return this.f3625a.mo4744i();
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    /* compiled from: OrientationHelper */
    static class C0894b extends C0892p {
        C0894b(C0808o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo5109a() {
            return this.f3625a.mo4741h();
        }

        /* renamed from: b */
        public int mo5112b() {
            return this.f3625a.mo4741h() - this.f3625a.mo4752n();
        }

        /* renamed from: c */
        public int mo5115c(View view) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            return this.f3625a.mo4742h(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: d */
        public int mo5117d(View view) {
            return this.f3625a.mo3905j(view) - ((C0813p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo5119e(View view) {
            this.f3625a.mo4698a(view, true, this.f3627c);
            return this.f3627c.bottom;
        }

        /* renamed from: f */
        public int mo5120f() {
            return this.f3625a.mo4757q();
        }

        /* renamed from: g */
        public int mo5122g() {
            return (this.f3625a.mo4741h() - this.f3625a.mo4757q()) - this.f3625a.mo4752n();
        }

        /* renamed from: a */
        public void mo5111a(int i) {
            this.f3625a.mo4735f(i);
        }

        /* renamed from: b */
        public int mo5113b(View view) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            return this.f3625a.mo4738g(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo5121f(View view) {
            this.f3625a.mo4698a(view, true, this.f3627c);
            return this.f3627c.top;
        }

        /* renamed from: a */
        public int mo5110a(View view) {
            return this.f3625a.mo3893e(view) + ((C0813p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: c */
        public int mo5114c() {
            return this.f3625a.mo4752n();
        }

        /* renamed from: d */
        public int mo5116d() {
            return this.f3625a.mo4744i();
        }

        /* renamed from: e */
        public int mo5118e() {
            return this.f3625a.mo4759s();
        }
    }

    /* synthetic */ C0892p(C0808o oVar, C0893a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C0892p m4933a(C0808o oVar, int i) {
        if (i == 0) {
            return m4932a(oVar);
        }
        if (i == 1) {
            return m4934b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C0892p m4934b(C0808o oVar) {
        return new C0894b(oVar);
    }

    /* renamed from: a */
    public abstract int mo5109a();

    /* renamed from: a */
    public abstract int mo5110a(View view);

    /* renamed from: a */
    public abstract void mo5111a(int i);

    /* renamed from: b */
    public abstract int mo5112b();

    /* renamed from: b */
    public abstract int mo5113b(View view);

    /* renamed from: c */
    public abstract int mo5114c();

    /* renamed from: c */
    public abstract int mo5115c(View view);

    /* renamed from: d */
    public abstract int mo5116d();

    /* renamed from: d */
    public abstract int mo5117d(View view);

    /* renamed from: e */
    public abstract int mo5118e();

    /* renamed from: e */
    public abstract int mo5119e(View view);

    /* renamed from: f */
    public abstract int mo5120f();

    /* renamed from: f */
    public abstract int mo5121f(View view);

    /* renamed from: g */
    public abstract int mo5122g();

    /* renamed from: h */
    public int mo5123h() {
        if (Integer.MIN_VALUE == this.f3626b) {
            return 0;
        }
        return mo5122g() - this.f3626b;
    }

    /* renamed from: i */
    public void mo5124i() {
        this.f3626b = mo5122g();
    }

    private C0892p(C0808o oVar) {
        this.f3626b = Integer.MIN_VALUE;
        this.f3627c = new Rect();
        this.f3625a = oVar;
    }

    /* renamed from: a */
    public static C0892p m4932a(C0808o oVar) {
        return new C0893a(oVar);
    }
}
