package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.SecurityAction.ChangePassword;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.AccountBlocked;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPasscode;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0007J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "email", "", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Ljava/lang/String;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "authenticate", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState;", "passcode", "authorizeRedeemToken", "redeemToken", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "Lcom/bamtech/sdk4/identity/bam/RedeemPasscodeToken;", "successState", "mapErrorToRedeemActionState", "error", "", "redeemForPasswordReset", "RedeemActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.w */
/* compiled from: OtpRedeemAction.kt */
public final class C2928w {

    /* renamed from: a */
    private final BamIdentityApi f7750a;

    /* renamed from: b */
    private final AccountApi f7751b;

    /* renamed from: c */
    private final String f7752c;

    /* renamed from: d */
    private final C7614e f7753d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState;", "", "()V", "AccountBlocked", "Authenticated", "GenericError", "OtpPasscodeRedeemed", "Verifying", "WrongPasscodeError", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$Verifying;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$Authenticated;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$OtpPasscodeRedeemed;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$WrongPasscodeError;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$GenericError;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState$AccountBlocked;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a */
    /* compiled from: OtpRedeemAction.kt */
    public static abstract class C2929a {

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$a */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2930a extends C2929a {

            /* renamed from: a */
            public static final C2930a f7754a = new C2930a();

            private C2930a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$b */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2931b extends C2929a {

            /* renamed from: a */
            public static final C2931b f7755a = new C2931b();

            private C2931b() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$c */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2932c extends C2929a {

            /* renamed from: a */
            private final String f7756a;

            public C2932c() {
                this(null, 1, null);
            }

            public C2932c(String str) {
                super(null);
                this.f7756a = str;
            }

            /* renamed from: a */
            public final String mo11931a() {
                return this.f7756a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7756a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2932c) r2).f7756a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2932c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.s0.w$a$c r2 = (com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2932c) r2
                    java.lang.String r0 = r1.f7756a
                    java.lang.String r2 = r2.f7756a
                    boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2932c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7756a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f7756a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2932c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$d */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2933d extends C2929a {

            /* renamed from: a */
            public static final C2933d f7757a = new C2933d();

            private C2933d() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$e */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2934e extends C2929a {

            /* renamed from: a */
            public static final C2934e f7758a = new C2934e();

            private C2934e() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$a$f */
        /* compiled from: OtpRedeemAction.kt */
        public static final class C2935f extends C2929a {

            /* renamed from: a */
            private final String f7759a;

            public C2935f() {
                this(null, 1, null);
            }

            public C2935f(String str) {
                super(null);
                this.f7759a = str;
            }

            /* renamed from: a */
            public final String mo11935a() {
                return this.f7759a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7759a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2935f) r2).f7759a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2935f
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.s0.w$a$f r2 = (com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2935f) r2
                    java.lang.String r0 = r1.f7759a
                    java.lang.String r2 = r2.f7759a
                    boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2935f.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7759a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("WrongPasscodeError(errorMessage=");
                sb.append(this.f7759a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2935f(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        private C2929a() {
        }

        public /* synthetic */ C2929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$b */
    /* compiled from: OtpRedeemAction.kt */
    static final class C2936b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C2928w f7760c;

        C2936b(C2928w wVar) {
            this.f7760c = wVar;
        }

        /* renamed from: a */
        public final Observable<C2929a> apply(RedeemedPasscodeToken redeemedPasscodeToken) {
            C2929a aVar;
            if (redeemedPasscodeToken.getSecurityAction() instanceof ChangePassword) {
                aVar = C2933d.f7757a;
            } else {
                aVar = C2931b.f7755a;
            }
            return this.f7760c.m10698a(redeemedPasscodeToken, aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$c */
    /* compiled from: OtpRedeemAction.kt */
    static final class C2937c<T, R> implements Function<Throwable, C2929a> {

        /* renamed from: c */
        final /* synthetic */ C2928w f7761c;

        C2937c(C2928w wVar) {
            this.f7761c = wVar;
        }

        /* renamed from: a */
        public final C2929a apply(Throwable th) {
            C14100a.m44528b(th, "Error authenticating via OTP passcode", new Object[0]);
            return this.f7761c.m10697a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$d */
    /* compiled from: OtpRedeemAction.kt */
    static final class C2938d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C2928w f7762c;

        C2938d(C2928w wVar) {
            this.f7762c = wVar;
        }

        /* renamed from: a */
        public final Observable<C2929a> apply(RedeemedPasscodeToken redeemedPasscodeToken) {
            return this.f7762c.m10698a(redeemedPasscodeToken, (C2929a) C2933d.f7757a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.w$e */
    /* compiled from: OtpRedeemAction.kt */
    static final class C2939e<T, R> implements Function<Throwable, C2929a> {

        /* renamed from: c */
        final /* synthetic */ C2928w f7763c;

        C2939e(C2928w wVar) {
            this.f7763c = wVar;
        }

        /* renamed from: a */
        public final C2929a apply(Throwable th) {
            C14100a.m44528b(th, "Error redeeming passcode for password reset", new Object[0]);
            return this.f7763c.m10697a(th);
        }
    }

    public C2928w(BamIdentityApi bamIdentityApi, AccountApi accountApi, String str, C7614e eVar) {
        this.f7750a = bamIdentityApi;
        this.f7751b = accountApi;
        this.f7752c = str;
        this.f7753d = eVar;
    }

    /* renamed from: b */
    public final Observable<C2929a> mo11930b(String str) {
        Observable<C2929a> i = this.f7750a.authenticateWithPasscode(this.f7752c, str).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C2938d<Object,Object>(this)).mo30154a(C2934e.f7758a).mo30198i(new C2939e(this));
        C12880j.m40222a((Object) i, "identityApi.authenticate…tate(error)\n            }");
        return i;
    }

    /* renamed from: a */
    public final Observable<C2929a> mo11929a(String str) {
        Observable<C2929a> i = this.f7750a.authenticateWithPasscode(this.f7752c, str).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C2936b<Object,Object>(this)).mo30154a(C2934e.f7758a).mo30198i(new C2937c(this));
        C12880j.m40222a((Object) i, "identityApi.authenticate…tate(error)\n            }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C2929a> m10698a(RedeemedPasscodeToken redeemedPasscodeToken, C2929a aVar) {
        Observable<C2929a> a = this.f7751b.authorize(redeemedPasscodeToken).mo30043a((ObservableSource<T>) Observable.m38309b(aVar));
        C12880j.m40222a((Object) a, "accountApi.authorize(red…vable.just(successState))");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2929a m10697a(Throwable th) {
        C7619i b = this.f7753d.mo20538b(th);
        ServiceExceptionCase c = b.mo20545c();
        if (C12880j.m40224a((Object) c, (Object) InvalidPasscode.INSTANCE)) {
            return new C2935f(b.mo20546d());
        }
        if (C12880j.m40224a((Object) c, (Object) AccountBlocked.INSTANCE)) {
            return C2930a.f7754a;
        }
        return new C2932c(b.mo20546d());
    }
}
