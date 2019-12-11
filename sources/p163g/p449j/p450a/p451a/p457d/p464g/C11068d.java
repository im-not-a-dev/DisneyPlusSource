package p163g.p449j.p450a.p451a.p457d.p464g;

import android.app.Activity;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10957b;

/* renamed from: g.j.a.a.d.g.d */
final class C11068d extends C11190a {

    /* renamed from: X */
    private final /* synthetic */ Activity f26121X;

    /* renamed from: Y */
    private final /* synthetic */ String f26122Y;

    /* renamed from: Z */
    private final /* synthetic */ String f26123Z;

    /* renamed from: a0 */
    private final /* synthetic */ C11189kc f26124a0;

    C11068d(C11189kc kcVar, Activity activity, String str, String str2) {
        this.f26124a0 = kcVar;
        this.f26121X = activity;
        this.f26122Y = str;
        this.f26123Z = str2;
        super(kcVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28291a() throws RemoteException {
        this.f26124a0.f26319g.setCurrentScreen(C10957b.m34643a(this.f26121X), this.f26122Y, this.f26123Z, this.f26323c);
    }
}
