package com.bamtechmedia.dominguez.auth;

import android.os.Bundle;
import androidx.lifecycle.C0741y;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.C0955b;
import com.bamtechmedia.dominguez.auth.p061o0.C2744e;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import p163g.p201e.p203b.p286j.C7304o;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u001bR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bamtechmedia/dominguez/auth/api/OnboardingEmailHolder;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "deepLinkHandler", "Lcom/bamtechmedia/dominguez/deeplink/UnauthenicatedDeepLinkHandler;", "(Landroidx/savedstate/SavedStateRegistry;Lcom/bamtechmedia/dominguez/deeplink/UnauthenicatedDeepLinkHandler;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "isSignup", "", "()Z", "setSignup", "(Z)V", "legalDisclosureCodes", "", "getLegalDisclosureCodes", "()Ljava/util/List;", "legalDisclosures", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "getLegalDisclosures", "setLegalDisclosures", "(Ljava/util/List;)V", "marketingEntities", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "getMarketingEntities", "setMarketingEntities", "marketingInputs", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "getMarketingInputs", "setMarketingInputs", "savedStateBundle", "Landroid/os/Bundle;", "clearEmail", "", "onCleared", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.r */
/* compiled from: AuthHostViewModel.kt */
public final class C2784r extends C0741y implements C2744e {

    /* renamed from: U */
    private List<LegalDisclosure> f7533U;

    /* renamed from: V */
    private List<MarketingInput> f7534V;

    /* renamed from: W */
    private List<MarketingEntity> f7535W;

    /* renamed from: X */
    private boolean f7536X;

    /* renamed from: Y */
    private String f7537Y;

    /* renamed from: Z */
    private final SavedStateRegistry f7538Z;

    /* renamed from: a0 */
    private final C7304o f7539a0;

    /* renamed from: c */
    private final Bundle f7540c;

    /* renamed from: com.bamtechmedia.dominguez.auth.r$a */
    /* compiled from: AuthHostViewModel.kt */
    static final class C2785a implements C0955b {

        /* renamed from: a */
        final /* synthetic */ C2784r f7541a;

        C2785a(C2784r rVar) {
            this.f7541a = rVar;
        }

        /* renamed from: a */
        public final Bundle mo5301a() {
            return C5833g.m18829a(C12907r.m40244a("legalDisclosures", new ArrayList(this.f7541a.mo11793A())), C12907r.m40244a("marketingInputs", new ArrayList(this.f7541a.mo11795C())), C12907r.m40244a("marketingEntities", new ArrayList(this.f7541a.mo11794B())), C12907r.m40244a("isSignup", Boolean.valueOf(this.f7541a.mo11796D())), C12907r.m40244a("email", this.f7541a.mo11802y()));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r$b */
    /* compiled from: AuthHostViewModel.kt */
    public static final class C2786b {
        private C2786b() {
        }

        public /* synthetic */ C2786b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2786b(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r2 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2784r(androidx.savedstate.SavedStateRegistry r2, p163g.p201e.p203b.p286j.C7304o r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.f7538Z = r2
            r1.f7539a0 = r3
            androidx.savedstate.SavedStateRegistry r2 = r1.f7538Z
            java.lang.String r3 = "authHost"
            android.os.Bundle r2 = r2.mo5295a(r3)
            r1.f7540c = r2
            androidx.savedstate.SavedStateRegistry r2 = r1.f7538Z
            com.bamtechmedia.dominguez.auth.r$a r0 = new com.bamtechmedia.dominguez.auth.r$a
            r0.<init>(r1)
            r2.mo5298a(r3, r0)
            g.e.b.j.o r2 = r1.f7539a0
            r2.mo20112a()
            android.os.Bundle r2 = r1.f7540c
            if (r2 == 0) goto L_0x002d
            java.lang.String r3 = "legalDisclosures"
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            if (r2 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
        L_0x0031:
            r1.f7533U = r2
            android.os.Bundle r2 = r1.f7540c
            if (r2 == 0) goto L_0x0040
            java.lang.String r3 = "marketingInputs"
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            if (r2 == 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
        L_0x0044:
            r1.f7534V = r2
            android.os.Bundle r2 = r1.f7540c
            if (r2 == 0) goto L_0x0053
            java.lang.String r3 = "marketingEntities"
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            if (r2 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
        L_0x0057:
            r1.f7535W = r2
            android.os.Bundle r2 = r1.f7540c
            r3 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.String r0 = "isSignup"
            boolean r3 = r2.getBoolean(r0, r3)
        L_0x0064:
            r1.f7536X = r3
            android.os.Bundle r2 = r1.f7540c
            if (r2 == 0) goto L_0x0071
            java.lang.String r3 = "email"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r1.f7537Y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.C2784r.<init>(androidx.savedstate.SavedStateRegistry, g.e.b.j.o):void");
    }

    /* renamed from: A */
    public final List<LegalDisclosure> mo11793A() {
        return this.f7533U;
    }

    /* renamed from: B */
    public final List<MarketingEntity> mo11794B() {
        return this.f7535W;
    }

    /* renamed from: C */
    public final List<MarketingInput> mo11795C() {
        return this.f7534V;
    }

    /* renamed from: D */
    public final boolean mo11796D() {
        return this.f7536X;
    }

    /* renamed from: a */
    public final void mo11797a(List<LegalDisclosure> list) {
        this.f7533U = list;
    }

    /* renamed from: b */
    public final void mo11799b(List<MarketingEntity> list) {
        this.f7535W = list;
    }

    /* renamed from: c */
    public final void mo11800c(List<MarketingInput> list) {
        this.f7534V = list;
    }

    /* renamed from: d */
    public final void mo11801d(boolean z) {
        this.f7536X = z;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f7538Z.mo5299b("authHost");
    }

    /* renamed from: q */
    public void mo11754q() {
        this.f7537Y = null;
    }

    /* renamed from: y */
    public final String mo11802y() {
        return this.f7537Y;
    }

    /* renamed from: z */
    public final List<String> mo11803z() {
        List<LegalDisclosure> list = this.f7533U;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (LegalDisclosure disclosureCode : list) {
            arrayList.add(disclosureCode.getDisclosureCode());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo11798b(String str) {
        this.f7537Y = str;
    }
}
