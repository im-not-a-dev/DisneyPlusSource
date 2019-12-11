package com.bamtechmedia.dominguez.analytics.p055m0;

import android.content.Context;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/AdobeContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Lio/reactivex/Scheduler;)V", "createState", "Lio/reactivex/Single;", "", "", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.c */
/* compiled from: AdobeContributor.kt */
public final class C2383c implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6609a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11760v f6610b;

    /* renamed from: c */
    private final C11969r f6611c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.c$a */
    /* compiled from: AdobeContributor.kt */
    static final class C2384a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2383c f6612c;

        C2384a(C2383c cVar) {
            this.f6612c = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.String> call() {
            /*
                r3 = this;
                com.bamtechmedia.dominguez.analytics.m0.c r0 = r3.f6612c     // Catch:{ IOException -> 0x004d }
                android.content.Context r0 = r0.f6609a     // Catch:{ IOException -> 0x004d }
                android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x004d }
                java.lang.String r1 = "ADBMobileConfig.json"
                java.io.InputStream r0 = r0.open(r1)     // Catch:{ IOException -> 0x004d }
                com.bamtechmedia.dominguez.analytics.m0.c r1 = r3.f6612c     // Catch:{ IOException -> 0x004d }
                g.m.a.v r1 = r1.f6610b     // Catch:{ IOException -> 0x004d }
                java.lang.Class<com.bamtechmedia.dominguez.analytics.AdobeConfig> r2 = com.bamtechmedia.dominguez.analytics.AdobeConfig.class
                g.m.a.h r1 = r1.mo29866a(r2)     // Catch:{ IOException -> 0x004d }
                java.lang.String r2 = "inputStream"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)     // Catch:{ IOException -> 0x004d }
                okio.x r0 = okio.C14287m.m45724a(r0)     // Catch:{ IOException -> 0x004d }
                okio.BufferedSource r0 = okio.C14287m.m45716a(r0)     // Catch:{ IOException -> 0x004d }
                r2 = 0
                java.lang.Object r1 = r1.fromJson(r0)     // Catch:{ all -> 0x0046 }
                com.bamtechmedia.dominguez.analytics.AdobeConfig r1 = (com.bamtechmedia.dominguez.analytics.AdobeConfig) r1     // Catch:{ all -> 0x0046 }
                kotlin.p580c0.C12724b.m39863a(r0, r2)     // Catch:{ IOException -> 0x004d }
                if (r1 == 0) goto L_0x0041
                com.bamtechmedia.dominguez.analytics.o0.a r0 = new com.bamtechmedia.dominguez.analytics.o0.a     // Catch:{ IOException -> 0x004d }
                r0.<init>(r1)     // Catch:{ IOException -> 0x004d }
                java.util.Map r0 = r0.mo11563a()     // Catch:{ IOException -> 0x004d }
                if (r0 == 0) goto L_0x0041
                goto L_0x0055
            L_0x0041:
                java.util.Map r0 = kotlin.p590y.C13173j0.m40350a()     // Catch:{ IOException -> 0x004d }
                goto L_0x0055
            L_0x0046:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r2 = move-exception
                kotlin.p580c0.C12724b.m39863a(r0, r1)     // Catch:{ IOException -> 0x004d }
                throw r2     // Catch:{ IOException -> 0x004d }
            L_0x004d:
                r0 = move-exception
                p686n.p687a.Timber.m44523a(r0)
                java.util.Map r0 = kotlin.p590y.C13173j0.m40350a()
            L_0x0055:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p055m0.C2383c.C2384a.call():java.util.Map");
        }
    }

    public C2383c(Context context, C11760v vVar, C11969r rVar) {
        this.f6609a = context;
        this.f6610b = vVar;
        this.f6611c = rVar;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> d = Single.m38401c((Callable<? extends T>) new C2384a<Object>(this)).mo30220b(this.f6611c).mo30226d();
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "Single.fromCallable {\n  …heduler)\n        .cache()");
        return d;
    }
}
