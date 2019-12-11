package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4182s;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p140j.p141a.C4204a;

public class ViewPager extends ViewGroup {

    /* renamed from: Y0 */
    static final int[] f3912Y0 = {16842931};

    /* renamed from: Z0 */
    private static final Comparator<C0998f> f3913Z0 = new C0993a();

    /* renamed from: a1 */
    private static final Interpolator f3914a1 = new C0994b();

    /* renamed from: b1 */
    private static final C1007n f3915b1 = new C1007n();

    /* renamed from: A0 */
    private float f3916A0;

    /* renamed from: B0 */
    private float f3917B0;

    /* renamed from: C0 */
    private int f3918C0 = -1;

    /* renamed from: D0 */
    private VelocityTracker f3919D0;

    /* renamed from: E0 */
    private int f3920E0;

    /* renamed from: F0 */
    private int f3921F0;

    /* renamed from: G0 */
    private int f3922G0;

    /* renamed from: H0 */
    private int f3923H0;

    /* renamed from: I0 */
    private boolean f3924I0;

    /* renamed from: J0 */
    private EdgeEffect f3925J0;

    /* renamed from: K0 */
    private EdgeEffect f3926K0;

    /* renamed from: L0 */
    private boolean f3927L0 = true;

    /* renamed from: M0 */
    private boolean f3928M0;

    /* renamed from: N0 */
    private int f3929N0;

    /* renamed from: O0 */
    private List<C1002j> f3930O0;

    /* renamed from: P0 */
    private C1002j f3931P0;

    /* renamed from: Q0 */
    private C1002j f3932Q0;

    /* renamed from: R0 */
    private List<C1001i> f3933R0;

    /* renamed from: S0 */
    private C1003k f3934S0;

    /* renamed from: T0 */
    private int f3935T0;

    /* renamed from: U */
    private final ArrayList<C0998f> f3936U = new ArrayList<>();

    /* renamed from: U0 */
    private int f3937U0;

    /* renamed from: V */
    private final C0998f f3938V = new C0998f();

    /* renamed from: V0 */
    private ArrayList<View> f3939V0;

    /* renamed from: W */
    private final Rect f3940W = new Rect();

    /* renamed from: W0 */
    private final Runnable f3941W0 = new C0995c();

    /* renamed from: X0 */
    private int f3942X0 = 0;

    /* renamed from: a0 */
    C1008a f3943a0;

    /* renamed from: b0 */
    int f3944b0;

    /* renamed from: c */
    private int f3945c;

    /* renamed from: c0 */
    private int f3946c0 = -1;

    /* renamed from: d0 */
    private Parcelable f3947d0 = null;

    /* renamed from: e0 */
    private ClassLoader f3948e0 = null;

    /* renamed from: f0 */
    private Scroller f3949f0;

    /* renamed from: g0 */
    private boolean f3950g0;

    /* renamed from: h0 */
    private C1004l f3951h0;

    /* renamed from: i0 */
    private int f3952i0;

    /* renamed from: j0 */
    private Drawable f3953j0;

    /* renamed from: k0 */
    private int f3954k0;

    /* renamed from: l0 */
    private int f3955l0;

    /* renamed from: m0 */
    private float f3956m0 = -3.4028235E38f;

    /* renamed from: n0 */
    private float f3957n0 = Float.MAX_VALUE;

    /* renamed from: o0 */
    private int f3958o0;

    /* renamed from: p0 */
    private boolean f3959p0;

    /* renamed from: q0 */
    private boolean f3960q0;

    /* renamed from: r0 */
    private boolean f3961r0;

    /* renamed from: s0 */
    private int f3962s0 = 1;

    /* renamed from: t0 */
    private boolean f3963t0;

    /* renamed from: u0 */
    private boolean f3964u0;

    /* renamed from: v0 */
    private int f3965v0;

    /* renamed from: w0 */
    private int f3966w0;

    /* renamed from: x0 */
    private int f3967x0;

    /* renamed from: y0 */
    private float f3968y0;

    /* renamed from: z0 */
    private float f3969z0;

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0993a implements Comparator<C0998f> {
        C0993a() {
        }

        /* renamed from: a */
        public int compare(C0998f fVar, C0998f fVar2) {
            return fVar.f3974b - fVar2.f3974b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C0994b implements Interpolator {
        C0994b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C0995c implements Runnable {
        C0995c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo5518e();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0996d implements C4182s {

        /* renamed from: a */
        private final Rect f3971a = new Rect();

        C0996d() {
        }

        public C4147h0 onApplyWindowInsets(View view, C4147h0 h0Var) {
            C4147h0 b = C4187x.m14371b(view, h0Var);
            if (b.mo14726f()) {
                return b;
            }
            Rect rect = this.f3971a;
            rect.left = b.mo14722c();
            rect.top = b.mo14724e();
            rect.right = b.mo14723d();
            rect.bottom = b.mo14721b();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C4147h0 a = C4187x.m14349a(ViewPager.this.getChildAt(i), b);
                rect.left = Math.min(a.mo14722c(), rect.left);
                rect.top = Math.min(a.mo14724e(), rect.top);
                rect.right = Math.min(a.mo14723d(), rect.right);
                rect.bottom = Math.min(a.mo14721b(), rect.bottom);
            }
            return b.mo14720a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C0997e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0998f {

        /* renamed from: a */
        Object f3973a;

        /* renamed from: b */
        int f3974b;

        /* renamed from: c */
        boolean f3975c;

        /* renamed from: d */
        float f3976d;

        /* renamed from: e */
        float f3977e;

        C0998f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0999g extends LayoutParams {

        /* renamed from: a */
        public boolean f3978a;

        /* renamed from: b */
        public int f3979b;

        /* renamed from: c */
        float f3980c = 0.0f;

        /* renamed from: d */
        boolean f3981d;

        /* renamed from: e */
        int f3982e;

        /* renamed from: f */
        int f3983f;

        public C0999g() {
            super(-1, -1);
        }

        public C0999g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3912Y0);
            this.f3979b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    class C1000h extends C4119a {
        C1000h() {
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            dVar.mo14739a((CharSequence) ViewPager.class.getName());
            dVar.mo14774j(m5414b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.mo14734a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo14734a((int) ContentServiceClientExtras.URL_SIZE_LIMIT);
            }
        }

        /* renamed from: b */
        public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2818b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m5414b());
            if (accessibilityEvent.getEventType() == 4096) {
                C1008a aVar = ViewPager.this.f3943a0;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.mo5565a());
                    accessibilityEvent.setFromIndex(ViewPager.this.f3944b0);
                    accessibilityEvent.setToIndex(ViewPager.this.f3944b0);
                }
            }
        }

        /* renamed from: b */
        private boolean m5414b() {
            C1008a aVar = ViewPager.this.f3943a0;
            return aVar != null && aVar.mo5565a() > 1;
        }

        /* renamed from: a */
        public boolean mo2817a(View view, int i, Bundle bundle) {
            if (super.mo2817a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3944b0 - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f3944b0 + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C1001i {
        /* renamed from: a */
        void mo5552a(ViewPager viewPager, C1008a aVar, C1008a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C1002j {
        /* renamed from: a */
        void mo5553a(int i);

        /* renamed from: a */
        void mo5554a(int i, float f, int i2);

        /* renamed from: b */
        void mo5555b(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface C1003k {
        /* renamed from: a */
        void mo5556a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    private class C1004l extends DataSetObserver {
        C1004l() {
        }

        public void onChanged() {
            ViewPager.this.mo5489a();
        }

        public void onInvalidated() {
            ViewPager.this.mo5489a();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C1005m extends C4204a {
        public static final Creator<C1005m> CREATOR = new C1006a();

        /* renamed from: V */
        int f3986V;

        /* renamed from: W */
        Parcelable f3987W;

        /* renamed from: X */
        ClassLoader f3988X;

        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        static class C1006a implements ClassLoaderCreator<C1005m> {
            C1006a() {
            }

            public C1005m[] newArray(int i) {
                return new C1005m[i];
            }

            public C1005m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1005m(parcel, classLoader);
            }

            public C1005m createFromParcel(Parcel parcel) {
                return new C1005m(parcel, null);
            }
        }

        public C1005m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f3986V);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3986V);
            parcel.writeParcelable(this.f3987W, i);
        }

        C1005m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C1005m.class.getClassLoader();
            }
            this.f3986V = parcel.readInt();
            this.f3987W = parcel.readParcelable(classLoader);
            this.f3988X = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    static class C1007n implements Comparator<View> {
        C1007n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0999g gVar = (C0999g) view.getLayoutParams();
            C0999g gVar2 = (C0999g) view2.getLayoutParams();
            boolean z = gVar.f3978a;
            if (z == gVar2.f3978a) {
                return gVar.f3982e - gVar2.f3982e;
            }
            return z ? 1 : -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo5505b();
    }

    /* renamed from: d */
    private void m5382d(int i) {
        C1002j jVar = this.f3931P0;
        if (jVar != null) {
            jVar.mo5555b(i);
        }
        List<C1002j> list = this.f3930O0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1002j jVar2 = (C1002j) this.f3930O0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo5555b(i);
                }
            }
        }
        C1002j jVar3 = this.f3932Q0;
        if (jVar3 != null) {
            jVar3.mo5555b(i);
        }
    }

    /* renamed from: f */
    private boolean m5385f(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f3936U.size() != 0) {
            C0998f g = m5386g();
            int clientWidth = getClientWidth();
            int i2 = this.f3952i0;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = g.f3974b;
            float f3 = ((((float) i) / f) - g.f3977e) / (g.f3976d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f3928M0 = false;
            mo5490a(i4, f3, i5);
            if (this.f3928M0) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.f3927L0) {
            return false;
        } else {
            this.f3928M0 = false;
            mo5490a(0, 0.0f, 0);
            if (this.f3928M0) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    private C0998f m5386g() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f3952i0) / ((float) clientWidth) : 0.0f;
        C0998f fVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f3936U.size()) {
            C0998f fVar2 = (C0998f) this.f3936U.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (fVar2.f3974b != i3) {
                    fVar2 = this.f3938V;
                    fVar2.f3977e = f2 + f3 + f;
                    fVar2.f3974b = i3;
                    fVar2.f3976d = this.f3943a0.mo5569b(fVar2.f3974b);
                    i--;
                }
            }
            f2 = fVar2.f3977e;
            float f4 = fVar2.f3976d + f2 + f;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f4 || i == this.f3936U.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f3974b;
            f3 = fVar2.f3976d;
            i++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m5387h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0999g) getChildAt(i).getLayoutParams()).f3978a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: i */
    private boolean m5388i() {
        this.f3918C0 = -1;
        m5384f();
        this.f3925J0.onRelease();
        this.f3926K0.onRelease();
        return this.f3925J0.isFinished() || this.f3926K0.isFinished();
    }

    /* renamed from: j */
    private void m5389j() {
        if (this.f3937U0 != 0) {
            ArrayList<View> arrayList = this.f3939V0;
            if (arrayList == null) {
                this.f3939V0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3939V0.add(getChildAt(i));
            }
            Collections.sort(this.f3939V0, f3915b1);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3960q0 != z) {
            this.f3960q0 = z;
        }
    }

    /* renamed from: a */
    public void mo5495a(C1001i iVar) {
        if (this.f3933R0 == null) {
            this.f3933R0 = new ArrayList();
        }
        this.f3933R0.add(iVar);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0998f b = mo5504b(childAt);
                    if (b != null && b.f3974b == this.f3944b0) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0998f b = mo5504b(childAt);
                if (b != null && b.f3974b == this.f3944b0) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0999g gVar = (C0999g) layoutParams;
        gVar.f3978a |= m5381c(view);
        if (!this.f3959p0) {
            super.addView(view, i, layoutParams);
        } else if (gVar == null || !gVar.f3978a) {
            gVar.f3981d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5505b() {
        setWillNotDraw(false);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        setFocusable(true);
        Context context = getContext();
        this.f3949f0 = new Scroller(context, f3914a1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3967x0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f3920E0 = (int) (400.0f * f);
        this.f3921F0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3925J0 = new EdgeEffect(context);
        this.f3926K0 = new EdgeEffect(context);
        this.f3922G0 = (int) (25.0f * f);
        this.f3923H0 = (int) (2.0f * f);
        this.f3965v0 = (int) (f * 16.0f);
        C4187x.m14359a((View) this, (C4119a) new C1000h());
        if (C4187x.m14397l(this) == 0) {
            C4187x.m14390g(this, 1);
        }
        C4187x.m14361a((View) this, (C4182s) new C0996d());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5508c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3944b0
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo5503b(r2)
            r0.f3944b0 = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f3943a0
            if (r1 != 0) goto L_0x0018
            r17.m5389j()
            return
        L_0x0018:
            boolean r1 = r0.f3961r0
            if (r1 == 0) goto L_0x0020
            r17.m5389j()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f3943a0
            r1.mo3300b(r0)
            int r1 = r0.f3962s0
            int r4 = r0.f3944b0
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f3943a0
            int r6 = r6.mo5565a()
            int r7 = r6 + -1
            int r8 = r0.f3944b0
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f3945c
            if (r6 != r7) goto L_0x0211
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3936U
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f3936U
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C0998f) r8
            int r9 = r8.f3974b
            int r10 = r0.f3944b0
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f3944b0
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo5487a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019e
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f3936U
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C0998f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r3 = 0
            goto L_0x0099
        L_0x008c:
            float r14 = r8.f3976d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0099:
            int r14 = r0.f3944b0
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a0:
            if (r14 < 0) goto L_0x0100
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r14 >= r4) goto L_0x00ce
            if (r11 != 0) goto L_0x00ab
            goto L_0x0100
        L_0x00ab:
            int r5 = r11.f3974b
            if (r14 != r5) goto L_0x00fc
            boolean r5 = r11.f3975c
            if (r5 != 0) goto L_0x00fc
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            r5.remove(r15)
            androidx.viewpager.widget.a r5 = r0.f3943a0
            java.lang.Object r11 = r11.f3973a
            r5.mo3297a(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x00fb
        L_0x00ce:
            if (r11 == 0) goto L_0x00e4
            int r5 = r11.f3974b
            if (r14 != r5) goto L_0x00e4
            float r5 = r11.f3976d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x00fb
        L_0x00e4:
            int r5 = r15 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo5487a(r14, r5)
            float r5 = r5.f3976d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r11 = r5
        L_0x00fc:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a0
        L_0x0100:
            float r3 = r8.f3976d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0192
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0119
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            if (r12 > 0) goto L_0x011e
            r7 = 0
            goto L_0x0126
        L_0x011e:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0126:
            int r11 = r0.f3944b0
        L_0x0128:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0192
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x015c
            if (r11 <= r1) goto L_0x015c
            if (r5 != 0) goto L_0x0135
            goto L_0x0192
        L_0x0135:
            int r12 = r5.f3974b
            if (r11 != r12) goto L_0x0191
            boolean r12 = r5.f3975c
            if (r12 != 0) goto L_0x0191
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f3936U
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f3943a0
            java.lang.Object r5 = r5.f3973a
            r12.mo3297a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x0191
        L_0x015a:
            r5 = 0
            goto L_0x0191
        L_0x015c:
            if (r5 == 0) goto L_0x0178
            int r12 = r5.f3974b
            if (r11 != r12) goto L_0x0178
            float r5 = r5.f3976d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
            goto L_0x0191
        L_0x0178:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo5487a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3976d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f3936U
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0998f) r5
        L_0x0191:
            goto L_0x0128
        L_0x0192:
            r0.m5374a(r8, r10, r2)
            androidx.viewpager.widget.a r1 = r0.f3943a0
            int r2 = r0.f3944b0
            java.lang.Object r3 = r8.f3973a
            r1.mo3301b(r0, r2, r3)
        L_0x019e:
            androidx.viewpager.widget.a r1 = r0.f3943a0
            r1.mo3296a(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a8:
            if (r2 >= r1) goto L_0x01d1
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.C0999g) r4
            r4.f3983f = r2
            boolean r5 = r4.f3978a
            if (r5 != 0) goto L_0x01ce
            float r5 = r4.f3980c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ce
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo5504b(r3)
            if (r3 == 0) goto L_0x01ce
            float r5 = r3.f3976d
            r4.f3980c = r5
            int r3 = r3.f3974b
            r4.f3982e = r3
        L_0x01ce:
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01d1:
            r17.m5389j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0210
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e5
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo5488a(r1)
            goto L_0x01e6
        L_0x01e5:
            r3 = 0
        L_0x01e6:
            if (r3 == 0) goto L_0x01ee
            int r1 = r3.f3974b
            int r2 = r0.f3944b0
            if (r1 == r2) goto L_0x0210
        L_0x01ee:
            r1 = 0
        L_0x01ef:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0210
            android.view.View r2 = r0.getChildAt(r1)
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo5504b(r2)
            if (r3 == 0) goto L_0x020d
            int r3 = r3.f3974b
            int r4 = r0.f3944b0
            if (r3 != r4) goto L_0x020d
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x020d
            goto L_0x0210
        L_0x020d:
            int r1 = r1 + 1
            goto L_0x01ef
        L_0x0210:
            return
        L_0x0211:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021e }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021e }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021e }
            goto L_0x0226
        L_0x021e:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0226:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f3945c
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f3943a0
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo5508c(int):void");
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f3943a0 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3956m0))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f3957n0))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0999g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3950g0 = true;
        if (this.f3949f0.isFinished() || !this.f3949f0.computeScrollOffset()) {
            m5375a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3949f0.getCurrX();
        int currY = this.f3949f0.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m5385f(currX)) {
                this.f3949f0.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C4187x.m14344I(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo5498a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0998f b = mo5504b(childAt);
                if (b != null && b.f3974b == this.f3944b0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.mo5565a() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            androidx.viewpager.widget.a r0 = r7.f3943a0
            if (r0 == 0) goto L_0x0018
            int r0 = r0.mo5565a()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.f3925J0
            r8.finish()
            android.widget.EdgeEffect r8 = r7.f3926K0
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.f3925J0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.f3956m0
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f3925J0
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.f3925J0
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.f3926K0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f3957n0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f3926K0
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.f3926K0
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            p096e.p121h.p135s.C4187x.m14344I(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3953j0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5518e() {
        mo5508c(this.f3944b0);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0999g();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1008a getAdapter() {
        return this.f3943a0;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3937U0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0999g) ((View) this.f3939V0.get(i2)).getLayoutParams()).f3983f;
    }

    public int getCurrentItem() {
        return this.f3944b0;
    }

    public int getOffscreenPageLimit() {
        return this.f3962s0;
    }

    public int getPageMargin() {
        return this.f3952i0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3927L0 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3941W0);
        Scroller scroller = this.f3949f0;
        if (scroller != null && !scroller.isFinished()) {
            this.f3949f0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f3952i0 > 0 && this.f3953j0 != null && this.f3936U.size() > 0 && this.f3943a0 != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f3952i0) / f3;
            int i = 0;
            C0998f fVar = (C0998f) this.f3936U.get(0);
            float f5 = fVar.f3977e;
            int size = this.f3936U.size();
            int i2 = fVar.f3974b;
            int i3 = ((C0998f) this.f3936U.get(size - 1)).f3974b;
            while (i2 < i3) {
                while (i2 > fVar.f3974b && i < size) {
                    i++;
                    fVar = (C0998f) this.f3936U.get(i);
                }
                if (i2 == fVar.f3974b) {
                    float f6 = fVar.f3977e;
                    float f7 = fVar.f3976d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float b = this.f3943a0.mo5569b(i2);
                    f = (f5 + b) * f3;
                    f5 += b + f4;
                }
                if (((float) this.f3952i0) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f3953j0.setBounds(Math.round(f), this.f3954k0, Math.round(((float) this.f3952i0) + f), this.f3955l0);
                    this.f3953j0.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5388i();
            return false;
        }
        if (action != 0) {
            if (this.f3963t0) {
                return true;
            }
            if (this.f3964u0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3916A0 = x;
            this.f3968y0 = x;
            float y = motionEvent.getY();
            this.f3917B0 = y;
            this.f3969z0 = y;
            this.f3918C0 = motionEvent2.getPointerId(0);
            this.f3964u0 = false;
            this.f3950g0 = true;
            this.f3949f0.computeScrollOffset();
            if (this.f3942X0 != 2 || Math.abs(this.f3949f0.getFinalX() - this.f3949f0.getCurrX()) <= this.f3923H0) {
                m5375a(false);
                this.f3963t0 = false;
            } else {
                this.f3949f0.abortAnimation();
                this.f3961r0 = false;
                mo5518e();
                this.f3963t0 = true;
                m5380c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3918C0;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f3968y0;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f3917B0);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m5376a(this.f3968y0, f)) {
                    if (mo5499a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f3968y0 = x2;
                        this.f3969z0 = y2;
                        this.f3964u0 = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f3967x0) && abs * 0.5f > abs2) {
                    this.f3963t0 = true;
                    m5380c(true);
                    setScrollState(1);
                    float f2 = this.f3916A0;
                    float f3 = (float) this.f3967x0;
                    this.f3968y0 = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f3969z0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f3967x0)) {
                    this.f3964u0 = true;
                }
                if (this.f3963t0 && m5379b(x2)) {
                    C4187x.m14344I(this);
                }
            }
        } else if (action == 6) {
            m5373a(motionEvent);
        }
        if (this.f3919D0 == null) {
            this.f3919D0 = VelocityTracker.obtain();
        }
        this.f3919D0.addMovement(motionEvent2);
        return this.f3963t0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0999g gVar = (C0999g) childAt.getLayoutParams();
                if (gVar.f3978a) {
                    int i14 = gVar.f3979b;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i15 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i15 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i16 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i16 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i17 = i5 + scrollX;
                    childAt.layout(i17, i6, childAt.getMeasuredWidth() + i17, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i18 = (i7 - i12) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                C0999g gVar2 = (C0999g) childAt2.getLayoutParams();
                if (!gVar2.f3978a) {
                    C0998f b = mo5504b(childAt2);
                    if (b != null) {
                        float f = (float) i18;
                        int i20 = ((int) (b.f3977e * f)) + i12;
                        if (gVar2.f3981d) {
                            gVar2.f3981d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * gVar2.f3980c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i20, i11, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f3954k0 = i11;
        this.f3955l0 = i8 - i9;
        this.f3929N0 = i10;
        if (this.f3927L0) {
            z2 = false;
            m5372a(this.f3944b0, false, 0, false);
        } else {
            z2 = false;
        }
        this.f3927L0 = z2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f3965v0
            int r15 = java.lang.Math.min(r15, r1)
            r13.f3966w0 = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = r15
            r15 = r14
            r14 = 0
        L_0x0039:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 >= r1) goto L_0x00b4
            android.view.View r6 = r13.getChildAt(r14)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.C0999g) r3
            if (r3 == 0) goto L_0x00b1
            boolean r7 = r3.f3978a
            if (r7 == 0) goto L_0x00b1
            int r7 = r3.f3979b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0067
            r9 = 80
            if (r7 != r9) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r7 = 0
            goto L_0x0068
        L_0x0067:
            r7 = 1
        L_0x0068:
            r9 = 3
            if (r8 == r9) goto L_0x0070
            r9 = 5
            if (r8 != r9) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0077
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007e
        L_0x007c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007e:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x008b
            if (r10 == r11) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r10 = r15
        L_0x0088:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008c
        L_0x008b:
            r10 = r15
        L_0x008c:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0095
            if (r3 == r11) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r3 = r2
            goto L_0x0097
        L_0x0095:
            r3 = r2
            r5 = r9
        L_0x0097:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00aa
            int r3 = r6.getMeasuredHeight()
            int r2 = r2 - r3
            goto L_0x00b1
        L_0x00aa:
            if (r4 == 0) goto L_0x00b1
            int r3 = r6.getMeasuredWidth()
            int r15 = r15 - r3
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00b4:
            android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r13.f3958o0 = r14
            r13.f3959p0 = r4
            r13.mo5518e()
            r13.f3959p0 = r0
            int r14 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r14) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.C0999g) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.f3978a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r15
            float r2 = r2.f3980c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f3958o0
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0998f b = mo5504b(childAt);
                if (b != null && b.f3974b == this.f3944b0 && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1005m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1005m mVar = (C1005m) parcelable;
        super.onRestoreInstanceState(mVar.mo14857X());
        C1008a aVar = this.f3943a0;
        if (aVar != null) {
            aVar.mo3295a(mVar.f3987W, mVar.f3988X);
            mo5493a(mVar.f3986V, false, true);
        } else {
            this.f3946c0 = mVar.f3986V;
            this.f3947d0 = mVar.f3987W;
            this.f3948e0 = mVar.f3988X;
        }
    }

    public Parcelable onSaveInstanceState() {
        C1005m mVar = new C1005m(super.onSaveInstanceState());
        mVar.f3986V = this.f3944b0;
        C1008a aVar = this.f3943a0;
        if (aVar != null) {
            mVar.f3987W = aVar.mo3299b();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f3952i0;
            m5371a(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3924I0) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        C1008a aVar = this.f3943a0;
        if (aVar == null || aVar.mo5565a() == 0) {
            return false;
        }
        if (this.f3919D0 == null) {
            this.f3919D0 = VelocityTracker.obtain();
        }
        this.f3919D0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3949f0.abortAnimation();
            this.f3961r0 = false;
            mo5518e();
            float x = motionEvent.getX();
            this.f3916A0 = x;
            this.f3968y0 = x;
            float y = motionEvent.getY();
            this.f3917B0 = y;
            this.f3969z0 = y;
            this.f3918C0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f3963t0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3918C0);
                    if (findPointerIndex == -1) {
                        z = m5388i();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f3968y0);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f3969z0);
                        if (abs > ((float) this.f3967x0) && abs > abs2) {
                            this.f3963t0 = true;
                            m5380c(true);
                            float f = this.f3916A0;
                            this.f3968y0 = x2 - f > 0.0f ? f + ((float) this.f3967x0) : f - ((float) this.f3967x0);
                            this.f3969z0 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3963t0) {
                    z = false | m5379b(motionEvent.getX(motionEvent.findPointerIndex(this.f3918C0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f3968y0 = motionEvent.getX(actionIndex);
                    this.f3918C0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m5373a(motionEvent);
                    this.f3968y0 = motionEvent.getX(motionEvent.findPointerIndex(this.f3918C0));
                }
            } else if (this.f3963t0) {
                m5372a(this.f3944b0, true, 0, false);
                z = m5388i();
            }
        } else if (this.f3963t0) {
            VelocityTracker velocityTracker = this.f3919D0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f3921F0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3918C0);
            this.f3961r0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0998f g = m5386g();
            float f2 = (float) clientWidth;
            mo5494a(m5369a(g.f3974b, ((((float) scrollX) / f2) - g.f3977e) / (g.f3976d + (((float) this.f3952i0) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3918C0)) - this.f3916A0)), true, true, xVelocity);
            z = m5388i();
        }
        if (z) {
            C4187x.m14344I(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f3959p0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C1008a aVar) {
        C1008a aVar2 = this.f3943a0;
        if (aVar2 != null) {
            aVar2.mo5570b((DataSetObserver) null);
            this.f3943a0.mo3300b((ViewGroup) this);
            for (int i = 0; i < this.f3936U.size(); i++) {
                C0998f fVar = (C0998f) this.f3936U.get(i);
                this.f3943a0.mo3297a(this, fVar.f3974b, fVar.f3973a);
            }
            this.f3943a0.mo3296a((ViewGroup) this);
            this.f3936U.clear();
            m5387h();
            this.f3944b0 = 0;
            scrollTo(0, 0);
        }
        C1008a aVar3 = this.f3943a0;
        this.f3943a0 = aVar;
        this.f3945c = 0;
        if (this.f3943a0 != null) {
            if (this.f3951h0 == null) {
                this.f3951h0 = new C1004l();
            }
            this.f3943a0.mo5570b((DataSetObserver) this.f3951h0);
            this.f3961r0 = false;
            boolean z = this.f3927L0;
            this.f3927L0 = true;
            this.f3945c = this.f3943a0.mo5565a();
            if (this.f3946c0 >= 0) {
                this.f3943a0.mo3295a(this.f3947d0, this.f3948e0);
                mo5493a(this.f3946c0, false, true);
                this.f3946c0 = -1;
                this.f3947d0 = null;
                this.f3948e0 = null;
            } else if (!z) {
                mo5518e();
            } else {
                requestLayout();
            }
        }
        List<C1001i> list = this.f3933R0;
        if (list != null && !list.isEmpty()) {
            int size = this.f3933R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C1001i) this.f3933R0.get(i2)).mo5552a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f3961r0 = false;
        mo5493a(i, !this.f3927L0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f3962s0) {
            this.f3962s0 = i;
            mo5518e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1002j jVar) {
        this.f3931P0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3952i0;
        this.f3952i0 = i;
        int width = getWidth();
        m5371a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3953j0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f3942X0 != i) {
            this.f3942X0 = i;
            if (this.f3934S0 != null) {
                m5378b(i != 0);
            }
            m5383e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3953j0;
    }

    /* renamed from: e */
    private void m5383e(int i) {
        C1002j jVar = this.f3931P0;
        if (jVar != null) {
            jVar.mo5553a(i);
        }
        List<C1002j> list = this.f3930O0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1002j jVar2 = (C1002j) this.f3930O0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo5553a(i);
                }
            }
        }
        C1002j jVar3 = this.f3932Q0;
        if (jVar3 != null) {
            jVar3.mo5553a(i);
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0999g(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo5492a(int i, boolean z) {
        this.f3961r0 = false;
        mo5493a(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C4025a.m13798c(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5493a(int i, boolean z, boolean z2) {
        mo5494a(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5494a(int i, boolean z, boolean z2, int i2) {
        C1008a aVar = this.f3943a0;
        if (aVar == null || aVar.mo5565a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3944b0 != i || this.f3936U.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3943a0.mo5565a()) {
                i = this.f3943a0.mo5565a() - 1;
            }
            int i3 = this.f3962s0;
            int i4 = this.f3944b0;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f3936U.size(); i5++) {
                    ((C0998f) this.f3936U.get(i5)).f3975c = true;
                }
            }
            if (this.f3944b0 == i) {
                z3 = false;
            }
            if (this.f3927L0) {
                this.f3944b0 = i;
                if (z3) {
                    m5382d(i);
                }
                requestLayout();
            } else {
                mo5508c(i);
                m5372a(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5513d() {
        C1008a aVar = this.f3943a0;
        if (aVar == null || this.f3944b0 >= aVar.mo5565a() - 1) {
            return false;
        }
        mo5492a(this.f3944b0 + 1, true);
        return true;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5505b();
    }

    /* renamed from: f */
    private void m5384f() {
        this.f3963t0 = false;
        this.f3964u0 = false;
        VelocityTracker velocityTracker = this.f3919D0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3919D0 = null;
        }
    }

    /* renamed from: b */
    public void mo5506b(C1001i iVar) {
        List<C1001i> list = this.f3933R0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: b */
    public void mo5507b(C1002j jVar) {
        List<C1002j> list = this.f3930O0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: a */
    private void m5372a(int i, boolean z, int i2, boolean z2) {
        C0998f b = mo5503b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f3956m0, Math.min(b.f3977e, this.f3957n0))) : 0;
        if (z) {
            mo5491a(clientWidth, 0, i2);
            if (z2) {
                m5382d(i);
                return;
            }
            return;
        }
        if (z2) {
            m5382d(i);
        }
        m5375a(false);
        scrollTo(clientWidth, 0);
        m5385f(clientWidth);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0998f mo5504b(View view) {
        for (int i = 0; i < this.f3936U.size(); i++) {
            C0998f fVar = (C0998f) this.f3936U.get(i);
            if (this.f3943a0.mo3298a(view, fVar.f3973a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0998f mo5503b(int i) {
        for (int i2 = 0; i2 < this.f3936U.size(); i2++) {
            C0998f fVar = (C0998f) this.f3936U.get(i2);
            if (fVar.f3974b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m5377b(int i, float f, int i2) {
        C1002j jVar = this.f3931P0;
        if (jVar != null) {
            jVar.mo5554a(i, f, i2);
        }
        List<C1002j> list = this.f3930O0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1002j jVar2 = (C1002j) this.f3930O0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo5554a(i, f, i2);
                }
            }
        }
        C1002j jVar3 = this.f3932Q0;
        if (jVar3 != null) {
            jVar3.mo5554a(i, f, i2);
        }
    }

    /* renamed from: a */
    public void mo5496a(C1002j jVar) {
        if (this.f3930O0 == null) {
            this.f3930O0 = new ArrayList();
        }
        this.f3930O0.add(jVar);
    }

    /* renamed from: b */
    private void m5378b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f3935T0 : 0, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo5486a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5491a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f3949f0;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f3950g0 ? this.f3949f0.getCurrX() : this.f3949f0.getStartX();
            this.f3949f0.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m5375a(false);
            mo5518e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float a = f2 + (mo5486a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f3943a0.mo5569b(this.f3944b0)) + ((float) this.f3952i0))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f3950g0 = false;
        this.f3949f0.startScroll(i6, scrollY, i7, i8, min);
        C4187x.m14344I(this);
    }

    /* renamed from: b */
    private boolean m5379b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3968y0 - f;
        this.f3968y0 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f3956m0 * clientWidth;
        float f4 = this.f3957n0 * clientWidth;
        boolean z3 = false;
        C0998f fVar = (C0998f) this.f3936U.get(0);
        ArrayList<C0998f> arrayList = this.f3936U;
        C0998f fVar2 = (C0998f) arrayList.get(arrayList.size() - 1);
        if (fVar.f3974b != 0) {
            f3 = fVar.f3977e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f3974b != this.f3943a0.mo5565a() - 1) {
            f4 = fVar2.f3977e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3925J0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3926K0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3968y0 += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m5385f(i);
        return z3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0998f mo5487a(int i, int i2) {
        C0998f fVar = new C0998f();
        fVar.f3974b = i;
        fVar.f3973a = this.f3943a0.mo3294a((ViewGroup) this, i);
        fVar.f3976d = this.f3943a0.mo5569b(i);
        if (i2 < 0 || i2 >= this.f3936U.size()) {
            this.f3936U.add(fVar);
        } else {
            this.f3936U.add(i2, fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5489a() {
        int a = this.f3943a0.mo5565a();
        this.f3945c = a;
        boolean z = this.f3936U.size() < (this.f3962s0 * 2) + 1 && this.f3936U.size() < a;
        int i = this.f3944b0;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3936U.size()) {
            C0998f fVar = (C0998f) this.f3936U.get(i2);
            int a2 = this.f3943a0.mo5566a(fVar.f3973a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f3936U.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f3943a0.mo3300b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f3943a0.mo3297a(this, fVar.f3974b, fVar.f3973a);
                    int i3 = this.f3944b0;
                    if (i3 == fVar.f3974b) {
                        i = Math.max(0, Math.min(i3, a - 1));
                    }
                } else {
                    int i4 = fVar.f3974b;
                    if (i4 != a2) {
                        if (i4 == this.f3944b0) {
                            i = a2;
                        }
                        fVar.f3974b = a2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f3943a0.mo3296a((ViewGroup) this);
        }
        Collections.sort(this.f3936U, f3913Z0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0999g gVar = (C0999g) getChildAt(i5).getLayoutParams();
                if (!gVar.f3978a) {
                    gVar.f3980c = 0.0f;
                }
            }
            mo5493a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: c */
    private static boolean m5381c(View view) {
        return view.getClass().getAnnotation(C0997e.class) != null;
    }

    /* renamed from: c */
    private void m5380c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5509c() {
        int i = this.f3944b0;
        if (i <= 0) {
            return false;
        }
        mo5492a(i - 1, true);
        return true;
    }

    /* renamed from: a */
    private void m5374a(C0998f fVar, int i, C0998f fVar2) {
        int i2;
        int i3;
        C0998f fVar3;
        C0998f fVar4;
        int a = this.f3943a0.mo5565a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3952i0) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f3974b;
            int i5 = fVar.f3974b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f3977e + fVar2.f3976d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f3974b || i6 >= this.f3936U.size()) {
                        break;
                    }
                    Object obj = this.f3936U.get(i6);
                    while (true) {
                        fVar4 = (C0998f) obj;
                        if (i4 > fVar4.f3974b && i6 < this.f3936U.size() - 1) {
                            i6++;
                            obj = this.f3936U.get(i6);
                        }
                    }
                    while (i4 < fVar4.f3974b) {
                        f2 += this.f3943a0.mo5569b(i4) + f;
                        i4++;
                    }
                    fVar4.f3977e = f2;
                    f2 += fVar4.f3976d + f;
                }
            } else if (i4 > i5) {
                int size = this.f3936U.size() - 1;
                float f3 = fVar2.f3977e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f3974b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f3936U.get(size);
                    while (true) {
                        fVar3 = (C0998f) obj2;
                        if (i7 < fVar3.f3974b && size > 0) {
                            size--;
                            obj2 = this.f3936U.get(size);
                        }
                    }
                    while (i4 > fVar3.f3974b) {
                        f3 -= this.f3943a0.mo5569b(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f3976d + f;
                    fVar3.f3977e = f3;
                }
            }
        }
        int size2 = this.f3936U.size();
        float f4 = fVar.f3977e;
        int i8 = fVar.f3974b;
        int i9 = i8 - 1;
        this.f3956m0 = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = a - 1;
        this.f3957n0 = fVar.f3974b == i10 ? (fVar.f3977e + fVar.f3976d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0998f fVar5 = (C0998f) this.f3936U.get(i11);
            while (true) {
                i3 = fVar5.f3974b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f3943a0.mo5569b(i9) + f;
                i9--;
            }
            f4 -= fVar5.f3976d + f;
            fVar5.f3977e = f4;
            if (i3 == 0) {
                this.f3956m0 = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f3977e + fVar.f3976d + f;
        int i12 = fVar.f3974b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0998f fVar6 = (C0998f) this.f3936U.get(i13);
            while (true) {
                i2 = fVar6.f3974b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f3943a0.mo5569b(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f3957n0 = (fVar6.f3976d + f5) - 1.0f;
            }
            fVar6.f3977e = f5;
            f5 += fVar6.f3976d + f;
            i13++;
            i12++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0998f mo5488a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo5504b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m5371a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3936U.isEmpty()) {
            C0998f b = mo5503b(this.f3944b0);
            int min = (int) ((b != null ? Math.min(b.f3977e, this.f3957n0) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m5375a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3949f0.isFinished()) {
            this.f3949f0.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5490a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3929N0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0999g) r9
            boolean r10 = r9.f3978a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f3979b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m5377b(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f3934S0
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0999g) r0
            boolean r0 = r0.f3978a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f3934S0
            r3.mo5556a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f3928M0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo5490a(int, float, int):void");
    }

    /* renamed from: a */
    private void m5375a(boolean z) {
        boolean z2 = this.f3942X0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3949f0.isFinished()) {
                this.f3949f0.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3949f0.getCurrX();
                int currY = this.f3949f0.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m5385f(currX);
                    }
                }
            }
        }
        this.f3961r0 = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f3936U.size(); i++) {
            C0998f fVar = (C0998f) this.f3936U.get(i);
            if (fVar.f3975c) {
                fVar.f3975c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C4187x.m14363a((View) this, this.f3941W0);
        } else {
            this.f3941W0.run();
        }
    }

    /* renamed from: a */
    private boolean m5376a(float f, float f2) {
        return (f < ((float) this.f3966w0) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f3966w0)) && f2 < 0.0f);
    }

    /* renamed from: a */
    private int m5369a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3922G0 || Math.abs(i2) <= this.f3920E0) {
            i += (int) (f + (i >= this.f3944b0 ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3936U.size() <= 0) {
            return i;
        }
        C0998f fVar = (C0998f) this.f3936U.get(0);
        ArrayList<C0998f> arrayList = this.f3936U;
        return Math.max(fVar.f3974b, Math.min(i, ((C0998f) arrayList.get(arrayList.size() - 1)).f3974b));
    }

    /* renamed from: a */
    private void m5373a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3918C0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3968y0 = motionEvent.getX(i);
            this.f3918C0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3919D0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5499a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo5499a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo5498a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo5497a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo5497a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo5513d();
                } else {
                    return mo5497a(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo5509c();
            } else {
                return mo5497a(17);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5497a(int i) {
        boolean requestFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m5370a(this.f3940W, findNextFocus).left;
                int i3 = m5370a(this.f3940W, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = mo5509c();
                }
            } else if (i == 66) {
                int i4 = m5370a(this.f3940W, findNextFocus).left;
                int i5 = m5370a(this.f3940W, view).left;
                if (view == null || i4 > i5) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = mo5513d();
                }
            }
            z2 = requestFocus;
        } else if (i == 17 || i == 1) {
            z2 = mo5509c();
        } else if (i == 66 || i == 2) {
            z2 = mo5513d();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    private Rect m5370a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
