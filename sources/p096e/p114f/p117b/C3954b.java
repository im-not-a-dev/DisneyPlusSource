package p096e.p114f.p117b;

import p096e.p114f.p117b.C3962i.C3963a;

/* renamed from: e.f.b.b */
/* compiled from: ArrayRow */
public class C3954b implements C3958a {

    /* renamed from: a */
    C3962i f9839a = null;

    /* renamed from: b */
    float f9840b = 0.0f;

    /* renamed from: c */
    boolean f9841c;

    /* renamed from: d */
    public final C3953a f9842d;

    /* renamed from: e */
    boolean f9843e = false;

    public C3954b(C3955c cVar) {
        this.f9842d = new C3953a(this, cVar);
    }

    /* renamed from: a */
    public C3954b mo14229a(C3962i iVar, C3962i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9840b = (float) i;
        }
        if (!z) {
            this.f9842d.mo14219a(iVar, -1.0f);
            this.f9842d.mo14219a(iVar2, 1.0f);
        } else {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo14242b() {
        C3962i iVar = this.f9839a;
        return iVar != null && (iVar.f9903g == C3963a.UNRESTRICTED || this.f9840b >= 0.0f);
    }

    /* renamed from: c */
    public C3954b mo14244c(C3962i iVar, int i) {
        if (i < 0) {
            this.f9840b = (float) (i * -1);
            this.f9842d.mo14219a(iVar, 1.0f);
        } else {
            this.f9840b = (float) i;
            this.f9842d.mo14219a(iVar, -1.0f);
        }
        return this;
    }

    public void clear() {
        this.f9842d.mo14215a();
        this.f9839a = null;
        this.f9840b = 0.0f;
    }

    /* renamed from: d */
    public void mo14248d() {
        this.f9839a = null;
        this.f9842d.mo14215a();
        this.f9840b = 0.0f;
        this.f9843e = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo14250e() {
        /*
            r10 = this;
            e.f.b.i r0 = r10.f9839a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.f.b.i r1 = r10.f9839a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f9840b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f9840b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            e.f.b.a r5 = r10.f9842d
            int r5 = r5.f9828a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ea
            e.f.b.a r6 = r10.f9842d
            e.f.b.i r6 = r6.mo14212a(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e6
        L_0x0067:
            e.f.b.a r7 = r10.f9842d
            float r7 = r7.mo14222b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x0091:
            if (r8 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r9
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.C3954b.mo14250e():java.lang.String");
    }

    public C3962i getKey() {
        return this.f9839a;
    }

    public String toString() {
        return mo14250e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo14243b(C3962i iVar) {
        return this.f9842d.mo14221a(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3954b mo14239b(C3962i iVar, int i) {
        this.f9839a = iVar;
        float f = (float) i;
        iVar.f9901e = f;
        this.f9840b = f;
        this.f9843e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3962i mo14245c(C3962i iVar) {
        return this.f9842d.mo14214a((boolean[]) null, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo14249d(C3962i iVar) {
        C3962i iVar2 = this.f9839a;
        if (iVar2 != null) {
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9839a = null;
        }
        float a = this.f9842d.mo14211a(iVar, true) * -1.0f;
        this.f9839a = iVar;
        if (a != 1.0f) {
            this.f9840b /= a;
            this.f9842d.mo14216a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3954b mo14228a(C3962i iVar, int i) {
        this.f9842d.mo14219a(iVar, (float) i);
        return this;
    }

    /* renamed from: c */
    public boolean mo14246c() {
        return this.f9839a == null && this.f9840b == 0.0f && this.f9842d.f9828a == 0;
    }

    /* renamed from: a */
    public C3954b mo14232a(C3962i iVar, C3962i iVar2, C3962i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9840b = (float) i;
        }
        if (!z) {
            this.f9842d.mo14219a(iVar, -1.0f);
            this.f9842d.mo14219a(iVar2, 1.0f);
            this.f9842d.mo14219a(iVar3, 1.0f);
        } else {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9842d.mo14219a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C3954b mo14240b(C3962i iVar, C3962i iVar2, C3962i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9840b = (float) i;
        }
        if (!z) {
            this.f9842d.mo14219a(iVar, -1.0f);
            this.f9842d.mo14219a(iVar2, 1.0f);
            this.f9842d.mo14219a(iVar3, -1.0f);
        } else {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9842d.mo14219a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C3954b mo14226a(float f, float f2, float f3, C3962i iVar, C3962i iVar2, C3962i iVar3, C3962i iVar4) {
        this.f9840b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9842d.mo14219a(iVar4, 1.0f);
            this.f9842d.mo14219a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f9842d.mo14219a(iVar3, 1.0f);
            this.f9842d.mo14219a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9842d.mo14219a(iVar4, f4);
            this.f9842d.mo14219a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: b */
    public C3954b mo14241b(C3962i iVar, C3962i iVar2, C3962i iVar3, C3962i iVar4, float f) {
        this.f9842d.mo14219a(iVar3, 0.5f);
        this.f9842d.mo14219a(iVar4, 0.5f);
        this.f9842d.mo14219a(iVar, -0.5f);
        this.f9842d.mo14219a(iVar2, -0.5f);
        this.f9840b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3954b mo14230a(C3962i iVar, C3962i iVar2, int i, float f, C3962i iVar3, C3962i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar4, 1.0f);
            this.f9842d.mo14219a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f9842d.mo14219a(iVar, 1.0f);
            this.f9842d.mo14219a(iVar2, -1.0f);
            this.f9842d.mo14219a(iVar3, -1.0f);
            this.f9842d.mo14219a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f9840b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f9842d.mo14219a(iVar, -1.0f);
            this.f9842d.mo14219a(iVar2, 1.0f);
            this.f9840b = (float) i;
        } else if (f >= 1.0f) {
            this.f9842d.mo14219a(iVar3, -1.0f);
            this.f9842d.mo14219a(iVar4, 1.0f);
            this.f9840b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f9842d.mo14219a(iVar, f2 * 1.0f);
            this.f9842d.mo14219a(iVar2, f2 * -1.0f);
            this.f9842d.mo14219a(iVar3, -1.0f * f);
            this.f9842d.mo14219a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f9840b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C3954b mo14227a(C3957e eVar, int i) {
        this.f9842d.mo14219a(eVar.mo14255a(i, "ep"), 1.0f);
        this.f9842d.mo14219a(eVar.mo14255a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3954b mo14231a(C3962i iVar, C3962i iVar2, C3962i iVar3, float f) {
        this.f9842d.mo14219a(iVar, -1.0f);
        this.f9842d.mo14219a(iVar2, 1.0f - f);
        this.f9842d.mo14219a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C3954b mo14233a(C3962i iVar, C3962i iVar2, C3962i iVar3, C3962i iVar4, float f) {
        this.f9842d.mo14219a(iVar, -1.0f);
        this.f9842d.mo14219a(iVar2, 1.0f);
        this.f9842d.mo14219a(iVar3, f);
        this.f9842d.mo14219a(iVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14235a() {
        float f = this.f9840b;
        if (f < 0.0f) {
            this.f9840b = f * -1.0f;
            this.f9842d.mo14224b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo14238a(C3957e eVar) {
        boolean z;
        C3962i a = this.f9842d.mo14213a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo14249d(a);
            z = false;
        }
        if (this.f9842d.f9828a == 0) {
            this.f9843e = true;
        }
        return z;
    }

    /* renamed from: a */
    public C3962i mo14234a(C3957e eVar, boolean[] zArr) {
        return this.f9842d.mo14214a(zArr, (C3962i) null);
    }

    /* renamed from: a */
    public void mo14236a(C3958a aVar) {
        if (aVar instanceof C3954b) {
            C3954b bVar = (C3954b) aVar;
            this.f9839a = null;
            this.f9842d.mo14215a();
            int i = 0;
            while (true) {
                C3953a aVar2 = bVar.f9842d;
                if (i < aVar2.f9828a) {
                    this.f9842d.mo14220a(aVar2.mo14212a(i), bVar.f9842d.mo14222b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14237a(C3962i iVar) {
        int i = iVar.f9900d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f9842d.mo14219a(iVar, f);
    }
}
