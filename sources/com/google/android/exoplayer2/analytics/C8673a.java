package com.google.android.exoplayer2.analytics;

import android.view.Surface;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime;
import com.google.android.exoplayer2.drm.C8709k;
import com.google.android.exoplayer2.metadata.C8743e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p361p0.C8839l;
import com.google.android.exoplayer2.p361p0.C8842n;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9542g;
import com.google.android.exoplayer2.p394w0.C9602q;
import com.google.android.exoplayer2.p394w0.C9603r;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter.C9434a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.analytics.a */
/* compiled from: AnalyticsCollector */
public class C8673a implements EventListener, C8743e, C8842n, C9603r, MediaSourceEventListener, C9434a, C8709k, C9602q, C8839l {

    /* renamed from: U */
    private final C9542g f18410U;

    /* renamed from: V */
    private final C8670c f18411V;

    /* renamed from: W */
    private final C8676c f18412W;

    /* renamed from: X */
    private Player f18413X;

    /* renamed from: c */
    private final CopyOnWriteArraySet<AnalyticsListener> f18414c;

    /* renamed from: com.google.android.exoplayer2.analytics.a$a */
    /* compiled from: AnalyticsCollector */
    public static class C8674a {
        /* renamed from: a */
        public C8673a mo22702a(Player player, C9542g gVar) {
            return new C8673a(player, gVar);
        }
    }

    /* renamed from: com.google.android.exoplayer2.analytics.a$b */
    /* compiled from: AnalyticsCollector */
    private static final class C8675b {

        /* renamed from: a */
        public final MediaPeriodId f18415a;

        /* renamed from: b */
        public final Timeline f18416b;

        /* renamed from: c */
        public final int f18417c;

        public C8675b(MediaPeriodId mediaPeriodId, Timeline timeline, int i) {
            this.f18415a = mediaPeriodId;
            this.f18416b = timeline;
            this.f18417c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.analytics.a$c */
    /* compiled from: AnalyticsCollector */
    private static final class C8676c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ArrayList<C8675b> f18418a = new ArrayList<>();

        /* renamed from: b */
        private final HashMap<MediaPeriodId, C8675b> f18419b = new HashMap<>();

        /* renamed from: c */
        private final C8669b f18420c = new C8669b();

        /* renamed from: d */
        private C8675b f18421d;

        /* renamed from: e */
        private C8675b f18422e;

        /* renamed from: f */
        private Timeline f18423f = Timeline.f18393a;

        /* renamed from: g */
        private boolean f18424g;

        /* renamed from: h */
        private void m25062h() {
            if (!this.f18418a.isEmpty()) {
                this.f18421d = (C8675b) this.f18418a.get(0);
            }
        }

        /* renamed from: b */
        public C8675b mo22708b() {
            if (this.f18418a.isEmpty()) {
                return null;
            }
            ArrayList<C8675b> arrayList = this.f18418a;
            return (C8675b) arrayList.get(arrayList.size() - 1);
        }

        /* renamed from: c */
        public C8675b mo22711c() {
            if (this.f18418a.isEmpty() || this.f18423f.mo22671c() || this.f18424g) {
                return null;
            }
            return (C8675b) this.f18418a.get(0);
        }

        /* renamed from: d */
        public C8675b mo22713d() {
            return this.f18422e;
        }

        /* renamed from: e */
        public boolean mo22714e() {
            return this.f18424g;
        }

        /* renamed from: f */
        public void mo22715f() {
            this.f18424g = false;
            m25062h();
        }

        /* renamed from: g */
        public void mo22716g() {
            this.f18424g = true;
        }

        /* renamed from: a */
        public C8675b mo22703a() {
            return this.f18421d;
        }

        /* renamed from: a */
        public C8675b mo22704a(MediaPeriodId mediaPeriodId) {
            return (C8675b) this.f18419b.get(mediaPeriodId);
        }

        /* renamed from: b */
        public C8675b mo22709b(int i) {
            C8675b bVar = null;
            for (int i2 = 0; i2 < this.f18418a.size(); i2++) {
                C8675b bVar2 = (C8675b) this.f18418a.get(i2);
                int a = this.f18423f.mo22656a(bVar2.f18415a.f20147a);
                if (a != -1 && this.f18423f.mo22660a(a, this.f18420c).f18395b == i) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        /* renamed from: c */
        public void mo22712c(MediaPeriodId mediaPeriodId) {
            this.f18422e = (C8675b) this.f18419b.get(mediaPeriodId);
        }

        /* renamed from: a */
        public void mo22705a(int i) {
            m25062h();
        }

        /* renamed from: a */
        public void mo22707a(Timeline timeline) {
            for (int i = 0; i < this.f18418a.size(); i++) {
                C8675b a = m25060a((C8675b) this.f18418a.get(i), timeline);
                this.f18418a.set(i, a);
                this.f18419b.put(a.f18415a, a);
            }
            C8675b bVar = this.f18422e;
            if (bVar != null) {
                this.f18422e = m25060a(bVar, timeline);
            }
            this.f18423f = timeline;
            m25062h();
        }

        /* renamed from: b */
        public boolean mo22710b(MediaPeriodId mediaPeriodId) {
            C8675b bVar = (C8675b) this.f18419b.remove(mediaPeriodId);
            if (bVar == null) {
                return false;
            }
            this.f18418a.remove(bVar);
            C8675b bVar2 = this.f18422e;
            if (bVar2 != null && mediaPeriodId.equals(bVar2.f18415a)) {
                this.f18422e = this.f18418a.isEmpty() ? null : (C8675b) this.f18418a.get(0);
            }
            return true;
        }

        /* renamed from: a */
        public void mo22706a(int i, MediaPeriodId mediaPeriodId) {
            C8675b bVar = new C8675b(mediaPeriodId, this.f18423f.mo22656a(mediaPeriodId.f20147a) != -1 ? this.f18423f : Timeline.f18393a, i);
            this.f18418a.add(bVar);
            this.f18419b.put(mediaPeriodId, bVar);
            if (this.f18418a.size() == 1 && !this.f18423f.mo22671c()) {
                m25062h();
            }
        }

        /* renamed from: a */
        private C8675b m25060a(C8675b bVar, Timeline timeline) {
            int a = timeline.mo22656a(bVar.f18415a.f20147a);
            if (a == -1) {
                return bVar;
            }
            return new C8675b(bVar.f18415a, timeline, timeline.mo22660a(a, this.f18420c).f18395b);
        }
    }

    protected C8673a(Player player, C9542g gVar) {
        if (player != null) {
            this.f18413X = player;
        }
        C9537e.m29296a(gVar);
        this.f18410U = gVar;
        this.f18414c = new CopyOnWriteArraySet<>();
        this.f18412W = new C8676c();
        this.f18411V = new C8670c();
    }

    /* renamed from: f */
    private EventTime m25029f() {
        return m25028a(this.f18412W.mo22703a());
    }

    /* renamed from: g */
    private EventTime m25030g() {
        return m25028a(this.f18412W.mo22708b());
    }

    /* renamed from: h */
    private EventTime m25031h() {
        return m25028a(this.f18412W.mo22711c());
    }

    /* renamed from: i */
    private EventTime m25032i() {
        return m25028a(this.f18412W.mo22713d());
    }

    /* renamed from: a */
    public final void mo7571a() {
    }

    /* renamed from: a */
    public void mo22697a(AnalyticsListener analyticsListener) {
        this.f18414c.add(analyticsListener);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7578a(boolean z) {
        C8729j0.m25320a((EventListener) this, z);
    }

    /* renamed from: b */
    public void mo22699b(AnalyticsListener analyticsListener) {
        this.f18414c.remove(analyticsListener);
    }

    /* renamed from: c */
    public final void mo7743c(C8878d dVar) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9204a(h, 2, dVar);
        }
    }

    /* renamed from: d */
    public final void mo22700d() {
        if (!this.f18412W.mo22714e()) {
            EventTime h = m25031h();
            this.f18412W.mo22716g();
            Iterator it = this.f18414c.iterator();
            while (it.hasNext()) {
                ((AnalyticsListener) it.next()).onSeekStarted(h);
            }
        }
    }

    /* renamed from: e */
    public final void mo22701e() {
        for (C8675b bVar : new ArrayList(this.f18412W.f18418a)) {
            onMediaPeriodReleased(bVar.f18417c, bVar.f18415a);
        }
    }

    public final void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9212a(a, mediaLoadData);
        }
    }

    public final void onDrmKeysLoaded() {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9227d(i);
        }
    }

    public final void onDrmKeysRestored() {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9217b(i);
        }
    }

    public final void onDrmSessionManagerError(Exception exc) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9214a(i, exc);
        }
    }

    public final void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9221b(a, loadEventInfo, mediaLoadData);
        }
    }

    public final void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9210a(a, loadEventInfo, mediaLoadData);
        }
    }

    public final void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9211a(a, loadEventInfo, mediaLoadData, iOException, z);
        }
    }

    public final void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9226c(a, loadEventInfo, mediaLoadData);
        }
    }

    public final void onLoadingChanged(boolean z) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9215a(h, z);
        }
    }

    public final void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId) {
        this.f18412W.mo22706a(i, mediaPeriodId);
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9229e(a);
        }
    }

    public final void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId) {
        EventTime a = m25027a(i, mediaPeriodId);
        if (this.f18412W.mo22710b(mediaPeriodId)) {
            Iterator it = this.f18414c.iterator();
            while (it.hasNext()) {
                ((AnalyticsListener) it.next()).mo9224c(a);
            }
        }
    }

    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9208a(h, playbackParameters);
        }
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        EventTime eventTime;
        if (exoPlaybackException.f18341c == 0) {
            eventTime = m25030g();
        } else {
            eventTime = m25031h();
        }
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9207a(eventTime, exoPlaybackException);
        }
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9216a(h, z, i);
        }
    }

    public final void onPositionDiscontinuity(int i) {
        this.f18412W.mo22705a(i);
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9198a(h, i);
        }
    }

    public final void onReadingStarted(int i, MediaPeriodId mediaPeriodId) {
        this.f18412W.mo22712c(mediaPeriodId);
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9231g(a);
        }
    }

    public final void onRepeatModeChanged(int i) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9218b(h, i);
        }
    }

    public final void onSeekProcessed() {
        if (this.f18412W.mo22714e()) {
            this.f18412W.mo22715f();
            EventTime h = m25031h();
            Iterator it = this.f18414c.iterator();
            while (it.hasNext()) {
                ((AnalyticsListener) it.next()).onSeekProcessed(h);
            }
        }
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9223b(h, z);
        }
    }

    public final void onTimelineChanged(Timeline timeline, Object obj, int i) {
        this.f18412W.mo22707a(timeline);
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9225c(h, i);
        }
    }

    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9213a(h, trackGroupArray, trackSelectionArray);
        }
    }

    public final void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        EventTime a = m25027a(i, mediaPeriodId);
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9222b(a, mediaLoadData);
        }
    }

    /* renamed from: a */
    public final void mo7577a(Metadata metadata) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9209a(h, metadata);
        }
    }

    /* renamed from: b */
    public final void mo7741b(C8878d dVar) {
        EventTime h = m25031h();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9204a(h, 1, dVar);
        }
    }

    /* renamed from: c */
    public final void mo9516c() {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9230f(i);
        }
    }

    /* renamed from: a */
    public final void mo7735a(int i, long j, long j2) {
        EventTime i2 = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9219b(i2, i, j, j2);
        }
    }

    /* renamed from: b */
    public final void mo7742b(String str, long j, long j2) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9205a(i, 1, str, j2);
        }
    }

    /* renamed from: d */
    public final void mo7744d(C8878d dVar) {
        EventTime f = m25029f();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9220b(f, 2, dVar);
        }
    }

    /* renamed from: a */
    public final void mo7738a(C8878d dVar) {
        EventTime f = m25029f();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9220b(f, 1, dVar);
        }
    }

    /* renamed from: b */
    public final void mo7740b(Format format) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9203a(i, 1, format);
        }
    }

    /* renamed from: a */
    public final void mo7732a(int i) {
        EventTime i2 = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9228d(i2, i);
        }
    }

    /* renamed from: b */
    public final void mo22698b(int i, long j, long j2) {
        EventTime g = m25030g();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9202a(g, i, j, j2);
        }
    }

    /* renamed from: a */
    public void mo22696a(float f) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9197a(i, f);
        }
    }

    /* renamed from: b */
    public final void mo9515b() {
        EventTime f = m25029f();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9196a(f);
        }
    }

    /* renamed from: a */
    public final void mo7739a(String str, long j, long j2) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9205a(i, 2, str, j2);
        }
    }

    /* renamed from: a */
    public final void mo7737a(Format format) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9203a(i, 2, format);
        }
    }

    /* renamed from: a */
    public final void mo7734a(int i, long j) {
        EventTime f = m25029f();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9201a(f, i, j);
        }
    }

    /* renamed from: a */
    public final void mo7736a(Surface surface) {
        EventTime i = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9206a(i, surface);
        }
    }

    /* renamed from: a */
    public final void mo7733a(int i, int i2, int i3, float f) {
        EventTime i4 = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9200a(i4, i, i2, i3, f);
        }
    }

    /* renamed from: a */
    public void mo7572a(int i, int i2) {
        EventTime i3 = m25032i();
        Iterator it = this.f18414c.iterator();
        while (it.hasNext()) {
            ((AnalyticsListener) it.next()).mo9199a(i3, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public EventTime mo22695a(Timeline timeline, int i, MediaPeriodId mediaPeriodId) {
        if (timeline.mo22671c()) {
            mediaPeriodId = null;
        }
        MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        long a = this.f18410U.mo24605a();
        boolean z = true;
        boolean z2 = timeline == this.f18413X.getCurrentTimeline() && i == this.f18413X.getCurrentWindowIndex();
        long j = 0;
        if (mediaPeriodId2 != null && mediaPeriodId2.mo23494a()) {
            if (!(z2 && this.f18413X.getCurrentAdGroupIndex() == mediaPeriodId2.f20148b && this.f18413X.getCurrentAdIndexInAdGroup() == mediaPeriodId2.f20149c)) {
                z = false;
            }
            if (z) {
                j = this.f18413X.getCurrentPosition();
            }
        } else if (z2) {
            j = this.f18413X.getContentPosition();
        } else if (!timeline.mo22671c()) {
            j = timeline.mo22663a(i, this.f18411V).mo22689a();
        }
        EventTime eventTime = new EventTime(a, timeline, i, mediaPeriodId2, j, this.f18413X.getCurrentPosition(), this.f18413X.getTotalBufferedDuration());
        return eventTime;
    }

    /* renamed from: a */
    private EventTime m25028a(C8675b bVar) {
        C9537e.m29296a(this.f18413X);
        if (bVar == null) {
            int currentWindowIndex = this.f18413X.getCurrentWindowIndex();
            C8675b b = this.f18412W.mo22709b(currentWindowIndex);
            if (b == null) {
                Timeline currentTimeline = this.f18413X.getCurrentTimeline();
                if (!(currentWindowIndex < currentTimeline.mo22667b())) {
                    currentTimeline = Timeline.f18393a;
                }
                return mo22695a(currentTimeline, currentWindowIndex, (MediaPeriodId) null);
            }
            bVar = b;
        }
        return mo22695a(bVar.f18416b, bVar.f18417c, bVar.f18415a);
    }

    /* renamed from: a */
    private EventTime m25027a(int i, MediaPeriodId mediaPeriodId) {
        EventTime eventTime;
        C9537e.m29296a(this.f18413X);
        if (mediaPeriodId != null) {
            C8675b a = this.f18412W.mo22704a(mediaPeriodId);
            if (a != null) {
                eventTime = m25028a(a);
            } else {
                eventTime = mo22695a(Timeline.f18393a, i, mediaPeriodId);
            }
            return eventTime;
        }
        Timeline currentTimeline = this.f18413X.getCurrentTimeline();
        if (!(i < currentTimeline.mo22667b())) {
            currentTimeline = Timeline.f18393a;
        }
        return mo22695a(currentTimeline, i, (MediaPeriodId) null);
    }
}
