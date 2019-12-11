package com.google.android.exoplayer2.metadata.p360k;

import com.google.android.exoplayer2.metadata.C8739b;
import com.google.android.exoplayer2.metadata.C8742d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.metadata.k.c */
/* compiled from: SpliceInfoDecoder */
public final class C8787c implements C8739b {

    /* renamed from: a */
    private final C9572w f18644a = new C9572w();

    /* renamed from: b */
    private final C9571v f18645b = new C9571v();

    /* renamed from: c */
    private C9545h0 f18646c;

    /* renamed from: a */
    public Metadata mo22875a(C8742d dVar) {
        C9545h0 h0Var = this.f18646c;
        if (h0Var == null || dVar.f18557Y != h0Var.mo24633c()) {
            this.f18646c = new C9545h0(dVar.f19024W);
            this.f18646c.mo24630a(dVar.f19024W - dVar.f18557Y);
        }
        ByteBuffer byteBuffer = dVar.f19023V;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f18644a.mo24684a(array, limit);
        this.f18645b.mo24664a(array, limit);
        this.f18645b.mo24670c(39);
        long a = (((long) this.f18645b.mo24660a(1)) << 32) | ((long) this.f18645b.mo24660a(32));
        this.f18645b.mo24670c(20);
        int a2 = this.f18645b.mo24660a(12);
        int a3 = this.f18645b.mo24660a(8);
        C8737b bVar = null;
        this.f18644a.mo24695f(14);
        if (a3 == 0) {
            bVar = new C8791e();
        } else if (a3 == 255) {
            bVar = C8784a.m25425a(this.f18644a, a2, a);
        } else if (a3 == 4) {
            bVar = C8793f.m25432a(this.f18644a);
        } else if (a3 == 5) {
            bVar = C8788d.m25429a(this.f18644a, a, this.f18646c);
        } else if (a3 == 6) {
            bVar = C8797g.m25444a(this.f18644a, a, this.f18646c);
        }
        if (bVar == null) {
            return new Metadata(new C8737b[0]);
        }
        return new Metadata(bVar);
    }
}
