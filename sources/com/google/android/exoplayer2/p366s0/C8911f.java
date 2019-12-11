package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.util.C9572w;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.f */
/* compiled from: DummyTrackOutput */
public final class C8911f implements C8924q {
    /* renamed from: a */
    public int mo23302a(C8913h hVar, int i, boolean z) throws IOException, InterruptedException {
        int b = hVar.mo23292b(i);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo23303a(long j, int i, int i2, int i3, C8925a aVar) {
    }

    /* renamed from: a */
    public void mo23304a(Format format) {
    }

    /* renamed from: a */
    public void mo23305a(C9572w wVar, int i) {
        wVar.mo24695f(i);
    }
}
