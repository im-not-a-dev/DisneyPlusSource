package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0444d;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import com.google.android.material.internal.C10320g;
import java.lang.ref.WeakReference;
import java.util.List;
import p096e.p121h.p128m.C4062a;
import p096e.p121h.p134r.C4111c;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4176m;
import p096e.p121h.p135s.C4182s;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p141a.C4204a;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11466j;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p469l.C11468a;

@C0444d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: U */
    private int f24097U;

    /* renamed from: V */
    private int f24098V;

    /* renamed from: W */
    private boolean f24099W;

    /* renamed from: a0 */
    private int f24100a0;

    /* renamed from: b0 */
    private C4147h0 f24101b0;

    /* renamed from: c */
    private int f24102c;

    /* renamed from: c0 */
    private List<C10267b> f24103c0;

    /* renamed from: d0 */
    private boolean f24104d0;

    /* renamed from: e0 */
    private boolean f24105e0;

    /* renamed from: f0 */
    private boolean f24106f0;

    /* renamed from: g0 */
    private boolean f24107g0;

    /* renamed from: h0 */
    private int[] f24108h0;

    protected static class BaseBehavior<T extends AppBarLayout> extends C10269a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f24109k;

        /* renamed from: l */
        private int f24110l;

        /* renamed from: m */
        private ValueAnimator f24111m;

        /* renamed from: n */
        private int f24112n = -1;

        /* renamed from: o */
        private boolean f24113o;

        /* renamed from: p */
        private float f24114p;

        /* renamed from: q */
        private WeakReference<View> f24115q;

        /* renamed from: r */
        private C10263b f24116r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C10262a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f24117a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f24118b;

            C10262a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f24117a = coordinatorLayout;
                this.f24118b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo26369c(this.f24117a, this.f24118b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C10263b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo26356a(T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        protected static class C10264c extends C4204a {
            public static final Creator<C10264c> CREATOR = new C10265a();

            /* renamed from: V */
            int f24120V;

            /* renamed from: W */
            float f24121W;

            /* renamed from: X */
            boolean f24122X;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            static class C10265a implements ClassLoaderCreator<C10264c> {
                C10265a() {
                }

                public C10264c[] newArray(int i) {
                    return new C10264c[i];
                }

                public C10264c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C10264c(parcel, classLoader);
                }

                public C10264c createFromParcel(Parcel parcel) {
                    return new C10264c(parcel, null);
                }
            }

            public C10264c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f24120V = parcel.readInt();
                this.f24121W = parcel.readFloat();
                this.f24122X = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f24120V);
                parcel.writeFloat(this.f24121W);
                parcel.writeByte(this.f24122X ? (byte) 1 : 0);
            }

            public C10264c(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static boolean m32049a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: d */
        private void m32054d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo26351c();
            int b = m32051b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C10268c cVar = (C10268c) childAt.getLayoutParams();
                int a = cVar.mo26364a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m32049a(a, 2)) {
                        i2 += C4187x.m14400o(childAt);
                    } else if (m32049a(a, 5)) {
                        int o = C4187x.m14400o(childAt) + i2;
                        if (c < o) {
                            i = o;
                        } else {
                            i2 = o;
                        }
                    }
                    if (m32049a(a, 32)) {
                        i += cVar.topMargin;
                        i2 -= cVar.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m32046a(coordinatorLayout, t, C4062a.m13967a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo26352c(T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: c */
        private int m32052c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C10268c cVar = (C10268c) childAt.getLayoutParams();
                Interpolator b = cVar.mo26365b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = cVar.mo26364a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + cVar.topMargin + cVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C4187x.m14400o(childAt);
                        }
                    }
                    if (C4187x.m14396k(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: b */
        private int m32051b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C10268c cVar = (C10268c) childAt.getLayoutParams();
                if (m32049a(cVar.mo26364a(), 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public boolean mo2538b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo26315c() || m32050a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f24111m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f24115q = null;
            this.f24110l = i2;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo26347b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo2541d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo2541d(coordinatorLayout, t);
            int b = mo26377b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    C10264c cVar = new C10264c(d);
                    cVar.f24120V = i;
                    if (bottom == C4187x.m14400o(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f24122X = z;
                    cVar.f24121W = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return d;
        }

        /* renamed from: a */
        private boolean m32050a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo26314b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void mo2522a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo26367a(coordinatorLayout, t, i2, i5, i4);
                    m32045a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: c */
        private boolean m32053c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo2478c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0443c d = ((C0446f) ((View) c.get(i)).getLayoutParams()).mo2558d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).mo26374c() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo2520a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo26367a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m32045a(i4, t, view, i5);
            }
            if (t.mo26315c()) {
                t.mo26313a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        private void m32045a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int c = mo26351c();
                if ((i < 0 && c == 0) || (i > 0 && c == (-t.getDownNestedScrollRange()))) {
                    C4187x.m14394i(view, 1);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo26351c() {
            return mo26377b() + this.f24109k;
        }

        /* renamed from: a */
        public void mo2518a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f24110l == 0 || i == 1) {
                m32054d(coordinatorLayout, t);
            }
            this.f24115q = new WeakReference<>(view);
        }

        /* renamed from: a */
        private void m32046a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo26351c() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m32047a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m32047a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo26351c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f24111m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f24111m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f24111m;
            if (valueAnimator2 == null) {
                this.f24111m = new ValueAnimator();
                this.f24111m.setInterpolator(C11468a.f26819e);
                this.f24111m.addUpdateListener(new C10262a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f24111m.setDuration((long) Math.min(i2, 600));
            this.f24111m.setIntValues(new int[]{c, i});
            this.f24111m.start();
        }

        /* renamed from: a */
        public boolean mo2527a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0446f) t.getLayoutParams()).height != -2) {
                return super.mo2527a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2469a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo2526a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f24112n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f24113o) {
                    i2 = C4187x.m14400o(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f24114p);
                }
                mo26369c(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m32046a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo26369c(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m32046a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo26369c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo26317d();
            this.f24112n = -1;
            mo26376a(C4062a.m13967a(mo26377b(), -t.getTotalScrollRange(), 0));
            m32048a(coordinatorLayout, t, mo26377b(), 0, true);
            t.mo26310a(mo26377b());
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo26342a(T t) {
            C10263b bVar = this.f24116r;
            if (bVar != null) {
                return bVar.mo26356a(t);
            }
            WeakReference<View> weakReference = this.f24115q;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26354e(CoordinatorLayout coordinatorLayout, T t) {
            m32054d(coordinatorLayout, t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo26348b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo26351c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f24109k = 0;
            } else {
                int a = C4062a.m13967a(i, i2, i3);
                if (c != a) {
                    int c2 = t.mo26312a() ? m32052c(t, a) : a;
                    boolean a2 = mo26376a(c2);
                    i4 = c - a;
                    this.f24109k = a - c2;
                    if (!a2 && t.mo26312a()) {
                        coordinatorLayout.mo2468a((View) t);
                    }
                    t.mo26310a(mo26377b());
                    m32048a(coordinatorLayout, t, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m32048a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m32044a(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.C10268c) r1
                int r1 = r1.mo26364a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = p096e.p121h.p135s.C4187x.m14400o(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.mo26315c()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.m32043a(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0056
                r8 = 1
                goto L_0x0057
            L_0x0056:
                r8 = 0
            L_0x0057:
                boolean r8 = r7.mo26313a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m32053c(r6, (T) r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m32048a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: a */
        private static View m32044a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private View m32043a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C4176m) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2517a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C10264c) {
                C10264c cVar = (C10264c) parcelable;
                super.mo2517a(coordinatorLayout, t, cVar.mo14857X());
                this.f24112n = cVar.f24120V;
                this.f24114p = cVar.f24121W;
                this.f24113o = cVar.f24122X;
                return;
            }
            super.mo2517a(coordinatorLayout, t, parcelable);
            this.f24112n = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C10271b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        public boolean mo2536b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m32084a(view, view2);
            m32085b(view, view2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo26362c(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo26362c(view);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.ScrollingViewBehavior_Layout);
            mo26372b(obtainStyledAttributes.getDimensionPixelSize(C11467k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo26361b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m32083a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public boolean mo2529a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo26360a(coordinatorLayout.mo2474b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f24136d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo26311a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m32085b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo26315c()) {
                    appBarLayout.mo26313a(view.getScrollY() > 0);
                }
            }
        }

        /* renamed from: a */
        private void m32084a(View view, View view2) {
            C0443c d = ((C0446f) view2.getLayoutParams()).mo2558d();
            if (d instanceof BaseBehavior) {
                C4187x.m14386e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f24109k) + mo26375d()) - mo26371a(view2));
            }
        }

        /* renamed from: a */
        private static int m32083a(AppBarLayout appBarLayout) {
            C0443c d = ((C0446f) appBarLayout.getLayoutParams()).mo2558d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo26351c();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public AppBarLayout m32087a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C10266a implements C4182s {
        C10266a() {
        }

        public C4147h0 onApplyWindowInsets(View view, C4147h0 h0Var) {
            return AppBarLayout.this.mo26309a(h0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C10267b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo26363a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C10268c extends LayoutParams {

        /* renamed from: a */
        int f24124a = 1;

        /* renamed from: b */
        Interpolator f24125b;

        public C10268c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.AppBarLayout_Layout);
            this.f24124a = obtainStyledAttributes.getInt(C11467k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C11467k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f24125b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C11467k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo26364a() {
            return this.f24124a;
        }

        /* renamed from: b */
        public Interpolator mo26365b() {
            return this.f24125b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo26366c() {
            int i = this.f24124a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C10268c(int i, int i2) {
            super(i, i2);
        }

        public C10268c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C10268c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C10268c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private boolean m32032e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C10268c) getChildAt(i).getLayoutParams()).mo26366c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m32033f() {
        this.f24102c = -1;
        this.f24097U = -1;
        this.f24098V = -1;
    }

    /* renamed from: a */
    public void mo26311a(boolean z, boolean z2) {
        m32030a(z, z2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo26314b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean mo26315c() {
        return this.f24107g0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C10268c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo26317d() {
        this.f24100a0 = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f24097U;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C10268c cVar = (C10268c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f24124a;
            if ((i4 & 5) == 5) {
                int i5 = i3 + cVar.topMargin + cVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + C4187x.m14400o(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        i = C4187x.m14400o(childAt);
                    } else {
                        i = getTopInset();
                    }
                    i3 = i5 + (measuredHeight - i);
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f24097U = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f24098V;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C10268c cVar = (C10268c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
            int i4 = cVar.f24124a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C4187x.m14400o(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f24098V = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int o = C4187x.m14400o(this);
        if (o == 0) {
            int childCount = getChildCount();
            o = childCount >= 1 ? C4187x.m14400o(getChildAt(childCount - 1)) : 0;
            if (o == 0) {
                return getHeight() / 3;
            }
        }
        return (o * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f24100a0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        C4147h0 h0Var = this.f24101b0;
        if (h0Var != null) {
            return h0Var.mo14724e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f24102c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C10268c cVar = (C10268c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f24124a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + cVar.topMargin + cVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C4187x.m14400o(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f24102c = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f24108h0 == null) {
            this.f24108h0 = new int[4];
        }
        int[] iArr = this.f24108h0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f24105e0 ? C11458b.state_liftable : -C11458b.state_liftable;
        iArr[1] = (!this.f24105e0 || !this.f24106f0) ? -C11458b.state_lifted : C11458b.state_lifted;
        iArr[2] = this.f24105e0 ? C11458b.state_collapsible : -C11458b.state_collapsible;
        iArr[3] = (!this.f24105e0 || !this.f24106f0) ? -C11458b.state_collapsed : C11458b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m32033f();
        boolean z2 = false;
        this.f24099W = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C10268c) getChildAt(i5).getLayoutParams()).mo26365b() != null) {
                this.f24099W = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f24104d0) {
            if (this.f24107g0 || m32032e()) {
                z2 = true;
            }
            m32031b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m32033f();
    }

    public void setExpanded(boolean z) {
        mo26311a(z, C4187x.m14340E(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f24107g0 = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C10274e.m32129a(this, f);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24102c = -1;
        this.f24097U = -1;
        this.f24098V = -1;
        this.f24100a0 = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C10274e.m32128a(this);
            C10274e.m32130a(this, attributeSet, 0, C11466j.Widget_Design_AppBarLayout);
        }
        TypedArray c = C10320g.m32558c(context, attributeSet, C11467k.AppBarLayout, 0, C11466j.Widget_Design_AppBarLayout, new int[0]);
        C4187x.m14358a((View) this, c.getDrawable(C11467k.AppBarLayout_android_background));
        if (c.hasValue(C11467k.AppBarLayout_expanded)) {
            m32030a(c.getBoolean(C11467k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && c.hasValue(C11467k.AppBarLayout_elevation)) {
            C10274e.m32129a(this, (float) c.getDimensionPixelSize(C11467k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (c.hasValue(C11467k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C11467k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C11467k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C11467k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f24107g0 = c.getBoolean(C11467k.AppBarLayout_liftOnScroll, false);
        c.recycle();
        C4187x.m14361a((View) this, (C4182s) new C10266a());
    }

    /* renamed from: a */
    private void m32030a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f24100a0 = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m32031b(boolean z) {
        if (this.f24105e0 == z) {
            return false;
        }
        this.f24105e0 = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public C10268c generateDefaultLayoutParams() {
        return new C10268c(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26312a() {
        return this.f24099W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26310a(int i) {
        List<C10267b> list = this.f24103c0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C10267b bVar = (C10267b) this.f24103c0.get(i2);
                if (bVar != null) {
                    bVar.mo26363a(this, i);
                }
            }
        }
    }

    public C10268c generateLayoutParams(AttributeSet attributeSet) {
        return new C10268c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C10268c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new C10268c((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C10268c((MarginLayoutParams) layoutParams);
        }
        return new C10268c(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26313a(boolean z) {
        if (this.f24106f0 == z) {
            return false;
        }
        this.f24106f0 = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4147h0 mo26309a(C4147h0 h0Var) {
        C4147h0 h0Var2 = C4187x.m14396k(this) ? h0Var : null;
        if (!C4111c.m14086a(this.f24101b0, h0Var2)) {
            this.f24101b0 = h0Var2;
            m32033f();
        }
        return h0Var;
    }
}
