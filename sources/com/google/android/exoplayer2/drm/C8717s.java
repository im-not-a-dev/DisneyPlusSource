package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.drm.s */
/* compiled from: WidevineUtil */
public final class C8717s {
    /* renamed from: a */
    public static Pair<Long, Long> m25263a(DrmSession<?> drmSession) {
        Map a = drmSession.mo22770a();
        if (a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m25262a(a, "LicenseDurationRemaining")), Long.valueOf(m25262a(a, "PlaybackDurationRemaining")));
    }

    /* renamed from: a */
    private static long m25262a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -9223372036854775807L;
    }
}
