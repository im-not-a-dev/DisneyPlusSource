package com.bamtechmedia.dominguez.playback.p237m;

import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6287b;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6321a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6504c;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.bamtechmedia.dominguez.playback.m.a */
/* compiled from: PlaybackState.kt */
public final class C6336a {

    /* renamed from: a */
    private final SDK4ExoPlaybackEngine f14423a;

    /* renamed from: b */
    private final C3693o f14424b;

    /* renamed from: c */
    private final C3693o f14425c;

    /* renamed from: d */
    private final C6285b f14426d;

    /* renamed from: e */
    private final C6320f f14427e;

    /* renamed from: f */
    private final boolean f14428f;

    /* renamed from: g */
    private final Throwable f14429g;

    /* renamed from: h */
    private final boolean f14430h;

    /* renamed from: i */
    private final int f14431i;

    /* renamed from: j */
    private final C6501b f14432j;

    /* renamed from: k */
    private final C6341e f14433k;

    /* renamed from: l */
    private final PlaybackContext f14434l;

    /* renamed from: m */
    private final C6337b f14435m;

    /* renamed from: n */
    private final boolean f14436n;

    /* renamed from: o */
    private final boolean f14437o;

    public C6336a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, C3693o oVar2, C6285b bVar, C6320f fVar, boolean z, Throwable th, boolean z2, int i, C6501b bVar2, C6341e eVar, PlaybackContext playbackContext, C6337b bVar3, boolean z3, boolean z4) {
        this.f14423a = sDK4ExoPlaybackEngine;
        this.f14424b = oVar;
        this.f14425c = oVar2;
        this.f14426d = bVar;
        this.f14427e = fVar;
        this.f14428f = z;
        this.f14429g = th;
        this.f14430h = z2;
        this.f14431i = i;
        this.f14432j = bVar2;
        this.f14433k = eVar;
        this.f14434l = playbackContext;
        this.f14435m = bVar3;
        this.f14436n = z3;
        this.f14437o = z4;
    }

    /* renamed from: a */
    public static /* synthetic */ C6336a m19906a(C6336a aVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, C3693o oVar2, C6285b bVar, C6320f fVar, boolean z, Throwable th, boolean z2, int i, C6501b bVar2, C6341e eVar, PlaybackContext playbackContext, C6337b bVar3, boolean z3, boolean z4, int i2, Object obj) {
        C6336a aVar2 = aVar;
        int i3 = i2;
        return aVar.mo18951a((i3 & 1) != 0 ? aVar2.f14423a : sDK4ExoPlaybackEngine, (i3 & 2) != 0 ? aVar2.f14424b : oVar, (i3 & 4) != 0 ? aVar2.f14425c : oVar2, (i3 & 8) != 0 ? aVar2.f14426d : bVar, (i3 & 16) != 0 ? aVar2.f14427e : fVar, (i3 & 32) != 0 ? aVar2.f14428f : z, (i3 & 64) != 0 ? aVar2.f14429g : th, (i3 & 128) != 0 ? aVar2.f14430h : z2, (i3 & 256) != 0 ? aVar2.f14431i : i, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? aVar2.f14432j : bVar2, (i3 & 1024) != 0 ? aVar2.f14433k : eVar, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? aVar2.f14434l : playbackContext, (i3 & 4096) != 0 ? aVar2.f14435m : bVar3, (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? aVar2.f14436n : z3, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? aVar2.f14437o : z4);
    }

    /* renamed from: a */
    public final C6336a mo18951a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, C3693o oVar2, C6285b bVar, C6320f fVar, boolean z, Throwable th, boolean z2, int i, C6501b bVar2, C6341e eVar, PlaybackContext playbackContext, C6337b bVar3, boolean z3, boolean z4) {
        C6336a aVar = new C6336a(sDK4ExoPlaybackEngine, oVar, oVar2, bVar, fVar, z, th, z2, i, bVar2, eVar, playbackContext, bVar3, z3, z4);
        return aVar;
    }

    /* renamed from: a */
    public final boolean mo18952a() {
        return this.f14428f;
    }

    /* renamed from: b */
    public final C6285b mo18953b() {
        return this.f14426d;
    }

    /* renamed from: c */
    public final C3693o mo18954c() {
        return this.f14424b;
    }

    /* renamed from: d */
    public final SDK4ExoPlaybackEngine mo18955d() {
        return this.f14423a;
    }

    /* renamed from: e */
    public final Throwable mo18956e() {
        return this.f14429g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6336a) {
                C6336a aVar = (C6336a) obj;
                if (Intrinsics.areEqual((Object) this.f14423a, (Object) aVar.f14423a) && Intrinsics.areEqual((Object) this.f14424b, (Object) aVar.f14424b) && Intrinsics.areEqual((Object) this.f14425c, (Object) aVar.f14425c) && Intrinsics.areEqual((Object) this.f14426d, (Object) aVar.f14426d) && Intrinsics.areEqual((Object) this.f14427e, (Object) aVar.f14427e)) {
                    if ((this.f14428f == aVar.f14428f) && Intrinsics.areEqual((Object) this.f14429g, (Object) aVar.f14429g)) {
                        if (this.f14430h == aVar.f14430h) {
                            if ((this.f14431i == aVar.f14431i) && Intrinsics.areEqual((Object) this.f14432j, (Object) aVar.f14432j) && Intrinsics.areEqual((Object) this.f14433k, (Object) aVar.f14433k) && Intrinsics.areEqual((Object) this.f14434l, (Object) aVar.f14434l) && Intrinsics.areEqual((Object) this.f14435m, (Object) aVar.f14435m)) {
                                if (this.f14436n == aVar.f14436n) {
                                    if (this.f14437o == aVar.f14437o) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C3693o mo18958f() {
        return this.f14425c;
    }

    /* renamed from: g */
    public final PlaybackContext mo18959g() {
        return this.f14434l;
    }

    /* renamed from: h */
    public final C6337b mo18960h() {
        return this.f14435m;
    }

    public int hashCode() {
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14423a;
        int i = 0;
        int hashCode = (sDK4ExoPlaybackEngine != null ? sDK4ExoPlaybackEngine.hashCode() : 0) * 31;
        C3693o oVar = this.f14424b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        C3693o oVar2 = this.f14425c;
        int hashCode3 = (hashCode2 + (oVar2 != null ? oVar2.hashCode() : 0)) * 31;
        C6285b bVar = this.f14426d;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C6320f fVar = this.f14427e;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        boolean z = this.f14428f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        Throwable th = this.f14429g;
        int hashCode6 = (i2 + (th != null ? th.hashCode() : 0)) * 31;
        boolean z2 = this.f14430h;
        if (z2) {
            z2 = true;
        }
        int i3 = (((hashCode6 + (z2 ? 1 : 0)) * 31) + this.f14431i) * 31;
        C6501b bVar2 = this.f14432j;
        int hashCode7 = (i3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        C6341e eVar = this.f14433k;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        PlaybackContext playbackContext = this.f14434l;
        int hashCode9 = (hashCode8 + (playbackContext != null ? playbackContext.hashCode() : 0)) * 31;
        C6337b bVar3 = this.f14435m;
        if (bVar3 != null) {
            i = bVar3.hashCode();
        }
        int i4 = (hashCode9 + i) * 31;
        boolean z3 = this.f14436n;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f14437o;
        if (z4) {
            z4 = true;
        }
        return i5 + (z4 ? 1 : 0);
    }

    /* renamed from: i */
    public final C6320f mo18962i() {
        return this.f14427e;
    }

    /* renamed from: j */
    public final C6501b mo18963j() {
        return this.f14432j;
    }

    /* renamed from: k */
    public final C6341e mo18964k() {
        return this.f14433k;
    }

    /* renamed from: l */
    public final boolean mo18965l() {
        return this.f14437o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackState(engine=");
        sb.append(this.f14423a);
        sb.append(", current=");
        sb.append(this.f14424b);
        sb.append(", next=");
        sb.append(this.f14425c);
        sb.append(", contentRatingAction=");
        sb.append(this.f14426d);
        sb.append(", trackSelectionAction=");
        sb.append(this.f14427e);
        sb.append(", completed=");
        sb.append(this.f14428f);
        sb.append(", error=");
        sb.append(this.f14429g);
        sb.append(", videoNotAvailableForThisProfileType=");
        sb.append(this.f14430h);
        sb.append(", activityResultCode=");
        sb.append(this.f14431i);
        sb.append(", upNextAction=");
        sb.append(this.f14432j);
        sb.append(", upNextState=");
        sb.append(this.f14433k);
        sb.append(", playbackContext=");
        sb.append(this.f14434l);
        sb.append(", routeAfterPlayback=");
        sb.append(this.f14435m);
        sb.append(", closeIconVisible=");
        sb.append(this.f14436n);
        sb.append(", isPreparing=");
        sb.append(this.f14437o);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6336a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, C3693o oVar2, C6285b bVar, C6320f fVar, boolean z, Throwable th, boolean z2, int i, C6501b bVar2, C6341e eVar, PlaybackContext playbackContext, C6337b bVar3, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        C6337b bVar4 = null;
        C3693o oVar3 = (i3 & 2) != 0 ? null : oVar;
        C3693o oVar4 = (i3 & 4) != 0 ? null : oVar2;
        C6285b bVar5 = (i3 & 8) != 0 ? C6287b.f14356a : bVar;
        C6320f fVar2 = (i3 & 16) != 0 ? C6321a.f14413a : fVar;
        boolean z5 = false;
        boolean z6 = (i3 & 32) != 0 ? false : z;
        Throwable th2 = (i3 & 64) != 0 ? null : th;
        boolean z7 = (i3 & 128) != 0 ? false : z2;
        int i4 = (i3 & 256) != 0 ? 0 : i;
        C6501b bVar6 = (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? C6504c.f14719a : bVar2;
        C6341e eVar2 = (i3 & 1024) != 0 ? new C6341e(null, null, null, null, 15, null) : eVar;
        PlaybackContext playbackContext2 = (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? null : playbackContext;
        if ((i3 & 4096) == 0) {
            bVar4 = bVar3;
        }
        boolean z8 = (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? false : z3;
        if ((i3 & DateUtils.FORMAT_ABBREV_TIME) == 0) {
            z5 = z4;
        }
        this(sDK4ExoPlaybackEngine, oVar3, oVar4, bVar5, fVar2, z6, th2, z7, i4, bVar6, eVar2, playbackContext2, bVar4, z8, z5);
    }
}
