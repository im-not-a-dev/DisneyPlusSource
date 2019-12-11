package p163g.p201e.p203b.p204d.p207x0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p204d.C5407l0;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5505a;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5506b;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5507c;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5508d;
import p163g.p201e.p203b.p204d.p207x0.C5503a.C5504a.C5509e;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11974s;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#H\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020\u001dJ\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel$State;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "changePasswordAction", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction;", "successRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "autoLogin", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "optionalEmail", "", "(Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction;Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;Ljava/lang/String;)V", "currentPasswordInput", "getCurrentPasswordInput", "()Ljava/lang/String;", "setCurrentPasswordInput", "(Ljava/lang/String;)V", "newPasswordInput", "getNewPasswordInput", "setNewPasswordInput", "calculatePasswordStrength", "", "password", "changePassword", "currentPassword", "newPassword", "emailOnce", "Lio/reactivex/Single;", "mapChangePasswordActionState", "actionState", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState;", "onForgotPasswordClicked", "updateAutoLogin", "State", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.x0.e */
/* compiled from: ChangePasswordViewModel.kt */
public final class C5536e extends C5741g<C5537a> {

    /* renamed from: a */
    private String f13081a;

    /* renamed from: b */
    private String f13082b;

    /* renamed from: c */
    private final AccountApi f13083c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2750c f13084d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5503a f13085e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2752a f13086f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7626a f13087g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2755d f13088h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2760a f13089i;

    /* renamed from: j */
    private final String f13090j;

    /* renamed from: g.e.b.d.x0.e$a */
    /* compiled from: ChangePasswordViewModel.kt */
    public static final class C5537a {

        /* renamed from: a */
        private final boolean f13091a;

        /* renamed from: b */
        private final C2749b f13092b;

        /* renamed from: c */
        private final String f13093c;

        /* renamed from: d */
        private final String f13094d;

        public C5537a() {
            this(false, null, null, null, 15, null);
        }

        public C5537a(boolean z, C2749b bVar, String str, String str2) {
            this.f13091a = z;
            this.f13092b = bVar;
            this.f13093c = str;
            this.f13094d = str2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5537a m18343a(C5537a aVar, boolean z, C2749b bVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f13091a;
            }
            if ((i & 2) != 0) {
                bVar = aVar.f13092b;
            }
            if ((i & 4) != 0) {
                str = aVar.f13093c;
            }
            if ((i & 8) != 0) {
                str2 = aVar.f13094d;
            }
            return aVar.mo17300a(z, bVar, str, str2);
        }

        /* renamed from: a */
        public final C5537a mo17300a(boolean z, C2749b bVar, String str, String str2) {
            return new C5537a(z, bVar, str, str2);
        }

        /* renamed from: a */
        public final String mo17301a() {
            return this.f13093c;
        }

        /* renamed from: b */
        public final boolean mo17302b() {
            return this.f13091a;
        }

        /* renamed from: c */
        public final String mo17303c() {
            return this.f13094d;
        }

        /* renamed from: d */
        public final C2749b mo17304d() {
            return this.f13092b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5537a) {
                    C5537a aVar = (C5537a) obj;
                    if (!(this.f13091a == aVar.f13091a) || !C12880j.m40224a((Object) this.f13092b, (Object) aVar.f13092b) || !C12880j.m40224a((Object) this.f13093c, (Object) aVar.f13093c) || !C12880j.m40224a((Object) this.f13094d, (Object) aVar.f13094d)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f13091a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            C2749b bVar = this.f13092b;
            int i2 = 0;
            int hashCode = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
            String str = this.f13093c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13094d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(loading=");
            sb.append(this.f13091a);
            sb.append(", passwordStrength=");
            sb.append(this.f13092b);
            sb.append(", currPasswordError=");
            sb.append(this.f13093c);
            sb.append(", newPasswordError=");
            sb.append(this.f13094d);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C5537a(boolean z, C2749b bVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                bVar = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            this(z, bVar, str, str2);
        }
    }

    /* renamed from: g.e.b.d.x0.e$b */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5538b extends C12881k implements Function1<C5537a, C5537a> {

        /* renamed from: U */
        final /* synthetic */ String f13095U;

        /* renamed from: c */
        final /* synthetic */ C5536e f13096c;

        C5538b(C5536e eVar, String str) {
            this.f13096c = eVar;
            this.f13095U = str;
            super(1);
        }

        /* renamed from: a */
        public final C5537a invoke(C5537a aVar) {
            C5537a aVar2 = new C5537a(false, this.f13096c.f13084d.mo11763b(this.f13095U), null, null, 13, null);
            return aVar2;
        }
    }

    /* renamed from: g.e.b.d.x0.e$c */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5539c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f13097U;

        /* renamed from: V */
        final /* synthetic */ String f13098V;

        /* renamed from: c */
        final /* synthetic */ C5536e f13099c;

        C5539c(C5536e eVar, String str, String str2) {
            this.f13099c = eVar;
            this.f13097U = str;
            this.f13098V = str2;
        }

        /* renamed from: a */
        public final Observable<C5504a> apply(String str) {
            return this.f13099c.f13085e.mo17252a(str, this.f13097U, this.f13098V);
        }
    }

    /* renamed from: g.e.b.d.x0.e$d */
    /* compiled from: ChangePasswordViewModel.kt */
    static final /* synthetic */ class C5540d extends C12879i implements Function1<C5504a, C13145v> {
        C5540d(C5536e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo17310a(C5504a aVar) {
            ((C5536e) this.receiver).m18328a(aVar);
        }

        public final String getName() {
            return "mapChangePasswordActionState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5536e.class);
        }

        public final String getSignature() {
            return "mapChangePasswordActionState(Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17310a((C5504a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.x0.e$e */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5541e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C5541e f13100c = new C5541e();

        C5541e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Unhandled Exception  while trying to change account password.", new Object[0]);
        }
    }

    /* renamed from: g.e.b.d.x0.e$f */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5542f<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5542f f13101c = new C5542f();

        C5542f() {
        }

        /* renamed from: a */
        public final String apply(DefaultAccount defaultAccount) {
            return C5407l0.m18171a(defaultAccount);
        }
    }

    /* renamed from: g.e.b.d.x0.e$g */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5543g extends C12881k implements Function1<C5537a, C5537a> {

        /* renamed from: c */
        public static final C5543g f13102c = new C5543g();

        C5543g() {
            super(1);
        }

        /* renamed from: a */
        public final C5537a invoke(C5537a aVar) {
            C5537a aVar2 = new C5537a(true, null, null, null, 14, null);
            return aVar2;
        }
    }

    /* renamed from: g.e.b.d.x0.e$h */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5544h extends C12881k implements Function1<C5537a, C5537a> {

        /* renamed from: c */
        final /* synthetic */ C5504a f13103c;

        C5544h(C5504a aVar) {
            this.f13103c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C5537a invoke(C5537a aVar) {
            return C5537a.m18343a(aVar, false, null, null, ((C5508d) this.f13103c).mo17261a(), 2, null);
        }
    }

    /* renamed from: g.e.b.d.x0.e$i */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5545i extends C12881k implements Function1<C5537a, C5537a> {

        /* renamed from: c */
        final /* synthetic */ C5504a f13104c;

        C5545i(C5504a aVar) {
            this.f13104c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C5537a invoke(C5537a aVar) {
            return C5537a.m18343a(aVar, false, null, ((C5509e) this.f13104c).mo17265a(), null, 2, null);
        }
    }

    /* renamed from: g.e.b.d.x0.e$j */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5546j<T> implements Consumer<String> {

        /* renamed from: c */
        final /* synthetic */ C5536e f13105c;

        C5546j(C5536e eVar) {
            this.f13105c = eVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C2755d d = this.f13105c.f13088h;
            C12880j.m40222a((Object) str, "it");
            d.mo11770a(str, true);
        }
    }

    /* renamed from: g.e.b.d.x0.e$k */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5547k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5536e f13106c;

        C5547k(C5536e eVar) {
            this.f13106c = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C7626a c = this.f13106c.f13087g;
            C12880j.m40222a((Object) th, "it");
            c.mo20540a(th);
        }
    }

    /* renamed from: g.e.b.d.x0.e$l */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5548l implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5536e f13107a;

        C5548l(C5536e eVar) {
            this.f13107a = eVar;
        }

        public final void run() {
            this.f13107a.f13086f.mo11750b();
        }
    }

    /* renamed from: g.e.b.d.x0.e$m */
    /* compiled from: ChangePasswordViewModel.kt */
    static final class C5549m<T> implements Consumer<String> {

        /* renamed from: U */
        final /* synthetic */ String f13108U;

        /* renamed from: c */
        final /* synthetic */ C5536e f13109c;

        C5549m(C5536e eVar, String str) {
            this.f13109c = eVar;
            this.f13108U = str;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C2760a a = this.f13109c.f13089i;
            if (a != null) {
                C12880j.m40222a((Object) str, "it");
                a.store(str, this.f13108U);
            }
        }
    }

    /* renamed from: g.e.b.d.x0.e$n */
    /* compiled from: ChangePasswordViewModel.kt */
    static final /* synthetic */ class C5550n extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5550n f13110c = new C5550n();

        C5550n() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17319a(Throwable th) {
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
            mo17319a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C5536e(AccountApi accountApi, C2750c cVar, C5503a aVar, C2752a aVar2, C7626a aVar3, C2755d dVar, C2760a aVar4, String str) {
        super(null, 1, null);
        this.f13083c = accountApi;
        this.f13084d = cVar;
        this.f13085e = aVar;
        this.f13086f = aVar2;
        this.f13087g = aVar3;
        this.f13088h = dVar;
        this.f13089i = aVar4;
        this.f13090j = str;
        C5537a aVar5 = new C5537a(false, null, null, null, 15, null);
        createState(aVar5);
        String str2 = "";
        this.f13081a = str2;
        this.f13082b = str2;
    }

    /* renamed from: B */
    private final Single<String> m18326B() {
        String str = this.f13090j;
        if (str != null) {
            Single<String> b = Single.m38399b(str);
            if (b != null) {
                return b;
            }
        }
        Single<String> g = this.f13083c.getAccount().mo30131f(C5542f.f13101c).mo30134g();
        C12880j.m40222a((Object) g, "accountApi.getAccount().…{ it.email() }.toSingle()");
        return g;
    }

    /* renamed from: A */
    public final void mo17293A() {
        Object a = m18326B().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C5546j(this), new C5547k(this));
    }

    /* renamed from: y */
    public final String mo17298y() {
        return this.f13081a;
    }

    /* renamed from: z */
    public final String mo17299z() {
        return this.f13082b;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, g.e.b.d.x0.e$n] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [g.e.b.d.x0.f] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18334e(java.lang.String r4) {
        /*
            r3 = this;
            io.reactivex.Single r0 = r3.m18326B()
            g.e.b.d.x0.e$l r1 = new g.e.b.d.x0.e$l
            r1.<init>(r3)
            io.reactivex.Single r0 = r0.mo30209a(r1)
            java.lang.String r1 = "emailOnce()\n            …ChangePasswordSuccess() }"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.c0 r1 = r3.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30215a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.d0 r0 = (p163g.p503n.p504a.C11792d0) r0
            g.e.b.d.x0.e$m r1 = new g.e.b.d.x0.e$m
            r1.<init>(r3, r4)
            g.e.b.d.x0.e$n r4 = p163g.p201e.p203b.p204d.p207x0.C5536e.C5550n.f13110c
            if (r4 == 0) goto L_0x0034
            g.e.b.d.x0.f r2 = new g.e.b.d.x0.f
            r2.<init>(r4)
            r4 = r2
        L_0x0034:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r0.mo29920a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.p207x0.C5536e.m18334e(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo17295b(String str) {
        updateState(new C5538b(this, str));
    }

    /* renamed from: c */
    public final void mo17296c(String str) {
        this.f13081a = str;
    }

    /* renamed from: d */
    public final void mo17297d(String str) {
        this.f13082b = str;
    }

    /* renamed from: a */
    public final void mo17294a(String str, String str2) {
        Observable d = m18326B().mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C5539c<Object,Object>(this, str, str2));
        C12880j.m40222a((Object) d, "emailOnce()\n            …tPassword, newPassword) }");
        Object a = d.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C5551f(new C5540d(this)), C5541e.f13100c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18328a(C5504a aVar) {
        if (aVar instanceof C5506b) {
            updateState(C5543g.f13102c);
        } else if (aVar instanceof C5507c) {
            m18334e(((C5507c) aVar).mo17257a());
        } else if (aVar instanceof C5508d) {
            updateState(new C5544h(aVar));
        } else if (aVar instanceof C5509e) {
            updateState(new C5545i(aVar));
        } else if (aVar instanceof C5505a) {
            this.f13087g.mo20539a(((C5505a) aVar).mo17253a());
        }
    }
}
