package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.graphics.drawable.C0492a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p096e.p120g.C4013a;
import p096e.p120g.C4014b;
import p096e.p120g.C4015c;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p134r.C4111c;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4116h;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4178o;
import p096e.p121h.p135s.C4181r;
import p096e.p121h.p135s.C4182s;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p141a.C4204a;

public class CoordinatorLayout extends ViewGroup implements C4178o {

    /* renamed from: p0 */
    static final String f2002p0;

    /* renamed from: q0 */
    static final Class<?>[] f2003q0 = {Context.class, AttributeSet.class};

    /* renamed from: r0 */
    static final ThreadLocal<Map<String, Constructor<C0443c>>> f2004r0 = new ThreadLocal<>();

    /* renamed from: s0 */
    static final Comparator<View> f2005s0;

    /* renamed from: t0 */
    private static final C4114f<Rect> f2006t0 = new C4116h(12);

    /* renamed from: U */
    private final C0451a<View> f2007U;

    /* renamed from: V */
    private final List<View> f2008V;

    /* renamed from: W */
    private final List<View> f2009W;

    /* renamed from: a0 */
    private final int[] f2010a0;

    /* renamed from: b0 */
    private Paint f2011b0;

    /* renamed from: c */
    private final List<View> f2012c;

    /* renamed from: c0 */
    private boolean f2013c0;

    /* renamed from: d0 */
    private boolean f2014d0;

    /* renamed from: e0 */
    private int[] f2015e0;

    /* renamed from: f0 */
    private View f2016f0;

    /* renamed from: g0 */
    private View f2017g0;

    /* renamed from: h0 */
    private C0447g f2018h0;

    /* renamed from: i0 */
    private boolean f2019i0;

    /* renamed from: j0 */
    private C4147h0 f2020j0;

    /* renamed from: k0 */
    private boolean f2021k0;

    /* renamed from: l0 */
    private Drawable f2022l0;

    /* renamed from: m0 */
    OnHierarchyChangeListener f2023m0;

    /* renamed from: n0 */
    private C4182s f2024n0;

    /* renamed from: o0 */
    private final C4181r f2025o0;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0441a implements C4182s {
        C0441a() {
        }

        public C4147h0 onApplyWindowInsets(View view, C4147h0 h0Var) {
            return CoordinatorLayout.this.mo2465a(h0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0442b {
        C0443c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0443c<V extends View> {
        public C0443c() {
        }

        /* renamed from: a */
        public C4147h0 mo2514a(CoordinatorLayout coordinatorLayout, V v, C4147h0 h0Var) {
            return h0Var;
        }

        /* renamed from: a */
        public void mo2515a() {
        }

        /* renamed from: a */
        public void mo2516a(C0446f fVar) {
        }

        /* renamed from: a */
        public void mo2517a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2523a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public boolean mo2525a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2539c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2527a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2529a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2531a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2532a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2533a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int mo2534b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo2535b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2536b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo2537b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2538b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2537b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float mo2539c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo2540c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo2541d(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo2542d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public C0443c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public void mo2524a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2523a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo2518a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2542d(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo2520a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2519a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2521a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0444d {
        Class<? extends C0443c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0445e implements OnHierarchyChangeListener {
        C0445e() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2023m0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2467a(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2023m0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0446f extends MarginLayoutParams {

        /* renamed from: a */
        C0443c f2028a;

        /* renamed from: b */
        boolean f2029b = false;

        /* renamed from: c */
        public int f2030c = 0;

        /* renamed from: d */
        public int f2031d = 0;

        /* renamed from: e */
        public int f2032e = -1;

        /* renamed from: f */
        int f2033f = -1;

        /* renamed from: g */
        public int f2034g = 0;

        /* renamed from: h */
        public int f2035h = 0;

        /* renamed from: i */
        int f2036i;

        /* renamed from: j */
        int f2037j;

        /* renamed from: k */
        View f2038k;

        /* renamed from: l */
        View f2039l;

        /* renamed from: m */
        private boolean f2040m;

        /* renamed from: n */
        private boolean f2041n;

        /* renamed from: o */
        private boolean f2042o;

        /* renamed from: p */
        private boolean f2043p;

        /* renamed from: q */
        final Rect f2044q = new Rect();

        public C0446f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo2549a(C0443c cVar) {
            C0443c cVar2 = this.f2028a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2515a();
                }
                this.f2028a = cVar;
                this.f2029b = true;
                if (cVar != null) {
                    cVar.mo2516a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2555b() {
            if (this.f2028a == null) {
                this.f2040m = false;
            }
            return this.f2040m;
        }

        /* renamed from: c */
        public int mo2557c() {
            return this.f2033f;
        }

        /* renamed from: d */
        public C0443c mo2558d() {
            return this.f2028a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo2559e() {
            return this.f2043p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Rect mo2560f() {
            return this.f2044q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo2561g() {
            this.f2043p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo2562h() {
            this.f2040m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2556b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2040m;
            if (z) {
                return true;
            }
            C0443c cVar = this.f2028a;
            boolean a = (cVar != null ? cVar.mo2525a(coordinatorLayout, view) : false) | z;
            this.f2040m = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2548a(Rect rect) {
            this.f2044q.set(rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2551a() {
            return this.f2038k == null && this.f2033f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2554b(int i) {
            mo2547a(i, false);
        }

        /* renamed from: b */
        private boolean m2440b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2038k.getId() != this.f2033f) {
                return false;
            }
            View view2 = this.f2038k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2039l = null;
                    this.f2038k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2039l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2547a(int i, boolean z) {
            if (i == 0) {
                this.f2041n = z;
            } else if (i == 1) {
                this.f2042o = z;
            }
        }

        C0446f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4015c.CoordinatorLayout_Layout);
            this.f2030c = obtainStyledAttributes.getInteger(C4015c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2033f = obtainStyledAttributes.getResourceId(C4015c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2031d = obtainStyledAttributes.getInteger(C4015c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2032e = obtainStyledAttributes.getInteger(C4015c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2034g = obtainStyledAttributes.getInt(C4015c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2035h = obtainStyledAttributes.getInt(C4015c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f2029b = obtainStyledAttributes.hasValue(C4015c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f2029b) {
                this.f2028a = CoordinatorLayout.m2364a(context, attributeSet, obtainStyledAttributes.getString(C4015c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0443c cVar = this.f2028a;
            if (cVar != null) {
                cVar.mo2516a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2552a(int i) {
            if (i == 0) {
                return this.f2041n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2042o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2550a(boolean z) {
            this.f2043p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2553a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.f2039l && !m2439a(view2, C4187x.m14399n(coordinatorLayout))) {
                C0443c cVar = this.f2028a;
                if (cVar == null || !cVar.mo2531a(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo2546a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2033f == -1) {
                this.f2039l = null;
                this.f2038k = null;
                return null;
            }
            if (this.f2038k == null || !m2440b(view, coordinatorLayout)) {
                m2438a(view, coordinatorLayout);
            }
            return this.f2038k;
        }

        /* renamed from: a */
        private void m2438a(View view, CoordinatorLayout coordinatorLayout) {
            this.f2038k = coordinatorLayout.findViewById(this.f2033f);
            View view2 = this.f2038k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f2039l = null;
                            this.f2038k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2039l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f2039l = null;
                    this.f2038k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f2039l = null;
                this.f2038k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f2033f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        public C0446f(C0446f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        private boolean m2439a(View view, int i) {
            int a = C4139e.m14173a(((C0446f) view.getLayoutParams()).f2034g, i);
            return a != 0 && (C4139e.m14173a(this.f2035h, i) & a) == a;
        }

        public C0446f(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0446f(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0447g implements OnPreDrawListener {
        C0447g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2467a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0448h extends C4204a {
        public static final Creator<C0448h> CREATOR = new C0449a();

        /* renamed from: V */
        SparseArray<Parcelable> f2046V;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0449a implements ClassLoaderCreator<C0448h> {
            C0449a() {
            }

            public C0448h[] newArray(int i) {
                return new C0448h[i];
            }

            public C0448h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0448h(parcel, classLoader);
            }

            public C0448h createFromParcel(Parcel parcel) {
                return new C0448h(parcel, null);
            }
        }

        public C0448h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2046V = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2046V.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2046V;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2046V.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f2046V.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C0448h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0450i implements Comparator<View> {
        C0450i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C4187x.m14409x(view);
            float x2 = C4187x.m14409x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f2002p0 = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f2005s0 = new C0450i();
        } else {
            f2005s0 = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m2363a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m2365a(Rect rect) {
        rect.setEmpty();
        f2006t0.mo14667a(rect);
    }

    /* renamed from: b */
    private int m2373b(int i) {
        int[] iArr = this.f2015e0;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e(str, sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e(str, sb2.toString());
            return 0;
        }
    }

    /* renamed from: c */
    private static int m2376c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m2377d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m2378d() {
        Rect rect = (Rect) f2006t0.mo14666a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: e */
    private static int m2380e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m2381e() {
        this.f2012c.clear();
        this.f2007U.mo2569a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0446f d = mo2483d(childAt);
            d.mo2546a(this, childAt);
            this.f2007U.mo2570a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo2553a(this, childAt, childAt2)) {
                        if (!this.f2007U.mo2573b(childAt2)) {
                            this.f2007U.mo2570a(childAt2);
                        }
                        this.f2007U.mo2571a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2012c.addAll(this.f2007U.mo2572b());
        Collections.reverse(this.f2012c);
    }

    /* renamed from: f */
    private void m2385f(View view, int i) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        int i2 = fVar.f2037j;
        if (i2 != i) {
            C4187x.m14386e(view, i - i2);
            fVar.f2037j = i;
        }
    }

    /* renamed from: c */
    public void mo2480c(View view, int i) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        if (!fVar.mo2551a()) {
            View view2 = fVar.f2038k;
            if (view2 != null) {
                m2368a(view, view2, i);
                return;
            }
            int i2 = fVar.f2032e;
            if (i2 >= 0) {
                m2375b(view, i2, i);
            } else {
                m2379d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0446f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        C0443c cVar = fVar.f2028a;
        if (cVar != null) {
            float c = cVar.mo2539c(this, view);
            if (c > 0.0f) {
                if (this.f2011b0 == null) {
                    this.f2011b0 = new Paint();
                }
                this.f2011b0.setColor(fVar.f2028a.mo2534b(this, view));
                this.f2011b0.setAlpha(m2363a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2011b0);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2022l0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m2381e();
        return Collections.unmodifiableList(this.f2012c);
    }

    public final C4147h0 getLastWindowInsets() {
        return this.f2020j0;
    }

    public int getNestedScrollAxes() {
        return this.f2025o0.mo14822a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2022l0;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2371a(false);
        if (this.f2019i0) {
            if (this.f2018h0 == null) {
                this.f2018h0 = new C0447g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2018h0);
        }
        if (this.f2020j0 == null && C4187x.m14396k(this)) {
            C4187x.m14345J(this);
        }
        this.f2014d0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2371a(false);
        if (this.f2019i0 && this.f2018h0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2018h0);
        }
        View view = this.f2017g0;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2014d0 = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2021k0 && this.f2022l0 != null) {
            C4147h0 h0Var = this.f2020j0;
            int e = h0Var != null ? h0Var.mo14724e() : 0;
            if (e > 0) {
                this.f2022l0.setBounds(0, 0, getWidth(), e);
                this.f2022l0.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2371a(true);
        }
        boolean a = m2372a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2371a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int n = C4187x.m14399n(this);
        int size = this.f2012c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f2012c.get(i5);
            if (view.getVisibility() != 8) {
                C0443c d = ((C0446f) view.getLayoutParams()).mo2558d();
                if (d == null || !d.mo2526a(this, view, n)) {
                    mo2480c(view, n);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.mo2527a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2381e()
            r30.mo2475b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p096e.p121h.p135s.C4187x.m14399n(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            e.h.s.h0 r3 = r7.f2020j0
            if (r3 == 0) goto L_0x004b
            boolean r3 = p096e.p121h.p135s.C4187x.m14396k(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2012c
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f2012c
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f) r1
            int r0 = r1.f2032e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m2373b(r0)
            int r11 = r1.f2030c
            int r11 = m2380e(r11)
            int r11 = p096e.p121h.p135s.C4139e.m14173a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = 0
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = p096e.p121h.p135s.C4187x.m14396k(r20)
            if (r0 != 0) goto L_0x00ef
            e.h.s.h0 r0 = r7.f2020j0
            int r0 = r0.mo14722c()
            e.h.s.h0 r2 = r7.f2020j0
            int r2 = r2.mo14723d()
            int r0 = r0 + r2
            e.h.s.h0 r2 = r7.f2020j0
            int r2 = r2.mo14724e()
            e.h.s.h0 r11 = r7.f2020j0
            int r11 = r11.mo14721b()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2558d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2527a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2469a(r1, r2, r3, r4, r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0446f fVar = (C0446f) childAt.getLayoutParams();
                if (fVar.mo2552a(0)) {
                    C0443c d = fVar.mo2558d();
                    if (d != null) {
                        z2 |= d.mo2533a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo2467a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0446f fVar = (C0446f) childAt.getLayoutParams();
                if (fVar.mo2552a(0)) {
                    C0443c d = fVar.mo2558d();
                    if (d != null) {
                        z |= d.mo2532a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1080a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1078a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1084b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0448h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0448h hVar = (C0448h) parcelable;
        super.onRestoreInstanceState(hVar.mo14857X());
        SparseArray<Parcelable> sparseArray = hVar.f2046V;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0443c d = mo2483d(childAt).mo2558d();
            if (!(id == -1 || d == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    d.mo2517a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0448h hVar = new C0448h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0443c d = ((C0446f) childAt.getLayoutParams()).mo2558d();
            if (!(id == -1 || d == null)) {
                Parcelable d2 = d.mo2541d(this, childAt);
                if (d2 != null) {
                    sparseArray.append(id, d2);
                }
            }
        }
        hVar.f2046V = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1082a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1077a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2016f0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2372a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2016f0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2558d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2016f0
            boolean r6 = r6.mo2535b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2016f0
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2371a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0443c d = ((C0446f) view.getLayoutParams()).mo2558d();
        if (d == null || !d.mo2529a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2013c0) {
            m2371a(false);
            this.f2013c0 = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2384f();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2023m0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2022l0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2022l0 = drawable3;
            Drawable drawable4 = this.f2022l0;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f2022l0.setState(getDrawableState());
                }
                C0492a.m2643a(this.f2022l0, C4187x.m14399n(this));
                this.f2022l0.setVisible(getVisibility() == 0, false);
                this.f2022l0.setCallback(this);
            }
            C4187x.m14344I(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C4025a.m13798c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2022l0;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2022l0.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2022l0;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4013a.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public C0446f generateDefaultLayoutParams() {
        return new C0446f(-2, -2);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f2012c = new ArrayList();
        this.f2007U = new C0451a<>();
        this.f2008V = new ArrayList();
        this.f2009W = new ArrayList();
        this.f2010a0 = new int[2];
        this.f2025o0 = new C4181r(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C4015c.CoordinatorLayout, 0, C4014b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C4015c.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(C4015c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2015e0 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2015e0.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2015e0;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f2022l0 = typedArray.getDrawable(C4015c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m2384f();
        super.setOnHierarchyChangeListener(new C0445e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4147h0 mo2465a(C4147h0 h0Var) {
        if (C4111c.m14086a(this.f2020j0, h0Var)) {
            return h0Var;
        }
        this.f2020j0 = h0Var;
        boolean z = true;
        this.f2021k0 = h0Var != null && h0Var.mo14724e() > 0;
        if (this.f2021k0 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C4147h0 b = m2374b(h0Var);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0446f mo2483d(View view) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        if (!fVar.f2029b) {
            String str = "CoordinatorLayout";
            if (view instanceof C0442b) {
                C0443c behavior = ((C0442b) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                fVar.mo2549a(behavior);
                fVar.f2029b = true;
            } else {
                C0444d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0444d) cls.getAnnotation(C0444d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2549a((C0443c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(dVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e(str, sb.toString(), e);
                    }
                }
                fVar.f2029b = true;
            }
        }
        return fVar;
    }

    public C0446f generateLayoutParams(AttributeSet attributeSet) {
        return new C0446f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0446f generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0446f) {
            return new C0446f((C0446f) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0446f((MarginLayoutParams) layoutParams);
        }
        return new C0446f(layoutParams);
    }

    /* renamed from: f */
    private void m2384f() {
        if (VERSION.SDK_INT >= 21) {
            if (C4187x.m14396k(this)) {
                if (this.f2024n0 == null) {
                    this.f2024n0 = new C0441a();
                }
                C4187x.m14361a((View) this, this.f2024n0);
                setSystemUiVisibility(1280);
            } else {
                C4187x.m14361a((View) this, (C4182s) null);
            }
        }
    }

    /* renamed from: b */
    private C4147h0 m2374b(C4147h0 h0Var) {
        if (h0Var.mo14726f()) {
            return h0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C4187x.m14396k(childAt)) {
                C0443c d = ((C0446f) childAt.getLayoutParams()).mo2558d();
                if (d != null) {
                    h0Var = d.mo2514a(this, childAt, h0Var);
                    if (h0Var.mo14726f()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return h0Var;
    }

    /* renamed from: a */
    private void m2371a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0443c d = ((C0446f) childAt.getLayoutParams()).mo2558d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo2530a(this, childAt, obtain);
                } else {
                    d.mo2535b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0446f) getChildAt(i2).getLayoutParams()).mo2562h();
        }
        this.f2016f0 = null;
        this.f2013c0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2481c(View view, Rect rect) {
        ((C0446f) view.getLayoutParams()).mo2548a(rect);
    }

    /* renamed from: c */
    public List<View> mo2478c(View view) {
        List c = this.f2007U.mo2574c(view);
        this.f2009W.clear();
        if (c != null) {
            this.f2009W.addAll(c);
        }
        return this.f2009W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2477b(View view, Rect rect) {
        rect.set(((C0446f) view.getLayoutParams()).mo2560f());
    }

    /* renamed from: e */
    private void m2382e(View view, int i) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        int i2 = fVar.f2036i;
        if (i2 != i) {
            C4187x.m14383d(view, i - i2);
            fVar.f2036i = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2479c() {
        if (this.f2014d0 && this.f2018h0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2018h0);
        }
        this.f2019i0 = false;
    }

    /* renamed from: b */
    private void m2375b(View view, int i, int i2) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        int a = C4139e.m14173a(m2380e(fVar.f2030c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m2373b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: d */
    private void m2379d(View view, int i) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        Rect d = m2378d();
        d.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f2020j0 != null && C4187x.m14396k(this) && !C4187x.m14396k(view)) {
            d.left += this.f2020j0.mo14722c();
            d.top += this.f2020j0.mo14724e();
            d.right -= this.f2020j0.mo14723d();
            d.bottom -= this.f2020j0.mo14721b();
        }
        Rect d2 = m2378d();
        C4139e.m14174a(m2377d(fVar.f2030c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m2365a(d);
        m2365a(d2);
    }

    /* renamed from: e */
    private boolean m2383e(View view) {
        return this.f2007U.mo2576e(view);
    }

    /* renamed from: a */
    private void m2370a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator<View> comparator = f2005s0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private boolean m2372a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2008V;
        m2370a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0446f fVar = (C0446f) view.getLayoutParams();
            C0443c d = fVar.mo2558d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo2530a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo2535b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f2016f0 = view;
                    }
                }
                boolean b = fVar.mo2555b();
                boolean b2 = fVar.mo2556b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo2530a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo2535b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    public List<View> mo2474b(View view) {
        List d = this.f2007U.mo2575d(view);
        this.f2009W.clear();
        if (d != null) {
            this.f2009W.addAll(d);
        }
        return this.f2009W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2475b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2383e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2019i0) {
            return;
        }
        if (z) {
            mo2466a();
        } else {
            mo2479c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2476b(View view, int i) {
        View view2 = view;
        C0446f fVar = (C0446f) view.getLayoutParams();
        if (fVar.f2038k != null) {
            Rect d = m2378d();
            Rect d2 = m2378d();
            Rect d3 = m2378d();
            mo2471a(fVar.f2038k, d);
            boolean z = false;
            mo2472a(view2, false, d2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2366a(view, i, d, d3, fVar, measuredWidth, measuredHeight);
            if (!(d3.left == d2.left && d3.top == d2.top)) {
                z = true;
            }
            m2369a(fVar, d3, measuredWidth, i2);
            int i3 = d3.left - d2.left;
            int i4 = d3.top - d2.top;
            if (i3 != 0) {
                C4187x.m14383d(view2, i3);
            }
            if (i4 != 0) {
                C4187x.m14386e(view2, i4);
            }
            if (z) {
                C0443c d4 = fVar.mo2558d();
                if (d4 != null) {
                    d4.mo2536b(this, view2, fVar.f2038k);
                }
            }
            m2365a(d);
            m2365a(d2);
            m2365a(d3);
        }
    }

    /* renamed from: a */
    static C0443c m2364a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2002p0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f2002p0);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f2004r0.get();
            if (map == null) {
                map = new HashMap();
                f2004r0.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f2003q0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0443c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2471a(View view, Rect rect) {
        C0452b.m2470a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo2469a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2472a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo2471a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b */
    public void mo1084b(View view, View view2, int i, int i2) {
        this.f2025o0.mo14826a(view, view2, i, i2);
        this.f2017g0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0446f fVar = (C0446f) childAt.getLayoutParams();
            if (fVar.mo2552a(i2)) {
                C0443c d = fVar.mo2558d();
                if (d != null) {
                    d.mo2524a(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2366a(View view, int i, Rect rect, Rect rect2, C0446f fVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C4139e.m14173a(m2376c(fVar.f2030c), i);
        int a2 = C4139e.m14173a(m2377d(fVar.f2031d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m2369a(C0446f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2470a(View view, int i, Rect rect, Rect rect2) {
        C0446f fVar = (C0446f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2366a(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m2369a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m2368a(View view, View view2, int i) {
        Rect d = m2378d();
        Rect d2 = m2378d();
        try {
            mo2471a(view2, d);
            mo2470a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m2365a(d);
            m2365a(d2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2467a(int i) {
        boolean z;
        int i2 = i;
        int n = C4187x.m14399n(this);
        int size = this.f2012c.size();
        Rect d = m2378d();
        Rect d2 = m2378d();
        Rect d3 = m2378d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f2012c.get(i3);
            C0446f fVar = (C0446f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f2039l == ((View) this.f2012c.get(i4))) {
                        mo2476b(view, n);
                    }
                }
                mo2472a(view, true, d2);
                if (fVar.f2034g != 0 && !d2.isEmpty()) {
                    int a = C4139e.m14173a(fVar.f2034g, n);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i5 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i6 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (fVar.f2035h != 0 && view.getVisibility() == 0) {
                    m2367a(view, d, n);
                }
                if (i2 != 2) {
                    mo2477b(view, d3);
                    if (!d3.equals(d2)) {
                        mo2481c(view, d2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f2012c.get(i7);
                    C0446f fVar2 = (C0446f) view2.getLayoutParams();
                    C0443c d4 = fVar2.mo2558d();
                    if (d4 != null && d4.mo2531a(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2559e()) {
                            if (i2 != 2) {
                                z = d4.mo2536b(this, view2, view);
                            } else {
                                d4.mo2540c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2550a(z);
                            }
                        } else {
                            fVar2.mo2561g();
                        }
                    }
                }
            }
        }
        m2365a(d);
        m2365a(d2);
        m2365a(d3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2367a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = p096e.p121h.p135s.C4187x.m14340E(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fc
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fc
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.mo2558d()
            android.graphics.Rect r2 = m2378d()
            android.graphics.Rect r3 = m2378d()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo2528a(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m2365a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m2365a(r2)
            return
        L_0x0080:
            int r1 = r0.f2035h
            int r11 = p096e.p121h.p135s.C4139e.m14173a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f2037j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m2385f(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f2037j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m2385f(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m2385f(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f2036i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m2382e(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f2036i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m2382e(r9, r11)
            r1 = 1
        L_0x00f4:
            if (r1 != 0) goto L_0x00f9
            r8.m2382e(r9, r5)
        L_0x00f9:
            m2365a(r2)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m2367a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    public void mo2468a(View view) {
        List c = this.f2007U.mo2574c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0443c d = ((C0446f) view2.getLayoutParams()).mo2558d();
                if (d != null) {
                    d.mo2536b(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2466a() {
        if (this.f2014d0) {
            if (this.f2018h0 == null) {
                this.f2018h0 = new C0447g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2018h0);
        }
        this.f2019i0 = true;
    }

    /* renamed from: a */
    public boolean mo2473a(View view, int i, int i2) {
        Rect d = m2378d();
        mo2471a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m2365a(d);
        }
    }

    /* renamed from: a */
    public boolean mo1082a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0446f fVar = (C0446f) childAt.getLayoutParams();
                C0443c d = fVar.mo2558d();
                if (d != null) {
                    boolean b = d.mo2538b(this, childAt, view, view2, i, i2);
                    boolean z2 = z | b;
                    fVar.mo2547a(i3, b);
                    z = z2;
                } else {
                    fVar.mo2547a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo1077a(View view, int i) {
        this.f2025o0.mo14824a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0446f fVar = (C0446f) childAt.getLayoutParams();
            if (fVar.mo2552a(i)) {
                C0443c d = fVar.mo2558d();
                if (d != null) {
                    d.mo2518a(this, childAt, view, i);
                }
                fVar.mo2554b(i);
                fVar.mo2561g();
            }
        }
        this.f2017g0 = null;
    }

    /* renamed from: a */
    public void mo1078a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0446f fVar = (C0446f) childAt.getLayoutParams();
                if (fVar.mo2552a(i5)) {
                    C0443c d = fVar.mo2558d();
                    if (d != null) {
                        d.mo2520a(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            mo2467a(1);
        }
    }

    /* renamed from: a */
    public void mo1080a(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0446f fVar = (C0446f) childAt.getLayoutParams();
                if (fVar.mo2552a(i3)) {
                    C0443c d = fVar.mo2558d();
                    if (d != null) {
                        int[] iArr2 = this.f2010a0;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        d.mo2522a(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f2010a0;
                        if (i > 0) {
                            i4 = Math.max(i6, iArr3[0]);
                        } else {
                            i4 = Math.min(i6, iArr3[0]);
                        }
                        int[] iArr4 = this.f2010a0;
                        if (i2 > 0) {
                            i5 = Math.max(i7, iArr4[1]);
                        } else {
                            i5 = Math.min(i7, iArr4[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2467a(1);
        }
    }
}
