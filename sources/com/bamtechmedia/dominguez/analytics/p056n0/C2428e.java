package com.bamtechmedia.dominguez.analytics.p056n0;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtech.sdk4.useractivity.UserActivityApi;
import java.util.Map;
import p520io.reactivex.Completable;

/* renamed from: com.bamtechmedia.dominguez.analytics.n0.e */
/* compiled from: GlimpseWrapper.kt */
public final class C2428e {

    /* renamed from: a */
    private final UserActivityApi f6691a;

    public C2428e(UserActivityApi userActivityApi) {
        this.f6691a = userActivityApi;
    }

    /* renamed from: a */
    public final Completable mo11562a(GlimpseEvent glimpseEvent, Map<String, ? extends Object> map) {
        return this.f6691a.trackEvent(glimpseEvent, map);
    }
}
