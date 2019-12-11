package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    static class C0749a extends C0748a {
        C0749a() {
        }

        public C0751a build() {
            return new AudioAttributesImplApi26(this.f3044a.build());
        }
    }

    AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
