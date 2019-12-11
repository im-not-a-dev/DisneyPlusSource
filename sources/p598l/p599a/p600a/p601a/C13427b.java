package p598l.p599a.p600a.p601a;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import p598l.p599a.p600a.p601a.C13421a.C13424c;

@TargetApi(11)
/* renamed from: l.a.a.a.b */
/* compiled from: SystemUiHelperImplHC */
class C13427b extends C13425d implements OnSystemUiVisibilityChangeListener {

    /* renamed from: f */
    final View f29924f;

    C13427b(Activity activity, int i, int i2, C13424c cVar) {
        super(activity, i, i2, cVar);
        this.f29924f = activity.getWindow().getDecorView();
        this.f29924f.setOnSystemUiVisibilityChangeListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34635a() {
        this.f29924f.setSystemUiVisibility(mo34638c());
        this.f29924f.requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34637b() {
        this.f29924f.setSystemUiVisibility(mo34639d());
        this.f29924f.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo34638c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo34639d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo34640e() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo34641f() {
        ActionBar actionBar = this.f29919a.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        this.f29919a.getWindow().addFlags(1024);
        mo34636a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo34642g() {
        ActionBar actionBar = this.f29919a.getActionBar();
        if (actionBar != null) {
            actionBar.show();
        }
        this.f29919a.getWindow().clearFlags(1024);
        mo34636a(true);
    }

    public final void onSystemUiVisibilityChange(int i) {
        if ((i & mo34640e()) != 0) {
            mo34641f();
        } else {
            mo34642g();
        }
    }
}
