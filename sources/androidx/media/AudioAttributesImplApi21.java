package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import androidx.media.C0751a.C0752a;

public class AudioAttributesImplApi21 implements C0751a {

    /* renamed from: a */
    public AudioAttributes f3042a;

    /* renamed from: b */
    public int f3043b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C0748a implements C0752a {

        /* renamed from: a */
        final Builder f3044a = new Builder();

        C0748a() {
        }

        public C0751a build() {
            return new AudioAttributesImplApi21(this.f3044a.build());
        }

        /* renamed from: a */
        public C0748a mo4191a(int i) {
            this.f3044a.setLegacyStreamType(i);
            return this;
        }
    }

    AudioAttributesImplApi21() {
        this.f3043b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3042a.equals(((AudioAttributesImplApi21) obj).f3042a);
    }

    public int hashCode() {
        return this.f3042a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f3042a);
        return sb.toString();
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3043b = -1;
        this.f3042a = audioAttributes;
        this.f3043b = i;
    }
}
