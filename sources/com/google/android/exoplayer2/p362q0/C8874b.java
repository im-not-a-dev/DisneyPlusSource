package com.google.android.exoplayer2.p362q0;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.q0.b */
/* compiled from: CryptoInfo */
public final class C8874b {

    /* renamed from: a */
    public byte[] f19006a;

    /* renamed from: b */
    public int[] f19007b;

    /* renamed from: c */
    public int[] f19008c;

    /* renamed from: d */
    private final CryptoInfo f19009d = new CryptoInfo();

    /* renamed from: e */
    private final C8876b f19010e;

    @TargetApi(24)
    /* renamed from: com.google.android.exoplayer2.q0.b$b */
    /* compiled from: CryptoInfo */
    private static final class C8876b {

        /* renamed from: a */
        private final CryptoInfo f19011a;

        /* renamed from: b */
        private final Pattern f19012b;

        private C8876b(CryptoInfo cryptoInfo) {
            this.f19011a = cryptoInfo;
            this.f19012b = new Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m25930a(int i, int i2) {
            this.f19012b.set(i, i2);
            this.f19011a.setPattern(this.f19012b);
        }
    }

    public C8874b() {
        this.f19010e = C9554k0.f22281a >= 24 ? new C8876b(this.f19009d) : null;
    }

    /* renamed from: a */
    public void mo23216a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f19007b = iArr;
        this.f19008c = iArr2;
        this.f19006a = bArr2;
        CryptoInfo cryptoInfo = this.f19009d;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C9554k0.f22281a >= 24) {
            this.f19010e.m25930a(i3, i4);
        }
    }

    /* renamed from: a */
    public CryptoInfo mo23215a() {
        return this.f19009d;
    }
}
