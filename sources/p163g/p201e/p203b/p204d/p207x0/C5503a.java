package p163g.p201e.p203b.p204d.p207x0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPassword;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "authenticateIfNecessary", "Lio/reactivex/Completable;", "email", "", "currentPassword", "changePassword", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState;", "newPassword", "changePassword$account_release", "mapIdpExceptionToActionState", "error", "", "validateAndChangePassword", "validateInputs", "ActionState", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.x0.a */
/* compiled from: ChangePasswordAction.kt */
public final class C5503a {

    /* renamed from: a */
    private final BamIdentityApi f13040a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AccountApi f13041b;

    /* renamed from: c */
    private final C2750c f13042c;

    /* renamed from: d */
    private final C7614e f13043d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState;", "", "()V", "GenericError", "Loading", "PasswordChanged", "PasswordValidationError", "UserError", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState$Loading;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState$PasswordChanged;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState$PasswordValidationError;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState$UserError;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState$GenericError;", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.x0.a$a */
    /* compiled from: ChangePasswordAction.kt */
    public static abstract class C5504a {

        /* renamed from: g.e.b.d.x0.a$a$a */
        /* compiled from: ChangePasswordAction.kt */
        public static final class C5505a extends C5504a {

            /* renamed from: a */
            private final String f13044a;

            public C5505a() {
                this(null, 1, null);
            }

            public C5505a(String str) {
                super(null);
                this.f13044a = str;
            }

            /* renamed from: a */
            public final String mo17253a() {
                return this.f13044a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13044a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5505a) r2).f13044a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5505a
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.x0.a$a$a r2 = (p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5505a) r2
                    java.lang.String r0 = r1.f13044a
                    java.lang.String r2 = r2.f13044a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5505a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f13044a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f13044a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C5505a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: g.e.b.d.x0.a$a$b */
        /* compiled from: ChangePasswordAction.kt */
        public static final class C5506b extends C5504a {

            /* renamed from: a */
            public static final C5506b f13045a = new C5506b();

            private C5506b() {
                super(null);
            }
        }

        /* renamed from: g.e.b.d.x0.a$a$c */
        /* compiled from: ChangePasswordAction.kt */
        public static final class C5507c extends C5504a {

            /* renamed from: a */
            private final String f13046a;

            public C5507c(String str) {
                super(null);
                this.f13046a = str;
            }

            /* renamed from: a */
            public final String mo17257a() {
                return this.f13046a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13046a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5507c) r2).f13046a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5507c
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.x0.a$a$c r2 = (p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5507c) r2
                    java.lang.String r0 = r1.f13046a
                    java.lang.String r2 = r2.f13046a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5507c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f13046a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PasswordChanged(newPassword=");
                sb.append(this.f13046a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: g.e.b.d.x0.a$a$d */
        /* compiled from: ChangePasswordAction.kt */
        public static final class C5508d extends C5504a {

            /* renamed from: a */
            private final String f13047a;

            public C5508d(String str) {
                super(null);
                this.f13047a = str;
            }

            /* renamed from: a */
            public final String mo17261a() {
                return this.f13047a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13047a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5508d) r2).f13047a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5508d
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.x0.a$a$d r2 = (p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5508d) r2
                    java.lang.String r0 = r1.f13047a
                    java.lang.String r2 = r2.f13047a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5508d.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f13047a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PasswordValidationError(errorMessage=");
                sb.append(this.f13047a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: g.e.b.d.x0.a$a$e */
        /* compiled from: ChangePasswordAction.kt */
        public static final class C5509e extends C5504a {

            /* renamed from: a */
            private final String f13048a;

            public C5509e(String str) {
                super(null);
                this.f13048a = str;
            }

            /* renamed from: a */
            public final String mo17265a() {
                return this.f13048a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13048a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5509e) r2).f13048a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5509e
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.x0.a$a$e r2 = (p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5509e) r2
                    java.lang.String r0 = r1.f13048a
                    java.lang.String r2 = r2.f13048a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5509e.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f13048a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UserError(errorMessage=");
                sb.append(this.f13048a);
                sb.append(")");
                return sb.toString();
            }
        }

        private C5504a() {
        }

        public /* synthetic */ C5504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d.x0.a$b */
    /* compiled from: ChangePasswordAction.kt */
    static final class C5510b<T, R> implements Function<IdentityToken, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C5503a f13049c;

        C5510b(C5503a aVar) {
            this.f13049c = aVar;
        }

        /* renamed from: a */
        public final Completable apply(IdentityToken identityToken) {
            return this.f13049c.f13041b.authorize(identityToken);
        }
    }

    /* renamed from: g.e.b.d.x0.a$c */
    /* compiled from: ChangePasswordAction.kt */
    static final class C5511c<T, R> implements Function<Throwable, C5504a> {

        /* renamed from: c */
        final /* synthetic */ C5503a f13050c;

        C5511c(C5503a aVar) {
            this.f13050c = aVar;
        }

        /* renamed from: a */
        public final C5504a apply(Throwable th) {
            Timber.m44530c(th, "Error attempting to change password with BamIdentityApi!", new Object[0]);
            return this.f13050c.m18291a(th);
        }
    }

    public C5503a(BamIdentityApi bamIdentityApi, AccountApi accountApi, C2750c cVar, C7614e eVar) {
        this.f13040a = bamIdentityApi;
        this.f13041b = accountApi;
        this.f13042c = cVar;
        this.f13043d = eVar;
    }

    /* renamed from: b */
    private final Observable<C5504a> m18293b(String str, String str2) {
        Integer a = this.f13042c.mo11762a(str2);
        if (a != null) {
            a.intValue();
            Observable<C5504a> b = Observable.m38309b(new C5508d(this.f13043d.mo20536a((ServiceExceptionCase) InvalidPassword.INSTANCE).mo20546d()));
            if (b != null) {
                return b;
            }
        }
        Observable<C5504a> a2 = this.f13040a.updatePassword(str, str2).mo30043a((ObservableSource<T>) Observable.m38309b(new C5507c(str2)));
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "identityApi.updatePasswo…assword) as ActionState))");
        return a2;
    }

    /* renamed from: c */
    private final Observable<C5504a> m18294c(String str, String str2) {
        boolean z = true;
        if (str.length() == 0) {
            return Observable.m38309b(new C5509e(this.f13043d.mo20536a((ServiceExceptionCase) InvalidCredentials.INSTANCE).mo20546d()));
        }
        if (str2.length() != 0) {
            z = false;
        }
        if (z) {
            return Observable.m38309b(new C5508d(this.f13043d.mo20536a((ServiceExceptionCase) InvalidPassword.INSTANCE).mo20546d()));
        }
        return null;
    }

    /* renamed from: a */
    public final Observable<C5504a> mo17252a(String str, String str2, String str3) {
        Observable<C5504a> c = m18294c(str2, str3);
        if (c != null) {
            return c;
        }
        Observable a = m18292a(str, str2).mo30043a((ObservableSource<T>) m18293b(str2, str3));
        C5506b bVar = C5506b.f13045a;
        if (bVar != null) {
            Observable<C5504a> i = a.mo30176c((ObservableSource<? extends T>) Observable.m38309b(bVar)).mo30198i(new C5511c(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) i, "authenticateIfNecessary(…(error)\n                }");
            return i;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.account.password.ChangePasswordAction.ActionState");
    }

    /* renamed from: a */
    private final Completable m18292a(String str, String str2) {
        if (this.f13040a.requiresAuthentication()) {
            Completable b = this.f13040a.authenticate(str, str2).mo30217b((Function<? super T, ? extends CompletableSource>) new C5510b<Object,Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "identityApi.authenticate…tApi.authorize(idToken) }");
            return b;
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C5504a m18291a(Throwable th) {
        C7619i b = this.f13043d.mo20538b(th);
        String a = b.mo20543a();
        ServiceExceptionCase b2 = b.mo20544b();
        if (Intrinsics.areEqual((Object) b2, (Object) InvalidCredentials.INSTANCE)) {
            return new C5509e(a);
        }
        if (Intrinsics.areEqual((Object) b2, (Object) InvalidPassword.INSTANCE)) {
            return new C5508d(a);
        }
        return new C5505a(a);
    }
}
