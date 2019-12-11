package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import com.bamtechmedia.dominguez.playback.p254tv.TvPlaybackActivity;
import p163g.p174d.p178b.p193j0.C5291e;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.e */
/* compiled from: TvAudioAndSubtitlesBindingModule_TvAudioAndSubtitlesModule_ProvidesTrackListFactory */
public final class C6541e implements C11895c<Observable<C5291e>> {
    /* renamed from: a */
    public static Observable<C5291e> m20364a(TvPlaybackActivity tvPlaybackActivity) {
        Observable<C5291e> a = C6538c.m20363a(tvPlaybackActivity);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
