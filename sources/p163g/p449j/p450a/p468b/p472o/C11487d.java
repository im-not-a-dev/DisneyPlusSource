package p163g.p449j.p450a.p468b.p472o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p163g.p449j.p450a.p468b.p476r.C11498a;

/* renamed from: g.j.a.b.o.d */
/* compiled from: CircularRevealWidget */
public interface C11487d extends C11486a {

    /* renamed from: g.j.a.b.o.d$b */
    /* compiled from: CircularRevealWidget */
    public static class C11489b implements TypeEvaluator<C11492e> {

        /* renamed from: b */
        public static final TypeEvaluator<C11492e> f26871b = new C11489b();

        /* renamed from: a */
        private final C11492e f26872a = new C11492e();

        /* renamed from: a */
        public C11492e evaluate(float f, C11492e eVar, C11492e eVar2) {
            this.f26872a.mo29405a(C11498a.m37082a(eVar.f26875a, eVar2.f26875a, f), C11498a.m37082a(eVar.f26876b, eVar2.f26876b, f), C11498a.m37082a(eVar.f26877c, eVar2.f26877c, f));
            return this.f26872a;
        }
    }

    /* renamed from: g.j.a.b.o.d$c */
    /* compiled from: CircularRevealWidget */
    public static class C11490c extends Property<C11487d, C11492e> {

        /* renamed from: a */
        public static final Property<C11487d, C11492e> f26873a = new C11490c("circularReveal");

        private C11490c(String str) {
            super(C11492e.class, str);
        }

        /* renamed from: a */
        public C11492e get(C11487d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(C11487d dVar, C11492e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: g.j.a.b.o.d$d */
    /* compiled from: CircularRevealWidget */
    public static class C11491d extends Property<C11487d, Integer> {

        /* renamed from: a */
        public static final Property<C11487d, Integer> f26874a = new C11491d("circularRevealScrimColor");

        private C11491d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C11487d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(C11487d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: g.j.a.b.o.d$e */
    /* compiled from: CircularRevealWidget */
    public static class C11492e {

        /* renamed from: a */
        public float f26875a;

        /* renamed from: b */
        public float f26876b;

        /* renamed from: c */
        public float f26877c;

        /* renamed from: a */
        public void mo29405a(float f, float f2, float f3) {
            this.f26875a = f;
            this.f26876b = f2;
            this.f26877c = f3;
        }

        private C11492e() {
        }

        public C11492e(float f, float f2, float f3) {
            this.f26875a = f;
            this.f26876b = f2;
            this.f26877c = f3;
        }
    }

    /* renamed from: a */
    void mo29375a();

    /* renamed from: b */
    void mo29376b();

    int getCircularRevealScrimColor();

    C11492e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C11492e eVar);
}
