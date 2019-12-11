package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.analytics.C8673a.C8674a;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.trackselection.C9295d;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.C9510p.C9512b;

/* renamed from: com.google.android.exoplayer2.x */
/* compiled from: ExoPlayerFactory */
public final class C9612x {

    /* renamed from: a */
    private static BandwidthMeter f22485a;

    /* renamed from: a */
    public static C8802o0 m29759a(Context context, TrackSelector trackSelector) {
        return m29754a(context, new C9577w(context), trackSelector);
    }

    /* renamed from: b */
    public static C8802o0 m29761b(Context context) {
        return m29759a(context, new C9295d());
    }

    /* renamed from: a */
    public static C8802o0 m29754a(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector) {
        return m29755a(context, renderersFactory, trackSelector, new C9319u());
    }

    /* renamed from: a */
    public static C8802o0 m29755a(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl) {
        return m29756a(context, renderersFactory, trackSelector, loadControl, null, C9554k0.m29432b());
    }

    /* renamed from: a */
    public static C8802o0 m29756a(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, C8710l<C8713o> lVar, Looper looper) {
        return m29757a(context, renderersFactory, trackSelector, loadControl, lVar, new C8674a(), looper);
    }

    /* renamed from: a */
    public static C8802o0 m29757a(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, C8710l<C8713o> lVar, C8674a aVar, Looper looper) {
        return m29758a(context, renderersFactory, trackSelector, loadControl, lVar, m29760a(context), aVar, looper);
    }

    /* renamed from: a */
    public static C8802o0 m29758a(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, C8710l<C8713o> lVar, BandwidthMeter bandwidthMeter, C8674a aVar, Looper looper) {
        C8802o0 o0Var = new C8802o0(context, renderersFactory, trackSelector, loadControl, lVar, bandwidthMeter, aVar, looper);
        return o0Var;
    }

    /* renamed from: a */
    private static synchronized BandwidthMeter m29760a(Context context) {
        BandwidthMeter bandwidthMeter;
        synchronized (C9612x.class) {
            if (f22485a == null) {
                f22485a = new C9512b(context).mo24579a();
            }
            bandwidthMeter = f22485a;
        }
        return bandwidthMeter;
    }
}
