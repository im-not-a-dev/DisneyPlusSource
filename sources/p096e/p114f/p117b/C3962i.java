package p096e.p114f.p117b;

import java.util.Arrays;

/* renamed from: e.f.b.i */
/* compiled from: SolverVariable */
public class C3962i {

    /* renamed from: k */
    private static int f9896k = 1;

    /* renamed from: a */
    private String f9897a;

    /* renamed from: b */
    public int f9898b = -1;

    /* renamed from: c */
    int f9899c = -1;

    /* renamed from: d */
    public int f9900d = 0;

    /* renamed from: e */
    public float f9901e;

    /* renamed from: f */
    float[] f9902f = new float[7];

    /* renamed from: g */
    C3963a f9903g;

    /* renamed from: h */
    C3954b[] f9904h = new C3954b[8];

    /* renamed from: i */
    int f9905i = 0;

    /* renamed from: j */
    public int f9906j = 0;

    /* renamed from: e.f.b.i$a */
    /* compiled from: SolverVariable */
    public enum C3963a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3962i(C3963a aVar, String str) {
        this.f9903g = aVar;
    }

    /* renamed from: b */
    static void m13405b() {
        f9896k++;
    }

    /* renamed from: a */
    public final void mo14278a(C3954b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f9905i;
            if (i >= i2) {
                C3954b[] bVarArr = this.f9904h;
                if (i2 >= bVarArr.length) {
                    this.f9904h = (C3954b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C3954b[] bVarArr2 = this.f9904h;
                int i3 = this.f9905i;
                bVarArr2[i3] = bVar;
                this.f9905i = i3 + 1;
                return;
            } else if (this.f9904h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo14281c(C3954b bVar) {
        int i = this.f9905i;
        for (int i2 = 0; i2 < i; i2++) {
            C3954b[] bVarArr = this.f9904h;
            bVarArr[i2].f9842d.mo14217a(bVarArr[i2], bVar, false);
        }
        this.f9905i = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f9897a);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo14280b(C3954b bVar) {
        int i = this.f9905i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9904h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C3954b[] bVarArr = this.f9904h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f9905i--;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo14277a() {
        this.f9897a = null;
        this.f9903g = C3963a.UNKNOWN;
        this.f9900d = 0;
        this.f9898b = -1;
        this.f9899c = -1;
        this.f9901e = 0.0f;
        this.f9905i = 0;
        this.f9906j = 0;
    }

    /* renamed from: a */
    public void mo14279a(C3963a aVar, String str) {
        this.f9903g = aVar;
    }
}
