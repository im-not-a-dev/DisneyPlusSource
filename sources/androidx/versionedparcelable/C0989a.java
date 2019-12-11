package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: ParcelUtils */
public class C0989a {
    private C0989a() {
    }

    /* renamed from: a */
    public static Parcelable m5309a(C0992d dVar) {
        return new ParcelImpl(dVar);
    }

    /* renamed from: a */
    public static <T extends C0992d> T m5311a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo5445X();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: a */
    public static void m5312a(Bundle bundle, String str, C0992d dVar) {
        if (dVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m5309a(dVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: a */
    public static <T extends C0992d> T m5310a(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C0989a.class.getClassLoader());
            return m5311a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
