package com.google.android.exoplayer2.source.p378l0;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.l0.a */
/* compiled from: AdPlaybackState */
public final class C9204a {

    /* renamed from: f */
    public static final C9204a f20836f = new C9204a(new long[0]);

    /* renamed from: a */
    public final int f20837a;

    /* renamed from: b */
    public final long[] f20838b;

    /* renamed from: c */
    public final C9205a[] f20839c;

    /* renamed from: d */
    public final long f20840d;

    /* renamed from: e */
    public final long f20841e;

    /* renamed from: com.google.android.exoplayer2.source.l0.a$a */
    /* compiled from: AdPlaybackState */
    public static final class C9205a {

        /* renamed from: a */
        public final int f20842a;

        /* renamed from: b */
        public final Uri[] f20843b;

        /* renamed from: c */
        public final int[] f20844c;

        /* renamed from: d */
        public final long[] f20845d;

        public C9205a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int mo23915a() {
            return mo23916a(-1);
        }

        /* renamed from: b */
        public boolean mo23917b() {
            return this.f20842a == -1 || mo23915a() < this.f20842a;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9205a.class != obj.getClass()) {
                return false;
            }
            C9205a aVar = (C9205a) obj;
            if (this.f20842a != aVar.f20842a || !Arrays.equals(this.f20843b, aVar.f20843b) || !Arrays.equals(this.f20844c, aVar.f20844c) || !Arrays.equals(this.f20845d, aVar.f20845d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f20842a * 31) + Arrays.hashCode(this.f20843b)) * 31) + Arrays.hashCode(this.f20844c)) * 31) + Arrays.hashCode(this.f20845d);
        }

        private C9205a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.f20842a = i;
            this.f20844c = iArr;
            this.f20843b = uriArr;
            this.f20845d = jArr;
        }

        /* renamed from: a */
        public int mo23916a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f20844c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }
    }

    public C9204a(long... jArr) {
        int length = jArr.length;
        this.f20837a = length;
        this.f20838b = Arrays.copyOf(jArr, length);
        this.f20839c = new C9205a[length];
        for (int i = 0; i < length; i++) {
            this.f20839c[i] = new C9205a();
        }
        this.f20840d = 0;
        this.f20841e = -9223372036854775807L;
    }

    /* renamed from: a */
    public int mo23911a(long j) {
        int length = this.f20838b.length - 1;
        while (length >= 0 && m27722a(j, length)) {
            length--;
        }
        if (length < 0 || !this.f20839c[length].mo23917b()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9204a.class != obj.getClass()) {
            return false;
        }
        C9204a aVar = (C9204a) obj;
        if (!(this.f20837a == aVar.f20837a && this.f20840d == aVar.f20840d && this.f20841e == aVar.f20841e && Arrays.equals(this.f20838b, aVar.f20838b) && Arrays.equals(this.f20839c, aVar.f20839c))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((((this.f20837a * 31) + ((int) this.f20840d)) * 31) + ((int) this.f20841e)) * 31) + Arrays.hashCode(this.f20838b)) * 31) + Arrays.hashCode(this.f20839c);
    }

    /* renamed from: a */
    public int mo23912a(long j, long j2) {
        if (j == Long.MIN_VALUE || (j2 != -9223372036854775807L && j >= j2)) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f20838b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.f20839c[i].mo23917b())) {
                i++;
            }
        }
        if (i >= this.f20838b.length) {
            i = -1;
        }
        return i;
    }

    /* renamed from: a */
    private boolean m27722a(long j, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j2 = this.f20838b[i];
        boolean z = true;
        if (j2 == Long.MIN_VALUE) {
            long j3 = this.f20841e;
            if (j3 != -9223372036854775807L && j >= j3) {
                z = false;
            }
            return z;
        }
        if (j >= j2) {
            z = false;
        }
        return z;
    }
}
