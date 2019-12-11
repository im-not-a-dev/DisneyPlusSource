package p163g.p201e.p203b.p405c0;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p064p0.C2770d;
import com.bamtechmedia.dominguez.auth.p064p0.C2775g;
import com.google.android.gms.auth.api.credentials.C9628a;
import com.google.android.gms.auth.api.credentials.C9628a.C9629a;
import com.google.android.gms.auth.api.credentials.C9630b;
import com.google.android.gms.auth.api.credentials.C9632d;
import com.google.android.gms.auth.api.credentials.C9634f;
import com.google.android.gms.auth.api.credentials.C9635g.C9636a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credential.C9626a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.C9808j;
import com.google.common.base.Optional;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p449j.p450a.p451a.p467f.C11428c;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.C11976a;
import p520io.reactivex.subjects.C11983e;
import p520io.reactivex.subjects.PublishSubject;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u0001:\u00029:B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0016J\u0019\u0010$\u001a\u00020\u001d2\u000e\b\u0004\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0!H\bJ\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0016J\"\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\u0018\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0016J\u001f\u00105\u001a\u00020\u001d2\u0014\b\u0004\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001d07H\bR\u0014\u0010\n\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006;"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/smartlock/SmartLockAutoLogin;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "context", "Landroid/content/Context;", "config", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/smartlock/SmartLockConfig;", "passwordAvailability", "Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailability;", "(Landroid/content/Context;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailability;)V", "client", "Lcom/google/android/gms/auth/api/credentials/CredentialsClient;", "getClient", "()Lcom/google/android/gms/auth/api/credentials/CredentialsClient;", "credentialsSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/google/common/base/Optional;", "Lcom/google/android/gms/auth/api/credentials/Credential;", "errorSubject", "Lio/reactivex/subjects/Subject;", "Lkotlin/Pair;", "", "Lcom/google/android/gms/common/api/ResolvableApiException;", "request", "Lcom/google/android/gms/auth/api/credentials/CredentialRequest;", "kotlin.jvm.PlatformType", "getRequest", "()Lcom/google/android/gms/auth/api/credentials/CredentialRequest;", "clear", "", "credentials", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginCredentials;", "onAutoLoginFailed", "Lkotlin/Function0;", "credentialsMaybe", "Lio/reactivex/Maybe;", "ifAvailable", "onAvailable", "initResolution", "activity", "Landroidx/fragment/app/FragmentActivity;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onResult", "credential", "requestIfAvailable", "store", "email", "", "password", "withAvailable", "block", "Lkotlin/Function1;", "", "Companion", "SmartLockCredentials", "storeGoogle_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.c0.a */
/* compiled from: SmartLockAutoLogin.kt */
public final class C10544a implements C2760a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11983e<Pair<Integer, C9808j>> f24986a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11976a<Optional<Credential>> f24987b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f24988c;

    /* renamed from: d */
    private final Single<C10562d> f24989d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2775g f24990e;

    /* renamed from: g.e.b.c0.a$a */
    /* compiled from: SmartLockAutoLogin.kt */
    public static final class C10545a {
        private C10545a() {
        }

        public /* synthetic */ C10545a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.c0.a$b */
    /* compiled from: SmartLockAutoLogin.kt */
    public static final class C10546b implements C2770d {

        /* renamed from: a */
        private final Credential f24991a;

        public C10546b(Credential credential) {
            this.f24991a = credential;
        }

        /* renamed from: a */
        public String mo11784a() {
            String f = this.f24991a.mo24848f();
            C12880j.m40222a((Object) f, "credential.id");
            return f;
        }

        /* renamed from: b */
        public String mo11785b() {
            String i = this.f24991a.mo24852i();
            return i != null ? i : "";
        }

        /* renamed from: c */
        public final Credential mo27436c() {
            return this.f24991a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f24991a, (java.lang.Object) ((p163g.p201e.p203b.p405c0.C10544a.C10546b) r2).f24991a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p405c0.C10544a.C10546b
                if (r0 == 0) goto L_0x0013
                g.e.b.c0.a$b r2 = (p163g.p201e.p203b.p405c0.C10544a.C10546b) r2
                com.google.android.gms.auth.api.credentials.Credential r0 = r1.f24991a
                com.google.android.gms.auth.api.credentials.Credential r2 = r2.f24991a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p405c0.C10544a.C10546b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Credential credential = this.f24991a;
            if (credential != null) {
                return credential.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SmartLockCredentials(credential=");
            sb.append(this.f24991a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.c0.a$c */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10547c<TResult> implements C11428c<C9630b> {

        /* renamed from: a */
        final /* synthetic */ C10544a f24992a;

        C10547c(C10544a aVar) {
            this.f24992a = aVar;
        }

        /* renamed from: a */
        public final void mo25228a(C11435h<C9630b> hVar) {
            if (hVar.mo29268e()) {
                C9634f a = this.f24992a.m33266b();
                C9630b bVar = (C9630b) hVar.mo29263b();
                String str = null;
                Credential b = bVar != null ? bVar.mo24876b() : null;
                if (b != null) {
                    a.mo24881a(b);
                    Context b2 = this.f24992a.f24988c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cleared Smart Lock for ");
                    C9630b bVar2 = (C9630b) hVar.mo29263b();
                    if (bVar2 != null) {
                        Credential b3 = bVar2.mo24876b();
                        if (b3 != null) {
                            str = b3.mo24848f();
                        }
                    }
                    sb.append(str);
                    Toast.makeText(b2, sb.toString(), 0).show();
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Exception a2 = hVar.mo29258a();
            if ((a2 instanceof C9808j) && ((C9808j) a2).mo25041a() != 4) {
                this.f24992a.f24986a.onNext(C12907r.m40244a(Integer.valueOf(17), a2));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginCredentials;", "kotlin.jvm.PlatformType", "smartLockConfig", "Lcom/bamtechmedia/dominguez/smartlock/SmartLockConfig;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.c0.a$d */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10548d<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C10544a f24993c;

        /* renamed from: g.e.b.c0.a$d$a */
        /* compiled from: SmartLockAutoLogin.kt */
        static final class C10549a<T> implements C11952h<Optional<Credential>> {

            /* renamed from: c */
            public static final C10549a f24994c = new C10549a();

            C10549a() {
            }

            /* renamed from: a */
            public final boolean test(Optional<Credential> optional) {
                return optional.mo27106b();
            }
        }

        /* renamed from: g.e.b.c0.a$d$b */
        /* compiled from: SmartLockAutoLogin.kt */
        static final class C10550b<T, R> implements Function<T, R> {

            /* renamed from: c */
            public static final C10550b f24995c = new C10550b();

            C10550b() {
            }

            /* renamed from: a */
            public final C10546b apply(Optional<Credential> optional) {
                Object a = optional.mo27104a();
                C12880j.m40222a(a, "it.get()");
                return new C10546b((Credential) a);
            }
        }

        /* renamed from: g.e.b.c0.a$d$c */
        /* compiled from: SmartLockAutoLogin.kt */
        static final class C10551c<T> implements Consumer<Disposable> {

            /* renamed from: c */
            final /* synthetic */ C10548d f24996c;

            C10551c(C10548d dVar) {
                this.f24996c = dVar;
            }

            /* renamed from: a */
            public final void accept(Disposable disposable) {
                this.f24996c.f24993c.m33272e();
            }
        }

        C10548d(C10544a aVar) {
            this.f24993c = aVar;
        }

        /* renamed from: a */
        public final Maybe<C2770d> apply(C10562d dVar) {
            if (!dVar.mo27448a()) {
                return Maybe.m38259h();
            }
            return this.f24993c.f24987b.mo30186d().mo30202a((C11952h<? super T>) C10549a.f24994c).mo30131f(C10550b.f24995c).mo30116b((Consumer<? super Disposable>) new C10551c<Object>(this));
        }
    }

    /* renamed from: g.e.b.c0.a$e */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10552e<T> implements Consumer<Pair<? extends Integer, ? extends C9808j>> {

        /* renamed from: c */
        final /* synthetic */ C0532d f24997c;

        C10552e(C0532d dVar) {
            this.f24997c = dVar;
        }

        /* renamed from: a */
        public final void accept(Pair<Integer, ? extends C9808j> pair) {
            ((C9808j) pair.mo31016d()).mo25257a(this.f24997c, ((Number) pair.mo31015c()).intValue());
        }
    }

    /* renamed from: g.e.b.c0.a$f */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10553f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C10553f f24998c = new C10553f();

        C10553f() {
        }

        /* renamed from: a */
        public final void mo27445a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo27445a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.c0.a$g */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10554g<TResult> implements C11428c<C9630b> {

        /* renamed from: a */
        final /* synthetic */ C10544a f24999a;

        C10554g(C10544a aVar) {
            this.f24999a = aVar;
        }

        /* renamed from: a */
        public final void mo25228a(C11435h<C9630b> hVar) {
            Credential credential = null;
            if (hVar.mo29268e()) {
                this.f24999a.f24990e.mo11791a(true);
                C10544a aVar = this.f24999a;
                C9630b bVar = (C9630b) hVar.mo29263b();
                if (bVar != null) {
                    credential = bVar.mo24876b();
                }
                aVar.m33263a(credential);
                return;
            }
            Exception a = hVar.mo29258a();
            if (a != null) {
                C14100a.m44523a((Throwable) a);
            } else {
                a = null;
            }
            if (!(a instanceof C9808j)) {
                this.f24999a.m33263a((Credential) null);
            } else if (((C9808j) a).mo25041a() == 4) {
                this.f24999a.m33263a((Credential) null);
            } else {
                this.f24999a.f24986a.onNext(C12907r.m40244a(Integer.valueOf(16), a));
            }
        }
    }

    /* renamed from: g.e.b.c0.a$h */
    /* compiled from: SmartLockAutoLogin.kt */
    public static final class C10555h<TResult> implements C11428c<Void> {

        /* renamed from: a */
        final /* synthetic */ C10544a f25000a;

        public C10555h(C10544a aVar) {
            this.f25000a = aVar;
        }

        /* renamed from: a */
        public final void mo25228a(C11435h<Void> hVar) {
            if (hVar.mo29268e()) {
                this.f25000a.m33270d();
            } else {
                this.f25000a.m33263a((Credential) null);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "smartLockConfig", "Lcom/bamtechmedia/dominguez/smartlock/SmartLockConfig;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.c0.a$i */
    /* compiled from: SmartLockAutoLogin.kt */
    static final class C10556i<T> implements Consumer<C10562d> {

        /* renamed from: U */
        final /* synthetic */ String f25001U;

        /* renamed from: V */
        final /* synthetic */ String f25002V;

        /* renamed from: c */
        final /* synthetic */ C10544a f25003c;

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onComplete", "com/bamtechmedia/dominguez/smartlock/SmartLockAutoLogin$withAvailable$1", "com/bamtechmedia/dominguez/smartlock/SmartLockAutoLogin$store$1$ifAvailable$$inlined$withAvailable$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.c0.a$i$a */
        /* compiled from: SmartLockAutoLogin.kt */
        public static final class C10557a<TResult> implements C11428c<Void> {

            /* renamed from: a */
            final /* synthetic */ C10556i f25004a;

            /* renamed from: g.e.b.c0.a$i$a$a */
            /* compiled from: SmartLockAutoLogin.kt */
            static final class C10558a<TResult> implements C11428c<Void> {

                /* renamed from: a */
                final /* synthetic */ C10557a f25005a;

                C10558a(C10557a aVar) {
                    this.f25005a = aVar;
                }

                /* renamed from: a */
                public final void mo25228a(C11435h<Void> hVar) {
                    if (!hVar.mo29268e()) {
                        Exception a = hVar.mo29258a();
                        if (a instanceof C9808j) {
                            this.f25005a.f25004a.f25003c.f24986a.onNext(C12907r.m40244a(Integer.valueOf(15), a));
                        } else {
                            C14100a.m44523a((Throwable) a);
                        }
                    }
                    this.f25005a.f25004a.f25003c.f24990e.mo11791a(hVar.mo29268e());
                }
            }

            public C10557a(C10556i iVar) {
                this.f25004a = iVar;
            }

            /* renamed from: a */
            public final void mo25228a(C11435h<Void> hVar) {
                if (hVar.mo29268e()) {
                    C9634f a = this.f25004a.f25003c.m33266b();
                    C9626a aVar = new C9626a(this.f25004a.f25001U);
                    aVar.mo24855a(this.f25004a.f25002V);
                    a.mo24883b(aVar.mo24856a()).mo29249a((C11428c<TResult>) new C10558a<TResult>(this));
                }
            }
        }

        C10556i(C10544a aVar, String str, String str2) {
            this.f25003c = aVar;
            this.f25001U = str;
            this.f25002V = str2;
        }

        /* renamed from: a */
        public final void accept(C10562d dVar) {
            if (dVar.mo27448a()) {
                GoogleApiAvailability.m30032a().mo24983a((C9695e<?>) this.f25003c.m33266b(), (C9695e<?>[]) new C9695e[0]).mo29249a((C11428c<TResult>) new C10557a<TResult>(this));
            }
        }
    }

    /* renamed from: g.e.b.c0.a$j */
    /* compiled from: SmartLockAutoLogin.kt */
    static final /* synthetic */ class C10559j extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C10559j f25006c = new C10559j();

        C10559j() {
            super(1);
        }

        /* renamed from: a */
        public final void mo27447a(Throwable th) {
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
            mo27447a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C10545a(null);
    }

    public C10544a(Context context, Single<C10562d> single, C2775g gVar) {
        this.f24988c = context;
        this.f24989d = single;
        this.f24990e = gVar;
        PublishSubject q = PublishSubject.m38553q();
        C12880j.m40222a((Object) q, "PublishSubject.create()");
        this.f24986a = q;
        C11976a<Optional<Credential>> p = C11976a.m38563p();
        C12880j.m40222a((Object) p, "BehaviorSubject.create()");
        this.f24987b = p;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [g.e.b.c0.a$j, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r5v1, types: [g.e.b.c0.b] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void store(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            io.reactivex.Single<g.e.b.c0.d> r0 = r3.f24989d
            io.reactivex.r r1 = p520io.reactivex.p525e0.C11934b.m38500b()
            io.reactivex.Single r0 = r0.mo30220b(r1)
            java.lang.String r1 = "config.subscribeOn(Schedulers.io())"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            io.reactivex.Completable r1 = p520io.reactivex.Completable.m38170i()
            java.lang.String r2 = "Completable.never()"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37931a(r1)
            java.lang.Object r0 = r0.mo30215a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(scope))"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.d0 r0 = (p163g.p503n.p504a.C11792d0) r0
            g.e.b.c0.a$i r1 = new g.e.b.c0.a$i
            r1.<init>(r3, r4, r5)
            g.e.b.c0.a$j r4 = p163g.p201e.p203b.p405c0.C10544a.C10559j.f25006c
            if (r4 == 0) goto L_0x0036
            g.e.b.c0.b r5 = new g.e.b.c0.b
            r5.<init>(r4)
            r4 = r5
        L_0x0036:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r0.mo29920a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p405c0.C10544a.store(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C9634f m33266b() {
        Context context = this.f24988c;
        C9636a aVar = new C9636a();
        aVar.mo24886c();
        C9634f a = C9632d.m29918a(context, aVar.mo24884a());
        C12880j.m40222a((Object) a, "Credentials.getClient(co…ableSaveDialog().build())");
        return a;
    }

    /* renamed from: c */
    private final C9628a m33267c() {
        C9629a aVar = new C9629a();
        aVar.mo24874a(true);
        return aVar.mo24875a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m33270d() {
        C14100a.m44529c("Requesting credentials from smart lock", new Object[0]);
        m33266b().mo24882a(m33267c()).mo29249a((C11428c<TResult>) new C10554g<TResult>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m33272e() {
        GoogleApiAvailability.m30032a().mo24983a((C9695e<?>) m33266b(), (C9695e<?>[]) new C9695e[0]).mo29249a((C11428c<TResult>) new C10555h<TResult>(this));
    }

    /* renamed from: a */
    public void mo11777a(C0532d dVar) {
        C11983e<Pair<Integer, C9808j>> eVar = this.f24986a;
        C10541b a = C10541b.m33255a((C0722m) dVar, C0716a.ON_DESTROY);
        C12880j.m40222a((Object) a, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a2 = eVar.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C10552e(dVar), C10553f.f24998c);
    }

    /* renamed from: a */
    public Maybe<C2770d> mo11775a() {
        Maybe<C2770d> c = this.f24989d.mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C10548d<Object,Object>(this));
        C12880j.m40222a((Object) c, "config.flatMapMaybe { sm…IfAvailable() }\n        }");
        return c;
    }

    /* renamed from: a */
    public void mo11776a(int i, int i2, Intent intent) {
        String str = "com.google.android.gms.credentials.Credential";
        Credential credential = null;
        if (i == 16 && i2 == -1) {
            if (intent != null) {
                credential = (Credential) intent.getParcelableExtra(str);
            }
            m33263a(credential);
        } else if (i == 17 && i2 == -1) {
            C9634f b = m33266b();
            if (intent != null) {
                credential = (Credential) intent.getParcelableExtra(str);
            }
            if (credential != null) {
                b.mo24881a(credential);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: a */
    public void mo11778a(C2770d dVar, Function0<C13145v> function0) {
        if (dVar instanceof C10546b) {
            m33266b().mo24881a(((C10546b) dVar).mo27436c());
            function0.invoke();
            return;
        }
        C11435h a = m33266b().mo24882a(m33267c());
        a.mo29249a((C11428c<TResult>) new C10547c<TResult>(this));
        C12880j.m40222a((Object) a, "client.request(request).…          }\n            }");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33263a(Credential credential) {
        StringBuilder sb = new StringBuilder();
        sb.append("Received credentials from smart lock: ");
        sb.append(credential != null ? credential.mo24848f() : null);
        C14100a.m44529c(sb.toString(), new Object[0]);
        this.f24987b.onNext(Optional.m32790b(credential));
    }
}
