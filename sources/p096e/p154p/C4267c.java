package p096e.p154p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p096e.p121h.p135s.C4187x;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.c */
/* compiled from: ChangeBounds */
public class C4267c extends C4309m {

    /* renamed from: F0 */
    private static final String[] f10623F0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: G0 */
    private static final Property<Drawable, PointF> f10624G0 = new C4269b(PointF.class, "boundsOrigin");

    /* renamed from: H0 */
    private static final Property<C4278k, PointF> f10625H0;

    /* renamed from: I0 */
    private static final Property<C4278k, PointF> f10626I0;

    /* renamed from: J0 */
    private static final Property<View, PointF> f10627J0;

    /* renamed from: K0 */
    private static final Property<View, PointF> f10628K0;

    /* renamed from: L0 */
    private static final Property<View, PointF> f10629L0 = new C4274g(PointF.class, "position");

    /* renamed from: M0 */
    private static C4305k f10630M0 = new C4305k();

    /* renamed from: C0 */
    private int[] f10631C0 = new int[2];

    /* renamed from: D0 */
    private boolean f10632D0 = false;

    /* renamed from: E0 */
    private boolean f10633E0 = false;

    /* renamed from: e.p.c$a */
    /* compiled from: ChangeBounds */
    class C4268a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10634a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f10635b;

        /* renamed from: c */
        final /* synthetic */ View f10636c;

        /* renamed from: d */
        final /* synthetic */ float f10637d;

        C4268a(C4267c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f10634a = viewGroup;
            this.f10635b = bitmapDrawable;
            this.f10636c = view;
            this.f10637d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C4283d0.m14707b(this.f10634a).mo14994b(this.f10635b);
            C4283d0.m14703a(this.f10636c, this.f10637d);
        }
    }

    /* renamed from: e.p.c$b */
    /* compiled from: ChangeBounds */
    static class C4269b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f10638a = new Rect();

        C4269b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f10638a);
            this.f10638a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f10638a);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f10638a);
            Rect rect = this.f10638a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: e.p.c$c */
    /* compiled from: ChangeBounds */
    static class C4270c extends Property<C4278k, PointF> {
        C4270c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C4278k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C4278k kVar, PointF pointF) {
            kVar.mo15041b(pointF);
        }
    }

    /* renamed from: e.p.c$d */
    /* compiled from: ChangeBounds */
    static class C4271d extends Property<C4278k, PointF> {
        C4271d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C4278k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C4278k kVar, PointF pointF) {
            kVar.mo15040a(pointF);
        }
    }

    /* renamed from: e.p.c$e */
    /* compiled from: ChangeBounds */
    static class C4272e extends Property<View, PointF> {
        C4272e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C4283d0.m14705a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: e.p.c$f */
    /* compiled from: ChangeBounds */
    static class C4273f extends Property<View, PointF> {
        C4273f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C4283d0.m14705a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: e.p.c$g */
    /* compiled from: ChangeBounds */
    static class C4274g extends Property<View, PointF> {
        C4274g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C4283d0.m14705a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: e.p.c$h */
    /* compiled from: ChangeBounds */
    class C4275h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4278k f10639a;
        private C4278k mViewBounds = this.f10639a;

        C4275h(C4267c cVar, C4278k kVar) {
            this.f10639a = kVar;
        }
    }

    /* renamed from: e.p.c$i */
    /* compiled from: ChangeBounds */
    class C4276i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10640a;

        /* renamed from: b */
        final /* synthetic */ View f10641b;

        /* renamed from: c */
        final /* synthetic */ Rect f10642c;

        /* renamed from: d */
        final /* synthetic */ int f10643d;

        /* renamed from: e */
        final /* synthetic */ int f10644e;

        /* renamed from: f */
        final /* synthetic */ int f10645f;

        /* renamed from: g */
        final /* synthetic */ int f10646g;

        C4276i(C4267c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f10641b = view;
            this.f10642c = rect;
            this.f10643d = i;
            this.f10644e = i2;
            this.f10645f = i3;
            this.f10646g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10640a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10640a) {
                C4187x.m14357a(this.f10641b, this.f10642c);
                C4283d0.m14705a(this.f10641b, this.f10643d, this.f10644e, this.f10645f, this.f10646g);
            }
        }
    }

    /* renamed from: e.p.c$j */
    /* compiled from: ChangeBounds */
    class C4277j extends C4316n {

        /* renamed from: a */
        boolean f10647a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f10648b;

        C4277j(C4267c cVar, ViewGroup viewGroup) {
            this.f10648b = viewGroup;
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
            C4330x.m14901a(this.f10648b, false);
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            if (!this.f10647a) {
                C4330x.m14901a(this.f10648b, false);
            }
            mVar.mo15099b((C4315f) this);
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
            C4330x.m14901a(this.f10648b, true);
        }
    }

    /* renamed from: e.p.c$k */
    /* compiled from: ChangeBounds */
    private static class C4278k {

        /* renamed from: a */
        private int f10649a;

        /* renamed from: b */
        private int f10650b;

        /* renamed from: c */
        private int f10651c;

        /* renamed from: d */
        private int f10652d;

        /* renamed from: e */
        private View f10653e;

        /* renamed from: f */
        private int f10654f;

        /* renamed from: g */
        private int f10655g;

        C4278k(View view) {
            this.f10653e = view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo15040a(PointF pointF) {
            this.f10651c = Math.round(pointF.x);
            this.f10652d = Math.round(pointF.y);
            this.f10655g++;
            if (this.f10654f == this.f10655g) {
                m14690a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo15041b(PointF pointF) {
            this.f10649a = Math.round(pointF.x);
            this.f10650b = Math.round(pointF.y);
            this.f10654f++;
            if (this.f10654f == this.f10655g) {
                m14690a();
            }
        }

        /* renamed from: a */
        private void m14690a() {
            C4283d0.m14705a(this.f10653e, this.f10649a, this.f10650b, this.f10651c, this.f10652d);
            this.f10654f = 0;
            this.f10655g = 0;
        }
    }

    static {
        String str = "topLeft";
        f10625H0 = new C4270c(PointF.class, str);
        String str2 = "bottomRight";
        f10626I0 = new C4271d(PointF.class, str2);
        f10627J0 = new C4272e(PointF.class, str2);
        f10628K0 = new C4273f(PointF.class, str);
    }

    /* renamed from: d */
    private void m14670d(C4325s sVar) {
        View view = sVar.f10770b;
        if (C4187x.m14340E(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f10769a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f10769a.put("android:changeBounds:parent", sVar.f10770b.getParent());
            if (this.f10633E0) {
                sVar.f10770b.getLocationInWindow(this.f10631C0);
                sVar.f10769a.put("android:changeBounds:windowX", Integer.valueOf(this.f10631C0[0]));
                sVar.f10769a.put("android:changeBounds:windowY", Integer.valueOf(this.f10631C0[1]));
            }
            if (this.f10632D0) {
                sVar.f10769a.put("android:changeBounds:clip", C4187x.m14391h(view));
            }
        }
    }

    /* renamed from: a */
    public void mo15007a(C4325s sVar) {
        m14670d(sVar);
    }

    /* renamed from: c */
    public void mo15008c(C4325s sVar) {
        m14670d(sVar);
    }

    /* renamed from: m */
    public String[] mo15009m() {
        return f10623F0;
    }

    /* renamed from: a */
    private boolean m14669a(View view, View view2) {
        if (!this.f10633E0) {
            return true;
        }
        C4325s a = mo15086a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f10770b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Animator mo15006a(ViewGroup viewGroup, C4325s sVar, C4325s sVar2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        C4325s sVar3 = sVar;
        C4325s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) sVar3.f10769a.get(str);
        ViewGroup viewGroup3 = (ViewGroup) sVar4.f10769a.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f10770b;
        if (m14669a(viewGroup2, viewGroup3)) {
            String str2 = "android:changeBounds:bounds";
            Rect rect2 = (Rect) sVar3.f10769a.get(str2);
            Rect rect3 = (Rect) sVar4.f10769a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            String str3 = "android:changeBounds:clip";
            Rect rect4 = (Rect) sVar3.f10769a.get(str3);
            Rect rect5 = (Rect) sVar4.f10769a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f10632D0) {
                    view = view3;
                    C4283d0.m14705a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = C4292f.m14747a(view, f10629L0, mo15110f().mo15061a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            C4278k kVar = new C4278k(view);
                            ObjectAnimator a = C4292f.m14747a(kVar, f10625H0, mo15110f().mo15061a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C4292f.m14747a(kVar, f10626I0, mo15110f().mo15061a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new C4275h(this, kVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = C4292f.m14747a(view, f10627J0, mo15110f().mo15061a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = C4292f.m14747a(view, f10628K0, mo15110f().mo15061a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    C4283d0.m14705a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = C4292f.m14747a(view, f10629L0, mo15110f().mo15061a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        C4187x.m14357a(view, rect);
                        C4305k kVar2 = f10630M0;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        C4276i iVar = new C4276i(this, view, rect6, i4, i6, i8, i10);
                        objectAnimator.addListener(iVar);
                    } else {
                        objectAnimator = null;
                    }
                    animator = C4324r.m14888a(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C4330x.m14901a(viewGroup4, true);
                    mo15085a((C4315f) new C4277j(this, viewGroup4));
                }
                return animator;
            }
        } else {
            String str4 = "android:changeBounds:windowX";
            int intValue = ((Integer) sVar3.f10769a.get(str4)).intValue();
            String str5 = "android:changeBounds:windowY";
            int intValue2 = ((Integer) sVar3.f10769a.get(str5)).intValue();
            int intValue3 = ((Integer) sVar4.f10769a.get(str4)).intValue();
            int intValue4 = ((Integer) sVar4.f10769a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f10631C0);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C4283d0.m14709c(view2);
                C4283d0.m14703a(view2, 0.0f);
                C4283d0.m14707b(viewGroup).mo14993a(bitmapDrawable);
                C4294g f = mo15110f();
                int[] iArr = this.f10631C0;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C4298i.m14763a(f10624G0, f.mo15061a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C4268a aVar = new C4268a(this, viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(aVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
