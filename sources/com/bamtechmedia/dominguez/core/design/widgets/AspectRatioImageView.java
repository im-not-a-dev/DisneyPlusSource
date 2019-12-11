package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.p088i.p090o.C3846a;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p122j.C4025a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J(\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0012\u0010\"\u001a\u00020\u00132\b\b\u0001\u0010#\u001a\u00020\u0007H\u0016J\u0012\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0018H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "foregroundDrawableCompat", "Lcom/bamtechmedia/dominguez/core/design/compat/ForegroundDrawableCompat;", "value", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "ratio", "getRatio", "()Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "setRatio", "(Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawableStateChanged", "getForegroundDrawable", "Landroid/graphics/drawable/Drawable;", "jumpDrawablesToCurrentState", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "verifyDrawable", "", "who", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AspectRatioImageView.kt */
public final class AspectRatioImageView extends AppCompatImageView {

    /* renamed from: V */
    private C3623a f13194V;

    /* renamed from: W */
    private final C3846a f13195W;

    public AspectRatioImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AspectRatioImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f13195W.mo13758a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f13195W.mo13756a();
    }

    public final Drawable getForegroundDrawable() {
        return this.f13195W.mo13760b();
    }

    public final C3623a getRatio() {
        return this.f13194V;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f13195W.mo13762c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayoutParams().width == 0) {
            setMeasuredDimension(C12737d.m39876b(((float) getMeasuredHeight()) * this.f13194V.mo13242X()), getMeasuredHeight());
        } else if (getLayoutParams().height == 0) {
            setMeasuredDimension(getMeasuredWidth(), C12737d.m39876b(((float) getMeasuredWidth()) / this.f13194V.mo13242X()));
        } else {
            throw new IllegalStateException("Either layout_width or layout_height must be set to 0dpfor AspectRatioImageView to work");
        }
        this.f13195W.mo13757a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13195W.mo13757a(i, i2);
    }

    public void setImageResource(int i) {
        super.setImageDrawable(C4025a.m13798c(getContext(), i));
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public final void setRatio(C3623a aVar) {
        if (!C12880j.m40224a((Object) this.f13194V, (Object) aVar)) {
            this.f13194V = aVar;
            if (!isInLayout()) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f13195W.mo13761b(drawable);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        C3623a aVar;
        super(context, attributeSet, i);
        this.f13194V = C3623a.f9125b0.mo13248a();
        this.f13195W = new C3846a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3843m.AspectRatioImageView);
        float f = obtainStyledAttributes.getFloat(C3843m.AspectRatioImageView_floatRatio, 0.0f);
        if (f != 0.0f) {
            aVar = new C3623a(f);
        } else {
            int i2 = obtainStyledAttributes.getInt(C3843m.AspectRatioImageView_aspectRato, 0);
            if (i2 == 1) {
                aVar = C3623a.f9125b0.mo13253e();
            } else if (i2 == 2) {
                aVar = C3623a.f9125b0.mo13252d();
            } else if (i2 != 3) {
                aVar = C3623a.f9125b0.mo13248a();
            } else {
                aVar = C3623a.f9125b0.mo13251c();
            }
        }
        setRatio(aVar);
        this.f13195W.mo13759a(obtainStyledAttributes.getDrawable(C3843m.AspectRatioImageView_foreground));
        obtainStyledAttributes.recycle();
    }
}
