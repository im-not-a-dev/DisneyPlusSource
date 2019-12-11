package p598l.p599a.p600a.p601a;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import net.danlew.android.joda.DateUtils;
import p598l.p599a.p600a.p601a.C13421a.C13424c;

@TargetApi(16)
/* renamed from: l.a.a.a.d */
/* compiled from: SystemUiHelperImplJB */
class C13429d extends C13428c {
    C13429d(Activity activity, int i, int i2, C13424c cVar) {
        super(activity, i, i2, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo34638c() {
        int c = super.mo34638c();
        int i = this.f29920b;
        if (i < 1) {
            return c;
        }
        int i2 = c | 1284;
        return i >= 2 ? i2 | DateUtils.FORMAT_NO_NOON : i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo34639d() {
        int d = super.mo34639d();
        int i = this.f29920b;
        if (i < 1) {
            return d;
        }
        int i2 = d | 1280;
        return i >= 2 ? i2 | DateUtils.FORMAT_NO_NOON : i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo34641f() {
        if (this.f29920b == 0) {
            ActionBar actionBar = this.f29919a.getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        }
        mo34636a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo34642g() {
        if (this.f29920b == 0) {
            ActionBar actionBar = this.f29919a.getActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
        }
        mo34636a(true);
    }
}
