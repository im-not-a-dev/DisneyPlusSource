package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public interface MediaSourceEventListener {

    public static final class LoadEventInfo {

        /* renamed from: a */
        public final Uri f20152a;

        /* renamed from: b */
        public final long f20153b;

        public LoadEventInfo(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.f20152a = uri;
            this.f20153b = j2;
        }
    }

    public static final class MediaLoadData {

        /* renamed from: a */
        public final int f20154a;

        /* renamed from: b */
        public final int f20155b;

        /* renamed from: c */
        public final Format f20156c;

        /* renamed from: d */
        public final int f20157d;

        /* renamed from: e */
        public final Object f20158e;

        /* renamed from: f */
        public final long f20159f;

        /* renamed from: g */
        public final long f20160g;

        public MediaLoadData(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.f20154a = i;
            this.f20155b = i2;
            this.f20156c = format;
            this.f20157d = i3;
            this.f20158e = obj;
            this.f20159f = j;
            this.f20160g = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$a */
    public static final class C9068a {

        /* renamed from: a */
        public final int f20161a;

        /* renamed from: b */
        public final MediaPeriodId f20162b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C9069a> f20163c;

        /* renamed from: d */
        private final long f20164d;

        /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$a$a */
        private static final class C9069a {

            /* renamed from: a */
            public final Handler f20165a;

            /* renamed from: b */
            public final MediaSourceEventListener f20166b;

            public C9069a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.f20165a = handler;
                this.f20166b = mediaSourceEventListener;
            }
        }

        public C9068a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        /* renamed from: a */
        public C9068a mo23498a(int i, MediaPeriodId mediaPeriodId, long j) {
            C9068a aVar = new C9068a(this.f20163c, i, mediaPeriodId, j);
            return aVar;
        }

        /* renamed from: b */
        public void mo23518b() {
            MediaPeriodId mediaPeriodId = this.f20162b;
            Assertions.checkNotNull(mediaPeriodId);
            MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9198j(this, aVar.f20166b, mediaPeriodId2));
            }
        }

        /* renamed from: c */
        public void mo23526c(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9196i(this, aVar.f20166b, loadEventInfo, mediaLoadData));
            }
        }

        private C9068a(CopyOnWriteArrayList<C9069a> copyOnWriteArrayList, int i, MediaPeriodId mediaPeriodId, long j) {
            this.f20163c = copyOnWriteArrayList;
            this.f20161a = i;
            this.f20162b = mediaPeriodId;
            this.f20164d = j;
        }

        /* renamed from: a */
        public void mo23502a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkArgument((handler == null || mediaSourceEventListener == null) ? false : true);
            this.f20163c.add(new C9069a(handler, mediaSourceEventListener));
        }

        /* renamed from: a */
        public void mo23506a(MediaSourceEventListener mediaSourceEventListener) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                if (aVar.f20166b == mediaSourceEventListener) {
                    this.f20163c.remove(aVar);
                }
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo23528c(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.f20161a, this.f20162b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: b */
        public /* synthetic */ void mo23521b(MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onMediaPeriodReleased(this.f20161a, mediaPeriodId);
        }

        /* renamed from: c */
        public void mo23525c() {
            MediaPeriodId mediaPeriodId = this.f20162b;
            Assertions.checkNotNull(mediaPeriodId);
            MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9145h(this, aVar.f20166b, mediaPeriodId2));
            }
        }

        /* renamed from: b */
        public void mo23524b(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            mo23523b(dataSpec, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: a */
        public void mo23499a() {
            MediaPeriodId mediaPeriodId = this.f20162b;
            Assertions.checkNotNull(mediaPeriodId);
            MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9142g(this, aVar.f20166b, mediaPeriodId2));
            }
        }

        /* renamed from: b */
        public void mo23523b(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, uri, map, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, m26928a(j), m26928a(j2));
            mo23519b(loadEventInfo, mediaLoadData);
        }

        /* renamed from: c */
        public /* synthetic */ void mo23527c(MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onReadingStarted(this.f20161a, mediaPeriodId);
        }

        /* renamed from: a */
        public /* synthetic */ void mo23507a(MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onMediaPeriodCreated(this.f20161a, mediaPeriodId);
        }

        /* renamed from: b */
        public void mo23519b(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9140f(this, aVar.f20166b, loadEventInfo, mediaLoadData));
            }
        }

        /* renamed from: a */
        public void mo23513a(DataSpec dataSpec, int i, long j) {
            mo23512a(dataSpec, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        /* renamed from: a */
        public void mo23512a(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            DataSpec dataSpec2 = dataSpec;
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec2, dataSpec2.f21938a, Collections.emptyMap(), j3, 0, 0);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, m26928a(j), m26928a(j2));
            mo23526c(loadEventInfo, mediaLoadData);
        }

        /* renamed from: b */
        public /* synthetic */ void mo23522b(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.f20161a, this.f20162b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: b */
        public void mo23520b(MediaLoadData mediaLoadData) {
            MediaPeriodId mediaPeriodId = this.f20162b;
            Assertions.checkNotNull(mediaPeriodId);
            MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9084d(this, aVar.f20166b, mediaPeriodId2, mediaLoadData));
            }
        }

        /* renamed from: a */
        public void mo23516a(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            mo23514a(dataSpec, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: a */
        public void mo23514a(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, uri, map, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, m26928a(j), m26928a(j2));
            mo23503a(loadEventInfo, mediaLoadData);
        }

        /* renamed from: a */
        public void mo23503a(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9082c(this, aVar.f20166b, loadEventInfo, mediaLoadData));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo23509a(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.f20161a, this.f20162b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: a */
        public void mo23517a(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            mo23515a(dataSpec, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        /* renamed from: a */
        public void mo23515a(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(dataSpec, uri, map, j3, j4, j5);
            MediaLoadData mediaLoadData = new MediaLoadData(i, i2, format, i3, obj, m26928a(j), m26928a(j2));
            mo23504a(loadEventInfo, mediaLoadData, iOException, z);
        }

        /* renamed from: a */
        public void mo23504a(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                MediaSourceEventListener mediaSourceEventListener = aVar.f20166b;
                Handler handler = aVar.f20165a;
                C9074b bVar = new C9074b(this, mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z);
                m26929a(handler, (Runnable) bVar);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo23510a(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.f20161a, this.f20162b, loadEventInfo, mediaLoadData, iOException, z);
        }

        /* renamed from: a */
        public void mo23500a(int i, long j, long j2) {
            long j3 = j;
            MediaLoadData mediaLoadData = new MediaLoadData(1, i, null, 3, null, m26928a(j), m26928a(j2));
            mo23520b(mediaLoadData);
        }

        /* renamed from: a */
        public /* synthetic */ void mo23508a(MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.f20161a, mediaPeriodId, mediaLoadData);
        }

        /* renamed from: a */
        public void mo23501a(int i, Format format, int i2, Object obj, long j) {
            MediaLoadData mediaLoadData = new MediaLoadData(1, i, format, i2, obj, m26928a(j), -9223372036854775807L);
            mo23505a(mediaLoadData);
        }

        /* renamed from: a */
        public void mo23505a(MediaLoadData mediaLoadData) {
            Iterator it = this.f20163c.iterator();
            while (it.hasNext()) {
                C9069a aVar = (C9069a) it.next();
                m26929a(aVar.f20165a, (Runnable) new C9136e(this, aVar.f20166b, mediaLoadData));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo23511a(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.f20161a, this.f20162b, mediaLoadData);
        }

        /* renamed from: a */
        private long m26928a(long j) {
            long b = C.usToMs(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f20164d + b;
        }

        /* renamed from: a */
        private void m26929a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId);

    void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId);

    void onReadingStarted(int i, MediaPeriodId mediaPeriodId);

    void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
