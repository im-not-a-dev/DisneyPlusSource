package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.source.MediaSource.C9067a;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.source.r */
/* compiled from: CompositeMediaSource */
public abstract class C9233r<T> extends C9229o {

    /* renamed from: Y */
    private final HashMap<T, C9235b> f20942Y = new HashMap<>();

    /* renamed from: Z */
    private Handler f20943Z;

    /* renamed from: a0 */
    private TransferListener f20944a0;

    /* renamed from: com.google.android.exoplayer2.source.r$a */
    /* compiled from: CompositeMediaSource */
    private final class C9234a implements MediaSourceEventListener {

        /* renamed from: U */
        private C9068a f20945U;

        /* renamed from: c */
        private final T f20947c;

        public C9234a(T t) {
            this.f20945U = C9233r.this.mo23959a((MediaPeriodId) null);
            this.f20947c = t;
        }

        /* renamed from: a */
        private boolean m27878a(int i, MediaPeriodId mediaPeriodId) {
            MediaPeriodId mediaPeriodId2;
            if (mediaPeriodId != null) {
                mediaPeriodId2 = C9233r.this.mo23967a(this.f20947c, mediaPeriodId);
                if (mediaPeriodId2 == null) {
                    return false;
                }
            } else {
                mediaPeriodId2 = null;
            }
            C9233r.this.mo23965a(this.f20947c, i);
            C9068a aVar = this.f20945U;
            if (aVar.f20161a != i || !Util.m29414a((Object) aVar.f20162b, (Object) mediaPeriodId2)) {
                this.f20945U = C9233r.this.mo23958a(i, mediaPeriodId2, 0);
            }
            return true;
        }

        public void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23505a(m27877a(mediaLoadData));
            }
        }

        public void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23503a(loadEventInfo, m27877a(mediaLoadData));
            }
        }

        public void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23519b(loadEventInfo, m27877a(mediaLoadData));
            }
        }

        public void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23504a(loadEventInfo, m27877a(mediaLoadData), iOException, z);
            }
        }

        public void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23526c(loadEventInfo, m27877a(mediaLoadData));
            }
        }

        public void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23499a();
            }
        }

        public void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23518b();
            }
        }

        public void onReadingStarted(int i, MediaPeriodId mediaPeriodId) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23525c();
            }
        }

        public void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m27878a(i, mediaPeriodId)) {
                this.f20945U.mo23520b(m27877a(mediaLoadData));
            }
        }

        /* renamed from: a */
        private MediaLoadData m27877a(MediaLoadData mediaLoadData) {
            C9233r rVar = C9233r.this;
            T t = this.f20947c;
            long j = mediaLoadData.f20159f;
            rVar.mo23966a(t, j);
            C9233r rVar2 = C9233r.this;
            T t2 = this.f20947c;
            long j2 = mediaLoadData.f20160g;
            rVar2.mo23966a(t2, j2);
            if (j == mediaLoadData.f20159f && j2 == mediaLoadData.f20160g) {
                return mediaLoadData;
            }
            MediaLoadData mediaLoadData2 = new MediaLoadData(mediaLoadData.f20154a, mediaLoadData.f20155b, mediaLoadData.f20156c, mediaLoadData.f20157d, mediaLoadData.f20158e, j, j2);
            return mediaLoadData2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.r$b */
    /* compiled from: CompositeMediaSource */
    private static final class C9235b {

        /* renamed from: a */
        public final MediaSource f20948a;

        /* renamed from: b */
        public final C9067a f20949b;

        /* renamed from: c */
        public final MediaSourceEventListener f20950c;

        public C9235b(MediaSource mediaSource, C9067a aVar, MediaSourceEventListener mediaSourceEventListener) {
            this.f20948a = mediaSource;
            this.f20949b = aVar;
            this.f20950c = mediaSourceEventListener;
        }
    }

    protected C9233r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23965a(T t, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23966a(T t, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract MediaPeriodId mo23967a(T t, MediaPeriodId mediaPeriodId);

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f20944a0 = transferListener;
        this.f20943Z = new Handler();
    }

    /* renamed from: b */
    public void mo23581b() {
        for (C9235b bVar : this.f20942Y.values()) {
            bVar.f20948a.mo23489a(bVar.f20949b);
            bVar.f20948a.mo23491a(bVar.f20950c);
        }
        this.f20942Y.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo23969a(T t, MediaSource mediaSource, Timeline timeline, Object obj);

    /* renamed from: a */
    public void mo23487a() throws IOException {
        for (C9235b bVar : this.f20942Y.values()) {
            bVar.f20948a.mo23487a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23968a(T t, MediaSource mediaSource) {
        Assertions.checkArgument(!this.f20942Y.containsKey(t));
        C9071a aVar = new C9071a(this, t);
        C9234a aVar2 = new C9234a(t);
        this.f20942Y.put(t, new C9235b(mediaSource, aVar, aVar2));
        Handler handler = this.f20943Z;
        Assertions.checkNotNull(handler);
        mediaSource.mo23488a(handler, (MediaSourceEventListener) aVar2);
        mediaSource.mo23490a((C9067a) aVar, this.f20944a0);
    }
}
