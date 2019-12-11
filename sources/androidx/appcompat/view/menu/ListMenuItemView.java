package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0150o.C0151a;
import androidx.appcompat.widget.C0284t0;
import p096e.p097a.C3858a;
import p096e.p097a.C3863f;
import p096e.p097a.C3864g;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

public class ListMenuItemView extends LinearLayout implements C0151a, SelectionBoundsAdjuster {

    /* renamed from: U */
    private ImageView f469U;

    /* renamed from: V */
    private RadioButton f470V;

    /* renamed from: W */
    private TextView f471W;

    /* renamed from: a0 */
    private CheckBox f472a0;

    /* renamed from: b0 */
    private TextView f473b0;

    /* renamed from: c */
    private C0137j f474c;

    /* renamed from: c0 */
    private ImageView f475c0;

    /* renamed from: d0 */
    private ImageView f476d0;

    /* renamed from: e0 */
    private LinearLayout f477e0;

    /* renamed from: f0 */
    private Drawable f478f0;

    /* renamed from: g0 */
    private int f479g0;

    /* renamed from: h0 */
    private Context f480h0;

    /* renamed from: i0 */
    private boolean f481i0;

    /* renamed from: j0 */
    private Drawable f482j0;

    /* renamed from: k0 */
    private boolean f483k0;

    /* renamed from: l0 */
    private LayoutInflater f484l0;

    /* renamed from: m0 */
    private boolean f485m0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.listMenuViewStyle);
    }

    /* renamed from: b */
    private void m713b() {
        this.f472a0 = (CheckBox) getInflater().inflate(C3864g.abc_list_menu_item_checkbox, this, false);
        m711a(this.f472a0);
    }

    /* renamed from: c */
    private void m714c() {
        this.f469U = (ImageView) getInflater().inflate(C3864g.abc_list_menu_item_icon, this, false);
        m712a((View) this.f469U, 0);
    }

    /* renamed from: d */
    private void m715d() {
        this.f470V = (RadioButton) getInflater().inflate(C3864g.abc_list_menu_item_radio, this, false);
        m711a(this.f470V);
    }

    private LayoutInflater getInflater() {
        if (this.f484l0 == null) {
            this.f484l0 = LayoutInflater.from(getContext());
        }
        return this.f484l0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f475c0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo612a(C0137j jVar, int i) {
        this.f474c = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo845a((C0151a) this));
        setCheckable(jVar.isCheckable());
        mo639a(jVar.mo881m(), jVar.mo853d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public boolean mo613a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f476d0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f476d0.getLayoutParams();
            rect.top += this.f476d0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C0137j getItemData() {
        return this.f474c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C4187x.m14358a((View) this, this.f478f0);
        this.f471W = (TextView) findViewById(C3863f.title);
        int i = this.f479g0;
        if (i != -1) {
            this.f471W.setTextAppearance(this.f480h0, i);
        }
        this.f473b0 = (TextView) findViewById(C3863f.shortcut);
        this.f475c0 = (ImageView) findViewById(C3863f.submenuarrow);
        ImageView imageView = this.f475c0;
        if (imageView != null) {
            imageView.setImageDrawable(this.f482j0);
        }
        this.f476d0 = (ImageView) findViewById(C3863f.group_divider);
        this.f477e0 = (LinearLayout) findViewById(C3863f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f469U != null && this.f481i0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f469U.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f470V != null || this.f472a0 != null) {
            if (this.f474c.mo873i()) {
                if (this.f470V == null) {
                    m715d();
                }
                compoundButton2 = this.f470V;
                compoundButton = this.f472a0;
            } else {
                if (this.f472a0 == null) {
                    m713b();
                }
                compoundButton2 = this.f472a0;
                compoundButton = this.f470V;
            }
            if (z) {
                compoundButton2.setChecked(this.f474c.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f472a0;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f470V;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f474c.mo873i()) {
            if (this.f470V == null) {
                m715d();
            }
            compoundButton = this.f470V;
        } else {
            if (this.f472a0 == null) {
                m713b();
            }
            compoundButton = this.f472a0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f485m0 = z;
        this.f481i0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f476d0;
        if (imageView != null) {
            imageView.setVisibility((this.f483k0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f474c.mo880l() || this.f485m0;
        if (!z && !this.f481i0) {
            return;
        }
        if (this.f469U != null || drawable != null || this.f481i0) {
            if (this.f469U == null) {
                m714c();
            }
            if (drawable != null || this.f481i0) {
                ImageView imageView = this.f469U;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f469U.getVisibility() != 0) {
                    this.f469U.setVisibility(0);
                }
            } else {
                this.f469U.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f471W.setText(charSequence);
            if (this.f471W.getVisibility() != 0) {
                this.f471W.setVisibility(0);
            }
        } else if (this.f471W.getVisibility() != 8) {
            this.f471W.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0284t0 a = C0284t0.m1486a(getContext(), attributeSet, C3867j.MenuView, i, 0);
        this.f478f0 = a.mo1912b(C3867j.MenuView_android_itemBackground);
        this.f479g0 = a.mo1921g(C3867j.MenuView_android_itemTextAppearance, -1);
        this.f481i0 = a.mo1909a(C3867j.MenuView_preserveIconSpacing, false);
        this.f480h0 = context;
        this.f482j0 = a.mo1912b(C3867j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C3858a.dropDownListViewStyle, 0);
        this.f483k0 = obtainStyledAttributes.hasValue(0);
        a.mo1908a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m711a(View view) {
        m712a(view, -1);
    }

    /* renamed from: a */
    private void m712a(View view, int i) {
        LinearLayout linearLayout = this.f477e0;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public void mo639a(boolean z, char c) {
        int i = (!z || !this.f474c.mo881m()) ? 8 : 0;
        if (i == 0) {
            this.f473b0.setText(this.f474c.mo855e());
        }
        if (this.f473b0.getVisibility() != i) {
            this.f473b0.setVisibility(i);
        }
    }
}
