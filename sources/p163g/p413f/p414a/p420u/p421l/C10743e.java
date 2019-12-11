package p163g.p413f.p414a.p420u.p421l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p163g.p413f.p414a.p420u.p422m.C10756d;
import p163g.p413f.p414a.p420u.p422m.C10756d.C10757a;

/* renamed from: g.f.a.u.l.e */
/* compiled from: ImageViewTarget */
public abstract class C10743e<Z> extends C10748j<ImageView, Z> implements C10757a {

    /* renamed from: a0 */
    private Animatable f25440a0;

    public C10743e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public void mo20646a(Drawable drawable) {
        super.mo20646a(drawable);
        m33923c((Z) null);
        mo27763d(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27754a(Z z);

    /* renamed from: b */
    public void mo27738b(Drawable drawable) {
        super.mo27738b(drawable);
        m33923c((Z) null);
        mo27763d(drawable);
    }

    /* renamed from: c */
    public void mo27740c(Drawable drawable) {
        super.mo27740c(drawable);
        Animatable animatable = this.f25440a0;
        if (animatable != null) {
            animatable.stop();
        }
        m33923c((Z) null);
        mo27763d(drawable);
    }

    /* renamed from: d */
    public void mo27763d(Drawable drawable) {
        ((ImageView) this.f25444U).setImageDrawable(drawable);
    }

    /* renamed from: e */
    public Drawable mo27764e() {
        return ((ImageView) this.f25444U).getDrawable();
    }

    /* renamed from: b */
    private void m33922b(Z z) {
        if (z instanceof Animatable) {
            this.f25440a0 = (Animatable) z;
            this.f25440a0.start();
            return;
        }
        this.f25440a0 = null;
    }

    /* renamed from: a */
    public void mo20648a(Z z, C10756d<? super Z> dVar) {
        if (dVar == null || !dVar.mo27775a(z, this)) {
            m33923c(z);
        } else {
            m33922b(z);
        }
    }

    /* renamed from: c */
    public void mo27572c() {
        Animatable animatable = this.f25440a0;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: a */
    public void mo27566a() {
        Animatable animatable = this.f25440a0;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: c */
    private void m33923c(Z z) {
        mo27754a(z);
        m33922b(z);
    }
}
