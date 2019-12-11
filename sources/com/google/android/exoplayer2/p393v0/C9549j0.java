package com.google.android.exoplayer2.p393v0;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.exoplayer2.v0.j0 */
/* compiled from: UriUtil */
public final class C9549j0 {
    /* renamed from: a */
    public static String m29365a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        int[] a = m29367a(str2);
        if (a[0] != -1) {
            sb.append(str2);
            m29366a(sb, a[1], a[2]);
            return sb.toString();
        }
        int[] a2 = m29367a(str);
        if (a[3] == 0) {
            sb.append(str, 0, a2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (a[2] == 0) {
            sb.append(str, 0, a2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (a[1] != 0) {
            int i = a2[0] + 1;
            sb.append(str, 0, i);
            sb.append(str2);
            return m29366a(sb, a[1] + i, i + a[2]);
        } else if (str2.charAt(a[1]) == '/') {
            sb.append(str, 0, a2[1]);
            sb.append(str2);
            return m29366a(sb, a2[1], a2[1] + a[2]);
        } else if (a2[0] + 2 >= a2[1] || a2[1] != a2[2]) {
            int lastIndexOf = str.lastIndexOf(47, a2[2] - 1);
            int i2 = lastIndexOf == -1 ? a2[1] : lastIndexOf + 1;
            sb.append(str, 0, i2);
            sb.append(str2);
            return m29366a(sb, a2[1], i2 + a[2]);
        } else {
            sb.append(str, 0, a2[1]);
            sb.append('/');
            sb.append(str2);
            return m29366a(sb, a2[1], a2[1] + a[2] + 1);
        }
    }

    /* renamed from: b */
    public static Uri m29368b(String str, String str2) {
        return Uri.parse(m29365a(str, str2));
    }

    /* renamed from: a */
    private static String m29366a(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i2;
        while (true) {
            int i7 = i5;
            while (i7 <= i6) {
                if (i7 == i6) {
                    i3 = i7;
                } else if (sb.charAt(i7) == '/') {
                    i3 = i7 + 1;
                } else {
                    i7++;
                }
                int i8 = i5 + 1;
                if (i7 == i8 && sb.charAt(i5) == '.') {
                    sb.delete(i5, i3);
                    i6 -= i3 - i5;
                } else {
                    if (i7 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i8) == '.') {
                        i4 = sb.lastIndexOf("/", i5 - 2) + 1;
                        int i9 = i4 > i ? i4 : i;
                        sb.delete(i9, i3);
                        i6 -= i3 - i9;
                    } else {
                        i4 = i7 + 1;
                    }
                    i5 = i4;
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    private static int[] m29367a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
