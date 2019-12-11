package com.bamtechmedia.dominguez.auth.p068t0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.AccountBlocked;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "email", "", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Ljava/lang/String;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "authorizeIdentityToken", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "loginWithPassword", "password", "mapIdentityAuthenticateExceptionToActionState", "error", "", "ActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.t0.j */
/* compiled from: PasswordLoginAction.kt */
public final class C2977j {

    /* renamed from: a */
    private final BamIdentityApi f7819a;

    /* renamed from: b */
    private final AccountApi f7820b;

    /* renamed from: c */
    private final String f7821c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7614e f7822d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState;", "", "()V", "AccountBlocked", "GenericError", "Loading", "LoginSuccess", "PasswordValidationError", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState$Loading;", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState$LoginSuccess;", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState$PasswordValidationError;", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState$GenericError;", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState$AccountBlocked;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a */
    /* compiled from: PasswordLoginAction.kt */
    public static abstract class C2978a {

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a$a */
        /* compiled from: PasswordLoginAction.kt */
        public static final class C2979a extends C2978a {

            /* renamed from: a */
            public static final C2979a f7823a = new C2979a();

            private C2979a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a$b */
        /* compiled from: PasswordLoginAction.kt */
        public static final class C2980b extends C2978a {

            /* renamed from: a */
            private final String f7824a;

            public C2980b() {
                this(null, 1, null);
            }

            public C2980b(String str) {
                super(null);
                this.f7824a = str;
            }

            /* renamed from: a */
            public final String mo11983a() {
                return this.f7824a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f7824a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2980b) r2).f7824a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2980b
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.t0.j$a$b r2 = (com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2980b) r2
                    java.lang.String r0 = r1.f7824a
                    java.lang.String r2 = r2.f7824a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2980b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7824a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f7824a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2980b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a$c */
        /* compiled from: PasswordLoginAction.kt */
        public static final class C2981c extends C2978a {

            /* renamed from: a */
            public static final C2981c f7825a = new C2981c();

            private C2981c() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a$d */
        /* compiled from: PasswordLoginAction.kt */
        public static final class C2982d extends C2978a {

            /* renamed from: a */
            public static final C2982d f7826a = new C2982d();

            private C2982d() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$a$e */
        /* compiled from: PasswordLoginAction.kt */
        public static final class C2983e extends C2978a {

            /* renamed from: a */
            private final String f7827a;

            public C2983e() {
                this(null, 1, null);
            }

            public C2983e(String str) {
                super(null);
                this.f7827a = str;
            }

            /* renamed from: a */
            public final String mo11987a() {
                return this.f7827a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f7827a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2983e) r2).f7827a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2983e
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.t0.j$a$e r2 = (com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2983e) r2
                    java.lang.String r0 = r1.f7827a
                    java.lang.String r2 = r2.f7827a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2983e.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7827a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PasswordValidationError(errorMessage=");
                sb.append(this.f7827a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2983e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        private C2978a() {
        }

        public /* synthetic */ C2978a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$b */
    /* compiled from: PasswordLoginAction.kt */
    static final class C2984b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C2977j f7828c;

        C2984b(C2977j jVar) {
            this.f7828c = jVar;
        }

        /* renamed from: a */
        public final Observable<C2978a> apply(IdentityToken identityToken) {
            return this.f7828c.m10766a(identityToken);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.j$c */
    /* compiled from: PasswordLoginAction.kt */
    static final class C2985c<T, R> implements Function<Throwable, C2978a> {

        /* renamed from: U */
        final /* synthetic */ String f7829U;

        /* renamed from: c */
        final /* synthetic */ C2977j f7830c;

        C2985c(C2977j jVar, String str) {
            this.f7830c = jVar;
            this.f7829U = str;
        }

        /* renamed from: a */
        public final C2978a apply(Throwable th) {
            if (this.f7829U.length() == 0) {
                return new C2983e(this.f7830c.f7822d.mo20536a((ServiceExceptionCase) InvalidCredentials.INSTANCE).mo20546d());
            }
            return this.f7830c.m10764a(th);
        }
    }

    public C2977j(BamIdentityApi bamIdentityApi, AccountApi accountApi, String str, C7614e eVar) {
        this.f7819a = bamIdentityApi;
        this.f7820b = accountApi;
        this.f7821c = str;
        this.f7822d = eVar;
    }

    /* renamed from: a */
    public final Observable<C2978a> mo11982a(String str) {
        Observable<C2978a> i = this.f7819a.authenticate(this.f7821c, str).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C2984b<Object,Object>(this)).mo30154a(C2981c.f7825a).mo30198i(new C2985c(this, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "identityApi.authenticate…          }\n            }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C2978a> m10766a(IdentityToken identityToken) {
        Completable authorize = this.f7820b.authorize(identityToken);
        C2982d dVar = C2982d.f7826a;
        if (dVar != null) {
            Observable<C2978a> a = authorize.mo30043a((ObservableSource<T>) Observable.m38309b(dVar));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "accountApi.authorize(ide…nSuccess as ActionState))");
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.auth.password.PasswordLoginAction.ActionState");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2978a m10764a(Throwable th) {
        C7619i b = this.f7822d.mo20538b(th);
        String a = b.mo20543a();
        ServiceExceptionCase b2 = b.mo20544b();
        if (Intrinsics.areEqual((Object) b2, (Object) InvalidCredentials.INSTANCE)) {
            return new C2983e(a);
        }
        if (Intrinsics.areEqual((Object) b2, (Object) AccountBlocked.INSTANCE)) {
            return C2979a.f7823a;
        }
        return new C2980b(a);
    }
}
