package p163g.p201e.p203b.p277b0;

import android.app.Application;
import android.content.SharedPreferences;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountPlugin;
import com.bamtech.sdk4.android.Bootstrapper;
import com.bamtech.sdk4.android.SdkSession;
import com.bamtech.sdk4.android.SdkSession.Companion;
import com.bamtech.sdk4.bookmarks.BookmarkPlugin;
import com.bamtech.sdk4.bookmarks.BookmarksPluginExtra;
import com.bamtech.sdk4.content.ContentPlugin;
import com.bamtech.sdk4.content.ContentPluginExtra;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.identity.bam.BamIdentityPlugin;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.bamtech.sdk4.media.offline.OfflineMediaPluginExtra;
import com.bamtech.sdk4.paywall.PaywallPlugin;
import com.bamtech.sdk4.purchase.bamnet.BamnetPurchasePlugin;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.session.SessionState.Initializing;
import com.bamtech.sdk4.subscription.SubscriptionPlugin;
import com.bamtech.sdk4.useractivity.UserActivityPlugin;
import com.bamtechmedia.dominguez.config.C3558l;
import com.bamtechmedia.dominguez.core.BuildInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import org.reactivestreams.C14313b;
import p520io.reactivex.C11969r;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p551j.p552a.C12589b;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8FX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/SdkSessionProvider;", "Lcom/bamtechmedia/dominguez/sdk/SdkInitBlocker;", "application", "Landroid/app/Application;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "devConfig", "Lcom/bamtechmedia/dominguez/config/DevConfig;", "graphQlResponseConverter", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/sdk/MoshiGraphQlResponseConverter;", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "io", "Lio/reactivex/Scheduler;", "debugPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Application;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/config/DevConfig;Ljavax/inject/Provider;Ljavax/inject/Provider;Lio/reactivex/Scheduler;Landroid/content/SharedPreferences;)V", "currentSessionStateOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionState;", "getCurrentSessionStateOnce", "()Lio/reactivex/Single;", "getDebugPreferences", "()Landroid/content/SharedPreferences;", "initAllowed", "", "overrideGeoProvider", "Lcom/bamtechmedia/dominguez/sdk/OverrideGeoProvider;", "getOverrideGeoProvider", "()Lcom/bamtechmedia/dominguez/sdk/OverrideGeoProvider;", "session", "Lcom/bamtech/sdk4/Session;", "getSession", "()Lcom/bamtech/sdk4/Session;", "session$delegate", "Lkotlin/Lazy;", "sessionOnce", "getSessionOnce", "allowSdkInit", "", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.c0 */
/* compiled from: SdkSessionProvider.kt */
public final class C7195c0 implements C7233y {

    /* renamed from: k */
    static final /* synthetic */ KProperty[] f15903k = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7195c0.class), "session", "getSession()Lcom/bamtech/sdk4/Session;"))};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f15904a;

    /* renamed from: b */
    private final Single<Session> f15905b;

    /* renamed from: c */
    private final Lazy f15906c = C12763i.m39921a(new C7202e(this));

    /* renamed from: d */
    private final C7228v f15907d = new C7228v(this.f15913j, null, 2, null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Application f15908e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BuildInfo f15909f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Provider<C7226t> f15910g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Provider<MediaCapabilitiesProvider> f15911h;

    /* renamed from: i */
    private final C11969r f15912i;

    /* renamed from: j */
    private final SharedPreferences f15913j;

    /* renamed from: g.e.b.b0.c0$a */
    /* compiled from: SdkSessionProvider.kt */
    public static final class C7196a {
        private C7196a() {
        }

        public /* synthetic */ C7196a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.b0.c0$b */
    /* compiled from: SdkSessionProvider.kt */
    static final class C7197b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C7197b f15914c = new C7197b();

        C7197b() {
        }

        /* renamed from: a */
        public final SessionState apply(Session session) {
            return session.getCurrentSessionState();
        }
    }

    /* renamed from: g.e.b.b0.c0$c */
    /* compiled from: SdkSessionProvider.kt */
    static final class C7198c<T> implements Consumer<SessionState> {

        /* renamed from: c */
        public static final C7198c f15915c = new C7198c();

        C7198c() {
        }

        /* renamed from: a */
        public final void accept(SessionState sessionState) {
            if (!(!(sessionState instanceof Initializing))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "errors", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.b0.c0$d */
    /* compiled from: SdkSessionProvider.kt */
    static final class C7199d<T, R> implements Function<Flowable<Throwable>, C14313b<?>> {

        /* renamed from: c */
        public static final C7199d f15916c = new C7199d();

        /* renamed from: g.e.b.b0.c0$d$a */
        /* compiled from: SdkSessionProvider.kt */
        static final class C7200a<T> implements C11952h<Throwable> {

            /* renamed from: c */
            final /* synthetic */ AtomicInteger f15917c;

            C7200a(AtomicInteger atomicInteger) {
                this.f15917c = atomicInteger;
            }

            /* renamed from: a */
            public final boolean test(Throwable th) {
                return this.f15917c.getAndIncrement() < 4;
            }
        }

        /* renamed from: g.e.b.b0.c0$d$b */
        /* compiled from: SdkSessionProvider.kt */
        static final class C7201b<T, R> implements Function<T, C14313b<? extends R>> {

            /* renamed from: c */
            public static final C7201b f15918c = new C7201b();

            C7201b() {
            }

            /* renamed from: a */
            public final Flowable<Long> apply(Throwable th) {
                return Flowable.m38205b(500, TimeUnit.MILLISECONDS, C11934b.m38498a());
            }
        }

        C7199d() {
        }

        /* renamed from: a */
        public final Flowable<Long> apply(Flowable<Throwable> flowable) {
            return flowable.mo30085b((C11952h<? super T>) new C7200a<Object>(new AtomicInteger())).mo30084b((Function<? super T, ? extends C14313b<? extends R>>) C7201b.f15918c);
        }
    }

    /* renamed from: g.e.b.b0.c0$e */
    /* compiled from: SdkSessionProvider.kt */
    static final class C7202e extends C12881k implements Function0<Session> {

        /* renamed from: c */
        final /* synthetic */ C7195c0 f15919c;

        C7202e(C7195c0 c0Var) {
            this.f15919c = c0Var;
            super(0);
        }

        public final Session invoke() {
            if (!this.f15919c.f15904a) {
                C14100a.m44526b("SDK may not be initialized before Application.onCreate is complete", new Object[0]);
            }
            Companion companion = SdkSession.Companion;
            Application a = this.f15919c.f15908e;
            Object obj = this.f15919c.f15911h.get();
            C12880j.m40222a(obj, "mediaCapabilitiesProvider.get()");
            Bootstrapper environment = companion.bootstrapper(a, (MediaCapabilitiesProvider) obj).environment(this.f15919c.f15909f.mo12778a().getSdk());
            Object obj2 = this.f15919c.f15910g.get();
            C12880j.m40222a(obj2, "graphQlResponseConverter.get()");
            environment.plugin(ContentPlugin.class, new ContentPluginExtra((GraphQlResponseConverter) obj2));
            environment.plugin(OfflineMediaPlugin.class, new OfflineMediaPluginExtra(this.f15919c.f15908e, false, 2, null));
            environment.plugin(BookmarkPlugin.class, new BookmarksPluginExtra(this.f15919c.f15908e));
            environment.plugin(AccountPlugin.class, null);
            environment.plugin(UserActivityPlugin.class, null);
            environment.plugin(BamIdentityPlugin.class, null);
            environment.plugin(PaywallPlugin.class, null);
            environment.plugin(SubscriptionPlugin.class, null);
            Session bootstrap = environment.geoProvider(this.f15919c.mo20039c()).bootstrap();
            bootstrap.initializePlugin(BamnetPurchasePlugin.class, null);
            C12589b.m39533b().mo30890a("bamSdkVersion", "4.7.4");
            return bootstrap;
        }
    }

    /* renamed from: g.e.b.b0.c0$f */
    /* compiled from: SdkSessionProvider.kt */
    static final class C7203f<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C7195c0 f15920c;

        C7203f(C7195c0 c0Var) {
            this.f15920c = c0Var;
        }

        public final Session call() {
            return this.f15920c.mo20040d();
        }
    }

    static {
        new C7196a(null);
    }

    public C7195c0(Application application, BuildInfo buildInfo, C3558l lVar, Provider<C7226t> provider, Provider<MediaCapabilitiesProvider> provider2, C11969r rVar, SharedPreferences sharedPreferences) {
        this.f15908e = application;
        this.f15909f = buildInfo;
        this.f15910g = provider;
        this.f15911h = provider2;
        this.f15912i = rVar;
        this.f15913j = sharedPreferences;
        Single<Session> b = Single.m38401c((Callable<? extends T>) new C7203f<Object>(this)).mo30220b(this.f15912i);
        C12880j.m40222a((Object) b, "Single.fromCallable { session }.subscribeOn(io)");
        this.f15905b = b;
    }

    /* renamed from: d */
    public final Session mo20040d() {
        Lazy lazy = this.f15906c;
        KProperty kProperty = f15903k[0];
        return (Session) lazy.getValue();
    }

    /* renamed from: a */
    public void mo20037a() {
        this.f15904a = true;
    }

    /* renamed from: b */
    public final Single<SessionState> mo20038b() {
        Single<SessionState> j = this.f15905b.mo30233g(C7197b.f15914c).mo30227d((Consumer<? super T>) C7198c.f15915c).mo30238j(C7199d.f15916c);
        C12880j.m40222a((Object) j, "sessionOnce.map { sessio…      }\n                }");
        return j;
    }

    /* renamed from: c */
    public final C7228v mo20039c() {
        return this.f15907d;
    }

    /* renamed from: e */
    public final Single<Session> mo20041e() {
        return this.f15905b;
    }
}
