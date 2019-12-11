package com.bamtechmedia.dominguez.profiles;

import com.bamtech.sdk4.service.NetworkException;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesLogInAction;", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "repository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;)V", "onLogin", "Lio/reactivex/Completable;", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.a1 */
/* compiled from: ProfilesLogInAction.kt */
public final class C6619a1 implements C2783b {

    /* renamed from: a */
    private final C6667g1 f14934a;

    /* renamed from: com.bamtechmedia.dominguez.profiles.a1$a */
    /* compiled from: ProfilesLogInAction.kt */
    public static final class C6620a {
        private C6620a() {
        }

        public /* synthetic */ C6620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a1$b */
    /* compiled from: ProfilesLogInAction.kt */
    static final class C6621b<T, R> implements Function<Throwable, CompletableSource> {

        /* renamed from: c */
        public static final C6621b f14935c = new C6621b();

        C6621b() {
        }

        /* renamed from: a */
        public final CompletableSource apply(Throwable th) {
            if ((th instanceof UnknownHostException) || (th instanceof NetworkException) || (th instanceof TimeoutException)) {
                return Completable.m38169h();
            }
            throw th;
        }
    }

    static {
        new C6620a(null);
    }

    public C6619a1(C6667g1 g1Var) {
        this.f14934a = g1Var;
    }

    /* renamed from: a */
    public Completable mo11569a() {
        Completable a = this.f14934a.mo19383d().mo30033a(3, TimeUnit.SECONDS, C11934b.m38500b()).mo30037a((Function<? super Throwable, ? extends CompletableSource>) C6621b.f14935c);
        C12880j.m40222a((Object) a, "repository.refresh()\n   …t\n            }\n        }");
        return a;
    }
}
