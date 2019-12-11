package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0492a;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: AppCompatSeekBarHelper */
class C0270s extends C0262o {

    /* renamed from: d */
    private final SeekBar f1204d;

    /* renamed from: e */
    private Drawable f1205e;

    /* renamed from: f */
    private ColorStateList f1206f = null;

    /* renamed from: g */
    private Mode f1207g = null;

    /* renamed from: h */
    private boolean f1208h = false;

    /* renamed from: i */
    private boolean f1209i = false;

    C0270s(SeekBar seekBar) {
        super(seekBar);
        this.f1204d = seekBar;
    }

    /* renamed from: d */
    private void m1441d() {
        if (this.f1205e == null) {
            return;
        }
        if (this.f1208h || this.f1209i) {
            this.f1205e = C0492a.m2652i(this.f1205e.mutate());
            if (this.f1208h) {
                C0492a.m2637a(this.f1205e, this.f1206f);
            }
            if (this.f1209i) {
                C0492a.m2640a(this.f1205e, this.f1207g);
            }
            if (this.f1205e.isStateful()) {
                this.f1205e.setState(this.f1204d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1817a(AttributeSet attributeSet, int i) {
        super.mo1817a(attributeSet, i);
        C0284t0 a = C0284t0.m1486a(this.f1204d.getContext(), attributeSet, C3867j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo1914c(C3867j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1204d.setThumb(c);
        }
        mo1838a(a.mo1912b(C3867j.AppCompatSeekBar_tickMark));
        if (a.mo1922g(C3867j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1207g = C0204b0.m1171a(a.mo1915d(C3867j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1207g);
            this.f1209i = true;
        }
        if (a.mo1922g(C3867j.AppCompatSeekBar_tickMarkTint)) {
            this.f1206f = a.mo1906a(C3867j.AppCompatSeekBar_tickMarkTint);
            this.f1208h = true;
        }
        a.mo1908a();
        m1441d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1839b() {
        Drawable drawable = this.f1205e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1204d.getDrawableState())) {
            this.f1204d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1840c() {
        Drawable drawable = this.f1205e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1838a(Drawable drawable) {
        Drawable drawable2 = this.f1205e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1205e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1204d);
            C0492a.m2643a(drawable, C4187x.m14399n(this.f1204d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1204d.getDrawableState());
            }
            m1441d();
        }
        this.f1204d.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1837a(Canvas canvas) {
        if (this.f1205e != null) {
            int max = this.f1204d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1205e.getIntrinsicWidth();
                int intrinsicHeight = this.f1205e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1205e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1204d.getWidth() - this.f1204d.getPaddingLeft()) - this.f1204d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1204d.getPaddingLeft(), (float) (this.f1204d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1205e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
