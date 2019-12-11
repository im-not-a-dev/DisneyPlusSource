package p163g.p413f.p414a.p420u.p422m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p163g.p413f.p414a.p420u.p422m.C10756d.C10757a;

/* renamed from: g.f.a.u.m.b */
/* compiled from: DrawableCrossFadeTransition */
public class C10753b implements C10756d<Drawable> {

    /* renamed from: a */
    private final int f25460a;

    /* renamed from: b */
    private final boolean f25461b;

    public C10753b(int i, boolean z) {
        this.f25460a = i;
        this.f25461b = z;
    }

    /* renamed from: a */
    public boolean mo27775a(Drawable drawable, C10757a aVar) {
        Drawable e = aVar.mo27764e();
        if (e == null) {
            e = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{e, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f25461b);
        transitionDrawable.startTransition(this.f25460a);
        aVar.mo27763d(transitionDrawable);
        return true;
    }
}
