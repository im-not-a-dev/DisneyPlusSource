package com.google.android.gms.common.internal.p397z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.z.c */
public class C9921c {
    /* renamed from: a */
    public static int m30911a(Parcel parcel) {
        return m30928b(parcel, 20293);
    }

    /* renamed from: b */
    private static void m30929b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: c */
    private static void m30931c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static void m30912a(Parcel parcel, int i) {
        m30931c(parcel, i);
    }

    /* renamed from: a */
    public static void m30924a(Parcel parcel, int i, boolean z) {
        m30929b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    private static int m30928b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: a */
    public static void m30918a(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        m30929b(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m30930b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m30927a(parcel, (T) parcelable, 0);
            }
        }
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30913a(Parcel parcel, int i, int i2) {
        m30929b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m30914a(Parcel parcel, int i, long j) {
        m30929b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m30921a(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        m30929b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    /* renamed from: a */
    public static void m30920a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        m30929b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* renamed from: a */
    public static void m30919a(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        m30929b(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* renamed from: a */
    public static void m30922a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeString(str);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30916a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30917a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30915a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeBundle(bundle);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30926a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeStringArray(strArr);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static void m30923a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeStringList(list);
        m30931c(parcel, b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m30925a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m30929b(parcel, i, 0);
            }
            return;
        }
        int b = m30928b(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m30927a(parcel, t, i2);
            }
        }
        m30931c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m30927a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
