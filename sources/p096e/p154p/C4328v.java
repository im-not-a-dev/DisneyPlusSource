package p096e.p154p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: e.p.v */
/* compiled from: ViewGroupOverlayApi18 */
class C4328v implements C4329w {

    /* renamed from: a */
    private final ViewGroupOverlay f10776a;

    C4328v(ViewGroup viewGroup) {
        this.f10776a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo14993a(Drawable drawable) {
        this.f10776a.add(drawable);
    }

    /* renamed from: b */
    public void mo14994b(Drawable drawable) {
        this.f10776a.remove(drawable);
    }

    /* renamed from: a */
    public void mo15136a(View view) {
        this.f10776a.add(view);
    }

    /* renamed from: b */
    public void mo15137b(View view) {
        this.f10776a.remove(view);
    }
}
