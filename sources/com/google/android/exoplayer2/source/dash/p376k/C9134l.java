package com.google.android.exoplayer2.source.dash.p376k;

import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.source.dash.k.l */
/* compiled from: UrlTemplate */
public final class C9134l {

    /* renamed from: a */
    private final String[] f20490a;

    /* renamed from: b */
    private final int[] f20491b;

    /* renamed from: c */
    private final String[] f20492c;

    /* renamed from: d */
    private final int f20493d;

    private C9134l(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f20490a = strArr;
        this.f20491b = iArr;
        this.f20492c = strArr2;
        this.f20493d = i;
    }

    /* renamed from: a */
    public static C9134l m27374a(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C9134l(strArr, iArr, strArr2, m27373a(str, strArr, iArr, strArr2));
    }

    /* renamed from: a */
    public String mo23744a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f20493d;
            if (i2 < i3) {
                sb.append(this.f20490a[i2]);
                int[] iArr = this.f20491b;
                if (iArr[i2] == 1) {
                    sb.append(str);
                } else if (iArr[i2] == 2) {
                    sb.append(String.format(Locale.US, this.f20492c[i2], new Object[]{Long.valueOf(j)}));
                } else if (iArr[i2] == 3) {
                    sb.append(String.format(Locale.US, this.f20492c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (iArr[i2] == 4) {
                    sb.append(String.format(Locale.US, this.f20492c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f20490a[i3]);
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    private static int m27373a(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        String str3 = "";
        strArr[0] = str3;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            String str4 = "$";
            int indexOf = str.indexOf(str4, i);
            char c = 65535;
            if (indexOf == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i2]);
                sb.append(str.substring(i));
                strArr[i2] = sb.toString();
                i = str.length();
            } else if (indexOf != i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr[i2]);
                sb2.append(str.substring(i, indexOf));
                strArr[i2] = sb2.toString();
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strArr[i2]);
                sb3.append(str4);
                strArr[i2] = sb3.toString();
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf(str4, i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        String str5 = "d";
                        if (!str2.endsWith(str5) && !str2.endsWith("x")) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append(str5);
                            str2 = sb4.toString();
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c == 2) {
                        iArr[i2] = 4;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid template: ");
                        sb5.append(str);
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = str3;
                i = indexOf2 + 1;
            }
        }
        return i2;
    }
}
