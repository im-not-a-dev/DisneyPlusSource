package com.bamtechmedia.dominguez.auth.p070v0.p071g;

import com.bamtech.sdk4.identity.bam.AuthenticationFlow;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow.Authenticate;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow.CreateIdentity;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow.OneTimePasscode;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidEmail;
import com.bamtechmedia.dominguez.core.C3796d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction;", "", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtechmedia/dominguez/core/OfflineState;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "login", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;", "email", "", "mapAuthenticationFlowToActionState", "authFlowStates", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "mapErrorToActionState", "error", "", "ActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b */
/* compiled from: LoginEmailAction.kt */
public final class C3048b {

    /* renamed from: a */
    private final BamIdentityApi f7923a;

    /* renamed from: b */
    private final C7614e f7924b;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;", "", "()V", "Accepted", "AccountRecovery", "GenericError", "NotFound", "UserError", "Verifying", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$Verifying;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$Accepted;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$NotFound;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$AccountRecovery;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$UserError;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$GenericError;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a */
    /* compiled from: LoginEmailAction.kt */
    public static abstract class C3049a {

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$a */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3050a extends C3049a {

            /* renamed from: a */
            private final String f7925a;

            public C3050a(String str) {
                super(null);
                this.f7925a = str;
            }

            /* renamed from: a */
            public final String mo12064a() {
                return this.f7925a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7925a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a) r2).f7925a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.v0.g.b$a$a r2 = (com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a) r2
                    java.lang.String r0 = r1.f7925a
                    java.lang.String r2 = r2.f7925a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7925a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Accepted(inputString=");
                sb.append(this.f7925a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$b */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3051b extends C3049a {

            /* renamed from: a */
            private final String f7926a;

            public C3051b(String str) {
                super(null);
                this.f7926a = str;
            }

            /* renamed from: a */
            public final String mo12068a() {
                return this.f7926a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7926a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b) r2).f7926a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.v0.g.b$a$b r2 = (com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b) r2
                    java.lang.String r0 = r1.f7926a
                    java.lang.String r2 = r2.f7926a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7926a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AccountRecovery(email=");
                sb.append(this.f7926a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$c */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3052c extends C3049a {

            /* renamed from: a */
            private final String f7927a;

            public C3052c() {
                this(null, 1, null);
            }

            public C3052c(String str) {
                super(null);
                this.f7927a = str;
            }

            /* renamed from: a */
            public final String mo12072a() {
                return this.f7927a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7927a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c) r2).f7927a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.v0.g.b$a$c r2 = (com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c) r2
                    java.lang.String r0 = r1.f7927a
                    java.lang.String r2 = r2.f7927a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7927a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f7927a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C3052c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$d */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3053d extends C3049a {

            /* renamed from: a */
            private final String f7928a;

            public C3053d(String str) {
                super(null);
                this.f7928a = str;
            }

            /* renamed from: a */
            public final String mo12076a() {
                return this.f7928a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7928a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d) r2).f7928a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.v0.g.b$a$d r2 = (com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d) r2
                    java.lang.String r0 = r1.f7928a
                    java.lang.String r2 = r2.f7928a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7928a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("NotFound(inputString=");
                sb.append(this.f7928a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$e */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3054e extends C3049a {

            /* renamed from: a */
            private final String f7929a;

            /* renamed from: b */
            private final Integer f7930b;

            public C3054e() {
                this(null, null, 3, null);
            }

            public C3054e(String str, Integer num) {
                super(null);
                this.f7929a = str;
                this.f7930b = num;
            }

            /* renamed from: a */
            public final String mo12080a() {
                return this.f7929a;
            }

            /* renamed from: b */
            public final Integer mo12081b() {
                return this.f7930b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f7930b, (java.lang.Object) r3.f7930b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3054e
                    if (r0 == 0) goto L_0x001d
                    com.bamtechmedia.dominguez.auth.v0.g.b$a$e r3 = (com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3054e) r3
                    java.lang.String r0 = r2.f7929a
                    java.lang.String r1 = r3.f7929a
                    boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.Integer r0 = r2.f7930b
                    java.lang.Integer r3 = r3.f7930b
                    boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3054e.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7929a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f7930b;
                if (num != null) {
                    i = num.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UserError(message=");
                sb.append(this.f7929a);
                sb.append(", messageKey=");
                sb.append(this.f7930b);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C3054e(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    num = null;
                }
                this(str, num);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$a$f */
        /* compiled from: LoginEmailAction.kt */
        public static final class C3055f extends C3049a {

            /* renamed from: a */
            public static final C3055f f7931a = new C3055f();

            private C3055f() {
                super(null);
            }
        }

        private C3049a() {
        }

        public /* synthetic */ C3049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$b */
    /* compiled from: LoginEmailAction.kt */
    static final class C3056b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ String f7932U;

        /* renamed from: c */
        final /* synthetic */ C3048b f7933c;

        C3056b(C3048b bVar, String str) {
            this.f7933c = bVar;
            this.f7932U = str;
        }

        /* renamed from: a */
        public final C3049a apply(List<? extends AuthenticationFlow> list) {
            return this.f7933c.m10854a(list, this.f7932U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.b$c */
    /* compiled from: LoginEmailAction.kt */
    static final class C3057c<T, R> implements Function<Throwable, C3049a> {

        /* renamed from: U */
        final /* synthetic */ String f7934U;

        /* renamed from: c */
        final /* synthetic */ C3048b f7935c;

        C3057c(C3048b bVar, String str) {
            this.f7935c = bVar;
            this.f7934U = str;
        }

        /* renamed from: a */
        public final C3049a apply(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error calling BamIdentityApi.getAuthenticationFlow(\"");
            sb.append(this.f7934U);
            sb.append("\")");
            C14100a.m44530c(th, sb.toString(), new Object[0]);
            return this.f7935c.m10853a(th);
        }
    }

    public C3048b(BamIdentityApi bamIdentityApi, C3796d dVar, C7614e eVar) {
        this.f7923a = bamIdentityApi;
        this.f7924b = eVar;
    }

    /* renamed from: a */
    public final Observable<C3049a> mo12063a(String str) {
        Observable<C3049a> i = this.f7923a.getAuthenticationFlow(str).mo30233g(new C3056b(this, str)).mo30236i().mo30154a(C3055f.f7931a).mo30198i(new C3057c(this, str));
        C12880j.m40222a((Object) i, "identityApi.getAuthentic…tate(error)\n            }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3049a m10853a(Throwable th) {
        C7619i b = this.f7924b.mo20538b(th);
        if (C12880j.m40224a((Object) b.mo20545c(), (Object) InvalidEmail.INSTANCE)) {
            return new C3054e(b.mo20546d(), null, 2, null);
        }
        return new C3052c(b.mo20546d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3049a m10854a(List<? extends AuthenticationFlow> list, String str) {
        boolean z;
        boolean z2;
        boolean z3 = list instanceof Collection;
        boolean z4 = false;
        if (!z3 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AuthenticationFlow) it.next()) instanceof Authenticate) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return new C3050a(str);
        }
        if (!z3 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((AuthenticationFlow) it2.next()) instanceof CreateIdentity) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            return new C3053d(str);
        }
        if (!z3 || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((AuthenticationFlow) it3.next()) instanceof OneTimePasscode) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z4) {
            return new C3051b(str);
        }
        return new C3052c(null, 1, null);
    }
}
