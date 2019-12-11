package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0119b;
import androidx.appcompat.view.menu.C0121b;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.C0146m;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0150o;
import androidx.appcompat.view.menu.C0150o.C0151a;
import androidx.appcompat.view.menu.C0153q;
import androidx.appcompat.view.menu.C0157s;
import androidx.appcompat.widget.ActionMenuView.C0165a;
import androidx.core.graphics.drawable.C0492a;
import java.util.ArrayList;
import p096e.p097a.C3858a;
import p096e.p097a.C3864g;
import p096e.p097a.p104o.C3888a;
import p096e.p121h.p135s.C4124b;
import p096e.p121h.p135s.C4124b.C4125a;

/* renamed from: androidx.appcompat.widget.c */
/* compiled from: ActionMenuPresenter */
class C0205c extends C0121b implements C4125a {

    /* renamed from: b0 */
    C0209d f965b0;

    /* renamed from: c0 */
    private Drawable f966c0;

    /* renamed from: d0 */
    private boolean f967d0;

    /* renamed from: e0 */
    private boolean f968e0;

    /* renamed from: f0 */
    private boolean f969f0;

    /* renamed from: g0 */
    private int f970g0;

    /* renamed from: h0 */
    private int f971h0;

    /* renamed from: i0 */
    private int f972i0;

    /* renamed from: j0 */
    private boolean f973j0;

    /* renamed from: k0 */
    private boolean f974k0;

    /* renamed from: l0 */
    private boolean f975l0;

    /* renamed from: m0 */
    private boolean f976m0;

    /* renamed from: n0 */
    private int f977n0;

    /* renamed from: o0 */
    private final SparseBooleanArray f978o0 = new SparseBooleanArray();

    /* renamed from: p0 */
    C0211e f979p0;

    /* renamed from: q0 */
    C0206a f980q0;

    /* renamed from: r0 */
    C0208c f981r0;

    /* renamed from: s0 */
    private C0207b f982s0;

    /* renamed from: t0 */
    final C0212f f983t0 = new C0212f();

    /* renamed from: u0 */
    int f984u0;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* compiled from: ActionMenuPresenter */
    private class C0206a extends C0146m {
        public C0206a(Context context, C0157s sVar, View view) {
            super(context, sVar, view, false, C3858a.actionOverflowMenuStyle);
            if (!((C0137j) sVar.getItem()).mo871h()) {
                View view2 = C0205c.this.f965b0;
                if (view2 == null) {
                    view2 = (View) C0205c.this.f511a0;
                }
                mo976a(view2);
            }
            mo978a((C0149a) C0205c.this.f983t0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo983d() {
            C0205c cVar = C0205c.this;
            cVar.f980q0 = null;
            cVar.f984u0 = 0;
            super.mo983d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* compiled from: ActionMenuPresenter */
    private class C0207b extends C0119b {
        C0207b() {
        }

        /* renamed from: a */
        public C0153q mo633a() {
            C0206a aVar = C0205c.this.f980q0;
            if (aVar != null) {
                return aVar.mo981b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* compiled from: ActionMenuPresenter */
    private class C0208c implements Runnable {

        /* renamed from: c */
        private C0211e f988c;

        public C0208c(C0211e eVar) {
            this.f988c = eVar;
        }

        public void run() {
            if (C0205c.this.f506V != null) {
                C0205c.this.f506V.mo773a();
            }
            View view = (View) C0205c.this.f511a0;
            if (!(view == null || view.getWindowToken() == null || !this.f988c.mo985f())) {
                C0205c.this.f979p0 = this.f988c;
            }
            C0205c.this.f981r0 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* compiled from: ActionMenuPresenter */
    private class C0209d extends AppCompatImageView implements C0165a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* compiled from: ActionMenuPresenter */
        class C0210a extends C0220e0 {
            C0210a(View view, C0205c cVar) {
                super(view);
            }

            /* renamed from: a */
            public C0153q mo631a() {
                C0211e eVar = C0205c.this.f979p0;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo981b();
            }

            /* renamed from: b */
            public boolean mo632b() {
                C0205c.this.mo1530i();
                return true;
            }

            /* renamed from: c */
            public boolean mo1534c() {
                C0205c cVar = C0205c.this;
                if (cVar.f981r0 != null) {
                    return false;
                }
                cVar.mo1526e();
                return true;
            }
        }

        public C0209d(Context context) {
            super(context, null, C3858a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0292v0.m1576a(this, getContentDescription());
            setOnTouchListener(new C0210a(this, C0205c.this));
        }

        /* renamed from: b */
        public boolean mo614b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo615c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0205c.this.mo1530i();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0492a.m2636a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* compiled from: ActionMenuPresenter */
    private class C0211e extends C0146m {
        public C0211e(Context context, C0132g gVar, View view, boolean z) {
            super(context, gVar, view, z, C3858a.actionOverflowMenuStyle);
            mo975a(8388613);
            mo978a((C0149a) C0205c.this.f983t0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo983d() {
            if (C0205c.this.f506V != null) {
                C0205c.this.f506V.close();
            }
            C0205c.this.f979p0 = null;
            super.mo983d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* compiled from: ActionMenuPresenter */
    private class C0212f implements C0149a {
        C0212f() {
        }

        /* renamed from: a */
        public boolean mo534a(C0132g gVar) {
            boolean z = false;
            if (gVar == null) {
                return false;
            }
            C0205c.this.f984u0 = ((C0157s) gVar).getItem().getItemId();
            C0149a b = C0205c.this.mo718b();
            if (b != null) {
                z = b.mo534a(gVar);
            }
            return z;
        }

        /* renamed from: a */
        public void mo533a(C0132g gVar, boolean z) {
            if (gVar instanceof C0157s) {
                gVar.mo823m().mo780a(false);
            }
            C0149a b = C0205c.this.mo718b();
            if (b != null) {
                b.mo533a(gVar, z);
            }
        }
    }

    public C0205c(Context context) {
        super(context, C3864g.abc_action_menu_layout, C3864g.abc_action_menu_item_layout);
    }

    /* renamed from: g */
    public boolean mo1528g() {
        return this.f981r0 != null || mo1529h();
    }

    /* renamed from: h */
    public boolean mo1529h() {
        C0211e eVar = this.f979p0;
        return eVar != null && eVar.mo982c();
    }

    /* renamed from: i */
    public boolean mo1530i() {
        if (this.f968e0 && !mo1529h()) {
            C0132g gVar = this.f506V;
            if (gVar != null && this.f511a0 != null && this.f981r0 == null && !gVar.mo820j().isEmpty()) {
                C0211e eVar = new C0211e(this.f505U, this.f506V, this.f965b0, true);
                this.f981r0 = new C0208c(eVar);
                ((View) this.f511a0).post(this.f981r0);
                super.mo717a((C0157s) null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo708a(Context context, C0132g gVar) {
        super.mo708a(context, gVar);
        Resources resources = context.getResources();
        C3888a a = C3888a.m13030a(context);
        if (!this.f969f0) {
            this.f968e0 = a.mo13907g();
        }
        if (!this.f975l0) {
            this.f970g0 = a.mo13902b();
        }
        if (!this.f973j0) {
            this.f972i0 = a.mo13903c();
        }
        int i = this.f970g0;
        if (this.f968e0) {
            if (this.f965b0 == null) {
                this.f965b0 = new C0209d(this.f512c);
                if (this.f967d0) {
                    this.f965b0.setImageDrawable(this.f966c0);
                    this.f966c0 = null;
                    this.f967d0 = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f965b0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f965b0.getMeasuredWidth();
        } else {
            this.f965b0 = null;
        }
        this.f971h0 = i;
        this.f977n0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: b */
    public void mo1522b(boolean z) {
        this.f976m0 = z;
    }

    /* renamed from: c */
    public void mo1523c(boolean z) {
        this.f968e0 = z;
        this.f969f0 = true;
    }

    /* renamed from: d */
    public Drawable mo1525d() {
        C0209d dVar = this.f965b0;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f967d0) {
            return this.f966c0;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo1526e() {
        C0208c cVar = this.f981r0;
        if (cVar != null) {
            C0150o oVar = this.f511a0;
            if (oVar != null) {
                ((View) oVar).removeCallbacks(cVar);
                this.f981r0 = null;
                return true;
            }
        }
        C0211e eVar = this.f979p0;
        if (eVar == null) {
            return false;
        }
        eVar.mo974a();
        return true;
    }

    /* renamed from: f */
    public boolean mo1527f() {
        C0206a aVar = this.f980q0;
        if (aVar == null) {
            return false;
        }
        aVar.mo974a();
        return true;
    }

    /* renamed from: b */
    public C0150o mo719b(ViewGroup viewGroup) {
        C0150o oVar = this.f511a0;
        C0150o b = super.mo719b(viewGroup);
        if (oVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: c */
    public boolean mo1524c() {
        return mo1526e() | mo1527f();
    }

    /* renamed from: a */
    public void mo1519a(Configuration configuration) {
        if (!this.f973j0) {
            this.f972i0 = C3888a.m13030a(this.f505U).mo13903c();
        }
        C0132g gVar = this.f506V;
        if (gVar != null) {
            gVar.mo798b(true);
        }
    }

    /* renamed from: a */
    public void mo1520a(Drawable drawable) {
        C0209d dVar = this.f965b0;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f967d0 = true;
        this.f966c0 = drawable;
    }

    /* renamed from: a */
    public View mo705a(C0137j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo857f()) {
            actionView = super.mo705a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo711a(C0137j jVar, C0151a aVar) {
        aVar.mo612a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f511a0);
        if (this.f982s0 == null) {
            this.f982s0 = new C0207b();
        }
        actionMenuItemView.setPopupCallback(this.f982s0);
    }

    /* renamed from: a */
    public boolean mo714a(int i, C0137j jVar) {
        return jVar.mo871h();
    }

    /* renamed from: a */
    public void mo713a(boolean z) {
        super.mo713a(z);
        ((View) this.f511a0).requestLayout();
        C0132g gVar = this.f506V;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList c = gVar.mo801c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C4124b a = ((C0137j) c.get(i)).mo650a();
                if (a != null) {
                    a.mo14689a((C4125a) this);
                }
            }
        }
        C0132g gVar2 = this.f506V;
        ArrayList j = gVar2 != null ? gVar2.mo820j() : null;
        if (this.f968e0 && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !((C0137j) j.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f965b0 == null) {
                this.f965b0 = new C0209d(this.f512c);
            }
            ViewGroup viewGroup = (ViewGroup) this.f965b0.getParent();
            if (viewGroup != this.f511a0) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f965b0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f511a0;
                actionMenuView.addView(this.f965b0, actionMenuView.mo1137e());
            }
        } else {
            C0209d dVar = this.f965b0;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                C0150o oVar = this.f511a0;
                if (parent == oVar) {
                    ((ViewGroup) oVar).removeView(this.f965b0);
                }
            }
        }
        ((ActionMenuView) this.f511a0).setOverflowReserved(this.f968e0);
    }

    /* renamed from: a */
    public boolean mo715a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f965b0) {
            return false;
        }
        return super.mo715a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo717a(C0157s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        C0157s sVar2 = sVar;
        while (sVar2.mo1024t() != this.f506V) {
            sVar2 = (C0157s) sVar2.mo1024t();
        }
        View a = m1176a(sVar2.getItem());
        if (a == null) {
            return false;
        }
        sVar.getItem().getItemId();
        int size = sVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f980q0 = new C0206a(this.f505U, sVar, a);
        this.f980q0.mo979a(z);
        this.f980q0.mo984e();
        super.mo717a(sVar);
        return true;
    }

    /* renamed from: a */
    private View m1176a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f511a0;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0151a) && ((C0151a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo730a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        C0205c cVar = this;
        C0132g gVar = cVar.f506V;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo824n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f972i0;
        int i7 = cVar.f971h0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f511a0;
        int i8 = i6;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0137j jVar = (C0137j) arrayList.get(i11);
            if (jVar.mo879k()) {
                i9++;
            } else if (jVar.mo878j()) {
                i10++;
            } else {
                z = true;
            }
            if (cVar.f976m0 && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (cVar.f968e0 && (z || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.f978o0;
        sparseBooleanArray.clear();
        if (cVar.f974k0) {
            int i13 = cVar.f977n0;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0137j jVar2 = (C0137j) arrayList.get(i15);
            if (jVar2.mo879k()) {
                View a = cVar.mo705a(jVar2, view, viewGroup);
                if (cVar.f974k0) {
                    i2 -= ActionMenuView.m998a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.mo854d(true);
                i16 = measuredWidth;
                i4 = i;
            } else if (jVar2.mo878j()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i14 > 0 && (!cVar.f974k0 || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = cVar.mo705a(jVar2, null, viewGroup);
                    if (cVar.f974k0) {
                        int a3 = ActionMenuView.m998a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        z4 = a3 == 0 ? false : z4;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z3 = z4 & (!cVar.f974k0 ? i14 + i16 > 0 : i14 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0137j jVar3 = (C0137j) arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo871h()) {
                                i12++;
                            }
                            jVar3.mo854d(false);
                        }
                        i17++;
                    }
                }
                if (z3) {
                    i12--;
                }
                jVar2.mo854d(z3);
            } else {
                i4 = i;
                jVar2.mo854d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                cVar = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            cVar = this;
        }
        return true;
    }

    /* renamed from: a */
    public void mo710a(C0132g gVar, boolean z) {
        mo1524c();
        super.mo710a(gVar, z);
    }

    /* renamed from: a */
    public void mo1521a(ActionMenuView actionMenuView) {
        this.f511a0 = actionMenuView;
        actionMenuView.mo634a(this.f506V);
    }
}
