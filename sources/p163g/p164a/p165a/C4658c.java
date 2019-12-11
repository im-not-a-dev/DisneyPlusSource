package p163g.p164a.p165a;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: g.a.a.c */
/* compiled from: AdobeMarketingActivity */
public abstract class C4658c extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4705m.m16371a(getApplicationContext());
    }

    public void onPause() {
        super.onPause();
        C4705m.m16375b();
    }

    public void onResume() {
        super.onResume();
        C4705m.m16370a((Activity) this);
    }
}
