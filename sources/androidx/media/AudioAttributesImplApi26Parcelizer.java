package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.C0990b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C0990b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3042a = (AudioAttributes) bVar.mo5451a(audioAttributesImplApi26.f3042a, 1);
        audioAttributesImplApi26.f3043b = bVar.mo5450a(audioAttributesImplApi26.f3043b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C0990b bVar) {
        bVar.mo5463a(false, false);
        bVar.mo5471b((Parcelable) audioAttributesImplApi26.f3042a, 1);
        bVar.mo5470b(audioAttributesImplApi26.f3043b, 2);
    }
}
