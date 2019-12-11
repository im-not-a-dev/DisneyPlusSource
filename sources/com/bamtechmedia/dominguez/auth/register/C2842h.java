package com.bamtechmedia.dominguez.auth.register;

import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2815a;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2816b;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2817c;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction.C2814a.C2818d;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel$State;", "registerAccountAction", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction;", "authListener", "Lcom/bamtechmedia/dominguez/auth/api/AuthListener;", "email", "", "passwordValidator", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "autoLogin", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "registerAccountAnalytics", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;", "(Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction;Lcom/bamtechmedia/dominguez/auth/api/AuthListener;Ljava/lang/String;Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;)V", "currentPassword", "getCurrentPassword", "()Ljava/lang/String;", "setCurrentPassword", "(Ljava/lang/String;)V", "registerAccount", "", "password", "updatePasswordStrength", "State", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.register.h */
/* compiled from: RegisterViewModel.kt */
public final class C2842h extends C5741g<C2843a> {

    /* renamed from: a */
    private String f7610a = "";

    /* renamed from: b */
    private final RegisterAccountAction f7611b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2740b f7612c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f7613d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2750c f7614e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7626a f7615f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2760a f7616g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2827b f7617h;

    /* renamed from: com.bamtechmedia.dominguez.auth.register.h$a */
    /* compiled from: RegisterViewModel.kt */
    public static final class C2843a {

        /* renamed from: a */
        private final boolean f7618a;

        /* renamed from: b */
        private final boolean f7619b;

        /* renamed from: c */
        private final String f7620c;

        /* renamed from: d */
        private final C2749b f7621d;

        public C2843a() {
            this(false, false, null, null, 15, null);
        }

        public C2843a(boolean z, boolean z2, String str, C2749b bVar) {
            this.f7618a = z;
            this.f7619b = z2;
            this.f7620c = str;
            this.f7621d = bVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C2843a m10541a(C2843a aVar, boolean z, boolean z2, String str, C2749b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f7618a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f7619b;
            }
            if ((i & 4) != 0) {
                str = aVar.f7620c;
            }
            if ((i & 8) != 0) {
                bVar = aVar.f7621d;
            }
            return aVar.mo11853a(z, z2, str, bVar);
        }

        /* renamed from: a */
        public final C2843a mo11853a(boolean z, boolean z2, String str, C2749b bVar) {
            return new C2843a(z, z2, str, bVar);
        }

        /* renamed from: a */
        public final String mo11854a() {
            return this.f7620c;
        }

        /* renamed from: b */
        public final boolean mo11855b() {
            return this.f7619b;
        }

        /* renamed from: c */
        public final C2749b mo11856c() {
            return this.f7621d;
        }

        /* renamed from: d */
        public final boolean mo11857d() {
            return this.f7618a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2843a) {
                    C2843a aVar = (C2843a) obj;
                    if (this.f7618a == aVar.f7618a) {
                        if (!(this.f7619b == aVar.f7619b) || !Intrinsics.areEqual((Object) this.f7620c, (Object) aVar.f7620c) || !Intrinsics.areEqual((Object) this.f7621d, (Object) aVar.f7621d)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f7618a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f7619b;
            if (!z2) {
                i = z2;
            }
            int i3 = (i2 + i) * 31;
            String str = this.f7620c;
            int i4 = 0;
            int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            C2749b bVar = this.f7621d;
            if (bVar != null) {
                i4 = bVar.hashCode();
            }
            return hashCode + i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(isLoading=");
            sb.append(this.f7618a);
            sb.append(", hasError=");
            sb.append(this.f7619b);
            sb.append(", errorMessage=");
            sb.append(this.f7620c);
            sb.append(", passwordStrength=");
            sb.append(this.f7621d);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C2843a(boolean z, boolean z2, String str, C2749b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                bVar = null;
            }
            this(z, z2, str, bVar);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"mapActionStateToViewState", "", "actionState", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.register.h$b */
    /* compiled from: RegisterViewModel.kt */
    static final class C2844b extends C12881k implements Function1<C2814a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ String f7622U;

        /* renamed from: c */
        final /* synthetic */ C2842h f7623c;

        /* renamed from: com.bamtechmedia.dominguez.auth.register.h$b$a */
        /* compiled from: RegisterViewModel.kt */
        static final class C2845a extends C12881k implements Function1<C2843a, C2843a> {

            /* renamed from: c */
            public static final C2845a f7624c = new C2845a();

            C2845a() {
                super(1);
            }

            /* renamed from: a */
            public final C2843a invoke(C2843a aVar) {
                return C2843a.m10541a(aVar, true, false, null, null, 14, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.register.h$b$b */
        /* compiled from: RegisterViewModel.kt */
        static final class C2846b extends C12881k implements Function1<C2843a, C2843a> {

            /* renamed from: c */
            final /* synthetic */ C2814a f7625c;

            C2846b(C2814a aVar) {
                this.f7625c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C2843a invoke(C2843a aVar) {
                return C2843a.m10541a(aVar, false, true, ((C2817c) this.f7625c).mo11826a(), null, 8, null);
            }
        }

        C2844b(C2842h hVar, String str) {
            this.f7623c = hVar;
            this.f7622U = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo11861a(C2814a aVar) {
            if (aVar instanceof C2818d) {
                this.f7623c.updateState(C2845a.f7624c);
            } else if (aVar instanceof C2815a) {
                C2760a b = this.f7623c.f7616g;
                if (b != null) {
                    b.store(this.f7623c.f7613d, this.f7622U);
                }
                this.f7623c.f7612c.mo11752a(true);
                this.f7623c.f7617h.mo11840d();
            } else if (aVar instanceof C2817c) {
                this.f7623c.updateState(new C2846b(aVar));
            } else if (aVar instanceof C2816b) {
                this.f7623c.f7615f.mo20539a(((C2816b) aVar).mo11822a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11861a((C2814a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.h$c */
    /* compiled from: RegisterViewModel.kt */
    static final /* synthetic */ class C2847c extends C12879i implements Function1<C2814a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2844b f7626c;

        C2847c(C2844b bVar) {
            this.f7626c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11864a(C2814a aVar) {
            this.f7626c.mo11861a(aVar);
        }

        public final String getName() {
            return "mapActionStateToViewState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11864a((C2814a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.h$d */
    /* compiled from: RegisterViewModel.kt */
    static final class C2848d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C2842h f7627c;

        C2848d(C2842h hVar) {
            this.f7627c = hVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Error registering new account.", new Object[0]);
            C7627a.m22614a(this.f7627c.f7615f, null, 1, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.h$e */
    /* compiled from: RegisterViewModel.kt */
    static final class C2849e extends C12881k implements Function1<C2843a, C2843a> {

        /* renamed from: U */
        final /* synthetic */ String f7628U;

        /* renamed from: c */
        final /* synthetic */ C2842h f7629c;

        C2849e(C2842h hVar, String str) {
            this.f7629c = hVar;
            this.f7628U = str;
            super(1);
        }

        /* renamed from: a */
        public final C2843a invoke(C2843a aVar) {
            return C2843a.m10541a(aVar, false, false, null, this.f7629c.f7614e.mo11763b(this.f7628U), 5, null);
        }
    }

    public C2842h(RegisterAccountAction registerAccountAction, C2740b bVar, String str, C2750c cVar, C7626a aVar, C2760a aVar2, C2827b bVar2) {
        super(null, 1, null);
        this.f7611b = registerAccountAction;
        this.f7612c = bVar;
        this.f7613d = str;
        this.f7614e = cVar;
        this.f7615f = aVar;
        this.f7616g = aVar2;
        this.f7617h = bVar2;
        C2843a aVar3 = new C2843a(false, false, null, null, 15, null);
        createState(aVar3);
    }

    /* renamed from: y */
    public final String mo11852y() {
        return this.f7610a;
    }

    /* renamed from: b */
    public final void mo11850b(String str) {
        C2844b bVar = new C2844b(this, str);
        Object a = this.f7611b.mo11815a(this.f7613d, str).mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C2850i(new C2847c(bVar)), new C2848d(this));
    }

    /* renamed from: c */
    public final void mo11851c(String str) {
        this.f7610a = str;
        updateState(new C2849e(this, str));
    }
}
