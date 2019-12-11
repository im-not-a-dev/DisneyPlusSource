package p163g.p174d.p178b.p181c0;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.accessibility.CaptioningManager;

/* renamed from: g.d.b.c0.a */
/* compiled from: SystemCaptionService */
public class C4938a {

    /* renamed from: a */
    private Context f12097a;

    public C4938a(Context context) {
        this.f12097a = context;
    }

    /* renamed from: a */
    public boolean mo16338a() {
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        CaptioningManager captioningManager = (CaptioningManager) this.f12097a.getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return false;
        }
        return true;
    }
}
