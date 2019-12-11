package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C0990b;

public class IconCompatParcelizer {
    public static IconCompat read(C0990b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2191a = bVar.mo5450a(iconCompat.f2191a, 1);
        iconCompat.f2193c = bVar.mo5467a(iconCompat.f2193c, 2);
        iconCompat.f2194d = bVar.mo5451a(iconCompat.f2194d, 3);
        iconCompat.f2195e = bVar.mo5450a(iconCompat.f2195e, 4);
        iconCompat.f2196f = bVar.mo5450a(iconCompat.f2196f, 5);
        iconCompat.f2197g = (ColorStateList) bVar.mo5451a(iconCompat.f2197g, 6);
        iconCompat.f2199i = bVar.mo5455a(iconCompat.f2199i, 7);
        iconCompat.mo2707c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0990b bVar) {
        bVar.mo5463a(true, true);
        iconCompat.mo2705a(bVar.mo5478c());
        int i = iconCompat.f2191a;
        if (-1 != i) {
            bVar.mo5470b(i, 1);
        }
        byte[] bArr = iconCompat.f2193c;
        if (bArr != null) {
            bVar.mo5476b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2194d;
        if (parcelable != null) {
            bVar.mo5471b(parcelable, 3);
        }
        int i2 = iconCompat.f2195e;
        if (i2 != 0) {
            bVar.mo5470b(i2, 4);
        }
        int i3 = iconCompat.f2196f;
        if (i3 != 0) {
            bVar.mo5470b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2197g;
        if (colorStateList != null) {
            bVar.mo5471b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f2199i;
        if (str != null) {
            bVar.mo5474b(str, 7);
        }
    }
}
