package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;)V", "trackAgreeContinueClick", "", "trackAgreeContinueClick$auth_release", "trackBackClick", "trackBackClick$auth_release", "trackLoginClick", "trackLoginClick$auth_release", "trackMarketingOptClick", "isChecked", "", "trackMarketingOptClick$auth_release", "trackTermsOfUseClick", "trackTermsOfUseClick$auth_release", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.e */
/* compiled from: SignUpEmailAnalytics.kt */
public final class C3105e {

    /* renamed from: a */
    private final C2348e f8010a;

    /* renamed from: b */
    private final C2436p f8011b;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.e$a */
    /* compiled from: SignUpEmailAnalytics.kt */
    public static final class C3106a {
        private C3106a() {
        }

        public /* synthetic */ C3106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3106a(null);
    }

    public C3105e(C2348e eVar, C2436p pVar) {
        this.f8010a = eVar;
        this.f8011b = pVar;
    }

    /* renamed from: a */
    public final void mo12140a() {
        C2349a.m8853a(this.f8010a, "Sign Up - Enter Email : Continue Click", null, false, 6, null);
        C2437a.m8999a(this.f8011b, "Sign Up - Enter Email : Continue Click", null, 2, null);
    }

    /* renamed from: b */
    public final void mo12142b() {
        C2349a.m8853a(this.f8010a, "Sign Up - Enter Email : Back Click", null, false, 6, null);
    }

    /* renamed from: c */
    public final void mo12143c() {
        C2349a.m8853a(this.f8010a, "Sign Up - Enter Email : Terms Of Use Click", null, false, 6, null);
    }

    /* renamed from: a */
    public final void mo12141a(boolean z) {
        C2348e eVar = this.f8010a;
        StringBuilder sb = new StringBuilder();
        sb.append("Sign Up - Enter Email :  Marketing Opt ");
        sb.append(z ? "In" : "Out");
        sb.append(" Click");
        C2349a.m8853a(eVar, sb.toString(), null, false, 6, null);
    }
}
