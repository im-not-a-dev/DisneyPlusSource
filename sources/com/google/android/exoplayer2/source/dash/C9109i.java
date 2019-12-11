package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.p356g.C8749c;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.dash.p376k.C9119e;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.dash.i */
/* compiled from: EventSampleStream */
final class C9109i implements C9141f0 {

    /* renamed from: U */
    private final C8749c f20393U = new C8749c();

    /* renamed from: V */
    private long[] f20394V;

    /* renamed from: W */
    private boolean f20395W;

    /* renamed from: X */
    private C9119e f20396X;

    /* renamed from: Y */
    private boolean f20397Y;

    /* renamed from: Z */
    private int f20398Z;

    /* renamed from: a0 */
    private long f20399a0 = -9223372036854775807L;

    /* renamed from: c */
    private final Format f20400c;

    public C9109i(C9119e eVar, Format format, boolean z) {
        this.f20400c = format;
        this.f20396X = eVar;
        this.f20394V = eVar.f20450b;
        mo23661a(eVar, z);
    }

    /* renamed from: a */
    public void mo23574a() throws IOException {
    }

    /* renamed from: a */
    public void mo23661a(C9119e eVar, boolean z) {
        int i = this.f20398Z;
        long j = i == 0 ? -9223372036854775807L : this.f20394V[i - 1];
        this.f20395W = z;
        this.f20396X = eVar;
        this.f20394V = eVar.f20450b;
        long j2 = this.f20399a0;
        if (j2 != -9223372036854775807L) {
            mo23660a(j2);
        } else if (j != -9223372036854775807L) {
            this.f20398Z = C9554k0.m29386a(this.f20394V, j, false, false);
        }
    }

    /* renamed from: b */
    public boolean mo23575b() {
        return true;
    }

    /* renamed from: c */
    public String mo23662c() {
        return this.f20396X.mo23720a();
    }

    /* renamed from: d */
    public int mo23576d(long j) {
        int max = Math.max(this.f20398Z, C9554k0.m29386a(this.f20394V, j, true, false));
        int i = max - this.f20398Z;
        this.f20398Z = max;
        return i;
    }

    /* renamed from: a */
    public void mo23660a(long j) {
        boolean z = false;
        this.f20398Z = C9554k0.m29386a(this.f20394V, j, true, false);
        if (this.f20395W && this.f20398Z == this.f20394V.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f20399a0 = j;
    }

    /* renamed from: a */
    public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
        if (z || !this.f20397Y) {
            b0Var.f18427a = this.f20400c;
            this.f20397Y = true;
            return -5;
        }
        int i = this.f20398Z;
        if (i != this.f20394V.length) {
            this.f20398Z = i + 1;
            byte[] a = this.f20393U.mo22890a(this.f20396X.f20449a[i]);
            if (a == null) {
                return -3;
            }
            eVar.mo23224f(a.length);
            eVar.mo23213e(1);
            eVar.f19023V.put(a);
            eVar.f19024W = this.f20394V[i];
            return -4;
        } else if (this.f20395W) {
            return -3;
        } else {
            eVar.mo23213e(4);
            return -4;
        }
    }
}
