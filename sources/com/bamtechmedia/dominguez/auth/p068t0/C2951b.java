package com.bamtechmedia.dominguez.auth.p068t0;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;)V", "trackBack", "", "trackBack$auth_release", "trackContinue", "trackContinue$auth_release", "trackForgotPassword", "trackForgotPassword$auth_release", "trackLoginSuccess", "trackLoginSuccess$auth_release", "trackPasswordError", "errorCode", "", "trackPasswordError$auth_release", "trackShow", "trackShow$auth_release", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.t0.b */
/* compiled from: LoginPasswordAnalytics.kt */
public final class C2951b {

    /* renamed from: a */
    private final C2348e f7779a;

    /* renamed from: b */
    private final C2436p f7780b;

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.b$a */
    /* compiled from: LoginPasswordAnalytics.kt */
    public static final class C2952a {
        private C2952a() {
        }

        public /* synthetic */ C2952a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2952a(null);
    }

    public C2951b(C2348e eVar, C2436p pVar) {
        this.f7779a = eVar;
        this.f7780b = pVar;
    }

    /* renamed from: a */
    public final void mo11949a() {
        C2349a.m8853a(this.f7779a, "Log In - Enter Password : Back Click", null, false, 6, null);
        C2437a.m8999a(this.f7780b, "Log In - Enter Password : Back Click", null, 2, null);
    }

    /* renamed from: b */
    public final void mo11951b() {
        C2349a.m8853a(this.f7779a, "Log In - Enter Password : Continue Click", null, false, 6, null);
        C2437a.m8999a(this.f7780b, "Log In - Enter Password : Continue Click", null, 2, null);
    }

    /* renamed from: c */
    public final void mo11952c() {
        C2349a.m8853a(this.f7779a, "Log In - Enter Password : Forgot Password Click", null, false, 6, null);
        C2437a.m8999a(this.f7780b, "Log In - Enter Password : Forgot Password Click", null, 2, null);
    }

    /* renamed from: d */
    public final void mo11953d() {
        C2349a.m8853a(this.f7779a, "Login Success", null, false, 6, null);
    }

    /* renamed from: e */
    public final void mo11954e() {
        C2349a.m8853a(this.f7779a, "Log In - Enter Password : Show Click", null, false, 6, null);
        C2437a.m8999a(this.f7780b, "Log In - Enter Password : Show Click", null, 2, null);
    }

    /* renamed from: a */
    public final void mo11950a(String str) {
        String str2 = "errorCode";
        C2349a.m8853a(this.f7779a, "Log In - Enter Password : Password Error", C13170i0.m40332a(C12907r.m40244a(str2, str)), false, 4, null);
        this.f7780b.mo11567a("Log In - Enter Password : Password Error", C13170i0.m40332a(C12907r.m40244a(str2, str)));
    }
}
