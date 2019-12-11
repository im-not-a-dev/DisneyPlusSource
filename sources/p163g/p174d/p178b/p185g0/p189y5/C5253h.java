package p163g.p174d.p178b.p185g0.p189y5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.io.File;
import java.util.Collection;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p163g.p174d.p178b.p179a0.C4817a;
import p163g.p174d.p178b.p179a0.C4825c;
import p163g.p174d.p178b.p179a0.C4829e;
import p163g.p174d.p178b.p179a0.C4831f;
import p163g.p174d.p178b.p185g0.C5271z3;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0007J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020'H\u0007J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, mo31007d2 = {"Lcom/bamtech/player/delegates/trickplay/TrickPlayViewDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "trickPlayView", "Lcom/bamtech/player/delegates/trickplay/TrickPlayView;", "factory", "Lcom/bamtech/player/bif/BifFactory;", "manager", "Lcom/bamtech/player/bif/BifBitmapManager;", "player", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/delegates/trickplay/TrickPlayView;Lcom/bamtech/player/bif/BifFactory;Lcom/bamtech/player/bif/BifBitmapManager;Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "getFactory", "()Lcom/bamtech/player/bif/BifFactory;", "getManager", "()Lcom/bamtech/player/bif/BifBitmapManager;", "getPlayer", "()Lcom/bamtech/player/VideoPlayer;", "getTrickPlayView", "()Lcom/bamtech/player/delegates/trickplay/TrickPlayView;", "onBifFile", "", "spec", "Lcom/bamtech/player/bif/BifSpec;", "onBitmap", "bitmap", "Landroid/graphics/Bitmap;", "onLifecycleStart", "state", "Lcom/bamtech/player/PlayerEvents$LifecycleState;", "onLifecycleStop", "onPlaybackRateChanged", "rate", "", "onTrickPlayActive", "trickPlayActive", "", "onTrickPlayAvailable", "available", "onTrickPlayTimeChanged", "time", "", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.y5.h */
/* compiled from: TrickPlayViewDelegate.kt */
public final class C5253h implements C5271z3 {
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final C4831f f12615X;

    /* renamed from: Y */
    public static final C5265l f12616Y = new C5265l(null);

    /* renamed from: U */
    private final C4829e f12617U;

    /* renamed from: V */
    private final C4817a f12618V;

    /* renamed from: W */
    private final C5300m f12619W;

    /* renamed from: c */
    private final C5252g f12620c;

    /* renamed from: g.d.b.g0.y5.h$a */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5254a extends C12879i implements Function1<Bitmap, C13145v> {
        C5254a(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16783a(Bitmap bitmap) {
            ((C5253h) this.receiver).mo16777a(bitmap);
        }

        public final String getName() {
            return "onBitmap";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onBitmap(Landroid/graphics/Bitmap;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16783a((Bitmap) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$b */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5255b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5255b f12621c = new C5255b();

        C5255b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16784a(Throwable th) {
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
            mo16784a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$c */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5256c extends C12879i implements Function1<C4831f, C13145v> {
        C5256c(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16785a(C4831f fVar) {
            ((C5253h) this.receiver).mo16778a(fVar);
        }

        public final String getName() {
            return "onBifFile";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onBifFile(Lcom/bamtech/player/bif/BifSpec;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16785a((C4831f) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$d */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5257d extends C12879i implements Function1<Boolean, C13145v> {
        C5257d(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16786a(boolean z) {
            ((C5253h) this.receiver).mo16782b(z);
        }

        public final String getName() {
            return "onTrickPlayAvailable";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onTrickPlayAvailable(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16786a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$e */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5258e extends C12879i implements Function1<Boolean, C13145v> {
        C5258e(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16787a(boolean z) {
            ((C5253h) this.receiver).mo16780a(z);
        }

        public final String getName() {
            return "onTrickPlayActive";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onTrickPlayActive(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16787a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$f */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5259f extends C12879i implements Function1<Long, C13145v> {
        C5259f(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16788a(long j) {
            ((C5253h) this.receiver).mo16776a(j);
        }

        public final String getName() {
            return "onTrickPlayTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onTrickPlayTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16788a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$g */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5260g extends C12879i implements Function1<Long, C13145v> {
        C5260g(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16789a(long j) {
            ((C5253h) this.receiver).mo16776a(j);
        }

        public final String getName() {
            return "onTrickPlayTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onTrickPlayTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16789a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$h */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5261h extends C12879i implements Function1<C5302b, C13145v> {
        C5261h(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16790a(C5302b bVar) {
            ((C5253h) this.receiver).mo16779a(bVar);
        }

        public final String getName() {
            return "onLifecycleStart";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onLifecycleStart(Lcom/bamtech/player/PlayerEvents$LifecycleState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16790a((C5302b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$i */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5262i extends C12879i implements Function1<C5302b, C13145v> {
        C5262i(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16791a(C5302b bVar) {
            ((C5253h) this.receiver).mo16781b(bVar);
        }

        public final String getName() {
            return "onLifecycleStop";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onLifecycleStop(Lcom/bamtech/player/PlayerEvents$LifecycleState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16791a((C5302b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$j */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5263j extends C12879i implements Function1<Boolean, C13145v> {
        C5263j(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16792a(boolean z) {
            ((C5253h) this.receiver).mo16780a(z);
        }

        public final String getName() {
            return "onTrickPlayActive";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onTrickPlayActive(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16792a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$k */
    /* compiled from: TrickPlayViewDelegate.kt */
    static final /* synthetic */ class C5264k extends C12879i implements Function1<Integer, C13145v> {
        C5264k(C5253h hVar) {
            super(1, hVar);
        }

        /* renamed from: a */
        public final void mo16793a(int i) {
            ((C5253h) this.receiver).mo16775a(i);
        }

        public final String getName() {
            return "onPlaybackRateChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5253h.class);
        }

        public final String getSignature() {
            return "onPlaybackRateChanged(I)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16793a(((Number) obj).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.h$l */
    /* compiled from: TrickPlayViewDelegate.kt */
    public static final class C5265l {
        private C5265l() {
        }

        /* renamed from: a */
        public final C4831f mo16794a() {
            return C5253h.f12615X;
        }

        public /* synthetic */ C5265l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C4831f fVar = new C4831f("", 0, Integer.MAX_VALUE, 0, 0);
        f12615X = fVar;
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [g.d.b.g0.y5.h$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r5v1, types: [g.d.b.g0.y5.i] */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5253h(p163g.p174d.p178b.p185g0.p189y5.C5252g r1, p163g.p174d.p178b.p179a0.C4829e r2, p163g.p174d.p178b.p179a0.C4817a r3, p163g.p174d.p178b.C5326w r4, p163g.p174d.p178b.C5300m r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f12620c = r1
            r0.f12617U = r2
            r0.f12618V = r3
            r0.f12619W = r5
            g.d.b.g0.y5.g r1 = r0.f12620c
            boolean r1 = r1.mo16770a()
            if (r1 == 0) goto L_0x00fc
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo17062q()
            io.reactivex.r r2 = p520io.reactivex.p525e0.C11934b.m38500b()
            io.reactivex.Observable r1 = r1.mo30151a(r2)
            g.d.b.g0.y5.h$c r2 = new g.d.b.g0.y5.h$c
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo16944F0()
            g.d.b.g0.y5.h$d r2 = new g.d.b.g0.y5.h$d
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo17067s0()
            g.d.b.g0.y5.h$e r2 = new g.d.b.g0.y5.h$e
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo17065r0()
            g.d.b.g0.y5.h$f r2 = new g.d.b.g0.y5.h$f
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo16946G0()
            g.d.b.g0.y5.h$g r2 = new g.d.b.g0.y5.h$g
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo16955L()
            g.d.b.g0.y5.h$h r2 = new g.d.b.g0.y5.h$h
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo16957M()
            g.d.b.g0.y5.h$i r2 = new g.d.b.g0.y5.h$i
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo16942E0()
            g.d.b.g0.y5.h$j r2 = new g.d.b.g0.y5.h$j
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            io.reactivex.Observable r1 = r1.mo17046i0()
            g.d.b.g0.y5.h$k r2 = new g.d.b.g0.y5.h$k
            r2.<init>(r0)
            g.d.b.g0.y5.i r3 = new g.d.b.g0.y5.i
            r3.<init>(r2)
            r1.mo30192f(r3)
            g.d.b.m r1 = r0.f12619W
            g.d.b.a0.a r2 = r0.f12618V
            io.reactivex.Observable r2 = r2.mo16208c()
            io.reactivex.r r3 = p520io.reactivex.p525e0.C11934b.m38498a()
            io.reactivex.Observable r2 = r2.mo30171b(r3)
            io.reactivex.r r3 = p520io.reactivex.p527w.p529c.C11992a.m38600a()
            io.reactivex.Observable r2 = r2.mo30151a(r3)
            g.d.b.g0.y5.h$a r3 = new g.d.b.g0.y5.h$a
            r3.<init>(r0)
            g.d.b.g0.y5.i r4 = new g.d.b.g0.y5.i
            r4.<init>(r3)
            g.d.b.g0.y5.h$b r3 = p163g.p174d.p178b.p185g0.p189y5.C5253h.C5255b.f12621c
            if (r3 == 0) goto L_0x00f2
            g.d.b.g0.y5.i r5 = new g.d.b.g0.y5.i
            r5.<init>(r3)
            r3 = r5
        L_0x00f2:
            io.reactivex.functions.Consumer r3 = (p520io.reactivex.functions.Consumer) r3
            io.reactivex.disposables.Disposable r2 = r2.mo30157a(r4, r3)
            r1.mo16994a(r2)
            goto L_0x0104
        L_0x00fc:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "TrickPlay is disabled because Views do not exist"
            p686n.p687a.Timber.m44529c(r2, r1)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p185g0.p189y5.C5253h.<init>(g.d.b.g0.y5.g, g.d.b.a0.e, g.d.b.a0.a, g.d.b.w, g.d.b.m):void");
    }

    /* renamed from: b */
    public final void mo16782b(boolean z) {
        if (!z) {
            this.f12620c.mo16771b();
        }
    }

    /* renamed from: a */
    public final void mo16778a(C4831f fVar) {
        if (!Intrinsics.areEqual((Object) fVar, (Object) f12615X)) {
            if (!(fVar.mo16240b().length() == 0)) {
                this.f12618V.mo16206a((Collection<C4825c>) this.f12617U.mo16236a(new File(fVar.mo16240b()), fVar.mo16241c(), fVar.mo16239a()));
                return;
            }
        }
        this.f12618V.mo16204a();
    }

    /* renamed from: b */
    public final void mo16781b(C5302b bVar) {
        this.f12618V.mo16210e();
        this.f12620c.mo16771b();
    }

    /* renamed from: a */
    public final void mo16777a(Bitmap bitmap) {
        this.f12620c.mo16767a(bitmap);
    }

    /* renamed from: a */
    public final void mo16776a(long j) {
        this.f12620c.mo16772b(j);
        this.f12618V.mo16205a(j);
    }

    /* renamed from: a */
    public final void mo16780a(boolean z) {
        this.f12620c.mo16769a(z);
    }

    /* renamed from: a */
    public final void mo16775a(int i) {
        this.f12620c.mo16766a(i);
    }

    /* renamed from: a */
    public final void mo16779a(C5302b bVar) {
        this.f12618V.mo16209d();
    }
}
