package android.support.p001v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.C0990b;

/* renamed from: android.support.v4.media.AudioAttributesCompatParcelizer */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0990b bVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(bVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0990b bVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, bVar);
    }
}
