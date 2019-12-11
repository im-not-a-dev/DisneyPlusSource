package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;
import sun.misc.Unsafe;

/* renamed from: g.j.a.a.d.g.s5 */
final class C11302s5<T> implements C11077d6<T> {

    /* renamed from: r */
    private static final int[] f26503r = new int[0];

    /* renamed from: s */
    private static final Unsafe f26504s = C11058c7.m34865c();

    /* renamed from: a */
    private final int[] f26505a;

    /* renamed from: b */
    private final Object[] f26506b;

    /* renamed from: c */
    private final int f26507c;

    /* renamed from: d */
    private final int f26508d;

    /* renamed from: e */
    private final C11259p5 f26509e;

    /* renamed from: f */
    private final boolean f26510f;

    /* renamed from: g */
    private final boolean f26511g;

    /* renamed from: h */
    private final boolean f26512h;

    /* renamed from: i */
    private final boolean f26513i;

    /* renamed from: j */
    private final int[] f26514j;

    /* renamed from: k */
    private final int f26515k;

    /* renamed from: l */
    private final int f26516l;

    /* renamed from: m */
    private final C11359w5 f26517m;

    /* renamed from: n */
    private final C11398z4 f26518n;

    /* renamed from: o */
    private final C11360w6<?, ?> f26519o;

    /* renamed from: p */
    private final C11314t3<?> f26520p;

    /* renamed from: q */
    private final C11154i5 f26521q;

    private C11302s5(int[] iArr, Object[] objArr, int i, int i2, C11259p5 p5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C11359w5 w5Var, C11398z4 z4Var, C11360w6<?, ?> w6Var, C11314t3<?> t3Var, C11154i5 i5Var) {
        this.f26505a = iArr;
        this.f26506b = objArr;
        this.f26507c = i;
        this.f26508d = i2;
        this.f26511g = p5Var instanceof C11090e4;
        this.f26512h = z;
        this.f26510f = t3Var != null && t3Var.mo28888a(p5Var);
        this.f26513i = false;
        this.f26514j = iArr2;
        this.f26515k = i3;
        this.f26516l = i4;
        this.f26517m = w5Var;
        this.f26518n = z4Var;
        this.f26519o = w6Var;
        this.f26520p = t3Var;
        this.f26509e = p5Var;
        this.f26521q = i5Var;
    }

    /* renamed from: a */
    static <T> C11302s5<T> m36084a(Class<T> cls, C11231n5 n5Var, C11359w5 w5Var, C11398z4 z4Var, C11360w6<?, ?> w6Var, C11314t3<?> t3Var, C11154i5 i5Var) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Class cls2;
        int i17;
        int i18;
        Field field;
        int i19;
        char charAt;
        int i20;
        char c2;
        Field field2;
        Field field3;
        int i21;
        char charAt2;
        int i22;
        char charAt3;
        int i23;
        char charAt4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        char charAt5;
        int i30;
        char charAt6;
        int i31;
        char charAt7;
        int i32;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        C11231n5 n5Var2 = n5Var;
        if (n5Var2 instanceof C11042b6) {
            C11042b6 b6Var = (C11042b6) n5Var2;
            char c3 = 0;
            boolean z = b6Var.mo28318c() == C11094d.f26171j;
            String d = b6Var.mo28319d();
            int length = d.length();
            char charAt15 = d.charAt(0);
            if (charAt15 >= 55296) {
                char c4 = charAt15 & 8191;
                int i33 = 1;
                int i34 = 13;
                while (true) {
                    i = i33 + 1;
                    charAt14 = d.charAt(i33);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c4 |= (charAt14 & 8191) << i34;
                    i34 += 13;
                    i33 = i;
                }
                charAt15 = (charAt14 << i34) | c4;
            } else {
                i = 1;
            }
            int i35 = i + 1;
            char charAt16 = d.charAt(i);
            if (charAt16 >= 55296) {
                char c5 = charAt16 & 8191;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt13 = d.charAt(i35);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c5 |= (charAt13 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt16 = c5 | (charAt13 << i36);
            } else {
                i2 = i35;
            }
            if (charAt16 == 0) {
                iArr = f26503r;
                c = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i37 = i2 + 1;
                int charAt17 = d.charAt(i2);
                if (charAt17 >= 55296) {
                    int i38 = charAt17 & 8191;
                    int i39 = 13;
                    while (true) {
                        i24 = i37 + 1;
                        charAt12 = d.charAt(i37);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i38 |= (charAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i24;
                    }
                    charAt17 = (charAt12 << i39) | i38;
                } else {
                    i24 = i37;
                }
                int i40 = i24 + 1;
                char charAt18 = d.charAt(i24);
                if (charAt18 >= 55296) {
                    char c6 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i25 = i40 + 1;
                        charAt11 = d.charAt(i40);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c6 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i40 = i25;
                    }
                    charAt18 = c6 | (charAt11 << i41);
                } else {
                    i25 = i40;
                }
                int i42 = i25 + 1;
                int charAt19 = d.charAt(i25);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i26 = i42 + 1;
                        charAt10 = d.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i26;
                    }
                    charAt19 = (charAt10 << i44) | i43;
                } else {
                    i26 = i42;
                }
                int i45 = i26 + 1;
                i5 = d.charAt(i26);
                if (i5 >= 55296) {
                    int i46 = i5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i27 = i45 + 1;
                        charAt9 = d.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i27;
                    }
                    i5 = (charAt9 << i47) | i46;
                } else {
                    i27 = i45;
                }
                int i48 = i27 + 1;
                i4 = d.charAt(i27);
                if (i4 >= 55296) {
                    int i49 = i4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i32 = i48 + 1;
                        charAt8 = d.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i32;
                    }
                    i4 = (charAt8 << i50) | i49;
                    i48 = i32;
                }
                int i51 = i48 + 1;
                c = d.charAt(i48);
                if (c >= 55296) {
                    char c7 = c & 8191;
                    int i52 = 13;
                    while (true) {
                        i31 = i51 + 1;
                        charAt7 = d.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c7 |= (charAt7 & 8191) << i52;
                        i52 += 13;
                        i51 = i31;
                    }
                    c = c7 | (charAt7 << i52);
                    i51 = i31;
                }
                int i53 = i51 + 1;
                char charAt20 = d.charAt(i51);
                if (charAt20 >= 55296) {
                    int i54 = 13;
                    int i55 = i53;
                    int i56 = charAt20 & 8191;
                    int i57 = i55;
                    while (true) {
                        i30 = i57 + 1;
                        charAt6 = d.charAt(i57);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i56 |= (charAt6 & 8191) << i54;
                        i54 += 13;
                        i57 = i30;
                    }
                    charAt20 = i56 | (charAt6 << i54);
                    i28 = i30;
                } else {
                    i28 = i53;
                }
                int i58 = i28 + 1;
                c3 = d.charAt(i28);
                if (c3 >= 55296) {
                    int i59 = 13;
                    int i60 = i58;
                    int i61 = c3 & 8191;
                    int i62 = i60;
                    while (true) {
                        i29 = i62 + 1;
                        charAt5 = d.charAt(i62);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i61 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i62 = i29;
                    }
                    c3 = i61 | (charAt5 << i59);
                    i58 = i29;
                }
                iArr = new int[(c3 + c + charAt20)];
                i6 = (charAt17 << 1) + charAt18;
                int i63 = i58;
                i3 = charAt17;
                i7 = charAt19;
                i2 = i63;
            }
            Unsafe unsafe = f26504s;
            Object[] e = b6Var.mo28320e();
            Class cls3 = b6Var.mo28316a().getClass();
            int i64 = i6;
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i65 = c3 + c;
            int i66 = c3;
            int i67 = i65;
            int i68 = 0;
            int i69 = 0;
            while (i2 < length) {
                int i70 = i2 + 1;
                int charAt21 = d.charAt(i2);
                char c8 = 55296;
                if (charAt21 >= 55296) {
                    int i71 = 13;
                    int i72 = i70;
                    int i73 = charAt21 & 8191;
                    int i74 = i72;
                    while (true) {
                        i23 = i74 + 1;
                        charAt4 = d.charAt(i74);
                        if (charAt4 < c8) {
                            break;
                        }
                        i73 |= (charAt4 & 8191) << i71;
                        i71 += 13;
                        i74 = i23;
                        c8 = 55296;
                    }
                    charAt21 = i73 | (charAt4 << i71);
                    i8 = i23;
                } else {
                    i8 = i70;
                }
                int i75 = i8 + 1;
                char charAt22 = d.charAt(i8);
                int i76 = length;
                char c9 = 55296;
                if (charAt22 >= 55296) {
                    int i77 = 13;
                    int i78 = i75;
                    int i79 = charAt22 & 8191;
                    int i80 = i78;
                    while (true) {
                        i22 = i80 + 1;
                        charAt3 = d.charAt(i80);
                        if (charAt3 < c9) {
                            break;
                        }
                        i79 |= (charAt3 & 8191) << i77;
                        i77 += 13;
                        i80 = i22;
                        c9 = 55296;
                    }
                    charAt22 = i79 | (charAt3 << i77);
                    i9 = i22;
                } else {
                    i9 = i75;
                }
                int i81 = c3;
                char c10 = charAt22 & 255;
                boolean z2 = z;
                if ((charAt22 & 1024) != 0) {
                    int i82 = i68 + 1;
                    iArr[i68] = i69;
                    i68 = i82;
                }
                int i83 = i68;
                if (c10 >= '3') {
                    int i84 = i9 + 1;
                    char charAt23 = d.charAt(i9);
                    char c11 = 55296;
                    if (charAt23 >= 55296) {
                        char c12 = charAt23 & 8191;
                        int i85 = 13;
                        while (true) {
                            i21 = i84 + 1;
                            charAt2 = d.charAt(i84);
                            if (charAt2 < c11) {
                                break;
                            }
                            c12 |= (charAt2 & 8191) << i85;
                            i85 += 13;
                            i84 = i21;
                            c11 = 55296;
                        }
                        charAt23 = c12 | (charAt2 << i85);
                        i84 = i21;
                    }
                    int i86 = c10 - '3';
                    int i87 = i84;
                    if (i86 == 9 || i86 == 17) {
                        c2 = 1;
                        int i88 = i64 + 1;
                        objArr[((i69 / 3) << 1) + 1] = e[i64];
                        i64 = i88;
                    } else {
                        if (i86 == 12 && (charAt15 & 1) == 1) {
                            int i89 = i64 + 1;
                            objArr[((i69 / 3) << 1) + 1] = e[i64];
                            i64 = i89;
                        }
                        c2 = 1;
                    }
                    int i90 = charAt23 << c2;
                    Object obj = e[i90];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = m36087a(cls3, (String) obj);
                        e[i90] = field2;
                    }
                    int i91 = i7;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i92 = i90 + 1;
                    Object obj2 = e[i92];
                    int i93 = objectFieldOffset;
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = m36087a(cls3, (String) obj2);
                        e[i92] = field3;
                    }
                    str = d;
                    i15 = (int) unsafe.objectFieldOffset(field3);
                    cls2 = cls3;
                    i11 = i64;
                    i14 = i93;
                    i16 = 0;
                    i10 = i91;
                    i12 = i5;
                    i13 = charAt21;
                    i18 = i87;
                } else {
                    int i94 = i7;
                    int i95 = i64 + 1;
                    Field a = m36087a(cls3, (String) e[i64]);
                    i12 = i5;
                    if (c10 == 9 || c10 == 17) {
                        i10 = i94;
                        objArr[((i69 / 3) << 1) + 1] = a.getType();
                    } else {
                        if (c10 == 27 || c10 == '1') {
                            i10 = i94;
                            i20 = i95 + 1;
                            objArr[((i69 / 3) << 1) + 1] = e[i95];
                        } else if (c10 == 12 || c10 == 30 || c10 == ',') {
                            i10 = i94;
                            if ((charAt15 & 1) == 1) {
                                i20 = i95 + 1;
                                objArr[((i69 / 3) << 1) + 1] = e[i95];
                            }
                        } else if (c10 == '2') {
                            int i96 = i66 + 1;
                            iArr[i66] = i69;
                            int i97 = (i69 / 3) << 1;
                            int i98 = i95 + 1;
                            objArr[i97] = e[i95];
                            if ((charAt22 & 2048) != 0) {
                                i95 = i98 + 1;
                                objArr[i97 + 1] = e[i98];
                                i10 = i94;
                                i66 = i96;
                            } else {
                                i66 = i96;
                                i95 = i98;
                                i10 = i94;
                            }
                        } else {
                            i10 = i94;
                        }
                        i13 = charAt21;
                        i95 = i20;
                        i14 = (int) unsafe.objectFieldOffset(a);
                        if ((charAt15 & 1) == 1 || c10 > 17) {
                            str = d;
                            cls2 = cls3;
                            i11 = i95;
                            i17 = i9;
                            i16 = 0;
                            i15 = 0;
                        } else {
                            i17 = i9 + 1;
                            char charAt24 = d.charAt(i9);
                            if (charAt24 >= 55296) {
                                char c13 = charAt24 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i19 = i17 + 1;
                                    charAt = d.charAt(i17);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    c13 |= (charAt & 8191) << i99;
                                    i99 += 13;
                                    i17 = i19;
                                }
                                charAt24 = c13 | (charAt << i99);
                                i17 = i19;
                            }
                            int i100 = (i3 << 1) + (charAt24 / ' ');
                            Object obj3 = e[i100];
                            str = d;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = m36087a(cls3, (String) obj3);
                                e[i100] = field;
                            }
                            cls2 = cls3;
                            i11 = i95;
                            i15 = (int) unsafe.objectFieldOffset(field);
                            i16 = charAt24 % ' ';
                        }
                        if (c10 >= 18 && c10 <= '1') {
                            int i101 = i67 + 1;
                            iArr[i67] = i14;
                            i67 = i101;
                        }
                        i18 = i17;
                    }
                    i13 = charAt21;
                    i14 = (int) unsafe.objectFieldOffset(a);
                    if ((charAt15 & 1) == 1) {
                    }
                    str = d;
                    cls2 = cls3;
                    i11 = i95;
                    i17 = i9;
                    i16 = 0;
                    i15 = 0;
                    int i1012 = i67 + 1;
                    iArr[i67] = i14;
                    i67 = i1012;
                    i18 = i17;
                }
                int i102 = i69 + 1;
                iArr2[i69] = i13;
                int i103 = i102 + 1;
                iArr2[i102] = (c10 << 20) | ((charAt22 & 256) != 0 ? 268435456 : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | i14;
                i69 = i103 + 1;
                iArr2[i103] = (i16 << 20) | i15;
                cls3 = cls2;
                i5 = i12;
                c3 = i81;
                i64 = i11;
                length = i76;
                z = z2;
                i7 = i10;
                i68 = i83;
                d = str;
            }
            boolean z3 = z;
            C11302s5 s5Var = new C11302s5(iArr2, objArr, i7, i5, b6Var.mo28316a(), z, false, iArr, c3, i65, w5Var, z4Var, w6Var, t3Var, i5Var);
            return s5Var;
        }
        ((C11317t6) n5Var2).mo28318c();
        throw null;
    }

    /* renamed from: c */
    private final C11203l4 m36106c(int i) {
        return (C11203l4) this.f26506b[((i / 3) << 1) + 1];
    }

    /* renamed from: e */
    private static C11400z6 m36112e(Object obj) {
        C11090e4 e4Var = (C11090e4) obj;
        C11400z6 z6Var = e4Var.zzahz;
        if (z6Var != C11400z6.m36843d()) {
            return z6Var;
        }
        C11400z6 e = C11400z6.m36844e();
        e4Var.zzahz = e;
        return e;
    }

    /* renamed from: f */
    private static boolean m36113f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: f */
    private static <T> boolean m36114f(T t, long j) {
        return ((Boolean) C11058c7.m34877f(t, j)).booleanValue();
    }

    /* renamed from: g */
    private final int m36115g(int i) {
        if (i < this.f26507c || i > this.f26508d) {
            return -1;
        }
        return m36099b(i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6), p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6), p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6), p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6), p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6) == p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r10, r6)) == java.lang.Float.floatToIntBits(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r10, r6)) == java.lang.Double.doubleToLongBits(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6), p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28403b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f26505a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m36108d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m36110e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r4)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6)
            long r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6)
            long r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r10, r6)
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r6)
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35175a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r10, r6)
            boolean r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6)
            long r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r10, r6)
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6)
            long r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r10, r6)
            long r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m36107c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            g.j.a.a.d.g.w6<?, ?> r0 = r9.f26519o
            java.lang.Object r0 = r0.mo29114d(r10)
            g.j.a.a.d.g.w6<?, ?> r2 = r9.f26519o
            java.lang.Object r2 = r2.mo29114d(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f26510f
            if (r0 == 0) goto L_0x01f1
            g.j.a.a.d.g.t3<?> r0 = r9.f26520p
            g.j.a.a.d.g.u3 r10 = r0.mo28882a(r10)
            g.j.a.a.d.g.t3<?> r0 = r9.f26520p
            g.j.a.a.d.g.u3 r11 = r0.mo28882a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28403b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28405d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f26505a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m36108d(r1)
            int[] r4 = r8.f26505a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m36111e(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m36111e(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m36114f(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35149a(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m36111e(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m36109d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m36111e(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m36111e(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m36105c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m36095a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m36098b((T) r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35149a(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r9, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35148a(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            g.j.a.a.d.g.w6<?, ?> r0 = r8.f26519o
            java.lang.Object r0 = r0.mo29114d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f26510f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            g.j.a.a.d.g.t3<?> r0 = r8.f26520p
            g.j.a.a.d.g.u3 r9 = r0.mo28882a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28405d(java.lang.Object):int");
    }

    public final T newInstance() {
        return this.f26517m.mo29078a(this.f26509e);
    }

    /* renamed from: c */
    public final void mo28404c(T t) {
        int i;
        int i2 = this.f26515k;
        while (true) {
            i = this.f26516l;
            if (i2 >= i) {
                break;
            }
            long d = (long) (m36108d(this.f26514j[i2]) & 1048575);
            Object f = C11058c7.m34877f(t, d);
            if (f != null) {
                this.f26521q.mo28581e(f);
                C11058c7.m34854a((Object) t, d, f);
            }
            i2++;
        }
        int length = this.f26514j.length;
        while (i < length) {
            this.f26518n.mo28271b(t, (long) this.f26514j[i]);
            i++;
        }
        this.f26519o.mo29099a((Object) t);
        if (this.f26510f) {
            this.f26520p.mo28890c(t);
        }
    }

    /* renamed from: e */
    private final int m36110e(int i) {
        return this.f26505a[i + 2];
    }

    /* renamed from: e */
    private static <T> long m36111e(T t, long j) {
        return ((Long) C11058c7.m34877f(t, j)).longValue();
    }

    /* renamed from: c */
    private static <T> float m36105c(T t, long j) {
        return ((Float) C11058c7.m34877f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final boolean m36107c(T t, T t2, int i) {
        return m36094a(t, i) == m36094a(t2, i);
    }

    /* renamed from: b */
    private final void m36104b(T t, T t2, int i) {
        int d = m36108d(i);
        int i2 = this.f26505a[i];
        long j = (long) (d & 1048575);
        if (m36095a(t2, i2, i)) {
            Object f = C11058c7.m34877f(t, j);
            Object f2 = C11058c7.m34877f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C11058c7.m34854a((Object) t, j, f2);
                    m36102b(t, i2, i);
                }
                return;
            }
            C11058c7.m34854a((Object) t, j, C11111f4.m35152a(f, f2));
            m36102b(t, i2, i);
        }
    }

    /* renamed from: d */
    private final int m36108d(int i) {
        return this.f26505a[i + 1];
    }

    /* renamed from: d */
    private static <T> int m36109d(T t, long j) {
        return ((Integer) C11058c7.m34877f(t, j)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0900, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0915, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x095a, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a0b, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a2e, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28402b(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f26512h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f26504s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f26505a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m36108d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f26505a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            g.j.a.a.d.g.z3 r14 = p163g.p449j.p450a.p451a.p457d.p464g.C11397z3.DOUBLE_LIST_PACKED
            int r14 = r14.mo29196a()
            if (r15 < r14) goto L_0x0041
            g.j.a.a.d.g.z3 r14 = p163g.p449j.p450a.p451a.p457d.p464g.C11397z3.SINT64_LIST_PACKED
            int r14 = r14.mo29196a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f26505a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.p5 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11259p5) r5
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35560c(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m36111e(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35572f(r3, r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m36109d(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35579h(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35580h(r3, r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35586j(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m36109d(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35588k(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m36109d(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35575g(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.v2 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r3, r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35159a(r3, r5, r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            boolean r6 = r5 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11342v2
            if (r6 == 0) goto L_0x00f1
            g.j.a.a.d.g.v2 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r3, r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35554b(r3, r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35555b(r3, r8)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35583i(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35576g(r3, r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m36109d(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35571f(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m36111e(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35568e(r3, r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m36095a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m36111e(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35562d(r3, r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35551b(r3, r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m36095a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35550b(r3, r5)
            goto L_0x03c9
        L_0x0167:
            g.j.a.a.d.g.i5 r14 = r0.f26521q
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            java.lang.Object r6 = r0.m36100b(r12)
            int r3 = r14.mo28575a(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m36088a(r1, r5)
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35177b(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35200g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35163a(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35203h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35209j(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35189d(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35206i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35197f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35193e(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f26513i
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r3)
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35184c(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35199g(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35188d(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35196f(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35176b(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m36088a(r1, r5)
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35161a(r3, r5, r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35160a(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35208j(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35192e(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35178b(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35162a(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m36088a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.p5 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11259p5) r5
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35560c(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35572f(r3, r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35579h(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35580h(r3, r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35586j(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35588k(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35575g(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.v2 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r3, r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            g.j.a.a.d.g.d6 r6 = r0.m36083a(r12)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35159a(r3, r5, r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r1, r5)
            boolean r6 = r5 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11342v2
            if (r6 == 0) goto L_0x046e
            g.j.a.a.d.g.v2 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r3, r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35554b(r3, r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35555b(r3, r8)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35583i(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35576g(r3, r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35571f(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35568e(r3, r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m36094a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r1, r5)
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35562d(r3, r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35551b(r3, r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m36094a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35550b(r3, r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            g.j.a.a.d.g.w6<?, ?> r2 = r0.f26519o
            int r1 = m36079a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f26504s
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x04f9:
            int[] r13 = r0.f26505a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a39
            int r13 = r0.m36108d(r3)
            int[] r14 = r0.f26505a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0525
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r6) goto L_0x0522
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            goto L_0x0523
        L_0x0522:
            r14 = r6
        L_0x0523:
            r6 = r14
            goto L_0x0545
        L_0x0525:
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x0542
            g.j.a.a.d.g.z3 r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11397z3.DOUBLE_LIST_PACKED
            int r8 = r8.mo29196a()
            if (r4 < r8) goto L_0x0542
            g.j.a.a.d.g.z3 r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11397z3.SINT64_LIST_PACKED
            int r8 = r8.mo29196a()
            if (r4 > r8) goto L_0x0542
            int[] r8 = r0.f26505a
            int r9 = r3 + 2
            r8 = r8[r9]
            r11 = r8 & r7
            goto L_0x0543
        L_0x0542:
            r11 = 0
        L_0x0543:
            r18 = 0
        L_0x0545:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0a1e;
                case 1: goto L_0x0a0d;
                case 2: goto L_0x09fb;
                case 3: goto L_0x09ea;
                case 4: goto L_0x09d9;
                case 5: goto L_0x09cc;
                case 6: goto L_0x09bf;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0997;
                case 9: goto L_0x0985;
                case 10: goto L_0x0976;
                case 11: goto L_0x0969;
                case 12: goto L_0x095c;
                case 13: goto L_0x0951;
                case 14: goto L_0x0946;
                case 15: goto L_0x0939;
                case 16: goto L_0x092c;
                case 17: goto L_0x0919;
                case 18: goto L_0x0905;
                case 19: goto L_0x08f5;
                case 20: goto L_0x08e9;
                case 21: goto L_0x08dd;
                case 22: goto L_0x08d1;
                case 23: goto L_0x08c5;
                case 24: goto L_0x08b9;
                case 25: goto L_0x08ad;
                case 26: goto L_0x08a2;
                case 27: goto L_0x0892;
                case 28: goto L_0x0886;
                case 29: goto L_0x0879;
                case 30: goto L_0x086c;
                case 31: goto L_0x085f;
                case 32: goto L_0x0852;
                case 33: goto L_0x0845;
                case 34: goto L_0x0838;
                case 35: goto L_0x0818;
                case 36: goto L_0x07fb;
                case 37: goto L_0x07de;
                case 38: goto L_0x07c1;
                case 39: goto L_0x07a3;
                case 40: goto L_0x0785;
                case 41: goto L_0x0767;
                case 42: goto L_0x0749;
                case 43: goto L_0x072b;
                case 44: goto L_0x070d;
                case 45: goto L_0x06ef;
                case 46: goto L_0x06d1;
                case 47: goto L_0x06b3;
                case 48: goto L_0x0695;
                case 49: goto L_0x0685;
                case 50: goto L_0x0675;
                case 51: goto L_0x0667;
                case 52: goto L_0x065a;
                case 53: goto L_0x064a;
                case 54: goto L_0x063a;
                case 55: goto L_0x062a;
                case 56: goto L_0x061c;
                case 57: goto L_0x060f;
                case 58: goto L_0x0602;
                case 59: goto L_0x05e4;
                case 60: goto L_0x05d0;
                case 61: goto L_0x05be;
                case 62: goto L_0x05ae;
                case 63: goto L_0x059e;
                case 64: goto L_0x0591;
                case 65: goto L_0x0583;
                case 66: goto L_0x0573;
                case 67: goto L_0x0563;
                case 68: goto L_0x054d;
                default: goto L_0x054b;
            }
        L_0x054b:
            goto L_0x0911
        L_0x054d:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.p5 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11259p5) r4
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35560c(r15, r4, r8)
            goto L_0x0910
        L_0x0563:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m36111e(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35572f(r15, r8)
            goto L_0x0910
        L_0x0573:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m36109d(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35579h(r15, r4)
            goto L_0x0910
        L_0x0583:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35580h(r15, r8)
            goto L_0x0910
        L_0x0591:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35586j(r15, r4)
            goto L_0x095a
        L_0x059e:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m36109d(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35588k(r15, r4)
            goto L_0x0910
        L_0x05ae:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m36109d(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35575g(r15, r4)
            goto L_0x0910
        L_0x05be:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r15, r4)
            goto L_0x0910
        L_0x05d0:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35159a(r15, r4, r8)
            goto L_0x0910
        L_0x05e4:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11342v2
            if (r8 == 0) goto L_0x05fa
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r15, r4)
            goto L_0x0910
        L_0x05fa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35554b(r15, r4)
            goto L_0x0910
        L_0x0602:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35555b(r15, r4)
            goto L_0x095a
        L_0x060f:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35583i(r15, r4)
            goto L_0x095a
        L_0x061c:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35576g(r15, r8)
            goto L_0x0910
        L_0x062a:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m36109d(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35571f(r15, r4)
            goto L_0x0910
        L_0x063a:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m36111e(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35568e(r15, r8)
            goto L_0x0910
        L_0x064a:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m36111e(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35562d(r15, r8)
            goto L_0x0910
        L_0x065a:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35551b(r15, r4)
            goto L_0x095a
        L_0x0667:
            boolean r4 = r0.m36095a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35550b(r15, r8)
            goto L_0x0910
        L_0x0675:
            g.j.a.a.d.g.i5 r4 = r0.f26521q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m36100b(r3)
            int r4 = r4.mo28575a(r15, r8, r9)
            goto L_0x0910
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35177b(r15, r4, r8)
            goto L_0x0910
        L_0x0695:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35200g(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x06a9
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06a9:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x06b3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35163a(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x06c7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06c7:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x06d1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x06e5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06e5:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x06ef:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x0703
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0703:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x070d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35203h(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x0721
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0721:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x072b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35209j(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x073f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x073f:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x0749:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35189d(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x075d
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x075d:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x0767:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x077b
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x077b:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x0785:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x0799
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0799:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x07a3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35206i(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x07b7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07b7:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x07c1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35197f(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x07d5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07d5:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x07de:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35193e(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x07f2
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07f2:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x07fb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35179b(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x080f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x080f:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
            goto L_0x0834
        L_0x0818:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35185c(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f26513i
            if (r8 == 0) goto L_0x082c
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x082c:
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35567e(r15)
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35574g(r4)
        L_0x0834:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x095a
        L_0x0838:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35184c(r15, r4, r10)
            goto L_0x0900
        L_0x0845:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35199g(r15, r4, r10)
            goto L_0x0900
        L_0x0852:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r15, r4, r10)
            goto L_0x0900
        L_0x085f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r15, r4, r10)
            goto L_0x0900
        L_0x086c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35188d(r15, r4, r10)
            goto L_0x0900
        L_0x0879:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35196f(r15, r4, r10)
            goto L_0x0910
        L_0x0886:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35176b(r15, r4)
            goto L_0x0910
        L_0x0892:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35161a(r15, r4, r8)
            goto L_0x0910
        L_0x08a2:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35160a(r15, r4)
            goto L_0x0910
        L_0x08ad:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35208j(r15, r4, r10)
            goto L_0x0900
        L_0x08b9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r15, r4, r10)
            goto L_0x0900
        L_0x08c5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r15, r4, r10)
            goto L_0x0900
        L_0x08d1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35192e(r15, r4, r10)
            goto L_0x0900
        L_0x08dd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35178b(r15, r4, r10)
            goto L_0x0900
        L_0x08e9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35162a(r15, r4, r10)
            goto L_0x0900
        L_0x08f5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35202h(r15, r4, r10)
        L_0x0900:
            int r5 = r5 + r4
            r4 = 1
        L_0x0902:
            r7 = 0
            goto L_0x0915
        L_0x0905:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35205i(r15, r4, r10)
        L_0x0910:
            int r5 = r5 + r4
        L_0x0911:
            r4 = 1
        L_0x0912:
            r7 = 0
            r10 = 0
        L_0x0915:
            r13 = 0
            goto L_0x0a2e
        L_0x0919:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.p5 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11259p5) r4
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35560c(r15, r4, r8)
            goto L_0x0910
        L_0x092c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            long r8 = r2.getLong(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35572f(r15, r8)
            goto L_0x0910
        L_0x0939:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35579h(r15, r4)
            goto L_0x0910
        L_0x0946:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35580h(r15, r8)
            goto L_0x0910
        L_0x0951:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35586j(r15, r4)
        L_0x095a:
            int r5 = r5 + r8
            goto L_0x0911
        L_0x095c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35588k(r15, r4)
            goto L_0x0910
        L_0x0969:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35575g(r15, r4)
            goto L_0x0910
        L_0x0976:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r15, r4)
            goto L_0x0910
        L_0x0985:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            g.j.a.a.d.g.d6 r8 = r0.m36083a(r3)
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35159a(r15, r4, r8)
            goto L_0x0910
        L_0x0997:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11342v2
            if (r8 == 0) goto L_0x09ab
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35561c(r15, r4)
            goto L_0x0910
        L_0x09ab:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35554b(r15, r4)
            goto L_0x0910
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35555b(r15, r4)
            int r5 = r5 + r8
            goto L_0x0912
        L_0x09bf:
            r4 = 1
            r8 = r12 & r18
            r10 = 0
            if (r8 == 0) goto L_0x0902
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35583i(r15, r10)
            int r5 = r5 + r8
            goto L_0x0902
        L_0x09cc:
            r4 = 1
            r10 = 0
            r8 = r12 & r18
            r13 = 0
            if (r8 == 0) goto L_0x0a1b
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35576g(r15, r13)
            goto L_0x0a0b
        L_0x09d9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            int r8 = r2.getInt(r1, r8)
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35571f(r15, r8)
            goto L_0x0a0b
        L_0x09ea:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35568e(r15, r8)
            goto L_0x0a0b
        L_0x09fb:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35562d(r15, r8)
        L_0x0a0b:
            int r5 = r5 + r8
            goto L_0x0a1b
        L_0x0a0d:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r18
            if (r8 == 0) goto L_0x0a1b
            r8 = 0
            int r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35551b(r15, r8)
            int r5 = r5 + r9
        L_0x0a1b:
            r7 = 0
            goto L_0x0a2e
        L_0x0a1e:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a1b
            r7 = 0
            int r11 = p163g.p449j.p450a.p451a.p457d.p464g.C11197l3.m35550b(r15, r7)
            int r5 = r5 + r11
        L_0x0a2e:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x04f9
        L_0x0a39:
            r10 = 0
            g.j.a.a.d.g.w6<?, ?> r2 = r0.f26519o
            int r2 = m36079a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f26510f
            if (r2 == 0) goto L_0x0a93
            g.j.a.a.d.g.t3<?> r2 = r0.f26520p
            g.j.a.a.d.g.u3 r1 = r2.mo28882a(r1)
            r2 = 0
        L_0x0a4c:
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r3 = r1.f26557a
            int r3 = r3.mo28601c()
            if (r10 >= r3) goto L_0x0a6c
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r3 = r1.f26557a
            java.util.Map$Entry r3 = r3.mo28599a(r10)
            java.lang.Object r4 = r3.getKey()
            g.j.a.a.d.g.w3 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11357w3) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11329u3.m36412b(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0a4c
        L_0x0a6c:
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r1 = r1.f26557a
            java.lang.Iterable r1 = r1.mo28604d()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a76:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a92
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            g.j.a.a.d.g.w3 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11357w3) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11329u3.m36412b(r4, r3)
            int r2 = r2 + r3
            goto L_0x0a76
        L_0x0a92:
            int r5 = r5 + r2
        L_0x0a93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28402b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static Field m36087a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo28399a(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f26505a.length; i += 3) {
                int d = m36108d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f26505a[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34850a((Object) t, j, C11058c7.m34874e(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 1:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34851a((Object) t, j, C11058c7.m34869d(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 2:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34853a((Object) t, j, C11058c7.m34860b(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 3:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34853a((Object) t, j, C11058c7.m34860b(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 4:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 5:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34853a((Object) t, j, C11058c7.m34860b(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 6:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 7:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34855a((Object) t, j, C11058c7.m34868c(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 8:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34854a((Object) t, j, C11058c7.m34877f(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 9:
                        m36093a(t, t2, i);
                        break;
                    case 10:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34854a((Object) t, j, C11058c7.m34877f(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 11:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 12:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 13:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 14:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34853a((Object) t, j, C11058c7.m34860b(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 15:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 16:
                        if (!m36094a(t2, i)) {
                            break;
                        } else {
                            C11058c7.m34853a((Object) t, j, C11058c7.m34860b(t2, j));
                            m36101b(t, i);
                            break;
                        }
                    case 17:
                        m36093a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f26518n.mo28270a(t, t2, j);
                        break;
                    case 50:
                        C11113f6.m35171a(this.f26521q, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m36095a(t2, i2, i)) {
                            break;
                        } else {
                            C11058c7.m34854a((Object) t, j, C11058c7.m34877f(t2, j));
                            m36102b(t, i2, i);
                            break;
                        }
                    case 60:
                        m36104b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m36095a(t2, i2, i)) {
                            break;
                        } else {
                            C11058c7.m34854a((Object) t, j, C11058c7.m34877f(t2, j));
                            m36102b(t, i2, i);
                            break;
                        }
                    case 68:
                        m36104b(t, t2, i);
                        break;
                }
            }
            if (!this.f26512h) {
                C11113f6.m35173a(this.f26519o, t, t2);
                if (this.f26510f) {
                    C11113f6.m35172a(this.f26520p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m36093a(T t, T t2, int i) {
        long d = (long) (m36108d(i) & 1048575);
        if (m36094a(t2, i)) {
            Object f = C11058c7.m34877f(t, d);
            Object f2 = C11058c7.m34877f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C11058c7.m34854a((Object) t, d, f2);
                    m36101b(t, i);
                }
                return;
            }
            C11058c7.m34854a((Object) t, d, C11111f4.m35152a(f, f2));
            m36101b(t, i);
        }
    }

    /* renamed from: a */
    private static <UT, UB> int m36079a(C11360w6<UT, UB> w6Var, T t) {
        return w6Var.mo29112c(w6Var.mo29114d(t));
    }

    /* renamed from: a */
    private static List<?> m36088a(Object obj, long j) {
        return (List) C11058c7.m34877f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28398a(T r13, p163g.p449j.p450a.p451a.p457d.p464g.C11333u7 r14) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r14.mo28745a()
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d.f26173l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04c3
            g.j.a.a.d.g.w6<?, ?> r0 = r12.f26519o
            m36091a(r0, (T) r13, r14)
            boolean r0 = r12.f26510f
            if (r0 == 0) goto L_0x0032
            g.j.a.a.d.g.t3<?> r0 = r12.f26520p
            g.j.a.a.d.g.u3 r0 = r0.mo28882a(r13)
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r1 = r0.f26557a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo29036a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f26505a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x04ba
            int r7 = r12.m36108d(r1)
            int[] r8 = r12.f26505a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x04b4
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a1;
                case 1: goto L_0x0491;
                case 2: goto L_0x0481;
                case 3: goto L_0x0471;
                case 4: goto L_0x0461;
                case 5: goto L_0x0451;
                case 6: goto L_0x0441;
                case 7: goto L_0x0430;
                case 8: goto L_0x041f;
                case 9: goto L_0x040a;
                case 10: goto L_0x03f7;
                case 11: goto L_0x03e6;
                case 12: goto L_0x03d5;
                case 13: goto L_0x03c4;
                case 14: goto L_0x03b3;
                case 15: goto L_0x03a2;
                case 16: goto L_0x0391;
                case 17: goto L_0x037c;
                case 18: goto L_0x036d;
                case 19: goto L_0x035e;
                case 20: goto L_0x034f;
                case 21: goto L_0x0340;
                case 22: goto L_0x0331;
                case 23: goto L_0x0322;
                case 24: goto L_0x0313;
                case 25: goto L_0x0304;
                case 26: goto L_0x02f5;
                case 27: goto L_0x02e2;
                case 28: goto L_0x02d3;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02b5;
                case 31: goto L_0x02a6;
                case 32: goto L_0x0297;
                case 33: goto L_0x0288;
                case 34: goto L_0x0279;
                case 35: goto L_0x026a;
                case 36: goto L_0x025b;
                case 37: goto L_0x024c;
                case 38: goto L_0x023d;
                case 39: goto L_0x022e;
                case 40: goto L_0x021f;
                case 41: goto L_0x0210;
                case 42: goto L_0x0201;
                case 43: goto L_0x01f2;
                case 44: goto L_0x01e3;
                case 45: goto L_0x01d4;
                case 46: goto L_0x01c5;
                case 47: goto L_0x01b6;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0194;
                case 50: goto L_0x0189;
                case 51: goto L_0x0178;
                case 52: goto L_0x0167;
                case 53: goto L_0x0156;
                case 54: goto L_0x0145;
                case 55: goto L_0x0134;
                case 56: goto L_0x0123;
                case 57: goto L_0x0112;
                case 58: goto L_0x0101;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00db;
                case 61: goto L_0x00c8;
                case 62: goto L_0x00b7;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0095;
                case 65: goto L_0x0084;
                case 66: goto L_0x0073;
                case 67: goto L_0x0062;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x04b0
        L_0x004d:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.d6 r8 = r12.m36083a(r1)
            r14.mo28762b(r9, r7, r8)
            goto L_0x04b0
        L_0x0062:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m36111e(r13, r7)
            r14.mo28761b(r9, r7)
            goto L_0x04b0
        L_0x0073:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28775f(r9, r7)
            goto L_0x04b0
        L_0x0084:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m36111e(r13, r7)
            r14.mo28750a(r9, r7)
            goto L_0x04b0
        L_0x0095:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28772e(r9, r7)
            goto L_0x04b0
        L_0x00a6:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28760b(r9, r7)
            goto L_0x04b0
        L_0x00b7:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28769d(r9, r7)
            goto L_0x04b0
        L_0x00c8:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.v2 r7 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r7
            r14.mo28751a(r9, r7)
            goto L_0x04b0
        L_0x00db:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.d6 r8 = r12.m36083a(r1)
            r14.mo28753a(r9, r7, r8)
            goto L_0x04b0
        L_0x00f0:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            m36089a(r9, r7, r14)
            goto L_0x04b0
        L_0x0101:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m36114f(r13, r7)
            r14.mo28758a(r9, r7)
            goto L_0x04b0
        L_0x0112:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28766c(r9, r7)
            goto L_0x04b0
        L_0x0123:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m36111e(r13, r7)
            r14.mo28767c(r9, r7)
            goto L_0x04b0
        L_0x0134:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m36109d(r13, r7)
            r14.mo28749a(r9, r7)
            goto L_0x04b0
        L_0x0145:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m36111e(r13, r7)
            r14.mo28773e(r9, r7)
            goto L_0x04b0
        L_0x0156:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m36111e(r13, r7)
            r14.mo28770d(r9, r7)
            goto L_0x04b0
        L_0x0167:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m36105c(r13, r7)
            r14.mo28748a(r9, r7)
            goto L_0x04b0
        L_0x0178:
            boolean r8 = r12.m36095a((T) r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m36098b((T) r13, r7)
            r14.mo28747a(r9, r7)
            goto L_0x04b0
        L_0x0189:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            r12.m36090a(r14, r9, r7, r1)
            goto L_0x04b0
        L_0x0194:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r1)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35182b(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x01a7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01b6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01c5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01d4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01e3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01f2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0201:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0210:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x021f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x022e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x023d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x024c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x025b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x026a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0279:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0288:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0297:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02a6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02b5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02c4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02d3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35181b(r8, r7, r14)
            goto L_0x04b0
        L_0x02e2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r1)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35169a(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x02f5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35168a(r8, r7, r14)
            goto L_0x04b0
        L_0x0304:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0313:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0322:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0331:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0340:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x034f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x035e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x036d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x037c:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.d6 r8 = r12.m36083a(r1)
            r14.mo28762b(r9, r7, r8)
            goto L_0x04b0
        L_0x0391:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r7)
            r14.mo28761b(r9, r7)
            goto L_0x04b0
        L_0x03a2:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28775f(r9, r7)
            goto L_0x04b0
        L_0x03b3:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r7)
            r14.mo28750a(r9, r7)
            goto L_0x04b0
        L_0x03c4:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28772e(r9, r7)
            goto L_0x04b0
        L_0x03d5:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28760b(r9, r7)
            goto L_0x04b0
        L_0x03e6:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28769d(r9, r7)
            goto L_0x04b0
        L_0x03f7:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.v2 r7 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r7
            r14.mo28751a(r9, r7)
            goto L_0x04b0
        L_0x040a:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            g.j.a.a.d.g.d6 r8 = r12.m36083a(r1)
            r14.mo28753a(r9, r7, r8)
            goto L_0x04b0
        L_0x041f:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r7)
            m36089a(r9, r7, r14)
            goto L_0x04b0
        L_0x0430:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r13, r7)
            r14.mo28758a(r9, r7)
            goto L_0x04b0
        L_0x0441:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28766c(r9, r7)
            goto L_0x04b0
        L_0x0451:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r7)
            r14.mo28767c(r9, r7)
            goto L_0x04b0
        L_0x0461:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r7)
            r14.mo28749a(r9, r7)
            goto L_0x04b0
        L_0x0471:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r7)
            r14.mo28773e(r9, r7)
            goto L_0x04b0
        L_0x0481:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r7)
            r14.mo28770d(r9, r7)
            goto L_0x04b0
        L_0x0491:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r13, r7)
            r14.mo28748a(r9, r7)
            goto L_0x04b0
        L_0x04a1:
            boolean r8 = r12.m36094a((T) r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r13, r7)
            r14.mo28747a(r9, r7)
        L_0x04b0:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x04b4:
            g.j.a.a.d.g.t3<?> r13 = r12.f26520p
            r13.mo28881a(r0)
            throw r3
        L_0x04ba:
            if (r0 != 0) goto L_0x04bd
            return
        L_0x04bd:
            g.j.a.a.d.g.t3<?> r13 = r12.f26520p
            r13.mo28886a(r14, r0)
            throw r3
        L_0x04c3:
            boolean r0 = r12.f26512h
            if (r0 == 0) goto L_0x0979
            boolean r0 = r12.f26510f
            if (r0 == 0) goto L_0x04e4
            g.j.a.a.d.g.t3<?> r0 = r12.f26520p
            g.j.a.a.d.g.u3 r0 = r0.mo28882a(r13)
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r1 = r0.f26557a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04e4
            java.util.Iterator r0 = r0.mo29041d()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x04e5
        L_0x04e4:
            r0 = r3
        L_0x04e5:
            int[] r1 = r12.f26505a
            int r1 = r1.length
            r7 = 0
        L_0x04e9:
            if (r7 >= r1) goto L_0x096b
            int r8 = r12.m36108d(r7)
            int[] r9 = r12.f26505a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x0965
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0952;
                case 1: goto L_0x0942;
                case 2: goto L_0x0932;
                case 3: goto L_0x0922;
                case 4: goto L_0x0912;
                case 5: goto L_0x0902;
                case 6: goto L_0x08f2;
                case 7: goto L_0x08e1;
                case 8: goto L_0x08d0;
                case 9: goto L_0x08bb;
                case 10: goto L_0x08a8;
                case 11: goto L_0x0897;
                case 12: goto L_0x0886;
                case 13: goto L_0x0875;
                case 14: goto L_0x0864;
                case 15: goto L_0x0853;
                case 16: goto L_0x0842;
                case 17: goto L_0x082d;
                case 18: goto L_0x081e;
                case 19: goto L_0x080f;
                case 20: goto L_0x0800;
                case 21: goto L_0x07f1;
                case 22: goto L_0x07e2;
                case 23: goto L_0x07d3;
                case 24: goto L_0x07c4;
                case 25: goto L_0x07b5;
                case 26: goto L_0x07a6;
                case 27: goto L_0x0793;
                case 28: goto L_0x0784;
                case 29: goto L_0x0775;
                case 30: goto L_0x0766;
                case 31: goto L_0x0757;
                case 32: goto L_0x0748;
                case 33: goto L_0x0739;
                case 34: goto L_0x072a;
                case 35: goto L_0x071b;
                case 36: goto L_0x070c;
                case 37: goto L_0x06fd;
                case 38: goto L_0x06ee;
                case 39: goto L_0x06df;
                case 40: goto L_0x06d0;
                case 41: goto L_0x06c1;
                case 42: goto L_0x06b2;
                case 43: goto L_0x06a3;
                case 44: goto L_0x0694;
                case 45: goto L_0x0685;
                case 46: goto L_0x0676;
                case 47: goto L_0x0667;
                case 48: goto L_0x0658;
                case 49: goto L_0x0645;
                case 50: goto L_0x063a;
                case 51: goto L_0x0629;
                case 52: goto L_0x0618;
                case 53: goto L_0x0607;
                case 54: goto L_0x05f6;
                case 55: goto L_0x05e5;
                case 56: goto L_0x05d4;
                case 57: goto L_0x05c3;
                case 58: goto L_0x05b2;
                case 59: goto L_0x05a1;
                case 60: goto L_0x058c;
                case 61: goto L_0x0579;
                case 62: goto L_0x0568;
                case 63: goto L_0x0557;
                case 64: goto L_0x0546;
                case 65: goto L_0x0535;
                case 66: goto L_0x0524;
                case 67: goto L_0x0513;
                case 68: goto L_0x04fe;
                default: goto L_0x04fc;
            }
        L_0x04fc:
            goto L_0x0961
        L_0x04fe:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r7)
            r14.mo28762b(r10, r8, r9)
            goto L_0x0961
        L_0x0513:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m36111e(r13, r8)
            r14.mo28761b(r10, r8)
            goto L_0x0961
        L_0x0524:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28775f(r10, r8)
            goto L_0x0961
        L_0x0535:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m36111e(r13, r8)
            r14.mo28750a(r10, r8)
            goto L_0x0961
        L_0x0546:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28772e(r10, r8)
            goto L_0x0961
        L_0x0557:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28760b(r10, r8)
            goto L_0x0961
        L_0x0568:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28769d(r10, r8)
            goto L_0x0961
        L_0x0579:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.v2 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r8
            r14.mo28751a(r10, r8)
            goto L_0x0961
        L_0x058c:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r7)
            r14.mo28753a(r10, r8, r9)
            goto L_0x0961
        L_0x05a1:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            m36089a(r10, r8, r14)
            goto L_0x0961
        L_0x05b2:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m36114f(r13, r8)
            r14.mo28758a(r10, r8)
            goto L_0x0961
        L_0x05c3:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28766c(r10, r8)
            goto L_0x0961
        L_0x05d4:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m36111e(r13, r8)
            r14.mo28767c(r10, r8)
            goto L_0x0961
        L_0x05e5:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m36109d(r13, r8)
            r14.mo28749a(r10, r8)
            goto L_0x0961
        L_0x05f6:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m36111e(r13, r8)
            r14.mo28773e(r10, r8)
            goto L_0x0961
        L_0x0607:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m36111e(r13, r8)
            r14.mo28770d(r10, r8)
            goto L_0x0961
        L_0x0618:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m36105c(r13, r8)
            r14.mo28748a(r10, r8)
            goto L_0x0961
        L_0x0629:
            boolean r9 = r12.m36095a((T) r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m36098b((T) r13, r8)
            r14.mo28747a(r10, r8)
            goto L_0x0961
        L_0x063a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            r12.m36090a(r14, r10, r8, r7)
            goto L_0x0961
        L_0x0645:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            g.j.a.a.d.g.d6 r10 = r12.m36083a(r7)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35182b(r9, r8, r14, r10)
            goto L_0x0961
        L_0x0658:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0667:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0676:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0685:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0694:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06a3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06b2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06c1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06d0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06df:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06ee:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06fd:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r9, r8, r14, r4)
            goto L_0x0961
        L_0x070c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r9, r8, r14, r4)
            goto L_0x0961
        L_0x071b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r9, r8, r14, r4)
            goto L_0x0961
        L_0x072a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0739:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0748:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0757:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0766:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0775:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0784:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35181b(r9, r8, r14)
            goto L_0x0961
        L_0x0793:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            g.j.a.a.d.g.d6 r10 = r12.m36083a(r7)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35169a(r9, r8, r14, r10)
            goto L_0x0961
        L_0x07a6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35168a(r9, r8, r14)
            goto L_0x0961
        L_0x07b5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07c4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07d3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07e2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07f1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0800:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r9, r8, r14, r5)
            goto L_0x0961
        L_0x080f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r9, r8, r14, r5)
            goto L_0x0961
        L_0x081e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r9, r8, r14, r5)
            goto L_0x0961
        L_0x082d:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r7)
            r14.mo28762b(r10, r8, r9)
            goto L_0x0961
        L_0x0842:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r8)
            r14.mo28761b(r10, r8)
            goto L_0x0961
        L_0x0853:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28775f(r10, r8)
            goto L_0x0961
        L_0x0864:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r8)
            r14.mo28750a(r10, r8)
            goto L_0x0961
        L_0x0875:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28772e(r10, r8)
            goto L_0x0961
        L_0x0886:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28760b(r10, r8)
            goto L_0x0961
        L_0x0897:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28769d(r10, r8)
            goto L_0x0961
        L_0x08a8:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.v2 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r8
            r14.mo28751a(r10, r8)
            goto L_0x0961
        L_0x08bb:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            g.j.a.a.d.g.d6 r9 = r12.m36083a(r7)
            r14.mo28753a(r10, r8, r9)
            goto L_0x0961
        L_0x08d0:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r13, r8)
            m36089a(r10, r8, r14)
            goto L_0x0961
        L_0x08e1:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r13, r8)
            r14.mo28758a(r10, r8)
            goto L_0x0961
        L_0x08f2:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28766c(r10, r8)
            goto L_0x0961
        L_0x0902:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r8)
            r14.mo28767c(r10, r8)
            goto L_0x0961
        L_0x0912:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34844a(r13, r8)
            r14.mo28749a(r10, r8)
            goto L_0x0961
        L_0x0922:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r8)
            r14.mo28773e(r10, r8)
            goto L_0x0961
        L_0x0932:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34860b(r13, r8)
            r14.mo28770d(r10, r8)
            goto L_0x0961
        L_0x0942:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r13, r8)
            r14.mo28748a(r10, r8)
            goto L_0x0961
        L_0x0952:
            boolean r9 = r12.m36094a((T) r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r13, r8)
            r14.mo28747a(r10, r8)
        L_0x0961:
            int r7 = r7 + 3
            goto L_0x04e9
        L_0x0965:
            g.j.a.a.d.g.t3<?> r13 = r12.f26520p
            r13.mo28881a(r0)
            throw r3
        L_0x096b:
            if (r0 != 0) goto L_0x0973
            g.j.a.a.d.g.w6<?, ?> r0 = r12.f26519o
            m36091a(r0, (T) r13, r14)
            return
        L_0x0973:
            g.j.a.a.d.g.t3<?> r13 = r12.f26520p
            r13.mo28886a(r14, r0)
            throw r3
        L_0x0979:
            r12.m36103b((T) r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28398a(java.lang.Object, g.j.a.a.d.g.u7):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m36103b(T r18, p163g.p449j.p450a.p451a.p457d.p464g.C11333u7 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f26510f
            if (r3 == 0) goto L_0x0023
            g.j.a.a.d.g.t3<?> r3 = r0.f26520p
            g.j.a.a.d.g.u3 r3 = r3.mo28882a(r1)
            g.j.a.a.d.g.j6<FieldDescriptorType, java.lang.Object> r5 = r3.f26557a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo29041d()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            r5 = -1
            int[] r6 = r0.f26505a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f26504s
            r8 = 0
            r5 = 0
            r9 = -1
            r10 = 0
        L_0x002e:
            if (r5 >= r6) goto L_0x0468
            int r11 = r0.m36108d(r5)
            int[] r12 = r0.f26505a
            r13 = r12[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.f26512h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            if (r15 != 0) goto L_0x005d
            r15 = 17
            if (r14 > r15) goto L_0x005d
            int r15 = r5 + 2
            r12 = r12[r15]
            r15 = r12 & r16
            if (r15 == r9) goto L_0x0057
            long r9 = (long) r15
            int r10 = r7.getInt(r1, r9)
            goto L_0x0058
        L_0x0057:
            r15 = r9
        L_0x0058:
            int r9 = r12 >>> 20
            int r9 = r4 << r9
            goto L_0x005f
        L_0x005d:
            r15 = r9
            r9 = 0
        L_0x005f:
            if (r3 != 0) goto L_0x0461
            r11 = r11 & r16
            long r11 = (long) r11
            switch(r14) {
                case 0: goto L_0x0451;
                case 1: goto L_0x0445;
                case 2: goto L_0x0439;
                case 3: goto L_0x042d;
                case 4: goto L_0x0421;
                case 5: goto L_0x0415;
                case 6: goto L_0x0409;
                case 7: goto L_0x03fd;
                case 8: goto L_0x03f1;
                case 9: goto L_0x03e0;
                case 10: goto L_0x03d1;
                case 11: goto L_0x03c4;
                case 12: goto L_0x03b7;
                case 13: goto L_0x03aa;
                case 14: goto L_0x039d;
                case 15: goto L_0x0390;
                case 16: goto L_0x0383;
                case 17: goto L_0x0372;
                case 18: goto L_0x0363;
                case 19: goto L_0x0354;
                case 20: goto L_0x0345;
                case 21: goto L_0x0336;
                case 22: goto L_0x0327;
                case 23: goto L_0x0318;
                case 24: goto L_0x0309;
                case 25: goto L_0x02fa;
                case 26: goto L_0x02eb;
                case 27: goto L_0x02d8;
                case 28: goto L_0x02c9;
                case 29: goto L_0x02ba;
                case 30: goto L_0x02ab;
                case 31: goto L_0x029c;
                case 32: goto L_0x028d;
                case 33: goto L_0x027e;
                case 34: goto L_0x026f;
                case 35: goto L_0x0260;
                case 36: goto L_0x0251;
                case 37: goto L_0x0242;
                case 38: goto L_0x0233;
                case 39: goto L_0x0224;
                case 40: goto L_0x0215;
                case 41: goto L_0x0206;
                case 42: goto L_0x01f7;
                case 43: goto L_0x01e8;
                case 44: goto L_0x01d9;
                case 45: goto L_0x01ca;
                case 46: goto L_0x01bb;
                case 47: goto L_0x01ac;
                case 48: goto L_0x019d;
                case 49: goto L_0x018a;
                case 50: goto L_0x0181;
                case 51: goto L_0x0172;
                case 52: goto L_0x0163;
                case 53: goto L_0x0154;
                case 54: goto L_0x0145;
                case 55: goto L_0x0136;
                case 56: goto L_0x0127;
                case 57: goto L_0x0118;
                case 58: goto L_0x0109;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e7;
                case 61: goto L_0x00d6;
                case 62: goto L_0x00c7;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a9;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0069;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x045c
        L_0x0069:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.d6 r9 = r0.m36083a(r5)
            r2.mo28762b(r13, r4, r9)
            goto L_0x045c
        L_0x007c:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            long r11 = m36111e(r1, r11)
            r2.mo28761b(r13, r11)
            goto L_0x045c
        L_0x008b:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28775f(r13, r4)
            goto L_0x045c
        L_0x009a:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            long r11 = m36111e(r1, r11)
            r2.mo28750a(r13, r11)
            goto L_0x045c
        L_0x00a9:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28772e(r13, r4)
            goto L_0x045c
        L_0x00b8:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28760b(r13, r4)
            goto L_0x045c
        L_0x00c7:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28769d(r13, r4)
            goto L_0x045c
        L_0x00d6:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            r2.mo28751a(r13, r4)
            goto L_0x045c
        L_0x00e7:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.d6 r9 = r0.m36083a(r5)
            r2.mo28753a(r13, r4, r9)
            goto L_0x045c
        L_0x00fa:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            m36089a(r13, r4, r2)
            goto L_0x045c
        L_0x0109:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            boolean r4 = m36114f(r1, r11)
            r2.mo28758a(r13, r4)
            goto L_0x045c
        L_0x0118:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28766c(r13, r4)
            goto L_0x045c
        L_0x0127:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            long r11 = m36111e(r1, r11)
            r2.mo28767c(r13, r11)
            goto L_0x045c
        L_0x0136:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            int r4 = m36109d(r1, r11)
            r2.mo28749a(r13, r4)
            goto L_0x045c
        L_0x0145:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            long r11 = m36111e(r1, r11)
            r2.mo28773e(r13, r11)
            goto L_0x045c
        L_0x0154:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            long r11 = m36111e(r1, r11)
            r2.mo28770d(r13, r11)
            goto L_0x045c
        L_0x0163:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            float r4 = m36105c(r1, r11)
            r2.mo28748a(r13, r4)
            goto L_0x045c
        L_0x0172:
            boolean r4 = r0.m36095a((T) r1, r13, r5)
            if (r4 == 0) goto L_0x045c
            double r11 = m36098b((T) r1, r11)
            r2.mo28747a(r13, r11)
            goto L_0x045c
        L_0x0181:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.m36090a(r2, r13, r4, r5)
            goto L_0x045c
        L_0x018a:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            g.j.a.a.d.g.d6 r11 = r0.m36083a(r5)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35182b(r4, r9, r2, r11)
            goto L_0x045c
        L_0x019d:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01ac:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01bb:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01ca:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01d9:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01e8:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r9, r11, r2, r4)
            goto L_0x045c
        L_0x01f7:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0206:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0215:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0224:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0233:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0242:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0251:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r9, r11, r2, r4)
            goto L_0x045c
        L_0x0260:
            int[] r9 = r0.f26505a
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r9, r11, r2, r4)
            goto L_0x045c
        L_0x026f:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35195e(r4, r9, r2, r8)
            goto L_0x045c
        L_0x027e:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35210j(r4, r9, r2, r8)
            goto L_0x045c
        L_0x028d:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35201g(r4, r9, r2, r8)
            goto L_0x045c
        L_0x029c:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35212l(r4, r9, r2, r8)
            goto L_0x045c
        L_0x02ab:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35213m(r4, r9, r2, r8)
            goto L_0x045c
        L_0x02ba:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35207i(r4, r9, r2, r8)
            goto L_0x045c
        L_0x02c9:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35181b(r4, r9, r2)
            goto L_0x045c
        L_0x02d8:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            g.j.a.a.d.g.d6 r11 = r0.m36083a(r5)
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35169a(r4, r9, r2, r11)
            goto L_0x045c
        L_0x02eb:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35168a(r4, r9, r2)
            goto L_0x045c
        L_0x02fa:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35214n(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0309:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35211k(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0318:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35198f(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0327:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35204h(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0336:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35191d(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0345:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35187c(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0354:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35183b(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0363:
            int[] r4 = r0.f26505a
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35170a(r4, r9, r2, r8)
            goto L_0x045c
        L_0x0372:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.d6 r9 = r0.m36083a(r5)
            r2.mo28762b(r13, r4, r9)
            goto L_0x045c
        L_0x0383:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            long r11 = r7.getLong(r1, r11)
            r2.mo28761b(r13, r11)
            goto L_0x045c
        L_0x0390:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28775f(r13, r4)
            goto L_0x045c
        L_0x039d:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            long r11 = r7.getLong(r1, r11)
            r2.mo28750a(r13, r11)
            goto L_0x045c
        L_0x03aa:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28772e(r13, r4)
            goto L_0x045c
        L_0x03b7:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28760b(r13, r4)
            goto L_0x045c
        L_0x03c4:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28769d(r13, r4)
            goto L_0x045c
        L_0x03d1:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.v2 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11342v2) r4
            r2.mo28751a(r13, r4)
            goto L_0x045c
        L_0x03e0:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            g.j.a.a.d.g.d6 r9 = r0.m36083a(r5)
            r2.mo28753a(r13, r4, r9)
            goto L_0x045c
        L_0x03f1:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            java.lang.Object r4 = r7.getObject(r1, r11)
            m36089a(r13, r4, r2)
            goto L_0x045c
        L_0x03fd:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            boolean r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34868c(r1, r11)
            r2.mo28758a(r13, r4)
            goto L_0x045c
        L_0x0409:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28766c(r13, r4)
            goto L_0x045c
        L_0x0415:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            long r11 = r7.getLong(r1, r11)
            r2.mo28767c(r13, r11)
            goto L_0x045c
        L_0x0421:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            int r4 = r7.getInt(r1, r11)
            r2.mo28749a(r13, r4)
            goto L_0x045c
        L_0x042d:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            long r11 = r7.getLong(r1, r11)
            r2.mo28773e(r13, r11)
            goto L_0x045c
        L_0x0439:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            long r11 = r7.getLong(r1, r11)
            r2.mo28770d(r13, r11)
            goto L_0x045c
        L_0x0445:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            float r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34869d(r1, r11)
            r2.mo28748a(r13, r4)
            goto L_0x045c
        L_0x0451:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x045c
            double r11 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34874e(r1, r11)
            r2.mo28747a(r13, r11)
        L_0x045c:
            int r5 = r5 + 3
            r9 = r15
            goto L_0x002e
        L_0x0461:
            g.j.a.a.d.g.t3<?> r1 = r0.f26520p
            r1.mo28881a(r3)
            r4 = 0
            throw r4
        L_0x0468:
            r4 = 0
            if (r3 != 0) goto L_0x0471
            g.j.a.a.d.g.w6<?, ?> r3 = r0.f26519o
            m36091a(r3, (T) r1, r2)
            return
        L_0x0471:
            g.j.a.a.d.g.t3<?> r1 = r0.f26520p
            r1.mo28886a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.m36103b(java.lang.Object, g.j.a.a.d.g.u7):void");
    }

    /* renamed from: a */
    private final <K, V> void m36090a(C11333u7 u7Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f26521q.mo28579c(m36100b(i2));
            throw null;
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m36091a(C11360w6<UT, UB> w6Var, T t, C11333u7 u7Var) throws IOException {
        w6Var.mo29104a(w6Var.mo29114d(t), u7Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r7.mo29106a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x058f, code lost:
        if (r9 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0591, code lost:
        r9 = r7.mo29115e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x059a, code lost:
        if (r7.mo29107a(r9, r12) == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x059c, code lost:
        r12 = r10.f26515k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05a0, code lost:
        if (r12 < r10.f26516l) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05a2, code lost:
        m36086a((java.lang.Object) r11, r10.f26514j[r12], (UB) r9, r7);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05ac, code lost:
        if (r9 != null) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x05ae, code lost:
        r7.mo29111b((java.lang.Object) r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x05b1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x058c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28397a(T r11, p163g.p449j.p450a.p451a.p457d.p464g.C11097e6 r12, p163g.p449j.p450a.p451a.p457d.p464g.C11285r3 r13) throws java.io.IOException {
        /*
            r10 = this;
            if (r13 == 0) goto L_0x05c9
            g.j.a.a.d.g.w6<?, ?> r7 = r10.f26519o
            g.j.a.a.d.g.t3<?> r0 = r10.f26520p
            r8 = 0
            r9 = r8
        L_0x0008:
            int r1 = r12.mo28483p()     // Catch:{ all -> 0x05b2 }
            int r2 = r10.m36115g(r1)     // Catch:{ all -> 0x05b2 }
            if (r2 >= 0) goto L_0x006d
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002d
            int r12 = r10.f26515k
        L_0x0019:
            int r13 = r10.f26516l
            if (r12 >= r13) goto L_0x0027
            int[] r13 = r10.f26514j
            r13 = r13[r12]
            r10.m36086a(r11, r13, (UB) r9, r7)
            int r12 = r12 + 1
            goto L_0x0019
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r7.mo29111b(r11, r9)
        L_0x002c:
            return
        L_0x002d:
            boolean r2 = r10.f26510f     // Catch:{ all -> 0x05b2 }
            if (r2 != 0) goto L_0x0033
            r2 = r8
            goto L_0x003a
        L_0x0033:
            g.j.a.a.d.g.p5 r2 = r10.f26509e     // Catch:{ all -> 0x05b2 }
            java.lang.Object r1 = r0.mo28884a(r13, r2, r1)     // Catch:{ all -> 0x05b2 }
            r2 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x0048
            g.j.a.a.d.g.u3 r4 = r0.mo28889b(r11)     // Catch:{ all -> 0x05b2 }
            r1 = r12
            r3 = r13
            r5 = r9
            r6 = r7
            r0.mo28883a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05b2 }
            throw r8
        L_0x0048:
            r7.mo29106a(r12)     // Catch:{ all -> 0x05b2 }
            if (r9 != 0) goto L_0x0051
            java.lang.Object r9 = r7.mo29115e(r11)     // Catch:{ all -> 0x05b2 }
        L_0x0051:
            boolean r1 = r7.mo29107a(r9, r12)     // Catch:{ all -> 0x05b2 }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.f26515k
        L_0x0059:
            int r13 = r10.f26516l
            if (r12 >= r13) goto L_0x0067
            int[] r13 = r10.f26514j
            r13 = r13[r12]
            r10.m36086a(r11, r13, (UB) r9, r7)
            int r12 = r12 + 1
            goto L_0x0059
        L_0x0067:
            if (r9 == 0) goto L_0x006c
            r7.mo29111b(r11, r9)
        L_0x006c:
            return
        L_0x006d:
            int r3 = r10.m36108d(r2)     // Catch:{ all -> 0x05b2 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0561;
                case 1: goto L_0x0552;
                case 2: goto L_0x0543;
                case 3: goto L_0x0534;
                case 4: goto L_0x0525;
                case 5: goto L_0x0516;
                case 6: goto L_0x0507;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04f0;
                case 9: goto L_0x04bf;
                case 10: goto L_0x04b0;
                case 11: goto L_0x04a1;
                case 12: goto L_0x047f;
                case 13: goto L_0x0470;
                case 14: goto L_0x0461;
                case 15: goto L_0x0452;
                case 16: goto L_0x0443;
                case 17: goto L_0x0412;
                case 18: goto L_0x0404;
                case 19: goto L_0x03f6;
                case 20: goto L_0x03e8;
                case 21: goto L_0x03da;
                case 22: goto L_0x03cc;
                case 23: goto L_0x03be;
                case 24: goto L_0x03b0;
                case 25: goto L_0x03a2;
                case 26: goto L_0x0380;
                case 27: goto L_0x036e;
                case 28: goto L_0x0360;
                case 29: goto L_0x0352;
                case 30: goto L_0x033d;
                case 31: goto L_0x032f;
                case 32: goto L_0x0321;
                case 33: goto L_0x0313;
                case 34: goto L_0x0305;
                case 35: goto L_0x02f7;
                case 36: goto L_0x02e9;
                case 37: goto L_0x02db;
                case 38: goto L_0x02cd;
                case 39: goto L_0x02bf;
                case 40: goto L_0x02b1;
                case 41: goto L_0x02a3;
                case 42: goto L_0x0295;
                case 43: goto L_0x0287;
                case 44: goto L_0x0272;
                case 45: goto L_0x0264;
                case 46: goto L_0x0256;
                case 47: goto L_0x0248;
                case 48: goto L_0x023a;
                case 49: goto L_0x0228;
                case 50: goto L_0x01ec;
                case 51: goto L_0x01da;
                case 52: goto L_0x01c8;
                case 53: goto L_0x01b6;
                case 54: goto L_0x01a4;
                case 55: goto L_0x0192;
                case 56: goto L_0x0180;
                case 57: goto L_0x016e;
                case 58: goto L_0x015c;
                case 59: goto L_0x0154;
                case 60: goto L_0x0123;
                case 61: goto L_0x0115;
                case 62: goto L_0x0103;
                case 63: goto L_0x00de;
                case 64: goto L_0x00cc;
                case 65: goto L_0x00ba;
                case 66: goto L_0x00a8;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x007c;
            }
        L_0x007c:
            if (r9 != 0) goto L_0x0570
            java.lang.Object r9 = r7.mo29098a()     // Catch:{ o4 -> 0x058c }
            goto L_0x0570
        L_0x0084:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r5 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r5 = r12.mo28450a(r5, r13)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0096:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28461e()     // Catch:{ o4 -> 0x058c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x00a8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            int r5 = r12.mo28457c()     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x00ba:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28463f()     // Catch:{ o4 -> 0x058c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x00cc:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            int r5 = r12.mo28469i()     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x00de:
            int r4 = r12.mo28473k()     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.l4 r6 = r10.m36106c(r2)     // Catch:{ o4 -> 0x058c }
            if (r6 == 0) goto L_0x00f5
            boolean r6 = r6.mo28530a(r4)     // Catch:{ o4 -> 0x058c }
            if (r6 == 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            java.lang.Object r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35166a(r1, r4, r9, r7)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x00f5:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r5, r3)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0103:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            int r5 = r12.mo28479n()     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0115:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.v2 r5 = r12.mo28487r()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0123:
            boolean r4 = r10.m36095a((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            if (r4 == 0) goto L_0x013f
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r3)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r6 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r6 = r12.mo28453b(r6, r13)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r5, r6)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            goto L_0x014f
        L_0x013f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r5 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r5 = r12.mo28453b(r5, r13)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
        L_0x014f:
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0154:
            r10.m36092a(r11, r3, r12)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x015c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            boolean r5 = r12.mo28456b()     // Catch:{ o4 -> 0x058c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x016e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            int r5 = r12.mo28459d()     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0180:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28465g()     // Catch:{ o4 -> 0x058c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0192:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            int r5 = r12.mo28471j()     // Catch:{ o4 -> 0x058c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x01a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28485q()     // Catch:{ o4 -> 0x058c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x01b6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28477m()     // Catch:{ o4 -> 0x058c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x01c8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            float r5 = r12.mo28488s()     // Catch:{ o4 -> 0x058c }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x01da:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ o4 -> 0x058c }
            double r5 = r12.mo28467h()     // Catch:{ o4 -> 0x058c }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36102b((T) r11, r1, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x01ec:
            java.lang.Object r1 = r10.m36100b(r2)     // Catch:{ o4 -> 0x058c }
            int r2 = r10.m36108d(r2)     // Catch:{ o4 -> 0x058c }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.lang.Object r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r2)     // Catch:{ o4 -> 0x058c }
            if (r4 == 0) goto L_0x0214
            g.j.a.a.d.g.i5 r5 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            boolean r5 = r5.mo28582f(r4)     // Catch:{ o4 -> 0x058c }
            if (r5 == 0) goto L_0x021d
            g.j.a.a.d.g.i5 r5 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            java.lang.Object r5 = r5.mo28580d(r1)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.i5 r6 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            r6.mo28576a(r5, r4)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r2, r5)     // Catch:{ o4 -> 0x058c }
            r4 = r5
            goto L_0x021d
        L_0x0214:
            g.j.a.a.d.g.i5 r4 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            java.lang.Object r4 = r4.mo28580d(r1)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r2, r4)     // Catch:{ o4 -> 0x058c }
        L_0x021d:
            g.j.a.a.d.g.i5 r2 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            r2.mo28578b(r4)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.i5 r2 = r10.f26521q     // Catch:{ o4 -> 0x058c }
            r2.mo28579c(r1)     // Catch:{ o4 -> 0x058c }
            throw r8
        L_0x0228:
            r1 = r3 & r5
            long r3 = (long) r1
            g.j.a.a.d.g.d6 r1 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.z4 r2 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            java.util.List r2 = r2.mo28269a(r11, r3)     // Catch:{ o4 -> 0x058c }
            r12.mo28455b(r2, r1, r13)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x023a:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28474k(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0248:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28478m(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0256:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28466g(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0264:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28470i(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0272:
            g.j.a.a.d.g.z4 r4 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ o4 -> 0x058c }
            java.util.List r3 = r4.mo28269a(r11, r5)     // Catch:{ o4 -> 0x058c }
            r12.mo28458c(r3)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.l4 r2 = r10.m36106c(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35167a(r1, r3, r2, r9, r7)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0287:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28460d(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0295:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28472j(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02a3:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28475l(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02b1:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28464f(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02bf:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28468h(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02cd:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28454b(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02db:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28451a(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02e9:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28462e(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x02f7:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28484p(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0305:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28474k(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0313:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28478m(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0321:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28466g(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x032f:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28470i(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x033d:
            g.j.a.a.d.g.z4 r4 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ o4 -> 0x058c }
            java.util.List r3 = r4.mo28269a(r11, r5)     // Catch:{ o4 -> 0x058c }
            r12.mo28458c(r3)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.l4 r2 = r10.m36106c(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35167a(r1, r3, r2, r9, r7)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0352:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28460d(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0360:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28482o(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x036e:
            g.j.a.a.d.g.d6 r1 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.z4 r4 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            java.util.List r2 = r4.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28452a(r2, r1, r13)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0380:
            boolean r1 = m36113f(r3)     // Catch:{ o4 -> 0x058c }
            if (r1 == 0) goto L_0x0394
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28486q(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0394:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28480n(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03a2:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28472j(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03b0:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28475l(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03be:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28464f(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03cc:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28468h(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03da:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28454b(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03e8:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28451a(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x03f6:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28462e(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0404:
            g.j.a.a.d.g.z4 r1 = r10.f26518n     // Catch:{ o4 -> 0x058c }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ o4 -> 0x058c }
            java.util.List r1 = r1.mo28269a(r11, r2)     // Catch:{ o4 -> 0x058c }
            r12.mo28484p(r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0412:
            boolean r1 = r10.m36094a((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            if (r1 == 0) goto L_0x0430
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r3)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r2 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r2 = r12.mo28450a(r2, r13)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r1, r2)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0430:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r1 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = r12.mo28450a(r1, r13)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0443:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28461e()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34853a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0452:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            int r1 = r12.mo28457c()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0461:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28463f()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34853a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0470:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            int r1 = r12.mo28469i()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x047f:
            int r4 = r12.mo28473k()     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.l4 r6 = r10.m36106c(r2)     // Catch:{ o4 -> 0x058c }
            if (r6 == 0) goto L_0x0496
            boolean r6 = r6.mo28530a(r4)     // Catch:{ o4 -> 0x058c }
            if (r6 == 0) goto L_0x0490
            goto L_0x0496
        L_0x0490:
            java.lang.Object r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35166a(r1, r4, r9, r7)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0496:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r5, r4)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04a1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            int r1 = r12.mo28479n()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04b0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.v2 r1 = r12.mo28487r()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04bf:
            boolean r1 = r10.m36094a((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            if (r1 == 0) goto L_0x04dd
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34877f(r11, r3)     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r2 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r2 = r12.mo28453b(r2, r13)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r1, r2)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04dd:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            g.j.a.a.d.g.d6 r1 = r10.m36083a(r2)     // Catch:{ o4 -> 0x058c }
            java.lang.Object r1 = r12.mo28453b(r1, r13)     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04f0:
            r10.m36092a(r11, r3, r12)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x04f8:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            boolean r1 = r12.mo28456b()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34855a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0507:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            int r1 = r12.mo28459d()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0516:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28465g()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34853a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0525:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            int r1 = r12.mo28471j()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34852a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0534:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28485q()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34853a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0543:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            long r5 = r12.mo28477m()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34853a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0552:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            float r1 = r12.mo28488s()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34851a(r11, r3, r1)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0561:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ o4 -> 0x058c }
            double r5 = r12.mo28467h()     // Catch:{ o4 -> 0x058c }
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34850a(r11, r3, r5)     // Catch:{ o4 -> 0x058c }
            r10.m36101b((T) r11, r2)     // Catch:{ o4 -> 0x058c }
            goto L_0x0008
        L_0x0570:
            boolean r1 = r7.mo29107a(r9, r12)     // Catch:{ o4 -> 0x058c }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.f26515k
        L_0x0578:
            int r13 = r10.f26516l
            if (r12 >= r13) goto L_0x0586
            int[] r13 = r10.f26514j
            r13 = r13[r12]
            r10.m36086a(r11, r13, (UB) r9, r7)
            int r12 = r12 + 1
            goto L_0x0578
        L_0x0586:
            if (r9 == 0) goto L_0x058b
            r7.mo29111b(r11, r9)
        L_0x058b:
            return
        L_0x058c:
            r7.mo29106a(r12)     // Catch:{ all -> 0x05b2 }
            if (r9 != 0) goto L_0x0596
            java.lang.Object r1 = r7.mo29115e(r11)     // Catch:{ all -> 0x05b2 }
            r9 = r1
        L_0x0596:
            boolean r1 = r7.mo29107a(r9, r12)     // Catch:{ all -> 0x05b2 }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.f26515k
        L_0x059e:
            int r13 = r10.f26516l
            if (r12 >= r13) goto L_0x05ac
            int[] r13 = r10.f26514j
            r13 = r13[r12]
            r10.m36086a(r11, r13, (UB) r9, r7)
            int r12 = r12 + 1
            goto L_0x059e
        L_0x05ac:
            if (r9 == 0) goto L_0x05b1
            r7.mo29111b(r11, r9)
        L_0x05b1:
            return
        L_0x05b2:
            r12 = move-exception
            int r13 = r10.f26515k
        L_0x05b5:
            int r0 = r10.f26516l
            if (r13 >= r0) goto L_0x05c3
            int[] r0 = r10.f26514j
            r0 = r0[r13]
            r10.m36086a(r11, r0, (UB) r9, r7)
            int r13 = r13 + 1
            goto L_0x05b5
        L_0x05c3:
            if (r9 == 0) goto L_0x05c8
            r7.mo29111b(r11, r9)
        L_0x05c8:
            throw r12
        L_0x05c9:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28397a(java.lang.Object, g.j.a.a.d.g.e6, g.j.a.a.d.g.r3):void");
    }

    /* renamed from: b */
    private final Object m36100b(int i) {
        return this.f26506b[(i / 3) << 1];
    }

    /* renamed from: b */
    private static <T> double m36098b(T t, long j) {
        return ((Double) C11058c7.m34877f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final void m36101b(T t, int i) {
        if (!this.f26512h) {
            int e = m36110e(i);
            long j = (long) (e & 1048575);
            C11058c7.m34852a((Object) t, j, C11058c7.m34844a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m36102b(T t, int i, int i2) {
        C11058c7.m34852a((Object) t, (long) (m36110e(i2) & 1048575), i);
    }

    /* renamed from: b */
    private final int m36099b(int i, int i2) {
        int length = (this.f26505a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f26505a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:869)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* renamed from: a */
    private final int m36081a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p163g.p449j.p450a.p451a.p457d.p464g.C11270q2 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f26504s
            java.lang.Object r11 = r11.getObject(r1, r9)
            g.j.a.a.d.g.m4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11216m4) r11
            boolean r12 = r11.mo28709h0()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            g.j.a.a.d.g.m4 r11 = r11.mo28257a(r12)
            sun.misc.Unsafe r12 = f26504s
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            g.j.a.a.d.g.d6 r1 = r0.m36083a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36029a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f26445c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r9 = r7.f26443a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36029a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f26445c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r1, r7)
            long r4 = r7.f26444b
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r4)
            r11.mo28390b(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r7)
            long r8 = r7.f26444b
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r8)
            r11.mo28390b(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r7)
            long r8 = r7.f26444b
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r8)
            r11.mo28390b(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            g.j.a.a.d.g.h4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11139h4) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r4 = r7.f26443a
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r4)
            r11.mo28535g(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            g.j.a.a.d.g.h4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11139h4) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r4 = r7.f26443a
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r4)
            r11.mo28535g(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r4 = r7.f26443a
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r4)
            r11.mo28535g(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36032a(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36024a(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            g.j.a.a.d.g.e4 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r1
            g.j.a.a.d.g.z6 r3 = r1.zzahz
            g.j.a.a.d.g.z6 r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11400z6.m36843d()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            g.j.a.a.d.g.l4 r4 = r0.m36106c(r8)
            g.j.a.a.d.g.w6<?, ?> r5 = r0.f26519o
            r6 = r22
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11113f6.m35167a(r6, r11, r4, r3, r5)
            g.j.a.a.d.g.z6 r3 = (p163g.p449j.p450a.p451a.p457d.p464g.C11400z6) r3
            if (r3 == 0) goto L_0x014e
            r1.zzahz = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r4 = r7.f26443a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            g.j.a.a.d.g.v2 r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.f26574U
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            g.j.a.a.d.g.v2 r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.m36528a(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r4 = r7.f26443a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            g.j.a.a.d.g.v2 r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.f26574U
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            g.j.a.a.d.g.v2 r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.m36528a(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x019a:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x019f:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x01a4:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            g.j.a.a.d.g.d6 r1 = r0.m36083a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36028a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r6 = r7.f26443a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.f26198a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r8 = r7.f26443a
            if (r2 != r8) goto L_0x0422
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r6, r7)
            int r6 = r7.f26443a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.f26198a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x0211:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x0216:
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r6 = r7.f26443a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11114f7.m35222a(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.f26198a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r8 = r7.f26443a
            if (r2 != r8) goto L_0x0422
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r6, r7)
            int r6 = r7.f26443a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = p163g.p449j.p450a.p451a.p457d.p464g.C11114f7.m35222a(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.f26198a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35938i()
            throw r1
        L_0x0267:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x026c:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35938i()
            throw r1
        L_0x0271:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35931b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            g.j.a.a.d.g.t2 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11313t2) r11
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r4 = r7.f26443a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r2, r7)
            long r5 = r7.f26444b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.mo29015a(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            g.j.a.a.d.g.t2 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11313t2) r11
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r7)
            long r8 = r7.f26444b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.mo29015a(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r8 = r7.f26443a
            if (r2 != r8) goto L_0x0422
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r6, r7)
            long r8 = r7.f26444b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.mo29015a(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            g.j.a.a.d.g.h4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11139h4) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r3, r1)
            r11.mo28535g(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            g.j.a.a.d.g.h4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11139h4) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r18, r19)
            r11.mo28535g(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r3, r4)
            r11.mo28535g(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r3, r1)
            r11.mo28390b(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r18, r19)
            r11.mo28390b(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            long r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r3, r4)
            r11.mo28390b(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36032a(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36024a(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r1, r7)
            long r4 = r7.f26444b
            r11.mo28390b(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            g.j.a.a.d.g.d5 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11076d5) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r7)
            long r8 = r7.f26444b
            r11.mo28390b(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r7)
            long r8 = r7.f26444b
            r11.mo28390b(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            g.j.a.a.d.g.a4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11025a4) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r3, r1)
            r11.mo28258a(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            g.j.a.a.d.g.a4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11025a4) r11
            float r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r18, r19)
            r11.mo28258a(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            float r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r3, r4)
            r11.mo28258a(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            g.j.a.a.d.g.n3 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11229n3) r11
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r7)
            int r2 = r7.f26443a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r3, r1)
            r11.mo28730a(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            g.j.a.a.d.g.n3 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11229n3) r11
            double r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r18, r19)
            r11.mo28730a(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r1, r7)
            int r6 = r7.f26443a
            if (r2 != r6) goto L_0x0423
            double r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r3, r4)
            r11.mo28730a(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.m36081a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, g.j.a.a.d.g.q2):int");
    }

    /* renamed from: a */
    private final <K, V> int m36082a(T t, byte[] bArr, int i, int i2, int i3, long j, C11270q2 q2Var) throws IOException {
        Unsafe unsafe = f26504s;
        Object b = m36100b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f26521q.mo28582f(object)) {
            Object d = this.f26521q.mo28580d(b);
            this.f26521q.mo28576a(d, object);
            unsafe.putObject(t, j, d);
        }
        this.f26521q.mo28579c(b);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m36080a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p163g.p449j.p450a.p451a.p457d.p464g.C11270q2 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f26504s
            int[] r7 = r0.f26505a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            g.j.a.a.d.g.d6 r2 = r0.m36083a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36029a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f26445c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f26445c
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r11)
            long r3 = r11.f26444b
            long r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r11)
            int r3 = r11.f26443a
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r11)
            int r4 = r11.f26443a
            g.j.a.a.d.g.l4 r5 = r0.m36106c(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo28530a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            g.j.a.a.d.g.z6 r1 = m36112e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo29200a(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36040e(r3, r4, r11)
            java.lang.Object r3 = r11.f26445c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            g.j.a.a.d.g.d6 r2 = r0.m36083a(r6)
            r5 = r20
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36030a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f26445c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f26445c
            java.lang.Object r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r11)
            int r4 = r11.f26443a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11114f7.m35222a(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            g.j.a.a.d.g.p4 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35938i()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.f26198a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r11)
            long r3 = r11.f26444b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r3, r4, r11)
            int r3 = r11.f26443a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r3, r4, r11)
            long r3 = r11.f26444b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.m36080a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, g.j.a.a.d.g.q2):int");
    }

    /* renamed from: a */
    private final C11077d6 m36083a(int i) {
        int i2 = (i / 3) << 1;
        C11077d6 d6Var = (C11077d6) this.f26506b[i2];
        if (d6Var != null) {
            return d6Var;
        }
        C11077d6 a = C11399z5.m36838a().mo29197a((Class) this.f26506b[i2 + 1]);
        this.f26506b[i2] = a;
        return a;
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v13, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v18, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v27, types: [int] */
    /* JADX WARNING: type inference failed for: r1v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r26v0 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r26v3 */
    /* JADX WARNING: type inference failed for: r2v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v8, types: [int] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [int] */
    /* JADX WARNING: type inference failed for: r26v4 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r26v5 */
    /* JADX WARNING: type inference failed for: r1v28, types: [int] */
    /* JADX WARNING: type inference failed for: r2v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r12v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r12v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r12v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v29, types: [int] */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r1v60, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r8v36 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r3v27, types: [int] */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r26v6 */
    /* JADX WARNING: type inference failed for: r26v7 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r8v39 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r8v40 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r8v42 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r8v43 */
    /* JADX WARNING: type inference failed for: r8v44 */
    /* JADX WARNING: type inference failed for: r8v45 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r8v46 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0017, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0017, code lost:
        r12 = r12;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        r7 = r4;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017a, code lost:
        r6 = r6 | r23;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        r6 = r6 | r23;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021b, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r35;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0245, code lost:
        r33 = r7;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02bc, code lost:
        r0 = r7 + 8;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02be, code lost:
        r6 = r6 | r23;
        r7 = r33;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c2, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c6, code lost:
        r13 = r34;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02cc, code lost:
        r18 = r33;
        r20 = r6;
        r2 = r7;
        r7 = r8;
        r19 = r9;
        r27 = r10;
        r25 = r11;
        r6 = r35;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v13, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r32v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 602
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x043b  */
    /* JADX WARNING: Unknown variable types count: 61 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28895a(T r31, byte[] r32, int r33, int r34, int r35, p163g.p449j.p450a.p451a.p457d.p464g.C11270q2 r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f26504s
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            r17 = 0
            if (r0 >= r13) goto L_0x047d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36027a(r0, r12, r3, r9)
            int r3 = r9.f26443a
            r4 = r0
            r5 = r3
            goto L_0x002c
        L_0x002a:
            r5 = r0
            r4 = r3
        L_0x002c:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.m36078a(r3, r2)
            goto L_0x003d
        L_0x0039:
            int r1 = r15.m36115g(r3)
        L_0x003d:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0050
            r25 = r3
            r2 = r4
            r20 = r6
            r18 = r7
            r27 = r10
            r6 = r11
            r19 = 0
            r7 = r5
            goto L_0x03e2
        L_0x0050:
            int[] r1 = r15.f26505a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r8 & r19
            long r12 = (long) r5
            r5 = 17
            r21 = r8
            if (r11 > r5) goto L_0x02dc
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r23 = r8 << r5
            r1 = r1 & r19
            r5 = -1
            if (r1 == r7) goto L_0x0084
            if (r7 == r5) goto L_0x007e
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x007e:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x0084:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x028a;
                case 2: goto L_0x0264;
                case 3: goto L_0x0264;
                case 4: goto L_0x0249;
                case 5: goto L_0x0224;
                case 6: goto L_0x0201;
                case 7: goto L_0x01d9;
                case 8: goto L_0x01b4;
                case 9: goto L_0x017e;
                case 10: goto L_0x0163;
                case 11: goto L_0x0249;
                case 12: goto L_0x0131;
                case 13: goto L_0x0201;
                case 14: goto L_0x0224;
                case 15: goto L_0x0116;
                case 16: goto L_0x00e9;
                case 17: goto L_0x0097;
                default: goto L_0x0088;
            }
        L_0x0088:
            r12 = r32
            r13 = r36
            r9 = r2
            r11 = r3
            r33 = r7
            r8 = r20
            r19 = -1
        L_0x0094:
            r7 = r4
            goto L_0x02cc
        L_0x0097:
            r8 = 3
            if (r0 != r8) goto L_0x00dd
            int r0 = r3 << 3
            r8 = r0 | 4
            g.j.a.a.d.g.d6 r0 = r15.m36083a(r2)
            r1 = r32
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r34
            r4 = r8
            r8 = r20
            r19 = -1
            r5 = r36
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36029a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x00c0
            r5 = r36
            java.lang.Object r1 = r5.f26445c
            r10.putObject(r14, r12, r1)
            goto L_0x00cf
        L_0x00c0:
            r5 = r36
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f26445c
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00cf:
            r6 = r6 | r23
            r12 = r32
            r13 = r34
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r35
            r9 = r5
            goto L_0x0017
        L_0x00dd:
            r9 = r2
            r11 = r3
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            goto L_0x0245
        L_0x00e9:
            r5 = r36
            r9 = r2
            r11 = r3
            r8 = r20
            r19 = -1
            if (r0 != 0) goto L_0x0111
            r2 = r12
            r12 = r32
            int r13 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r4, r5)
            long r0 = r5.f26444b
            long r17 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r0)
            r0 = r10
            r1 = r31
            r33 = r13
            r13 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r33
            goto L_0x02c2
        L_0x0111:
            r12 = r32
            r13 = r5
            goto L_0x0245
        L_0x0116:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0245
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r4, r13)
            int r1 = r13.f26443a
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x017a
        L_0x0131:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0245
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r4, r13)
            int r1 = r13.f26443a
            g.j.a.a.d.g.l4 r4 = r15.m36106c(r9)
            if (r4 == 0) goto L_0x015f
            boolean r4 = r4.mo28530a(r1)
            if (r4 == 0) goto L_0x0151
            goto L_0x015f
        L_0x0151:
            g.j.a.a.d.g.z6 r2 = m36112e(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo29200a(r8, r1)
            goto L_0x02c2
        L_0x015f:
            r10.putInt(r14, r2, r1)
            goto L_0x017a
        L_0x0163:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0245
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36040e(r12, r4, r13)
            java.lang.Object r1 = r13.f26445c
            r10.putObject(r14, r2, r1)
        L_0x017a:
            r6 = r6 | r23
            goto L_0x02c2
        L_0x017e:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x01b0
            g.j.a.a.d.g.d6 r0 = r15.m36083a(r9)
            r5 = r34
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36030a(r0, r12, r4, r5, r13)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x01a1
            java.lang.Object r1 = r13.f26445c
            r10.putObject(r14, r2, r1)
            goto L_0x0219
        L_0x01a1:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f26445c
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0219
        L_0x01b0:
            r5 = r34
            goto L_0x0245
        L_0x01b4:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0245
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01cf
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36037c(r12, r4, r13)
            goto L_0x01d3
        L_0x01cf:
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36039d(r12, r4, r13)
        L_0x01d3:
            java.lang.Object r1 = r13.f26445c
            r10.putObject(r14, r2, r1)
            goto L_0x0219
        L_0x01d9:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0245
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r4, r13)
            r33 = r0
            long r0 = r13.f26444b
            r20 = 0
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x01f8
            r0 = 1
            goto L_0x01f9
        L_0x01f8:
            r0 = 0
        L_0x01f9:
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34855a(r14, r2, r0)
            r6 = r6 | r23
            r0 = r33
            goto L_0x021b
        L_0x0201:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0245
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0219:
            r6 = r6 | r23
        L_0x021b:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r35
            r13 = r5
            goto L_0x0017
        L_0x0224:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 1
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0245
            long r17 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r12, r4)
            r0 = r10
            r1 = r31
            r33 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02bc
        L_0x0245:
            r33 = r7
            goto L_0x0094
        L_0x0249:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != 0) goto L_0x02cc
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r7, r13)
            int r1 = r13.f26443a
            r10.putInt(r14, r2, r1)
            goto L_0x02be
        L_0x0264:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != 0) goto L_0x02cc
            int r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r7, r13)
            long r4 = r13.f26444b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r33
            goto L_0x02c6
        L_0x028a:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != r1) goto L_0x02cc
            float r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r12, r7)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34851a(r14, r2, r0)
            int r0 = r7 + 4
            goto L_0x02be
        L_0x02a4:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r1 = 1
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != r1) goto L_0x02cc
            double r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r12, r7)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34850a(r14, r2, r0)
        L_0x02bc:
            int r0 = r7 + 8
        L_0x02be:
            r6 = r6 | r23
            r7 = r33
        L_0x02c2:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c6:
            r13 = r34
            r11 = r35
            goto L_0x0017
        L_0x02cc:
            r18 = r33
            r20 = r6
            r2 = r7
            r7 = r8
            r19 = r9
            r27 = r10
            r25 = r11
            r6 = r35
            goto L_0x03e2
        L_0x02dc:
            r5 = r3
            r18 = r7
            r8 = r20
            r19 = -1
            r7 = r4
            r28 = r12
            r12 = r32
            r13 = r9
            r9 = r2
            r2 = r28
            r1 = 27
            if (r11 != r1) goto L_0x0341
            r1 = 2
            if (r0 != r1) goto L_0x0334
            java.lang.Object r0 = r10.getObject(r14, r2)
            g.j.a.a.d.g.m4 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11216m4) r0
            boolean r1 = r0.mo28709h0()
            if (r1 != 0) goto L_0x0311
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0308
            r1 = 10
            goto L_0x030a
        L_0x0308:
            int r1 = r1 << 1
        L_0x030a:
            g.j.a.a.d.g.m4 r0 = r0.mo28257a(r1)
            r10.putObject(r14, r2, r0)
        L_0x0311:
            r11 = r0
            g.j.a.a.d.g.d6 r0 = r15.m36083a(r9)
            r1 = r8
            r2 = r32
            r3 = r7
            r4 = r34
            r7 = r5
            r5 = r11
            r20 = r6
            r6 = r36
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36028a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r35
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r18
            r6 = r20
            r13 = r34
            goto L_0x0017
        L_0x0334:
            r20 = r6
            r25 = r5
            r15 = r7
            r26 = r8
            r19 = r9
            r27 = r10
            goto L_0x03a8
        L_0x0341:
            r20 = r6
            r6 = r5
            r1 = 49
            if (r11 > r1) goto L_0x0390
            r5 = r21
            long r4 = (long) r5
            r1 = r0
            r0 = r30
            r33 = r1
            r1 = r31
            r23 = r2
            r2 = r32
            r3 = r7
            r21 = r4
            r4 = r34
            r5 = r8
            r25 = r6
            r15 = r7
            r7 = r33
            r26 = r8
            r8 = r9
            r19 = r9
            r27 = r10
            r9 = r21
            r12 = r23
            r14 = r36
            int r0 = r0.m36081a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0376
            goto L_0x03de
        L_0x0376:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r7 = r18
            r2 = r19
            r6 = r20
            r1 = r25
            r3 = r26
        L_0x038c:
            r10 = r27
            goto L_0x0017
        L_0x0390:
            r33 = r0
            r23 = r2
            r25 = r6
            r15 = r7
            r26 = r8
            r19 = r9
            r27 = r10
            r5 = r21
            r0 = 50
            if (r11 != r0) goto L_0x03c1
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x03ae
        L_0x03a8:
            r6 = r35
            r2 = r15
        L_0x03ab:
            r7 = r26
            goto L_0x03e2
        L_0x03ae:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r23
            r8 = r36
            r0.m36082a((T) r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x03c1:
            r7 = r33
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r8 = r5
            r5 = r26
            r6 = r25
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r36
            int r0 = r0.m36080a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0463
        L_0x03de:
            r6 = r35
            r2 = r0
            goto L_0x03ab
        L_0x03e2:
            if (r7 != r6) goto L_0x03f3
            if (r6 != 0) goto L_0x03e7
            goto L_0x03f3
        L_0x03e7:
            r4 = -1
            r8 = r30
            r11 = r31
            r3 = r7
            r0 = r18
            r1 = r20
            goto L_0x048c
        L_0x03f3:
            r8 = r30
            boolean r0 = r8.f26510f
            if (r0 == 0) goto L_0x043b
            r9 = r36
            g.j.a.a.d.g.r3 r0 = r9.f26446d
            g.j.a.a.d.g.r3 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36043c()
            if (r0 == r1) goto L_0x0438
            g.j.a.a.d.g.p5 r0 = r8.f26509e
            g.j.a.a.d.g.r3 r1 = r9.f26446d
            r10 = r25
            g.j.a.a.d.g.e4$e r0 = r1.mo28866a(r0, r10)
            if (r0 != 0) goto L_0x0428
            g.j.a.a.d.g.z6 r4 = m36112e(r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36026a(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r6
            r3 = r7
            r15 = r8
            goto L_0x0474
        L_0x0428:
            r11 = r31
            r0 = r11
            g.j.a.a.d.g.e4$b r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11092b) r0
            r0.mo28447n()
            g.j.a.a.d.g.u3<java.lang.Object> r0 = r0.zzaic
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0438:
            r11 = r31
            goto L_0x043f
        L_0x043b:
            r11 = r31
            r9 = r36
        L_0x043f:
            r10 = r25
            g.j.a.a.d.g.z6 r4 = m36112e(r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36026a(r0, r1, r2, r3, r4, r5)
            r12 = r32
            r13 = r34
            r3 = r7
            r15 = r8
            r1 = r10
            r14 = r11
            r7 = r18
            r2 = r19
            r10 = r27
            r11 = r6
            r6 = r20
            goto L_0x0017
        L_0x0463:
            r10 = r25
            r7 = r26
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r3 = r7
        L_0x0474:
            r1 = r10
            r7 = r18
            r2 = r19
            r6 = r20
            goto L_0x038c
        L_0x047d:
            r20 = r6
            r18 = r7
            r27 = r10
            r6 = r11
            r11 = r14
            r8 = r15
            r2 = r0
            r0 = r18
            r1 = r20
            r4 = -1
        L_0x048c:
            if (r0 == r4) goto L_0x0494
            long r4 = (long) r0
            r0 = r27
            r0.putInt(r11, r4, r1)
        L_0x0494:
            int r0 = r8.f26515k
            r1 = r17
        L_0x0498:
            int r4 = r8.f26516l
            if (r0 >= r4) goto L_0x04aa
            int[] r4 = r8.f26514j
            r4 = r4[r0]
            g.j.a.a.d.g.w6<?, ?> r5 = r8.f26519o
            r8.m36086a(r11, r4, (UB) r1, r5)
            g.j.a.a.d.g.z6 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11400z6) r1
            int r0 = r0 + 1
            goto L_0x0498
        L_0x04aa:
            if (r1 == 0) goto L_0x04b1
            g.j.a.a.d.g.w6<?, ?> r0 = r8.f26519o
            r0.mo29111b(r11, r1)
        L_0x04b1:
            if (r6 != 0) goto L_0x04bd
            r0 = r34
            if (r2 != r0) goto L_0x04b8
            goto L_0x04c3
        L_0x04b8:
            g.j.a.a.d.g.p4 r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35937h()
            throw r0
        L_0x04bd:
            r0 = r34
            if (r2 > r0) goto L_0x04c4
            if (r3 != r6) goto L_0x04c4
        L_0x04c3:
            return r2
        L_0x04c4:
            g.j.a.a.d.g.p4 r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35937h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28895a(java.lang.Object, byte[], int, int, int, g.j.a.a.d.g.q2):int");
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r17v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r3v13, types: [int] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024e, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e1, code lost:
        if (r0 == r15) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022b, code lost:
        if (r0 == r15) goto L_0x022d;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r29v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 271
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28400a(T r28, byte[] r29, int r30, int r31, p163g.p449j.p450a.p451a.p457d.p464g.C11270q2 r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.f26512h
            if (r0 == 0) goto L_0x025a
            sun.misc.Unsafe r9 = f26504s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0251
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36027a(r0, r12, r3, r11)
            int r3 = r11.f26443a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m36078a(r7, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m36115g(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x022e
        L_0x004b:
            int[] r0 = r15.f26505a
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r8, r11)
            r19 = r1
            long r0 = r11.f26444b
            long r21 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35287a(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r8, r11)
            int r1 = r11.f26443a
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11152i3.m35290g(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r8, r11)
            int r1 = r11.f26443a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36040e(r12, r8, r11)
            java.lang.Object r1 = r11.f26445c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            g.j.a.a.d.g.d6 r0 = r15.m36083a(r4)
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36030a(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.f26445c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.f26445c
            java.lang.Object r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35152a(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36037c(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36039d(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.f26445c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r8, r11)
            long r5 = r11.f26444b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34855a(r14, r2, r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36031a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x024e
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36035b(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36033a(r12, r8, r11)
            int r1 = r11.f26443a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36034b(r12, r8, r11)
            long r4 = r11.f26444b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36038d(r12, r8)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34851a(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36036c(r12, r8)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34850a(r14, r2, r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x024e
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01ae
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            g.j.a.a.d.g.m4 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11216m4) r0
            boolean r3 = r0.mo28709h0()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            g.j.a.a.d.g.m4 r0 = r0.mo28257a(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            g.j.a.a.d.g.d6 r0 = r15.m36083a(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36028a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x024e
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x01fb
        L_0x01ae:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e4
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m36081a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x023e
            goto L_0x022d
        L_0x01e4:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0211
            r7 = r30
            if (r7 == r10) goto L_0x01fd
        L_0x01fb:
            r2 = r15
            goto L_0x022e
        L_0x01fd:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            r0.m36082a((T) r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x0211:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m36080a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x023e
        L_0x022d:
            r2 = r0
        L_0x022e:
            g.j.a.a.d.g.z6 r4 = m36112e(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36026a(r0, r1, r2, r3, r4, r5)
        L_0x023e:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x024e:
            r10 = -1
            goto L_0x0017
        L_0x0251:
            r4 = r13
            if (r0 != r4) goto L_0x0255
            return
        L_0x0255:
            g.j.a.a.d.g.p4 r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35937h()
            throw r0
        L_0x025a:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.mo28895a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11302s5.mo28400a(java.lang.Object, byte[], int, int, g.j.a.a.d.g.q2):void");
    }

    /* renamed from: a */
    private final <UT, UB> UB m36086a(Object obj, int i, UB ub, C11360w6<UT, UB> w6Var) {
        int i2 = this.f26505a[i];
        Object f = C11058c7.m34877f(obj, (long) (m36108d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        C11203l4 c = m36106c(i);
        if (c == null) {
            return ub;
        }
        m36085a(i, i2, this.f26521q.mo28578b(f), c, ub, w6Var);
        throw null;
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m36085a(int i, int i2, Map<K, V> map, C11203l4 l4Var, UB ub, C11360w6<UT, UB> w6Var) {
        this.f26521q.mo28579c(m36100b(i));
        throw null;
    }

    /* renamed from: a */
    public final boolean mo28401a(T t) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f26515k) {
                return !this.f26510f || this.f26520p.mo28882a((Object) t).mo29039c();
            }
            int i5 = this.f26514j[i2];
            int i6 = this.f26505a[i5];
            int d = m36108d(i5);
            if (!this.f26512h) {
                int i7 = this.f26505a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = f26504s.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & d) != 0) && !m36096a(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & d) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m36095a(t, i6, i5) && !m36097a((Object) t, d, m36083a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 == 50 && !this.f26521q.mo28577a(C11058c7.m34877f(t, (long) (d & 1048575))).isEmpty()) {
                            this.f26521q.mo28579c(m36100b(i5));
                            throw null;
                        }
                    }
                }
                List list = (List) C11058c7.m34877f(t, (long) (d & 1048575));
                if (!list.isEmpty()) {
                    C11077d6 a = m36083a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a.mo28401a(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m36096a(t, i5, i4, i) && !m36097a((Object) t, d, m36083a(i5))) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static boolean m36097a(Object obj, int i, C11077d6 d6Var) {
        return d6Var.mo28401a(C11058c7.m34877f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m36089a(int i, Object obj, C11333u7 u7Var) throws IOException {
        if (obj instanceof String) {
            u7Var.mo28754a(i, (String) obj);
        } else {
            u7Var.mo28751a(i, (C11342v2) obj);
        }
    }

    /* renamed from: a */
    private final void m36092a(Object obj, int i, C11097e6 e6Var) throws IOException {
        if (m36113f(i)) {
            C11058c7.m34854a(obj, (long) (i & 1048575), (Object) e6Var.mo28489t());
        } else if (this.f26511g) {
            C11058c7.m34854a(obj, (long) (i & 1048575), (Object) e6Var.mo28481o());
        } else {
            C11058c7.m34854a(obj, (long) (i & 1048575), (Object) e6Var.mo28487r());
        }
    }

    /* renamed from: a */
    private final boolean m36096a(T t, int i, int i2, int i3) {
        if (this.f26512h) {
            return m36094a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m36094a(T t, int i) {
        if (this.f26512h) {
            int d = m36108d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C11058c7.m34874e(t, j) != 0.0d;
                case 1:
                    return C11058c7.m34869d(t, j) != 0.0f;
                case 2:
                    return C11058c7.m34860b(t, j) != 0;
                case 3:
                    return C11058c7.m34860b(t, j) != 0;
                case 4:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 5:
                    return C11058c7.m34860b(t, j) != 0;
                case 6:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 7:
                    return C11058c7.m34868c(t, j);
                case 8:
                    Object f = C11058c7.m34877f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C11342v2) {
                        return !C11342v2.f26574U.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C11058c7.m34877f(t, j) != null;
                case 10:
                    return !C11342v2.f26574U.equals(C11058c7.m34877f(t, j));
                case 11:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 12:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 13:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 14:
                    return C11058c7.m34860b(t, j) != 0;
                case 15:
                    return C11058c7.m34844a((Object) t, j) != 0;
                case 16:
                    return C11058c7.m34860b(t, j) != 0;
                case 17:
                    return C11058c7.m34877f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m36110e(i);
            return (C11058c7.m34844a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m36095a(T t, int i, int i2) {
        return C11058c7.m34844a((Object) t, (long) (m36110e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final int m36078a(int i, int i2) {
        if (i < this.f26507c || i > this.f26508d) {
            return -1;
        }
        return m36099b(i, i2);
    }
}
