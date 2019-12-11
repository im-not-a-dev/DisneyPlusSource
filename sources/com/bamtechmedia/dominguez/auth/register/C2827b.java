package com.bamtechmedia.dominguez.auth.register;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;)V", "trackBackClick", "", "trackBackClick$auth_release", "trackContinueClick", "trackContinueClick$auth_release", "trackPasswordError", "errorCode", "", "trackPasswordError$auth_release", "trackShowClick", "trackShowClick$auth_release", "trackSignUpSuccess", "trackSignUpSuccess$auth_release", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.register.b */
/* compiled from: RegisterAccountAnalytics.kt */
public final class C2827b {

    /* renamed from: a */
    private final C2348e f7595a;

    /* renamed from: b */
    private final C2436p f7596b;

    /* renamed from: com.bamtechmedia.dominguez.auth.register.b$a */
    /* compiled from: RegisterAccountAnalytics.kt */
    public static final class C2828a {
        private C2828a() {
        }

        public /* synthetic */ C2828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2828a(null);
    }

    public C2827b(C2348e eVar, C2436p pVar) {
        this.f7595a = eVar;
        this.f7596b = pVar;
    }

    /* renamed from: a */
    public final void mo11836a() {
        C2349a.m8853a(this.f7595a, "Sign Up - Create Password : Back Click", null, false, 6, null);
    }

    /* renamed from: b */
    public final void mo11838b() {
        C2349a.m8853a(this.f7595a, "Sign Up - Create Password : Continue Click", null, false, 6, null);
        C2437a.m8999a(this.f7596b, "Sign Up - Create Password : Continue Click", null, 2, null);
    }

    /* renamed from: c */
    public final void mo11839c() {
        C2349a.m8853a(this.f7595a, "Sign Up - Create Password : Show Click", null, false, 6, null);
        C2437a.m8999a(this.f7596b, "Sign Up - Create Password : Show Click", null, 2, null);
    }

    /* renamed from: d */
    public final void mo11840d() {
        C2349a.m8853a(this.f7595a, "Sign Up Success", null, false, 6, null);
    }

    /* renamed from: a */
    public final void mo11837a(String str) {
        String str2 = "errorCode";
        C2349a.m8853a(this.f7595a, "Sign Up - Create Password : Password Error", C13170i0.m40332a(C12907r.m40244a(str2, str)), false, 4, null);
        this.f7596b.mo11567a("Sign Up - Create Password : Password Error", C13170i0.m40332a(C12907r.m40244a(str2, str)));
    }
}
