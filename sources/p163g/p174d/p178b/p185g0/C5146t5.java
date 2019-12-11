package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.Window;
import java.util.HashSet;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m.C5302b;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0007R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/player/delegates/WakeLockDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "window", "Landroid/view/Window;", "shouldKeepScreenOn", "", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/Window;ZLcom/bamtech/player/PlayerEvents;)V", "locks", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "locks$annotations", "()V", "getLocks", "()Ljava/util/HashSet;", "acquire", "", "tag", "acquireOrRelease", "release", "releaseAll", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.t5 */
/* compiled from: WakeLockDelegate.kt */
public final class C5146t5 implements C5271z3 {

    /* renamed from: U */
    private final Window f12462U;

    /* renamed from: c */
    private final HashSet<String> f12463c = new HashSet<>();

    /* renamed from: g.d.b.g0.t5$a */
    /* compiled from: WakeLockDelegate.kt */
    static final class C5147a<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C5146t5 f12464c;

        C5147a(C5146t5 t5Var) {
            this.f12464c = t5Var;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12464c.mo16645a();
        }
    }

    /* renamed from: g.d.b.g0.t5$b */
    /* compiled from: WakeLockDelegate.kt */
    static final /* synthetic */ class C5148b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5148b f12465c = new C5148b();

        C5148b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16650a(Throwable th) {
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
            mo16650a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t5$c */
    /* compiled from: WakeLockDelegate.kt */
    static final class C5149c<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5146t5 f12466c;

        C5149c(C5146t5 t5Var) {
            this.f12466c = t5Var;
        }

        public final void accept(Object obj) {
            this.f12466c.mo16645a();
        }
    }

    /* renamed from: g.d.b.g0.t5$d */
    /* compiled from: WakeLockDelegate.kt */
    static final /* synthetic */ class C5150d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5150d f12467c = new C5150d();

        C5150d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16651a(Throwable th) {
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
            mo16651a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t5$e */
    /* compiled from: WakeLockDelegate.kt */
    static final class C5151e<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5146t5 f12468c;

        C5151e(C5146t5 t5Var) {
            this.f12468c = t5Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12468c.mo16647a("onPlaybackChanged", bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.t5$f */
    /* compiled from: WakeLockDelegate.kt */
    static final /* synthetic */ class C5152f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5152f f12469c = new C5152f();

        C5152f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16653a(Throwable th) {
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
            mo16653a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t5$g */
    /* compiled from: WakeLockDelegate.kt */
    static final class C5153g<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5146t5 f12470c;

        C5153g(C5146t5 t5Var) {
            this.f12470c = t5Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12470c.mo16647a("onTrickPlayActive", bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.t5$h */
    /* compiled from: WakeLockDelegate.kt */
    static final /* synthetic */ class C5154h extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5154h f12471c = new C5154h();

        C5154h() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16655a(Throwable th) {
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
            mo16655a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t5$i */
    /* compiled from: WakeLockDelegate.kt */
    public static final class C5155i {
        private C5155i() {
        }

        public /* synthetic */ C5155i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5155i(null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, g.d.b.g0.t5$b] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3, types: [g.d.b.g0.t5$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6, types: [g.d.b.g0.t5$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r5v1, types: [g.d.b.g0.t5$h, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r0v9, types: [g.d.b.g0.u5] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r1v0, types: [g.d.b.g0.u5] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r1v1, types: [g.d.b.g0.u5] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r1v2, types: [g.d.b.g0.u5] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5146t5(android.view.Window r3, boolean r4, p163g.p174d.p178b.C5300m r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.f12462U = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f12463c = r3
            if (r4 == 0) goto L_0x006e
            io.reactivex.Observable r3 = r5.mo16957M()
            g.d.b.g0.t5$a r4 = new g.d.b.g0.t5$a
            r4.<init>(r2)
            g.d.b.g0.t5$b r0 = p163g.p174d.p178b.p185g0.C5146t5.C5148b.f12465c
            if (r0 == 0) goto L_0x0021
            g.d.b.g0.u5 r1 = new g.d.b.g0.u5
            r1.<init>(r0)
            r0 = r1
        L_0x0021:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo30157a(r4, r0)
            io.reactivex.Observable r3 = r5.mo17019c0()
            g.d.b.g0.t5$c r4 = new g.d.b.g0.t5$c
            r4.<init>(r2)
            g.d.b.g0.t5$d r0 = p163g.p174d.p178b.p185g0.C5146t5.C5150d.f12467c
            if (r0 == 0) goto L_0x0039
            g.d.b.g0.u5 r1 = new g.d.b.g0.u5
            r1.<init>(r0)
            r0 = r1
        L_0x0039:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo30157a(r4, r0)
            io.reactivex.Observable r3 = r5.mo17014b0()
            g.d.b.g0.t5$e r4 = new g.d.b.g0.t5$e
            r4.<init>(r2)
            g.d.b.g0.t5$f r0 = p163g.p174d.p178b.p185g0.C5146t5.C5152f.f12469c
            if (r0 == 0) goto L_0x0051
            g.d.b.g0.u5 r1 = new g.d.b.g0.u5
            r1.<init>(r0)
            r0 = r1
        L_0x0051:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo30157a(r4, r0)
            io.reactivex.Observable r3 = r5.mo16942E0()
            g.d.b.g0.t5$g r4 = new g.d.b.g0.t5$g
            r4.<init>(r2)
            g.d.b.g0.t5$h r5 = p163g.p174d.p178b.p185g0.C5146t5.C5154h.f12471c
            if (r5 == 0) goto L_0x0069
            g.d.b.g0.u5 r0 = new g.d.b.g0.u5
            r0.<init>(r5)
            r5 = r0
        L_0x0069:
            io.reactivex.functions.Consumer r5 = (p520io.reactivex.functions.Consumer) r5
            r3.mo30157a(r4, r5)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p185g0.C5146t5.<init>(android.view.Window, boolean, g.d.b.m):void");
    }

    /* renamed from: a */
    public final void mo16647a(String str, boolean z) {
        if (z) {
            mo16646a(str);
        } else {
            mo16648b(str);
        }
    }

    /* renamed from: b */
    public final void mo16648b(String str) {
        this.f12463c.remove(str);
        Timber.m44529c("WakeLock released %s #locks=%d", str, Integer.valueOf(this.f12463c.size()));
        if (this.f12463c.isEmpty()) {
            this.f12462U.clearFlags(128);
        }
    }

    /* renamed from: a */
    public final void mo16646a(String str) {
        this.f12463c.add(str);
        this.f12462U.addFlags(128);
        Timber.m44529c("WakeLock added %s #locks=%d", str, Integer.valueOf(this.f12463c.size()));
    }

    /* renamed from: a */
    public final void mo16645a() {
        this.f12462U.clearFlags(128);
        this.f12463c.clear();
        Timber.m44529c("WakeLock releaseAll", new Object[0]);
    }
}
