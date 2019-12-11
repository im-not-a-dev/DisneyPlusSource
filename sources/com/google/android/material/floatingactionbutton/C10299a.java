package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.graphics.drawable.C0492a;
import com.google.android.material.internal.C10312a;
import com.google.android.material.internal.C10317f;
import com.google.android.material.internal.C10322i;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11457a;
import p163g.p449j.p450a.p468b.p469l.C11468a;
import p163g.p449j.p450a.p468b.p469l.C11469b;
import p163g.p449j.p450a.p468b.p469l.C11473f;
import p163g.p449j.p450a.p468b.p469l.C11474g;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p478t.C11503a;
import p163g.p449j.p450a.p468b.p479u.C11504a;
import p163g.p449j.p450a.p468b.p479u.C11505b;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: FloatingActionButtonImpl */
class C10299a {

    /* renamed from: B */
    static final TimeInterpolator f24320B = C11468a.f26817c;

    /* renamed from: C */
    static final int[] f24321C = {16842919, 16842910};

    /* renamed from: D */
    static final int[] f24322D = {16843623, 16842908, 16842910};

    /* renamed from: E */
    static final int[] f24323E = {16842908, 16842910};

    /* renamed from: F */
    static final int[] f24324F = {16843623, 16842910};

    /* renamed from: G */
    static final int[] f24325G = {16842910};

    /* renamed from: H */
    static final int[] f24326H = new int[0];

    /* renamed from: A */
    private OnPreDrawListener f24327A;

    /* renamed from: a */
    int f24328a = 0;

    /* renamed from: b */
    Animator f24329b;

    /* renamed from: c */
    C11475h f24330c;

    /* renamed from: d */
    C11475h f24331d;

    /* renamed from: e */
    private C11475h f24332e;

    /* renamed from: f */
    private C11475h f24333f;

    /* renamed from: g */
    private final C10317f f24334g;

    /* renamed from: h */
    C11504a f24335h;

    /* renamed from: i */
    private float f24336i;

    /* renamed from: j */
    Drawable f24337j;

    /* renamed from: k */
    Drawable f24338k;

    /* renamed from: l */
    C10312a f24339l;

    /* renamed from: m */
    Drawable f24340m;

    /* renamed from: n */
    float f24341n;

    /* renamed from: o */
    float f24342o;

    /* renamed from: p */
    float f24343p;

    /* renamed from: q */
    int f24344q;

    /* renamed from: r */
    float f24345r = 1.0f;

    /* renamed from: s */
    private ArrayList<AnimatorListener> f24346s;

    /* renamed from: t */
    private ArrayList<AnimatorListener> f24347t;

    /* renamed from: u */
    final C10322i f24348u;

    /* renamed from: v */
    final C11505b f24349v;

    /* renamed from: w */
    private final Rect f24350w = new Rect();

    /* renamed from: x */
    private final RectF f24351x = new RectF();

    /* renamed from: y */
    private final RectF f24352y = new RectF();

    /* renamed from: z */
    private final Matrix f24353z = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* compiled from: FloatingActionButtonImpl */
    class C10300a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f24354a;

        /* renamed from: b */
        final /* synthetic */ boolean f24355b;

        /* renamed from: c */
        final /* synthetic */ C10306g f24356c;

        C10300a(boolean z, C10306g gVar) {
            this.f24355b = z;
            this.f24356c = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f24354a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C10299a aVar = C10299a.this;
            aVar.f24328a = 0;
            aVar.f24329b = null;
            if (!this.f24354a) {
                aVar.f24348u.mo26854a(this.f24355b ? 8 : 4, this.f24355b);
                C10306g gVar = this.f24356c;
                if (gVar != null) {
                    gVar.mo26748b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C10299a.this.f24348u.mo26854a(0, this.f24355b);
            C10299a aVar = C10299a.this;
            aVar.f24328a = 1;
            aVar.f24329b = animator;
            this.f24354a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* compiled from: FloatingActionButtonImpl */
    class C10301b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24358a;

        /* renamed from: b */
        final /* synthetic */ C10306g f24359b;

        C10301b(boolean z, C10306g gVar) {
            this.f24358a = z;
            this.f24359b = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            C10299a aVar = C10299a.this;
            aVar.f24328a = 0;
            aVar.f24329b = null;
            C10306g gVar = this.f24359b;
            if (gVar != null) {
                gVar.mo26747a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C10299a.this.f24348u.mo26854a(0, this.f24358a);
            C10299a aVar = C10299a.this;
            aVar.f24328a = 2;
            aVar.f24329b = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* compiled from: FloatingActionButtonImpl */
    class C10302c implements OnPreDrawListener {
        C10302c() {
        }

        public boolean onPreDraw() {
            C10299a.this.mo26786m();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* compiled from: FloatingActionButtonImpl */
    private class C10303d extends C10308i {
        C10303d(C10299a aVar) {
            super(aVar, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* compiled from: FloatingActionButtonImpl */
    private class C10304e extends C10308i {
        C10304e() {
            super(C10299a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C10305f extends C10308i {
        C10305f() {
            super(C10299a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* compiled from: FloatingActionButtonImpl */
    interface C10306g {
        /* renamed from: a */
        void mo26747a();

        /* renamed from: b */
        void mo26748b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C10307h extends C10308i {
        C10307h() {
            super(C10299a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C10308i extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f24365a;

        /* renamed from: b */
        private float f24366b;

        /* renamed from: c */
        private float f24367c;

        private C10308i() {
        }

        public void onAnimationEnd(Animator animator) {
            C10299a.this.f24335h.mo29422b(this.f24367c);
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f24365a) {
                C10299a.this.f24335h.mo29421b();
                throw null;
            }
            C11504a aVar = C10299a.this.f24335h;
            float f = this.f24366b;
            aVar.mo29422b(f + ((this.f24367c - f) * valueAnimator.getAnimatedFraction()));
            throw null;
        }

        /* synthetic */ C10308i(C10299a aVar, C10300a aVar2) {
            this();
        }
    }

    C10299a(C10322i iVar, C11505b bVar) {
        this.f24348u = iVar;
        this.f24349v = bVar;
        this.f24334g = new C10317f();
        this.f24334g.mo26852a(f24321C, m32436a((C10308i) new C10305f()));
        this.f24334g.mo26852a(f24322D, m32436a((C10308i) new C10304e()));
        this.f24334g.mo26852a(f24323E, m32436a((C10308i) new C10304e()));
        this.f24334g.mo26852a(f24324F, m32436a((C10308i) new C10304e()));
        this.f24334g.mo26852a(f24325G, m32436a((C10308i) new C10307h()));
        this.f24334g.mo26852a(f24326H, m32436a((C10308i) new C10303d(this)));
        this.f24336i = this.f24348u.getRotation();
    }

    /* renamed from: q */
    private void m32438q() {
        if (this.f24327A == null) {
            this.f24327A = new C10302c();
        }
    }

    /* renamed from: r */
    private C11475h m32439r() {
        if (this.f24333f == null) {
            this.f24333f = C11475h.m37006a(this.f24348u.getContext(), C11457a.design_fab_hide_motion_spec);
        }
        return this.f24333f;
    }

    /* renamed from: s */
    private C11475h m32440s() {
        if (this.f24332e == null) {
            this.f24332e = C11475h.m37006a(this.f24348u.getContext(), C11457a.design_fab_show_motion_spec);
        }
        return this.f24332e;
    }

    /* renamed from: t */
    private boolean m32441t() {
        return C4187x.m14340E(this.f24348u) && !this.f24348u.isInEditMode();
    }

    /* renamed from: u */
    private void m32442u() {
        if (VERSION.SDK_INT == 19) {
            if (this.f24336i % 90.0f != 0.0f) {
                if (this.f24348u.getLayerType() != 1) {
                    this.f24348u.setLayerType(1, null);
                }
            } else if (this.f24348u.getLayerType() != 0) {
                this.f24348u.setLayerType(0, null);
            }
        }
        C11504a aVar = this.f24335h;
        if (aVar == null) {
            C10312a aVar2 = this.f24339l;
            if (aVar2 != null) {
                aVar2.mo26814a(-this.f24336i);
                throw null;
            }
            return;
        }
        aVar.mo29419a(-this.f24336i);
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26759a(ColorStateList colorStateList) {
        Drawable drawable = this.f24337j;
        if (drawable != null) {
            C0492a.m2637a(drawable, colorStateList);
        }
        C10312a aVar = this.f24339l;
        if (aVar != null) {
            aVar.mo26815a(colorStateList);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26768b(ColorStateList colorStateList) {
        Drawable drawable = this.f24338k;
        if (drawable != null) {
            C0492a.m2637a(drawable, C11503a.m37104a(colorStateList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26769b(Rect rect) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo26773c(float f) {
        this.f24345r = f;
        Matrix matrix = this.f24353z;
        m32437a(f, matrix);
        this.f24348u.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo26775d() {
        return this.f24342o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo26778e() {
        return this.f24343p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C11475h mo26779f() {
        return this.f24330c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo26780g() {
        boolean z = false;
        if (this.f24348u.getVisibility() == 0) {
            if (this.f24328a == 1) {
                z = true;
            }
            return z;
        }
        if (this.f24328a != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo26781h() {
        boolean z = false;
        if (this.f24348u.getVisibility() != 0) {
            if (this.f24328a == 2) {
                z = true;
            }
            return z;
        }
        if (this.f24328a != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo26782i() {
        this.f24334g.mo26850a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo26783j() {
        if (mo26787n()) {
            m32438q();
            this.f24348u.getViewTreeObserver().addOnPreDrawListener(this.f24327A);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo26784k() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo26785l() {
        if (this.f24327A != null) {
            this.f24348u.getViewTreeObserver().removeOnPreDrawListener(this.f24327A);
            this.f24327A = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo26786m() {
        float rotation = this.f24348u.getRotation();
        if (this.f24336i != rotation) {
            this.f24336i = rotation;
            m32442u();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo26787n() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo26788o() {
        mo26773c(this.f24345r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo26789p() {
        Rect rect = this.f24350w;
        mo26761a(rect);
        mo26769b(rect);
        this.f24349v.mo26751a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo26776d(float f) {
        if (this.f24343p != f) {
            this.f24343p = f;
            mo26757a(this.f24341n, this.f24342o, this.f24343p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo26765b() {
        return this.f24341n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26760a(Mode mode) {
        Drawable drawable = this.f24337j;
        if (drawable != null) {
            C0492a.m2640a(drawable, mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26766b(float f) {
        if (this.f24342o != f) {
            this.f24342o = f;
            mo26757a(this.f24341n, this.f24342o, this.f24343p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C11475h mo26772c() {
        return this.f24331d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo26777d(AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f24346s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: c */
    public void mo26774c(AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f24347t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26756a(float f) {
        if (this.f24341n != f) {
            this.f24341n = f;
            mo26757a(this.f24341n, this.f24342o, this.f24343p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26771b(C11475h hVar) {
        this.f24330c = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26767b(AnimatorListener animatorListener) {
        if (this.f24346s == null) {
            this.f24346s = new ArrayList<>();
        }
        this.f24346s.add(animatorListener);
    }

    /* renamed from: a */
    private void m32437a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f24348u.getDrawable();
        if (drawable != null && this.f24344q != 0) {
            RectF rectF = this.f24351x;
            RectF rectF2 = this.f24352y;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f24344q;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i2 = this.f24344q;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26770b(C10306g gVar, boolean z) {
        if (!mo26781h()) {
            Animator animator = this.f24329b;
            if (animator != null) {
                animator.cancel();
            }
            if (m32441t()) {
                if (this.f24348u.getVisibility() != 0) {
                    this.f24348u.setAlpha(0.0f);
                    this.f24348u.setScaleY(0.0f);
                    this.f24348u.setScaleX(0.0f);
                    mo26773c(0.0f);
                }
                C11475h hVar = this.f24330c;
                if (hVar == null) {
                    hVar = m32440s();
                }
                AnimatorSet a = m32435a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C10301b(z, gVar));
                ArrayList<AnimatorListener> arrayList = this.f24346s;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f24348u.mo26854a(0, z);
                this.f24348u.setAlpha(1.0f);
                this.f24348u.setScaleY(1.0f);
                this.f24348u.setScaleX(1.0f);
                mo26773c(1.0f);
                if (gVar != null) {
                    gVar.mo26747a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26763a(C11475h hVar) {
        this.f24331d = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26757a(float f, float f2, float f3) {
        C11504a aVar = this.f24335h;
        if (aVar != null) {
            aVar.mo29420a(f, this.f24343p + f);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26764a(int[] iArr) {
        this.f24334g.mo26851a(iArr);
    }

    /* renamed from: a */
    public void mo26758a(AnimatorListener animatorListener) {
        if (this.f24347t == null) {
            this.f24347t = new ArrayList<>();
        }
        this.f24347t.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26762a(C10306g gVar, boolean z) {
        if (!mo26780g()) {
            Animator animator = this.f24329b;
            if (animator != null) {
                animator.cancel();
            }
            if (m32441t()) {
                C11475h hVar = this.f24331d;
                if (hVar == null) {
                    hVar = m32439r();
                }
                AnimatorSet a = m32435a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C10300a(z, gVar));
                ArrayList<AnimatorListener> arrayList = this.f24347t;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f24348u.mo26854a(z ? 8 : 4, z);
                if (gVar != null) {
                    gVar.mo26748b();
                }
            }
        }
    }

    /* renamed from: a */
    private AnimatorSet m32435a(C11475h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24348u, View.ALPHA, new float[]{f});
        hVar.mo29304a("opacity").mo29311a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f24348u, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.mo29304a(str).mo29311a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f24348u, View.SCALE_Y, new float[]{f2});
        hVar.mo29304a(str).mo29311a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m32437a(f3, this.f24353z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f24348u, new C11473f(), new C11474g(), new Matrix[]{new Matrix(this.f24353z)});
        hVar.mo29304a("iconScale").mo29311a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C11469b.m36996a(animatorSet, arrayList);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo26755a() {
        return this.f24340m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26761a(Rect rect) {
        this.f24335h.getPadding(rect);
        throw null;
    }

    /* renamed from: a */
    private ValueAnimator m32436a(C10308i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f24320B);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }
}
