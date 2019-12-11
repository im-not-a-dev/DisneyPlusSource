package androidx.media;

import androidx.media.C0751a.C0752a;
import java.util.Arrays;

public class AudioAttributesImplBase implements C0751a {

    /* renamed from: a */
    public int f3045a = 0;

    /* renamed from: b */
    public int f3046b = 0;

    /* renamed from: c */
    public int f3047c = 0;

    /* renamed from: d */
    public int f3048d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C0750a implements C0752a {

        /* renamed from: a */
        private int f3049a = 0;

        /* renamed from: b */
        private int f3050b = 0;

        /* renamed from: c */
        private int f3051c = 0;

        /* renamed from: d */
        private int f3052d = -1;

        C0750a() {
        }

        public C0751a build() {
            return new AudioAttributesImplBase(this.f3050b, this.f3051c, this.f3049a, this.f3052d);
        }

        /* renamed from: a */
        public C0750a mo4191a(int i) {
            if (i != 10) {
                this.f3052d = i;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int mo4193a() {
        return this.f3046b;
    }

    /* renamed from: b */
    public int mo4194b() {
        int i = this.f3047c;
        int c = mo4195c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo4195c() {
        int i = this.f3048d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m3817a(false, this.f3047c, this.f3045a);
    }

    /* renamed from: d */
    public int mo4196d() {
        return this.f3045a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3046b == audioAttributesImplBase.mo4193a() && this.f3047c == audioAttributesImplBase.mo4194b() && this.f3045a == audioAttributesImplBase.mo4196d() && this.f3048d == audioAttributesImplBase.f3048d) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3046b), Integer.valueOf(this.f3047c), Integer.valueOf(this.f3045a), Integer.valueOf(this.f3048d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3048d != -1) {
            sb.append(" stream=");
            sb.append(this.f3048d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3819a(this.f3045a));
        sb.append(" content=");
        sb.append(this.f3046b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3047c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3046b = i;
        this.f3047c = i2;
        this.f3045a = i3;
        this.f3048d = i4;
    }
}
