package com.google.android.gms.common.internal.p397z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.z.b */
public class C9919b {

    /* renamed from: com.google.android.gms.common.internal.z.b$a */
    public static class C9920a extends RuntimeException {
        public C9920a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m30888a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m30889a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static int m30894b(Parcel parcel) {
        int a = m30889a(parcel);
        int n = m30909n(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m30888a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C9920a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = n + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C9920a(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static String[] m30898c(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + n);
        return createStringArray;
    }

    /* renamed from: d */
    public static ArrayList<String> m30899d(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + n);
        return createStringArrayList;
    }

    /* renamed from: e */
    public static void m30900e(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C9920a(sb.toString(), parcel);
        }
    }

    /* renamed from: f */
    public static boolean m30901f(Parcel parcel, int i) {
        m30892a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: g */
    public static Boolean m30902g(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        if (n == 0) {
            return null;
        }
        m30893a(parcel, i, n, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: h */
    public static Double m30903h(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        if (n == 0) {
            return null;
        }
        m30893a(parcel, i, n, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: i */
    public static Float m30904i(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        if (n == 0) {
            return null;
        }
        m30893a(parcel, i, n, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: j */
    public static IBinder m30905j(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + n);
        return readStrongBinder;
    }

    /* renamed from: k */
    public static int m30906k(Parcel parcel, int i) {
        m30892a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: l */
    public static long m30907l(Parcel parcel, int i) {
        m30892a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: m */
    public static Long m30908m(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        if (n == 0) {
            return null;
        }
        m30893a(parcel, i, n, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: n */
    public static int m30909n(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: o */
    public static void m30910o(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m30909n(parcel, i));
    }

    /* renamed from: a */
    private static void m30892a(Parcel parcel, int i, int i2) {
        int n = m30909n(parcel, i);
        if (n != i2) {
            String hexString = Integer.toHexString(n);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(n);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C9920a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m30893a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C9920a(sb.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m30897c(Parcel parcel, int i, Creator<T> creator) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + n);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m30891a(Parcel parcel, int i, Creator<T> creator) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + n);
        return t;
    }

    /* renamed from: b */
    public static String m30895b(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + n);
        return readString;
    }

    /* renamed from: a */
    public static Bundle m30890a(Parcel parcel, int i) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + n);
        return readBundle;
    }

    /* renamed from: b */
    public static <T> T[] m30896b(Parcel parcel, int i, Creator<T> creator) {
        int n = m30909n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + n);
        return createTypedArray;
    }
}
