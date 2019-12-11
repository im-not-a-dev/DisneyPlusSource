package com.google.android.exoplayer2.p382u0.p384n;

import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.n.a */
/* compiled from: DvbDecoder */
public final class C9349a extends C9323c {

    /* renamed from: n */
    private final C9350b f21470n;

    public C9349a(List<byte[]> list) {
        super("DvbDecoder");
        C9572w wVar = new C9572w((byte[]) list.get(0));
        this.f21470n = new C9350b(wVar.mo24676B(), wVar.mo24676B());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9359c m28500a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f21470n.mo24186a();
        }
        return new C9359c(this.f21470n.mo24185a(bArr, i));
    }
}
