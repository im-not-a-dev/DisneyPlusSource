package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5312n;
import p163g.p174d.p178b.p193j0.C5285a;
import p163g.p174d.p178b.p193j0.C5288c;
import p163g.p174d.p178b.p193j0.C5291e;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/player/delegates/PreferredAudioAndSubtitleDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "events", "Lcom/bamtech/player/PlayerEvents;", "preferences", "Lcom/bamtech/player/PlayerPreferences;", "(Lcom/bamtech/player/PlayerEvents;Lcom/bamtech/player/PlayerPreferences;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "getPreferences", "()Lcom/bamtech/player/PlayerPreferences;", "onTracksChanged", "", "trackList", "Lcom/bamtech/player/tracks/TrackList;", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.y4 */
/* compiled from: PreferredAudioAndSubtitleDelegate.kt */
public final class C5223y4 implements C5271z3 {

    /* renamed from: U */
    private final C5312n f12573U;

    /* renamed from: c */
    private final C5300m f12574c;

    /* renamed from: g.d.b.g0.y4$a */
    /* compiled from: PreferredAudioAndSubtitleDelegate.kt */
    static final /* synthetic */ class C5224a extends C12879i implements Function1<C5291e, C13145v> {
        C5224a(C5223y4 y4Var) {
            super(1, y4Var);
        }

        /* renamed from: a */
        public final void mo16733a(C5291e eVar) {
            ((C5223y4) this.receiver).mo16732a(eVar);
        }

        public final String getName() {
            return "onTracksChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5223y4.class);
        }

        public final String getSignature() {
            return "onTracksChanged(Lcom/bamtech/player/tracks/TrackList;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16733a((C5291e) obj);
            return C13145v.f29587a;
        }
    }

    public C5223y4(C5300m mVar, C5312n nVar) {
        this.f12574c = mVar;
        this.f12573U = nVar;
        this.f12574c.mo17071u0().mo30192f((Consumer<? super T>) new C5272z4<Object>(new C5224a(this)));
    }

    /* renamed from: a */
    public final void mo16732a(C5291e eVar) {
        List d = eVar.mo16880d();
        C12880j.m40222a((Object) d, "trackList.audioTracks");
        C5285a aVar = (C5285a) C13199w.m40591g(d);
        if (aVar != null) {
            this.f12573U.mo17093b(aVar.mo16860g());
        }
        if (eVar.mo16881e().isEmpty()) {
            this.f12573U.mo17090a(false);
            return;
        }
        C5312n nVar = this.f12573U;
        List e = eVar.mo16881e();
        C12880j.m40222a((Object) e, "trackList.subtitleTracks");
        C5288c cVar = (C5288c) C13199w.m40591g(e);
        nVar.mo17095c(cVar != null ? cVar.mo16862g() : null);
        this.f12573U.mo17090a(true);
    }
}
