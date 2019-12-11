package com.bamtech.player.exo.p044l;

import com.google.android.exoplayer2.C8733l0;
import com.google.android.exoplayer2.C9319u;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.C9491f;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010H\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u0001J\t\u0010\u0017\u001a\u00020\u0015H\u0001J\\\u0010\u0018\u001a\u00020\u00152,\u0010\u0019\u001a(\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b \u0011*\u0014\u0012\u000e\b\u0001\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001a2\u000e\u0010\u001c\u001a\n \u0011*\u0004\u0018\u00010\u001d0\u001d2\u000e\u0010\u001e\u001a\n \u0011*\u0004\u0018\u00010\u001f0\u001fH\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\bH\u0001J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0016J!\u0010&\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\bH\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, mo31007d2 = {"Lcom/bamtech/player/exo/framework/BamLoadControl;", "Lcom/google/android/exoplayer2/LoadControl;", "playerEvents", "Lcom/bamtech/player/PlayerEvents;", "delegate", "Lcom/google/android/exoplayer2/DefaultLoadControl;", "(Lcom/bamtech/player/PlayerEvents;Lcom/google/android/exoplayer2/DefaultLoadControl;)V", "continueLoading", "", "getContinueLoading", "()Z", "setContinueLoading", "(Z)V", "getDelegate", "()Lcom/google/android/exoplayer2/DefaultLoadControl;", "getAllocator", "Lcom/google/android/exoplayer2/upstream/Allocator;", "kotlin.jvm.PlatformType", "getBackBufferDurationUs", "", "onPrepared", "", "onReleased", "onStopped", "onTracksSelected", "p0", "", "Lcom/google/android/exoplayer2/Renderer;", "p1", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "p2", "Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;", "([Lcom/google/android/exoplayer2/Renderer;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V", "retainBackBufferFromKeyframe", "shouldContinueLoading", "bufferedDurationUs", "playbackSpeed", "", "shouldStartPlayback", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.l.b */
/* compiled from: BamLoadControl.kt */
public final class C1729b implements LoadControl {

    /* renamed from: a */
    private boolean f6007a = true;

    /* renamed from: b */
    private final C9319u f6008b;

    /* renamed from: com.bamtech.player.exo.l.b$a */
    /* compiled from: BamLoadControl.kt */
    static final class C1730a<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C1729b f6009c;

        C1730a(C1729b bVar) {
            this.f6009c = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f6009c.mo7722a(!bool.booleanValue());
        }
    }

    public C1729b(C5300m mVar, C9319u uVar) {
        this.f6008b = uVar;
        mVar.mo16936B0().mo30192f((Consumer<? super T>) new C1730a<Object>(this));
    }

    /* renamed from: a */
    public void mo7721a() {
        this.f6008b.mo7721a();
    }

    /* renamed from: a */
    public final void mo7722a(boolean z) {
        this.f6007a = z;
    }

    /* renamed from: a */
    public void mo7723a(C8733l0[] l0VarArr, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        this.f6008b.mo7723a(l0VarArr, trackGroupArray, trackSelectionArray);
    }

    /* renamed from: a */
    public boolean mo7725a(long j, float f, boolean z) {
        return this.f6008b.mo7725a(j, f, z);
    }

    /* renamed from: b */
    public boolean mo7726b() {
        return this.f6008b.mo7726b();
    }

    /* renamed from: c */
    public long mo7727c() {
        return this.f6008b.mo7727c();
    }

    /* renamed from: d */
    public void mo7728d() {
        this.f6008b.mo7728d();
    }

    /* renamed from: e */
    public C9491f mo7729e() {
        return this.f6008b.mo7729e();
    }

    /* renamed from: f */
    public void mo7730f() {
        this.f6008b.mo7730f();
    }

    /* renamed from: a */
    public boolean mo7724a(long j, float f) {
        if (!this.f6007a) {
            return false;
        }
        return this.f6008b.mo7724a(j, f);
    }
}
