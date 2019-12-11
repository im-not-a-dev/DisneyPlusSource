package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0495d;

/* renamed from: androidx.appcompat.widget.o */
/* compiled from: AppCompatProgressBarHelper */
class C0262o {

    /* renamed from: c */
    private static final int[] f1181c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1182a;

    /* renamed from: b */
    private Bitmap f1183b;

    C0262o(ProgressBar progressBar) {
        this.f1182a = progressBar;
    }

    /* renamed from: b */
    private Shape mo1839b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1817a(AttributeSet attributeSet, int i) {
        C0284t0 a = C0284t0.m1486a(this.f1182a.getContext(), attributeSet, f1181c, i, 0);
        Drawable c = a.mo1914c(0);
        if (c != null) {
            this.f1182a.setIndeterminateDrawable(mo1838a(c));
        }
        Drawable c2 = a.mo1914c(1);
        if (c2 != null) {
            this.f1182a.setProgressDrawable(m1429a(c2, false));
        }
        a.mo1908a();
    }

    /* renamed from: a */
    private Drawable m1429a(Drawable drawable, boolean z) {
        if (drawable instanceof C0495d) {
            C0495d dVar = (C0495d) drawable;
            Drawable a = dVar.mo2712a();
            if (a != null) {
                dVar.mo2713a(m1429a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1429a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1183b == null) {
                this.f1183b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo1839b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo1838a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1429a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo1816a() {
        return this.f1183b;
    }
}
