package com.bamtechmedia.dominguez.playback.p237m;

import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6288c;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6289d;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6322b;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6323c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6502a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6506e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/StateMediator;", "", "viewModel", "Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "(Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;)V", "areWaitingToShowRemainderOfRating", "", "getAreWaitingToShowRemainderOfRating", "()Z", "isRatingOverlayVisible", "isTrackSelectionOverlayLaunching", "isTrackSelectionOverlayVisible", "isUpNextDialogVisible", "isUpNextActionBlocked", "action", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "shouldReShowRating", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.c */
/* compiled from: StateMediator.kt */
public final class C6338c {

    /* renamed from: a */
    private final C6342f f14440a;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.c$a */
    /* compiled from: StateMediator.kt */
    public static final class C6339a {
        private C6339a() {
        }

        public /* synthetic */ C6339a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6339a(null);
    }

    public C6338c(C6342f fVar) {
        this.f14440a = fVar;
    }

    /* renamed from: e */
    private final boolean m19922e() {
        C6336a aVar = (C6336a) this.f14440a.getCurrentState();
        return (aVar != null ? aVar.mo18962i() : null) instanceof C6322b;
    }

    /* renamed from: f */
    private final boolean m19923f() {
        C6336a aVar = (C6336a) this.f14440a.getCurrentState();
        return (aVar != null ? aVar.mo18962i() : null) instanceof C6323c;
    }

    /* renamed from: a */
    public final boolean mo18972a() {
        C6336a aVar = (C6336a) this.f14440a.getCurrentState();
        return Intrinsics.areEqual((Object) aVar != null ? aVar.mo18953b() : null, (Object) C6288c.f14357a);
    }

    /* renamed from: b */
    public final boolean mo18974b() {
        C6336a aVar = (C6336a) this.f14440a.getCurrentState();
        return (aVar != null ? aVar.mo18953b() : null) instanceof C6289d;
    }

    /* renamed from: c */
    public final boolean mo18975c() {
        C6336a aVar = (C6336a) this.f14440a.getCurrentState();
        return (aVar != null ? aVar.mo18963j() : null) instanceof C6506e;
    }

    /* renamed from: d */
    public final boolean mo18976d() {
        return mo18972a() && !m19923f() && !m19922e();
    }

    /* renamed from: a */
    public final boolean mo18973a(C6501b bVar) {
        return m19923f() && (bVar instanceof C6502a);
    }
}
