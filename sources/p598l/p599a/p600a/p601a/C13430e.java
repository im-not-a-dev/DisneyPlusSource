package p598l.p599a.p600a.p601a;

import android.annotation.TargetApi;
import android.app.Activity;
import net.danlew.android.joda.DateUtils;
import p598l.p599a.p600a.p601a.C13421a.C13424c;

@TargetApi(19)
/* renamed from: l.a.a.a.e */
/* compiled from: SystemUiHelperImplKK */
class C13430e extends C13429d {
    C13430e(Activity activity, int i, int i2, C13424c cVar) {
        super(activity, i, i2, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo34638c() {
        int c = super.mo34638c();
        if (this.f29920b != 3) {
            return c;
        }
        return c | ((this.f29921c & 2) != 0 ? 4096 : DateUtils.FORMAT_NO_MIDNIGHT);
    }
}
