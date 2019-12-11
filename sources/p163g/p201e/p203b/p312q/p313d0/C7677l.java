package p163g.p201e.p203b.p312q.p313d0;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7292e;
import p163g.p201e.p203b.p312q.C7689j;
import p163g.p201e.p203b.p312q.C7718y;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0013\u001a\u00020\u0014*\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/tab/TabViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "router", "Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;", "serviceAvailabilityState", "Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;", "deepLinkRouter", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkRouter;", "(Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;Lcom/bamtechmedia/dominguez/deeplink/DeepLinkRouter;)V", "observeServiceAvailableStream", "", "whenEnabled", "Lkotlin/Function0;", "startDeepLink", "tab", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "deepLink", "Lokhttp3/HttpUrl;", "startTab", "isExcludedFromPortabilityCheck", "", "globalNav_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.d0.l */
/* compiled from: TabViewModel.kt */
public final class C7677l extends C5733a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7673i f16716a;

    /* renamed from: b */
    private final C7930a f16717b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7292e f16718c;

    /* renamed from: g.e.b.q.d0.l$a */
    /* compiled from: TabViewModel.kt */
    static final class C7678a<T> implements Consumer<Boolean> {

        /* renamed from: U */
        final /* synthetic */ Function0 f16719U;

        /* renamed from: c */
        final /* synthetic */ C7677l f16720c;

        C7678a(C7677l lVar, Function0 function0) {
            this.f16720c = lVar;
            this.f16719U = function0;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C12880j.m40222a((Object) bool, "enabled");
            if (bool.booleanValue()) {
                this.f16719U.invoke();
            } else {
                this.f16720c.f16716a.mo20589a();
            }
        }
    }

    /* renamed from: g.e.b.q.d0.l$b */
    /* compiled from: TabViewModel.kt */
    static final /* synthetic */ class C7679b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7679b f16721c = new C7679b();

        C7679b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20596a(Throwable th) {
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
            mo20596a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.q.d0.l$c */
    /* compiled from: TabViewModel.kt */
    static final class C7680c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ Fragment f16722U;

        /* renamed from: V */
        final /* synthetic */ HttpUrl f16723V;

        /* renamed from: c */
        final /* synthetic */ C7677l f16724c;

        C7680c(C7677l lVar, Fragment fragment, HttpUrl httpUrl) {
            this.f16724c = lVar;
            this.f16722U = fragment;
            this.f16723V = httpUrl;
            super(0);
        }

        public final void invoke() {
            C7292e a = this.f16724c.f16718c;
            Fragment fragment = this.f16722U;
            C12880j.m40222a((Object) fragment, "rootFragment");
            a.mo20099a(fragment, this.f16723V);
        }
    }

    /* renamed from: g.e.b.q.d0.l$d */
    /* compiled from: TabViewModel.kt */
    static final class C7681d extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C7689j f16725U;

        /* renamed from: c */
        final /* synthetic */ C7677l f16726c;

        C7681d(C7677l lVar, C7689j jVar) {
            this.f16726c = lVar;
            this.f16725U = jVar;
            super(0);
        }

        public final void invoke() {
            this.f16726c.f16716a.mo20590a(this.f16725U);
        }
    }

    public C7677l(C7673i iVar, C7930a aVar, C7292e eVar) {
        this.f16716a = iVar;
        this.f16717b = aVar;
        this.f16718c = eVar;
    }

    /* renamed from: b */
    private final boolean m22691b(C7689j jVar) {
        return jVar.mo20604Z() == C7718y.menu_downloads;
    }

    /* renamed from: a */
    public final void mo20593a(C7689j jVar) {
        if (m22691b(jVar)) {
            this.f16716a.mo20590a(jVar);
        } else {
            m22689a((Function0<C13145v>) new C7681d<C13145v>(this, jVar));
        }
    }

    /* renamed from: a */
    public final void mo20594a(C7689j jVar, HttpUrl httpUrl) {
        Fragment fragment = (Fragment) jVar.mo20603Y().newInstance();
        C12880j.m40222a((Object) fragment, "it");
        fragment.setArguments(jVar.mo20602X());
        if (m22691b(jVar)) {
            C7292e eVar = this.f16718c;
            C12880j.m40222a((Object) fragment, "rootFragment");
            eVar.mo20099a(fragment, httpUrl);
            return;
        }
        m22689a((Function0<C13145v>) new C7680c<C13145v>(this, fragment, httpUrl));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [g.e.b.q.d0.l$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [g.e.b.q.d0.m] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22689a(kotlin.jvm.functions.Function0<kotlin.C13145v> r4) {
        /*
            r3 = this;
            g.e.b.y.g.a r0 = r3.f16717b
            io.reactivex.Observable r0 = r0.mo19243b()
            g.n.a.c0 r1 = r3.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30161a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.a0 r0 = (p163g.p503n.p504a.C11786a0) r0
            g.e.b.q.d0.l$a r1 = new g.e.b.q.d0.l$a
            r1.<init>(r3, r4)
            g.e.b.q.d0.l$b r4 = p163g.p201e.p203b.p312q.p313d0.C7677l.C7679b.f16721c
            if (r4 == 0) goto L_0x0028
            g.e.b.q.d0.m r2 = new g.e.b.q.d0.m
            r2.<init>(r4)
            r4 = r2
        L_0x0028:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r0.mo29915a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p312q.p313d0.C7677l.m22689a(kotlin.jvm.functions.Function0):void");
    }
}
