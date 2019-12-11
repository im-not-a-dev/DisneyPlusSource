package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.p0.g */
/* compiled from: Ac3Util */
public final class C8825g {

    /* renamed from: a */
    private static final int[] f18809a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f18810b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f18811c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f18812d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f18813e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, DateUtils.FORMAT_NO_NOON, 576, 640};

    /* renamed from: f */
    private static final int[] f18814f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.google.android.exoplayer2.p0.g$b */
    /* compiled from: Ac3Util */
    public static final class C8827b {

        /* renamed from: a */
        public final String f18815a;

        /* renamed from: b */
        public final int f18816b;

        /* renamed from: c */
        public final int f18817c;

        /* renamed from: d */
        public final int f18818d;

        /* renamed from: e */
        public final int f18819e;

        private C8827b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f18815a = str;
            this.f18817c = i2;
            this.f18816b = i3;
            this.f18818d = i4;
            this.f18819e = i5;
        }
    }

    /* renamed from: a */
    public static int m25595a() {
        return 1536;
    }

    /* renamed from: a */
    public static Format m25600a(C9572w wVar, String str, String str2, DrmInitData drmInitData) {
        int i = f18810b[(wVar.mo24711v() & 192) >> 6];
        int v = wVar.mo24711v();
        int i2 = f18812d[(v & 56) >> 3];
        if ((v & 4) != 0) {
            i2++;
        }
        return Format.m24875a(str, "audio/ac3", (String) null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: b */
    public static Format m25604b(C9572w wVar, String str, String str2, DrmInitData drmInitData) {
        C9572w wVar2 = wVar;
        wVar.mo24695f(2);
        int i = f18810b[(wVar.mo24711v() & 192) >> 6];
        int v = wVar.mo24711v();
        int i2 = f18812d[(v & 14) >> 1];
        if ((v & 1) != 0) {
            i2++;
        }
        if (((wVar.mo24711v() & 30) >> 1) > 0 && (2 & wVar.mo24711v()) != 0) {
            i2 += 2;
        }
        return Format.m24875a(str, (wVar.mo24679a() <= 0 || (wVar.mo24711v() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static C8827b m25601a(C9571v vVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        C9571v vVar2 = vVar;
        int d = vVar.mo24671d();
        vVar2.mo24670c(40);
        boolean z = vVar2.mo24660a(5) == 16;
        vVar2.mo24667b(d);
        int i10 = -1;
        if (z) {
            vVar2.mo24670c(16);
            int a = vVar2.mo24660a(2);
            if (a == 0) {
                i10 = 0;
            } else if (a == 1) {
                i10 = 1;
            } else if (a == 2) {
                i10 = 2;
            }
            vVar2.mo24670c(3);
            int a2 = (vVar2.mo24660a(11) + 1) * 2;
            int a3 = vVar2.mo24660a(2);
            if (a3 == 3) {
                i6 = f18811c[vVar2.mo24660a(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = vVar2.mo24660a(2);
                i7 = f18809a[i8];
                i6 = f18810b[a3];
            }
            int i11 = i7 * 256;
            int a4 = vVar2.mo24660a(3);
            boolean e = vVar.mo24673e();
            int i12 = f18812d[a4] + (e ? 1 : 0);
            vVar2.mo24670c(10);
            if (vVar.mo24673e()) {
                vVar2.mo24670c(8);
            }
            if (a4 == 0) {
                vVar2.mo24670c(5);
                if (vVar.mo24673e()) {
                    vVar2.mo24670c(8);
                }
            }
            if (i10 == 1 && vVar.mo24673e()) {
                vVar2.mo24670c(16);
            }
            if (vVar.mo24673e()) {
                if (a4 > 2) {
                    vVar2.mo24670c(2);
                }
                if ((a4 & 1) != 0 && a4 > 2) {
                    vVar2.mo24670c(6);
                }
                if ((a4 & 4) != 0) {
                    vVar2.mo24670c(6);
                }
                if (e && vVar.mo24673e()) {
                    vVar2.mo24670c(5);
                }
                if (i10 == 0) {
                    if (vVar.mo24673e()) {
                        vVar2.mo24670c(6);
                    }
                    if (a4 == 0 && vVar.mo24673e()) {
                        vVar2.mo24670c(6);
                    }
                    if (vVar.mo24673e()) {
                        vVar2.mo24670c(6);
                    }
                    int a5 = vVar2.mo24660a(2);
                    if (a5 == 1) {
                        vVar2.mo24670c(5);
                    } else if (a5 == 2) {
                        vVar2.mo24670c(12);
                    } else if (a5 == 3) {
                        int a6 = vVar2.mo24660a(5);
                        if (vVar.mo24673e()) {
                            vVar2.mo24670c(5);
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(4);
                            }
                            if (vVar.mo24673e()) {
                                if (vVar.mo24673e()) {
                                    vVar2.mo24670c(4);
                                }
                                if (vVar.mo24673e()) {
                                    vVar2.mo24670c(4);
                                }
                            }
                        }
                        if (vVar.mo24673e()) {
                            vVar2.mo24670c(5);
                            if (vVar.mo24673e()) {
                                vVar2.mo24670c(7);
                                if (vVar.mo24673e()) {
                                    vVar2.mo24670c(8);
                                }
                            }
                        }
                        vVar2.mo24670c((a6 + 2) * 8);
                        vVar.mo24666b();
                    }
                    if (a4 < 2) {
                        if (vVar.mo24673e()) {
                            vVar2.mo24670c(14);
                        }
                        if (a4 == 0 && vVar.mo24673e()) {
                            vVar2.mo24670c(14);
                        }
                    }
                    if (vVar.mo24673e()) {
                        if (i8 == 0) {
                            vVar2.mo24670c(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (vVar.mo24673e()) {
                                    vVar2.mo24670c(5);
                                }
                            }
                        }
                    }
                }
            }
            if (vVar.mo24673e()) {
                vVar2.mo24670c(5);
                if (a4 == 2) {
                    vVar2.mo24670c(4);
                }
                if (a4 >= 6) {
                    vVar2.mo24670c(2);
                }
                if (vVar.mo24673e()) {
                    vVar2.mo24670c(8);
                }
                if (a4 == 0 && vVar.mo24673e()) {
                    vVar2.mo24670c(8);
                }
                i9 = 3;
                if (a3 < 3) {
                    vVar.mo24674f();
                }
            } else {
                i9 = 3;
            }
            if (i10 == 0 && i8 != i9) {
                vVar.mo24674f();
            }
            if (i10 == 2 && (i8 == i9 || vVar.mo24673e())) {
                vVar2.mo24670c(6);
            }
            str = (vVar.mo24673e() && vVar2.mo24660a(6) == 1 && vVar2.mo24660a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i10;
            i2 = a2;
            i3 = i6;
            i = i11;
            i4 = i12;
        } else {
            vVar2.mo24670c(32);
            int a7 = vVar2.mo24660a(2);
            String str2 = a7 == 3 ? null : "audio/ac3";
            int a8 = m25596a(a7, vVar2.mo24660a(6));
            vVar2.mo24670c(8);
            int a9 = vVar2.mo24660a(3);
            if (!((a9 & 1) == 0 || a9 == 1)) {
                vVar2.mo24670c(2);
            }
            if ((a9 & 4) != 0) {
                vVar2.mo24670c(2);
            }
            if (a9 == 2) {
                vVar2.mo24670c(2);
            }
            int[] iArr = f18810b;
            str = str2;
            i2 = a8;
            i3 = a7 < iArr.length ? iArr[a7] : -1;
            i4 = f18812d[a9] + (vVar.mo24673e() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        C8827b bVar = new C8827b(str, i5, i4, i3, i2, i);
        return bVar;
    }

    /* renamed from: b */
    public static int m25602b(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f18809a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static int m25603b(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    /* renamed from: a */
    public static int m25599a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 255) >> 3) == 16)) {
            return m25596a((bArr[4] & 192) >> 6, (int) bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: a */
    public static int m25597a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m25598a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: a */
    private static int m25596a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f18810b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f18814f;
                if (i3 < iArr2.length) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return (iArr2[i3] + (i2 % 2)) * 2;
                    }
                    int i5 = f18813e[i3];
                    return i4 == 32000 ? i5 * 6 : i5 * 4;
                }
            }
        }
        return -1;
    }
}
