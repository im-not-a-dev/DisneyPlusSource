package com.bamtechmedia.dominguez.auth;

import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.session.SessionState.AuthenticationExpired;
import com.bamtech.sdk4.session.SessionState.Failed;
import com.bamtech.sdk4.session.SessionState.Initializing;
import com.bamtech.sdk4.session.SessionState.LoggedIn;
import com.bamtech.sdk4.session.SessionState.LoggedOut;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b.C2741a;
import com.bamtechmedia.dominguez.auth.p061o0.C2742c;
import com.bamtechmedia.dominguez.auth.p064p0.C2763b;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B-\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/LoadAuthStateActionImpl;", "Lcom/bamtechmedia/dominguez/auth/api/LoadAuthStateAction;", "sessionStateOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionState;", "logInAction", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "authListener", "Lcom/bamtechmedia/dominguez/auth/api/AuthListener;", "autoLoginAction", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginAction;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/auth/login/LogInAction;Lcom/bamtechmedia/dominguez/auth/api/AuthListener;Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginAction;)V", "loadAuthState", "Lio/reactivex/Completable;", "onComplete", "state", "Lcom/bamtechmedia/dominguez/auth/LoadAuthStateActionImpl$AuthState;", "AuthState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.a0 */
/* compiled from: LoadAuthStateActionImpl.kt */
public final class C2693a0 implements C2742c {

    /* renamed from: a */
    private final Single<SessionState> f7446a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2783b f7447b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2740b f7448c;

    /* renamed from: d */
    private final C2763b f7449d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/LoadAuthStateActionImpl$AuthState;", "", "()V", "LoggedIn", "LoggedOut", "Lcom/bamtechmedia/dominguez/auth/LoadAuthStateActionImpl$AuthState$LoggedIn;", "Lcom/bamtechmedia/dominguez/auth/LoadAuthStateActionImpl$AuthState$LoggedOut;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.a0$a */
    /* compiled from: LoadAuthStateActionImpl.kt */
    private static abstract class C2694a {

        /* renamed from: com.bamtechmedia.dominguez.auth.a0$a$a */
        /* compiled from: LoadAuthStateActionImpl.kt */
        public static final class C2695a extends C2694a {

            /* renamed from: a */
            public static final C2695a f7450a = new C2695a();

            private C2695a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.a0$a$b */
        /* compiled from: LoadAuthStateActionImpl.kt */
        public static final class C2696b extends C2694a {

            /* renamed from: a */
            public static final C2696b f7451a = new C2696b();

            private C2696b() {
                super(null);
            }
        }

        private C2694a() {
        }

        public /* synthetic */ C2694a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.a0$b */
    /* compiled from: LoadAuthStateActionImpl.kt */
    static final class C2697b<T, R> implements Function<SessionState, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C2693a0 f7452c;

        C2697b(C2693a0 a0Var) {
            this.f7452c = a0Var;
        }

        /* renamed from: a */
        public final CompletableSource apply(SessionState sessionState) {
            if (sessionState instanceof LoggedIn) {
                return this.f7452c.m10327a((C2694a) C2695a.f7450a);
            }
            if ((sessionState instanceof LoggedOut) || (sessionState instanceof AuthenticationExpired) || (sessionState instanceof Failed) || (sessionState instanceof Initializing)) {
                return this.f7452c.m10327a((C2694a) C2696b.f7451a);
            }
            throw new C12898l();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.a0$c */
    /* compiled from: LoadAuthStateActionImpl.kt */
    static final class C2698c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C2693a0 f7453a;

        C2698c(C2693a0 a0Var) {
            this.f7453a = a0Var;
        }

        public final void run() {
            C2741a.m10380a(this.f7453a.f7448c, false, 1, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "loggedIn", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.a0$d */
    /* compiled from: LoadAuthStateActionImpl.kt */
    static final class C2699d<T, R> implements Function<Boolean, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C2693a0 f7454c;

        /* renamed from: com.bamtechmedia.dominguez.auth.a0$d$a */
        /* compiled from: LoadAuthStateActionImpl.kt */
        static final class C2700a implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C2699d f7455a;

            C2700a(C2699d dVar) {
                this.f7455a = dVar;
            }

            public final void run() {
                C2741a.m10380a(this.f7455a.f7454c.f7448c, false, 1, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.a0$d$b */
        /* compiled from: LoadAuthStateActionImpl.kt */
        static final class C2701b implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C2699d f7456a;

            C2701b(C2699d dVar) {
                this.f7456a = dVar;
            }

            public final void run() {
                this.f7456a.f7454c.f7448c.mo11753a();
            }
        }

        C2699d(C2693a0 a0Var) {
            this.f7454c = a0Var;
        }

        /* renamed from: a */
        public final CompletableSource apply(Boolean bool) {
            if (bool.booleanValue()) {
                return this.f7454c.f7447b.mo11569a().mo30050b((C11945a) new C2700a(this));
            }
            return Completable.m38166c((C11945a) new C2701b(this));
        }
    }

    public C2693a0(Single<SessionState> single, C2783b bVar, C2740b bVar2, C2763b bVar3) {
        this.f7446a = single;
        this.f7447b = bVar;
        this.f7448c = bVar2;
        this.f7449d = bVar3;
    }

    /* renamed from: a */
    public Completable mo11733a() {
        Completable b = this.f7446a.mo30217b((Function<? super T, ? extends CompletableSource>) new C2697b<Object,Object>(this));
        C12880j.m40222a((Object) b, "sessionStateOnce\n       …          }\n            }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Completable m10327a(C2694a aVar) {
        if (C12880j.m40224a((Object) aVar, (Object) C2695a.f7450a)) {
            Completable b = this.f7447b.mo11569a().mo30050b((C11945a) new C2698c(this));
            C12880j.m40222a((Object) b, "logInAction.onLogin().do…thListener.onLoggedIn() }");
            return b;
        } else if (C12880j.m40224a((Object) aVar, (Object) C2696b.f7451a)) {
            Completable b2 = this.f7449d.mo11780a().mo30217b((Function<? super T, ? extends CompletableSource>) new C2699d<Object,Object>(this));
            C12880j.m40222a((Object) b2, "autoLoginAction.autoLogi…}\n            }\n        }");
            return b2;
        } else {
            throw new C12898l();
        }
    }
}
