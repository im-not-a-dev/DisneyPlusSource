package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.C0990b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C0990b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3042a = (AudioAttributes) bVar.mo5451a(audioAttributesImplApi21.f3042a, 1);
        audioAttributesImplApi21.f3043b = bVar.mo5450a(audioAttributesImplApi21.f3043b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C0990b bVar) {
        bVar.mo5463a(false, false);
        bVar.mo5471b((Parcelable) audioAttributesImplApi21.f3042a, 1);
        bVar.mo5470b(audioAttributesImplApi21.f3043b, 2);
    }
}
