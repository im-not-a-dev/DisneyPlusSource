package p163g.p201e.p203b.p204d.p205v0;

import android.util.Patterns;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidEmail;
import com.bamtech.sdk4.service.ServiceExceptionCase.UpdateIdentityConflict;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "isEmailValid", "Lkotlin/Function1;", "", "", "isEmailValid$annotations", "()V", "isEmailValid$account_release", "()Lkotlin/jvm/functions/Function1;", "setEmailValid$account_release", "(Lkotlin/jvm/functions/Function1;)V", "authenticateIfNecessary", "Lio/reactivex/Completable;", "currentEmail", "password", "changeEmail", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState;", "newEmail", "mapExceptionToActionState", "error", "", "validateEmailIdp", "ActionState", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.v0.a */
/* compiled from: ChangeEmailAction.kt */
public final class C5439a {

    /* renamed from: a */
    private Function1<? super String, Boolean> f12947a = C5447d.f12958c;

    /* renamed from: b */
    private final BamIdentityApi f12948b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AccountApi f12949c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7614e f12950d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState;", "", "()V", "ChangedEmail", "GenericError", "InvalidEmail", "PasswordValidationError", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState$InvalidEmail;", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState$ChangedEmail;", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState$PasswordValidationError;", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState$GenericError;", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.a$a */
    /* compiled from: ChangeEmailAction.kt */
    public static abstract class C5440a {

        /* renamed from: g.e.b.d.v0.a$a$a */
        /* compiled from: ChangeEmailAction.kt */
        public static final class C5441a extends C5440a {

            /* renamed from: a */
            public static final C5441a f12951a = new C5441a();

            private C5441a() {
                super(null);
            }
        }

        /* renamed from: g.e.b.d.v0.a$a$b */
        /* compiled from: ChangeEmailAction.kt */
        public static final class C5442b extends C5440a {

            /* renamed from: a */
            private final String f12952a;

            public C5442b() {
                this(null, 1, null);
            }

            public C5442b(String str) {
                super(null);
                this.f12952a = str;
            }

            /* renamed from: a */
            public final String mo17170a() {
                return this.f12952a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f12952a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5442b) r2).f12952a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5442b
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.v0.a$a$b r2 = (p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5442b) r2
                    java.lang.String r0 = r1.f12952a
                    java.lang.String r2 = r2.f12952a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5442b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f12952a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f12952a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C5442b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: g.e.b.d.v0.a$a$c */
        /* compiled from: ChangeEmailAction.kt */
        public static final class C5443c extends C5440a {

            /* renamed from: a */
            private final String f12953a;

            public C5443c(String str) {
                super(null);
                this.f12953a = str;
            }

            /* renamed from: a */
            public final String mo17174a() {
                return this.f12953a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f12953a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5443c) r2).f12953a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5443c
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.v0.a$a$c r2 = (p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5443c) r2
                    java.lang.String r0 = r1.f12953a
                    java.lang.String r2 = r2.f12953a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5443c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f12953a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("InvalidEmail(errorMessage=");
                sb.append(this.f12953a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: g.e.b.d.v0.a$a$d */
        /* compiled from: ChangeEmailAction.kt */
        public static final class C5444d extends C5440a {

            /* renamed from: a */
            private final String f12954a;

            public C5444d() {
                this(null, 1, null);
            }

            public C5444d(String str) {
                super(null);
                this.f12954a = str;
            }

            /* renamed from: a */
            public final String mo17178a() {
                return this.f12954a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f12954a, (java.lang.Object) ((p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5444d) r2).f12954a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5444d
                    if (r0 == 0) goto L_0x0013
                    g.e.b.d.v0.a$a$d r2 = (p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5444d) r2
                    java.lang.String r0 = r1.f12954a
                    java.lang.String r2 = r2.f12954a
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
                throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5444d.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f12954a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PasswordValidationError(errorMessage=");
                sb.append(this.f12954a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C5444d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        private C5440a() {
        }

        public /* synthetic */ C5440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d.v0.a$b */
    /* compiled from: ChangeEmailAction.kt */
    static final class C5445b<T, R> implements Function<IdentityToken, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C5439a f12955c;

        C5445b(C5439a aVar) {
            this.f12955c = aVar;
        }

        /* renamed from: a */
        public final Completable apply(IdentityToken identityToken) {
            return this.f12955c.f12949c.authorize(identityToken);
        }
    }

    /* renamed from: g.e.b.d.v0.a$c */
    /* compiled from: ChangeEmailAction.kt */
    static final class C5446c<T, R> implements Function<Throwable, C5440a> {

        /* renamed from: U */
        final /* synthetic */ String f12956U;

        /* renamed from: c */
        final /* synthetic */ C5439a f12957c;

        C5446c(C5439a aVar, String str) {
            this.f12957c = aVar;
            this.f12956U = str;
        }

        /* renamed from: a */
        public final C5440a apply(Throwable th) {
            boolean z = false;
            Timber.m44530c(th, "Error attempting to change account email address.", new Object[0]);
            if (this.f12956U.length() == 0) {
                z = true;
            }
            if (z) {
                return new C5444d(this.f12957c.f12950d.mo20536a((ServiceExceptionCase) InvalidCredentials.INSTANCE).mo20546d());
            }
            return this.f12957c.m18204a(th);
        }
    }

    /* renamed from: g.e.b.d.v0.a$d */
    /* compiled from: ChangeEmailAction.kt */
    static final class C5447d extends C12881k implements Function1<String, Boolean> {

        /* renamed from: c */
        public static final C5447d f12958c = new C5447d();

        C5447d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            return Patterns.EMAIL_ADDRESS.matcher(str).matches();
        }
    }

    public C5439a(BamIdentityApi bamIdentityApi, AccountApi accountApi, C7614e eVar) {
        this.f12948b = bamIdentityApi;
        this.f12949c = accountApi;
        this.f12950d = eVar;
    }

    /* renamed from: a */
    public final Single<C5440a> mo17169a(String str, String str2, String str3) {
        Single<C5440a> a = m18206a(str2);
        if (a != null) {
            return a;
        }
        Single<C5440a> i = m18205a(str, str3).mo30034a((CompletableSource) this.f12948b.updateEmail(str, str3, str2)).mo30044a((SingleSource<T>) Single.m38399b(C5441a.f12951a)).mo30237i(new C5446c(this, str3));
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "authenticateIfNecessary(…      }\n                }");
        return i;
    }

    /* renamed from: a */
    private final Single<C5440a> m18206a(String str) {
        if (((Boolean) this.f12947a.invoke(str)).booleanValue()) {
            return null;
        }
        return Single.m38399b(new C5443c(this.f12950d.mo20536a((ServiceExceptionCase) InvalidEmail.INSTANCE).mo20546d()));
    }

    /* renamed from: a */
    private final Completable m18205a(String str, String str2) {
        if (this.f12948b.requiresAuthentication()) {
            Completable b = this.f12948b.authenticate(str, str2).mo30217b((Function<? super T, ? extends CompletableSource>) new C5445b<Object,Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "identityApi.authenticate…tApi.authorize(idToken) }");
            return b;
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C5440a m18204a(Throwable th) {
        C7619i b = this.f12950d.mo20538b(th);
        String a = b.mo20543a();
        ServiceExceptionCase b2 = b.mo20544b();
        if (Intrinsics.areEqual((Object) b2, (Object) InvalidCredentials.INSTANCE)) {
            return new C5444d(a);
        }
        if (Intrinsics.areEqual((Object) b2, (Object) InvalidEmail.INSTANCE)) {
            return new C5443c(a);
        }
        if (Intrinsics.areEqual((Object) b2, (Object) UpdateIdentityConflict.INSTANCE)) {
            return new C5443c(a);
        }
        return new C5442b(a);
    }
}
