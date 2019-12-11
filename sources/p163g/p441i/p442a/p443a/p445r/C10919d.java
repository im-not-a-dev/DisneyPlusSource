package p163g.p441i.p442a.p443a.p445r;

import net.danlew.android.joda.DateUtils;
import p163g.p441i.p442a.p443a.p448u.C10936c;

/* renamed from: g.i.a.a.r.d */
/* compiled from: JsonStringEncoder */
public final class C10919d {

    /* renamed from: a */
    protected C10936c f25915a;

    /* renamed from: b */
    protected final char[] f25916b = new char[6];

    static {
        C10916a.m34447b();
        C10916a.m34446a();
    }

    public C10919d() {
        char[] cArr = this.f25916b;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    /* renamed from: a */
    public byte[] mo28117a(String str) {
        int i;
        C10936c cVar = this.f25915a;
        if (cVar == null) {
            cVar = new C10936c(null);
            this.f25915a = cVar;
        }
        int length = str.length();
        byte[] c = cVar.mo28182c();
        int length2 = c.length;
        byte[] bArr = c;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= length2) {
                    byte[] a = cVar.mo28179a();
                    i3 = 0;
                    bArr = a;
                    length2 = a.length;
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                int i6 = i4 + 1;
                int charAt2 = str.charAt(i4);
                i4 = i6;
                charAt = charAt2;
                i3 = i5;
            }
            if (i3 >= length2) {
                bArr = cVar.mo28179a();
                length2 = bArr.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i = i7;
            } else if (charAt < 55296 || charAt > 57343) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 12) | 224);
                if (i8 >= length2) {
                    bArr = cVar.mo28179a();
                    length2 = bArr.length;
                    i8 = 0;
                }
                i = i8 + 1;
                bArr[i8] = (byte) (((charAt >> 6) & 63) | 128);
            } else if (charAt > 56319) {
                m34463a(charAt);
                throw null;
            } else if (i4 < length) {
                int i9 = i4 + 1;
                charAt = m34462a(charAt, str.charAt(i4));
                if (charAt <= 1114111) {
                    int i10 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 18) | 240);
                    if (i10 >= length2) {
                        bArr = cVar.mo28179a();
                        length2 = bArr.length;
                        i10 = 0;
                    }
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt >> 12) & 63) | 128);
                    if (i11 >= length2) {
                        byte[] a2 = cVar.mo28179a();
                        i11 = 0;
                        bArr = a2;
                        length2 = a2.length;
                    }
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((charAt >> 6) & 63) | 128);
                    i = i12;
                    i4 = i9;
                } else {
                    m34463a(charAt);
                    throw null;
                }
            } else {
                m34463a(charAt);
                throw null;
            }
            if (i >= length2) {
                byte[] a3 = cVar.mo28179a();
                i = 0;
                bArr = a3;
                length2 = a3.length;
            }
            int i13 = i + 1;
            bArr[i] = (byte) ((charAt & 63) | 128);
            i2 = i4;
            i3 = i13;
        }
        return this.f25915a.mo28183c(i3);
    }

    /* renamed from: a */
    private static int m34462a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + DateUtils.FORMAT_ABBREV_MONTH + (i2 - 56320);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i2));
        sb.append("; illegal combination");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static void m34463a(int i) {
        throw new IllegalArgumentException(C10923h.m34487d(i));
    }
}
