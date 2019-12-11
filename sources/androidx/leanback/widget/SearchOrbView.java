package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p096e.p121h.p135s.C4187x;
import p096e.p146l.C4223a;
import p096e.p146l.C4224b;
import p096e.p146l.C4225c;
import p096e.p146l.C4226d;
import p096e.p146l.C4227e;
import p096e.p146l.C4228f;
import p096e.p146l.C4229g;
import p096e.p146l.C4230h;
import p096e.p146l.C4234l;

public class SearchOrbView extends FrameLayout implements OnClickListener {

    /* renamed from: U */
    private View f2709U;

    /* renamed from: V */
    private View f2710V;

    /* renamed from: W */
    private ImageView f2711W;

    /* renamed from: a0 */
    private Drawable f2712a0;

    /* renamed from: b0 */
    private C0635c f2713b0;

    /* renamed from: c */
    private OnClickListener f2714c;

    /* renamed from: c0 */
    private final float f2715c0;

    /* renamed from: d0 */
    private final int f2716d0;

    /* renamed from: e0 */
    private final int f2717e0;

    /* renamed from: f0 */
    private final float f2718f0;

    /* renamed from: g0 */
    private final float f2719g0;

    /* renamed from: h0 */
    private ValueAnimator f2720h0;

    /* renamed from: i0 */
    private boolean f2721i0;

    /* renamed from: j0 */
    private boolean f2722j0;

    /* renamed from: k0 */
    private final ArgbEvaluator f2723k0;

    /* renamed from: l0 */
    private final AnimatorUpdateListener f2724l0;

    /* renamed from: m0 */
    private ValueAnimator f2725m0;

    /* renamed from: n0 */
    private final AnimatorUpdateListener f2726n0;

    /* renamed from: androidx.leanback.widget.SearchOrbView$a */
    class C0633a implements AnimatorUpdateListener {
        C0633a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchOrbView$b */
    class C0634b implements AnimatorUpdateListener {
        C0634b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchOrbView$c */
    public static class C0635c {

        /* renamed from: a */
        public int f2729a;

        /* renamed from: b */
        public int f2730b;

        /* renamed from: c */
        public int f2731c;

        public C0635c(int i, int i2, int i3) {
            this.f2729a = i;
            if (i2 == i) {
                i2 = m3264a(i);
            }
            this.f2730b = i2;
            this.f2731c = i3;
        }

        /* renamed from: a */
        public static int m3264a(int i) {
            return Color.argb((int) ((((float) Color.alpha(i)) * 0.85f) + 38.25f), (int) ((((float) Color.red(i)) * 0.85f) + 38.25f), (int) ((((float) Color.green(i)) * 0.85f) + 38.25f), (int) ((((float) Color.blue(i)) * 0.85f) + 38.25f));
        }
    }

    public SearchOrbView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3594a(float f) {
        this.f2710V.setScaleX(f);
        this.f2710V.setScaleY(f);
    }

    /* renamed from: b */
    public void mo3596b(boolean z) {
        this.f2721i0 = z;
        mo3634a();
    }

    /* access modifiers changed from: 0000 */
    public float getFocusedZoom() {
        return this.f2715c0;
    }

    /* access modifiers changed from: 0000 */
    public int getLayoutResourceId() {
        return C4230h.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f2713b0.f2729a;
    }

    public C0635c getOrbColors() {
        return this.f2713b0;
    }

    public Drawable getOrbIcon() {
        return this.f2712a0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2722j0 = true;
        mo3634a();
    }

    public void onClick(View view) {
        OnClickListener onClickListener = this.f2714c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f2722j0 = false;
        mo3634a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo3595a(z);
    }

    public void setOnOrbClickedListener(OnClickListener onClickListener) {
        this.f2714c = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new C0635c(i, i, 0));
    }

    public void setOrbColors(C0635c cVar) {
        this.f2713b0 = cVar;
        this.f2711W.setColorFilter(this.f2713b0.f2731c);
        if (this.f2720h0 == null) {
            setOrbViewColor(this.f2713b0.f2729a);
        } else {
            mo3596b(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f2712a0 = drawable;
        this.f2711W.setImageDrawable(this.f2712a0);
    }

    /* access modifiers changed from: 0000 */
    public void setOrbViewColor(int i) {
        if (this.f2710V.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f2710V.getBackground()).setColor(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setSearchOrbZ(float f) {
        View view = this.f2710V;
        float f2 = this.f2718f0;
        C4187x.m14385e(view, f2 + (f * (this.f2719g0 - f2)));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4223a.searchOrbViewStyle);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2723k0 = new ArgbEvaluator();
        this.f2724l0 = new C0633a();
        this.f2726n0 = new C0634b();
        Resources resources = context.getResources();
        this.f2709U = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), this, true);
        this.f2710V = this.f2709U.findViewById(C4228f.search_orb);
        this.f2711W = (ImageView) this.f2709U.findViewById(C4228f.icon);
        this.f2715c0 = context.getResources().getFraction(C4227e.lb_search_orb_focused_zoom, 1, 1);
        this.f2716d0 = context.getResources().getInteger(C4229g.lb_search_orb_pulse_duration_ms);
        this.f2717e0 = context.getResources().getInteger(C4229g.lb_search_orb_scale_duration_ms);
        this.f2719g0 = (float) context.getResources().getDimensionPixelSize(C4225c.lb_search_orb_focused_z);
        this.f2718f0 = (float) context.getResources().getDimensionPixelSize(C4225c.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbSearchOrbView, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C4234l.lbSearchOrbView_searchOrbIcon);
        if (drawable == null) {
            drawable = resources.getDrawable(C4226d.lb_ic_in_app_search);
        }
        setOrbIcon(drawable);
        int color = obtainStyledAttributes.getColor(C4234l.lbSearchOrbView_searchOrbColor, resources.getColor(C4224b.lb_default_search_color));
        setOrbColors(new C0635c(color, obtainStyledAttributes.getColor(C4234l.lbSearchOrbView_searchOrbBrightColor, color), obtainStyledAttributes.getColor(C4234l.lbSearchOrbView_searchOrbIconColor, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        C4187x.m14385e((View) this.f2711W, this.f2719g0);
    }

    /* renamed from: a */
    private void m3260a(boolean z, int i) {
        if (this.f2725m0 == null) {
            this.f2725m0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f2725m0.addUpdateListener(this.f2726n0);
        }
        if (z) {
            this.f2725m0.start();
        } else {
            this.f2725m0.reverse();
        }
        this.f2725m0.setDuration((long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3595a(boolean z) {
        float f = z ? this.f2715c0 : 1.0f;
        this.f2709U.animate().scaleX(f).scaleY(f).setDuration((long) this.f2717e0).start();
        m3260a(z, this.f2717e0);
        mo3596b(z);
    }

    /* renamed from: a */
    private void mo3634a() {
        ValueAnimator valueAnimator = this.f2720h0;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f2720h0 = null;
        }
        if (this.f2721i0 && this.f2722j0) {
            this.f2720h0 = ValueAnimator.ofObject(this.f2723k0, new Object[]{Integer.valueOf(this.f2713b0.f2729a), Integer.valueOf(this.f2713b0.f2730b), Integer.valueOf(this.f2713b0.f2729a)});
            this.f2720h0.setRepeatCount(-1);
            this.f2720h0.setDuration((long) (this.f2716d0 * 2));
            this.f2720h0.addUpdateListener(this.f2724l0);
            this.f2720h0.start();
        }
    }
}
