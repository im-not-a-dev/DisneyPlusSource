package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.r */
/* compiled from: C */
public final class C {

    /* renamed from: a */
    public static final UUID UUID_NIL = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID COMMON_PSSH_UUID = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID CLEARKEY_UUID = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID PLAYREADY_UUID = new UUID(-7348484286925749626L, -6083546864340672619L);

    @TargetApi(21)
    /* renamed from: a */
    public static int generateAudioSessionIdV21(Context context) {
        return ((AudioManager) context.getSystemService("audio")).generateAudioSessionId();
    }

    /* renamed from: a */
	/* See source pulled from ExoPlayer source below */
    public static long msToUs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: b */
	/* See source pulled from ExoPlayer source below */
    public static long usToMs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

  /*
   * Converts a time in microseconds to the corresponding time in milliseconds, preserving
   * {@link #TIME_UNSET} and {@link #TIME_END_OF_SOURCE} values.
   *
   * @param timeUs The time in microseconds.
   * @return The corresponding time in milliseconds.
   
  public static long msToUs(long timeUs) {
    return (timeUs == TIME_UNSET || timeUs == TIME_END_OF_SOURCE) ? timeUs : (timeUs / 1000);
  }

  
   * Converts a time in milliseconds to the corresponding time in microseconds, preserving
   * {@link #TIME_UNSET} values and {@link #TIME_END_OF_SOURCE} values.
   *
   * @param timeMs The time in milliseconds.
   * @return The corresponding time in microseconds.
   
  public static long msToUs(long timeMs) {
    return (timeMs == TIME_UNSET || timeMs == TIME_END_OF_SOURCE) ? timeMs : (timeMs * 1000);
  }*/
}
