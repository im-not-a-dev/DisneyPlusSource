package com.bamtech.player.exo;

import com.bamtech.player.exo.p040h.C1709a;
import com.bamtech.player.exo.p045m.C1735c;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.C8802o0;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.C8743e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8773i;
import com.google.android.exoplayer2.p381t0.C9271b.C9272a;
import com.google.android.exoplayer2.p381t0.C9275d.C9278c;
import com.google.android.exoplayer2.source.C9230p;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C9163i;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.List;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p184f0.C4956a;
import p163g.p174d.p178b.p184f0.C4958c;
import p686n.p687a.C14100a;

/* renamed from: com.bamtech.player.exo.d */
/* compiled from: ExoPlayerListeners.kt */
public final class C1705d implements EventListener, C8743e {

    /* renamed from: U */
    private int f5945U = -1;

    /* renamed from: V */
    private final C8802o0 f5946V;

    /* renamed from: W */
    private final C1706e f5947W;

    /* renamed from: X */
    private final C4958c f5948X;

    /* renamed from: Y */
    private final C5300m f5949Y;

    /* renamed from: c */
    private int f5950c;

    public C1705d(C8802o0 o0Var, C1706e eVar, C1735c cVar, C4958c cVar2, C5300m mVar) {
        this.f5946V = o0Var;
        this.f5947W = eVar;
        this.f5948X = cVar2;
        this.f5949Y = mVar;
    }

    /* renamed from: e */
    private final void m7862e() {
        this.f5949Y.mo16952J0();
    }

    /* renamed from: a */
    public final void mo7576a() {
        if (this.f5945U == 2) {
            this.f5949Y.mo16960N0();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7578a(boolean z) {
        C8729j0.m25320a((EventListener) this, z);
    }

    /* renamed from: b */
    public final void mo7579b() {
        this.f5949Y.mo16950I0();
    }

    /* renamed from: c */
    public final void mo7581c() {
        this.f5949Y.mo16954K0();
    }

    /* renamed from: d */
    public final void mo7582d() {
        if (this.f5947W.mo7617c()) {
            this.f5949Y.mo17058o();
        } else {
            this.f5949Y.mo16976V0();
        }
        this.f5949Y.mo16958M0();
        this.f5949Y.mo17021d(this.f5947W.getDuration());
    }

    public void onLoadingChanged(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadingChanged: ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String str;
        int i = exoPlaybackException.f18341c;
        if (i == 1) {
            Exception a = exoPlaybackException.mo22594a();
            if (a instanceof C9272a) {
                C9272a aVar = (C9272a) a;
                if (aVar.f21149V != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error initializing decoder ");
                    sb.append(aVar.f21149V);
                    str = sb.toString();
                } else if (a.getCause() instanceof C9278c) {
                    str = "error querying decoders";
                } else if (aVar.f21148U) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No secure Decoder  ");
                    sb2.append(aVar.f21151c);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No Decoder for");
                    sb3.append(aVar.f21151c);
                    str = sb3.toString();
                }
                C14100a.m44528b(a, str, new Object[0]);
            }
        } else if (i == 0 && (exoPlaybackException.mo22595b() instanceof C9230p)) {
            this.f5947W.mo7596D();
        }
        this.f5949Y.mo16996a((Throwable) exoPlaybackException);
    }

    public void onPlayerStateChanged(boolean z, int i) {
        if (i == 3 || this.f5945U != i) {
            if (i == 4) {
                mo7579b();
            } else if (i == 2) {
                mo7580b(z);
            } else if (i == 3) {
                if (z) {
                    mo7582d();
                } else {
                    mo7581c();
                }
                mo7576a();
            } else if (i == 1) {
                m7862e();
            }
            this.f5945U = i;
        }
    }

    public void onPositionDiscontinuity(int i) {
        int currentWindowIndex = this.f5946V.getCurrentWindowIndex();
        if (currentWindowIndex != this.f5950c) {
            this.f5950c = currentWindowIndex;
        }
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSeekProcessed() {
    }

    public void onShuffleModeEnabledChanged(boolean z) {
    }

    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        if (obj instanceof C9163i) {
            C9163i iVar = (C9163i) obj;
            this.f5947W.f5956f = m7861a(iVar);
            HlsMediaPlaylist hlsMediaPlaylist = iVar.f20588a;
            if (hlsMediaPlaylist != null) {
                List<String> list = hlsMediaPlaylist.f20715b;
                ArrayList arrayList = new ArrayList(list.size());
                for (String f : list) {
                    C4956a f2 = this.f5948X.mo16436f(f);
                    if (f2 != null) {
                        f2.f12168U = C8883r.m25968b(iVar.f20588a.f20692f);
                        arrayList.add(f2);
                    }
                }
                this.f5949Y.mo17011b((List<C4956a>) arrayList);
            }
            this.f5947W.mo7597E();
            this.f5949Y.mo17021d(this.f5946V.getDuration());
        }
    }

    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        this.f5947W.mo7593A();
    }

    /* renamed from: b */
    public final void mo7580b(boolean z) {
        this.f5949Y.mo16999a(z);
    }

    /* renamed from: a */
    private final long m7861a(C9163i iVar) {
        return C8883r.m25968b(iVar.f20588a.f20692f);
    }

    /* renamed from: a */
    public void mo7577a(Metadata metadata) {
        int X = metadata.mo22862X();
        for (int i = 0; i < X; i++) {
            C8737b a = metadata.mo22863a(i);
            if (a instanceof C8773i) {
                this.f5949Y.mo16991a(C1709a.m7933a((C8773i) a));
            }
        }
    }
}
