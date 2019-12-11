package com.bamtechmedia.dominguez.auth.p069u0;

import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPassword;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction;", "", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "(Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;)V", "mapExceptionToActionState", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState;", "error", "", "resetPassword", "Lio/reactivex/Observable;", "newPassword", "", "validatePassword", "password", "ActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.u0.f */
/* compiled from: PasswordResetAction.kt */
public final class C2997f {

    /* renamed from: a */
    private final C2750c f7841a;

    /* renamed from: b */
    private final BamIdentityApi f7842b;

    /* renamed from: c */
    private final C7614e f7843c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState;", "", "()V", "GenericError", "InvalidPassword", "PasswordReset", "Verifying", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState$Verifying;", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState$PasswordReset;", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState$InvalidPassword;", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState$GenericError;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$a */
    /* compiled from: PasswordResetAction.kt */
    public static abstract class C2998a {

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$a$a */
        /* compiled from: PasswordResetAction.kt */
        public static final class C2999a extends C2998a {

            /* renamed from: a */
            private final String f7844a;

            public C2999a() {
                this(null, 1, null);
            }

            public C2999a(String str) {
                super(null);
                this.f7844a = str;
            }

            /* renamed from: a */
            public final String mo11994a() {
                return this.f7844a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7844a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C2999a) r2).f7844a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C2999a
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.u0.f$a$a r2 = (com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C2999a) r2
                    java.lang.String r0 = r1.f7844a
                    java.lang.String r2 = r2.f7844a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C2999a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7844a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GenericError(errorMessage=");
                sb.append(this.f7844a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2999a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = null;
                }
                this(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$a$b */
        /* compiled from: PasswordResetAction.kt */
        public static final class C3000b extends C2998a {

            /* renamed from: a */
            private final String f7845a;

            public C3000b(String str) {
                super(null);
                this.f7845a = str;
            }

            /* renamed from: a */
            public final String mo11998a() {
                return this.f7845a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7845a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3000b) r2).f7845a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3000b
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.u0.f$a$b r2 = (com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3000b) r2
                    java.lang.String r0 = r1.f7845a
                    java.lang.String r2 = r2.f7845a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3000b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7845a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("InvalidPassword(errorMessage=");
                sb.append(this.f7845a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$a$c */
        /* compiled from: PasswordResetAction.kt */
        public static final class C3001c extends C2998a {

            /* renamed from: a */
            private final String f7846a;

            public C3001c(String str) {
                super(null);
                this.f7846a = str;
            }

            /* renamed from: a */
            public final String mo12002a() {
                return this.f7846a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7846a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3001c) r2).f7846a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3001c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.u0.f$a$c r2 = (com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3001c) r2
                    java.lang.String r0 = r1.f7846a
                    java.lang.String r2 = r2.f7846a
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
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3001c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f7846a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PasswordReset(newPassword=");
                sb.append(this.f7846a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$a$d */
        /* compiled from: PasswordResetAction.kt */
        public static final class C3002d extends C2998a {

            /* renamed from: a */
            public static final C3002d f7847a = new C3002d();

            private C3002d() {
                super(null);
            }
        }

        private C2998a() {
        }

        public /* synthetic */ C2998a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.f$b */
    /* compiled from: PasswordResetAction.kt */
    static final class C3003b<T, R> implements Function<Throwable, C2998a> {

        /* renamed from: c */
        final /* synthetic */ C2997f f7848c;

        C3003b(C2997f fVar) {
            this.f7848c = fVar;
        }

        /* renamed from: a */
        public final C2998a apply(Throwable th) {
            C14100a.m44528b(th, "Error attempting to reset account password", new Object[0]);
            return this.f7848c.m10787a(th);
        }
    }

    public C2997f(C2750c cVar, BamIdentityApi bamIdentityApi, C7614e eVar) {
        this.f7841a = cVar;
        this.f7842b = bamIdentityApi;
        this.f7843c = eVar;
    }

    /* renamed from: b */
    private final Observable<C2998a> m10788b(String str) {
        Integer a = this.f7841a.mo11762a(str);
        if (a == null) {
            return null;
        }
        a.intValue();
        return Observable.m38309b(new C3000b(this.f7843c.mo20536a((ServiceExceptionCase) InvalidPassword.INSTANCE).mo20546d()));
    }

    /* renamed from: a */
    public final Observable<C2998a> mo11993a(String str) {
        Observable<C2998a> b = m10788b(str);
        if (b != null) {
            return b;
        }
        Observable<C2998a> i = this.f7842b.updatePassword(null, str).mo30043a((ObservableSource<T>) Observable.m38309b(new C3001c(str))).mo30176c((ObservableSource<? extends T>) Observable.m38309b(C3002d.f7847a)).mo30198i(new C3003b(this));
        C12880j.m40222a((Object) i, "identityApi.updatePasswo…(error)\n                }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2998a m10787a(Throwable th) {
        C7619i b = this.f7843c.mo20538b(th);
        ServiceExceptionCase c = b.mo20545c();
        if (!C12880j.m40224a((Object) c, (Object) InvalidCredentials.INSTANCE) && !C12880j.m40224a((Object) c, (Object) InvalidPassword.INSTANCE)) {
            return new C2999a(b.mo20546d());
        }
        return new C3000b(b.mo20546d());
    }
}
