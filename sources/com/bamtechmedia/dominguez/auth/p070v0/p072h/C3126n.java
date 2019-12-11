package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2753b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p070v0.C3033b;
import com.bamtechmedia.dominguez.auth.p070v0.C3046f;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3050a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3051b;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3052c;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3053d;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3054e;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a.C3055f;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3097a;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3098b;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3099c;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3100d;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7626a.C7627a;
import p163g.p201e.p203b.p408f0.C10611d;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p163g.p509o.p510a.C11847b;
import p520io.reactivex.C11960n;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010\u0019J\u001e\u0010-\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel$ViewState;", "signupEmailAction", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailAction;", "marketingAndLegalAction", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction;", "router", "Lcom/bamtechmedia/dominguez/auth/api/router/AccountValidationRouter;", "errorRouter", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "authHostViewModel", "Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;", "legalItemFactory", "Lcom/bamtechmedia/dominguez/auth/validation/LegalItemFactory;", "marketingItemFactory", "Lcom/bamtechmedia/dominguez/auth/validation/MarketingViewItemFactory;", "signUpEmailAnalytics", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "webRouter", "Lcom/bamtechmedia/dominguez/web/WebRouter;", "(Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailAction;Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction;Lcom/bamtechmedia/dominguez/auth/api/router/AccountValidationRouter;Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;Lcom/bamtechmedia/dominguez/auth/validation/LegalItemFactory;Lcom/bamtechmedia/dominguez/auth/validation/MarketingViewItemFactory;Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;Lcom/bamtechmedia/dominguez/web/WebRouter;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "fetchMarketingAndLegalItems", "", "handleAcceptedState", "actionState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$Accepted;", "handleAccountRecoveryState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$AccountRecovery;", "handleMarketingLegalCompleted", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState$Completed;", "handleNotFoundState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState$NotFound;", "mapSignupEmailActionState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;", "routeToLogin", "input", "signup", "marketingOptIns", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "ViewState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n */
/* compiled from: SignupEmailViewModel.kt */
public final class C3126n extends C5741g<C3127a> {

    /* renamed from: a */
    private String f8031a = this.f8037g.mo11802y();

    /* renamed from: b */
    private final C3107f f8032b;

    /* renamed from: c */
    private final C3095d f8033c;

    /* renamed from: d */
    private final C2753b f8034d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7626a f8035e;

    /* renamed from: f */
    private final C2755d f8036f;

    /* renamed from: g */
    private final C2784r f8037g;

    /* renamed from: h */
    private final C3033b f8038h;

    /* renamed from: i */
    private final C3046f f8039i;

    /* renamed from: j */
    private final C3105e f8040j;

    /* renamed from: k */
    private final C10611d f8041k;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$a */
    /* compiled from: SignupEmailViewModel.kt */
    public static final class C3127a {

        /* renamed from: a */
        private final boolean f8042a;

        /* renamed from: b */
        private final boolean f8043b;

        /* renamed from: c */
        private final boolean f8044c;

        /* renamed from: d */
        private final String f8045d;

        /* renamed from: e */
        private final Integer f8046e;

        /* renamed from: f */
        private final List<C11847b> f8047f;

        public C3127a() {
            this(false, false, false, null, null, null, 63, null);
        }

        public C3127a(boolean z, boolean z2, boolean z3, String str, Integer num, List<? extends C11847b> list) {
            this.f8042a = z;
            this.f8043b = z2;
            this.f8044c = z3;
            this.f8045d = str;
            this.f8046e = num;
            this.f8047f = list;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<g.o.a.b>, for r10v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.C3127a m10981a(com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.C3127a r4, boolean r5, boolean r6, boolean r7, java.lang.String r8, java.lang.Integer r9, java.util.List<p163g.p509o.p510a.C11847b> r10, int r11, java.lang.Object r12) {
            /*
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0006
                boolean r5 = r4.f8042a
            L_0x0006:
                r12 = r11 & 2
                if (r12 == 0) goto L_0x000c
                boolean r6 = r4.f8043b
            L_0x000c:
                r12 = r6
                r6 = r11 & 4
                if (r6 == 0) goto L_0x0013
                boolean r7 = r4.f8044c
            L_0x0013:
                r0 = r7
                r6 = r11 & 8
                if (r6 == 0) goto L_0x001a
                java.lang.String r8 = r4.f8045d
            L_0x001a:
                r1 = r8
                r6 = r11 & 16
                if (r6 == 0) goto L_0x0021
                java.lang.Integer r9 = r4.f8046e
            L_0x0021:
                r2 = r9
                r6 = r11 & 32
                if (r6 == 0) goto L_0x0028
                java.util.List<g.o.a.b> r10 = r4.f8047f
            L_0x0028:
                r3 = r10
                r6 = r4
                r7 = r5
                r8 = r12
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                com.bamtechmedia.dominguez.auth.v0.h.n$a r4 = r6.mo12159a(r7, r8, r9, r10, r11, r12)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.C3127a.m10981a(com.bamtechmedia.dominguez.auth.v0.h.n$a, boolean, boolean, boolean, java.lang.String, java.lang.Integer, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.auth.v0.h.n$a");
        }

        /* renamed from: a */
        public final C3127a mo12159a(boolean z, boolean z2, boolean z3, String str, Integer num, List<? extends C11847b> list) {
            C3127a aVar = new C3127a(z, z2, z3, str, num, list);
            return aVar;
        }

        /* renamed from: a */
        public final String mo12160a() {
            return this.f8045d;
        }

        /* renamed from: b */
        public final Integer mo12161b() {
            return this.f8046e;
        }

        /* renamed from: c */
        public final boolean mo12162c() {
            return this.f8044c;
        }

        /* renamed from: d */
        public final List<C11847b> mo12163d() {
            return this.f8047f;
        }

        /* renamed from: e */
        public final boolean mo12164e() {
            return this.f8042a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3127a) {
                    C3127a aVar = (C3127a) obj;
                    if (this.f8042a == aVar.f8042a) {
                        if (this.f8043b == aVar.f8043b) {
                            if (!(this.f8044c == aVar.f8044c) || !Intrinsics.areEqual((Object) this.f8045d, (Object) aVar.f8045d) || !Intrinsics.areEqual((Object) this.f8046e, (Object) aVar.f8046e) || !Intrinsics.areEqual((Object) this.f8047f, (Object) aVar.f8047f)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo12166f() {
            return this.f8043b;
        }

        public int hashCode() {
            boolean z = this.f8042a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8043b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f8044c;
            if (!z3) {
                i = z3;
            }
            int i4 = (i3 + i) * 31;
            String str = this.f8045d;
            int i5 = 0;
            int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.f8046e;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            List<C11847b> list = this.f8047f;
            if (list != null) {
                i5 = list.hashCode();
            }
            return hashCode2 + i5;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewState(isInitialLoading=");
            sb.append(this.f8042a);
            sb.append(", isLoading=");
            sb.append(this.f8043b);
            sb.append(", hasError=");
            sb.append(this.f8044c);
            sb.append(", error=");
            sb.append(this.f8045d);
            sb.append(", errorKey=");
            sb.append(this.f8046e);
            sb.append(", marketingAndLegalItems=");
            sb.append(this.f8047f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3127a(boolean z, boolean z2, boolean z3, String str, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z4 = false;
            boolean z5 = (i & 1) != 0 ? false : z;
            boolean z6 = (i & 2) != 0 ? false : z2;
            if ((i & 4) == 0) {
                z4 = z3;
            }
            String str2 = (i & 8) != 0 ? null : str;
            Integer num2 = (i & 16) != 0 ? null : num;
            if ((i & 32) != 0) {
                list = C13185o.m40513a();
            }
            this(z5, z6, z4, str2, num2, list);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"mapMarketingLegalActionState", "", "actionState", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$b */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3128b extends C12881k implements Function1<C3096a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3126n f8048c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$b$a */
        /* compiled from: SignupEmailViewModel.kt */
        static final class C3129a extends C12881k implements Function1<C3127a, C3127a> {

            /* renamed from: c */
            public static final C3129a f8049c = new C3129a();

            C3129a() {
                super(1);
            }

            /* renamed from: a */
            public final C3127a invoke(C3127a aVar) {
                return C3127a.m10981a(aVar, true, false, false, null, null, null, 54, null);
            }
        }

        C3128b(C3126n nVar) {
            this.f8048c = nVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12169a(C3096a aVar) {
            if (aVar instanceof C3100d) {
                this.f8048c.updateState(C3129a.f8049c);
            } else if (aVar instanceof C3097a) {
                this.f8048c.m10974a((C3097a) aVar);
            } else if (aVar instanceof C3099c) {
                this.f8048c.f8035e.mo20539a(((C3099c) aVar).mo12132a());
            } else if (aVar instanceof C3098b) {
                C7627a.m22614a(this.f8048c.f8035e, null, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12169a((C3096a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$c */
    /* compiled from: SignupEmailViewModel.kt */
    static final /* synthetic */ class C3130c extends C12879i implements Function1<C3096a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3128b f8050c;

        C3130c(C3128b bVar) {
            this.f8050c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12171a(C3096a aVar) {
            this.f8050c.mo12169a(aVar);
        }

        public final String getName() {
            return "mapMarketingLegalActionState";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12171a((C3096a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$d */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3131d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C3126n f8051c;

        C3131d(C3126n nVar) {
            this.f8051c = nVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Unhandled Exception: during MarketingAndLegalAction", new Object[0]);
            C7627a.m22614a(this.f8051c.f8035e, null, 1, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$e */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3132e extends C12881k implements Function1<C3127a, C3127a> {

        /* renamed from: c */
        public static final C3132e f8052c = new C3132e();

        C3132e() {
            super(1);
        }

        /* renamed from: a */
        public final C3127a invoke(C3127a aVar) {
            C3127a aVar2 = new C3127a(false, false, false, null, null, null, 61, null);
            return aVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$f */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3133f extends C12881k implements Function1<C3127a, C3127a> {

        /* renamed from: U */
        final /* synthetic */ List f8053U;

        /* renamed from: c */
        final /* synthetic */ List f8054c;

        C3133f(List list, List list2) {
            this.f8054c = list;
            this.f8053U = list2;
            super(1);
        }

        /* renamed from: a */
        public final C3127a invoke(C3127a aVar) {
            return C3127a.m10981a(aVar, false, false, false, null, null, C13199w.m40583d((Collection) this.f8054c, (Iterable) this.f8053U), 22, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$g */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3134g extends C12881k implements Function1<C3127a, C3127a> {

        /* renamed from: c */
        public static final C3134g f8055c = new C3134g();

        C3134g() {
            super(1);
        }

        /* renamed from: a */
        public final C3127a invoke(C3127a aVar) {
            C3127a aVar2 = new C3127a(false, false, false, null, null, null, 61, null);
            return aVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$h */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3135h extends C12881k implements Function1<C3127a, C3127a> {

        /* renamed from: c */
        public static final C3135h f8056c = new C3135h();

        C3135h() {
            super(1);
        }

        /* renamed from: a */
        public final C3127a invoke(C3127a aVar) {
            return C3127a.m10981a(aVar, false, true, false, null, null, null, 33, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$i */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3136i extends C12881k implements Function1<C3127a, C3127a> {

        /* renamed from: c */
        final /* synthetic */ C3049a f8057c;

        C3136i(C3049a aVar) {
            this.f8057c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C3127a invoke(C3127a aVar) {
            return C3127a.m10981a(aVar, false, false, true, ((C3054e) this.f8057c).mo12080a(), ((C3054e) this.f8057c).mo12081b(), null, 33, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$j */
    /* compiled from: SignupEmailViewModel.kt */
    static final /* synthetic */ class C3137j extends C12879i implements Function1<C3049a, C13145v> {
        C3137j(C3126n nVar) {
            super(1, nVar);
        }

        /* renamed from: a */
        public final void mo12178a(C3049a aVar) {
            ((C3126n) this.receiver).m10973a(aVar);
        }

        public final String getName() {
            return "mapSignupEmailActionState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3126n.class);
        }

        public final String getSignature() {
            return "mapSignupEmailActionState(Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAction$ActionState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12178a((C3049a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.n$k */
    /* compiled from: SignupEmailViewModel.kt */
    static final class C3138k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3138k f8058c = new C3138k();

        C3138k() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Unhandled Exception: during SignupEmailAction", new Object[0]);
        }
    }

    public C3126n(C3107f fVar, C3095d dVar, C2753b bVar, C7626a aVar, C2755d dVar2, C2784r rVar, C3033b bVar2, C3046f fVar2, C3105e eVar, C10611d dVar3) {
        super(null, 1, null);
        this.f8032b = fVar;
        this.f8033c = dVar;
        this.f8034d = bVar;
        this.f8035e = aVar;
        this.f8036f = dVar2;
        this.f8037g = rVar;
        this.f8038h = bVar2;
        this.f8039i = fVar2;
        this.f8040j = eVar;
        this.f8041k = dVar3;
        C3127a aVar2 = new C3127a(false, false, false, null, null, null, 63, null);
        createState(aVar2);
        this.f8037g.mo11801d(true);
        mo12157y();
    }

    /* renamed from: b */
    public final void mo12156b(String str) {
        this.f8031a = str;
    }

    /* renamed from: y */
    public final void mo12157y() {
        C3128b bVar = new C3128b(this);
        Object a = this.f8033c.mo12126a().mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C3139o(new C3130c(bVar)), new C3131d(this));
    }

    /* renamed from: z */
    public final String mo12158z() {
        return this.f8031a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r3 != null) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12155a(java.lang.String r3, java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput> r4) {
        /*
            r2 = this;
            com.bamtechmedia.dominguez.auth.r r0 = r2.f8037g
            java.util.List r0 = r0.mo11803z()
            com.bamtechmedia.dominguez.auth.r r1 = r2.f8037g
            r1.mo11800c(r4)
            com.bamtechmedia.dominguez.auth.v0.h.f r1 = r2.f8032b
            if (r3 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x001c
            java.lang.CharSequence r3 = kotlin.p588j0.C12833x.m40181f(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0024
            goto L_0x0026
        L_0x001c:
            kotlin.s r3 = new kotlin.s
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.CharSequence"
            r3.<init>(r4)
            throw r3
        L_0x0024:
            java.lang.String r3 = ""
        L_0x0026:
            io.reactivex.Observable r3 = r1.mo12144a(r3, r0, r4)
            g.n.a.c0 r4 = r2.getViewModelScope()
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30161a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            g.n.a.a0 r3 = (p163g.p503n.p504a.C11786a0) r3
            com.bamtechmedia.dominguez.auth.v0.h.n$j r4 = new com.bamtechmedia.dominguez.auth.v0.h.n$j
            r4.<init>(r2)
            com.bamtechmedia.dominguez.auth.v0.h.o r0 = new com.bamtechmedia.dominguez.auth.v0.h.o
            r0.<init>(r4)
            com.bamtechmedia.dominguez.auth.v0.h.n$k r4 = com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.C3138k.f8058c
            r3.mo29915a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.mo12155a(java.lang.String, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10973a(C3049a aVar) {
        if (aVar instanceof C3055f) {
            updateState(C3135h.f8056c);
        } else if (aVar instanceof C3050a) {
            m10970a((C3050a) aVar);
        } else if (aVar instanceof C3053d) {
            m10972a((C3053d) aVar);
        } else if (aVar instanceof C3051b) {
            m10971a((C3051b) aVar);
        } else if (aVar instanceof C3054e) {
            updateState(new C3136i(aVar));
        } else if (aVar instanceof C3052c) {
            this.f8035e.mo20539a(((C3052c) aVar).mo12072a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10974a(C3097a aVar) {
        List<MarketingEntity> b = aVar.mo12128b();
        List a = aVar.mo12127a();
        this.f8037g.mo11799b(b);
        this.f8037g.mo11797a(a);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) b, 10));
        for (MarketingEntity a2 : b) {
            arrayList.add(this.f8039i.mo12062a(a2, Integer.valueOf(C2721j0.a11y_onboardingemail_checkbox_marketingemails), this.f8041k, this.f8040j));
        }
        List<LegalDisclosure> a3 = aVar.mo12127a();
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) a3, 10));
        for (LegalDisclosure a4 : a3) {
            arrayList2.add(this.f8038h.mo12041a(a4));
        }
        updateState(new C3133f(arrayList, arrayList2));
    }

    /* renamed from: a */
    private final void m10970a(C3050a aVar) {
        this.f8037g.mo11798b(aVar.mo12064a());
        this.f8037g.mo11801d(false);
        this.f8034d.mo11765b();
        updateState(C3132e.f8052c);
    }

    /* renamed from: a */
    private final void m10971a(C3051b bVar) {
        this.f8037g.mo11798b(bVar.mo12068a());
        this.f8036f.mo11771b();
    }

    /* renamed from: a */
    private final void m10972a(C3053d dVar) {
        this.f8037g.mo11798b(dVar.mo12076a());
        this.f8034d.mo11766d();
        updateState(C3134g.f8055c);
    }
}
