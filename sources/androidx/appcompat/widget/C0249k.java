package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.C0517l;
import p096e.p097a.C3858a;
import p096e.p121h.p135s.C4186w;

/* renamed from: androidx.appcompat.widget.k */
/* compiled from: AppCompatImageButton */
public class C0249k extends ImageButton implements C4186w, C0517l {

    /* renamed from: U */
    private final C0251l f1123U;

    /* renamed from: c */
    private final C0219e f1124c;

    public C0249k(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1754a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            return lVar.mo1759b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            return lVar.mo1760c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1123U.mo1761d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1754a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1754a();
        }
    }

    public void setImageResource(int i) {
        this.f1123U.mo1755a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1754a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f1124c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1756a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C0251l lVar = this.f1123U;
        if (lVar != null) {
            lVar.mo1757a(mode);
        }
    }

    public C0249k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.imageButtonStyle);
    }

    public C0249k(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f1124c = new C0219e(this);
        this.f1124c.mo1568a(attributeSet, i);
        this.f1123U = new C0251l(this);
        this.f1123U.mo1758a(attributeSet, i);
    }
}
