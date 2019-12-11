package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.C0132g.C0134b;
import androidx.appcompat.view.menu.C0150o.C0151a;
import androidx.appcompat.widget.ActionMenuView.C0165a;
import androidx.appcompat.widget.C0220e0;
import androidx.appcompat.widget.C0292v0;
import androidx.appcompat.widget.C0293w;
import p096e.p097a.C3867j;

public class ActionMenuItemView extends C0293w implements C0151a, OnClickListener, C0165a {

    /* renamed from: a0 */
    C0137j f454a0;

    /* renamed from: b0 */
    private CharSequence f455b0;

    /* renamed from: c0 */
    private Drawable f456c0;

    /* renamed from: d0 */
    C0134b f457d0;

    /* renamed from: e0 */
    private C0220e0 f458e0;

    /* renamed from: f0 */
    C0119b f459f0;

    /* renamed from: g0 */
    private boolean f460g0;

    /* renamed from: h0 */
    private boolean f461h0;

    /* renamed from: i0 */
    private int f462i0;

    /* renamed from: j0 */
    private int f463j0;

    /* renamed from: k0 */
    private int f464k0;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0118a extends C0220e0 {
        public C0118a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0153q mo631a() {
            C0119b bVar = ActionMenuItemView.this.f459f0;
            if (bVar != null) {
                return bVar.mo633a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo632b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0134b bVar = actionMenuItemView.f457d0;
            if (bVar == null || !bVar.mo635a(actionMenuItemView.f454a0)) {
                return false;
            }
            C0153q a = mo631a();
            if (a == null || !a.mo733b()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0119b {
        /* renamed from: a */
        public abstract C0153q mo633a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private boolean m699e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m700f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f455b0);
        if (this.f456c0 != null && (!this.f454a0.mo882n() || (!this.f460g0 && !this.f461h0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f455b0 : null);
        CharSequence contentDescription = this.f454a0.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f454a0.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f454a0.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f454a0.getTitle();
            }
            C0292v0.m1576a(this, charSequence2);
            return;
        }
        C0292v0.m1576a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo612a(C0137j jVar, int i) {
        this.f454a0 = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo845a((C0151a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f458e0 == null) {
            this.f458e0 = new C0118a();
        }
    }

    /* renamed from: a */
    public boolean mo613a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo614b() {
        return mo616d();
    }

    /* renamed from: c */
    public boolean mo615c() {
        return mo616d() && this.f454a0.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo616d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0137j getItemData() {
        return this.f454a0;
    }

    public void onClick(View view) {
        C0134b bVar = this.f457d0;
        if (bVar != null) {
            bVar.mo635a(this.f454a0);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f460g0 = m699e();
        m700f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean d = mo616d();
        if (d) {
            int i3 = this.f463j0;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f462i0) : this.f462i0;
        if (mode != 1073741824 && this.f462i0 > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f456c0 != null) {
            super.setPadding((getMeasuredWidth() - this.f456c0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f454a0.hasSubMenu()) {
            C0220e0 e0Var = this.f458e0;
            if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f461h0 != z) {
            this.f461h0 = z;
            C0137j jVar = this.f454a0;
            if (jVar != null) {
                jVar.mo849b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f456c0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f464k0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f464k0;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m700f();
    }

    public void setItemInvoker(C0134b bVar) {
        this.f457d0 = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f463j0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0119b bVar) {
        this.f459f0 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f455b0 = charSequence;
        m700f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f460g0 = m699e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ActionMenuItemView, i, 0);
        this.f462i0 = obtainStyledAttributes.getDimensionPixelSize(C3867j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f464k0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f463j0 = -1;
        setSaveEnabled(false);
    }
}
