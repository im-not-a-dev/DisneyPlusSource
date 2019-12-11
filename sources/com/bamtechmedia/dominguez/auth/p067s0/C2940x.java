package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p307o.C7614e;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "otpReason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "mapExceptionToActionState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState;", "error", "", "requestOtpEmail", "Lio/reactivex/Observable;", "email", "", "RequestActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.x */
/* compiled from: OtpRequestAction.kt */
public final class C2940x {

    /* renamed from: a */
    private final BamIdentityApi f7764a;

    /* renamed from: b */
    private final OneTimePasscodeRequestReason f7765b;

    /* renamed from: c */
    private final C7614e f7766c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState;", "", "()V", "Loading", "OtpRequestSent", "RequestError", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState$Loading;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState$OtpRequestSent;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState$RequestError;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.x$a */
    /* compiled from: OtpRequestAction.kt */
    public static abstract class C2941a {

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.x$a$a */
        /* compiled from: OtpRequestAction.kt */
        public static final class C2942a extends C2941a {

            /* renamed from: a */
            public static final C2942a f7767a = new C2942a();

            private C2942a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.x$a$b */
        /* compiled from: OtpRequestAction.kt */
        public static final class C2943b extends C2941a {

            /* renamed from: a */
            public static final C2943b f7768a = new C2943b();

            private C2943b() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.x$a$c */
        /* compiled from: OtpRequestAction.kt */
        public static final class C2944c extends C2941a {

            /* renamed from: a */
            private final String f7769a;

            public C2944c() {
                this(null, 1, null);
            }

            public C2944c(String str) {
                super(null);
                this.f7769a = str;
            }

            /* renamed from: a */
            public final String mo11944a() {
                return this.f7769a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f7769a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2944c) r2).f7769a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2944c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.s0.x$a$c r2 = (com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2944c) r2
                    java.lang.String r0 = r1.f7769a
                    java.lang.String r2 = r2.f7769a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2944c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7769a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("RequestError(errorMessage=");
                sb.append(this.f7769a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2944c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        private C2941a() {
        }

        public /* synthetic */ C2941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.x$b */
    /* compiled from: OtpRequestAction.kt */
    static final class C2945b<T, R> implements Function<Throwable, C2941a> {

        /* renamed from: c */
        final /* synthetic */ C2940x f7770c;

        C2945b(C2940x xVar) {
            this.f7770c = xVar;
        }

        /* renamed from: a */
        public final C2941a apply(Throwable th) {
            Timber.m44528b(th, "Error requesting OTP passcode email to be sent.", new Object[0]);
            return this.f7770c.m10709a(th);
        }
    }

    public C2940x(BamIdentityApi bamIdentityApi, OneTimePasscodeRequestReason oneTimePasscodeRequestReason, C7614e eVar) {
        this.f7764a = bamIdentityApi;
        this.f7765b = oneTimePasscodeRequestReason;
        this.f7766c = eVar;
    }

    /* renamed from: a */
    public final Observable<C2941a> mo11943a(String str) {
        Completable requestOneTimePasscode = this.f7764a.requestOneTimePasscode(str, this.f7765b);
        C2943b bVar = C2943b.f7768a;
        if (bVar != null) {
            Observable<C2941a> i = requestOneTimePasscode.mo30043a((ObservableSource<T>) Observable.m38309b(bVar)).mo30154a(C2942a.f7767a).mo30198i(new C2945b(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) i, "identityApi.requestOneTi…tate(error)\n            }");
            return i;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.auth.otp.OtpRequestAction.RequestActionState");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2941a m10709a(Throwable th) {
        return new C2944c(this.f7766c.mo20538b(th).mo20546d());
    }
}
