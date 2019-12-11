package androidx.media;

import androidx.versionedparcelable.C0990b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C0990b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3045a = bVar.mo5450a(audioAttributesImplBase.f3045a, 1);
        audioAttributesImplBase.f3046b = bVar.mo5450a(audioAttributesImplBase.f3046b, 2);
        audioAttributesImplBase.f3047c = bVar.mo5450a(audioAttributesImplBase.f3047c, 3);
        audioAttributesImplBase.f3048d = bVar.mo5450a(audioAttributesImplBase.f3048d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C0990b bVar) {
        bVar.mo5463a(false, false);
        bVar.mo5470b(audioAttributesImplBase.f3045a, 1);
        bVar.mo5470b(audioAttributesImplBase.f3046b, 2);
        bVar.mo5470b(audioAttributesImplBase.f3047c, 3);
        bVar.mo5470b(audioAttributesImplBase.f3048d, 4);
    }
}
