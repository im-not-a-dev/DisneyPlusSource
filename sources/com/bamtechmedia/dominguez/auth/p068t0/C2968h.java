package com.bamtechmedia.dominguez.auth.p068t0;

import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2979a;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2980b;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2981c;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2982d;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j.C2978a.C2983e;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bH\u0002J\u000e\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bJ\b\u0010%\u001a\u00020\"H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel$State;", "passwordLoginAction", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction;", "authSuccessAction", "Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;", "email", "", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "passwordResetRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;", "autoLogin", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "authHostRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/AuthHostRouter;", "analytics", "Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;", "(Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction;Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;Ljava/lang/String;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;Lcom/bamtechmedia/dominguez/auth/api/router/AuthHostRouter;Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;)V", "currentpassword", "getCurrentpassword", "()Ljava/lang/String;", "setCurrentpassword", "(Ljava/lang/String;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "disposables$annotations", "()V", "getDisposables$auth_release", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables$auth_release", "(Lio/reactivex/disposables/CompositeDisposable;)V", "handleAuthSuccess", "", "password", "loginWithPassword", "onCleared", "State", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.t0.h */
/* compiled from: LoginPasswordViewModel.kt */
public final class C2968h extends C5741g<C2969a> {

    /* renamed from: a */
    private String f7799a = "";

    /* renamed from: b */
    private CompositeDisposable f7800b = new CompositeDisposable();

    /* renamed from: c */
    private final C2977j f7801c;

    /* renamed from: d */
    private final C3140w f7802d;

    /* renamed from: e */
    private final String f7803e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7626a f7804f;

    /* renamed from: g */
    private final C2760a f7805g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2754c f7806h;

    /* renamed from: i */
    private final C2951b f7807i;

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$a */
    /* compiled from: LoginPasswordViewModel.kt */
    public static final class C2969a {

        /* renamed from: a */
        private final boolean f7808a;

        /* renamed from: b */
        private final String f7809b;

        /* renamed from: c */
        private final boolean f7810c;

        public C2969a() {
            this(false, null, false, 7, null);
        }

        public C2969a(boolean z, String str, boolean z2) {
            this.f7808a = z;
            this.f7809b = str;
            this.f7810c = z2;
        }

        /* renamed from: a */
        public final boolean mo11970a() {
            return this.f7808a;
        }

        /* renamed from: b */
        public final String mo11971b() {
            return this.f7809b;
        }

        /* renamed from: c */
        public final boolean mo11972c() {
            return this.f7810c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2969a) {
                    C2969a aVar = (C2969a) obj;
                    if ((this.f7808a == aVar.f7808a) && C12880j.m40224a((Object) this.f7809b, (Object) aVar.f7809b)) {
                        if (this.f7810c == aVar.f7810c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f7808a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            String str = this.f7809b;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.f7810c;
            if (!z2) {
                i = z2;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(hasPasswordError=");
            sb.append(this.f7808a);
            sb.append(", passwordError=");
            sb.append(this.f7809b);
            sb.append(", isLoading=");
            sb.append(this.f7810c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C2969a(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            this(z, str, z2);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"mapActionStateToViewState", "", "actionState", "Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$b */
    /* compiled from: LoginPasswordViewModel.kt */
    static final class C2970b extends C12881k implements Function1<C2978a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ String f7811U;

        /* renamed from: c */
        final /* synthetic */ C2968h f7812c;

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$b$a */
        /* compiled from: LoginPasswordViewModel.kt */
        static final class C2971a extends C12881k implements Function1<C2969a, C2969a> {

            /* renamed from: c */
            public static final C2971a f7813c = new C2971a();

            C2971a() {
                super(1);
            }

            /* renamed from: a */
            public final C2969a invoke(C2969a aVar) {
                C2969a aVar2 = new C2969a(false, null, true, 3, null);
                return aVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$b$b */
        /* compiled from: LoginPasswordViewModel.kt */
        static final class C2972b extends C12881k implements Function1<C2969a, C2969a> {

            /* renamed from: c */
            final /* synthetic */ C2978a f7814c;

            C2972b(C2978a aVar) {
                this.f7814c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C2969a invoke(C2969a aVar) {
                C2969a aVar2 = new C2969a(true, ((C2983e) this.f7814c).mo11987a(), false, 4, null);
                return aVar2;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$b$c */
        /* compiled from: LoginPasswordViewModel.kt */
        static final class C2973c extends C12881k implements Function1<C2969a, C2969a> {

            /* renamed from: c */
            public static final C2973c f7815c = new C2973c();

            C2973c() {
                super(1);
            }

            /* renamed from: a */
            public final C2969a invoke(C2969a aVar) {
                C2969a aVar2 = new C2969a(false, null, false, 3, null);
                return aVar2;
            }
        }

        C2970b(C2968h hVar, String str) {
            this.f7812c = hVar;
            this.f7811U = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo11976a(C2978a aVar) {
            if (aVar instanceof C2981c) {
                this.f7812c.updateState(C2971a.f7813c);
            } else if (aVar instanceof C2982d) {
                this.f7812c.m10750d(this.f7811U);
            } else if (aVar instanceof C2983e) {
                this.f7812c.updateState(new C2972b(aVar));
            } else if (aVar instanceof C2979a) {
                this.f7812c.updateState(C2973c.f7815c);
                this.f7812c.f7806h.mo11764a();
            } else if (aVar instanceof C2980b) {
                this.f7812c.f7804f.mo20539a(((C2980b) aVar).mo11983a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11976a((C2978a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$c */
    /* compiled from: LoginPasswordViewModel.kt */
    static final /* synthetic */ class C2974c extends C12879i implements Function1<C2978a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2970b f7816c;

        C2974c(C2970b bVar) {
            this.f7816c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11980a(C2978a aVar) {
            this.f7816c.mo11976a(aVar);
        }

        public final String getName() {
            return "mapActionStateToViewState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/auth/password/PasswordLoginAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11980a((C2978a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.h$d */
    /* compiled from: LoginPasswordViewModel.kt */
    static final class C2975d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C2968h f7817c;

        C2975d(C2968h hVar) {
            this.f7817c = hVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error attempting to login!", new Object[0]);
            C7627a.m22614a(this.f7817c.f7804f, null, 1, null);
        }
    }

    public C2968h(C2977j jVar, C3140w wVar, String str, C7626a aVar, C2756e eVar, C2760a aVar2, C2754c cVar, C2951b bVar) {
        super(null, 1, null);
        this.f7801c = jVar;
        this.f7802d = wVar;
        this.f7803e = str;
        this.f7804f = aVar;
        this.f7805g = aVar2;
        this.f7806h = cVar;
        this.f7807i = bVar;
        C2969a aVar3 = new C2969a(false, null, false, 7, null);
        createState(aVar3);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m10750d(String str) {
        this.f7807i.mo11953d();
        C2760a aVar = this.f7805g;
        if (aVar != null) {
            aVar.store(this.f7803e, str);
        }
        this.f7800b.mo30250b(this.f7802d.onSuccess());
    }

    /* renamed from: c */
    public final void mo11968c(String str) {
        this.f7799a = str;
    }

    public void onCleared() {
        this.f7800b.mo30247a();
        super.onCleared();
    }

    /* renamed from: y */
    public final String mo11969y() {
        return this.f7799a;
    }

    /* renamed from: b */
    public final void mo11967b(String str) {
        C2970b bVar = new C2970b(this, str);
        Object a = this.f7801c.mo11982a(str).mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C2976i(new C2974c(bVar)), new C2975d(this));
    }
}
