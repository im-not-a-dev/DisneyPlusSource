package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2930a;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2931b;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2932c;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2933d;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2934e;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w.C2929a.C2935f;
import com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a;
import com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2942a;
import com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2943b;
import com.bamtechmedia.dominguez.auth.p067s0.C2940x.C2941a.C2944c;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u001c\u0010 \u001a\u00020\u001d2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"H\u0002J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u001dH\u0016J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\u0010\u0010+\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u0010J\b\u0010,\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel$State;", "email", "", "requestAction", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction;", "redeemAction", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction;", "authSuccessAction", "Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "isTelevision", "", "otpAnalytics", "Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction;Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction;Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;ZLcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "disposables$annotations", "()V", "getDisposables$auth_release", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables$auth_release", "(Lio/reactivex/disposables/CompositeDisposable;)V", "authenticateWithPasscode", "", "passcode", "handleAuthSuccess", "handleRedeemStream", "redeemStream", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState;", "handleRequestActionState", "newState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRequestAction$RequestActionState;", "resend", "onCleared", "redeemForPasswordReset", "requestOtpEmail", "showResentMessage", "Companion", "State", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.o0 */
/* compiled from: OtpViewModel.kt */
public final class C2901o0 extends C5741g<C2903b> {

    /* renamed from: a */
    private CompositeDisposable f7713a = new CompositeDisposable();

    /* renamed from: b */
    private final String f7714b;

    /* renamed from: c */
    private final C2940x f7715c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2928w f7716d;

    /* renamed from: e */
    private final C3140w f7717e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7626a f7718f;

    /* renamed from: g */
    private final C7547h f7719g;

    /* renamed from: h */
    private final boolean f7720h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2887n f7721i;

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$a */
    /* compiled from: OtpViewModel.kt */
    public static final class C2902a {
        private C2902a() {
        }

        public /* synthetic */ C2902a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$b */
    /* compiled from: OtpViewModel.kt */
    public static final class C2903b {

        /* renamed from: a */
        private final boolean f7722a;

        /* renamed from: b */
        private final boolean f7723b;

        /* renamed from: c */
        private final String f7724c;

        /* renamed from: d */
        private final boolean f7725d;

        /* renamed from: e */
        private final boolean f7726e;

        /* renamed from: f */
        private final boolean f7727f;

        public C2903b() {
            this(false, false, null, false, false, false, 63, null);
        }

        public C2903b(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5) {
            this.f7722a = z;
            this.f7723b = z2;
            this.f7724c = str;
            this.f7725d = z3;
            this.f7726e = z4;
            this.f7727f = z5;
        }

        /* renamed from: a */
        public static /* synthetic */ C2903b m10659a(C2903b bVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f7722a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.f7723b;
            }
            boolean z6 = z2;
            if ((i & 4) != 0) {
                str = bVar.f7724c;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z3 = bVar.f7725d;
            }
            boolean z7 = z3;
            if ((i & 16) != 0) {
                z4 = bVar.f7726e;
            }
            boolean z8 = z4;
            if ((i & 32) != 0) {
                z5 = bVar.f7727f;
            }
            return bVar.mo11906a(z, z6, str2, z7, z8, z5);
        }

        /* renamed from: a */
        public final C2903b mo11906a(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5) {
            C2903b bVar = new C2903b(z, z2, str, z3, z4, z5);
            return bVar;
        }

        /* renamed from: a */
        public final boolean mo11907a() {
            return this.f7727f;
        }

        /* renamed from: b */
        public final boolean mo11908b() {
            return this.f7726e;
        }

        /* renamed from: c */
        public final boolean mo11909c() {
            return this.f7723b;
        }

        /* renamed from: d */
        public final String mo11910d() {
            return this.f7724c;
        }

        /* renamed from: e */
        public final boolean mo11911e() {
            return this.f7725d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2903b) {
                    C2903b bVar = (C2903b) obj;
                    if (this.f7722a == bVar.f7722a) {
                        if ((this.f7723b == bVar.f7723b) && C12880j.m40224a((Object) this.f7724c, (Object) bVar.f7724c)) {
                            if (this.f7725d == bVar.f7725d) {
                                if (this.f7726e == bVar.f7726e) {
                                    if (this.f7727f == bVar.f7727f) {
                                        return true;
                                    }
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
        public final boolean mo11913f() {
            return this.f7722a;
        }

        public int hashCode() {
            boolean z = this.f7722a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f7723b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            String str = this.f7724c;
            int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z3 = this.f7725d;
            if (z3) {
                z3 = true;
            }
            int i4 = (hashCode + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f7726e;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f7727f;
            if (!z5) {
                i = z5;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(isLoading=");
            sb.append(this.f7722a);
            sb.append(", hasPasscodeError=");
            sb.append(this.f7723b);
            sb.append(", passcodeErrorMessage=");
            sb.append(this.f7724c);
            sb.append(", redeemSuccess=");
            sb.append(this.f7725d);
            sb.append(", authSuccess=");
            sb.append(this.f7726e);
            sb.append(", accountBlocked=");
            sb.append(this.f7727f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C2903b(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z6 = (i & 1) != 0 ? false : z;
            boolean z7 = (i & 2) != 0 ? false : z2;
            if ((i & 4) != 0) {
                str = null;
            }
            this(z6, z7, str, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$c */
    /* compiled from: OtpViewModel.kt */
    static final class C2904c extends C12881k implements Function0<Observable<C2929a>> {

        /* renamed from: U */
        final /* synthetic */ String f7728U;

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7729c;

        C2904c(C2901o0 o0Var, String str) {
            this.f7729c = o0Var;
            this.f7728U = str;
            super(0);
        }

        public final Observable<C2929a> invoke() {
            return this.f7729c.f7716d.mo11929a(this.f7728U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$d */
    /* compiled from: OtpViewModel.kt */
    static final class C2905d extends C12881k implements Function1<C2903b, C2903b> {

        /* renamed from: c */
        public static final C2905d f7730c = new C2905d();

        C2905d() {
            super(1);
        }

        /* renamed from: a */
        public final C2903b invoke(C2903b bVar) {
            return C2903b.m10659a(bVar, false, false, null, false, true, false, 47, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"handleRedeemActionState", "", "newState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e */
    /* compiled from: OtpViewModel.kt */
    static final class C2906e extends C12881k implements Function1<C2929a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7731c;

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e$a */
        /* compiled from: OtpViewModel.kt */
        static final class C2907a extends C12881k implements Function1<C2903b, C2903b> {

            /* renamed from: c */
            public static final C2907a f7732c = new C2907a();

            C2907a() {
                super(1);
            }

            /* renamed from: a */
            public final C2903b invoke(C2903b bVar) {
                C2903b bVar2 = new C2903b(true, false, null, false, false, false, 62, null);
                return bVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e$b */
        /* compiled from: OtpViewModel.kt */
        static final class C2908b extends C12881k implements Function1<C2903b, C2903b> {

            /* renamed from: c */
            public static final C2908b f7733c = new C2908b();

            C2908b() {
                super(1);
            }

            /* renamed from: a */
            public final C2903b invoke(C2903b bVar) {
                return C2903b.m10659a(bVar, false, false, null, true, false, false, 55, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e$c */
        /* compiled from: OtpViewModel.kt */
        static final class C2909c extends C12881k implements Function1<C2903b, C2903b> {

            /* renamed from: c */
            final /* synthetic */ C2929a f7734c;

            C2909c(C2929a aVar) {
                this.f7734c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C2903b invoke(C2903b bVar) {
                C2903b bVar2 = new C2903b(false, true, ((C2935f) this.f7734c).mo11935a(), false, false, false, 57, null);
                return bVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e$d */
        /* compiled from: OtpViewModel.kt */
        static final class C2910d extends C12881k implements Function1<C2903b, C2903b> {

            /* renamed from: c */
            public static final C2910d f7735c = new C2910d();

            C2910d() {
                super(1);
            }

            /* renamed from: a */
            public final C2903b invoke(C2903b bVar) {
                C2903b bVar2 = new C2903b(false, false, null, false, false, false, 63, null);
                return bVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$e$e */
        /* compiled from: OtpViewModel.kt */
        static final class C2911e extends C12881k implements Function1<C2903b, C2903b> {

            /* renamed from: c */
            public static final C2911e f7736c = new C2911e();

            C2911e() {
                super(1);
            }

            /* renamed from: a */
            public final C2903b invoke(C2903b bVar) {
                return C2903b.m10659a(bVar, false, false, null, false, false, true, 31, null);
            }
        }

        C2906e(C2901o0 o0Var) {
            this.f7731c = o0Var;
            super(1);
        }

        /* renamed from: a */
        public final void mo11917a(C2929a aVar) {
            if (aVar instanceof C2934e) {
                this.f7731c.updateState(C2907a.f7732c);
            } else if (aVar instanceof C2931b) {
                this.f7731c.m10654y();
            } else if (aVar instanceof C2933d) {
                this.f7731c.f7721i.mo11885i();
                this.f7731c.updateState(C2908b.f7733c);
            } else if (aVar instanceof C2935f) {
                this.f7731c.updateState(new C2909c(aVar));
            } else if (aVar instanceof C2932c) {
                this.f7731c.updateState(C2910d.f7735c);
                this.f7731c.f7718f.mo20539a(((C2932c) aVar).mo11931a());
            } else if (aVar instanceof C2930a) {
                this.f7731c.updateState(C2911e.f7736c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11917a((C2929a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$f */
    /* compiled from: OtpViewModel.kt */
    static final /* synthetic */ class C2912f extends C12879i implements Function1<C2929a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2906e f7737c;

        C2912f(C2906e eVar) {
            this.f7737c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11923a(C2929a aVar) {
            this.f7737c.mo11917a(aVar);
        }

        public final String getName() {
            return "handleRedeemActionState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/auth/otp/OtpRedeemAction$RedeemActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11923a((C2929a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$g */
    /* compiled from: OtpViewModel.kt */
    static final class C2913g<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7738c;

        C2913g(C2901o0 o0Var) {
            this.f7738c = o0Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error attempting to authenticate with OTP passcode.", new Object[0]);
            C7627a.m22614a(this.f7738c.f7718f, null, 1, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$h */
    /* compiled from: OtpViewModel.kt */
    static final class C2914h extends C12881k implements Function1<C2903b, C2903b> {

        /* renamed from: c */
        public static final C2914h f7739c = new C2914h();

        C2914h() {
            super(1);
        }

        /* renamed from: a */
        public final C2903b invoke(C2903b bVar) {
            C2903b bVar2 = new C2903b(true, false, null, false, false, false, 62, null);
            return bVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$i */
    /* compiled from: OtpViewModel.kt */
    static final class C2915i extends C12881k implements Function1<C2903b, C2903b> {

        /* renamed from: c */
        public static final C2915i f7740c = new C2915i();

        C2915i() {
            super(1);
        }

        /* renamed from: a */
        public final C2903b invoke(C2903b bVar) {
            C2903b bVar2 = new C2903b(false, false, null, false, false, false, 63, null);
            return bVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$j */
    /* compiled from: OtpViewModel.kt */
    static final class C2916j extends C12881k implements Function0<Observable<C2929a>> {

        /* renamed from: U */
        final /* synthetic */ String f7741U;

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7742c;

        C2916j(C2901o0 o0Var, String str) {
            this.f7742c = o0Var;
            this.f7741U = str;
            super(0);
        }

        public final Observable<C2929a> invoke() {
            return this.f7742c.f7716d.mo11930b(this.f7741U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$k */
    /* compiled from: OtpViewModel.kt */
    static final class C2917k<T> implements Consumer<C2941a> {

        /* renamed from: U */
        final /* synthetic */ boolean f7743U;

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7744c;

        C2917k(C2901o0 o0Var, boolean z) {
            this.f7744c = o0Var;
            this.f7743U = z;
        }

        /* renamed from: a */
        public final void accept(C2941a aVar) {
            C2901o0 o0Var = this.f7744c;
            C12880j.m40222a((Object) aVar, "it");
            o0Var.m10649a(aVar, this.f7743U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o0$l */
    /* compiled from: OtpViewModel.kt */
    static final class C2918l<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C2901o0 f7745c;

        C2918l(C2901o0 o0Var) {
            this.f7745c = o0Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error requesting OTP passcode email to be sent.", new Object[0]);
            C7627a.m22614a(this.f7745c.f7718f, null, 1, null);
        }
    }

    static {
        new C2902a(null);
    }

    public C2901o0(String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, boolean z, C2887n nVar) {
        super(null, 1, null);
        this.f7714b = str;
        this.f7715c = xVar;
        this.f7716d = wVar;
        this.f7717e = wVar2;
        this.f7718f = aVar;
        this.f7719g = hVar;
        this.f7720h = z;
        this.f7721i = nVar;
        C2903b bVar = new C2903b(false, false, null, false, false, false, 63, null);
        createState(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m10654y() {
        this.f7721i.mo11885i();
        this.f7713a.mo30250b(this.f7717e.onSuccess());
        updateState(C2905d.f7730c);
    }

    /* renamed from: z */
    private final void m10655z() {
        C7547h hVar = this.f7719g;
        C7544a aVar = new C7544a();
        aVar.mo20468a("OTP - Password Sent Modal");
        aVar.mo20473c("OTP - Password Sent Modal : OK Click");
        aVar.mo20466a(C2716h0.email_resent_message);
        aVar.mo20484i(Integer.valueOf(C2721j0.email_resend_title));
        aVar.mo20467a(Integer.valueOf(C2721j0.email_resend_subtitle));
        aVar.mo20480g(Integer.valueOf(C2721j0.btn_ok));
        aVar.mo20474d(Integer.valueOf(C2721j0.a11y_emailcode_ok));
        if (!this.f7720h) {
            aVar.mo20472c(Integer.valueOf(C2721j0.btn_help_center));
            aVar.mo20470b(Integer.valueOf(C2721j0.a11y_emailcode_helpcenter));
        }
        hVar.mo20491b(aVar.mo20465a());
    }

    public void onCleared() {
        this.f7713a.mo30247a();
        super.onCleared();
    }

    /* renamed from: b */
    public final void mo11903b(String str) {
        m10650a((Function0<? extends Observable<C2929a>>) new C2904c<Object>(this, str));
    }

    /* renamed from: c */
    public final void mo11904c(String str) {
        m10650a((Function0<? extends Observable<C2929a>>) new C2916j<Object>(this, str));
    }

    /* renamed from: d */
    public final void mo11905d(boolean z) {
        Object a = this.f7715c.mo11943a(this.f7714b).mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C2917k(this, z), new C2918l(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m10648a(C2901o0 o0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0Var.mo11905d(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10649a(C2941a aVar, boolean z) {
        if (aVar instanceof C2942a) {
            updateState(C2914h.f7739c);
        } else if (aVar instanceof C2943b) {
            updateState(C2915i.f7740c);
            if (z) {
                m10655z();
            }
        } else if (aVar instanceof C2944c) {
            this.f7718f.mo20539a(((C2944c) aVar).mo11944a());
        }
    }

    /* renamed from: a */
    private final void m10650a(Function0<? extends Observable<C2929a>> function0) {
        C2906e eVar = new C2906e(this);
        Object a = ((Observable) function0.invoke()).mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C2920p0(new C2912f(eVar)), new C2913g(this));
    }
}
