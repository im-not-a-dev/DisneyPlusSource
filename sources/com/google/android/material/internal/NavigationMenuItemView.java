package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.C0150o.C0151a;
import androidx.appcompat.widget.C0224f0.C0225a;
import androidx.appcompat.widget.C0292v0;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0513i;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3858a;
import p096e.p121h.p122j.p124d.C4039f;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11461e;
import p163g.p449j.p450a.p468b.C11462f;
import p163g.p449j.p450a.p468b.C11464h;

public class NavigationMenuItemView extends C10316e implements C0151a {

    /* renamed from: B0 */
    private static final int[] f24373B0 = {16842912};

    /* renamed from: A0 */
    private final C4119a f24374A0;

    /* renamed from: r0 */
    private final int f24375r0;

    /* renamed from: s0 */
    private boolean f24376s0;

    /* renamed from: t0 */
    boolean f24377t0;

    /* renamed from: u0 */
    private final CheckedTextView f24378u0;

    /* renamed from: v0 */
    private FrameLayout f24379v0;

    /* renamed from: w0 */
    private C0137j f24380w0;

    /* renamed from: x0 */
    private ColorStateList f24381x0;

    /* renamed from: y0 */
    private boolean f24382y0;

    /* renamed from: z0 */
    private Drawable f24383z0;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C10311a extends C4119a {
        C10311a() {
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            dVar.mo14749b(NavigationMenuItemView.this.f24377t0);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m32492d() {
        if (m32494f()) {
            this.f24378u0.setVisibility(8);
            FrameLayout frameLayout = this.f24379v0;
            if (frameLayout != null) {
                C0225a aVar = (C0225a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f24379v0.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f24378u0.setVisibility(0);
        FrameLayout frameLayout2 = this.f24379v0;
        if (frameLayout2 != null) {
            C0225a aVar2 = (C0225a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f24379v0.setLayoutParams(aVar2);
        }
    }

    /* renamed from: e */
    private StateListDrawable m32493e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C3858a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f24373B0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: f */
    private boolean m32494f() {
        return this.f24380w0.getTitle() == null && this.f24380w0.getIcon() == null && this.f24380w0.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f24379v0 == null) {
                this.f24379v0 = (FrameLayout) ((ViewStub) findViewById(C11462f.design_menu_item_action_area_stub)).inflate();
            }
            this.f24379v0.removeAllViews();
            this.f24379v0.addView(view);
        }
    }

    /* renamed from: a */
    public void mo612a(C0137j jVar, int i) {
        this.f24380w0 = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C4187x.m14358a((View) this, (Drawable) m32493e());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0292v0.m1576a(this, jVar.getTooltipText());
        m32492d();
    }

    /* renamed from: a */
    public boolean mo613a() {
        return false;
    }

    public C0137j getItemData() {
        return this.f24380w0;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0137j jVar = this.f24380w0;
        if (jVar != null && jVar.isCheckable() && this.f24380w0.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f24373B0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f24377t0 != z) {
            this.f24377t0 = z;
            this.f24374A0.mo14670a((View) this.f24378u0, (int) DateUtils.FORMAT_NO_MIDNIGHT);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f24378u0.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f24382y0) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0492a.m2652i(drawable).mutate();
                C0492a.m2637a(drawable, this.f24381x0);
            }
            int i = this.f24375r0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f24376s0) {
            if (this.f24383z0 == null) {
                this.f24383z0 = C4039f.m13851a(getResources(), C11461e.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f24383z0;
                if (drawable2 != null) {
                    int i2 = this.f24375r0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f24383z0;
        }
        C0513i.m2769a(this.f24378u0, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f24378u0.setCompoundDrawablePadding(i);
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f24381x0 = colorStateList;
        this.f24382y0 = this.f24381x0 != null;
        C0137j jVar = this.f24380w0;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f24376s0 = z;
    }

    public void setTextAppearance(int i) {
        C0513i.m2778d(this.f24378u0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f24378u0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24378u0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24374A0 = new C10311a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C11464h.design_navigation_menu_item, this, true);
        this.f24375r0 = context.getResources().getDimensionPixelSize(C11460d.design_navigation_icon_size);
        this.f24378u0 = (CheckedTextView) findViewById(C11462f.design_menu_item_text);
        this.f24378u0.setDuplicateParentStateEnabled(true);
        C4187x.m14359a((View) this.f24378u0, this.f24374A0);
    }
}
