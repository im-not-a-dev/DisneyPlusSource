package p096e.p121h.p135s;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: e.h.s.u */
/* compiled from: PointerIconCompat */
public final class C4184u {

    /* renamed from: a */
    private Object f10480a;

    private C4184u(Object obj) {
        this.f10480a = obj;
    }

    /* renamed from: a */
    public Object mo14831a() {
        return this.f10480a;
    }

    /* renamed from: a */
    public static C4184u m14334a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C4184u(PointerIcon.getSystemIcon(context, i));
        }
        return new C4184u(null);
    }
}
