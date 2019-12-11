package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.source.C9141f0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.hls.l */
/* compiled from: HlsSampleStream */
final class C9166l implements C9141f0 {

    /* renamed from: U */
    private final C9167m f20633U;

    /* renamed from: V */
    private int f20634V = -1;

    /* renamed from: c */
    private final int f20635c;

    public C9166l(C9167m mVar, int i) {
        this.f20633U = mVar;
        this.f20635c = i;
    }

    /* renamed from: e */
    private boolean m27519e() {
        int i = this.f20634V;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public void mo23574a() throws IOException {
        if (this.f20634V != -2) {
            this.f20633U.mo23846i();
            return;
        }
        throw new C9174o(this.f20633U.mo23845f().mo23531a(this.f20635c).mo23902a(0).f18349b0);
    }

    /* renamed from: b */
    public boolean mo23575b() {
        return this.f20634V == -3 || (m27519e() && this.f20633U.mo23840b(this.f20634V));
    }

    /* renamed from: c */
    public void mo23825c() {
        Assertions.m29299a(this.f20634V == -1);
        this.f20634V = this.f20633U.mo23827a(this.f20635c);
    }

    /* renamed from: d */
    public void mo23826d() {
        if (this.f20634V != -1) {
            this.f20633U.mo23842c(this.f20635c);
            this.f20634V = -1;
        }
    }

    /* renamed from: d */
    public int mo23576d(long j) {
        if (m27519e()) {
            return this.f20633U.mo23828a(this.f20634V, j);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
        int i = -3;
        if (this.f20634V == -3) {
            eVar.mo23208b(4);
            return -4;
        }
        if (m27519e()) {
            i = this.f20633U.mo23829a(this.f20634V, b0Var, eVar, z);
        }
        return i;
    }
}
