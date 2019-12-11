package com.google.android.exoplayer2.metadata.p356g;

import com.google.android.exoplayer2.metadata.C8739b;
import com.google.android.exoplayer2.metadata.C8742d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.g.b */
/* compiled from: EventMessageDecoder */
public final class C8748b implements C8739b {
    /* renamed from: a */
    public Metadata mo22875a(C8742d dVar) {
        ByteBuffer byteBuffer = dVar.f19023V;
        C8746a a = mo22889a(new C9572w(byteBuffer.array(), byteBuffer.limit()));
        if (a == null) {
            return null;
        }
        return new Metadata(a);
    }

    /* renamed from: a */
    public C8746a mo22889a(C9572w wVar) {
        try {
            String s = wVar.mo24708s();
            C9537e.m29296a(s);
            String str = s;
            String s2 = wVar.mo24708s();
            C9537e.m29296a(s2);
            C8746a aVar = new C8746a(str, s2, wVar.mo24713x(), wVar.mo24713x(), Arrays.copyOfRange(wVar.f22333a, wVar.mo24688c(), wVar.mo24690d()));
            return aVar;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
