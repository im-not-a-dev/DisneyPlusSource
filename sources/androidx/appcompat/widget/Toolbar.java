package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0076a.C0077a;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0132g.C0133a;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.C0148n;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0157s;
import androidx.appcompat.widget.ActionMenuView.C0169e;
import java.util.ArrayList;
import java.util.List;
import p096e.p097a.C3858a;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p097a.p104o.C3891c;
import p096e.p097a.p104o.C3896g;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4146h;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p141a.C4204a;

public class Toolbar extends ViewGroup {

    /* renamed from: A0 */
    private final ArrayList<View> f894A0;

    /* renamed from: B0 */
    private final int[] f895B0;

    /* renamed from: C0 */
    C0195f f896C0;

    /* renamed from: D0 */
    private final C0169e f897D0;

    /* renamed from: E0 */
    private C0286u0 f898E0;

    /* renamed from: F0 */
    private C0205c f899F0;

    /* renamed from: G0 */
    private C0193d f900G0;

    /* renamed from: H0 */
    private C0149a f901H0;

    /* renamed from: I0 */
    private C0133a f902I0;

    /* renamed from: J0 */
    private boolean f903J0;

    /* renamed from: K0 */
    private final Runnable f904K0;

    /* renamed from: U */
    private TextView f905U;

    /* renamed from: V */
    private TextView f906V;

    /* renamed from: W */
    private ImageButton f907W;

    /* renamed from: a0 */
    private ImageView f908a0;

    /* renamed from: b0 */
    private Drawable f909b0;

    /* renamed from: c */
    private ActionMenuView f910c;

    /* renamed from: c0 */
    private CharSequence f911c0;

    /* renamed from: d0 */
    ImageButton f912d0;

    /* renamed from: e0 */
    View f913e0;

    /* renamed from: f0 */
    private Context f914f0;

    /* renamed from: g0 */
    private int f915g0;

    /* renamed from: h0 */
    private int f916h0;

    /* renamed from: i0 */
    private int f917i0;

    /* renamed from: j0 */
    int f918j0;

    /* renamed from: k0 */
    private int f919k0;

    /* renamed from: l0 */
    private int f920l0;

    /* renamed from: m0 */
    private int f921m0;

    /* renamed from: n0 */
    private int f922n0;

    /* renamed from: o0 */
    private int f923o0;

    /* renamed from: p0 */
    private C0252l0 f924p0;

    /* renamed from: q0 */
    private int f925q0;

    /* renamed from: r0 */
    private int f926r0;

    /* renamed from: s0 */
    private int f927s0;

    /* renamed from: t0 */
    private CharSequence f928t0;

    /* renamed from: u0 */
    private CharSequence f929u0;

    /* renamed from: v0 */
    private ColorStateList f930v0;

    /* renamed from: w0 */
    private ColorStateList f931w0;

    /* renamed from: x0 */
    private boolean f932x0;

    /* renamed from: y0 */
    private boolean f933y0;

    /* renamed from: z0 */
    private final ArrayList<View> f934z0;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0190a implements C0169e {
        C0190a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0195f fVar = Toolbar.this.f896C0;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0191b implements Runnable {
        C0191b() {
        }

        public void run() {
            Toolbar.this.mo1416k();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0192c implements OnClickListener {
        C0192c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1374c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0193d implements C0148n {

        /* renamed from: U */
        C0137j f938U;

        /* renamed from: c */
        C0132g f940c;

        C0193d() {
        }

        /* renamed from: a */
        public void mo708a(Context context, C0132g gVar) {
            C0132g gVar2 = this.f940c;
            if (gVar2 != null) {
                C0137j jVar = this.f938U;
                if (jVar != null) {
                    gVar2.mo784a(jVar);
                }
            }
            this.f940c = gVar;
        }

        /* renamed from: a */
        public void mo710a(C0132g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo730a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo717a(C0157s sVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo720b(C0132g gVar, C0137j jVar) {
            Toolbar.this.mo1377e();
            ViewParent parent = Toolbar.this.f912d0.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f912d0);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f912d0);
            }
            Toolbar.this.f913e0 = jVar.getActionView();
            this.f938U = jVar;
            ViewParent parent2 = Toolbar.this.f913e0.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f913e0);
                }
                C0194e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f288a = 8388611 | (toolbar4.f918j0 & 112);
                generateDefaultLayoutParams.f941b = 2;
                toolbar4.f913e0.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f913e0);
            }
            Toolbar.this.mo1415j();
            Toolbar.this.requestLayout();
            jVar.mo848a(true);
            View view = Toolbar.this.f913e0;
            if (view instanceof C3891c) {
                ((C3891c) view).mo966b();
            }
            return true;
        }

        /* renamed from: a */
        public void mo713a(boolean z) {
            if (this.f938U != null) {
                C0132g gVar = this.f940c;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f940c.getItem(i) == this.f938U) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo716a(this.f940c, this.f938U);
                }
            }
        }

        /* renamed from: a */
        public boolean mo716a(C0132g gVar, C0137j jVar) {
            View view = Toolbar.this.f913e0;
            if (view instanceof C3891c) {
                ((C3891c) view).mo967c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f913e0);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f912d0);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f913e0 = null;
            toolbar3.mo1367a();
            this.f938U = null;
            Toolbar.this.requestLayout();
            jVar.mo848a(false);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0194e extends C0077a {

        /* renamed from: b */
        int f941b;

        public C0194e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f941b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1458a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0194e(int i, int i2) {
            super(i, i2);
            this.f941b = 0;
            this.f288a = 8388627;
        }

        public C0194e(C0194e eVar) {
            super((C0077a) eVar);
            this.f941b = 0;
            this.f941b = eVar.f941b;
        }

        public C0194e(C0077a aVar) {
            super(aVar);
            this.f941b = 0;
        }

        public C0194e(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f941b = 0;
            mo1458a(marginLayoutParams);
        }

        public C0194e(LayoutParams layoutParams) {
            super(layoutParams);
            this.f941b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0195f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0196g extends C4204a {
        public static final Creator<C0196g> CREATOR = new C0197a();

        /* renamed from: V */
        int f942V;

        /* renamed from: W */
        boolean f943W;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        static class C0197a implements ClassLoaderCreator<C0196g> {
            C0197a() {
            }

            public C0196g[] newArray(int i) {
                return new C0196g[i];
            }

            public C0196g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0196g(parcel, classLoader);
            }

            public C0196g createFromParcel(Parcel parcel) {
                return new C0196g(parcel, null);
            }
        }

        public C0196g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f942V = parcel.readInt();
            this.f943W = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f942V);
            parcel.writeInt(this.f943W ? 1 : 0);
        }

        public C0196g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new C3896g(getContext());
    }

    /* renamed from: l */
    private void m1105l() {
        if (this.f924p0 == null) {
            this.f924p0 = new C0252l0();
        }
    }

    /* renamed from: m */
    private void m1106m() {
        if (this.f908a0 == null) {
            this.f908a0 = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m1107n() {
        m1108o();
        if (this.f910c.mo1149j() == null) {
            C0132g gVar = (C0132g) this.f910c.getMenu();
            if (this.f900G0 == null) {
                this.f900G0 = new C0193d();
            }
            this.f910c.setExpandedActionViewsExclusive(true);
            gVar.mo778a((C0148n) this.f900G0, this.f914f0);
        }
    }

    /* renamed from: o */
    private void m1108o() {
        if (this.f910c == null) {
            this.f910c = new ActionMenuView(getContext());
            this.f910c.setPopupTheme(this.f915g0);
            this.f910c.setOnMenuItemClickListener(this.f897D0);
            this.f910c.mo1132a(this.f901H0, this.f902I0);
            C0194e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f288a = 8388613 | (this.f918j0 & 112);
            this.f910c.setLayoutParams(generateDefaultLayoutParams);
            m1097a((View) this.f910c, false);
        }
    }

    /* renamed from: p */
    private void m1109p() {
        if (this.f907W == null) {
            this.f907W = new C0249k(getContext(), null, C3858a.toolbarNavigationButtonStyle);
            C0194e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f288a = 8388611 | (this.f918j0 & 112);
            this.f907W.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m1110q() {
        removeCallbacks(this.f904K0);
        post(this.f904K0);
    }

    /* renamed from: r */
    private boolean m1111r() {
        if (!this.f903J0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1104d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo1371a(C0132g gVar, C0205c cVar) {
        if (gVar != null || this.f910c != null) {
            m1108o();
            C0132g j = this.f910c.mo1149j();
            if (j != gVar) {
                if (j != null) {
                    j.mo797b((C0148n) this.f899F0);
                    j.mo797b((C0148n) this.f900G0);
                }
                if (this.f900G0 == null) {
                    this.f900G0 = new C0193d();
                }
                cVar.mo1522b(true);
                if (gVar != null) {
                    gVar.mo778a((C0148n) cVar, this.f914f0);
                    gVar.mo778a((C0148n) this.f900G0, this.f914f0);
                } else {
                    cVar.mo708a(this.f914f0, (C0132g) null);
                    this.f900G0.mo708a(this.f914f0, (C0132g) null);
                    cVar.mo713a(true);
                    this.f900G0.mo713a(true);
                }
                this.f910c.setPopupTheme(this.f915g0);
                this.f910c.setPresenter(cVar);
                this.f899F0 = cVar;
            }
        }
    }

    /* renamed from: b */
    public boolean mo1373b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f910c;
            if (actionMenuView != null && actionMenuView.mo1148i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo1374c() {
        C0193d dVar = this.f900G0;
        C0137j jVar = dVar == null ? null : dVar.f938U;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0194e);
    }

    /* renamed from: d */
    public void mo1376d() {
        ActionMenuView actionMenuView = this.f910c;
        if (actionMenuView != null) {
            actionMenuView.mo1134d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1377e() {
        if (this.f912d0 == null) {
            this.f912d0 = new C0249k(getContext(), null, C3858a.toolbarNavigationButtonStyle);
            this.f912d0.setImageDrawable(this.f909b0);
            this.f912d0.setContentDescription(this.f911c0);
            C0194e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f288a = 8388611 | (this.f918j0 & 112);
            generateDefaultLayoutParams.f941b = 2;
            this.f912d0.setLayoutParams(generateDefaultLayoutParams);
            this.f912d0.setOnClickListener(new C0192c());
        }
    }

    /* renamed from: f */
    public boolean mo1378f() {
        C0193d dVar = this.f900G0;
        return (dVar == null || dVar.f938U == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo1379g() {
        ActionMenuView actionMenuView = this.f910c;
        return actionMenuView != null && actionMenuView.mo1138f();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f912d0;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f912d0;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0252l0 l0Var = this.f924p0;
        if (l0Var != null) {
            return l0Var.mo1762a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f926r0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0252l0 l0Var = this.f924p0;
        if (l0Var != null) {
            return l0Var.mo1765b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0252l0 l0Var = this.f924p0;
        if (l0Var != null) {
            return l0Var.mo1767c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0252l0 l0Var = this.f924p0;
        if (l0Var != null) {
            return l0Var.mo1768d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f925q0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f910c
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1149j()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f926r0
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C4187x.m14399n(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C4187x.m14399n(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f925q0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f908a0;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f908a0;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1107n();
        return this.f910c.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f907W;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f907W;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0205c getOuterActionMenuPresenter() {
        return this.f899F0;
    }

    public Drawable getOverflowIcon() {
        m1107n();
        return this.f910c.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f914f0;
    }

    public int getPopupTheme() {
        return this.f915g0;
    }

    public CharSequence getSubtitle() {
        return this.f929u0;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getSubtitleTextView() {
        return this.f906V;
    }

    public CharSequence getTitle() {
        return this.f928t0;
    }

    public int getTitleMarginBottom() {
        return this.f923o0;
    }

    public int getTitleMarginEnd() {
        return this.f921m0;
    }

    public int getTitleMarginStart() {
        return this.f920l0;
    }

    public int getTitleMarginTop() {
        return this.f922n0;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getTitleTextView() {
        return this.f905U;
    }

    public C0201a0 getWrapper() {
        if (this.f898E0 == null) {
            this.f898E0 = new C0286u0(this, true);
        }
        return this.f898E0;
    }

    /* renamed from: h */
    public boolean mo1413h() {
        ActionMenuView actionMenuView = this.f910c;
        return actionMenuView != null && actionMenuView.mo1139g();
    }

    /* renamed from: i */
    public boolean mo1414i() {
        ActionMenuView actionMenuView = this.f910c;
        return actionMenuView != null && actionMenuView.mo1147h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1415j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0194e) childAt.getLayoutParams()).f941b == 2 || childAt == this.f910c)) {
                removeViewAt(childCount);
                this.f894A0.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo1416k() {
        ActionMenuView actionMenuView = this.f910c;
        return actionMenuView != null && actionMenuView.mo1150k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f904K0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f933y0 = false;
        }
        if (!this.f933y0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f933y0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f933y0 = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p096e.p121h.p135s.C4187x.m14399n(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f895B0
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p096e.p121h.p135s.C4187x.m14400o(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f907W
            boolean r13 = r0.m1104d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f907W
            int r13 = r0.m1101b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f907W
            int r13 = r0.m1094a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f912d0
            boolean r15 = r0.m1104d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f912d0
            int r14 = r0.m1101b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f912d0
            int r13 = r0.m1094a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f910c
            boolean r15 = r0.m1104d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f910c
            int r13 = r0.m1094a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f910c
            int r14 = r0.m1101b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f913e0
            boolean r13 = r0.m1104d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f913e0
            int r10 = r0.m1101b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f913e0
            int r2 = r0.m1094a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f908a0
            boolean r13 = r0.m1104d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f908a0
            int r10 = r0.m1101b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f908a0
            int r2 = r0.m1094a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f905U
            boolean r13 = r0.m1104d(r13)
            android.widget.TextView r14 = r0.f906V
            boolean r14 = r0.m1104d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f905U
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0194e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f905U
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f906V
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0194e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f906V
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0296
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f905U
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f906V
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f906V
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f905U
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0194e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0194e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f905U
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f906V
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f927s0
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019a
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f922n0
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0183
            int r6 = r12 + r2
            goto L_0x0198
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f923o0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0198
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0198:
            int r8 = r8 + r6
            goto L_0x01b7
        L_0x019a:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f923o0
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b7
        L_0x01a8:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f922n0
            int r8 = r2 + r3
        L_0x01b7:
            if (r1 == 0) goto L_0x022c
            if (r15 == 0) goto L_0x01bf
            int r3 = r0.f920l0
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = 1
            r3 = 0
        L_0x01c1:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f7
            android.widget.TextView r1 = r0.f905U
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0194e) r1
            android.widget.TextView r2 = r0.f905U
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f905U
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f905U
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f921m0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f8
        L_0x01f7:
            r2 = r10
        L_0x01f8:
            if (r18 == 0) goto L_0x0220
            android.widget.TextView r1 = r0.f906V
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0194e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f906V
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f906V
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f906V
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f921m0
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0221
        L_0x0220:
            r3 = r10
        L_0x0221:
            if (r15 == 0) goto L_0x0228
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0228:
            r2 = r24
            goto L_0x0128
        L_0x022c:
            if (r15 == 0) goto L_0x0231
            int r3 = r0.f920l0
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0268
            android.widget.TextView r1 = r0.f905U
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0194e) r1
            android.widget.TextView r3 = r0.f905U
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f905U
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f905U
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f921m0
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0269
        L_0x0268:
            r3 = r2
        L_0x0269:
            if (r18 == 0) goto L_0x028f
            android.widget.TextView r1 = r0.f906V
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0194e) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f906V
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f906V
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f906V
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f921m0
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            if (r15 == 0) goto L_0x0296
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0296:
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            r3 = 3
            r0.m1098a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a4:
            if (r2 >= r1) goto L_0x02b7
            java.util.ArrayList<android.view.View> r4 = r0.f934z0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m1094a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02b7:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            r2 = 5
            r0.m1098a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            int r1 = r1.size()
            r2 = 0
        L_0x02c6:
            if (r2 >= r1) goto L_0x02d7
            java.util.ArrayList<android.view.View> r4 = r0.f934z0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1101b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d7:
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            r2 = 1
            r0.m1098a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            int r1 = r0.m1095a(r1, r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            if (r1 <= r10) goto L_0x02f9
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fa
        L_0x02f9:
            r3 = r2
        L_0x02fa:
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            int r1 = r1.size()
        L_0x0300:
            if (r7 >= r1) goto L_0x0311
            java.util.ArrayList<android.view.View> r2 = r0.f934z0
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m1094a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0311:
            java.util.ArrayList<android.view.View> r1 = r0.f934z0
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f895B0;
        if (C0302z0.m1635a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1104d(this.f907W)) {
            m1096a((View) this.f907W, i, 0, i2, 0, this.f919k0);
            i5 = this.f907W.getMeasuredWidth() + m1091a((View) this.f907W);
            i4 = Math.max(0, this.f907W.getMeasuredHeight() + m1100b((View) this.f907W));
            i3 = View.combineMeasuredStates(0, this.f907W.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1104d(this.f912d0)) {
            m1096a((View) this.f912d0, i, 0, i2, 0, this.f919k0);
            i5 = this.f912d0.getMeasuredWidth() + m1091a((View) this.f912d0);
            i4 = Math.max(i4, this.f912d0.getMeasuredHeight() + m1100b((View) this.f912d0));
            i3 = View.combineMeasuredStates(i3, this.f912d0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m1104d(this.f910c)) {
            m1096a((View) this.f910c, i, max, i2, 0, this.f919k0);
            i6 = this.f910c.getMeasuredWidth() + m1091a((View) this.f910c);
            i4 = Math.max(i4, this.f910c.getMeasuredHeight() + m1100b((View) this.f910c));
            i3 = View.combineMeasuredStates(i3, this.f910c.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1104d(this.f913e0)) {
            max2 += m1093a(this.f913e0, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f913e0.getMeasuredHeight() + m1100b(this.f913e0));
            i3 = View.combineMeasuredStates(i3, this.f913e0.getMeasuredState());
        }
        if (m1104d(this.f908a0)) {
            max2 += m1093a((View) this.f908a0, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f908a0.getMeasuredHeight() + m1100b((View) this.f908a0));
            i3 = View.combineMeasuredStates(i3, this.f908a0.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0194e) childAt.getLayoutParams()).f941b == 0 && m1104d(childAt)) {
                i11 += m1093a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m1100b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f922n0 + this.f923o0;
        int i14 = this.f920l0 + this.f921m0;
        if (m1104d(this.f905U)) {
            m1093a((View) this.f905U, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f905U.getMeasuredWidth() + m1091a((View) this.f905U);
            i7 = this.f905U.getMeasuredHeight() + m1100b((View) this.f905U);
            i9 = View.combineMeasuredStates(i3, this.f905U.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1104d(this.f906V)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m1093a((View) this.f906V, i, i11 + i14, i2, i15, iArr));
            i7 += this.f906V.getMeasuredHeight() + m1100b((View) this.f906V);
            i9 = View.combineMeasuredStates(i16, this.f906V.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m1111r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0196g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0196g gVar = (C0196g) parcelable;
        super.onRestoreInstanceState(gVar.mo14857X());
        ActionMenuView actionMenuView = this.f910c;
        C0132g j = actionMenuView != null ? actionMenuView.mo1149j() : null;
        int i = gVar.f942V;
        if (!(i == 0 || this.f900G0 == null || j == null)) {
            MenuItem findItem = j.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (gVar.f943W) {
            m1110q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1105l();
        C0252l0 l0Var = this.f924p0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        l0Var.mo1764a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0196g gVar = new C0196g(super.onSaveInstanceState());
        C0193d dVar = this.f900G0;
        if (dVar != null) {
            C0137j jVar = dVar.f938U;
            if (jVar != null) {
                gVar.f942V = jVar.getItemId();
            }
        }
        gVar.f943W = mo1414i();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f932x0 = false;
        }
        if (!this.f932x0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f932x0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f932x0 = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C3868a.m12946c(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f903J0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f926r0) {
            this.f926r0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f925q0) {
            this.f925q0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C3868a.m12946c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C3868a.m12946c(getContext(), i));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m1109p();
        this.f907W.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0195f fVar) {
        this.f896C0 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1107n();
        this.f910c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f915g0 != i) {
            this.f915g0 = i;
            if (i == 0) {
                this.f914f0 = getContext();
            } else {
                this.f914f0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f923o0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f921m0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f920l0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f922n0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.toolbarStyle);
    }

    /* renamed from: b */
    public void mo1372b(Context context, int i) {
        this.f916h0 = i;
        TextView textView = this.f905U;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public C0194e generateDefaultLayoutParams() {
        return new C0194e(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1377e();
        }
        ImageButton imageButton = this.f912d0;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1377e();
            this.f912d0.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f912d0;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f909b0);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1106m();
            if (!m1103c((View) this.f908a0)) {
                m1097a((View) this.f908a0, true);
            }
        } else {
            ImageView imageView = this.f908a0;
            if (imageView != null && m1103c((View) imageView)) {
                removeView(this.f908a0);
                this.f894A0.remove(this.f908a0);
            }
        }
        ImageView imageView2 = this.f908a0;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1106m();
        }
        ImageView imageView = this.f908a0;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1109p();
        }
        ImageButton imageButton = this.f907W;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1109p();
            if (!m1103c((View) this.f907W)) {
                m1097a((View) this.f907W, true);
            }
        } else {
            ImageButton imageButton = this.f907W;
            if (imageButton != null && m1103c((View) imageButton)) {
                removeView(this.f907W);
                this.f894A0.remove(this.f907W);
            }
        }
        ImageButton imageButton2 = this.f907W;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f906V == null) {
                Context context = getContext();
                this.f906V = new C0293w(context);
                this.f906V.setSingleLine();
                this.f906V.setEllipsize(TruncateAt.END);
                int i = this.f917i0;
                if (i != 0) {
                    this.f906V.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f931w0;
                if (colorStateList != null) {
                    this.f906V.setTextColor(colorStateList);
                }
            }
            if (!m1103c((View) this.f906V)) {
                m1097a((View) this.f906V, true);
            }
        } else {
            TextView textView = this.f906V;
            if (textView != null && m1103c((View) textView)) {
                removeView(this.f906V);
                this.f894A0.remove(this.f906V);
            }
        }
        TextView textView2 = this.f906V;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f929u0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f931w0 = colorStateList;
        TextView textView = this.f906V;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f905U == null) {
                Context context = getContext();
                this.f905U = new C0293w(context);
                this.f905U.setSingleLine();
                this.f905U.setEllipsize(TruncateAt.END);
                int i = this.f916h0;
                if (i != 0) {
                    this.f905U.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f930v0;
                if (colorStateList != null) {
                    this.f905U.setTextColor(colorStateList);
                }
            }
            if (!m1103c((View) this.f905U)) {
                m1097a((View) this.f905U, true);
            }
        } else {
            TextView textView = this.f905U;
            if (textView != null && m1103c((View) textView)) {
                removeView(this.f905U);
                this.f894A0.remove(this.f905U);
            }
        }
        TextView textView2 = this.f905U;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f928t0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f930v0 = colorStateList;
        TextView textView = this.f905U;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f927s0 = 8388627;
        this.f934z0 = new ArrayList<>();
        this.f894A0 = new ArrayList<>();
        this.f895B0 = new int[2];
        this.f897D0 = new C0190a();
        this.f904K0 = new C0191b();
        C0284t0 a = C0284t0.m1486a(getContext(), attributeSet, C3867j.Toolbar, i, 0);
        this.f916h0 = a.mo1921g(C3867j.Toolbar_titleTextAppearance, 0);
        this.f917i0 = a.mo1921g(C3867j.Toolbar_subtitleTextAppearance, 0);
        this.f927s0 = a.mo1917e(C3867j.Toolbar_android_gravity, this.f927s0);
        this.f918j0 = a.mo1917e(C3867j.Toolbar_buttonGravity, 48);
        int b = a.mo1911b(C3867j.Toolbar_titleMargin, 0);
        if (a.mo1922g(C3867j.Toolbar_titleMargins)) {
            b = a.mo1911b(C3867j.Toolbar_titleMargins, b);
        }
        this.f923o0 = b;
        this.f922n0 = b;
        this.f921m0 = b;
        this.f920l0 = b;
        int b2 = a.mo1911b(C3867j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f920l0 = b2;
        }
        int b3 = a.mo1911b(C3867j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f921m0 = b3;
        }
        int b4 = a.mo1911b(C3867j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f922n0 = b4;
        }
        int b5 = a.mo1911b(C3867j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f923o0 = b5;
        }
        this.f919k0 = a.mo1913c(C3867j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo1911b(C3867j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo1911b(C3867j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo1913c(C3867j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo1913c(C3867j.Toolbar_contentInsetRight, 0);
        m1105l();
        this.f924p0.mo1763a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f924p0.mo1766b(b6, b7);
        }
        this.f925q0 = a.mo1911b(C3867j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f926r0 = a.mo1911b(C3867j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f909b0 = a.mo1912b(C3867j.Toolbar_collapseIcon);
        this.f911c0 = a.mo1918e(C3867j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo1918e(C3867j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo1918e(C3867j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f914f0 = getContext();
        setPopupTheme(a.mo1921g(C3867j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo1912b(C3867j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo1918e(C3867j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo1912b(C3867j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo1918e(C3867j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo1922g(C3867j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo1906a(C3867j.Toolbar_titleTextColor));
        }
        if (a.mo1922g(C3867j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo1906a(C3867j.Toolbar_subtitleTextColor));
        }
        if (a.mo1922g(C3867j.Toolbar_menu)) {
            mo1368a(a.mo1921g(C3867j.Toolbar_menu, 0));
        }
        a.mo1908a();
    }

    /* renamed from: c */
    private int m1102c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f927s0 & 112;
    }

    /* renamed from: d */
    private boolean m1104d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public C0194e generateLayoutParams(AttributeSet attributeSet) {
        return new C0194e(getContext(), attributeSet);
    }

    /* renamed from: c */
    private boolean m1103c(View view) {
        return view.getParent() == this || this.f894A0.contains(view);
    }

    /* access modifiers changed from: protected */
    public C0194e generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0194e) {
            return new C0194e((C0194e) layoutParams);
        }
        if (layoutParams instanceof C0077a) {
            return new C0194e((C0077a) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0194e((MarginLayoutParams) layoutParams);
        }
        return new C0194e(layoutParams);
    }

    /* renamed from: b */
    private int m1101b(View view, int i, int[] iArr, int i2) {
        C0194e eVar = (C0194e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1092a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: b */
    private int m1099b(int i) {
        int n = C4187x.m14399n(this);
        int a = C4139e.m14173a(i, n) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (n == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m1100b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo1370a(Context context, int i) {
        this.f917i0 = i;
        TextView textView = this.f906V;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo1368a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo1369a(int i, int i2) {
        m1105l();
        this.f924p0.mo1766b(i, i2);
    }

    /* renamed from: a */
    private void m1097a(View view, boolean z) {
        C0194e eVar;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C0194e) layoutParams;
        }
        eVar.f941b = 1;
        if (!z || this.f913e0 == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f894A0.add(view);
    }

    /* renamed from: a */
    private void m1096a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m1093a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m1095a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            C0194e eVar = (C0194e) view.getLayoutParams();
            int i7 = eVar.leftMargin - i4;
            int i8 = eVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = Math.max(0, -i8);
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private int m1094a(View view, int i, int[] iArr, int i2) {
        C0194e eVar = (C0194e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1092a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: a */
    private int m1092a(View view, int i) {
        C0194e eVar = (C0194e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = m1102c(eVar.f288a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private void m1098a(List<View> list, int i) {
        boolean z = C4187x.m14399n(this) == 1;
        int childCount = getChildCount();
        int a = C4139e.m14173a(i, C4187x.m14399n(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0194e eVar = (C0194e) childAt.getLayoutParams();
                if (eVar.f941b == 0 && m1104d(childAt) && m1099b(eVar.f288a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0194e eVar2 = (C0194e) childAt2.getLayoutParams();
            if (eVar2.f941b == 0 && m1104d(childAt2) && m1099b(eVar2.f288a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private int m1091a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C4146h.m14191b(marginLayoutParams) + C4146h.m14189a(marginLayoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1367a() {
        for (int size = this.f894A0.size() - 1; size >= 0; size--) {
            addView((View) this.f894A0.get(size));
        }
        this.f894A0.clear();
    }
}
