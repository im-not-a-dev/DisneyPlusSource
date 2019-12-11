package com.bamtechmedia.dominguez.channels.p073tv.p074g;

import android.app.Application;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import com.bamtechmedia.dominguez.channels.p073tv.ChannelLifecycleObserver;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.g.c */
/* compiled from: ChannelInitializationAction.kt */
public final class C3215c implements C3824a {

    /* renamed from: a */
    private final ChannelLifecycleObserver f8187a;

    public C3215c(ChannelLifecycleObserver channelLifecycleObserver) {
        this.f8187a = channelLifecycleObserver;
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        C0722m i = C0733v.m3782i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "ProcessLifecycleOwner.get()");
        i.getLifecycle().mo4134a(this.f8187a);
    }
}
