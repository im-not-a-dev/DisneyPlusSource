package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0797g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: DiffUtil */
public class C0856f {

    /* renamed from: a */
    private static final Comparator<C0862f> f3482a = new C0857a();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* compiled from: DiffUtil */
    static class C0857a implements Comparator<C0862f> {
        C0857a() {
        }

        /* renamed from: a */
        public int compare(C0862f fVar, C0862f fVar2) {
            int i = fVar.f3497a - fVar2.f3497a;
            return i == 0 ? fVar.f3498b - fVar2.f3498b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    /* compiled from: DiffUtil */
    public static abstract class C0858b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    /* compiled from: DiffUtil */
    public static class C0859c {

        /* renamed from: a */
        private final List<C0862f> f3483a;

        /* renamed from: b */
        private final int[] f3484b;

        /* renamed from: c */
        private final int[] f3485c;

        /* renamed from: d */
        private final C0858b f3486d;

        /* renamed from: e */
        private final int f3487e;

        /* renamed from: f */
        private final int f3488f;

        /* renamed from: g */
        private final boolean f3489g;

        C0859c(C0858b bVar, List<C0862f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f3483a = list;
            this.f3484b = iArr;
            this.f3485c = iArr2;
            Arrays.fill(this.f3484b, 0);
            Arrays.fill(this.f3485c, 0);
            this.f3486d = bVar;
            this.f3487e = bVar.getOldListSize();
            this.f3488f = bVar.getNewListSize();
            this.f3489g = z;
            m4806a();
            m4810b();
        }

        /* renamed from: a */
        private void m4806a() {
            C0862f fVar = this.f3483a.isEmpty() ? null : (C0862f) this.f3483a.get(0);
            if (fVar == null || fVar.f3497a != 0 || fVar.f3498b != 0) {
                C0862f fVar2 = new C0862f();
                fVar2.f3497a = 0;
                fVar2.f3498b = 0;
                fVar2.f3500d = false;
                fVar2.f3499c = 0;
                fVar2.f3501e = false;
                this.f3483a.add(0, fVar2);
            }
        }

        /* renamed from: b */
        private void m4810b() {
            int i = this.f3487e;
            int i2 = this.f3488f;
            for (int size = this.f3483a.size() - 1; size >= 0; size--) {
                C0862f fVar = (C0862f) this.f3483a.get(size);
                int i3 = fVar.f3497a;
                int i4 = fVar.f3499c;
                int i5 = i3 + i4;
                int i6 = fVar.f3498b + i4;
                if (this.f3489g) {
                    while (i > i5) {
                        m4807a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m4811b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < fVar.f3499c; i7++) {
                    int i8 = fVar.f3497a + i7;
                    int i9 = fVar.f3498b + i7;
                    int i10 = this.f3486d.areContentsTheSame(i8, i9) ? 1 : 2;
                    this.f3484b[i8] = (i9 << 5) | i10;
                    this.f3485c[i9] = (i8 << 5) | i10;
                }
                i = fVar.f3497a;
                i2 = fVar.f3498b;
            }
        }

        /* renamed from: a */
        private void m4807a(int i, int i2, int i3) {
            if (this.f3484b[i - 1] == 0) {
                m4809a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private boolean m4809a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0862f fVar = (C0862f) this.f3483a.get(i3);
                int i6 = fVar.f3497a;
                int i7 = fVar.f3499c;
                int i8 = i6 + i7;
                int i9 = fVar.f3498b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.f3486d.areItemsTheSame(i11, i4)) {
                            if (!this.f3486d.areContentsTheSame(i11, i4)) {
                                i10 = 4;
                            }
                            this.f3485c[i4] = (i11 << 5) | 16;
                            this.f3484b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f3486d.areItemsTheSame(i4, i12)) {
                            if (!this.f3486d.areContentsTheSame(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f3484b[i13] = (i12 << 5) | 16;
                            this.f3485c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = fVar.f3497a;
                i2 = fVar.f3498b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m4811b(int i, int i2, int i3) {
            if (this.f3485c[i2 - 1] == 0) {
                m4809a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m4812b(List<C0860d> list, C0889n nVar, int i, int i2, int i3) {
            if (!this.f3489g) {
                nVar.mo4952c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3484b[i5] & 31;
                if (i6 == 0) {
                    nVar.mo4952c(i + i4, 1);
                    for (C0860d dVar : list) {
                        dVar.f3491b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f3484b[i5] >> 5;
                    C0860d a = m4805a(list, i7, false);
                    nVar.mo4949a(i + i4, a.f3491b - 1);
                    if (i6 == 4) {
                        nVar.mo4950a(a.f3491b - 1, 1, this.f3486d.getChangePayload(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C0860d(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: a */
        public void mo5012a(C0797g gVar) {
            mo5013a((C0889n) new C0840b(gVar));
        }

        /* renamed from: a */
        public void mo5013a(C0889n nVar) {
            C0841c cVar;
            if (nVar instanceof C0841c) {
                cVar = (C0841c) nVar;
            } else {
                cVar = new C0841c(nVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f3487e;
            int i2 = this.f3488f;
            for (int size = this.f3483a.size() - 1; size >= 0; size--) {
                C0862f fVar = (C0862f) this.f3483a.get(size);
                int i3 = fVar.f3499c;
                int i4 = fVar.f3497a + i3;
                int i5 = fVar.f3498b + i3;
                if (i4 < i) {
                    m4812b(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m4808a(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f3484b;
                    int i7 = fVar.f3497a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.mo4950a(i7 + i6, 1, this.f3486d.getChangePayload(i7 + i6, fVar.f3498b + i6));
                    }
                }
                i = fVar.f3497a;
                i2 = fVar.f3498b;
            }
            cVar.mo4953a();
        }

        /* renamed from: a */
        private static C0860d m4805a(List<C0860d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0860d dVar = (C0860d) list.get(size);
                if (dVar.f3490a == i && dVar.f3492c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C0860d dVar2 = (C0860d) list.get(size);
                        dVar2.f3491b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m4808a(List<C0860d> list, C0889n nVar, int i, int i2, int i3) {
            if (!this.f3489g) {
                nVar.mo4951b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3485c[i5] & 31;
                if (i6 == 0) {
                    nVar.mo4951b(i, 1);
                    for (C0860d dVar : list) {
                        dVar.f3491b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f3485c[i5] >> 5;
                    nVar.mo4949a(m4805a(list, i7, true).f3491b, i);
                    if (i6 == 4) {
                        nVar.mo4950a(i, 1, this.f3486d.getChangePayload(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C0860d(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    /* compiled from: DiffUtil */
    private static class C0860d {

        /* renamed from: a */
        int f3490a;

        /* renamed from: b */
        int f3491b;

        /* renamed from: c */
        boolean f3492c;

        public C0860d(int i, int i2, boolean z) {
            this.f3490a = i;
            this.f3491b = i2;
            this.f3492c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    /* compiled from: DiffUtil */
    static class C0861e {

        /* renamed from: a */
        int f3493a;

        /* renamed from: b */
        int f3494b;

        /* renamed from: c */
        int f3495c;

        /* renamed from: d */
        int f3496d;

        public C0861e() {
        }

        public C0861e(int i, int i2, int i3, int i4) {
            this.f3493a = i;
            this.f3494b = i2;
            this.f3495c = i3;
            this.f3496d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    /* compiled from: DiffUtil */
    static class C0862f {

        /* renamed from: a */
        int f3497a;

        /* renamed from: b */
        int f3498b;

        /* renamed from: c */
        int f3499c;

        /* renamed from: d */
        boolean f3500d;

        /* renamed from: e */
        boolean f3501e;

        C0862f() {
        }
    }

    /* renamed from: a */
    public static C0859c m4801a(C0858b bVar) {
        return m4802a(bVar, true);
    }

    /* renamed from: a */
    public static C0859c m4802a(C0858b bVar, boolean z) {
        C0861e eVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0861e(0, oldListSize, 0, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0861e eVar2 = (C0861e) arrayList2.remove(arrayList2.size() - 1);
            C0862f a = m4803a(bVar, eVar2.f3493a, eVar2.f3494b, eVar2.f3495c, eVar2.f3496d, iArr, iArr2, abs);
            if (a != null) {
                if (a.f3499c > 0) {
                    arrayList.add(a);
                }
                a.f3497a += eVar2.f3493a;
                a.f3498b += eVar2.f3495c;
                if (arrayList3.isEmpty()) {
                    eVar = new C0861e();
                } else {
                    eVar = (C0861e) arrayList3.remove(arrayList3.size() - 1);
                }
                eVar.f3493a = eVar2.f3493a;
                eVar.f3495c = eVar2.f3495c;
                if (a.f3501e) {
                    eVar.f3494b = a.f3497a;
                    eVar.f3496d = a.f3498b;
                } else if (a.f3500d) {
                    eVar.f3494b = a.f3497a - 1;
                    eVar.f3496d = a.f3498b;
                } else {
                    eVar.f3494b = a.f3497a;
                    eVar.f3496d = a.f3498b - 1;
                }
                arrayList2.add(eVar);
                if (!a.f3501e) {
                    int i2 = a.f3497a;
                    int i3 = a.f3499c;
                    eVar2.f3493a = i2 + i3;
                    eVar2.f3495c = a.f3498b + i3;
                } else if (a.f3500d) {
                    int i4 = a.f3497a;
                    int i5 = a.f3499c;
                    eVar2.f3493a = i4 + i5 + 1;
                    eVar2.f3495c = a.f3498b + i5;
                } else {
                    int i6 = a.f3497a;
                    int i7 = a.f3499c;
                    eVar2.f3493a = i6 + i7;
                    eVar2.f3495c = a.f3498b + i7 + 1;
                }
                arrayList2.add(eVar2);
            } else {
                arrayList3.add(eVar2);
            }
        }
        Collections.sort(arrayList, f3482a);
        C0859c cVar = new C0859c(bVar, arrayList, iArr, iArr2, z);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C0856f.C0862f m4803a(androidx.recyclerview.widget.C0856f.C0858b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0133
            if (r4 >= r5) goto L_0x0011
            goto L_0x0133
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.areItemsTheSame(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009c
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r3 = r2[r5]
            r0.f3497a = r3
            int r3 = r0.f3497a
            int r3 = r3 - r12
            r0.f3498b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f3499c = r1
            r0.f3500d = r14
            r5 = 0
            r0.f3501e = r5
            return r0
        L_0x009c:
            r5 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r5 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r6
            int r13 = r9 + r6
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r6
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r5 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r5, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r5 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r5 = r1[r3]
            r13 = r2[r3]
            if (r5 < r13) goto L_0x0119
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r4 = r2[r3]
            r0.f3497a = r4
            int r4 = r0.f3497a
            int r4 = r4 - r12
            r0.f3498b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f3499c = r1
            r0.f3500d = r14
            r3 = 1
            r0.f3501e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r5 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0856f.m4803a(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$f");
    }
}
