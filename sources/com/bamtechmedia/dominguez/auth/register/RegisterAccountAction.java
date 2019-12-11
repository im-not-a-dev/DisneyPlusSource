package com.bamtechmedia.dominguez.auth.register;

import androidx.annotation.Keep;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPassword;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.legal.api.LegalApi;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001f B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "legalApi", "Lcom/bamtechmedia/dominguez/legal/api/LegalApi;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtechmedia/dominguez/legal/api/LegalApi;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "createAccountWithIdentityToken", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "attributes", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$AccountCreateAttributes;", "fetchLegalDisclosures", "Lio/reactivex/Single;", "", "", "mapIdentityExceptionToActionState", "error", "", "registerAccount", "email", "password", "validatePassword", "AccountCreateAttributes", "ActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RegisterAccountAction.kt */
public final class RegisterAccountAction {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BamIdentityApi f7570a;

    /* renamed from: b */
    private final AccountApi f7571b;

    /* renamed from: c */
    private final C2750c f7572c;

    /* renamed from: d */
    private final LegalApi f7573d;

    /* renamed from: e */
    private final C7614e f7574e;

    @Keep
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$AccountCreateAttributes;", "", "legalAssertions", "", "", "(Ljava/util/List;)V", "getLegalAssertions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RegisterAccountAction.kt */
    public static final class AccountCreateAttributes {
        private final List<String> legalAssertions;

        public AccountCreateAttributes(List<String> list) {
            this.legalAssertions = list;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r1v0, types: [java.util.List] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes copy$default(com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes r0, java.util.List<java.lang.String> r1, int r2, java.lang.Object r3) {
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0006
                java.util.List<java.lang.String> r1 = r0.legalAssertions
            L_0x0006:
                com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$AccountCreateAttributes r0 = r0.copy(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes.copy$default(com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$AccountCreateAttributes, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$AccountCreateAttributes");
        }

        public final List<String> component1() {
            return this.legalAssertions;
        }

        public final AccountCreateAttributes copy(List<String> list) {
            return new AccountCreateAttributes(list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.legalAssertions, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes) r2).legalAssertions) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$AccountCreateAttributes r2 = (com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes) r2
                java.util.List<java.lang.String> r0 = r1.legalAssertions
                java.util.List<java.lang.String> r2 = r2.legalAssertions
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.AccountCreateAttributes.equals(java.lang.Object):boolean");
        }

        public final List<String> getLegalAssertions() {
            return this.legalAssertions;
        }

        public int hashCode() {
            List<String> list = this.legalAssertions;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountCreateAttributes(legalAssertions=");
            sb.append(this.legalAssertions);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState;", "", "()V", "AccountCreated", "GenericError", "InputError", "Loading", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState$Loading;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState$AccountCreated;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState$GenericError;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState$InputError;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a */
    /* compiled from: RegisterAccountAction.kt */
    public static abstract class C2814a {

        /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$a */
        /* compiled from: RegisterAccountAction.kt */
        public static final class C2815a extends C2814a {

            /* renamed from: a */
            public static final C2815a f7575a = new C2815a();

            private C2815a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$b */
        /* compiled from: RegisterAccountAction.kt */
        public static final class C2816b extends C2814a {

            /* renamed from: a */
            private final String f7576a;

            public C2816b() {
                this(null, 1, null);
            }

            public C2816b(String str) {
                super(null);
                this.f7576a = str;
            }

            /* renamed from: a */
            public final String mo11822a() {
                return this.f7576a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7576a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2816b) r2).f7576a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2816b
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$b r2 = (com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2816b) r2
                    java.lang.String r0 = r1.f7576a
                    java.lang.String r2 = r2.f7576a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2816b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7576a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f7576a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2816b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$c */
        /* compiled from: RegisterAccountAction.kt */
        public static final class C2817c extends C2814a {

            /* renamed from: a */
            private final String f7577a;

            public C2817c() {
                this(null, 1, null);
            }

            public C2817c(String str) {
                super(null);
                this.f7577a = str;
            }

            /* renamed from: a */
            public final String mo11826a() {
                return this.f7577a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7577a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2817c) r2).f7577a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2817c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$c r2 = (com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2817c) r2
                    java.lang.String r0 = r1.f7577a
                    java.lang.String r2 = r2.f7577a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2817c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7577a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("InputError(errorMessage=");
                sb.append(this.f7577a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2817c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$a$d */
        /* compiled from: RegisterAccountAction.kt */
        public static final class C2818d extends C2814a {

            /* renamed from: a */
            public static final C2818d f7578a = new C2818d();

            private C2818d() {
                super(null);
            }
        }

        private C2814a() {
        }

        public /* synthetic */ C2814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$b */
    /* compiled from: RxExt.kt */
    public static final class C2819b<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: c */
        public static final C2819b f7579c = new C2819b();

        /* renamed from: a */
        public final List<T> mo11830a(List<? extends T> list) {
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo11830a(list);
            return list;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$c */
    /* compiled from: RxExt.kt */
    public static final class C2820c<T, R> implements Function<T, R> {
        public final R apply(T t) {
            return ((LegalDisclosure) t).getDisclosureCode();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$d */
    /* compiled from: RxExt.kt */
    public static final class C2821d<T1, T2> implements C11946b<U, LegalDisclosure> {

        /* renamed from: a */
        public static final C2821d f7580a = new C2821d();

        /* renamed from: a */
        public final void accept(List<String> list, String str) {
            list.add(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$e */
    /* compiled from: RxExt.kt */
    public static final class C2822e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C2822e f7581c = new C2822e();

        /* renamed from: a */
        public final List<R> apply(List<R> list) {
            return C13199w.m40606q(list);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState;", "kotlin.jvm.PlatformType", "legalDisclosures", "", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$f */
    /* compiled from: RegisterAccountAction.kt */
    static final class C2823f<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f7582U;

        /* renamed from: V */
        final /* synthetic */ String f7583V;

        /* renamed from: c */
        final /* synthetic */ RegisterAccountAction f7584c;

        /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$f$a */
        /* compiled from: RegisterAccountAction.kt */
        static final class C2824a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ AccountCreateAttributes f7585U;

            /* renamed from: c */
            final /* synthetic */ C2823f f7586c;

            C2824a(C2823f fVar, AccountCreateAttributes accountCreateAttributes) {
                this.f7586c = fVar;
                this.f7585U = accountCreateAttributes;
            }

            /* renamed from: a */
            public final Observable<C2814a> apply(IdentityToken identityToken) {
                return this.f7586c.f7584c.m10494a(identityToken, this.f7585U);
            }
        }

        C2823f(RegisterAccountAction registerAccountAction, String str, String str2) {
            this.f7584c = registerAccountAction;
            this.f7582U = str;
            this.f7583V = str2;
        }

        /* renamed from: a */
        public final Observable<C2814a> apply(List<String> list) {
            AccountCreateAttributes accountCreateAttributes = new AccountCreateAttributes(list);
            return this.f7584c.f7570a.create(this.f7582U, this.f7583V, accountCreateAttributes).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C2824a<Object,Object>(this, accountCreateAttributes));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.RegisterAccountAction$g */
    /* compiled from: RegisterAccountAction.kt */
    static final class C2825g<T, R> implements Function<Throwable, C2814a> {

        /* renamed from: c */
        final /* synthetic */ RegisterAccountAction f7587c;

        C2825g(RegisterAccountAction registerAccountAction) {
            this.f7587c = registerAccountAction;
        }

        /* renamed from: a */
        public final C2814a apply(Throwable th) {
            C14100a.m44524a(th, "Error attempting to create with BamIdentityApi!", new Object[0]);
            return this.f7587c.m10493a(th);
        }
    }

    public RegisterAccountAction(BamIdentityApi bamIdentityApi, AccountApi accountApi, C2750c cVar, LegalApi legalApi, C7614e eVar) {
        this.f7570a = bamIdentityApi;
        this.f7571b = accountApi;
        this.f7572c = cVar;
        this.f7573d = legalApi;
        this.f7574e = eVar;
    }

    /* renamed from: a */
    public final Observable<C2814a> mo11815a(String str, String str2) {
        Observable<C2814a> a = m10496a(str2);
        if (a != null) {
            return a;
        }
        Observable<C2814a> i = m10497a().mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C2823f<Object,Object>(this, str, str2)).mo30176c((ObservableSource<? extends T>) Observable.m38309b(C2818d.f7578a)).mo30198i(new C2825g(this));
        C12880j.m40222a((Object) i, "fetchLegalDisclosures()\n…owable)\n                }");
        return i;
    }

    /* renamed from: a */
    private final Observable<C2814a> m10496a(String str) {
        Integer a = this.f7572c.mo11762a(str);
        if (a == null) {
            return null;
        }
        a.intValue();
        return Observable.m38309b(new C2817c(this.f7574e.mo20536a((ServiceExceptionCase) InvalidPassword.INSTANCE).mo20546d()));
    }

    /* renamed from: a */
    private final Single<List<String>> m10497a() {
        Single<List<String>> g = this.f7573d.getLegalData().mo30231f(C2819b.f7579c).mo30193g(new C2820c()).mo30155a(new ArrayList(), (C11946b<? super U, ? super T>) C2821d.f7580a).mo30233g(C2822e.f7581c);
        C12880j.m40222a((Object) g, "this.flattenAsObservable…     .map { it.toList() }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C2814a> m10494a(IdentityToken identityToken, AccountCreateAttributes accountCreateAttributes) {
        Completable createAccount = this.f7571b.createAccount(identityToken, accountCreateAttributes);
        C2815a aVar = C2815a.f7575a;
        if (aVar != null) {
            Observable<C2814a> a = createAccount.mo30043a((ObservableSource<T>) Observable.m38309b(aVar));
            C12880j.m40222a((Object) a, "accountApi.createAccount…tCreated as ActionState))");
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.ActionState");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2814a m10493a(Throwable th) {
        C7619i b = this.f7574e.mo20538b(th);
        ServiceExceptionCase c = b.mo20545c();
        if (!C12880j.m40224a((Object) c, (Object) InvalidCredentials.INSTANCE) && !C12880j.m40224a((Object) c, (Object) InvalidPassword.INSTANCE)) {
            return new C2816b(b.mo20546d());
        }
        return new C2817c(b.mo20546d());
    }
}
