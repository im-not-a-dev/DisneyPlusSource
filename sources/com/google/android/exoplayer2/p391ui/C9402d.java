package com.google.android.exoplayer2.p391ui;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.C8802o0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.d */
/* compiled from: DebugTextViewHelper */
public class C9402d implements EventListener, Runnable {

    /* renamed from: U */
    private final TextView f21736U;

    /* renamed from: V */
    private boolean f21737V;

    /* renamed from: c */
    private final C8802o0 f21738c;

    public C9402d(C8802o0 o0Var, TextView textView) {
        C9537e.m29299a(o0Var.getApplicationLooper() == Looper.getMainLooper());
        this.f21738c = o0Var;
        this.f21736U = textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo24341a() {
        Format g = this.f21738c.mo23006g();
        C8878d f = this.f21738c.mo23005f();
        if (g == null || f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(g.f18349b0);
        sb.append("(id:");
        sb.append(g.f18350c);
        sb.append(" hz:");
        sb.append(g.f18364p0);
        sb.append(" ch:");
        sb.append(g.f18363o0);
        sb.append(m28791a(f));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7578a(boolean z) {
        C8729j0.m25320a((EventListener) this, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo24342b() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo24343c());
        sb.append(mo24344d());
        sb.append(mo24341a());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo24343c() {
        int playbackState = this.f21738c.getPlaybackState();
        String str = playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle";
        return String.format("playWhenReady:%s playbackState:%s window:%s", new Object[]{Boolean.valueOf(this.f21738c.getPlayWhenReady()), str, Integer.valueOf(this.f21738c.getCurrentWindowIndex())});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo24344d() {
        Format i = this.f21738c.mo23008i();
        C8878d h = this.f21738c.mo23007h();
        if (i == null || h == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(i.f18349b0);
        sb.append("(id:");
        sb.append(i.f18350c);
        sb.append(" r:");
        sb.append(i.f18355g0);
        sb.append("x");
        sb.append(i.f18356h0);
        sb.append(m28790a(i.f18359k0));
        sb.append(m28791a(h));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo24345e() {
        if (!this.f21737V) {
            this.f21737V = true;
            this.f21738c.addListener(this);
            mo24346f();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: f */
    public final void mo24346f() {
        this.f21736U.setText(mo24342b());
        this.f21736U.removeCallbacks(this);
        this.f21736U.postDelayed(this, 1000);
    }

    public /* synthetic */ void onLoadingChanged(boolean z) {
        C8729j0.m25323b((EventListener) this, z);
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        C8729j0.m25317a((EventListener) this, playbackParameters);
    }

    public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C8729j0.m25316a((EventListener) this, exoPlaybackException);
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        mo24346f();
    }

    public final void onPositionDiscontinuity(int i) {
        mo24346f();
    }

    public /* synthetic */ void onRepeatModeChanged(int i) {
        C8729j0.m25322b((EventListener) this, i);
    }

    public /* synthetic */ void onSeekProcessed() {
        C8729j0.m25314a(this);
    }

    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        C8729j0.m25324c(this, z);
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        C8729j0.m25318a(this, timeline, obj, i);
    }

    public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        C8729j0.m25319a((EventListener) this, trackGroupArray, trackSelectionArray);
    }

    public final void run() {
        mo24346f();
    }

    /* renamed from: a */
    private static String m28791a(C8878d dVar) {
        if (dVar == null) {
            return "";
        }
        dVar.mo23222a();
        StringBuilder sb = new StringBuilder();
        sb.append(" sib:");
        sb.append(dVar.f19016d);
        sb.append(" sb:");
        sb.append(dVar.f19018f);
        sb.append(" rb:");
        sb.append(dVar.f19017e);
        sb.append(" db:");
        sb.append(dVar.f19019g);
        sb.append(" mcdb:");
        sb.append(dVar.f19020h);
        sb.append(" dk:");
        sb.append(dVar.f19021i);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m28790a(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" par:");
        sb.append(String.format(Locale.US, "%.02f", new Object[]{Float.valueOf(f)}));
        return sb.toString();
    }
}
