package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.C0076a.C0079c;
import androidx.appcompat.widget.C0292v0;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0513i;
import androidx.viewpager.widget.C1008a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C0997e;
import androidx.viewpager.widget.ViewPager.C1001i;
import androidx.viewpager.widget.ViewPager.C1002j;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.internal.C10320g;
import com.google.android.material.internal.C10321h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4115g;
import p096e.p121h.p134r.C4116h;
import p096e.p121h.p135s.C4146h;
import p096e.p121h.p135s.C4184u;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11464h;
import p163g.p449j.p450a.p468b.C11466j;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p469l.C11468a;
import p163g.p449j.p450a.p468b.p477s.C11499a;

@C0997e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: K0 */
    private static final C4114f<C10341g> f24472K0 = new C4116h(16);

    /* renamed from: A0 */
    private final ArrayList<C10335c> f24473A0;

    /* renamed from: B0 */
    private C10335c f24474B0;

    /* renamed from: C0 */
    private ValueAnimator f24475C0;

    /* renamed from: D0 */
    ViewPager f24476D0;

    /* renamed from: E0 */
    private C1008a f24477E0;

    /* renamed from: F0 */
    private DataSetObserver f24478F0;

    /* renamed from: G0 */
    private C10342h f24479G0;

    /* renamed from: H0 */
    private C10334b f24480H0;

    /* renamed from: I0 */
    private boolean f24481I0;

    /* renamed from: J0 */
    private final C4114f<C10343i> f24482J0;

    /* renamed from: U */
    private C10341g f24483U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final RectF f24484V;

    /* renamed from: W */
    private final C10338f f24485W;

    /* renamed from: a0 */
    int f24486a0;

    /* renamed from: b0 */
    int f24487b0;

    /* renamed from: c */
    private final ArrayList<C10341g> f24488c;

    /* renamed from: c0 */
    int f24489c0;

    /* renamed from: d0 */
    int f24490d0;

    /* renamed from: e0 */
    int f24491e0;

    /* renamed from: f0 */
    ColorStateList f24492f0;

    /* renamed from: g0 */
    ColorStateList f24493g0;

    /* renamed from: h0 */
    ColorStateList f24494h0;

    /* renamed from: i0 */
    Drawable f24495i0;

    /* renamed from: j0 */
    Mode f24496j0;

    /* renamed from: k0 */
    float f24497k0;

    /* renamed from: l0 */
    float f24498l0;

    /* renamed from: m0 */
    final int f24499m0;

    /* renamed from: n0 */
    int f24500n0;

    /* renamed from: o0 */
    private final int f24501o0;

    /* renamed from: p0 */
    private final int f24502p0;

    /* renamed from: q0 */
    private final int f24503q0;

    /* renamed from: r0 */
    private int f24504r0;

    /* renamed from: s0 */
    int f24505s0;

    /* renamed from: t0 */
    int f24506t0;

    /* renamed from: u0 */
    int f24507u0;

    /* renamed from: v0 */
    int f24508v0;

    /* renamed from: w0 */
    boolean f24509w0;

    /* renamed from: x0 */
    boolean f24510x0;

    /* renamed from: y0 */
    boolean f24511y0;

    /* renamed from: z0 */
    private C10335c f24512z0;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C10333a implements AnimatorUpdateListener {
        C10333a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C10334b implements C1001i {

        /* renamed from: a */
        private boolean f24514a;

        C10334b() {
        }

        /* renamed from: a */
        public void mo5552a(ViewPager viewPager, C1008a aVar, C1008a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f24476D0 == viewPager) {
                tabLayout.mo26883a(aVar2, this.f24514a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26941a(boolean z) {
            this.f24514a = z;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C10335c<T extends C10341g> {
        /* renamed from: a */
        void mo17519a(T t);

        /* renamed from: b */
        void mo17520b(T t);

        /* renamed from: c */
        void mo17521c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C10336d extends C10335c<C10341g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C10337e extends DataSetObserver {
        C10337e() {
        }

        public void onChanged() {
            TabLayout.this.mo26901d();
        }

        public void onInvalidated() {
            TabLayout.this.mo26901d();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    private class C10338f extends LinearLayout {

        /* renamed from: U */
        private final Paint f24517U;

        /* renamed from: V */
        private final GradientDrawable f24518V;

        /* renamed from: W */
        int f24519W = -1;

        /* renamed from: a0 */
        float f24520a0;

        /* renamed from: b0 */
        private int f24521b0 = -1;

        /* renamed from: c */
        private int f24522c;

        /* renamed from: c0 */
        private int f24523c0 = -1;

        /* renamed from: d0 */
        private int f24524d0 = -1;

        /* renamed from: e0 */
        private ValueAnimator f24525e0;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C10339a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f24527a;

            /* renamed from: b */
            final /* synthetic */ int f24528b;

            /* renamed from: c */
            final /* synthetic */ int f24529c;

            /* renamed from: d */
            final /* synthetic */ int f24530d;

            C10339a(int i, int i2, int i3, int i4) {
                this.f24527a = i;
                this.f24528b = i2;
                this.f24529c = i3;
                this.f24530d = i4;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C10338f.this.mo26949b(C11468a.m36995a(this.f24527a, this.f24528b, animatedFraction), C11468a.m36995a(this.f24529c, this.f24530d, animatedFraction));
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        class C10340b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f24532a;

            C10340b(int i) {
                this.f24532a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C10338f fVar = C10338f.this;
                fVar.f24519W = this.f24532a;
                fVar.f24520a0 = 0.0f;
            }
        }

        C10338f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f24517U = new Paint();
            this.f24518V = new GradientDrawable();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26944a(int i) {
            if (this.f24517U.getColor() != i) {
                this.f24517U.setColor(i);
                C4187x.m14344I(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26948b(int i) {
            if (this.f24522c != i) {
                this.f24522c = i;
                C4187x.m14344I(this);
            }
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.f24495i0;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.f24522c;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.f24507u0;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i4 = this.f24523c0;
            if (i4 >= 0 && this.f24524d0 > i4) {
                Drawable drawable2 = TabLayout.this.f24495i0;
                if (drawable2 == null) {
                    drawable2 = this.f24518V;
                }
                Drawable i5 = C0492a.m2652i(drawable2);
                i5.setBounds(this.f24523c0, i, this.f24524d0, intrinsicHeight);
                Paint paint = this.f24517U;
                if (paint != null) {
                    if (VERSION.SDK_INT == 21) {
                        i5.setColorFilter(paint.getColor(), Mode.SRC_IN);
                    } else {
                        C0492a.m2645b(i5, paint.getColor());
                    }
                }
                i5.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f24525e0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m32626b();
                return;
            }
            this.f24525e0.cancel();
            mo26946a(this.f24519W, Math.round((1.0f - this.f24525e0.getAnimatedFraction()) * ((float) this.f24525e0.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f24508v0 == 1 && tabLayout.f24505s0 == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.mo26878a(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f24505s0 = 0;
                            tabLayout2.mo26889a(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f24521b0 != i) {
                requestLayout();
                this.f24521b0 = i;
            }
        }

        /* renamed from: b */
        private void m32626b() {
            int i;
            int i2;
            View childAt = getChildAt(this.f24519W);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f24510x0 && (childAt instanceof C10343i)) {
                    m32625a((C10343i) childAt, tabLayout.f24484V);
                    i2 = (int) TabLayout.this.f24484V.left;
                    i = (int) TabLayout.this.f24484V.right;
                }
                if (this.f24520a0 > 0.0f && this.f24519W < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f24519W + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f24510x0 && (childAt2 instanceof C10343i)) {
                        m32625a((C10343i) childAt2, tabLayout2.f24484V);
                        left = (int) TabLayout.this.f24484V.left;
                        right = (int) TabLayout.this.f24484V.right;
                    }
                    float f = this.f24520a0;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo26949b(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo26947a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26945a(int i, float f) {
            ValueAnimator valueAnimator = this.f24525e0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24525e0.cancel();
            }
            this.f24519W = i;
            this.f24520a0 = f;
            m32626b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26946a(int i, int i2) {
            ValueAnimator valueAnimator = this.f24525e0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24525e0.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m32626b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f24510x0 && (childAt instanceof C10343i)) {
                m32625a((C10343i) childAt, tabLayout.f24484V);
                left = (int) TabLayout.this.f24484V.left;
                right = (int) TabLayout.this.f24484V.right;
            }
            int i3 = left;
            int i4 = right;
            int i5 = this.f24523c0;
            int i6 = this.f24524d0;
            if (!(i5 == i3 && i6 == i4)) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f24525e0 = valueAnimator2;
                valueAnimator2.setInterpolator(C11468a.f26816b);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                C10339a aVar = new C10339a(i5, i3, i6, i4);
                valueAnimator2.addUpdateListener(aVar);
                valueAnimator2.addListener(new C10340b(i));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26949b(int i, int i2) {
            if (i != this.f24523c0 || i2 != this.f24524d0) {
                this.f24523c0 = i;
                this.f24524d0 = i2;
                C4187x.m14344I(this);
            }
        }

        /* renamed from: a */
        private void m32625a(C10343i iVar, RectF rectF) {
            int a = iVar.m32662d();
            if (a < TabLayout.this.mo26878a(24)) {
                a = TabLayout.this.mo26878a(24);
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i = a / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C10341g {

        /* renamed from: a */
        private Object f24534a;

        /* renamed from: b */
        private Drawable f24535b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f24536c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CharSequence f24537d;

        /* renamed from: e */
        private int f24538e = -1;

        /* renamed from: f */
        private View f24539f;

        /* renamed from: g */
        public TabLayout f24540g;

        /* renamed from: h */
        public C10343i f24541h;

        /* renamed from: c */
        public int mo26965c() {
            return this.f24538e;
        }

        /* renamed from: d */
        public Object mo26966d() {
            return this.f24534a;
        }

        /* renamed from: e */
        public CharSequence mo26967e() {
            return this.f24536c;
        }

        /* renamed from: f */
        public boolean mo26968f() {
            TabLayout tabLayout = this.f24540g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f24538e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo26969g() {
            this.f24540g = null;
            this.f24541h = null;
            this.f24534a = null;
            this.f24535b = null;
            this.f24536c = null;
            this.f24537d = null;
            this.f24538e = -1;
            this.f24539f = null;
        }

        /* renamed from: h */
        public void mo26970h() {
            TabLayout tabLayout = this.f24540g;
            if (tabLayout != null) {
                tabLayout.mo26900c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo26971i() {
            C10343i iVar = this.f24541h;
            if (iVar != null) {
                iVar.mo26975b();
            }
        }

        /* renamed from: a */
        public C10341g mo26961a(Object obj) {
            this.f24534a = obj;
            return this;
        }

        /* renamed from: b */
        public Drawable mo26962b() {
            return this.f24535b;
        }

        /* renamed from: a */
        public View mo26956a() {
            return this.f24539f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26964b(int i) {
            this.f24538e = i;
        }

        /* renamed from: a */
        public C10341g mo26959a(View view) {
            this.f24539f = view;
            mo26971i();
            return this;
        }

        /* renamed from: b */
        public C10341g mo26963b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f24537d) && !TextUtils.isEmpty(charSequence)) {
                this.f24541h.setContentDescription(charSequence);
            }
            this.f24536c = charSequence;
            mo26971i();
            return this;
        }

        /* renamed from: a */
        public C10341g mo26957a(int i) {
            mo26959a(LayoutInflater.from(this.f24541h.getContext()).inflate(i, this.f24541h, false));
            return this;
        }

        /* renamed from: a */
        public C10341g mo26958a(Drawable drawable) {
            this.f24535b = drawable;
            mo26971i();
            return this;
        }

        /* renamed from: a */
        public C10341g mo26960a(CharSequence charSequence) {
            this.f24537d = charSequence;
            mo26971i();
            return this;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C10342h implements C1002j {

        /* renamed from: U */
        private int f24542U;

        /* renamed from: V */
        private int f24543V;

        /* renamed from: c */
        private final WeakReference<TabLayout> f24544c;

        public C10342h(TabLayout tabLayout) {
            this.f24544c = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo5553a(int i) {
            this.f24542U = this.f24543V;
            this.f24543V = i;
        }

        /* renamed from: b */
        public void mo5555b(int i) {
            TabLayout tabLayout = (TabLayout) this.f24544c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f24543V;
                tabLayout.mo26897b(tabLayout.mo26895b(i), i2 == 0 || (i2 == 2 && this.f24542U == 0));
            }
        }

        /* renamed from: a */
        public void mo5554a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f24544c.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f24543V != 2 || this.f24542U == 1;
                if (!(this.f24543V == 2 && this.f24542U == 0)) {
                    z = true;
                }
                tabLayout.mo26881a(i, f, z2, z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26972a() {
            this.f24543V = 0;
            this.f24542U = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    class C10343i extends LinearLayout {

        /* renamed from: U */
        private TextView f24545U;

        /* renamed from: V */
        private ImageView f24546V;

        /* renamed from: W */
        private View f24547W;

        /* renamed from: a0 */
        private TextView f24548a0;

        /* renamed from: b0 */
        private ImageView f24549b0;

        /* renamed from: c */
        private C10341g f24550c;

        /* renamed from: c0 */
        private Drawable f24551c0;

        /* renamed from: d0 */
        private int f24552d0 = 2;

        public C10343i(Context context) {
            super(context);
            m32657a(context);
            C4187x.m14354a(this, TabLayout.this.f24486a0, TabLayout.this.f24487b0, TabLayout.this.f24489c0, TabLayout.this.f24490d0);
            setGravity(17);
            setOrientation(TabLayout.this.f24509w0 ^ true ? 1 : 0);
            setClickable(true);
            C4187x.m14362a((View) this, C4184u.m14334a(getContext(), CloseCodes.PROTOCOL_ERROR));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m32662d() {
            View[] viewArr = {this.f24545U, this.f24546V, this.f24547W};
            int length = viewArr.length;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo26975b() {
            C10341g gVar = this.f24550c;
            Drawable drawable = null;
            View a = gVar != null ? gVar.mo26956a() : null;
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a);
                    }
                    addView(a);
                }
                this.f24547W = a;
                TextView textView = this.f24545U;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f24546V;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f24546V.setImageDrawable(null);
                }
                this.f24548a0 = (TextView) a.findViewById(16908308);
                TextView textView2 = this.f24548a0;
                if (textView2 != null) {
                    this.f24552d0 = C0513i.m2777d(textView2);
                }
                this.f24549b0 = (ImageView) a.findViewById(16908294);
            } else {
                View view = this.f24547W;
                if (view != null) {
                    removeView(view);
                    this.f24547W = null;
                }
                this.f24548a0 = null;
                this.f24549b0 = null;
            }
            boolean z = false;
            if (this.f24547W == null) {
                if (this.f24546V == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C11464h.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.f24546V = imageView2;
                }
                if (!(gVar == null || gVar.mo26962b() == null)) {
                    drawable = C0492a.m2652i(gVar.mo26962b()).mutate();
                }
                if (drawable != null) {
                    C0492a.m2637a(drawable, TabLayout.this.f24493g0);
                    Mode mode = TabLayout.this.f24496j0;
                    if (mode != null) {
                        C0492a.m2640a(drawable, mode);
                    }
                }
                if (this.f24545U == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C11464h.design_layout_tab_text, this, false);
                    addView(textView3);
                    this.f24545U = textView3;
                    this.f24552d0 = C0513i.m2777d(this.f24545U);
                }
                C0513i.m2778d(this.f24545U, TabLayout.this.f24491e0);
                ColorStateList colorStateList = TabLayout.this.f24492f0;
                if (colorStateList != null) {
                    this.f24545U.setTextColor(colorStateList);
                }
                m32659a(this.f24545U, this.f24546V);
            } else if (!(this.f24548a0 == null && this.f24549b0 == null)) {
                m32659a(this.f24548a0, this.f24549b0);
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f24537d)) {
                setContentDescription(gVar.f24537d);
            }
            if (gVar != null && gVar.mo26968f()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo26976c() {
            setOrientation(TabLayout.this.f24509w0 ^ true ? 1 : 0);
            if (this.f24548a0 == null && this.f24549b0 == null) {
                m32659a(this.f24545U, this.f24546V);
            } else {
                m32659a(this.f24548a0, this.f24549b0);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f24551c0;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f24551c0.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0079c.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0079c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f24500n0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f24545U != null) {
                float f = TabLayout.this.f24497k0;
                int i3 = this.f24552d0;
                ImageView imageView = this.f24546V;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f24545U;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f24498l0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f24545U.getTextSize();
                int lineCount = this.f24545U.getLineCount();
                int d = C0513i.m2777d(this.f24545U);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f24508v0 == 1 && i4 > 0 && lineCount == 1) {
                        Layout layout = this.f24545U.getLayout();
                        if (layout == null || m32655a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f24545U.setTextSize(0, f);
                        this.f24545U.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f24550c == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f24550c.mo26970h();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f24545U;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f24546V;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f24547W;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.graphics.drawable.Drawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m32657a(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f24499m0
                r1 = 0
                if (r0 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = p096e.p097a.p098k.p099a.C3868a.m12946c(r7, r0)
                r6.f24551c0 = r7
                android.graphics.drawable.Drawable r7 = r6.f24551c0
                if (r7 == 0) goto L_0x0023
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0023
                android.graphics.drawable.Drawable r7 = r6.f24551c0
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0023
            L_0x0021:
                r6.f24551c0 = r1
            L_0x0023:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f24494h0
                if (r2 == 0) goto L_0x007a
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f24494h0
                android.content.res.ColorStateList r3 = p163g.p449j.p450a.p468b.p478t.C11503a.m37104a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0065
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f24511y0
                if (r4 == 0) goto L_0x0058
                r7 = r1
            L_0x0058:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f24511y0
                if (r4 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r1 = r2
            L_0x0060:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x007a
            L_0x0065:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0492a.m2652i(r2)
                androidx.core.graphics.drawable.C0492a.m2637a(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x007a:
                p096e.p121h.p135s.C4187x.m14358a(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C10343i.m32657a(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m32658a(Canvas canvas) {
            Drawable drawable = this.f24551c0;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f24551c0.draw(canvas);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26974a(C10341g gVar) {
            if (gVar != this.f24550c) {
                this.f24550c = gVar;
                mo26975b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26973a() {
            mo26974a((C10341g) null);
            setSelected(false);
        }

        /* renamed from: a */
        private void m32659a(TextView textView, ImageView imageView) {
            C10341g gVar = this.f24550c;
            Drawable mutate = (gVar == null || gVar.mo26962b() == null) ? null : C0492a.m2652i(this.f24550c.mo26962b()).mutate();
            C10341g gVar2 = this.f24550c;
            CharSequence e = gVar2 != null ? gVar2.mo26967e() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(e);
            if (textView != null) {
                if (z) {
                    textView.setText(e);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int a = (!z || imageView.getVisibility() != 0) ? 0 : TabLayout.this.mo26878a(8);
                if (TabLayout.this.f24509w0) {
                    if (a != C4146h.m14189a(marginLayoutParams)) {
                        C4146h.m14190a(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    C4146h.m14190a(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C10341g gVar3 = this.f24550c;
            CharSequence a2 = gVar3 != null ? gVar3.f24537d : null;
            if (z) {
                a2 = null;
            }
            C0292v0.m1576a(this, a2);
        }

        /* renamed from: a */
        private float m32655a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C10344j implements C10336d {

        /* renamed from: a */
        private final ViewPager f24554a;

        public C10344j(ViewPager viewPager) {
            this.f24554a = viewPager;
        }

        /* renamed from: a */
        public void mo17519a(C10341g gVar) {
        }

        /* renamed from: b */
        public void mo17520b(C10341g gVar) {
            this.f24554a.setCurrentItem(gVar.mo26965c());
        }

        /* renamed from: c */
        public void mo17521c(C10341g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m32593f(C10341g gVar) {
        for (int size = this.f24473A0.size() - 1; size >= 0; size--) {
            ((C10335c) this.f24473A0.get(size)).mo17519a(gVar);
        }
    }

    /* renamed from: g */
    private LayoutParams m32594g() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m32584a(layoutParams);
        return layoutParams;
    }

    private int getDefaultHeight() {
        int size = this.f24488c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C10341g gVar = (C10341g) this.f24488c.get(i);
            if (gVar != null && gVar.mo26962b() != null && !TextUtils.isEmpty(gVar.mo26967e())) {
                z = true;
                break;
            }
            i++;
        }
        return (!z || this.f24509w0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f24501o0;
        if (i != -1) {
            return i;
        }
        return this.f24508v0 == 0 ? this.f24503q0 : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f24485W.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m32596h() {
        if (this.f24475C0 == null) {
            this.f24475C0 = new ValueAnimator();
            this.f24475C0.setInterpolator(C11468a.f26816b);
            this.f24475C0.setDuration((long) this.f24506t0);
            this.f24475C0.addUpdateListener(new C10333a());
        }
    }

    /* renamed from: i */
    private void m32598i() {
        int size = this.f24488c.size();
        for (int i = 0; i < size; i++) {
            ((C10341g) this.f24488c.get(i)).mo26971i();
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f24485W.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f24485W.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public void addView(View view) {
        m32583a(view);
    }

    /* renamed from: b */
    public void mo26896b(C10335c cVar) {
        this.f24473A0.remove(cVar);
    }

    /* renamed from: c */
    public C10341g mo26899c() {
        C10341g b = mo26894b();
        b.f24540g = this;
        b.f24541h = m32591e(b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo26901d() {
        mo26902e();
        C1008a aVar = this.f24477E0;
        if (aVar != null) {
            int a = aVar.mo5565a();
            for (int i = 0; i < a; i++) {
                C10341g c = mo26899c();
                c.mo26963b(this.f24477E0.mo5567a(i));
                mo26888a(c, false);
            }
            ViewPager viewPager = this.f24476D0;
            if (viewPager != null && a > 0) {
                int currentItem = viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo26900c(mo26895b(currentItem));
                }
            }
        }
    }

    /* renamed from: e */
    public void mo26902e() {
        for (int childCount = this.f24485W.getChildCount() - 1; childCount >= 0; childCount--) {
            m32589d(childCount);
        }
        Iterator it = this.f24488c.iterator();
        while (it.hasNext()) {
            C10341g gVar = (C10341g) it.next();
            it.remove();
            gVar.mo26969g();
            mo26898b(gVar);
        }
        this.f24483U = null;
    }

    public int getSelectedTabPosition() {
        C10341g gVar = this.f24483U;
        if (gVar != null) {
            return gVar.mo26965c();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f24488c.size();
    }

    public int getTabGravity() {
        return this.f24505s0;
    }

    public ColorStateList getTabIconTint() {
        return this.f24493g0;
    }

    public int getTabIndicatorGravity() {
        return this.f24507u0;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f24500n0;
    }

    public int getTabMode() {
        return this.f24508v0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f24494h0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f24495i0;
    }

    public ColorStateList getTabTextColors() {
        return this.f24492f0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24476D0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m32585a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24481I0) {
            setupWithViewPager(null);
            this.f24481I0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f24485W.getChildCount(); i++) {
            View childAt = this.f24485W.getChildAt(i);
            if (childAt instanceof C10343i) {
                ((C10343i) childAt).m32658a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = mo26878a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(a, MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        int size = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            int i3 = this.f24502p0;
            if (i3 <= 0) {
                i3 = size - mo26878a(56);
            }
            this.f24500n0 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            boolean z = false;
            View childAt = getChildAt(0);
            int i4 = this.f24508v0;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z = true;
            }
            if (z) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.f24509w0 != z) {
            this.f24509w0 = z;
            for (int i = 0; i < this.f24485W.getChildCount(); i++) {
                View childAt = this.f24485W.getChildAt(i);
                if (childAt instanceof C10343i) {
                    ((C10343i) childAt).mo26976c();
                }
            }
            m32592f();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C10335c cVar) {
        C10335c cVar2 = this.f24512z0;
        if (cVar2 != null) {
            mo26896b(cVar2);
        }
        this.f24512z0 = cVar;
        if (cVar != null) {
            mo26884a(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m32596h();
        this.f24475C0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f24495i0 != drawable) {
            this.f24495i0 = drawable;
            C4187x.m14344I(this.f24485W);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f24485W.mo26944a(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f24507u0 != i) {
            this.f24507u0 = i;
            C4187x.m14344I(this.f24485W);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f24485W.mo26948b(i);
    }

    public void setTabGravity(int i) {
        if (this.f24505s0 != i) {
            this.f24505s0 = i;
            m32592f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f24493g0 != colorStateList) {
            this.f24493g0 = colorStateList;
            m32598i();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3868a.m12945b(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f24510x0 = z;
        C4187x.m14344I(this.f24485W);
    }

    public void setTabMode(int i) {
        if (i != this.f24508v0) {
            this.f24508v0 = i;
            m32592f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f24494h0 != colorStateList) {
            this.f24494h0 = colorStateList;
            for (int i = 0; i < this.f24485W.getChildCount(); i++) {
                View childAt = this.f24485W.getChildAt(i);
                if (childAt instanceof C10343i) {
                    ((C10343i) childAt).m32657a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3868a.m12945b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f24492f0 != colorStateList) {
            this.f24492f0 = colorStateList;
            m32598i();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C1008a aVar) {
        mo26883a(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f24511y0 != z) {
            this.f24511y0 = z;
            for (int i = 0; i < this.f24485W.getChildCount(); i++) {
                View childAt = this.f24485W.getChildAt(i);
                if (childAt instanceof C10343i) {
                    ((C10343i) childAt).m32657a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo26882a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11458b.tabStyle);
    }

    /* renamed from: a */
    public void mo26880a(int i, float f, boolean z) {
        mo26881a(i, f, z, true);
    }

    public void addView(View view, int i) {
        m32583a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10341g mo26894b() {
        C10341g gVar = (C10341g) f24472K0.mo14666a();
        return gVar == null ? new C10341g() : gVar;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24488c = new ArrayList<>();
        this.f24484V = new RectF();
        this.f24500n0 = Integer.MAX_VALUE;
        this.f24473A0 = new ArrayList<>();
        this.f24482J0 = new C4115g(12);
        setHorizontalScrollBarEnabled(false);
        this.f24485W = new C10338f(context);
        super.addView(this.f24485W, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray c = C10320g.m32558c(context, attributeSet, C11467k.TabLayout, i, C11466j.Widget_Design_TabLayout, C11467k.TabLayout_tabTextAppearance);
        this.f24485W.mo26948b(c.getDimensionPixelSize(C11467k.TabLayout_tabIndicatorHeight, -1));
        this.f24485W.mo26944a(c.getColor(C11467k.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C11499a.m37088b(context, c, C11467k.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(c.getInt(C11467k.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(c.getBoolean(C11467k.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = c.getDimensionPixelSize(C11467k.TabLayout_tabPadding, 0);
        this.f24490d0 = dimensionPixelSize;
        this.f24489c0 = dimensionPixelSize;
        this.f24487b0 = dimensionPixelSize;
        this.f24486a0 = dimensionPixelSize;
        this.f24486a0 = c.getDimensionPixelSize(C11467k.TabLayout_tabPaddingStart, this.f24486a0);
        this.f24487b0 = c.getDimensionPixelSize(C11467k.TabLayout_tabPaddingTop, this.f24487b0);
        this.f24489c0 = c.getDimensionPixelSize(C11467k.TabLayout_tabPaddingEnd, this.f24489c0);
        this.f24490d0 = c.getDimensionPixelSize(C11467k.TabLayout_tabPaddingBottom, this.f24490d0);
        this.f24491e0 = c.getResourceId(C11467k.TabLayout_tabTextAppearance, C11466j.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f24491e0, C3867j.TextAppearance);
        try {
            this.f24497k0 = (float) obtainStyledAttributes.getDimensionPixelSize(C3867j.TextAppearance_android_textSize, 0);
            this.f24492f0 = C11499a.m37087a(context, obtainStyledAttributes, C3867j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (c.hasValue(C11467k.TabLayout_tabTextColor)) {
                this.f24492f0 = C11499a.m37087a(context, c, C11467k.TabLayout_tabTextColor);
            }
            if (c.hasValue(C11467k.TabLayout_tabSelectedTextColor)) {
                this.f24492f0 = m32581a(this.f24492f0.getDefaultColor(), c.getColor(C11467k.TabLayout_tabSelectedTextColor, 0));
            }
            this.f24493g0 = C11499a.m37087a(context, c, C11467k.TabLayout_tabIconTint);
            this.f24496j0 = C10321h.m32560a(c.getInt(C11467k.TabLayout_tabIconTintMode, -1), null);
            this.f24494h0 = C11499a.m37087a(context, c, C11467k.TabLayout_tabRippleColor);
            this.f24506t0 = c.getInt(C11467k.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f24501o0 = c.getDimensionPixelSize(C11467k.TabLayout_tabMinWidth, -1);
            this.f24502p0 = c.getDimensionPixelSize(C11467k.TabLayout_tabMaxWidth, -1);
            this.f24499m0 = c.getResourceId(C11467k.TabLayout_tabBackground, 0);
            this.f24504r0 = c.getDimensionPixelSize(C11467k.TabLayout_tabContentStart, 0);
            this.f24508v0 = c.getInt(C11467k.TabLayout_tabMode, 1);
            this.f24505s0 = c.getInt(C11467k.TabLayout_tabGravity, 0);
            this.f24509w0 = c.getBoolean(C11467k.TabLayout_tabInlineLabel, false);
            this.f24511y0 = c.getBoolean(C11467k.TabLayout_tabUnboundedRipple, false);
            c.recycle();
            Resources resources = getResources();
            this.f24498l0 = (float) resources.getDimensionPixelSize(C11460d.design_tab_text_size_2line);
            this.f24503q0 = resources.getDimensionPixelSize(C11460d.design_tab_scrollable_min_width);
            m32592f();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: f */
    private void m32592f() {
        C4187x.m14354a(this.f24485W, this.f24508v0 == 0 ? Math.max(0, this.f24504r0 - this.f24486a0) : 0, 0, 0, 0);
        int i = this.f24508v0;
        if (i == 0) {
            this.f24485W.setGravity(8388611);
        } else if (i == 1) {
            this.f24485W.setGravity(1);
        }
        mo26889a(true);
    }

    /* renamed from: g */
    private void m32595g(C10341g gVar) {
        for (int size = this.f24473A0.size() - 1; size >= 0; size--) {
            ((C10335c) this.f24473A0.get(size)).mo17520b(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26881a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f24485W.getChildCount()) {
            if (z2) {
                this.f24485W.mo26945a(i, f);
            }
            ValueAnimator valueAnimator = this.f24475C0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24475C0.cancel();
            }
            scrollTo(m32580a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m32583a(view);
    }

    /* renamed from: c */
    private void m32588c(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C4187x.m14340E(this) || this.f24485W.mo26947a()) {
                mo26880a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m32580a(i, 0.0f);
            if (scrollX != a) {
                m32596h();
                this.f24475C0.setIntValues(new int[]{scrollX, a});
                this.f24475C0.start();
            }
            this.f24485W.mo26946a(i, this.f24506t0);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m32583a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo26898b(C10341g gVar) {
        return f24472K0.mo14667a(gVar);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C3868a.m12946c(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* renamed from: b */
    public C10341g mo26895b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C10341g) this.f24488c.get(i);
    }

    /* renamed from: b */
    private void m32587b(C10341g gVar, int i) {
        gVar.mo26964b(i);
        this.f24488c.add(i, gVar);
        int size = this.f24488c.size();
        while (true) {
            i++;
            if (i < size) {
                ((C10341g) this.f24488c.get(i)).mo26964b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m32597h(C10341g gVar) {
        for (int size = this.f24473A0.size() - 1; size >= 0; size--) {
            ((C10335c) this.f24473A0.get(size)).mo17521c(gVar);
        }
    }

    /* renamed from: d */
    private void m32590d(C10341g gVar) {
        this.f24485W.addView(gVar.f24541h, gVar.mo26965c(), m32594g());
    }

    /* renamed from: e */
    private C10343i m32591e(C10341g gVar) {
        C4114f<C10343i> fVar = this.f24482J0;
        C10343i iVar = fVar != null ? (C10343i) fVar.mo14666a() : null;
        if (iVar == null) {
            iVar = new C10343i(getContext());
        }
        iVar.mo26974a(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f24537d)) {
            iVar.setContentDescription(gVar.f24536c);
        } else {
            iVar.setContentDescription(gVar.f24537d);
        }
        return iVar;
    }

    /* renamed from: a */
    public void mo26885a(C10341g gVar) {
        mo26888a(gVar, this.f24488c.isEmpty());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26897b(C10341g gVar, boolean z) {
        C10341g gVar2 = this.f24483U;
        if (gVar2 != gVar) {
            int c = gVar != null ? gVar.mo26965c() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo26965c() == -1) && c != -1) {
                    mo26880a(c, 0.0f, true);
                } else {
                    m32588c(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            this.f24483U = gVar;
            if (gVar2 != null) {
                m32597h(gVar2);
            }
            if (gVar != null) {
                m32595g(gVar);
            }
        } else if (gVar2 != null) {
            m32593f(gVar);
            m32588c(gVar.mo26965c());
        }
    }

    /* renamed from: d */
    private void m32589d(int i) {
        C10343i iVar = (C10343i) this.f24485W.getChildAt(i);
        this.f24485W.removeViewAt(i);
        if (iVar != null) {
            iVar.mo26973a();
            this.f24482J0.mo14667a(iVar);
        }
        requestLayout();
    }

    /* renamed from: a */
    public void mo26886a(C10341g gVar, int i) {
        mo26887a(gVar, i, this.f24488c.isEmpty());
    }

    /* renamed from: a */
    public void mo26888a(C10341g gVar, boolean z) {
        mo26887a(gVar, this.f24488c.size(), z);
    }

    /* renamed from: a */
    public void mo26887a(C10341g gVar, int i, boolean z) {
        if (gVar.f24540g == this) {
            m32587b(gVar, i);
            m32590d(gVar);
            if (z) {
                gVar.mo26970h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo26900c(C10341g gVar) {
        mo26897b(gVar, true);
    }

    /* renamed from: a */
    private void m32586a(C10345a aVar) {
        C10341g c = mo26899c();
        CharSequence charSequence = aVar.f24557c;
        if (charSequence != null) {
            c.mo26963b(charSequence);
        }
        Drawable drawable = aVar.f24555U;
        if (drawable != null) {
            c.mo26958a(drawable);
        }
        int i = aVar.f24556V;
        if (i != 0) {
            c.mo26957a(i);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            c.mo26960a(aVar.getContentDescription());
        }
        mo26885a(c);
    }

    /* renamed from: a */
    public void mo26884a(C10335c cVar) {
        if (!this.f24473A0.contains(cVar)) {
            this.f24473A0.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo26879a() {
        this.f24473A0.clear();
    }

    /* renamed from: a */
    public void mo26882a(ViewPager viewPager, boolean z) {
        m32585a(viewPager, z, false);
    }

    /* renamed from: a */
    private void m32585a(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f24476D0;
        if (viewPager2 != null) {
            C10342h hVar = this.f24479G0;
            if (hVar != null) {
                viewPager2.mo5507b((C1002j) hVar);
            }
            C10334b bVar = this.f24480H0;
            if (bVar != null) {
                this.f24476D0.mo5506b((C1001i) bVar);
            }
        }
        C10335c cVar = this.f24474B0;
        if (cVar != null) {
            mo26896b(cVar);
            this.f24474B0 = null;
        }
        if (viewPager != null) {
            this.f24476D0 = viewPager;
            if (this.f24479G0 == null) {
                this.f24479G0 = new C10342h(this);
            }
            this.f24479G0.mo26972a();
            viewPager.mo5496a((C1002j) this.f24479G0);
            this.f24474B0 = new C10344j(viewPager);
            mo26884a(this.f24474B0);
            C1008a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo26883a(adapter, z);
            }
            if (this.f24480H0 == null) {
                this.f24480H0 = new C10334b();
            }
            this.f24480H0.mo26941a(z);
            viewPager.mo5495a((C1001i) this.f24480H0);
            mo26880a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f24476D0 = null;
            mo26883a((C1008a) null, false);
        }
        this.f24481I0 = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26883a(C1008a aVar, boolean z) {
        C1008a aVar2 = this.f24477E0;
        if (aVar2 != null) {
            DataSetObserver dataSetObserver = this.f24478F0;
            if (dataSetObserver != null) {
                aVar2.mo5571c(dataSetObserver);
            }
        }
        this.f24477E0 = aVar;
        if (z && aVar != null) {
            if (this.f24478F0 == null) {
                this.f24478F0 = new C10337e();
            }
            aVar.mo5568a(this.f24478F0);
        }
        mo26901d();
    }

    /* renamed from: a */
    private void m32583a(View view) {
        if (view instanceof C10345a) {
            m32586a((C10345a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: a */
    private void m32584a(LayoutParams layoutParams) {
        if (this.f24508v0 == 1 && this.f24505s0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo26878a(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: a */
    private int m32580a(int i, float f) {
        int i2 = 0;
        if (this.f24508v0 != 0) {
            return 0;
        }
        View childAt = this.f24485W.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f24485W.getChildCount() ? this.f24485W.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        return C4187x.m14399n(this) == 0 ? left + i4 : left - i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26889a(boolean z) {
        for (int i = 0; i < this.f24485W.getChildCount(); i++) {
            View childAt = this.f24485W.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m32584a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: a */
    private static ColorStateList m32581a(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }
}
