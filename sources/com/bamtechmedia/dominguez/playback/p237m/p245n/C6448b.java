package com.bamtechmedia.dominguez.playback.p237m.p245n;

import com.bamtechmedia.dominguez.core.utils.C5861q;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6331j;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorHandler;", "", "playbackErrorMapper", "Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorMapper;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "config", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "(Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorMapper;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;)V", "handleError", "", "throwable", "", "observePlaybackErrors", "events", "Lcom/bamtech/player/PlayerEvents;", "scopeProvider", "Lcom/uber/autodispose/ScopeProvider;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.n.b */
/* compiled from: PlaybackErrorHandler.kt */
public final class C6448b {

    /* renamed from: a */
    private final C6453d f14634a;

    /* renamed from: b */
    private final C7547h f14635b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6266a f14636c;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.n.b$a */
    /* compiled from: PlaybackErrorHandler.kt */
    static final class C6449a<T> implements C11952h<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6448b f14637c;

        C6449a(C6448b bVar) {
            this.f14637c = bVar;
        }

        /* renamed from: a */
        public final boolean test(Throwable th) {
            return this.f14637c.f14636c.mo18850a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.n.b$b */
    /* compiled from: PlaybackErrorHandler.kt */
    static final /* synthetic */ class C6450b extends C12879i implements Function1<Throwable, C13145v> {
        C6450b(C6448b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo19105a(Throwable th) {
            ((C6448b) this.receiver).mo19103a(th);
        }

        public final String getName() {
            return "handleError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C6448b.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19105a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.n.b$c */
    /* compiled from: PlaybackErrorHandler.kt */
    static final class C6451c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6451c f14638c = new C6451c();

        C6451c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C5861q.m18906a(null, 1, null);
        }
    }

    public C6448b(C6453d dVar, C7547h hVar, C6266a aVar) {
        this.f14634a = dVar;
        this.f14635b = hVar;
        this.f14636c = aVar;
    }

    /* renamed from: a */
    public final void mo19102a(C5300m mVar, C11790c0 c0Var) {
        Observable a = mVar.mo17024d0().mo30150a((C11952h<? super T>) new C6449a<Object>(this));
        C12880j.m40222a((Object) a, "events.onPlaybackExcepti…dDisplayErrorDialog(it) }");
        Object a2 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(c0Var));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C6452c(new C6450b(this)), C6451c.f14638c);
    }

    /* renamed from: a */
    public final void mo19103a(Throwable th) {
        C6447a a = this.f14634a.mo19107a(th);
        C7547h hVar = this.f14635b;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C6327f.playback_error_dialog);
        aVar.mo20482h(Integer.valueOf(C6331j.FullscreenDialog_WithAppBackground));
        aVar.mo20485i(a.mo19098c());
        aVar.mo20475d(a.mo19097b());
        aVar.mo20481g(a.mo19096a());
        hVar.mo20488a(aVar.mo20465a());
    }
}
