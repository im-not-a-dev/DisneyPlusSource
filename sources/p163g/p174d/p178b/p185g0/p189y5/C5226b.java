package p163g.p174d.p178b.p185g0.p189y5;

import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p179a0.C4831f;
import p163g.p174d.p178b.p185g0.C5271z3;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J \u0010\u0012\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00140\u0010J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u001c\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0014H\u0002R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/player/delegates/trickplay/ThumbnailDownloadManager;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "events", "Lcom/bamtech/player/PlayerEvents;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtech/player/PlayerEvents;Lio/reactivex/Scheduler;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "disposables$annotations", "()V", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "add", "", "observable", "Lio/reactivex/Single;", "Lcom/bamtech/player/bif/BifSpec;", "addAll", "observables", "", "clear", "onBifSpec", "spec", "onBifSpecs", "list", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.y5.b */
/* compiled from: ThumbnailDownloadManager.kt */
public final class C5226b implements C5271z3 {

    /* renamed from: U */
    private final C5300m f12576U;

    /* renamed from: V */
    private final C11969r f12577V;

    /* renamed from: c */
    private final CompositeDisposable f12578c = new CompositeDisposable();

    /* renamed from: g.d.b.g0.y5.b$a */
    /* compiled from: ThumbnailDownloadManager.kt */
    static final /* synthetic */ class C5227a extends C12879i implements Function1<C4831f, C13145v> {
        C5227a(C5226b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo16740a(C4831f fVar) {
            ((C5226b) this.receiver).m17571a(fVar);
        }

        public final String getName() {
            return "onBifSpec";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5226b.class);
        }

        public final String getSignature() {
            return "onBifSpec(Lcom/bamtech/player/bif/BifSpec;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16740a((C4831f) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.b$b */
    /* compiled from: ThumbnailDownloadManager.kt */
    static final /* synthetic */ class C5228b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5228b f12579c = new C5228b();

        C5228b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16741a(Throwable th) {
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
            mo16741a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.b$c */
    /* compiled from: ThumbnailDownloadManager.kt */
    static final /* synthetic */ class C5229c extends C12879i implements Function1<List<? extends Single<C4831f>>, C13145v> {
        C5229c(C5226b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo16742a(List<? extends Single<C4831f>> list) {
            ((C5226b) this.receiver).m17574a(list);
        }

        public final String getName() {
            return "onBifSpecs";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5226b.class);
        }

        public final String getSignature() {
            return "onBifSpecs(Ljava/util/List;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16742a((List) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.b$d */
    /* compiled from: ThumbnailDownloadManager.kt */
    static final /* synthetic */ class C5230d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5230d f12580c = new C5230d();

        C5230d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16743a(Throwable th) {
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
            mo16743a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C5226b(C5300m mVar, C11969r rVar) {
        this.f12576U = mVar;
        this.f12577V = rVar;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [g.d.b.g0.y5.b$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.d.b.g0.y5.c] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17575b(p520io.reactivex.Single<p163g.p174d.p178b.p179a0.C4831f> r5) {
        /*
            r4 = this;
            io.reactivex.disposables.CompositeDisposable r0 = r4.f12578c
            io.reactivex.r r1 = r4.f12577V
            io.reactivex.Single r5 = r5.mo30220b(r1)
            io.reactivex.r r1 = r4.f12577V
            io.reactivex.Single r5 = r5.mo30211a(r1)
            g.d.b.g0.y5.b$a r1 = new g.d.b.g0.y5.b$a
            r1.<init>(r4)
            g.d.b.g0.y5.c r2 = new g.d.b.g0.y5.c
            r2.<init>(r1)
            g.d.b.g0.y5.b$b r1 = p163g.p174d.p178b.p185g0.p189y5.C5226b.C5228b.f12579c
            if (r1 == 0) goto L_0x0022
            g.d.b.g0.y5.c r3 = new g.d.b.g0.y5.c
            r3.<init>(r1)
            r1 = r3
        L_0x0022:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r5 = r5.mo30214a(r2, r1)
            r0.mo30250b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p185g0.p189y5.C5226b.m17575b(io.reactivex.Single):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, g.d.b.g0.y5.b$d] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.d.b.g0.y5.c] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16739a(p520io.reactivex.Single<java.util.List<p520io.reactivex.Single<p163g.p174d.p178b.p179a0.C4831f>>> r5) {
        /*
            r4 = this;
            r4.mo16738a()
            io.reactivex.disposables.CompositeDisposable r0 = r4.f12578c
            io.reactivex.r r1 = r4.f12577V
            io.reactivex.Single r5 = r5.mo30220b(r1)
            io.reactivex.r r1 = r4.f12577V
            io.reactivex.Single r5 = r5.mo30211a(r1)
            g.d.b.g0.y5.b$c r1 = new g.d.b.g0.y5.b$c
            r1.<init>(r4)
            g.d.b.g0.y5.c r2 = new g.d.b.g0.y5.c
            r2.<init>(r1)
            g.d.b.g0.y5.b$d r1 = p163g.p174d.p178b.p185g0.p189y5.C5226b.C5230d.f12580c
            if (r1 == 0) goto L_0x0025
            g.d.b.g0.y5.c r3 = new g.d.b.g0.y5.c
            r3.<init>(r1)
            r1 = r3
        L_0x0025:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r5 = r5.mo30214a(r2, r1)
            r0.mo30250b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p185g0.p189y5.C5226b.mo16739a(io.reactivex.Single):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17571a(C4831f fVar) {
        this.f12576U.mo16989a(fVar);
    }

    /* renamed from: a */
    public final void mo16738a() {
        this.f12576U.mo17025e();
        this.f12578c.mo30247a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17574a(List<? extends Single<C4831f>> list) {
        for (Single b : list) {
            m17575b(b);
        }
    }
}
