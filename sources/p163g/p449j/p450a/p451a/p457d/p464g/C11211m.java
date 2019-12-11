package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.m */
final class C11211m extends C11190a {

    /* renamed from: X */
    private final /* synthetic */ String f26356X;

    /* renamed from: Y */
    private final /* synthetic */ String f26357Y;

    /* renamed from: Z */
    private final /* synthetic */ boolean f26358Z;

    /* renamed from: a0 */
    private final /* synthetic */ C11173ja f26359a0;

    /* renamed from: b0 */
    private final /* synthetic */ C11189kc f26360b0;

    C11211m(C11189kc kcVar, String str, String str2, boolean z, C11173ja jaVar) {
        this.f26360b0 = kcVar;
        this.f26356X = str;
        this.f26357Y = str2;
        this.f26358Z = z;
        this.f26359a0 = jaVar;
        super(kcVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28291a() throws RemoteException {
        this.f26360b0.f26319g.getUserProperties(this.f26356X, this.f26357Y, this.f26358Z, this.f26359a0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28292b() {
        this.f26359a0.mo28331c((Bundle) null);
    }
}
