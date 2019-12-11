package com.bamtechmedia.dominguez.app;

import android.content.Context;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.config.C3524e;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.List;
import java.util.Set;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p122j.p123c.C4028a;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;
import p686n.p687a.Timber.C14102b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/app/SentryConfigSetup;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "appConfigMap", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "sentryTree", "Lcom/bamtechmedia/dominguez/app/SentryTree;", "(Landroid/content/Context;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/app/SentryTree;)V", "ignoredMessages", "", "", "getIgnoredMessages", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)Ljava/util/List;", "ignoredStackTraceElements", "getIgnoredStackTraceElements", "sentryThreeEnabled", "", "getSentryThreeEnabled", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)Ljava/lang/Boolean;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "updateSentryIgnores", "map", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SentryConfigSetup.kt */
public final class SentryConfigSetup implements C0710d {

    /* renamed from: W */
    private static final Set<String> f6774W = C13188p0.m40533b("com.android.vending", "com.amazon.venezia");

    /* renamed from: U */
    private final Single<C3524e> f6775U;

    /* renamed from: V */
    private final C2686z f6776V;

    /* renamed from: c */
    private final Context f6777c;

    /* renamed from: com.bamtechmedia.dominguez.app.SentryConfigSetup$a */
    /* compiled from: SentryConfigSetup.kt */
    public static final class C2478a {
        private C2478a() {
        }

        public /* synthetic */ C2478a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.SentryConfigSetup$b */
    /* compiled from: SentryConfigSetup.kt */
    static final /* synthetic */ class C2479b extends C12879i implements Function1<C3524e, C13145v> {
        C2479b(SentryConfigSetup sentryConfigSetup) {
            super(1, sentryConfigSetup);
        }

        /* renamed from: a */
        public final void mo11594a(C3524e eVar) {
            ((SentryConfigSetup) this.receiver).m9086d(eVar);
        }

        public final String getName() {
            return "updateSentryIgnores";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(SentryConfigSetup.class);
        }

        public final String getSignature() {
            return "updateSentryIgnores(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11594a((C3524e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.SentryConfigSetup$c */
    /* compiled from: SentryConfigSetup.kt */
    static final class C2480c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2480c f6778c = new C2480c();

        C2480c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    static {
        new C2478a(null);
    }

    public SentryConfigSetup(Context context, Single<C3524e> single, C2686z zVar) {
        this.f6777c = context;
        this.f6775U = single;
        this.f6776V = zVar;
    }

    /* renamed from: b */
    private final List<String> m9084b(C3524e eVar) {
        return (List) eVar.mo12720d("sentry", "ignoredStackTraceElements");
    }

    /* renamed from: c */
    private final Boolean m9085c(C3524e eVar) {
        return (Boolean) eVar.mo12720d("sentry", "enabled");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9086d(C3524e eVar) {
        List a = m9082a(eVar);
        if (a != null) {
            Set t = C13199w.m40609t(a);
            if (t != null) {
                this.f6776V.mo11724a(t);
            }
        }
        List b = m9084b(eVar);
        if (b != null) {
            Set t2 = C13199w.m40609t(b);
            if (t2 != null) {
                this.f6776V.mo11726b(t2);
            }
        }
        Boolean c = m9085c(eVar);
        if (c != null) {
            this.f6776V.mo11725a(c.booleanValue());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
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
        Single<C3524e> single = this.f6775U;
        C10541b a = C10541b.m33254a(mVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "AndroidLifecycleScopeProvider.from(\n    this)");
        Object a2 = single.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a2).mo29920a(new C2685y(new C2479b(this)), C2480c.f6778c);
    }

    /* renamed from: a */
    private final List<String> m9082a(C3524e eVar) {
        return (List) eVar.mo12720d("sentry", "ignoredMessages");
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        boolean z = false;
        long a = C4028a.m13803a(this.f6777c.getPackageManager().getPackageInfo(this.f6777c.getPackageName(), 0));
        boolean contains = f6774W.contains(this.f6777c.getPackageManager().getInstallerPackageName(this.f6777c.getPackageName()));
        C2686z zVar = this.f6776V;
        if (a <= 1 || contains) {
            z = true;
        }
        zVar.mo11725a(z);
        Timber.m44525a((C14102b) this.f6776V);
    }
}
