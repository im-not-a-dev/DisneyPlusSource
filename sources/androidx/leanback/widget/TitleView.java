package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.C0695x.C0696a;
import androidx.leanback.widget.SearchOrbView.C0635c;
import p096e.p146l.C4223a;
import p096e.p146l.C4228f;
import p096e.p146l.C4230h;

public class TitleView extends FrameLayout implements C0696a {

    /* renamed from: U */
    private TextView f2759U;

    /* renamed from: V */
    private SearchOrbView f2760V;

    /* renamed from: W */
    private int f2761W;

    /* renamed from: a0 */
    private boolean f2762a0;

    /* renamed from: b0 */
    private final C0695x f2763b0;

    /* renamed from: c */
    private ImageView f2764c;

    /* renamed from: androidx.leanback.widget.TitleView$a */
    class C0637a extends C0695x {
        C0637a(TitleView titleView) {
        }
    }

    public TitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m3274a() {
        if (this.f2764c.getDrawable() != null) {
            this.f2764c.setVisibility(0);
            this.f2759U.setVisibility(8);
            return;
        }
        this.f2764c.setVisibility(8);
        this.f2759U.setVisibility(0);
    }

    /* renamed from: b */
    private void m3275b() {
        int i = 4;
        if (this.f2762a0 && (this.f2761W & 4) == 4) {
            i = 0;
        }
        this.f2760V.setVisibility(i);
    }

    public Drawable getBadgeDrawable() {
        return this.f2764c.getDrawable();
    }

    public C0635c getSearchAffordanceColors() {
        return this.f2760V.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f2760V;
    }

    public CharSequence getTitle() {
        return this.f2759U.getText();
    }

    public C0695x getTitleViewAdapter() {
        return this.f2763b0;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f2764c.setImageDrawable(drawable);
        m3274a();
    }

    public void setOnSearchClickedListener(OnClickListener onClickListener) {
        this.f2762a0 = onClickListener != null;
        this.f2760V.setOnOrbClickedListener(onClickListener);
        m3275b();
    }

    public void setSearchAffordanceColors(C0635c cVar) {
        this.f2760V.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2759U.setText(charSequence);
        m3274a();
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4223a.browseTitleViewStyle);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2761W = 6;
        this.f2762a0 = false;
        this.f2763b0 = new C0637a(this);
        View inflate = LayoutInflater.from(context).inflate(C4230h.lb_title_view, this);
        this.f2764c = (ImageView) inflate.findViewById(C4228f.title_badge);
        this.f2759U = (TextView) inflate.findViewById(C4228f.title_text);
        this.f2760V = (SearchOrbView) inflate.findViewById(C4228f.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
