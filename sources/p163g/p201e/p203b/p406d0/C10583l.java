package p163g.p201e.p203b.p406d0;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/splash/SplashViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/splash/SplashViewModel$State;", "splashListener", "Lcom/bamtechmedia/dominguez/splash/SplashListener;", "(Lcom/bamtechmedia/dominguez/splash/SplashListener;)V", "animationCompleted", "", "getAnimationCompleted", "()Z", "setAnimationCompleted", "(Z)V", "animationProgress", "", "getAnimationProgress", "()F", "setAnimationProgress", "(F)V", "onAnimationComplete", "", "Companion", "State", "splash_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d0.l */
/* compiled from: SplashViewModel.kt */
public final class C10583l extends C5741g<C10587d> {

    /* renamed from: a */
    private float f25026a;

    /* renamed from: b */
    private boolean f25027b;

    /* renamed from: c */
    private final C10582k f25028c;

    /* renamed from: g.e.b.d0.l$a */
    /* compiled from: SplashViewModel.kt */
    static final class C10584a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C10583l f25029a;

        C10584a(C10583l lVar) {
            this.f25029a = lVar;
        }

        public final void run() {
            this.f25029a.createState(new C10587d(true));
        }
    }

    /* renamed from: g.e.b.d0.l$b */
    /* compiled from: SplashViewModel.kt */
    static final class C10585b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C10585b f25030c = new C10585b();

        C10585b() {
        }

        /* renamed from: a */
        public final void mo27460a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo27460a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.d0.l$c */
    /* compiled from: SplashViewModel.kt */
    public static final class C10586c {
        private C10586c() {
        }

        public /* synthetic */ C10586c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d0.l$d */
    /* compiled from: SplashViewModel.kt */
    public static final class C10587d {

        /* renamed from: a */
        private final boolean f25031a;

        public C10587d(boolean z) {
            this.f25031a = z;
        }

        /* renamed from: a */
        public final boolean mo27461a() {
            return this.f25031a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10587d) {
                    if (this.f25031a == ((C10587d) obj).f25031a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f25031a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(displayLoader=");
            sb.append(this.f25031a);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        new C10586c(null);
    }

    public C10583l(C10582k kVar) {
        super(null, 1, null);
        this.f25028c = kVar;
        Completable b = Completable.m38158b(5, TimeUnit.SECONDS, C11934b.m38498a());
        C12880j.m40222a((Object) b, "Completable.timer(DISPLA…Schedulers.computation())");
        Object a = b.mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C10584a(this), C10585b.f25030c);
    }

    /* renamed from: y */
    public final float mo27458y() {
        return this.f25026a;
    }

    /* renamed from: z */
    public final void mo27459z() {
        if (!this.f25027b) {
            this.f25027b = true;
            this.f25026a = 1.0f;
            this.f25028c.mo18762l();
        }
    }

    /* renamed from: a */
    public final void mo27457a(float f) {
        this.f25026a = f;
    }
}
