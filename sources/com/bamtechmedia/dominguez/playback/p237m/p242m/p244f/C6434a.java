package com.bamtechmedia.dominguez.playback.p237m.p242m.p244f;

import android.content.Context;
import android.hardware.display.DisplayManager;
import com.bamtech.sdk4.media.HdrType;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.C11969r;
import p520io.reactivex.functions.Consumer;
import p551j.p552a.C12589b;
import p551j.p552a.C12590c;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/engine/session/SentryCapabilitiesReporter;", "", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "context", "Landroid/content/Context;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;Landroid/content/Context;Lio/reactivex/Scheduler;)V", "displayManager", "Landroid/hardware/display/DisplayManager;", "getDisplayManager", "()Landroid/hardware/display/DisplayManager;", "report", "", "scopeProvider", "Lcom/uber/autodispose/ScopeProvider;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.a */
/* compiled from: SentryCapabilitiesReporter.kt */
public final class C6434a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MediaCapabilitiesProvider f14590a;

    /* renamed from: b */
    private final Context f14591b;

    /* renamed from: c */
    private final C11969r f14592c;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.a$a */
    /* compiled from: SentryCapabilitiesReporter.kt */
    static final class C6435a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C6434a f14593c;

        C6435a(C6434a aVar) {
            this.f14593c = aVar;
        }

        public final Map<String, Object> call() {
            List supportedHdrTypes = this.f14593c.f14590a.getSupportedHdrTypes();
            C12590c b = C12589b.m39533b();
            int length = this.f14593c.m20103a().getDisplays().length;
            Pair[] pairArr = new Pair[5];
            pairArr[0] = C12907r.m40244a("capabiliies.hdr10", Boolean.valueOf(supportedHdrTypes.contains(HdrType.HDR10)));
            Pair a = C12907r.m40244a("capabiliies.dovi", Boolean.valueOf(supportedHdrTypes.contains(HdrType.DOLBY_VISION)));
            boolean z = true;
            pairArr[1] = a;
            pairArr[2] = C12907r.m40244a("capabilities.atmos", Boolean.valueOf(this.f14593c.f14590a.supportsAtmos()));
            pairArr[3] = C12907r.m40244a("widevine", this.f14593c.f14590a.getWidevineSecurityLevel());
            if (length <= 1) {
                z = false;
            }
            pairArr[4] = C12907r.m40244a("multidisplay", Boolean.valueOf(z));
            Map<String, Object> a2 = C13173j0.m40356a(pairArr);
            for (Entry entry : a2.entrySet()) {
                b.mo30890a((String) entry.getKey(), entry.getValue().toString());
            }
            return a2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.a$b */
    /* compiled from: SentryCapabilitiesReporter.kt */
    static final class C6436b<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: c */
        public static final C6436b f14594c = new C6436b();

        C6436b() {
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            Timber.m44522a(map.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.a$c */
    /* compiled from: SentryCapabilitiesReporter.kt */
    static final /* synthetic */ class C6437c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6437c f14595c = new C6437c();

        C6437c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19089a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19089a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C6434a(MediaCapabilitiesProvider mediaCapabilitiesProvider, Context context, C11969r rVar) {
        this.f14590a = mediaCapabilitiesProvider;
        this.f14591b = context;
        this.f14592c = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final DisplayManager m20103a() {
        Object systemService = this.f14591b.getSystemService("display");
        if (systemService != null) {
            return (DisplayManager) systemService;
        }
        throw new C13142s("null cannot be cast to non-null type android.hardware.display.DisplayManager");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.bamtechmedia.dominguez.playback.m.m.f.a$c, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.m.f.b] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19086a(p163g.p503n.p504a.C11790c0 r4) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.playback.m.m.f.a$a r0 = new com.bamtechmedia.dominguez.playback.m.m.f.a$a
            r0.<init>(r3)
            io.reactivex.Single r0 = p520io.reactivex.Single.m38401c(r0)
            io.reactivex.r r1 = r3.f14592c
            io.reactivex.Single r0 = r0.mo30220b(r1)
            java.lang.String r1 = "Single\n            .from…  .subscribeOn(scheduler)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r4 = r0.mo30215a(r4)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
            g.n.a.d0 r4 = (p163g.p503n.p504a.C11792d0) r4
            com.bamtechmedia.dominguez.playback.m.m.f.a$b r0 = com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6434a.C6436b.f14594c
            com.bamtechmedia.dominguez.playback.m.m.f.a$c r1 = com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6434a.C6437c.f14595c
            if (r1 == 0) goto L_0x002f
            com.bamtechmedia.dominguez.playback.m.m.f.b r2 = new com.bamtechmedia.dominguez.playback.m.m.f.b
            r2.<init>(r1)
            r1 = r2
        L_0x002f:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo29920a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6434a.mo19086a(g.n.a.c0):void");
    }
}
