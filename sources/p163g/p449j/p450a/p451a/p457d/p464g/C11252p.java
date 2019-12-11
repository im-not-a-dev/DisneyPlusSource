package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.p */
final class C11252p extends C11190a {

    /* renamed from: X */
    private final /* synthetic */ Long f26422X;

    /* renamed from: Y */
    private final /* synthetic */ String f26423Y;

    /* renamed from: Z */
    private final /* synthetic */ String f26424Z;

    /* renamed from: a0 */
    private final /* synthetic */ Bundle f26425a0;

    /* renamed from: b0 */
    private final /* synthetic */ boolean f26426b0;

    /* renamed from: c0 */
    private final /* synthetic */ boolean f26427c0;

    /* renamed from: d0 */
    private final /* synthetic */ C11189kc f26428d0;

    C11252p(C11189kc kcVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.f26428d0 = kcVar;
        this.f26422X = l;
        this.f26423Y = str;
        this.f26424Z = str2;
        this.f26425a0 = bundle;
        this.f26426b0 = z;
        this.f26427c0 = z2;
        super(kcVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28291a() throws RemoteException {
        Long l = this.f26422X;
        this.f26428d0.f26319g.logEvent(this.f26423Y, this.f26424Z, this.f26425a0, this.f26426b0, this.f26427c0, l == null ? this.f26323c : l.longValue());
    }
}
