package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.r */
/* compiled from: C */
public final class C8883r {

    /* renamed from: a */
    public static final UUID f19042a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f19043b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f19044c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f19045d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f19046e = new UUID(-7348484286925749626L, -6083546864340672619L);

    @TargetApi(21)
    /* renamed from: a */
    public static int m25966a(Context context) {
        return ((AudioManager) context.getSystemService("audio")).generateAudioSessionId();
    }

    /* renamed from: a */
    public static long m25967a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: b */
    public static long m25968b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
