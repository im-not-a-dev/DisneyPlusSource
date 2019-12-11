package com.bamtech.player.exo.p044l;

import com.bamtech.player.exo.p043k.C1726a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import java.io.IOException;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p191i0.p192a.C5281a.C5282a;
import p163g.p174d.p178b.p193j0.C5290d;

/* renamed from: com.bamtech.player.exo.l.a */
/* compiled from: AdaptiveMediaSourceEvents */
public class C1728a implements MediaSourceEventListener {

    /* renamed from: U */
    private final C1726a f6005U;

    /* renamed from: c */
    private final C5300m f6006c;

    public C1728a(C5300m mVar, C1726a aVar) {
        this.f6006c = mVar;
        this.f6005U = aVar;
    }

    /* renamed from: a */
    private C5282a m7993a(int i) {
        if (i == 0) {
            return C5282a.Unknown;
        }
        if (i == 1) {
            return C5282a.Initial;
        }
        if (i == 2) {
            return C5282a.Manual;
        }
        if (i == 3) {
            return C5282a.Adaptive;
        }
        if (i != 4) {
            return C5282a.Unknown;
        }
        return C5282a.TrickPlay;
    }

    /* renamed from: b */
    private boolean m7995b(Format format) {
        return format != null;
    }

    public void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        Format format = mediaLoadData.f20156c;
        if (m7995b(format)) {
            this.f6006c.mo17047j().mo16857e(m7994a(format), m7993a(mediaLoadData.f20157d));
        }
    }

    public void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Format format = mediaLoadData.f20156c;
        if (m7995b(format)) {
            this.f6006c.mo17047j().mo16849a(m7994a(format), m7993a(mediaLoadData.f20157d));
        }
    }

    public void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Format format = mediaLoadData.f20156c;
        if (m7995b(format)) {
            this.f6006c.mo17047j().mo16851b(m7994a(format), m7993a(mediaLoadData.f20157d));
        }
    }

    public void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        Format format = mediaLoadData.f20156c;
        if (m7995b(format)) {
            this.f6006c.mo17047j().mo16853c(m7994a(format), m7993a(mediaLoadData.f20157d));
        }
    }

    public void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Format format = mediaLoadData.f20156c;
        if (m7995b(format)) {
            this.f6006c.mo17047j().mo16855d(m7994a(format), m7993a(mediaLoadData.f20157d));
        }
    }

    public void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onReadingStarted(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    /* renamed from: a */
    private C5290d m7994a(Format format) {
        return this.f6005U.mo7711a(format);
    }
}
