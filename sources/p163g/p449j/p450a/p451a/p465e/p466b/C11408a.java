package p163g.p449j.p450a.p451a.p465e.p466b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C9654c;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9850c.C9853c;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9874h;
import com.google.android.gms.common.internal.C9886m;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9910v;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: g.j.a.a.e.b.a */
public class C11408a extends C9874h<C11414g> implements C11423f {

    /* renamed from: E */
    private final boolean f26745E;

    /* renamed from: F */
    private final C9864d f26746F;

    /* renamed from: G */
    private final Bundle f26747G;

    /* renamed from: H */
    private Integer f26748H;

    private C11408a(Context context, Looper looper, boolean z, C9864d dVar, Bundle bundle, C9700b bVar, C9701c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f26745E = true;
        this.f26746F = dVar;
        this.f26747G = bundle;
        this.f26748H = dVar.mo25359e();
    }

    /* renamed from: a */
    public final void mo29222a(C9886m mVar, boolean z) {
        try {
            ((C11414g) mo25336x()).mo29233a(mVar, this.f26748H.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: b */
    public final void mo29224b() {
        mo25313a((C9853c) new C9854d());
    }

    /* renamed from: g */
    public final void mo29225g() {
        try {
            ((C11414g) mo25336x()).mo29235e(this.f26748H.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: i */
    public int mo24962i() {
        return C9832i.f23040a;
    }

    /* renamed from: l */
    public boolean mo25324l() {
        return this.f26745E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo25333u() {
        if (!mo25332t().getPackageName().equals(this.f26746F.mo25362h())) {
            this.f26747G.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f26746F.mo25362h());
        }
        return this.f26747G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public String mo24964y() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo24965z() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: a */
    public final void mo29223a(C11412e eVar) {
        C9908u.m30854a(eVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f26746F.mo25357c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C9654c.m29983a(mo25332t()).mo24949b();
            }
            ((C11414g) mo25336x()).mo29234a(new C11416i(new C9910v(c, this.f26748H.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            String str = "SignInClientImpl";
            Log.w(str, "Remote service probably died when signIn is called");
            try {
                eVar.mo25167a(new C11418k(8));
            } catch (RemoteException unused) {
                Log.wtf(str, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public C11408a(Context context, Looper looper, boolean z, C9864d dVar, C11406a aVar, C9700b bVar, C9701c cVar) {
        this(context, looper, true, dVar, m36869a(dVar), bVar, cVar);
    }

    /* renamed from: a */
    public static Bundle m36869a(C9864d dVar) {
        C11406a j = dVar.mo25364j();
        Integer e = dVar.mo25359e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo25353a());
        if (e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e.intValue());
        }
        if (j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", j.mo29220g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", j.mo29219f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", j.mo29217d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", j.mo29218e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", j.mo29215b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", j.mo29221h());
            if (j.mo29214a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", j.mo29214a().longValue());
            }
            if (j.mo29216c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", j.mo29216c().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C11414g) {
            return (C11414g) queryLocalInterface;
        }
        return new C11415h(iBinder);
    }
}
