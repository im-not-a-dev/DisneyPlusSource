package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: CircleImageView */
class C0982a extends ImageView {

    /* renamed from: U */
    int f3861U;

    /* renamed from: c */
    private AnimationListener f3862c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* compiled from: CircleImageView */
    private class C0983a extends OvalShape {

        /* renamed from: U */
        private Paint f3863U = new Paint();

        /* renamed from: c */
        private RadialGradient f3865c;

        C0983a(int i) {
            C0982a.this.f3861U = i;
            m5266a((int) rect().width());
        }

        /* renamed from: a */
        private void m5266a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C0982a.this.f3861U, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f3865c = radialGradient;
            this.f3863U.setShader(this.f3865c);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0982a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0982a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f3863U);
            canvas.drawCircle(f, height, (float) (width - C0982a.this.f3861U), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m5266a((int) f);
        }
    }

    C0982a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f3861U = (int) (3.5f * f);
        if (m5264a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C4187x.m14372b((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0983a(this.f3861U));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f3861U, (float) i3, (float) i2, 503316480);
            int i4 = this.f3861U;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C4187x.m14358a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m5264a() {
        return VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.f3862c;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.f3862c;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m5264a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f3861U * 2), getMeasuredHeight() + (this.f3861U * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: a */
    public void mo5389a(AnimationListener animationListener) {
        this.f3862c = animationListener;
    }
}
