package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.plugin.PluginApi;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtechmedia.dominguez.auth.C2725l0;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.C14313b;
import p520io.reactivex.C11959m;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ=\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0002J%\u0010\u0018\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0010H\u0016¢\u0006\u0002\u0010\u0019J1\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/SdkPluginProviderImpl;", "Lcom/bamtechmedia/dominguez/sdk/SdkPluginProvider;", "sdkSessionProvider", "Lcom/bamtechmedia/dominguez/sdk/SdkSessionProvider;", "sessionExpiredListener", "Lcom/bamtechmedia/dominguez/auth/SessionExpiredListener;", "vpnBlocking", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking;", "(Lcom/bamtechmedia/dominguez/sdk/SdkSessionProvider;Lcom/bamtechmedia/dominguez/auth/SessionExpiredListener;Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking;)V", "debugLog", "", "T", "Lcom/bamtech/sdk4/plugin/PluginApi;", "method", "Ljava/lang/reflect/Method;", "type", "Ljava/lang/Class;", "args", "", "", "(Ljava/lang/reflect/Method;Ljava/lang/Class;[Ljava/lang/Object;)V", "handleEvent", "throwable", "", "proxyPluginApi", "(Ljava/lang/Class;)Lcom/bamtech/sdk4/plugin/PluginApi;", "safeInvoke", "target", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.a0 */
/* compiled from: SdkPluginProviderImpl.kt */
public final class C7178a0 implements C7234z {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Single<Session> f15865d;

    /* renamed from: e */
    public static final C7179a f15866e = new C7179a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7195c0 f15867a;

    /* renamed from: b */
    private final C2725l0 f15868b;

    /* renamed from: c */
    private final C7141a f15869c;

    /* renamed from: g.e.b.b0.a0$a */
    /* compiled from: SdkPluginProviderImpl.kt */
    public static final class C7179a {
        private C7179a() {
        }

        /* renamed from: a */
        public final Single<Session> mo20025a() {
            return C7178a0.f15865d;
        }

        public /* synthetic */ C7179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072,\u0010\b\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, mo31007d2 = {"<anonymous>", "", "T", "Lcom/bamtech/sdk4/plugin/PluginApi;", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.b0.a0$b */
    /* compiled from: SdkPluginProviderImpl.kt */
    static final class C7180b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ C7178a0 f15870a;

        /* renamed from: b */
        final /* synthetic */ Class f15871b;

        /* renamed from: g.e.b.b0.a0$b$a */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7181a<T> implements Consumer<C11959m<Object>> {

            /* renamed from: U */
            final /* synthetic */ Method f15872U;

            /* renamed from: c */
            final /* synthetic */ C7180b f15873c;

            C7181a(C7180b bVar, Method method) {
                this.f15873c = bVar;
                this.f15872U = method;
            }

            /* renamed from: a */
            public final void accept(C11959m<Object> mVar) {
                C7178a0 a0Var = this.f15873c.f15870a;
                Intrinsics.checkReturnedValueIsNotNull((Object) mVar, "it");
                Throwable a = mVar.mo30266a();
                Method method = this.f15872U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                a0Var.m21753a(a, method);
            }
        }

        /* renamed from: g.e.b.b0.a0$b$b */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7182b<T, R> implements Function<Session, CompletableSource> {

            /* renamed from: U */
            final /* synthetic */ Method f15874U;

            /* renamed from: V */
            final /* synthetic */ Object[] f15875V;

            /* renamed from: c */
            final /* synthetic */ C7180b f15876c;

            C7182b(C7180b bVar, Method method, Object[] objArr) {
                this.f15876c = bVar;
                this.f15874U = method;
                this.f15875V = objArr;
            }

            /* renamed from: a */
            public final Completable apply(Session session) {
                C7180b bVar = this.f15876c;
                C7178a0 a0Var = bVar.f15870a;
                PluginApi pluginApi = session.getPluginApi(bVar.f15871b);
                Method method = this.f15874U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                Object a = a0Var.m21750a((Object) pluginApi, method, this.f15875V);
                if (a != null) {
                    return (Completable) a;
                }
                throw new C13142s("null cannot be cast to non-null type io.reactivex.Completable");
            }
        }

        /* renamed from: g.e.b.b0.a0$b$c */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7183c<T> implements Consumer<Throwable> {

            /* renamed from: U */
            final /* synthetic */ Method f15877U;

            /* renamed from: c */
            final /* synthetic */ C7180b f15878c;

            C7183c(C7180b bVar, Method method) {
                this.f15878c = bVar;
                this.f15877U = method;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C7178a0 a0Var = this.f15878c.f15870a;
                Method method = this.f15877U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                a0Var.m21753a(th, method);
            }
        }

        /* renamed from: g.e.b.b0.a0$b$d */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7184d<T, R> implements Function<T, SingleSource<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ Method f15879U;

            /* renamed from: V */
            final /* synthetic */ Object[] f15880V;

            /* renamed from: c */
            final /* synthetic */ C7180b f15881c;

            C7184d(C7180b bVar, Method method, Object[] objArr) {
                this.f15881c = bVar;
                this.f15879U = method;
                this.f15880V = objArr;
            }

            /* renamed from: a */
            public final Single<?> apply(Session session) {
                C7180b bVar = this.f15881c;
                C7178a0 a0Var = bVar.f15870a;
                PluginApi pluginApi = session.getPluginApi(bVar.f15871b);
                Method method = this.f15879U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                Object a = a0Var.m21750a((Object) pluginApi, method, this.f15880V);
                if (a != null) {
                    return (Single) a;
                }
                throw new C13142s("null cannot be cast to non-null type io.reactivex.Single<*>");
            }
        }

        /* renamed from: g.e.b.b0.a0$b$e */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7185e<T1, T2> implements C11946b<Object, Throwable> {

            /* renamed from: a */
            final /* synthetic */ C7180b f15882a;

            /* renamed from: b */
            final /* synthetic */ Method f15883b;

            C7185e(C7180b bVar, Method method) {
                this.f15882a = bVar;
                this.f15883b = method;
            }

            /* renamed from: a */
            public final void accept(Object obj, Throwable th) {
                C7178a0 a0Var = this.f15882a.f15870a;
                Method method = this.f15883b;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                a0Var.m21753a(th, method);
            }
        }

        /* renamed from: g.e.b.b0.a0$b$f */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7186f<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ Method f15884U;

            /* renamed from: V */
            final /* synthetic */ Object[] f15885V;

            /* renamed from: c */
            final /* synthetic */ C7180b f15886c;

            C7186f(C7180b bVar, Method method, Object[] objArr) {
                this.f15886c = bVar;
                this.f15884U = method;
                this.f15885V = objArr;
            }

            /* renamed from: a */
            public final Observable<?> apply(Session session) {
                C7180b bVar = this.f15886c;
                C7178a0 a0Var = bVar.f15870a;
                PluginApi pluginApi = session.getPluginApi(bVar.f15871b);
                Method method = this.f15884U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                Object a = a0Var.m21750a((Object) pluginApi, method, this.f15885V);
                if (a != null) {
                    return (Observable) a;
                }
                throw new C13142s("null cannot be cast to non-null type io.reactivex.Observable<*>");
            }
        }

        /* renamed from: g.e.b.b0.a0$b$g */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7187g<T> implements Consumer<C11959m<Object>> {

            /* renamed from: U */
            final /* synthetic */ Method f15887U;

            /* renamed from: c */
            final /* synthetic */ C7180b f15888c;

            C7187g(C7180b bVar, Method method) {
                this.f15888c = bVar;
                this.f15887U = method;
            }

            /* renamed from: a */
            public final void accept(C11959m<Object> mVar) {
                C7178a0 a0Var = this.f15888c.f15870a;
                Intrinsics.checkReturnedValueIsNotNull((Object) mVar, "it");
                Throwable a = mVar.mo30266a();
                Method method = this.f15887U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                a0Var.m21753a(a, method);
            }
        }

        /* renamed from: g.e.b.b0.a0$b$h */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7188h<T, R> implements Function<T, MaybeSource<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ Method f15889U;

            /* renamed from: V */
            final /* synthetic */ Object[] f15890V;

            /* renamed from: c */
            final /* synthetic */ C7180b f15891c;

            C7188h(C7180b bVar, Method method, Object[] objArr) {
                this.f15891c = bVar;
                this.f15889U = method;
                this.f15890V = objArr;
            }

            /* renamed from: a */
            public final Maybe<?> apply(Session session) {
                C7180b bVar = this.f15891c;
                C7178a0 a0Var = bVar.f15870a;
                PluginApi pluginApi = session.getPluginApi(bVar.f15871b);
                Method method = this.f15889U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                Object a = a0Var.m21750a((Object) pluginApi, method, this.f15890V);
                if (a != null) {
                    return (Maybe) a;
                }
                throw new C13142s("null cannot be cast to non-null type io.reactivex.Maybe<*>");
            }
        }

        /* renamed from: g.e.b.b0.a0$b$i */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7189i<T1, T2> implements C11946b<Object, Throwable> {

            /* renamed from: a */
            final /* synthetic */ C7180b f15892a;

            /* renamed from: b */
            final /* synthetic */ Method f15893b;

            C7189i(C7180b bVar, Method method) {
                this.f15892a = bVar;
                this.f15893b = method;
            }

            /* renamed from: a */
            public final void accept(Object obj, Throwable th) {
                C7178a0 a0Var = this.f15892a.f15870a;
                Method method = this.f15893b;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                a0Var.m21753a(th, method);
            }
        }

        /* renamed from: g.e.b.b0.a0$b$j */
        /* compiled from: SdkPluginProviderImpl.kt */
        static final class C7190j<T, R> implements Function<T, C14313b<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ Method f15894U;

            /* renamed from: V */
            final /* synthetic */ Object[] f15895V;

            /* renamed from: c */
            final /* synthetic */ C7180b f15896c;

            C7190j(C7180b bVar, Method method, Object[] objArr) {
                this.f15896c = bVar;
                this.f15894U = method;
                this.f15895V = objArr;
            }

            /* renamed from: a */
            public final Flowable<?> apply(Session session) {
                C7180b bVar = this.f15896c;
                C7178a0 a0Var = bVar.f15870a;
                PluginApi pluginApi = session.getPluginApi(bVar.f15871b);
                Method method = this.f15894U;
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                Object a = a0Var.m21750a((Object) pluginApi, method, this.f15895V);
                if (a != null) {
                    return (Flowable) a;
                }
                throw new C13142s("null cannot be cast to non-null type io.reactivex.Flowable<*>");
            }
        }

        C7180b(C7178a0 a0Var, Class cls) {
            this.f15870a = a0Var;
            this.f15871b = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            C7178a0 a0Var = this.f15870a;
            Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
            a0Var.m21754a(method, this.f15871b, objArr);
            Single a = C7178a0.f15866e.mo20025a();
            if (a == null) {
                a = this.f15870a.f15867a.mo20041e();
            }
            if (Intrinsics.areEqual((Object) method.getReturnType(), (Object) Completable.class)) {
                return a.mo30217b((Function<? super T, ? extends CompletableSource>) new C7182b<Object,Object>(this, method, objArr)).mo30049b((Consumer<? super Throwable>) new C7183c<Object>(this, method));
            }
            if (Intrinsics.areEqual((Object) method.getReturnType(), (Object) Single.class)) {
                return a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C7184d<Object,Object>(this, method, objArr)).mo30210a((C11946b<? super T, ? super Throwable>) new C7185e<Object,Object>(this, method));
            }
            if (Intrinsics.areEqual((Object) method.getReturnType(), (Object) Observable.class)) {
                return a.mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C7186f<Object,Object>(this, method, objArr)).mo30166b((Consumer<? super C11959m<T>>) new C7187g<Object>(this, method));
            }
            if (Intrinsics.areEqual((Object) method.getReturnType(), (Object) Maybe.class)) {
                return a.mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C7188h<Object,Object>(this, method, objArr)).mo30105a((C11946b<? super T, ? super Throwable>) new C7189i<Object,Object>(this, method));
            }
            if (Intrinsics.areEqual((Object) method.getReturnType(), (Object) Flowable.class)) {
                return a.mo30229e(new C7190j(this, method, objArr)).mo30064a((Consumer<? super C11959m<T>>) new C7181a<Object>(this, method));
            }
            try {
                Object a2 = this.f15870a.m21750a((Object) ((Session) a.mo30224c()).getPluginApi(this.f15871b), method, objArr);
                this.f15870a.m21753a(null, method);
                return a2;
            } catch (UnauthorizedException e) {
                this.f15870a.m21753a(e, method);
                throw e;
            }
        }
    }

    public C7178a0(C7195c0 c0Var, C2725l0 l0Var, C7141a aVar) {
        this.f15867a = c0Var;
        this.f15868b = l0Var;
        this.f15869c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <T extends PluginApi> void m21754a(Method method, Class<T> cls, Object[] objArr) {
    }

    /* renamed from: a */
    public <T extends PluginApi> T mo20024a(Class<T> cls) {
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7180b(this, cls));
        if (newProxyInstance != null) {
            return (PluginApi) newProxyInstance;
        }
        throw new C13142s("null cannot be cast to non-null type T");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21753a(java.lang.Throwable r5, java.lang.reflect.Method r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x005a
            boolean r0 = r5 instanceof com.bamtech.sdk4.service.UnauthorizedException
            if (r0 == 0) goto L_0x0054
            r0 = r5
            com.bamtech.sdk4.service.UnauthorizedException r0 = (com.bamtech.sdk4.service.UnauthorizedException) r0
            java.util.List r0 = r0.getErrors()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x0037
        L_0x001a:
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            com.bamtech.sdk4.service.ErrorReason r1 = (com.bamtech.sdk4.service.ErrorReason) r1
            java.lang.String r1 = r1.getCode()
            java.lang.String r3 = "access-token.invalid"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L_0x001e
            r0 = 1
        L_0x0037:
            if (r0 == 0) goto L_0x0054
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "`access-token.invalid` when invoking "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            p686n.p687a.Timber.m44528b(r5, r0, r1)
            com.bamtechmedia.dominguez.auth.l0 r0 = r4.f15868b
            r0.mo11743a()
        L_0x0054:
            com.bamtechmedia.dominguez.sdk.vpn.a r0 = r4.f15869c
            r0.mo19966a(r6, r5)
            goto L_0x005f
        L_0x005a:
            com.bamtechmedia.dominguez.sdk.vpn.a r5 = r4.f15869c
            r5.mo19965a(r6)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p277b0.C7178a0.m21753a(java.lang.Throwable, java.lang.reflect.Method):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Object m21750a(Object obj, Method method, Object[] objArr) {
        boolean z = true;
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return method.invoke(obj, new Object[0]);
        }
        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }
}
