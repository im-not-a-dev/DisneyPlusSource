package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.p359j.C8770h;
import com.google.android.exoplayer2.metadata.p359j.C8770h.C8771a;
import com.google.android.exoplayer2.util.C9572w;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.l */
/* compiled from: Id3Peeker */
public final class C8917l {

    /* renamed from: a */
    private final C9572w f19148a = new C9572w(10);

    /* renamed from: a */
    public Metadata mo23317a(C8913h hVar, C8771a aVar) throws IOException, InterruptedException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                hVar.mo23294b(this.f19148a.f22333a, 0, 10);
                this.f19148a.mo24693e(0);
                if (this.f19148a.mo24714y() != C8770h.f18621b) {
                    break;
                }
                this.f19148a.mo24695f(3);
                int u = this.f19148a.mo24710u();
                int i2 = u + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f19148a.f22333a, 0, bArr, 0, 10);
                    hVar.mo23294b(bArr, 10, u);
                    metadata = new C8770h(aVar).mo22946a(bArr, i2);
                } else {
                    hVar.mo23288a(u);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        hVar.mo23297c();
        hVar.mo23288a(i);
        return metadata;
    }
}
