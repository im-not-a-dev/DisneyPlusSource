package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* renamed from: com.google.android.exoplayer2.s0.v.n */
/* compiled from: TrackEncryptionBox */
public final class C8984n {

    /* renamed from: a */
    public final boolean f19673a;

    /* renamed from: b */
    public final String f19674b;

    /* renamed from: c */
    public final C8925a f19675c;

    /* renamed from: d */
    public final int f19676d;

    /* renamed from: e */
    public final byte[] f19677e;

    public C8984n(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        boolean z3 = i == 0;
        if (bArr2 != null) {
            z2 = false;
        }
        Assertions.checkArgument(z2 ^ z3);
        this.f19673a = z;
        this.f19674b = str;
        this.f19676d = i;
        this.f19677e = bArr2;
        this.f19675c = new C8925a(m26505a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m26505a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported protection scheme type '");
        sb.append(str);
        sb.append("'. Assuming AES-CTR crypto mode.");
        Log.m29500d("TrackEncryptionBox", sb.toString());
        return 1;
    }
}
