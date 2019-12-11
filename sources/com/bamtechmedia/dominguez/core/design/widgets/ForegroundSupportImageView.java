package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.p088i.p090o.C3846a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J(\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0012\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0007H\u0016J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/ForegroundSupportImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "foregroundDrawableCompat", "Lcom/bamtechmedia/dominguez/core/design/compat/ForegroundDrawableCompat;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawableStateChanged", "jumpDrawablesToCurrentState", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "verifyDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ForegroundSupportImageView.kt */
public final class ForegroundSupportImageView extends AppCompatImageView {

    /* renamed from: V */
    private final C3846a f13243V;

    public ForegroundSupportImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ForegroundSupportImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ForegroundSupportImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        this.f13243V.mo13758a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f13243V.mo13756a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f13243V.mo13762c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f13243V.mo13757a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13243V.mo13757a(i, i2);
    }

    public void setImageResource(int i) {
        super.setImageDrawable(C4025a.m13798c(getContext(), i));
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f13243V.mo13761b(drawable);
    }

    public ForegroundSupportImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13243V = new C3846a(this);
        int[] iArr = C3843m.ForegroundSupportImageView;
        Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.ForegroundSupportImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f13243V.mo13759a(obtainStyledAttributes.getDrawable(C3843m.ForegroundSupportImageView_foreground));
        obtainStyledAttributes.recycle();
    }
}
