package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11462f;
import p163g.p449j.p450a.p468b.p469l.C11468a;
import p163g.p449j.p450a.p468b.p469l.C11469b;
import p163g.p449j.p450a.p468b.p469l.C11470c;
import p163g.p449j.p450a.p468b.p469l.C11471d;
import p163g.p449j.p450a.p468b.p469l.C11472e;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p469l.C11476i;
import p163g.p449j.p450a.p468b.p469l.C11477j;
import p163g.p449j.p450a.p468b.p472o.C11482a;
import p163g.p449j.p450a.p468b.p472o.C11485c;
import p163g.p449j.p450a.p468b.p472o.C11487d;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11491d;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11492e;
import p163g.p449j.p450a.p468b.p476r.C11498a;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f24653c = new Rect();

    /* renamed from: d */
    private final RectF f24654d = new RectF();

    /* renamed from: e */
    private final RectF f24655e = new RectF();

    /* renamed from: f */
    private final int[] f24656f = new int[2];

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C10358a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24657a;

        /* renamed from: b */
        final /* synthetic */ View f24658b;

        /* renamed from: c */
        final /* synthetic */ View f24659c;

        C10358a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f24657a = z;
            this.f24658b = view;
            this.f24659c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24657a) {
                this.f24658b.setVisibility(4);
                this.f24659c.setAlpha(1.0f);
                this.f24659c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24657a) {
                this.f24658b.setVisibility(0);
                this.f24659c.setAlpha(0.0f);
                this.f24659c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C10359b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f24660a;

        C10359b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f24660a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24660a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C10360c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11487d f24661a;

        /* renamed from: b */
        final /* synthetic */ Drawable f24662b;

        C10360c(FabTransformationBehavior fabTransformationBehavior, C11487d dVar, Drawable drawable) {
            this.f24661a = dVar;
            this.f24662b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24661a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f24661a.setCircularRevealOverlayDrawable(this.f24662b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C10361d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11487d f24663a;

        C10361d(FabTransformationBehavior fabTransformationBehavior, C11487d dVar) {
            this.f24663a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C11492e revealInfo = this.f24663a.getRevealInfo();
            revealInfo.f26877c = Float.MAX_VALUE;
            this.f24663a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C10362e {

        /* renamed from: a */
        public C11475h f24664a;

        /* renamed from: b */
        public C11477j f24665b;

        protected C10362e() {
        }
    }

    public FabTransformationBehavior() {
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m32776c(View view, View view2, boolean z, boolean z2, C10362e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float j = C4187x.m14395j(view2) - C4187x.m14395j(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-j);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-j});
        }
        eVar.f24664a.mo29304a("elevation").mo29311a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private void m32778d(View view, View view2, boolean z, boolean z2, C10362e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C11487d) && (view instanceof ImageView)) {
            C11487d dVar = (C11487d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C11472e.f26822b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C11472e.f26822b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C10359b(this, view2));
                eVar.f24664a.mo29304a("iconFade").mo29311a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C10360c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10362e mo27095a(Context context, boolean z);

    /* renamed from: a */
    public boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo27093b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C10362e a = mo27095a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m32776c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f24654d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        C10362e eVar = a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m32769a(view3, view4, z4, z5, eVar, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m32778d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m32767a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m32773b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m32768a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C11469b.m36996a(animatorSet, arrayList);
        animatorSet.addListener(new C10358a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2516a(C0446f fVar) {
        if (fVar.f2035h == 0) {
            fVar.f2035h = 80;
        }
    }

    /* renamed from: c */
    private float m32774c(View view, View view2, C11477j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24654d;
        RectF rectF2 = this.f24655e;
        m32766a(view, rectF);
        m32766a(view2, rectF2);
        int i = jVar.f26834a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f26835b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f26835b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32769a(android.view.View r17, android.view.View r18, boolean r19, boolean r20, com.google.android.material.transformation.FabTransformationBehavior.C10362e r21, java.util.List<android.animation.Animator> r22, java.util.List<android.animation.Animator.AnimatorListener> r23, android.graphics.RectF r24) {
        /*
            r16 = this;
            r10 = r16
            r0 = r17
            r1 = r18
            r2 = r21
            r11 = r22
            g.j.a.b.l.j r3 = r2.f24665b
            float r3 = r10.m32774c(r0, r1, r3)
            g.j.a.b.l.j r4 = r2.f24665b
            float r0 = r10.m32777d(r0, r1, r4)
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            if (r19 == 0) goto L_0x0026
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002a
        L_0x0026:
            if (r19 != 0) goto L_0x003b
            if (r5 <= 0) goto L_0x003b
        L_0x002a:
            g.j.a.b.l.h r5 = r2.f24664a
            java.lang.String r6 = "translationXCurveUpwards"
            g.j.a.b.l.i r5 = r5.mo29304a(r6)
            g.j.a.b.l.h r6 = r2.f24664a
            java.lang.String r7 = "translationYCurveUpwards"
            g.j.a.b.l.i r6 = r6.mo29304a(r7)
            goto L_0x005c
        L_0x003b:
            g.j.a.b.l.h r5 = r2.f24664a
            java.lang.String r6 = "translationXCurveDownwards"
            g.j.a.b.l.i r5 = r5.mo29304a(r6)
            g.j.a.b.l.h r6 = r2.f24664a
            java.lang.String r7 = "translationYCurveDownwards"
            g.j.a.b.l.i r6 = r6.mo29304a(r7)
            goto L_0x005c
        L_0x004c:
            g.j.a.b.l.h r5 = r2.f24664a
            java.lang.String r6 = "translationXLinear"
            g.j.a.b.l.i r5 = r5.mo29304a(r6)
            g.j.a.b.l.h r6 = r2.f24664a
            java.lang.String r7 = "translationYLinear"
            g.j.a.b.l.i r6 = r6.mo29304a(r7)
        L_0x005c:
            r12 = r5
            r13 = r6
            r5 = 0
            r6 = 1
            if (r19 == 0) goto L_0x0092
            if (r20 != 0) goto L_0x006c
            float r7 = -r3
            r1.setTranslationX(r7)
            float r7 = -r0
            r1.setTranslationY(r7)
        L_0x006c:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r6]
            r8[r5] = r4
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r7, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r4
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            float r5 = -r3
            float r6 = -r0
            r7 = 0
            r8 = 0
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r13
            r9 = r24
            r0.m32770a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x0092:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r4 = new float[r6]
            float r3 = -r3
            r4[r5] = r3
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r6]
            float r0 = -r0
            r3[r5] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
        L_0x00a8:
            r12.mo29311a(r14)
            r13.mo29311a(r15)
            r11.add(r14)
            r11.add(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.m32769a(android.view.View, android.view.View, boolean, boolean, com.google.android.material.transformation.FabTransformationBehavior$e, java.util.List, java.util.List, android.graphics.RectF):void");
    }

    /* renamed from: d */
    private float m32777d(View view, View view2, C11477j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24654d;
        RectF rectF2 = this.f24655e;
        m32766a(view, rectF);
        m32766a(view2, rectF2);
        int i = jVar.f26834a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f26836c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f26836c;
    }

    /* renamed from: c */
    private ViewGroup m32775c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: b */
    private void m32773b(View view, View view2, boolean z, boolean z2, C10362e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C11487d) {
            C11487d dVar = (C11487d) view2;
            int b = m32772b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C11491d.f26874a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C11491d.f26874a, new int[]{b});
            }
            objectAnimator.setEvaluator(C11470c.m36997a());
            eVar.f24664a.mo29304a("color").mo29311a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: a */
    private void m32767a(View view, View view2, boolean z, boolean z2, C10362e eVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C10362e eVar2 = eVar;
        if (view4 instanceof C11487d) {
            C11487d dVar = (C11487d) view4;
            float a = m32761a(view3, view4, eVar2.f24665b);
            float b = m32771b(view3, view4, eVar2.f24665b);
            ((FloatingActionButton) view3).mo26691a(this.f24653c);
            float width = ((float) this.f24653c.width()) / 2.0f;
            C11476i a2 = eVar2.f24664a.mo29304a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C11492e(a, b, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f26877c;
                }
                animator = C11482a.m37052a(dVar, a, b, C11498a.m37084a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C10361d(this, dVar));
                m32764a(view2, a2.mo29310a(), (int) a, (int) b, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f26877c;
                Animator a3 = C11482a.m37052a(dVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                m32764a(view5, a2.mo29310a(), i, i2, f3, list);
                m32765a(view5, a2.mo29310a(), a2.mo29312b(), eVar2.f24664a.mo29303a(), i3, i2, width, list);
                animator = a3;
            }
            a2.mo29311a(animator);
            list.add(animator);
            list2.add(C11482a.m37051a(dVar));
        }
    }

    /* renamed from: b */
    private float m32771b(View view, View view2, C11477j jVar) {
        RectF rectF = this.f24654d;
        RectF rectF2 = this.f24655e;
        m32766a(view, rectF);
        m32766a(view2, rectF2);
        rectF2.offset(0.0f, -m32777d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m32772b(View view) {
        ColorStateList f = C4187x.m14387f(view);
        if (f != null) {
            return f.getColorForState(view.getDrawableState(), f.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m32768a(View view, View view2, boolean z, boolean z2, C10362e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof C11487d) || C11485c.f26870a != 0) {
                ViewGroup a = m32763a(view2);
                if (a != null) {
                    if (z) {
                        if (!z2) {
                            C11471d.f26821a.set(a, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a, C11471d.f26821a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a, C11471d.f26821a, new float[]{0.0f});
                    }
                    eVar.f24664a.mo29304a("contentFade").mo29311a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: a */
    private void m32766a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f24656f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private float m32761a(View view, View view2, C11477j jVar) {
        RectF rectF = this.f24654d;
        RectF rectF2 = this.f24655e;
        m32766a(view, rectF);
        m32766a(view2, rectF2);
        rectF2.offset(-m32774c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private void m32770a(View view, C10362e eVar, C11476i iVar, C11476i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m32762a(eVar, iVar, f, f3);
        float a2 = m32762a(eVar, iVar2, f2, f4);
        Rect rect = this.f24653c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f24654d;
        rectF2.set(rect);
        RectF rectF3 = this.f24655e;
        m32766a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m32762a(C10362e eVar, C11476i iVar, float f, float f2) {
        long a = iVar.mo29310a();
        long b = iVar.mo29312b();
        C11476i a2 = eVar.f24664a.mo29304a("expansion");
        return C11468a.m36994a(f, f2, iVar.mo29313c().getInterpolation(((float) (((a2.mo29310a() + a2.mo29312b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m32763a(View view) {
        View findViewById = view.findViewById(C11462f.mtrl_child_content_container);
        if (findViewById != null) {
            return m32775c(findViewById);
        }
        if ((view instanceof C10365b) || (view instanceof C10364a)) {
            return m32775c(((ViewGroup) view).getChildAt(0));
        }
        return m32775c(view);
    }

    /* renamed from: a */
    private void m32764a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m32765a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
