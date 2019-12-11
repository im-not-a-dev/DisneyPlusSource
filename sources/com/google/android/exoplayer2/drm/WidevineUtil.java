package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.drm.s */
/* compiled from: WidevineUtil */
public final class WidevineUtil {
    /* renamed from: a */
    public static Pair<Long, Long> getLicenseDurationRemainingSec(DrmSession<?> drmSession) {
        Map a = drmSession.queryKeyStatus();
        if (a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(getDurationRemainingSec(a, "LicenseDurationRemaining")), Long.valueOf(getDurationRemainingSec(a, "PlaybackDurationRemaining")));
    }

    /* renamed from: a */
    private static long getDurationRemainingSec(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -9223372036854775807L; // return C.TIME_UNSET;
    }
}
