package com.bamtech.player.exo.p044l;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.metadata.C8744f.C8745a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8758b;
import com.google.android.exoplayer2.metadata.p359j.C8766f;
import com.google.android.exoplayer2.metadata.p359j.C8768g;
import com.google.android.exoplayer2.metadata.p359j.C8773i;
import com.google.android.exoplayer2.metadata.p359j.C8778l;
import com.google.android.exoplayer2.metadata.p359j.C8780m;
import com.google.android.exoplayer2.p361p0.C8834j;
import com.google.android.exoplayer2.p361p0.C8842n;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p381t0.C9275d;
import com.google.android.exoplayer2.p381t0.C9275d.C9278c;
import com.google.android.exoplayer2.p394w0.C9603r;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.C9228n;
import com.google.android.exoplayer2.source.C9259w.C9261b;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9306f;
import com.google.android.exoplayer2.trackselection.C9306f.C9307a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import p686n.p687a.Timber;

/* renamed from: com.bamtech.player.exo.l.c */
/* compiled from: EventLogger */
public class C1731c implements EventListener, C8842n, C9603r, C9228n, C9261b, C8745a {

    /* renamed from: Y */
    private static final NumberFormat f6010Y = NumberFormat.getInstance(Locale.US);

    /* renamed from: U */
    private final C8670c f6011U = new C8670c();

    /* renamed from: V */
    private final C8669b f6012V = new C8669b();

    /* renamed from: W */
    private final long f6013W = SystemClock.elapsedRealtime();

    /* renamed from: X */
    private final Context f6014X;

    /* renamed from: c */
    private final C9306f f6015c;

    static {
        f6010Y.setMinimumFractionDigits(2);
        f6010Y.setMaximumFractionDigits(2);
        f6010Y.setGroupingUsed(false);
    }

    public C1731c(Context context, C9306f fVar) {
        this.f6015c = fVar;
        this.f6014X = context;
    }

    /* renamed from: a */
    private static String m8008a(int i, int i2) {
        return i < 2 ? "N/A" : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    /* renamed from: a */
    private static String m8009a(long j) {
        return j == -9223372036854775807L ? "?" : f6010Y.format((double) (((float) j) / 1000.0f));
    }

    /* renamed from: b */
    private static String m8013b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" ");
        String sb2 = sb.toString();
        if (i == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("NO");
            return sb3.toString();
        } else if (i == 1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("NO_UNSUPPORTED_TYPE");
            return sb4.toString();
        } else if (i == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("NO_EXCEEDS_CAPABILITIES");
            return sb5.toString();
        } else if (i != 4) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb2);
            sb6.append("?");
            return sb6.toString();
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb2);
            sb7.append("YES");
            return sb7.toString();
        }
    }

    /* renamed from: b */
    private static String m8014b(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    /* renamed from: c */
    private static String m8016c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "E" : "R" : "B" : "I";
    }

    /* renamed from: c */
    private static String m8017c(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f18350c);
        sb.append(", mimeType=");
        sb.append(format.f18349b0);
        sb.append(", label=");
        sb.append(format.f18342U);
        if (format.f18345X != -1) {
            sb.append(", bitrate=");
            sb.append(format.f18345X);
        }
        if (!(format.f18355g0 == -1 || format.f18356h0 == -1)) {
            sb.append(", res=");
            sb.append(format.f18355g0);
            sb.append("x");
            sb.append(format.f18356h0);
        }
        if (format.f18357i0 != -1.0f) {
            sb.append(", fps=");
            sb.append(format.f18357i0);
        }
        if (format.f18363o0 != -1) {
            sb.append(", channels=");
            sb.append(format.f18363o0);
        }
        if (format.f18364p0 != -1) {
            sb.append(", sample_rate=");
            sb.append(format.f18364p0);
        }
        if (format.f18368t0 != null) {
            sb.append(", language=");
            sb.append(format.f18368t0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(", SelectionFlag=");
        sb2.append(format.f18343V);
        sb.append(sb2.toString());
        if ((format.f18343V & 2) != 0) {
            sb.append(":FORCED");
        }
        if ((format.f18343V & 4) != 0) {
            sb.append(":AUTOSELECT");
        }
        if ((format.f18343V & 1) != 0) {
            sb.append(":DEFAULT");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo7733a(int i, int i2, int i3, float f) {
    }

    /* renamed from: a */
    public void mo7736a(Surface surface) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo7578a(boolean z) {
        C8729j0.m25320a((EventListener) this, z);
    }

    /* renamed from: d */
    public void mo7744d(C8878d dVar) {
        Timber.m44522a("videoDisabled [%s]", m8007a());
    }

    public void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    public void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        m8012a("loadError", (Exception) iOException);
    }

    public void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadingChanged(boolean z) {
        Timber.m44522a("loading [%s]", Boolean.valueOf(z));
    }

    public void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        Timber.m44528b(exoPlaybackException, "playerFailed [%s]", m8007a());
    }

    public void onPlayerStateChanged(boolean z, int i) {
        Timber.m44522a("state [%s, %s, %s]", m8007a(), Boolean.valueOf(z), m8016c(i));
    }

    public void onPositionDiscontinuity(int i) {
        Timber.m44522a("positionDiscontinuity", new Object[0]);
    }

    public void onReadingStarted(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSeekProcessed() {
    }

    public void onShuffleModeEnabledChanged(boolean z) {
    }

    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        if (timeline != null) {
            int a = timeline.mo22653a();
            int b = timeline.mo22667b();
            Timber.m44522a("sourceInfo [periodCount=%d, windowCount=%d", Integer.valueOf(a), Integer.valueOf(b));
            for (int i2 = 0; i2 < Math.min(a, 3); i2++) {
                timeline.mo22660a(i2, this.f6012V);
                Timber.m44522a("  period [%s]", m8009a(this.f6012V.mo22683c()));
            }
            String str = "  ...";
            if (a > 3) {
                Timber.m44522a(str, new Object[0]);
            }
            for (int i3 = 0; i3 < Math.min(b, 3); i3++) {
                timeline.mo22663a(i3, this.f6011U);
                Timber.m44522a("  window [%s, %s, %s]", m8009a(this.f6011U.mo22692c()), Boolean.valueOf(this.f6011U.f18399a), Boolean.valueOf(this.f6011U.f18400b));
            }
            if (b > 3) {
                Timber.m44522a(str, new Object[0]);
            }
            Timber.m44522a("]", new Object[0]);
        }
    }

    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        String str;
        String str2;
        String str3;
        C9307a c = this.f6015c.mo24122c();
        if (c == null) {
            Timber.m44522a("Tracks []", new Object[0]);
            return;
        }
        Timber.m44522a("Tracks [", new Object[0]);
        int i = 0;
        while (true) {
            str = "      %s Track:%d, %s, supported=%s";
            str2 = "  ]";
            str3 = "    ]";
            int i2 = 2;
            char c2 = 1;
            if (i >= c.f21287a) {
                break;
            }
            TrackGroupArray b = c.mo24130b(i);
            TrackSelection a = trackSelectionArray.mo24040a(i);
            if (b.f20170c > 0) {
                Timber.m44522a("  Renderer:%d [", Integer.valueOf(i));
                int i3 = 0;
                while (i3 < b.f20170c) {
                    C9199j0 a2 = b.mo23531a(i3);
                    String a3 = m8008a(a2.f20833c, c.mo24126a(i, i3, false));
                    Object[] objArr = new Object[i2];
                    objArr[0] = Integer.valueOf(i3);
                    objArr[c2] = a3;
                    Timber.m44522a("    Group:%d, adaptive_supported=%s [", objArr);
                    for (int i4 = 0; i4 < a2.f20833c; i4++) {
                        Timber.m44522a(str, m8010a(a, a2, i4), Integer.valueOf(i4), m8017c(a2.mo23902a(i4)), m8013b(c.mo24125a(i, i3, i4)));
                    }
                    Timber.m44522a(str3, new Object[0]);
                    i3++;
                    i2 = 2;
                    c2 = 1;
                }
                if (a != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= a.length()) {
                            break;
                        }
                        Metadata metadata = a.mo24066a(i5).f18347Z;
                        if (metadata != null) {
                            Timber.m44522a("    Metadata [", new Object[0]);
                            m8011a(metadata, "      ");
                            Timber.m44522a(str3, new Object[0]);
                            break;
                        }
                        i5++;
                    }
                }
                Timber.m44522a(str2, new Object[0]);
            }
            i++;
        }
        TrackGroupArray b2 = c.mo24129b();
        if (b2.f20170c > 0) {
            Timber.m44522a("  Renderer:None [", new Object[0]);
            for (int i6 = 0; i6 < b2.f20170c; i6++) {
                Timber.m44522a("    Group:%d [", Integer.valueOf(i6));
                C9199j0 a4 = b2.mo23531a(i6);
                for (int i7 = 0; i7 < a4.f20833c; i7++) {
                    Timber.m44522a(str, m8014b(false), Integer.valueOf(i7), m8017c(a4.mo23902a(i7)), m8013b(0));
                }
                Timber.m44522a(str3, new Object[0]);
            }
            Timber.m44522a(str2, new Object[0]);
        }
        Timber.m44522a("]", new Object[0]);
        m8015b();
    }

    public void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    /* renamed from: a */
    private static String m8010a(TrackSelection jVar, C9199j0 j0Var, int i) {
        return m8014b((jVar == null || jVar.mo24067a() != j0Var || jVar.mo24072c(i) == -1) ? false : true);
    }

    /* renamed from: a */
    public void mo7577a(Metadata metadata) {
        Timber.m44522a("onMetadata [", new Object[0]);
        m8011a(metadata, "  ");
        Timber.m44522a("]", new Object[0]);
    }

    /* renamed from: b */
    public void mo7741b(C8878d dVar) {
        Timber.m44522a("audioEnabled [%s]", m8007a());
    }

    /* renamed from: a */
    public void mo7732a(int i) {
        Timber.m44522a("audioSessionId [%d]", Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo7742b(String str, long j, long j2) {
        Timber.m44522a("audioDecoderInitialized [%s, %s]", m8007a(), str);
    }

    /* renamed from: a */
    public void mo7738a(C8878d dVar) {
        Timber.m44522a("audioDisabled [%s]", m8007a());
    }

    /* renamed from: b */
    public void mo7740b(Format format) {
        Timber.m44522a("audioFormatChanged [%s, %s]", m8007a(), m8017c(format));
    }

    /* renamed from: b */
    private void m8015b() {
        String str = "On Device Audio: -----------";
        AudioManager audioManager = (AudioManager) this.f6014X.getSystemService("audio");
        try {
            Timber.m44529c(str, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("EAC3-JOC : ");
            boolean z = true;
            sb.append(!C9275d.m28139b("audio/eac3-joc", false, false).isEmpty());
            Timber.m44529c(sb.toString(), new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EAC3 : ");
            sb2.append(!C9275d.m28139b("audio/eac3", false, false).isEmpty());
            Timber.m44529c(sb2.toString(), new Object[0]);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AAC : ");
            if (C9275d.m28139b("audio/mp4a-latm", false, false).isEmpty()) {
                z = false;
            }
            sb3.append(z);
            Timber.m44529c(sb3.toString(), new Object[0]);
            Timber.m44529c(str, new Object[0]);
        } catch (C9278c e) {
            e.printStackTrace();
        }
        Timber.m44529c("HDMI Capabilities: -------------", new Object[0]);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("JOC: ");
        sb4.append(C8834j.m25613a(this.f6014X).mo23084a(18));
        Timber.m44529c(sb4.toString(), new Object[0]);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("eAC3: ");
        sb5.append(C8834j.m25613a(this.f6014X).mo23084a(6));
        Timber.m44529c(sb5.toString(), new Object[0]);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("AC3");
        sb6.append(C8834j.m25613a(this.f6014X).mo23084a(5));
        Timber.m44529c(sb6.toString(), new Object[0]);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("TruHD: ");
        sb7.append(C8834j.m25613a(this.f6014X).mo23084a(14));
        Timber.m44529c(sb7.toString(), new Object[0]);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("DTS: ");
        sb8.append(C8834j.m25613a(this.f6014X).mo23084a(7));
        Timber.m44529c(sb8.toString(), new Object[0]);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("FireTV: ");
        sb9.append(audioManager.getParameters("hdmi_encodings").toString());
        Timber.m44529c(sb9.toString(), new Object[0]);
        Timber.m44529c("Audio Capabilities: -------------", new Object[0]);
    }

    /* renamed from: a */
    public void mo7735a(int i, long j, long j2) {
        m8012a(String.format("audioTrackUnderrun [%d, %d, %d]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)}), (Exception) null);
    }

    /* renamed from: a */
    public void mo7739a(String str, long j, long j2) {
        Timber.m44522a("videoDecoderInitialized [%s, %s]", m8007a(), str);
    }

    /* renamed from: a */
    public void mo7737a(Format format) {
        Timber.m44522a("videoFormatChanged [%s, %s]", m8007a(), m8017c(format));
    }

    /* renamed from: a */
    public void mo7734a(int i, long j) {
        Timber.m44522a("droppedFrames [%s, %d]", m8007a(), Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m8012a(String str, Exception exc) {
        Timber.m44528b(exc, "internalError [%s, %s]", m8007a(), str);
    }

    /* renamed from: a */
    private void m8011a(Metadata metadata, String str) {
        for (int i = 0; i < metadata.mo22862X(); i++) {
            C8737b a = metadata.mo22863a(i);
            if (a instanceof C8778l) {
                C8778l lVar = (C8778l) a;
                Timber.m44522a("%s%s: owner=%s", str, lVar.f18626c, lVar.f18635U);
            } else if (a instanceof C8768g) {
                C8768g gVar = (C8768g) a;
                Timber.m44522a("%s%s: mimeType=%s, filename=%s, description=%s", str, gVar.f18626c, gVar.f18617U, gVar.f18618V, gVar.f18619W);
            } else if (a instanceof C8758b) {
                C8758b bVar = (C8758b) a;
                Timber.m44522a("%s%s: mimeType=%s, description=%s", str, bVar.f18626c, bVar.f18598U, bVar.f18599V);
            } else if (a instanceof C8780m) {
                C8780m mVar = (C8780m) a;
                Timber.m44522a("%s%s: description=%s", str, mVar.f18626c, mVar.f18637U);
            } else if (a instanceof C8766f) {
                C8766f fVar = (C8766f) a;
                Timber.m44522a("%s%s: language=%s description=%s", str, fVar.f18626c, fVar.f18614U, fVar.f18615V);
            } else if (a instanceof C8773i) {
                Timber.m44522a("%s%s", str, ((C8773i) a).f18626c);
            }
        }
    }

    /* renamed from: c */
    public void mo7743c(C8878d dVar) {
        Timber.m44522a("videoEnabled [%s]", m8007a());
    }

    /* renamed from: a */
    private String m8007a() {
        return m8009a(SystemClock.elapsedRealtime() - this.f6013W);
    }
}
