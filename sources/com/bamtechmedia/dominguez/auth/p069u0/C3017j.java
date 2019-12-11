package com.bamtechmedia.dominguez.auth.p069u0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p067s0.C2887n;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C2999a;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3000b;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3001c;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f.C2998a.C3002d;
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
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J,\u0010\u001a\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b0\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001cR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel$State;", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "passwordResetAction", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction;", "authSuccessAction", "Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "autoLogin", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "analytics", "Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "(Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction;Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "disposables$annotations", "()V", "getDisposables$auth_release", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables$auth_release", "(Lio/reactivex/disposables/CompositeDisposable;)V", "emailOnce", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "handleResetSuccess", "", "newPassword", "resetPassword", "password", "updatePasswordStrength", "State", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.u0.j */
/* compiled from: PasswordResetViewModel.kt */
public final class C3017j extends C5741g<C3018a> {

    /* renamed from: a */
    private CompositeDisposable f7864a = new CompositeDisposable();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2750c f7865b;

    /* renamed from: c */
    private final C2997f f7866c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3140w f7867d;

    /* renamed from: e */
    private final AccountApi f7868e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2760a f7869f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7626a f7870g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2887n f7871h;

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$a */
    /* compiled from: PasswordResetViewModel.kt */
    public static final class C3018a {

        /* renamed from: a */
        private final boolean f7872a;

        /* renamed from: b */
        private final boolean f7873b;

        /* renamed from: c */
        private final String f7874c;

        /* renamed from: d */
        private final C2749b f7875d;

        /* renamed from: e */
        private final boolean f7876e;

        public C3018a() {
            this(false, false, null, null, false, 31, null);
        }

        public C3018a(boolean z, boolean z2, String str, C2749b bVar, boolean z3) {
            this.f7872a = z;
            this.f7873b = z2;
            this.f7874c = str;
            this.f7875d = bVar;
            this.f7876e = z3;
        }

        /* renamed from: a */
        public static /* synthetic */ C3018a m10822a(C3018a aVar, boolean z, boolean z2, String str, C2749b bVar, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f7872a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f7873b;
            }
            boolean z4 = z2;
            if ((i & 4) != 0) {
                str = aVar.f7874c;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                bVar = aVar.f7875d;
            }
            C2749b bVar2 = bVar;
            if ((i & 16) != 0) {
                z3 = aVar.f7876e;
            }
            return aVar.mo12022a(z, z4, str2, bVar2, z3);
        }

        /* renamed from: a */
        public final C3018a mo12022a(boolean z, boolean z2, String str, C2749b bVar, boolean z3) {
            C3018a aVar = new C3018a(z, z2, str, bVar, z3);
            return aVar;
        }

        /* renamed from: a */
        public final String mo12023a() {
            return this.f7874c;
        }

        /* renamed from: b */
        public final boolean mo12024b() {
            return this.f7873b;
        }

        /* renamed from: c */
        public final C2749b mo12025c() {
            return this.f7875d;
        }

        /* renamed from: d */
        public final boolean mo12026d() {
            return this.f7876e;
        }

        /* renamed from: e */
        public final boolean mo12027e() {
            return this.f7872a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3018a) {
                    C3018a aVar = (C3018a) obj;
                    if (this.f7872a == aVar.f7872a) {
                        if ((this.f7873b == aVar.f7873b) && C12880j.m40224a((Object) this.f7874c, (Object) aVar.f7874c) && C12880j.m40224a((Object) this.f7875d, (Object) aVar.f7875d)) {
                            if (this.f7876e == aVar.f7876e) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f7872a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f7873b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            String str = this.f7874c;
            int i4 = 0;
            int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            C2749b bVar = this.f7875d;
            if (bVar != null) {
                i4 = bVar.hashCode();
            }
            int i5 = (hashCode + i4) * 31;
            boolean z3 = this.f7876e;
            if (!z3) {
                i = z3;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(isLoading=");
            sb.append(this.f7872a);
            sb.append(", hasError=");
            sb.append(this.f7873b);
            sb.append(", errorMessage=");
            sb.append(this.f7874c);
            sb.append(", passwordStrength=");
            sb.append(this.f7875d);
            sb.append(", resetSuccess=");
            sb.append(this.f7876e);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3018a(boolean z, boolean z2, String str, C2749b bVar, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z4 = (i & 1) != 0 ? false : z;
            this(z4, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? false : z3);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$b */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3019b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3019b f7877c = new C3019b();

        C3019b() {
        }

        /* renamed from: a */
        public final String apply(DefaultAccount defaultAccount) {
            Object obj = defaultAccount.getAttributes().get("email");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            return str != null ? str : "";
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$c */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3020c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C3017j f7878a;

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$c$a */
        /* compiled from: PasswordResetViewModel.kt */
        static final class C3021a extends C12881k implements Function1<C3018a, C3018a> {

            /* renamed from: c */
            public static final C3021a f7879c = new C3021a();

            C3021a() {
                super(1);
            }

            /* renamed from: a */
            public final C3018a invoke(C3018a aVar) {
                return C3018a.m10822a(aVar, false, false, null, null, true, 15, null);
            }
        }

        C3020c(C3017j jVar) {
            this.f7878a = jVar;
        }

        public final void run() {
            this.f7878a.mo12021y().mo30250b(this.f7878a.f7867d.onSuccess());
            this.f7878a.updateState(C3021a.f7879c);
            this.f7878a.f7871h.mo11877a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$d */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3022d<T> implements Consumer<String> {

        /* renamed from: U */
        final /* synthetic */ String f7880U;

        /* renamed from: c */
        final /* synthetic */ C3017j f7881c;

        C3022d(C3017j jVar, String str) {
            this.f7881c = jVar;
            this.f7880U = str;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C2760a c = this.f7881c.f7869f;
            if (c != null) {
                C12880j.m40222a((Object) str, "it");
                c.store(str, this.f7880U);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$e */
    /* compiled from: PasswordResetViewModel.kt */
    static final /* synthetic */ class C3023e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3023e f7882c = new C3023e();

        C3023e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12034a(Throwable th) {
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
            mo12034a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"mapActionStateToViewState", "", "actionState", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$f */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3024f extends C12881k implements Function1<C2998a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3017j f7883c;

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$f$a */
        /* compiled from: PasswordResetViewModel.kt */
        static final class C3025a extends C12881k implements Function1<C3018a, C3018a> {

            /* renamed from: c */
            public static final C3025a f7884c = new C3025a();

            C3025a() {
                super(1);
            }

            /* renamed from: a */
            public final C3018a invoke(C3018a aVar) {
                return C3018a.m10822a(aVar, true, false, null, null, false, 24, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$f$b */
        /* compiled from: PasswordResetViewModel.kt */
        static final class C3026b extends C12881k implements Function1<C3018a, C3018a> {

            /* renamed from: c */
            final /* synthetic */ C2998a f7885c;

            C3026b(C2998a aVar) {
                this.f7885c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C3018a invoke(C3018a aVar) {
                return C3018a.m10822a(aVar, false, true, ((C3000b) this.f7885c).mo11998a(), null, false, 24, null);
            }
        }

        C3024f(C3017j jVar) {
            this.f7883c = jVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12035a(C2998a aVar) {
            if (aVar instanceof C3002d) {
                this.f7883c.updateState(C3025a.f7884c);
            } else if (aVar instanceof C3001c) {
                this.f7883c.m10816d(((C3001c) aVar).mo12002a());
            } else if (aVar instanceof C3000b) {
                this.f7883c.updateState(new C3026b(aVar));
            } else if (aVar instanceof C2999a) {
                this.f7883c.f7870g.mo20539a(((C2999a) aVar).mo11994a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12035a((C2998a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$g */
    /* compiled from: PasswordResetViewModel.kt */
    static final /* synthetic */ class C3027g extends C12879i implements Function1<C2998a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3024f f7886c;

        C3027g(C3024f fVar) {
            this.f7886c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12038a(C2998a aVar) {
            this.f7886c.mo12035a(aVar);
        }

        public final String getName() {
            return "mapActionStateToViewState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12038a((C2998a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$h */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3028h<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C3017j f7887c;

        C3028h(C3017j jVar) {
            this.f7887c = jVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error resetting password", new Object[0]);
            C7627a.m22614a(this.f7887c.f7870g, null, 1, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.j$i */
    /* compiled from: PasswordResetViewModel.kt */
    static final class C3029i extends C12881k implements Function1<C3018a, C3018a> {

        /* renamed from: U */
        final /* synthetic */ String f7888U;

        /* renamed from: c */
        final /* synthetic */ C3017j f7889c;

        C3029i(C3017j jVar, String str) {
            this.f7889c = jVar;
            this.f7888U = str;
            super(1);
        }

        /* renamed from: a */
        public final C3018a invoke(C3018a aVar) {
            return C3018a.m10822a(aVar, false, false, null, this.f7889c.f7865b.mo11763b(this.f7888U), false, 23, null);
        }
    }

    public C3017j(C2750c cVar, C2997f fVar, C3140w wVar, AccountApi accountApi, C2760a aVar, C7626a aVar2, C2887n nVar) {
        super(null, 1, null);
        this.f7865b = cVar;
        this.f7866c = fVar;
        this.f7867d = wVar;
        this.f7868e = accountApi;
        this.f7869f = aVar;
        this.f7870g = aVar2;
        this.f7871h = nVar;
        C3018a aVar3 = new C3018a(false, false, null, null, false, 31, null);
        createState(aVar3);
    }

    /* renamed from: z */
    private final Single<String> m10818z() {
        return this.f7868e.getAccount().mo30131f(C3019b.f7877c).mo30134g();
    }

    /* renamed from: y */
    public final CompositeDisposable mo12021y() {
        return this.f7864a;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.bamtechmedia.dominguez.auth.u0.j$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.auth.u0.k] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10816d(java.lang.String r4) {
        /*
            r3 = this;
            io.reactivex.Single r0 = r3.m10818z()
            com.bamtechmedia.dominguez.auth.u0.j$c r1 = new com.bamtechmedia.dominguez.auth.u0.j$c
            r1.<init>(r3)
            io.reactivex.Single r0 = r0.mo30209a(r1)
            java.lang.String r1 = "emailOnce()\n            …rdSuccess()\n            }"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.c0 r1 = r3.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30215a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.d0 r0 = (p163g.p503n.p504a.C11792d0) r0
            com.bamtechmedia.dominguez.auth.u0.j$d r1 = new com.bamtechmedia.dominguez.auth.u0.j$d
            r1.<init>(r3, r4)
            com.bamtechmedia.dominguez.auth.u0.j$e r4 = com.bamtechmedia.dominguez.auth.p069u0.C3017j.C3023e.f7882c
            if (r4 == 0) goto L_0x0034
            com.bamtechmedia.dominguez.auth.u0.k r2 = new com.bamtechmedia.dominguez.auth.u0.k
            r2.<init>(r4)
            r4 = r2
        L_0x0034:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r0.mo29920a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p069u0.C3017j.m10816d(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo12019b(String str) {
        C3024f fVar = new C3024f(this);
        Object a = this.f7866c.mo11993a(str).mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C3030k(new C3027g(fVar)), new C3028h(this));
    }

    /* renamed from: c */
    public final void mo12020c(String str) {
        updateState(new C3029i(this, str));
    }
}
