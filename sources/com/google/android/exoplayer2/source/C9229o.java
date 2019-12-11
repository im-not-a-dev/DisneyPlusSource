package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.MediaSource.C9067a;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.exoplayer2.source.o */
/* compiled from: BaseMediaSource */
public abstract class C9229o implements MediaSource {

    /* renamed from: U */
    private final C9068a f20928U = new C9068a();

    /* renamed from: V */
    private Looper f20929V;

    /* renamed from: W */
    private Timeline f20930W;

    /* renamed from: X */
    private Object f20931X;

    /* renamed from: c */
    private final ArrayList<C9067a> f20932c = new ArrayList<>(1);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23961a(Timeline timeline, Object obj) {
        this.f20930W = timeline;
        this.f20931X = obj;
        Iterator it = this.f20932c.iterator();
        while (it.hasNext()) {
            ((C9067a) it.next()).mo23497a(this, timeline, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23580a(TransferListener transferListener);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo23581b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9068a mo23959a(MediaPeriodId mediaPeriodId) {
        return this.f20928U.mo23498a(0, mediaPeriodId, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9068a mo23960a(MediaPeriodId mediaPeriodId, long j) {
        Assertions.checkArgument(mediaPeriodId != null);
        return this.f20928U.mo23498a(0, mediaPeriodId, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9068a mo23958a(int i, MediaPeriodId mediaPeriodId, long j) {
        return this.f20928U.mo23498a(i, mediaPeriodId, j);
    }

    /* renamed from: a */
    public final void mo23488a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        this.f20928U.mo23502a(handler, mediaSourceEventListener);
    }

    /* renamed from: a */
    public final void mo23491a(MediaSourceEventListener mediaSourceEventListener) {
        this.f20928U.mo23506a(mediaSourceEventListener);
    }

    /* renamed from: a */
    public final void mo23490a(C9067a aVar, TransferListener transferListener) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f20929V;
        Assertions.checkArgument(looper == null || looper == myLooper);
        this.f20932c.add(aVar);
        if (this.f20929V == null) {
            this.f20929V = myLooper;
            mo23580a(transferListener);
            return;
        }
        Timeline timeline = this.f20930W;
        if (timeline != null) {
            aVar.mo23497a(this, timeline, this.f20931X);
        }
    }

    /* renamed from: a */
    public final void mo23489a(C9067a aVar) {
        this.f20932c.remove(aVar);
        if (this.f20932c.isEmpty()) {
            this.f20929V = null;
            this.f20930W = null;
            this.f20931X = null;
            mo23581b();
        }
    }
}
