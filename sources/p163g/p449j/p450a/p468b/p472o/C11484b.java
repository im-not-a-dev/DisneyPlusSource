package p163g.p449j.p450a.p468b.p472o;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11492e;

/* renamed from: g.j.a.b.o.b */
/* compiled from: CircularRevealFrameLayout */
public class C11484b extends FrameLayout implements C11487d {

    /* renamed from: c */
    private final C11485c f26869c;

    /* renamed from: a */
    public void mo29375a() {
        this.f26869c.mo29385a();
        throw null;
    }

    /* renamed from: b */
    public void mo29376b() {
        this.f26869c.mo29390b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C11485c cVar = this.f26869c;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo29387a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f26869c.mo29391c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f26869c.mo29392d();
        throw null;
    }

    public C11492e getRevealInfo() {
        this.f26869c.mo29393e();
        throw null;
    }

    public boolean isOpaque() {
        C11485c cVar = this.f26869c;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo29394f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f26869c.mo29388a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f26869c.mo29386a(i);
        throw null;
    }

    public void setRevealInfo(C11492e eVar) {
        this.f26869c.mo29389a(eVar);
        throw null;
    }
}
