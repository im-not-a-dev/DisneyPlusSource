package p163g.p201e.p203b.p204d.p205v0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p204d.C5407l0;
import p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a;
import p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5441a;
import p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5442b;
import p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5443c;
import p163g.p201e.p203b.p204d.p205v0.C5439a.C5440a.C5444d;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fJ\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010#\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel$State;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "changeEmailAction", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction;", "successRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "optionalEmail", "", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainScheduler", "(Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction;Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Ljava/lang/String;Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "emailOnce", "Lio/reactivex/Single;", "newEmailInput", "getNewEmailInput", "()Ljava/lang/String;", "setNewEmailInput", "(Ljava/lang/String;)V", "passwordInput", "getPasswordInput", "setPasswordInput", "changeEmail", "", "newEmail", "password", "handleSuccess", "handleSuccessDelayed", "onForgotPasswordClicked", "Companion", "State", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.v0.e */
/* compiled from: ChangeEmailViewModel.kt */
public final class C5468e extends C5741g<C5474e> {

    /* renamed from: a */
    private final Single<String> f12984a;

    /* renamed from: b */
    private String f12985b;

    /* renamed from: c */
    private String f12986c;

    /* renamed from: d */
    private final AccountApi f12987d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5439a f12988e;

    /* renamed from: f */
    private final C2752a f12989f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7626a f12990g;

    /* renamed from: h */
    private final String f12991h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2755d f12992i;

    /* renamed from: j */
    private final C11969r f12993j;

    /* renamed from: k */
    private final C11969r f12994k;

    /* renamed from: g.e.b.d.v0.e$a */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5469a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5469a f12995c = new C5469a();

        C5469a() {
        }

        /* renamed from: a */
        public final String apply(DefaultAccount defaultAccount) {
            return C5407l0.m18171a(defaultAccount);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "email", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.e$b */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5470b<T> implements Consumer<String> {

        /* renamed from: c */
        final /* synthetic */ C5468e f12996c;

        /* renamed from: g.e.b.d.v0.e$b$a */
        /* compiled from: ChangeEmailViewModel.kt */
        static final class C5471a extends C12881k implements Function1<C5474e, C5474e> {

            /* renamed from: c */
            final /* synthetic */ String f12997c;

            C5471a(String str) {
                this.f12997c = str;
                super(1);
            }

            /* renamed from: a */
            public final C5474e invoke(C5474e eVar) {
                return C5474e.m18255a(eVar, this.f12997c, null, null, false, false, 30, null);
            }
        }

        C5470b(C5468e eVar) {
            this.f12996c = eVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            this.f12996c.updateState(new C5471a(str));
        }
    }

    /* renamed from: g.e.b.d.v0.e$c */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5472c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5468e f12998c;

        C5472c(C5468e eVar) {
            this.f12998c = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error fetching account's email in ChangeEmailViewModel.", new Object[0]);
            C7627a.m22614a(this.f12998c.f12990g, null, 1, null);
        }
    }

    /* renamed from: g.e.b.d.v0.e$d */
    /* compiled from: ChangeEmailViewModel.kt */
    public static final class C5473d {
        private C5473d() {
        }

        public /* synthetic */ C5473d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d.v0.e$e */
    /* compiled from: ChangeEmailViewModel.kt */
    public static final class C5474e {

        /* renamed from: a */
        private final String f12999a;

        /* renamed from: b */
        private String f13000b;

        /* renamed from: c */
        private String f13001c;

        /* renamed from: d */
        private boolean f13002d;

        /* renamed from: e */
        private boolean f13003e;

        public C5474e() {
            this(null, null, null, false, false, 31, null);
        }

        public C5474e(String str, String str2, String str3, boolean z, boolean z2) {
            this.f12999a = str;
            this.f13000b = str2;
            this.f13001c = str3;
            this.f13002d = z;
            this.f13003e = z2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5474e m18255a(C5474e eVar, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f12999a;
            }
            if ((i & 2) != 0) {
                str2 = eVar.f13000b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = eVar.f13001c;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                z = eVar.f13002d;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = eVar.f13003e;
            }
            return eVar.mo17215a(str, str4, str5, z3, z2);
        }

        /* renamed from: a */
        public final C5474e mo17215a(String str, String str2, String str3, boolean z, boolean z2) {
            C5474e eVar = new C5474e(str, str2, str3, z, z2);
            return eVar;
        }

        /* renamed from: a */
        public final boolean mo17216a() {
            return this.f13002d;
        }

        /* renamed from: b */
        public final String mo17217b() {
            return this.f12999a;
        }

        /* renamed from: c */
        public final String mo17218c() {
            return this.f13000b;
        }

        /* renamed from: d */
        public final String mo17219d() {
            return this.f13001c;
        }

        /* renamed from: e */
        public final boolean mo17220e() {
            return this.f13003e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5474e) {
                    C5474e eVar = (C5474e) obj;
                    if (C12880j.m40224a((Object) this.f12999a, (Object) eVar.f12999a) && C12880j.m40224a((Object) this.f13000b, (Object) eVar.f13000b) && C12880j.m40224a((Object) this.f13001c, (Object) eVar.f13001c)) {
                        if (this.f13002d == eVar.f13002d) {
                            if (this.f13003e == eVar.f13003e) {
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
            String str = this.f12999a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f13000b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13001c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f13002d;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f13003e;
            if (z2) {
                z2 = true;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(email=");
            sb.append(this.f12999a);
            sb.append(", emailErrorMessage=");
            sb.append(this.f13000b);
            sb.append(", passwordError=");
            sb.append(this.f13001c);
            sb.append(", changeSuccesful=");
            sb.append(this.f13002d);
            sb.append(", isLoading=");
            sb.append(this.f13003e);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C5474e(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str4 = null;
            String str5 = (i & 1) != 0 ? null : str;
            String str6 = (i & 2) != 0 ? null : str2;
            if ((i & 4) == 0) {
                str4 = str3;
            }
            this(str5, str6, str4, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"mapChangeEmailActionStateToViewState", "", "actionState", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.e$f */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5475f extends C12881k implements Function1<C5440a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13004c;

        /* renamed from: g.e.b.d.v0.e$f$a */
        /* compiled from: ChangeEmailViewModel.kt */
        static final class C5476a extends C12881k implements Function1<C5474e, C5474e> {

            /* renamed from: c */
            final /* synthetic */ C5440a f13005c;

            C5476a(C5440a aVar) {
                this.f13005c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C5474e invoke(C5474e eVar) {
                return C5474e.m18255a(eVar, null, ((C5443c) this.f13005c).mo17174a(), null, false, false, 13, null);
            }
        }

        /* renamed from: g.e.b.d.v0.e$f$b */
        /* compiled from: ChangeEmailViewModel.kt */
        static final class C5477b extends C12881k implements Function1<C5474e, C5474e> {

            /* renamed from: c */
            final /* synthetic */ C5440a f13006c;

            C5477b(C5440a aVar) {
                this.f13006c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C5474e invoke(C5474e eVar) {
                return C5474e.m18255a(eVar, null, null, ((C5444d) this.f13006c).mo17178a(), false, false, 9, null);
            }
        }

        C5475f(C5468e eVar) {
            this.f13004c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17224a(C5440a aVar) {
            if (aVar instanceof C5441a) {
                this.f13004c.m18239C();
            } else if (aVar instanceof C5443c) {
                this.f13004c.updateState(new C5476a(aVar));
            } else if (aVar instanceof C5444d) {
                this.f13004c.updateState(new C5477b(aVar));
            } else if (aVar instanceof C5442b) {
                this.f13004c.f12990g.mo20539a(((C5442b) aVar).mo17170a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17224a((C5440a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.v0.e$g */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5478g<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f13007U;

        /* renamed from: V */
        final /* synthetic */ String f13008V;

        /* renamed from: c */
        final /* synthetic */ C5468e f13009c;

        C5478g(C5468e eVar, String str, String str2) {
            this.f13009c = eVar;
            this.f13007U = str;
            this.f13008V = str2;
        }

        /* renamed from: a */
        public final Single<C5440a> apply(String str) {
            return this.f13009c.f12988e.mo17169a(str, this.f13007U, this.f13008V);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.e$h */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5479h<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13010c;

        /* renamed from: g.e.b.d.v0.e$h$a */
        /* compiled from: ChangeEmailViewModel.kt */
        static final class C5480a extends C12881k implements Function1<C5474e, C5474e> {

            /* renamed from: c */
            public static final C5480a f13011c = new C5480a();

            C5480a() {
                super(1);
            }

            /* renamed from: a */
            public final C5474e invoke(C5474e eVar) {
                C5474e eVar2 = new C5474e(null, null, null, false, true, 15, null);
                return eVar2;
            }
        }

        C5479h(C5468e eVar) {
            this.f13010c = eVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f13010c.updateState(C5480a.f13011c);
        }
    }

    /* renamed from: g.e.b.d.v0.e$i */
    /* compiled from: ChangeEmailViewModel.kt */
    static final /* synthetic */ class C5481i extends C12879i implements Function1<C5440a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5475f f13012c;

        C5481i(C5475f fVar) {
            this.f13012c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17230a(C5440a aVar) {
            this.f13012c.mo17224a(aVar);
        }

        public final String getName() {
            return "mapChangeEmailActionStateToViewState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17230a((C5440a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.v0.e$j */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5482j<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13013c;

        C5482j(C5468e eVar) {
            this.f13013c = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error attempting to change account email in ChangeEmailViewModel.", new Object[0]);
            C7627a.m22614a(this.f13013c.f12990g, null, 1, null);
        }
    }

    /* renamed from: g.e.b.d.v0.e$k */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5483k extends C12881k implements Function1<C5474e, C5474e> {

        /* renamed from: c */
        public static final C5483k f13014c = new C5483k();

        C5483k() {
            super(1);
        }

        /* renamed from: a */
        public final C5474e invoke(C5474e eVar) {
            return C5474e.m18255a(eVar, null, null, null, true, false, 7, null);
        }
    }

    /* renamed from: g.e.b.d.v0.e$l */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5484l<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13015c;

        C5484l(C5468e eVar) {
            this.f13015c = eVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f13015c.m18238B();
        }
    }

    /* renamed from: g.e.b.d.v0.e$m */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5485m<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13016c;

        C5485m(C5468e eVar) {
            this.f13016c = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f13016c.m18238B();
        }
    }

    /* renamed from: g.e.b.d.v0.e$n */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5486n<T> implements Consumer<String> {

        /* renamed from: c */
        final /* synthetic */ C5468e f13017c;

        C5486n(C5468e eVar) {
            this.f13017c = eVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C2755d c = this.f13017c.f12992i;
            C12880j.m40222a((Object) str, "email");
            c.mo11770a(str, false);
        }
    }

    /* renamed from: g.e.b.d.v0.e$o */
    /* compiled from: ChangeEmailViewModel.kt */
    static final class C5487o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C5487o f13018c = new C5487o();

        C5487o() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error attempting to forgot password in ChangeEmailViewModel.", new Object[0]);
        }
    }

    static {
        new C5473d(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r3 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5468e(com.bamtech.sdk4.account.AccountApi r3, p163g.p201e.p203b.p204d.p205v0.C5439a r4, com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a r5, p163g.p201e.p203b.p307o.p308p.C7626a r6, java.lang.String r7, com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d r8, p520io.reactivex.C11969r r9, p520io.reactivex.C11969r r10) {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            r2.f12987d = r3
            r2.f12988e = r4
            r2.f12989f = r5
            r2.f12990g = r6
            r2.f12991h = r7
            r2.f12992i = r8
            r2.f12993j = r9
            r2.f12994k = r10
            g.e.b.d.v0.e$e r0 = new g.e.b.d.v0.e$e
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 31
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.createState(r0)
            java.lang.String r3 = r2.f12991h
            if (r3 == 0) goto L_0x0031
            io.reactivex.Single r3 = p520io.reactivex.Single.m38399b(r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x004a
        L_0x0031:
            com.bamtech.sdk4.account.AccountApi r3 = r2.f12987d
            io.reactivex.Maybe r3 = r3.getAccount()
            g.e.b.d.v0.e$a r4 = p163g.p201e.p203b.p204d.p205v0.C5468e.C5469a.f12995c
            io.reactivex.Maybe r3 = r3.mo30131f(r4)
            io.reactivex.Single r3 = r3.mo30134g()
            io.reactivex.Single r3 = r3.mo30226d()
            java.lang.String r4 = "accountApi.getAccount().…il() }.toSingle().cache()"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
        L_0x004a:
            r2.f12984a = r3
            io.reactivex.Single<java.lang.String> r3 = r2.f12984a
            g.n.a.c0 r4 = r2.getViewModelScope()
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30215a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            g.n.a.d0 r3 = (p163g.p503n.p504a.C11792d0) r3
            g.e.b.d.v0.e$b r4 = new g.e.b.d.v0.e$b
            r4.<init>(r2)
            g.e.b.d.v0.e$c r5 = new g.e.b.d.v0.e$c
            r5.<init>(r2)
            r3.mo29920a(r4, r5)
            java.lang.String r3 = ""
            r2.f12985b = r3
            r2.f12986c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p205v0.C5468e.<init>(com.bamtech.sdk4.account.AccountApi, g.e.b.d.v0.a, com.bamtechmedia.dominguez.auth.o0.i.a, g.e.b.o.p.a, java.lang.String, com.bamtechmedia.dominguez.auth.o0.i.d, io.reactivex.r, io.reactivex.r):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m18238B() {
        updateState(C5483k.f13014c);
        this.f12989f.mo11751c();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m18239C() {
        Observable a = Observable.m38311c(5, TimeUnit.SECONDS, this.f12993j).mo30151a(this.f12994k);
        C12880j.m40222a((Object) a, "Observable.timer(SUCCESS….observeOn(mainScheduler)");
        Object a2 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C5484l(this), new C5485m(this));
    }

    /* renamed from: A */
    public final void mo17205A() {
        Object a = this.f12984a.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C5486n(this), C5487o.f13018c);
    }

    /* renamed from: y */
    public final String mo17209y() {
        return this.f12985b;
    }

    /* renamed from: z */
    public final String mo17210z() {
        return this.f12986c;
    }

    /* renamed from: a */
    public final void mo17206a(String str, String str2) {
        C5475f fVar = new C5475f(this);
        Single c = this.f12984a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C5478g<Object,Object>(this, str, str2)).mo30222c((Consumer<? super Disposable>) new C5479h<Object>(this));
        C12880j.m40222a((Object) c, "emailOnce\n            .f…ate(isLoading = true) } }");
        Object a = c.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C5488f(new C5481i(fVar)), new C5482j(this));
    }

    /* renamed from: b */
    public final void mo17207b(String str) {
        this.f12985b = str;
    }

    /* renamed from: c */
    public final void mo17208c(String str) {
        this.f12986c = str;
    }
}
