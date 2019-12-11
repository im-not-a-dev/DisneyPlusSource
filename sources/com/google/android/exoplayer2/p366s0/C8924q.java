package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.q */
/* compiled from: TrackOutput */
public interface C8924q {

    /* renamed from: com.google.android.exoplayer2.s0.q$a */
    /* compiled from: TrackOutput */
    public static final class C8925a {

        /* renamed from: a */
        public final int f19171a;

        /* renamed from: b */
        public final byte[] f19172b;

        /* renamed from: c */
        public final int f19173c;

        /* renamed from: d */
        public final int f19174d;

        public C8925a(int i, byte[] bArr, int i2, int i3) {
            this.f19171a = i;
            this.f19172b = bArr;
            this.f19173c = i2;
            this.f19174d = i3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C8925a.class != obj.getClass()) {
                return false;
            }
            C8925a aVar = (C8925a) obj;
            if (!(this.f19171a == aVar.f19171a && this.f19173c == aVar.f19173c && this.f19174d == aVar.f19174d && Arrays.equals(this.f19172b, aVar.f19172b))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f19171a * 31) + Arrays.hashCode(this.f19172b)) * 31) + this.f19173c) * 31) + this.f19174d;
        }
    }

    /* renamed from: a */
    int mo23302a(C8913h hVar, int i, boolean z) throws IOException, InterruptedException;

    /* renamed from: a */
    void mo23303a(long j, int i, int i2, int i3, C8925a aVar);

    /* renamed from: a */
    void mo23304a(Format format);

    /* renamed from: a */
    void mo23305a(C9572w wVar, int i);
}
