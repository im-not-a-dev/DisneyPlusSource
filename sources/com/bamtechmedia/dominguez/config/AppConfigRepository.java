package com.bamtechmedia.dominguez.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.config.C3524e.C3525a;
import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.config.C3532h.C3534b;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.C3584a;
import com.bamtechmedia.dominguez.core.BuildInfo.Environment;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5838i0;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0003*+,B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\f0\f0\u001cJ&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0002\b\u0003\u0018\u00010\u00142\u0010\u0010$\u001a\f\u0012\u0004\u0012\u00020\u0011\u0012\u0002\b\u00030\u0014H\u0002J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R>\u0010\u001b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0015 \u001d*\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00140\u00140\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/AppConfigRepository;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "processLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "configLoaderFactory", "Lcom/bamtechmedia/dominguez/config/ConfigLoader$Factory;", "context", "Landroid/content/Context;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/bamtechmedia/dominguez/config/ConfigLoader$Factory;Landroid/content/Context;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "appConfigMap", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "getAppConfigMap", "()Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "configKeys", "", "", "configLoader", "Lcom/bamtechmedia/dominguez/config/ConfigLoader;", "", "", "envPath", "firstStart", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loaded", "", "mapOnce", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "getMapOnce", "()Lio/reactivex/Single;", "platformPath", "versionPath", "appConfigMapOnce", "deviceOverride", "map", "initialize", "Lio/reactivex/Completable;", "onStart", "", "owner", "Companion", "DefaultAppConfigMap", "LazyAppConfigMap", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AppConfigRepository.kt */
public final class AppConfigRepository implements C0710d {

    /* renamed from: U */
    private final String f8793U;

    /* renamed from: V */
    private final String f8794V;

    /* renamed from: W */
    private final AtomicBoolean f8795W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f8796X;

    /* renamed from: Y */
    private final List<String> f8797Y;

    /* renamed from: Z */
    private final C3532h<Map<String, Object>> f8798Z;

    /* renamed from: a0 */
    private final C3524e f8799a0;

    /* renamed from: b0 */
    private final BuildInfo f8800b0;

    /* renamed from: c */
    private final String f8801c;

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$a */
    /* compiled from: AppConfigRepository.kt */
    public static final class C3506a {
        private C3506a() {
        }

        public /* synthetic */ C3506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$b */
    /* compiled from: AppConfigRepository.kt */
    private static final class C3507b implements C3524e {

        /* renamed from: a */
        private final Map<String, ?> f8802a;

        public C3507b(Map<String, ?> map) {
            this.f8802a = map;
        }

        /* renamed from: a */
        public Map<String, ?> mo12717a() {
            return this.f8802a;
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: b */
        public Double mo12718b(String str, String... strArr) {
            return C3525a.m11938a(this, str, strArr);
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: c */
        public Integer mo12719c(String str, String... strArr) {
            return C3525a.m11939b(this, str, strArr);
        }

        /* renamed from: d */
        public <T> T mo12720d(String str, String... strArr) {
            return C5859p.m18897a(mo12717a(), str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: a */
        public Long mo12716a(String str, String... strArr) {
            return C3525a.m11940c(this, str, strArr);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$c */
    /* compiled from: AppConfigRepository.kt */
    public final class C3508c implements C3524e {
        public C3508c() {
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: a */
        public Long mo12716a(String str, String... strArr) {
            return C3525a.m11940c(this, str, strArr);
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: b */
        public Double mo12718b(String str, String... strArr) {
            return C3525a.m11938a(this, str, strArr);
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: c */
        public Integer mo12719c(String str, String... strArr) {
            return C3525a.m11939b(this, str, strArr);
        }

        /* renamed from: d */
        public <T> T mo12720d(String str, String... strArr) {
            return C5859p.m18897a(mo12717a(), str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: a */
        public Map<String, ?> mo12717a() {
            Object c = AppConfigRepository.this.m11893e().mo30224c();
            C12880j.m40222a(c, "mapOnce.blockingGet()");
            return (Map) c;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$d */
    /* compiled from: AppConfigRepository.kt */
    static final class C3509d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3509d f8804c = new C3509d();

        C3509d() {
        }

        /* renamed from: a */
        public final C3507b apply(Map<String, ? extends Object> map) {
            return new C3507b(map);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$e */
    /* compiled from: AppConfigRepository.kt */
    static final class C3510e extends C12881k implements Function0<Map<String, ? extends Object>> {

        /* renamed from: c */
        public static final C3510e f8805c = new C3510e();

        C3510e() {
            super(0);
        }

        public final Map<String, Object> invoke() {
            return C13173j0.m40350a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$f */
    /* compiled from: AppConfigRepository.kt */
    static final class C3511f<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ AppConfigRepository f8806c;

        C3511f(AppConfigRepository appConfigRepository) {
            this.f8806c = appConfigRepository;
        }

        /* renamed from: a */
        public final Map<String, Object> apply(Map<String, ? extends Object> map) {
            Map a = this.f8806c.m11891a(map);
            return a != null ? a : map;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$g */
    /* compiled from: AppConfigRepository.kt */
    static final class C3512g<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: c */
        final /* synthetic */ AppConfigRepository f8807c;

        C3512g(AppConfigRepository appConfigRepository) {
            this.f8807c = appConfigRepository;
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            this.f8807c.f8796X = true;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$h */
    /* compiled from: AppConfigRepository.kt */
    static final class C3513h<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: c */
        public static final C3513h f8808c = new C3513h();

        C3513h() {
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            C14100a.m44522a("Refreshed AppConfig", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.AppConfigRepository$i */
    /* compiled from: AppConfigRepository.kt */
    static final class C3514i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3514i f8809c = new C3514i();

        C3514i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44526b("Failed to refresh AppConfig", new Object[0]);
        }
    }

    static {
        new C3506a(null);
    }

    public AppConfigRepository(C0722m mVar, C3533a aVar, Context context, BuildInfo buildInfo) {
        this.f8800b0 = buildInfo;
        this.f8801c = this.f8800b0.mo12778a() == Environment.QA ? "qa" : "prod";
        this.f8793U = this.f8800b0.mo12780c() == C3584a.TV ? "android-tv" : "android";
        this.f8794V = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        this.f8795W = new AtomicBoolean(true);
        String[] strArr = new String[13];
        StringBuilder sb = new StringBuilder();
        String str = "MARKET_";
        sb.append(str);
        sb.append(C5838i0.m18844a(this.f8800b0.mo12779b().name()));
        strArr[0] = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C5838i0.m18844a(this.f8800b0.mo12779b().name()));
        String str2 = "_API_";
        sb2.append(str2);
        sb2.append(VERSION.SDK_INT);
        strArr[1] = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("API_");
        sb3.append(VERSION.SDK_INT);
        strArr[2] = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        String str3 = "MANUFACTURER_";
        sb4.append(str3);
        String str4 = Build.MANUFACTURER;
        sb4.append(str4 != null ? C5838i0.m18844a(str4) : null);
        strArr[3] = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str3);
        String str5 = Build.MANUFACTURER;
        sb5.append(str5 != null ? C5838i0.m18844a(str5) : null);
        sb5.append(str2);
        sb5.append(VERSION.SDK_INT);
        strArr[4] = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        String str6 = "MODEL_";
        sb6.append(str6);
        String str7 = Build.MODEL;
        sb6.append(str7 != null ? C5838i0.m18844a(str7) : null);
        strArr[5] = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str6);
        String str8 = Build.MODEL;
        sb7.append(str8 != null ? C5838i0.m18844a(str8) : null);
        sb7.append(str2);
        sb7.append(VERSION.SDK_INT);
        strArr[6] = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(str6);
        String str9 = Build.MODEL;
        sb8.append(str9 != null ? C5838i0.m18844a(str9) : null);
        sb8.append("_RELEASE_");
        sb8.append(VERSION.RELEASE);
        strArr[7] = sb8.toString();
        strArr[8] = C5837i.m18842d(context) ^ true ? "PHONE" : null;
        StringBuilder sb9 = new StringBuilder();
        sb9.append("PHONE_API_");
        sb9.append(VERSION.SDK_INT);
        String sb10 = sb9.toString();
        if (!(true ^ C5837i.m18842d(context))) {
            sb10 = null;
        }
        strArr[9] = sb10;
        StringBuilder sb11 = new StringBuilder();
        sb11.append("TABLET_");
        sb11.append(C5838i0.m18844a(this.f8800b0.mo12779b().name()));
        String sb12 = sb11.toString();
        if (!C5837i.m18842d(context)) {
            sb12 = null;
        }
        strArr[10] = sb12;
        strArr[11] = C5837i.m18842d(context) ? "TABLET" : null;
        StringBuilder sb13 = new StringBuilder();
        sb13.append("TABLET_API_");
        sb13.append(VERSION.SDK_INT);
        String sb14 = sb13.toString();
        if (!C5837i.m18842d(context)) {
            sb14 = null;
        }
        strArr[12] = sb14;
        this.f8797Y = C13199w.m40585e(C13188p0.m40533b(strArr));
        StringBuilder sb15 = new StringBuilder();
        sb15.append("https://appconfigs.disney-plus.net/dmgz/");
        sb15.append(this.f8801c);
        sb15.append('/');
        sb15.append(this.f8793U);
        sb15.append('/');
        sb15.append(this.f8794V);
        sb15.append("/config.json");
        C3534b bVar = new C3534b(sb15.toString(), Map.class, "config.json", "dplus-app", Long.valueOf(1000), null, C3510e.f8805c, 32, null);
        this.f8798Z = aVar.mo12736a(bVar);
        mVar.getLifecycle().mo4134a(this);
        this.f8799a0 = new C3508c();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final Single<Map<String, Object>> m11893e() {
        Single<Map<String, Object>> d = C3532h.m11948a(this.f8798Z, false, 1, null).mo30233g(new C3511f(this)).mo30227d((Consumer<? super T>) new C3512g<Object>(this));
        C12880j.m40222a((Object) d, "configLoader.fetchConfig…Success { loaded = true }");
        return d;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public final Single<C3524e> mo12714b() {
        Single<C3524e> g = m11893e().mo30233g(C3509d.f8804c);
        C12880j.m40222a((Object) g, "mapOnce.map<AppConfigMap…DefaultAppConfigMap(it) }");
        return g;
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public final C3524e mo12715d() {
        return this.f8799a0;
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        if (!this.f8795W.getAndSet(false)) {
            Single a = this.f8798Z.mo12735a(true);
            C10541b a2 = C10541b.m33254a(mVar);
            C12880j.m40222a((Object) a2, "AndroidLifecycleScopeProvider.from(\n    this)");
            Object a3 = a.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
            C12880j.m40222a(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a3).mo29920a(C3513h.f8808c, C3514i.f8809c);
        }
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, ?> m11891a(java.util.Map<java.lang.String, ?> r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "overrides"
            java.lang.Object r1 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r8, r2, r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x005b
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r6 = "configKeys"
            java.lang.Object r4 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r4, r6, r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0050
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0036
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0036
            goto L_0x0050
        L_0x0036:
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List<java.lang.String> r6 = r7.f8797Y
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x003a
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0012
            r2 = r3
        L_0x0054:
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x005a
            r8 = r0
        L_0x005a:
            return r8
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.config.AppConfigRepository.m11891a(java.util.Map):java.util.Map");
    }
}
