package com.google.android.exoplayer2.p361p0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings.Global;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.google.android.exoplayer2.p0.j */
/* compiled from: AudioCapabilities */
public final class C8834j {

    /* renamed from: c */
    public static final C8834j f18833c = new C8834j(new int[]{2}, 8);

    /* renamed from: d */
    private static final C8834j f18834d = new C8834j(new int[]{2, 5, 6}, 8);

    /* renamed from: a */
    private final int[] f18835a;

    /* renamed from: b */
    private final int f18836b;

    public C8834j(int[] iArr, int i) {
        if (iArr != null) {
            this.f18835a = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f18835a);
        } else {
            this.f18835a = new int[0];
        }
        this.f18836b = i;
    }

    /* renamed from: a */
    public static C8834j m25613a(Context context) {
        return m25614a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: b */
    private static boolean m25615b() {
        if (C9554k0.f22281a >= 17) {
            if ("Amazon".equals(C9554k0.f22283c)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8834j)) {
            return false;
        }
        C8834j jVar = (C8834j) obj;
        if (!Arrays.equals(this.f18835a, jVar.f18835a) || this.f18836b != jVar.f18836b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f18836b + (Arrays.hashCode(this.f18835a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.f18836b);
        sb.append(", supportedEncodings=");
        sb.append(Arrays.toString(this.f18835a));
        sb.append("]");
        return sb.toString();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static C8834j m25614a(Context context, Intent intent) {
        if (m25615b() && Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f18834d;
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f18833c;
        }
        return new C8834j(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: a */
    public boolean mo23084a(int i) {
        return Arrays.binarySearch(this.f18835a, i) >= 0;
    }

    /* renamed from: a */
    public int mo23083a() {
        return this.f18836b;
    }
}
