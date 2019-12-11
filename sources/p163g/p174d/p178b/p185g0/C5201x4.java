package p163g.p174d.p178b.p185g0;

import android.net.Uri;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/player/delegates/PreSeekDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "player", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "getPlayer", "()Lcom/bamtech/player/VideoPlayer;", "timeInMilliseconds", "", "timeInMilliseconds$annotations", "()V", "getTimeInMilliseconds", "()J", "setTimeInMilliseconds", "(J)V", "onNewMedia", "", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.x4 */
/* compiled from: PreSeekDelegate.kt */
public final class C5201x4 implements C5271z3 {

    /* renamed from: U */
    private final C5326w f12527U;

    /* renamed from: V */
    private final C5300m f12528V;

    /* renamed from: c */
    private long f12529c = -1;

    /* renamed from: g.d.b.g0.x4$a */
    /* compiled from: PreSeekDelegate.kt */
    static final class C5202a<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C5201x4 f12530c;

        C5202a(C5201x4 x4Var) {
            this.f12530c = x4Var;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f12530c.mo16698a(l.longValue());
        }
    }

    /* renamed from: g.d.b.g0.x4$b */
    /* compiled from: PreSeekDelegate.kt */
    static final class C5203b<T> implements Consumer<Uri> {

        /* renamed from: c */
        final /* synthetic */ C5201x4 f12531c;

        C5203b(C5201x4 x4Var) {
            this.f12531c = x4Var;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f12531c.mo16697a();
        }
    }

    public C5201x4(C5326w wVar, C5300m mVar) {
        this.f12527U = wVar;
        this.f12528V = mVar;
        this.f12528V.mo17053l0().mo30192f((Consumer<? super T>) new C5202a<Object>(this));
        this.f12528V.mo16973U().mo30192f((Consumer<? super T>) new C5203b<Object>(this));
    }

    /* renamed from: a */
    public final void mo16698a(long j) {
        this.f12529c = j;
    }

    /* renamed from: a */
    public final void mo16697a() {
        long j = this.f12529c;
        if (j != -1) {
            this.f12527U.mo7602a(j);
            this.f12529c = -1;
        }
    }
}
