package com.bamtechmedia.dominguez.auth.p070v0.p071g;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;)V", "trackBack", "", "trackBack$auth_release", "trackContinue", "trackContinue$auth_release", "trackSignUp", "trackSignUp$auth_release", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.g.c */
/* compiled from: LoginEmailAnalytics.kt */
public final class C3058c {

    /* renamed from: a */
    private final C2348e f7936a;

    /* renamed from: b */
    private final C2436p f7937b;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.c$a */
    /* compiled from: LoginEmailAnalytics.kt */
    public static final class C3059a {
        private C3059a() {
        }

        public /* synthetic */ C3059a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3059a(null);
    }

    public C3058c(C2348e eVar, C2436p pVar) {
        this.f7936a = eVar;
        this.f7937b = pVar;
    }

    /* renamed from: a */
    public final void mo12087a() {
        C2349a.m8853a(this.f7936a, "Log In - Enter Email : Back Click", null, false, 6, null);
        C2437a.m8999a(this.f7937b, "Log In - Enter Email : Back Click", null, 2, null);
    }

    /* renamed from: b */
    public final void mo12088b() {
        C2349a.m8853a(this.f7936a, "Log In - Enter Email : Continue Click", null, false, 6, null);
        C2437a.m8999a(this.f7937b, "Log In - Enter Email : Continue Click", null, 2, null);
    }

    /* renamed from: c */
    public final void mo12089c() {
        C2349a.m8853a(this.f7936a, "Log In - Enter Email : Sign Up Click", null, false, 6, null);
        C2437a.m8999a(this.f7937b, "Log In - Enter Email : Sign Up Click", null, 2, null);
    }
}
