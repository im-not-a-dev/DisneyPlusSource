package com.bamtechmedia.dominguez.auth.p064p0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.google.common.base.Optional;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginAction;", "", "autoLoginOptional", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "devConfigAutoLogin", "Lcom/bamtechmedia/dominguez/auth/autologin/DevConfigAutoLogin;", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "passwordAvailability", "Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailabilityImpl;", "(Lcom/google/common/base/Optional;Lcom/bamtechmedia/dominguez/auth/autologin/DevConfigAutoLogin;Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailabilityImpl;)V", "autoLogin", "Lio/reactivex/Single;", "", "credentialsMaybe", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginCredentials;", "kotlin.jvm.PlatformType", "doLogin", "credentials", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.p0.b */
/* compiled from: AutoLoginAction.kt */
public final class C2763b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Optional<C2760a> f7505a;

    /* renamed from: b */
    private final C2771e f7506b;

    /* renamed from: c */
    private final BamIdentityApi f7507c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AccountApi f7508d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7547h f7509e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2776h f7510f;

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.b$a */
    /* compiled from: AutoLoginAction.kt */
    static final class C2764a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C2763b f7511c;

        C2764a(C2763b bVar) {
            this.f7511c = bVar;
        }

        /* renamed from: a */
        public final Single<Boolean> apply(C2770d dVar) {
            return this.f7511c.m10416a(dVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.b$b */
    /* compiled from: AutoLoginAction.kt */
    static final class C2765b<T, R> implements Function<IdentityToken, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C2763b f7512c;

        C2765b(C2763b bVar) {
            this.f7512c = bVar;
        }

        /* renamed from: a */
        public final Completable apply(IdentityToken identityToken) {
            return this.f7512c.f7508d.authorize(identityToken);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.b$c */
    /* compiled from: AutoLoginAction.kt */
    static final class C2766c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C2763b f7513a;

        C2766c(C2763b bVar) {
            this.f7513a = bVar;
        }

        public final void run() {
            this.f7513a.f7510f.mo11791a(true);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.p0.b$d */
    /* compiled from: AutoLoginAction.kt */
    static final class C2767d<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ C2770d f7514U;

        /* renamed from: c */
        final /* synthetic */ C2763b f7515c;

        /* renamed from: com.bamtechmedia.dominguez.auth.p0.b$d$a */
        /* compiled from: AutoLoginAction.kt */
        static final class C2768a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2767d f7516c;

            C2768a(C2767d dVar) {
                this.f7516c = dVar;
                super(0);
            }

            public final void invoke() {
                C7547h c = this.f7516c.f7515c.f7509e;
                C7544a aVar = new C7544a();
                aVar.mo20484i(Integer.valueOf(C2721j0.auto_login_failed_msg_title));
                aVar.mo20467a(Integer.valueOf(C2721j0.auto_login_failed_msg_body));
                c.mo20491b(aVar.mo20465a());
            }
        }

        C2767d(C2763b bVar, C2770d dVar) {
            this.f7515c = bVar;
            this.f7514U = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C2760a aVar = (C2760a) this.f7515c.f7505a.mo27107c();
            if (aVar != null) {
                aVar.mo11778a(this.f7514U, new C2768a(this));
            }
            this.f7515c.f7510f.mo11791a(false);
        }
    }

    public C2763b(Optional<C2760a> optional, C2771e eVar, BamIdentityApi bamIdentityApi, AccountApi accountApi, C7547h hVar, C2776h hVar2) {
        this.f7505a = optional;
        this.f7506b = eVar;
        this.f7507c = bamIdentityApi;
        this.f7508d = accountApi;
        this.f7509e = hVar;
        this.f7510f = hVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p520io.reactivex.Maybe<com.bamtechmedia.dominguez.auth.p064p0.C2770d> m10418b() {
        /*
            r2 = this;
            com.google.common.base.Optional<com.bamtechmedia.dominguez.auth.p0.a> r0 = r2.f7505a
            java.lang.Object r0 = r0.mo27107c()
            com.bamtechmedia.dominguez.auth.p0.a r0 = (com.bamtechmedia.dominguez.auth.p064p0.C2760a) r0
            if (r0 == 0) goto L_0x0011
            io.reactivex.Maybe r0 = r0.mo11775a()
            if (r0 == 0) goto L_0x0011
            goto L_0x001a
        L_0x0011:
            io.reactivex.Maybe r0 = p520io.reactivex.Maybe.m38259h()
            java.lang.String r1 = "Maybe.empty()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
        L_0x001a:
            com.bamtechmedia.dominguez.auth.p0.e r1 = r2.f7506b
            io.reactivex.Maybe r1 = r1.mo11786a()
            io.reactivex.Maybe r0 = r0.mo30115b(r1)
            java.lang.String r1 = "(autoLoginOptional.orNul…Login.credentialsMaybe())"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p064p0.C2763b.m10418b():io.reactivex.Maybe");
    }

    /* renamed from: a */
    public final Single<Boolean> mo11780a() {
        Single<Boolean> a = m10418b().mo30128d(new C2764a(this)).mo30213a(Boolean.valueOf(false));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "credentialsMaybe()\n     ….onErrorReturnItem(false)");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<Boolean> m10416a(C2770d dVar) {
        Single<Boolean> a = this.f7507c.authenticate(dVar.mo11784a(), dVar.mo11785b()).mo30217b((Function<? super T, ? extends CompletableSource>) new C2765b<Object,Object>(this)).mo30050b((C11945a) new C2766c(this)).mo30036a((Consumer<? super Throwable>) new C2767d<Object>(this, dVar)).mo30045a(Boolean.valueOf(true));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "identityApi.authenticate…   .toSingleDefault(true)");
        return a;
    }
}
