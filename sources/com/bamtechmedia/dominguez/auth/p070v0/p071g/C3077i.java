package com.bamtechmedia.dominguez.auth.p070v0.p071g;

import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2753b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2757f.C2758a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3054e;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3055f;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel$ViewState;", "loginEmailAction", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction;", "router", "Lcom/bamtechmedia/dominguez/auth/api/router/AccountValidationRouter;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "authHostViewModel", "Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;", "isTelevision", "", "serviceAvailabilityState", "Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;", "(Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction;Lcom/bamtechmedia/dominguez/auth/api/router/AccountValidationRouter;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;ZLcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "()Z", "handleAcceptedState", "", "actionState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$Accepted;", "handleAccountRecoveryState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$AccountRecovery;", "handleNotFoundState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$NotFound;", "login", "input", "mapLoginEmailActionState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;", "signUp", "ViewState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i */
/* compiled from: LoginEmailViewModel.kt */
public final class C3077i extends C5741g<C3081c> {

    /* renamed from: a */
    private String f7961a = this.f7966f.mo11802y();

    /* renamed from: b */
    private final C3048b f7962b;

    /* renamed from: c */
    private final C2753b f7963c;

    /* renamed from: d */
    private final C7626a f7964d;

    /* renamed from: e */
    private final C2755d f7965e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2784r f7966f;

    /* renamed from: g */
    private final C7930a f7967g;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "", "serviceAvailable", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$a */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3078a<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C3077i f7968c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$a$a */
        /* compiled from: LoginEmailViewModel.kt */
        static final class C3079a extends C12881k implements Function1<C3081c, C3081c> {

            /* renamed from: c */
            final /* synthetic */ Boolean f7969c;

            C3079a(Boolean bool) {
                this.f7969c = bool;
                super(1);
            }

            /* renamed from: a */
            public final C3081c invoke(C3081c cVar) {
                Boolean bool = this.f7969c;
                C12880j.m40222a((Object) bool, "serviceAvailable");
                return C3081c.m10904a(cVar, false, false, false, null, null, bool.booleanValue(), 31, null);
            }
        }

        C3078a(C3077i iVar) {
            this.f7968c = iVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f7968c.updateState(new C3079a(bool));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$b */
    /* compiled from: LoginEmailViewModel.kt */
    static final /* synthetic */ class C3080b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3080b f7970c = new C3080b();

        C3080b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12106a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12106a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$c */
    /* compiled from: LoginEmailViewModel.kt */
    public static final class C3081c {

        /* renamed from: a */
        private final boolean f7971a;

        /* renamed from: b */
        private final boolean f7972b;

        /* renamed from: c */
        private final boolean f7973c;

        /* renamed from: d */
        private final String f7974d;

        /* renamed from: e */
        private final Integer f7975e;

        /* renamed from: f */
        private final boolean f7976f;

        public C3081c() {
            this(false, false, false, null, null, false, 63, null);
        }

        public C3081c(boolean z, boolean z2, boolean z3, String str, Integer num, boolean z4) {
            this.f7971a = z;
            this.f7972b = z2;
            this.f7973c = z3;
            this.f7974d = str;
            this.f7975e = num;
            this.f7976f = z4;
        }

        /* renamed from: a */
        public static /* synthetic */ C3081c m10904a(C3081c cVar, boolean z, boolean z2, boolean z3, String str, Integer num, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f7971a;
            }
            if ((i & 2) != 0) {
                z2 = cVar.f7972b;
            }
            boolean z5 = z2;
            if ((i & 4) != 0) {
                z3 = cVar.f7973c;
            }
            boolean z6 = z3;
            if ((i & 8) != 0) {
                str = cVar.f7974d;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                num = cVar.f7975e;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                z4 = cVar.f7976f;
            }
            return cVar.mo12107a(z, z5, z6, str2, num2, z4);
        }

        /* renamed from: a */
        public final C3081c mo12107a(boolean z, boolean z2, boolean z3, String str, Integer num, boolean z4) {
            C3081c cVar = new C3081c(z, z2, z3, str, num, z4);
            return cVar;
        }

        /* renamed from: a */
        public final String mo12108a() {
            return this.f7974d;
        }

        /* renamed from: b */
        public final Integer mo12109b() {
            return this.f7975e;
        }

        /* renamed from: c */
        public final boolean mo12110c() {
            return this.f7972b;
        }

        /* renamed from: d */
        public final boolean mo12111d() {
            return this.f7976f;
        }

        /* renamed from: e */
        public final boolean mo12112e() {
            return this.f7971a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3081c) {
                    C3081c cVar = (C3081c) obj;
                    if (this.f7971a == cVar.f7971a) {
                        if (this.f7972b == cVar.f7972b) {
                            if ((this.f7973c == cVar.f7973c) && C12880j.m40224a((Object) this.f7974d, (Object) cVar.f7974d) && C12880j.m40224a((Object) this.f7975e, (Object) cVar.f7975e)) {
                                if (this.f7976f == cVar.f7976f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo12114f() {
            return this.f7973c;
        }

        public int hashCode() {
            boolean z = this.f7971a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f7972b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f7973c;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            String str = this.f7974d;
            int i5 = 0;
            int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.f7975e;
            if (num != null) {
                i5 = num.hashCode();
            }
            int i6 = (hashCode + i5) * 31;
            boolean z4 = this.f7976f;
            if (!z4) {
                i = z4;
            }
            return i6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewState(isLoading=");
            sb.append(this.f7971a);
            sb.append(", hasError=");
            sb.append(this.f7972b);
            sb.append(", isNotFoundError=");
            sb.append(this.f7973c);
            sb.append(", error=");
            sb.append(this.f7974d);
            sb.append(", errorKey=");
            sb.append(this.f7975e);
            sb.append(", signUpAvailable=");
            sb.append(this.f7976f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3081c(boolean z, boolean z2, boolean z3, String str, Integer num, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z5 = false;
            boolean z6 = (i & 1) != 0 ? false : z;
            boolean z7 = (i & 2) != 0 ? false : z2;
            if ((i & 4) == 0) {
                z5 = z3;
            }
            this(z6, z7, z5, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? true : z4);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$d */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3082d extends C12881k implements Function1<C3081c, C3081c> {

        /* renamed from: c */
        public static final C3082d f7977c = new C3082d();

        C3082d() {
            super(1);
        }

        /* renamed from: a */
        public final C3081c invoke(C3081c cVar) {
            C3081c cVar2 = new C3081c(false, false, false, null, null, cVar.mo12111d(), 30, null);
            return cVar2;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "", "available", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$e */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3083e<T> implements Consumer<Boolean> {

        /* renamed from: U */
        final /* synthetic */ C3053d f7978U;

        /* renamed from: c */
        final /* synthetic */ C3077i f7979c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$e$a */
        /* compiled from: LoginEmailViewModel.kt */
        static final class C3084a extends C12881k implements Function1<C3081c, C3081c> {

            /* renamed from: c */
            public static final C3084a f7980c = new C3084a();

            C3084a() {
                super(1);
            }

            /* renamed from: a */
            public final C3081c invoke(C3081c cVar) {
                C3081c cVar2 = new C3081c(false, false, true, null, Integer.valueOf(C2721j0.log_in_email_error_no_account), cVar.mo12111d(), 11, null);
                return cVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$e$b */
        /* compiled from: LoginEmailViewModel.kt */
        static final class C3085b extends C12881k implements Function1<C3081c, C3081c> {

            /* renamed from: c */
            public static final C3085b f7981c = new C3085b();

            C3085b() {
                super(1);
            }

            /* renamed from: a */
            public final C3081c invoke(C3081c cVar) {
                C3081c cVar2 = new C3081c(false, true, false, null, Integer.valueOf(C2721j0.log_in_email_error_no_account), cVar.mo12111d(), 13, null);
                return cVar2;
            }
        }

        C3083e(C3077i iVar, C3053d dVar) {
            this.f7979c = iVar;
            this.f7978U = dVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C12880j.m40222a((Object) bool, "available");
            if (bool.booleanValue()) {
                this.f7979c.f7966f.mo11798b(this.f7978U.mo12076a());
                this.f7979c.updateState(C3084a.f7980c);
                return;
            }
            this.f7979c.updateState(C3085b.f7981c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$f */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3086f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3086f f7982c = new C3086f();

        C3086f() {
        }

        /* renamed from: a */
        public final void mo12121a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo12121a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$g */
    /* compiled from: LoginEmailViewModel.kt */
    static final /* synthetic */ class C3087g extends C12879i implements Function1<C3049a, C13145v> {
        C3087g(C3077i iVar) {
            super(1, iVar);
        }

        /* renamed from: a */
        public final void mo12122a(C3049a aVar) {
            ((C3077i) this.receiver).m10895a(aVar);
        }

        public final String getName() {
            return "mapLoginEmailActionState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3077i.class);
        }

        public final String getSignature() {
            return "mapLoginEmailActionState(Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12122a((C3049a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$h */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3088h<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3088h f7983c = new C3088h();

        C3088h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Unhandled Exception: during LoginEmailAction", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$i */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3089i extends C12881k implements Function1<C3081c, C3081c> {

        /* renamed from: c */
        public static final C3089i f7984c = new C3089i();

        C3089i() {
            super(1);
        }

        /* renamed from: a */
        public final C3081c invoke(C3081c cVar) {
            C3081c cVar2 = new C3081c(true, false, false, null, null, cVar.mo12111d(), 30, null);
            return cVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.i$j */
    /* compiled from: LoginEmailViewModel.kt */
    static final class C3090j extends C12881k implements Function1<C3081c, C3081c> {

        /* renamed from: c */
        final /* synthetic */ C3049a f7985c;

        C3090j(C3049a aVar) {
            this.f7985c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C3081c invoke(C3081c cVar) {
            C3081c cVar2 = new C3081c(false, true, false, ((C3054e) this.f7985c).mo12080a(), ((C3054e) this.f7985c).mo12081b(), cVar.mo12111d(), 5, null);
            return cVar2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.auth.v0.g.i$b] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bamtechmedia.dominguez.auth.v0.g.j] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3077i(com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b r12, com.bamtechmedia.dominguez.auth.p061o0.p063i.C2753b r13, p163g.p201e.p203b.p307o.p308p.C7626a r14, com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d r15, com.bamtechmedia.dominguez.auth.C2784r r16, boolean r17, p163g.p201e.p203b.p327y.p328g.C7930a r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = 0
            r2 = 1
            r11.<init>(r1, r2, r1)
            r1 = r12
            r0.f7962b = r1
            r1 = r13
            r0.f7963c = r1
            r1 = r14
            r0.f7964d = r1
            r1 = r15
            r0.f7965e = r1
            r1 = r16
            r0.f7966f = r1
            r1 = r18
            r0.f7967g = r1
            com.bamtechmedia.dominguez.auth.r r1 = r0.f7966f
            java.lang.String r1 = r1.mo11802y()
            r0.f7961a = r1
            com.bamtechmedia.dominguez.auth.v0.g.i$c r1 = new com.bamtechmedia.dominguez.auth.v0.g.i$c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            r10 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.createState(r1)
            com.bamtechmedia.dominguez.auth.r r1 = r0.f7966f
            r2 = 0
            r1.mo11801d(r2)
            g.e.b.y.g.a r1 = r0.f7967g
            io.reactivex.Observable r1 = r1.mo19243b()
            g.n.a.c0 r2 = r11.getViewModelScope()
            g.n.a.h r2 = p163g.p503n.p504a.C11793e.m37930a(r2)
            java.lang.Object r1 = r1.mo30161a(r2)
            java.lang.String r2 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            g.n.a.a0 r1 = (p163g.p503n.p504a.C11786a0) r1
            com.bamtechmedia.dominguez.auth.v0.g.i$a r2 = new com.bamtechmedia.dominguez.auth.v0.g.i$a
            r2.<init>(r11)
            com.bamtechmedia.dominguez.auth.v0.g.i$b r3 = com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i.C3080b.f7970c
            if (r3 == 0) goto L_0x0062
            com.bamtechmedia.dominguez.auth.v0.g.j r4 = new com.bamtechmedia.dominguez.auth.v0.g.j
            r4.<init>(r3)
            r3 = r4
        L_0x0062:
            io.reactivex.functions.Consumer r3 = (p520io.reactivex.functions.Consumer) r3
            r1.mo29915a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i.<init>(com.bamtechmedia.dominguez.auth.v0.g.b, com.bamtechmedia.dominguez.auth.o0.i.b, g.e.b.o.p.a, com.bamtechmedia.dominguez.auth.o0.i.d, com.bamtechmedia.dominguez.auth.r, boolean, g.e.b.y.g.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12100b(java.lang.String r3) {
        /*
            r2 = this;
            com.bamtechmedia.dominguez.auth.v0.g.b r0 = r2.f7962b
            if (r3 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0011
            java.lang.CharSequence r3 = kotlin.p588j0.C12833x.m40181f(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0011:
            kotlin.s r3 = new kotlin.s
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r3.<init>(r0)
            throw r3
        L_0x0019:
            java.lang.String r3 = ""
        L_0x001b:
            io.reactivex.Observable r3 = r0.mo12063a(r3)
            g.n.a.c0 r0 = r2.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r3 = r3.mo30161a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r3, r0)
            g.n.a.a0 r3 = (p163g.p503n.p504a.C11786a0) r3
            com.bamtechmedia.dominguez.auth.v0.g.i$g r0 = new com.bamtechmedia.dominguez.auth.v0.g.i$g
            r0.<init>(r2)
            com.bamtechmedia.dominguez.auth.v0.g.j r1 = new com.bamtechmedia.dominguez.auth.v0.g.j
            r1.<init>(r0)
            com.bamtechmedia.dominguez.auth.v0.g.i$h r0 = com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i.C3088h.f7983c
            r3.mo29915a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i.mo12100b(java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo12101c(String str) {
        this.f7961a = str;
    }

    /* renamed from: d */
    public final void mo12102d(String str) {
        this.f7966f.mo11798b(str);
        C2758a.m10407a(this.f7963c, true, false, true, 2, null);
    }

    /* renamed from: y */
    public final String mo12103y() {
        return this.f7961a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10895a(C3049a aVar) {
        if (aVar instanceof C3055f) {
            updateState(C3089i.f7984c);
        } else if (aVar instanceof C3050a) {
            m10892a((C3050a) aVar);
        } else if (aVar instanceof C3053d) {
            m10894a((C3053d) aVar);
        } else if (aVar instanceof C3051b) {
            m10893a((C3051b) aVar);
        } else if (aVar instanceof C3054e) {
            updateState(new C3090j(aVar));
        } else if (aVar instanceof C3052c) {
            this.f7964d.mo20539a(((C3052c) aVar).mo12072a());
        }
    }

    /* renamed from: a */
    private final void m10892a(C3050a aVar) {
        this.f7966f.mo11798b(aVar.mo12064a());
        this.f7963c.mo11765b();
        updateState(C3082d.f7977c);
    }

    /* renamed from: a */
    private final void m10893a(C3051b bVar) {
        this.f7966f.mo11798b(bVar.mo12068a());
        this.f7965e.mo11771b();
    }

    /* renamed from: a */
    private final void m10894a(C3053d dVar) {
        Object a = this.f7967g.mo19244d().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C3083e(this, dVar), C3086f.f7982c);
    }
}
