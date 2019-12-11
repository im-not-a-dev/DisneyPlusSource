package androidx.media;

import androidx.versionedparcelable.C0990b;
import androidx.versionedparcelable.C0992d;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0990b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3040a = (C0751a) bVar.mo5452a(audioAttributesCompat.f3040a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0990b bVar) {
        bVar.mo5463a(false, false);
        bVar.mo5472b((C0992d) audioAttributesCompat.f3040a, 1);
    }
}
