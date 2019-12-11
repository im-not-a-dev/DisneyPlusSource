package p163g.p174d.p178b.p185g0.p187w5;

import android.content.Context;
import android.view.OrientationEventListener;
import p163g.p174d.p178b.C5300m;

/* renamed from: g.d.b.g0.w5.a */
/* compiled from: OrientationSensorListener.kt */
public final class C5186a extends OrientationEventListener {

    /* renamed from: a */
    private final C5300m f12512a;

    public C5186a(Context context, C5300m mVar) {
        super(context, 3);
        this.f12512a = mVar;
    }

    public void onOrientationChanged(int i) {
        int i2 = 1;
        if ((264 <= i && 276 >= i) || (84 <= i && 96 >= i)) {
            i2 = 2;
        } else if (!((i >= 0 && 4 >= i) || i == 365 || i == 357 || i == 358 || i == 359 || (176 <= i && 184 >= i))) {
            i2 = -1;
        }
        if (i2 != -1) {
            this.f12512a.mo17031f(i2);
        }
    }
}
