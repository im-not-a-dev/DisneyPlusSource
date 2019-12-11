package p096e.p114f.p117b;

import java.util.Arrays;
import p096e.p114f.p117b.C3962i.C3963a;

/* renamed from: e.f.b.a */
/* compiled from: ArrayLinkedVariables */
public class C3953a {

    /* renamed from: a */
    int f9828a = 0;

    /* renamed from: b */
    private final C3954b f9829b;

    /* renamed from: c */
    private final C3955c f9830c;

    /* renamed from: d */
    private int f9831d = 8;

    /* renamed from: e */
    private C3962i f9832e = null;

    /* renamed from: f */
    private int[] f9833f;

    /* renamed from: g */
    private int[] f9834g;

    /* renamed from: h */
    private float[] f9835h;

    /* renamed from: i */
    private int f9836i;

    /* renamed from: j */
    private int f9837j;

    /* renamed from: k */
    private boolean f9838k;

    C3953a(C3954b bVar, C3955c cVar) {
        int i = this.f9831d;
        this.f9833f = new int[i];
        this.f9834g = new int[i];
        this.f9835h = new float[i];
        this.f9836i = -1;
        this.f9837j = -1;
        this.f9838k = false;
        this.f9829b = bVar;
        this.f9830c = cVar;
    }

    /* renamed from: a */
    public final void mo14219a(C3962i iVar, float f) {
        if (f == 0.0f) {
            mo14211a(iVar, true);
            return;
        }
        int i = this.f9836i;
        if (i == -1) {
            this.f9836i = 0;
            float[] fArr = this.f9835h;
            int i2 = this.f9836i;
            fArr[i2] = f;
            this.f9833f[i2] = iVar.f9898b;
            this.f9834g[i2] = -1;
            iVar.f9906j++;
            iVar.mo14278a(this.f9829b);
            this.f9828a++;
            if (!this.f9838k) {
                this.f9837j++;
                int i3 = this.f9837j;
                int[] iArr = this.f9833f;
                if (i3 >= iArr.length) {
                    this.f9838k = true;
                    this.f9837j = iArr.length - 1;
                }
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f9828a) {
            int[] iArr2 = this.f9833f;
            int i6 = iArr2[i];
            int i7 = iVar.f9898b;
            if (i6 == i7) {
                this.f9835h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i5 = i;
            }
            i = this.f9834g[i];
            i4++;
        }
        int i8 = this.f9837j;
        int i9 = i8 + 1;
        if (this.f9838k) {
            int[] iArr3 = this.f9833f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f9833f;
        if (i8 >= iArr4.length && this.f9828a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f9833f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f9833f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f9831d *= 2;
            this.f9838k = false;
            this.f9837j = i8 - 1;
            this.f9835h = Arrays.copyOf(this.f9835h, this.f9831d);
            this.f9833f = Arrays.copyOf(this.f9833f, this.f9831d);
            this.f9834g = Arrays.copyOf(this.f9834g, this.f9831d);
        }
        this.f9833f[i8] = iVar.f9898b;
        this.f9835h[i8] = f;
        if (i5 != -1) {
            int[] iArr7 = this.f9834g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f9834g[i8] = this.f9836i;
            this.f9836i = i8;
        }
        iVar.f9906j++;
        iVar.mo14278a(this.f9829b);
        this.f9828a++;
        if (!this.f9838k) {
            this.f9837j++;
        }
        if (this.f9828a >= this.f9833f.length) {
            this.f9838k = true;
        }
        int i11 = this.f9837j;
        int[] iArr8 = this.f9833f;
        if (i11 >= iArr8.length) {
            this.f9838k = true;
            this.f9837j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14224b() {
        int i = this.f9836i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            float[] fArr = this.f9835h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f9834g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f9836i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f9835h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f9830c.f9846c[this.f9833f[i]]);
            str = sb5.toString();
            i = this.f9834g[i];
            i2++;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo14222b(int i) {
        int i2 = this.f9836i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f9828a) {
            if (i3 == i) {
                return this.f9835h[i2];
            }
            i2 = this.f9834g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo14223b(C3962i iVar) {
        int i = this.f9836i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            if (this.f9833f[i] == iVar.f9898b) {
                return this.f9835h[i];
            }
            i = this.f9834g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14220a(C3962i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f9836i;
            if (i == -1) {
                this.f9836i = 0;
                float[] fArr = this.f9835h;
                int i2 = this.f9836i;
                fArr[i2] = f;
                this.f9833f[i2] = iVar.f9898b;
                this.f9834g[i2] = -1;
                iVar.f9906j++;
                iVar.mo14278a(this.f9829b);
                this.f9828a++;
                if (!this.f9838k) {
                    this.f9837j++;
                    int i3 = this.f9837j;
                    int[] iArr = this.f9833f;
                    if (i3 >= iArr.length) {
                        this.f9838k = true;
                        this.f9837j = iArr.length - 1;
                    }
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f9828a) {
                int[] iArr2 = this.f9833f;
                int i6 = iArr2[i];
                int i7 = iVar.f9898b;
                if (i6 == i7) {
                    float[] fArr2 = this.f9835h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f9836i) {
                            this.f9836i = this.f9834g[i];
                        } else {
                            int[] iArr3 = this.f9834g;
                            iArr3[i5] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo14280b(this.f9829b);
                        }
                        if (this.f9838k) {
                            this.f9837j = i;
                        }
                        iVar.f9906j--;
                        this.f9828a--;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i5 = i;
                }
                i = this.f9834g[i];
                i4++;
            }
            int i8 = this.f9837j;
            int i9 = i8 + 1;
            if (this.f9838k) {
                int[] iArr4 = this.f9833f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f9833f;
            if (i8 >= iArr5.length && this.f9828a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f9833f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f9833f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f9831d *= 2;
                this.f9838k = false;
                this.f9837j = i8 - 1;
                this.f9835h = Arrays.copyOf(this.f9835h, this.f9831d);
                this.f9833f = Arrays.copyOf(this.f9833f, this.f9831d);
                this.f9834g = Arrays.copyOf(this.f9834g, this.f9831d);
            }
            this.f9833f[i8] = iVar.f9898b;
            this.f9835h[i8] = f;
            if (i5 != -1) {
                int[] iArr8 = this.f9834g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f9834g[i8] = this.f9836i;
                this.f9836i = i8;
            }
            iVar.f9906j++;
            iVar.mo14278a(this.f9829b);
            this.f9828a++;
            if (!this.f9838k) {
                this.f9837j++;
            }
            int i11 = this.f9837j;
            int[] iArr9 = this.f9833f;
            if (i11 >= iArr9.length) {
                this.f9838k = true;
                this.f9837j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float mo14211a(C3962i iVar, boolean z) {
        if (this.f9832e == iVar) {
            this.f9832e = null;
        }
        int i = this.f9836i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f9828a) {
            if (this.f9833f[i] == iVar.f9898b) {
                if (i == this.f9836i) {
                    this.f9836i = this.f9834g[i];
                } else {
                    int[] iArr = this.f9834g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo14280b(this.f9829b);
                }
                iVar.f9906j--;
                this.f9828a--;
                this.f9833f[i] = -1;
                if (this.f9838k) {
                    this.f9837j = i;
                }
                return this.f9835h[i];
            }
            i2++;
            i3 = i;
            i = this.f9834g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo14215a() {
        int i = this.f9836i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            C3962i iVar = this.f9830c.f9846c[this.f9833f[i]];
            if (iVar != null) {
                iVar.mo14280b(this.f9829b);
            }
            i = this.f9834g[i];
            i2++;
        }
        this.f9836i = -1;
        this.f9837j = -1;
        this.f9838k = false;
        this.f9828a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14221a(C3962i iVar) {
        int i = this.f9836i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            if (this.f9833f[i] == iVar.f9898b) {
                return true;
            }
            i = this.f9834g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14216a(float f) {
        int i = this.f9836i;
        int i2 = 0;
        while (i != -1 && i2 < this.f9828a) {
            float[] fArr = this.f9835h;
            fArr[i] = fArr[i] / f;
            i = this.f9834g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m13324a(C3962i iVar, C3957e eVar) {
        return iVar.f9906j <= 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p096e.p114f.p117b.C3962i mo14213a(p096e.p114f.p117b.C3957e r15) {
        /*
            r14 = this;
            int r0 = r14.f9836i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0097
            int r9 = r14.f9828a
            if (r2 >= r9) goto L_0x0097
            float[] r9 = r14.f9835h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            e.f.b.c r12 = r14.f9830c
            e.f.b.i[] r12 = r12.f9846c
            int[] r13 = r14.f9833f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0035
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0041
            r9[r0] = r3
            e.f.b.b r9 = r14.f9829b
            r12.mo14280b(r9)
            goto L_0x0040
        L_0x0035:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0041
            r9[r0] = r3
            e.f.b.b r9 = r14.f9829b
            r12.mo14280b(r9)
        L_0x0040:
            r10 = 0
        L_0x0041:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x008f
            e.f.b.i$a r11 = r12.f9903g
            e.f.b.i$a r13 = p096e.p114f.p117b.C3962i.C3963a.UNRESTRICTED
            if (r11 != r13) goto L_0x006b
            if (r4 != 0) goto L_0x0056
            boolean r4 = r14.m13324a(r12, r15)
        L_0x0052:
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x008f
        L_0x0056:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x005f
            boolean r4 = r14.m13324a(r12, r15)
            goto L_0x0052
        L_0x005f:
            if (r6 != 0) goto L_0x008f
            boolean r11 = r14.m13324a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x008f
        L_0x006b:
            if (r4 != 0) goto L_0x008f
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x008f
            if (r1 != 0) goto L_0x007b
            boolean r1 = r14.m13324a(r12, r15)
        L_0x0077:
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x008f
        L_0x007b:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0084
            boolean r1 = r14.m13324a(r12, r15)
            goto L_0x0077
        L_0x0084:
            if (r8 != 0) goto L_0x008f
            boolean r11 = r14.m13324a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x008f:
            int[] r9 = r14.f9834g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            return r4
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.C3953a.mo14213a(e.f.b.e):e.f.b.i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14217a(C3954b bVar, C3954b bVar2, boolean z) {
        int i = this.f9836i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f9828a) {
                int i3 = this.f9833f[i];
                C3962i iVar = bVar2.f9839a;
                if (i3 == iVar.f9898b) {
                    float f = this.f9835h[i];
                    mo14211a(iVar, z);
                    C3953a aVar = bVar2.f9842d;
                    int i4 = aVar.f9836i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f9828a) {
                        mo14220a(this.f9830c.f9846c[aVar.f9833f[i4]], aVar.f9835h[i4] * f, z);
                        i4 = aVar.f9834g[i4];
                        i5++;
                    }
                    bVar.f9840b += bVar2.f9840b * f;
                    if (z) {
                        bVar2.f9839a.mo14280b(bVar);
                    }
                    i = this.f9836i;
                } else {
                    i = this.f9834g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14218a(C3954b bVar, C3954b[] bVarArr) {
        int i = this.f9836i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f9828a) {
                C3962i iVar = this.f9830c.f9846c[this.f9833f[i]];
                if (iVar.f9899c != -1) {
                    float f = this.f9835h[i];
                    mo14211a(iVar, true);
                    C3954b bVar2 = bVarArr[iVar.f9899c];
                    if (!bVar2.f9843e) {
                        C3953a aVar = bVar2.f9842d;
                        int i3 = aVar.f9836i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f9828a) {
                            mo14220a(this.f9830c.f9846c[aVar.f9833f[i3]], aVar.f9835h[i3] * f, true);
                            i3 = aVar.f9834g[i3];
                            i4++;
                        }
                    }
                    bVar.f9840b += bVar2.f9840b * f;
                    bVar2.f9839a.mo14280b(bVar);
                    i = this.f9836i;
                } else {
                    i = this.f9834g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3962i mo14214a(boolean[] zArr, C3962i iVar) {
        int i = this.f9836i;
        int i2 = 0;
        C3962i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f9828a) {
            if (this.f9835h[i] < 0.0f) {
                C3962i iVar3 = this.f9830c.f9846c[this.f9833f[i]];
                if ((zArr == null || !zArr[iVar3.f9898b]) && iVar3 != iVar) {
                    C3963a aVar = iVar3.f9903g;
                    if (aVar == C3963a.SLACK || aVar == C3963a.ERROR) {
                        float f2 = this.f9835h[i];
                        if (f2 < f) {
                            iVar2 = iVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f9834g[i];
            i2++;
        }
        return iVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3962i mo14212a(int i) {
        int i2 = this.f9836i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f9828a) {
            if (i3 == i) {
                return this.f9830c.f9846c[this.f9833f[i2]];
            }
            i2 = this.f9834g[i2];
            i3++;
        }
        return null;
    }
}
