package com.bamtechmedia.dominguez.playback.p237m.p242m.p244f;

import com.bamtech.sdk4.media.MediaItem;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.d */
/* compiled from: SessionStarter.kt */
public final class C6445d {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final long m20128b(MediaItem mediaItem) {
        return TimeUnit.SECONDS.toMillis((long) mediaItem.getPlayhead().getPosition());
    }
}
