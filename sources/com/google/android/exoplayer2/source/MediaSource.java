package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

public interface MediaSource {

    public static final class MediaPeriodId {

        /* renamed from: a */
        public final Object f20147a;

        /* renamed from: b */
        public final int f20148b;

        /* renamed from: c */
        public final int f20149c;

        /* renamed from: d */
        public final long f20150d;

        /* renamed from: e */
        public final int f20151e;

        public MediaPeriodId(Object obj) {
            this(obj, -1);
        }

        /* renamed from: a */
        public MediaPeriodId mo23493a(Object obj) {
            if (this.f20147a.equals(obj)) {
                return this;
            }
            MediaPeriodId mediaPeriodId = new MediaPeriodId(obj, this.f20148b, this.f20149c, this.f20150d, this.f20151e);
            return mediaPeriodId;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || MediaPeriodId.class != obj.getClass()) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            if (!(this.f20147a.equals(mediaPeriodId.f20147a) && this.f20148b == mediaPeriodId.f20148b && this.f20149c == mediaPeriodId.f20149c && this.f20150d == mediaPeriodId.f20150d && this.f20151e == mediaPeriodId.f20151e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return ((((((((527 + this.f20147a.hashCode()) * 31) + this.f20148b) * 31) + this.f20149c) * 31) + ((int) this.f20150d)) * 31) + this.f20151e;
        }

        public MediaPeriodId(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        /* renamed from: a */
        public boolean mo23494a() {
            return this.f20148b != -1;
        }

        public MediaPeriodId(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public MediaPeriodId(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private MediaPeriodId(Object obj, int i, int i2, long j, int i3) {
            this.f20147a = obj;
            this.f20148b = i;
            this.f20149c = i2;
            this.f20150d = j;
            this.f20151e = i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.MediaSource$a */
    public interface C9067a {
        /* renamed from: a */
        void mo23497a(MediaSource mediaSource, Timeline timeline, Object obj);
    }

    /* renamed from: a */
    C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j);

    /* renamed from: a */
    void mo23487a() throws IOException;

    /* renamed from: a */
    void mo23488a(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    /* renamed from: a */
    void mo23489a(C9067a aVar);

    /* renamed from: a */
    void mo23490a(C9067a aVar, TransferListener transferListener);

    /* renamed from: a */
    void mo23491a(MediaSourceEventListener mediaSourceEventListener);

    /* renamed from: a */
    void mo23492a(C9072a0 a0Var);
}
