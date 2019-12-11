package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0148n;
import p096e.p097a.C3858a;
import p096e.p097a.C3863f;
import p096e.p097a.C3864g;
import p096e.p097a.C3867j;
import p096e.p097a.p104o.C3889b;
import p096e.p121h.p135s.C4187x;

public class ActionBarContextView extends C0199a {

    /* renamed from: e0 */
    private CharSequence f694e0;

    /* renamed from: f0 */
    private CharSequence f695f0;

    /* renamed from: g0 */
    private View f696g0;

    /* renamed from: h0 */
    private View f697h0;

    /* renamed from: i0 */
    private LinearLayout f698i0;

    /* renamed from: j0 */
    private TextView f699j0;

    /* renamed from: k0 */
    private TextView f700k0;

    /* renamed from: l0 */
    private int f701l0;

    /* renamed from: m0 */
    private int f702m0;

    /* renamed from: n0 */
    private boolean f703n0;

    /* renamed from: o0 */
    private int f704o0;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0159a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C3889b f705c;

        C0159a(ActionBarContextView actionBarContextView, C3889b bVar) {
            this.f705c = bVar;
        }

        public void onClick(View view) {
            this.f705c.mo597a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m960e() {
        if (this.f698i0 == null) {
            LayoutInflater.from(getContext()).inflate(C3864g.abc_action_bar_title_item, this);
            this.f698i0 = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f699j0 = (TextView) this.f698i0.findViewById(C3863f.action_bar_title);
            this.f700k0 = (TextView) this.f698i0.findViewById(C3863f.action_bar_subtitle);
            if (this.f701l0 != 0) {
                this.f699j0.setTextAppearance(getContext(), this.f701l0);
            }
            if (this.f702m0 != 0) {
                this.f700k0.setTextAppearance(getContext(), this.f702m0);
            }
        }
        this.f699j0.setText(this.f694e0);
        this.f700k0.setText(this.f695f0);
        boolean z = !TextUtils.isEmpty(this.f694e0);
        boolean z2 = !TextUtils.isEmpty(this.f695f0);
        int i = 0;
        this.f700k0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f698i0;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f698i0.getParent() == null) {
            addView(this.f698i0);
        }
    }

    /* renamed from: b */
    public boolean mo1054b() {
        return this.f703n0;
    }

    /* renamed from: c */
    public void mo1055c() {
        removeAllViews();
        this.f697h0 = null;
        this.f950V = null;
    }

    /* renamed from: d */
    public boolean mo1056d() {
        C0205c cVar = this.f951W;
        if (cVar != null) {
            return cVar.mo1530i();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f695f0;
    }

    public CharSequence getTitle() {
        return this.f694e0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0205c cVar = this.f951W;
        if (cVar != null) {
            cVar.mo1526e();
            this.f951W.mo1527f();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f694e0);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0302z0.m1635a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f696g0;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f696g0.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0199a.m1138a(paddingRight, i6, a);
            i5 = C0199a.m1138a(a2 + mo1477a(this.f696g0, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f698i0;
        if (!(linearLayout == null || this.f697h0 != null || linearLayout.getVisibility() == 8)) {
            i5 += mo1477a(this.f698i0, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f697h0;
        if (view2 != null) {
            mo1477a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f950V;
        if (actionMenuView != null) {
            mo1477a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f952a0;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f696g0;
            if (view != null) {
                int a = mo1476a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f696g0.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f950V;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1476a(this.f950V, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f698i0;
            if (linearLayout != null && this.f697h0 == null) {
                if (this.f703n0) {
                    this.f698i0.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f698i0.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f698i0.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1476a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f697h0;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f697h0.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f952a0 <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void setContentHeight(int i) {
        this.f952a0 = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f697h0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f697h0 = view;
        if (view != null) {
            LinearLayout linearLayout = this.f698i0;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f698i0 = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f695f0 = charSequence;
        m960e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f694e0 = charSequence;
        m960e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f703n0) {
            requestLayout();
        }
        this.f703n0 = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.actionModeStyle);
    }

    /* renamed from: a */
    public void mo1053a(C3889b bVar) {
        View view = this.f696g0;
        if (view == null) {
            this.f696g0 = LayoutInflater.from(getContext()).inflate(this.f704o0, this, false);
            addView(this.f696g0);
        } else if (view.getParent() == null) {
            addView(this.f696g0);
        }
        this.f696g0.findViewById(C3863f.action_mode_close_button).setOnClickListener(new C0159a(this, bVar));
        C0132g gVar = (C0132g) bVar.mo605c();
        C0205c cVar = this.f951W;
        if (cVar != null) {
            cVar.mo1524c();
        }
        this.f951W = new C0205c(getContext());
        this.f951W.mo1523c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        gVar.mo778a((C0148n) this.f951W, this.f949U);
        this.f950V = (ActionMenuView) this.f951W.mo719b((ViewGroup) this);
        C4187x.m14358a((View) this.f950V, (Drawable) null);
        addView(this.f950V, layoutParams);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0284t0 a = C0284t0.m1486a(context, attributeSet, C3867j.ActionMode, i, 0);
        C4187x.m14358a((View) this, a.mo1912b(C3867j.ActionMode_background));
        this.f701l0 = a.mo1921g(C3867j.ActionMode_titleTextStyle, 0);
        this.f702m0 = a.mo1921g(C3867j.ActionMode_subtitleTextStyle, 0);
        this.f952a0 = a.mo1919f(C3867j.ActionMode_height, 0);
        this.f704o0 = a.mo1921g(C3867j.ActionMode_closeItemLayout, C3864g.abc_action_mode_close_item_material);
        a.mo1908a();
    }

    /* renamed from: a */
    public void mo1052a() {
        if (this.f696g0 == null) {
            mo1055c();
        }
    }
}
