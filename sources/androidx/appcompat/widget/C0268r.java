package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p096e.p097a.C3858a;

/* renamed from: androidx.appcompat.widget.r */
/* compiled from: AppCompatSeekBar */
public class C0268r extends SeekBar {

    /* renamed from: c */
    private final C0270s f1199c;

    public C0268r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1199c.mo1839b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1199c.mo1840c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1199c.mo1837a(canvas);
    }

    public C0268r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1199c = new C0270s(this);
        this.f1199c.mo1817a(attributeSet, i);
    }
}
