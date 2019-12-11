package com.bamtechmedia.dominguez.app;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import com.bamtechmedia.dominguez.config.C3526e0;
import com.bamtechmedia.dominguez.config.C3526e0.C3527a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p216l.C5760a;
import com.bamtechmedia.dominguez.core.p216l.C5760a.C5761a;
import com.bamtechmedia.dominguez.core.utils.C5882v;
import java.io.IOException;
import java.net.SocketException;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.JodaTimeAndroid;
import p163g.p171c.p172a.p173a.C4793a;
import p520io.reactivex.C11969r;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p527w.p528b.C11991a;
import p520io.reactivex.p527w.p529c.C11992a;
import p520io.reactivex.p530x.C12007f;
import p551j.p552a.C12589b;
import p551j.p552a.C12590c;
import p551j.p552a.p553g.C12597b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/app/CoreInitializationAction;", "Lcom/bamtechmedia/dominguez/core/app/AppInitializationAction;", "debugPreferences", "Landroid/content/SharedPreferences;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Implementation;", "featureFlags", "Lcom/bamtechmedia/dominguez/config/FeatureFlags;", "lifecycleObservers", "Ljava/util/Set;", "Landroidx/lifecycle/LifecycleObserver;", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Landroid/content/SharedPreferences;Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Implementation;Lcom/bamtechmedia/dominguez/config/FeatureFlags;Ljava/util/Set;Lcom/bamnet/config/strings/OverrideStrings;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "sortValue", "", "getSortValue", "()I", "initializeRx", "", "onApplicationCreate", "application", "Landroid/app/Application;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.app.r */
/* compiled from: CoreInitializationAction.kt */
public final class C2502r implements C3824a {

    /* renamed from: a */
    private final C5761a f6798a;

    /* renamed from: b */
    private final C3526e0 f6799b;

    /* renamed from: c */
    private final Set<C0721l> f6800c;

    /* renamed from: d */
    private final C4793a f6801d;

    /* renamed from: e */
    private final BuildInfo f6802e;

    /* renamed from: com.bamtechmedia.dominguez.app.r$a */
    /* compiled from: CoreInitializationAction.kt */
    static final class C2503a<V> implements Callable<C11969r> {

        /* renamed from: c */
        public static final C2503a f6803c = new C2503a();

        C2503a() {
        }

        public final C11969r call() {
            return C11992a.m38601a(Looper.getMainLooper(), true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.r$b */
    /* compiled from: CoreInitializationAction.kt */
    static final class C2504b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2504b f6804c = new C2504b();

        C2504b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Throwable cause = th instanceof C12007f ? th.getCause() : th;
            if ((cause instanceof IOException) || (cause instanceof SocketException) || (cause instanceof InterruptedException)) {
                return;
            }
            if (!(cause instanceof NullPointerException) && !(cause instanceof IllegalArgumentException) && !(cause instanceof IllegalStateException)) {
                Timber.m44530c(cause, "Undeliverable exception received in global Rx error handler", new Object[0]);
                return;
            }
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkReturnedValueIsNotNull((Object) currentThread, "Thread.currentThread()");
            currentThread.getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }

    public C2502r(SharedPreferences sharedPreferences, C5761a aVar, C3526e0 e0Var, Set<C0721l> set, C4793a aVar2, BuildInfo buildInfo) {
        this.f6798a = aVar;
        this.f6799b = e0Var;
        this.f6800c = set;
        this.f6801d = aVar2;
        this.f6802e = buildInfo;
    }

    /* renamed from: b */
    private final void m9146b() {
        C11991a.m38599b(C2503a.f6803c);
        C11915a.m38461a((Consumer<? super Throwable>) C2504b.f6804c);
    }

    /* renamed from: a */
    public int mo11494a() {
        return 1;
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        if (this.f6799b.mo12733a(C3527a.SENTRY)) {
            C12590c a = C12589b.m39528a(this.f6799b.mo12732a("sentryDsn"), new C12597b(application));
            String name = this.f6802e.mo12778a().name();
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "it");
            if (this.f6802e.mo12781d() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("DEV-");
                sb.append(name);
                name = sb.toString();
            }
            a.mo30896c(name);
            a.mo30890a("build.number", String.valueOf(this.f6802e.mo12781d()));
        }
        JodaTimeAndroid.init(application);
        C5760a.f13520b.mo17647a(this.f6798a);
        C5882v.f13663b.mo17775a(this.f6801d);
        m9146b();
        C0722m i = C0733v.m3782i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "ProcessLifecycleOwner.get()");
        C0715i lifecycle = i.getLifecycle();
        Intrinsics.checkReturnedValueIsNotNull((Object) lifecycle, "ProcessLifecycleOwner.get().lifecycle");
        for (C0721l a2 : this.f6800c) {
            lifecycle.mo4134a(a2);
        }
    }
}
