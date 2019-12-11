package com.bamtechmedia.dominguez.playback.p237m.p246o.p248d;

import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/events/controls/HideAndLockControlsEvent;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "defaultEngine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "(Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;)V", "process", "Lio/reactivex/Observable;", "currentState", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.o.d.b */
/* compiled from: HideAndLockControlsEvent.kt */
public final class C6470b implements C5742a<C6336a> {

    /* renamed from: a */
    private final SDK4ExoPlaybackEngine f14665a;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.d.b$a */
    /* compiled from: HideAndLockControlsEvent.kt */
    public static final class C6471a {
        private C6471a() {
        }

        public /* synthetic */ C6471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6471a(null);
    }

    public C6470b(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        this.f14665a = sDK4ExoPlaybackEngine;
    }

    public /* synthetic */ C6470b(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            sDK4ExoPlaybackEngine = null;
        }
        this(sDK4ExoPlaybackEngine);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r2 != null) goto L_0x000b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p520io.reactivex.Observable<com.bamtechmedia.dominguez.playback.p237m.C6336a> mo17627a(com.bamtechmedia.dominguez.playback.p237m.C6336a r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0009
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r2 = r2.mo18955d()
            if (r2 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r2 = r1.f14665a
        L_0x000b:
            if (r2 == 0) goto L_0x0018
            g.d.b.m r2 = r2.mo7537b()
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = "startupControlsLockout"
            r2.mo16995a(r0)
        L_0x0018:
            io.reactivex.Observable r2 = p520io.reactivex.Observable.m38314m()
            java.lang.String r0 = "Observable.empty()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p246o.p248d.C6470b.mo17627a(com.bamtechmedia.dominguez.playback.m.a):io.reactivex.Observable");
    }
}
