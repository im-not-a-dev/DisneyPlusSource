package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p096e.p146l.C4228f;
import p096e.p146l.C4230h;

public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: U */
    private final ImageView f2597U;

    /* renamed from: V */
    private final ImageView f2598V;

    /* renamed from: W */
    private final ObjectAnimator f2599W;

    /* renamed from: a0 */
    private final ObjectAnimator f2600a0;

    /* renamed from: b0 */
    private final ObjectAnimator f2601b0;

    /* renamed from: c */
    private final ImageView f2602c;

    /* renamed from: c0 */
    protected final LinearInterpolator f2603c0 = new LinearInterpolator();

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C4230h.lb_playback_now_playing_bars, this, true);
        this.f2602c = (ImageView) findViewById(C4228f.bar1);
        this.f2597U = (ImageView) findViewById(C4228f.bar2);
        this.f2598V = (ImageView) findViewById(C4228f.bar3);
        ImageView imageView = this.f2602c;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        ImageView imageView2 = this.f2597U;
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        ImageView imageView3 = this.f2598V;
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(this.f2602c);
        setDropScale(this.f2597U);
        setDropScale(this.f2598V);
        String str = "scaleY";
        this.f2599W = ObjectAnimator.ofFloat(this.f2602c, str, new float[]{0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f});
        this.f2599W.setRepeatCount(-1);
        this.f2599W.setDuration(2320);
        this.f2599W.setInterpolator(this.f2603c0);
        this.f2600a0 = ObjectAnimator.ofFloat(this.f2597U, str, new float[]{1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f});
        this.f2600a0.setRepeatCount(-1);
        this.f2600a0.setDuration(2080);
        this.f2600a0.setInterpolator(this.f2603c0);
        this.f2601b0 = ObjectAnimator.ofFloat(this.f2598V, str, new float[]{0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f});
        this.f2601b0.setRepeatCount(-1);
        this.f2601b0.setDuration(2000);
        this.f2601b0.setInterpolator(this.f2603c0);
    }

    /* renamed from: a */
    private void m3205a() {
        m3206a(this.f2599W);
        m3206a(this.f2600a0);
        m3206a(this.f2601b0);
        this.f2602c.setVisibility(0);
        this.f2597U.setVisibility(0);
        this.f2598V.setVisibility(0);
    }

    /* renamed from: b */
    private void m3208b() {
        m3207a(this.f2599W, this.f2602c);
        m3207a(this.f2600a0, this.f2597U);
        m3207a(this.f2601b0, this.f2598V);
        this.f2602c.setVisibility(8);
        this.f2597U.setVisibility(8);
        this.f2598V.setVisibility(8);
    }

    static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m3205a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3208b();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m3208b();
        } else {
            m3205a();
        }
    }

    /* renamed from: a */
    private void m3206a(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    /* renamed from: a */
    private void m3207a(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }
}
