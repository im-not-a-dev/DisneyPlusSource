package com.bamtechmedia.dominguez.core.p088i.p090o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/compat/ForegroundDrawableCompat;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "value", "Landroid/graphics/drawable/Drawable;", "foregroundDrawable", "setForegroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawableStateChanged", "getForeground", "jumpToCurrentState", "setBounds", "width", "", "height", "setForeground", "drawable", "verifyDrawable", "", "who", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.i.o.a */
/* compiled from: ForegroundDrawableCompat.kt */
public final class C3846a {

    /* renamed from: a */
    private Drawable f9523a;

    /* renamed from: b */
    private final View f9524b;

    /* renamed from: com.bamtechmedia.dominguez.core.i.o.a$a */
    /* compiled from: ForegroundDrawableCompat.kt */
    static final class C3847a extends C12881k implements Function2<Drawable, Canvas, C13145v> {

        /* renamed from: c */
        public static final C3847a f9525c = new C3847a();

        C3847a() {
            super(2);
        }

        /* renamed from: a */
        public final void mo13763a(Drawable drawable, Canvas canvas) {
            drawable.draw(canvas);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo13763a((Drawable) obj, (Canvas) obj2);
            return C13145v.f29587a;
        }
    }

    public C3846a(View view) {
        this.f9524b = view;
    }

    /* renamed from: c */
    private final void m12923c(Drawable drawable) {
        Drawable drawable2 = this.f9523a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            this.f9524b.unscheduleDrawable(drawable2);
        }
        this.f9523a = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f9524b);
            if (drawable.isStateful()) {
                drawable.setState(this.f9524b.getDrawableState());
            }
        }
        this.f9524b.requestLayout();
        this.f9524b.invalidate();
    }

    /* renamed from: a */
    public final void mo13759a(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            this.f9524b.setForeground(drawable);
        } else {
            m12923c(drawable);
        }
    }

    /* renamed from: b */
    public final Drawable mo13760b() {
        if (VERSION.SDK_INT >= 23) {
            return this.f9524b.getForeground();
        }
        return this.f9523a;
    }

    /* renamed from: a */
    public final void mo13758a(Canvas canvas) {
        C5884x.m18949a(this.f9523a, canvas, C3847a.f9525c);
    }

    /* renamed from: b */
    public final boolean mo13761b(Drawable drawable) {
        return drawable == this.f9523a;
    }

    /* renamed from: a */
    public final void mo13756a() {
        Drawable drawable = this.f9523a;
        if (drawable != null && drawable.isStateful()) {
            Drawable drawable2 = this.f9523a;
            if (drawable2 != null) {
                drawable2.setState(this.f9524b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public final void mo13757a(int i, int i2) {
        Drawable drawable = this.f9523a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            this.f9524b.invalidate();
        }
    }

    /* renamed from: c */
    public final void mo13762c() {
        Drawable drawable = this.f9523a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
