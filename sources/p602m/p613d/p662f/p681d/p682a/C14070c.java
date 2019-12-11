package p602m.p613d.p662f.p681d.p682a;

import java.lang.reflect.Array;

/* renamed from: m.d.f.d.a.c */
/* compiled from: GoppaCode */
public final class C14070c {
    /* renamed from: a */
    public static C14068a m44400a(C14069b bVar, C14076i iVar) {
        C14069b bVar2 = bVar;
        C14076i iVar2 = iVar;
        Class<int> cls = int.class;
        int a = bVar.mo35622a();
        int i = 1 << a;
        int a2 = iVar.mo35639a();
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{a2, i});
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{a2, i});
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = bVar2.mo35625b(iVar2.mo35640a(i2));
        }
        for (int i3 = 1; i3 < a2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = bVar2.mo35628c(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < a2; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    iArr[i5][i6] = bVar2.mo35623a(iArr[i5][i6], bVar2.mo35628c(iArr2[i7][i6], iVar2.mo35642b((a2 + i7) - i5)));
                }
            }
        }
        int[][] iArr3 = (int[][]) Array.newInstance(cls, new int[]{a2 * a, (i + 31) >>> 5});
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < a2; i11++) {
                int i12 = iArr[i11][i8];
                for (int i13 = 0; i13 < a; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr4 = iArr3[(((i11 + 1) * a) - i13) - 1];
                        iArr4[i9] = iArr4[i9] ^ i10;
                    }
                }
            }
        }
        return new C14068a(i, iArr3);
    }
}
