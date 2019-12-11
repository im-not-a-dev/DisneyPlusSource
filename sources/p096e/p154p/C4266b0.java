package p096e.p154p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: e.p.b0 */
/* compiled from: ViewOverlayApi18 */
class C4266b0 implements C4279c0 {

    /* renamed from: a */
    private final ViewOverlay f10622a;

    C4266b0(View view) {
        this.f10622a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo14993a(Drawable drawable) {
        this.f10622a.add(drawable);
    }

    /* renamed from: b */
    public void mo14994b(Drawable drawable) {
        this.f10622a.remove(drawable);
    }
}
