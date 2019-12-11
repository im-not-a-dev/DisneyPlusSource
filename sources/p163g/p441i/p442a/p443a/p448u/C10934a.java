package p163g.p441i.p442a.p443a.p448u;

import com.facebook.stetho.server.http.HttpStatus;

/* renamed from: g.i.a.a.u.a */
/* compiled from: BufferRecycler */
public class C10934a {

    /* renamed from: c */
    private static final int[] f25978c = {8000, 8000, 2000, 2000};

    /* renamed from: d */
    private static final int[] f25979d = {4000, 4000, HttpStatus.HTTP_OK, HttpStatus.HTTP_OK};

    /* renamed from: a */
    protected final byte[][] f25980a;

    /* renamed from: b */
    protected final char[][] f25981b;

    public C10934a() {
        this(4, 4);
    }

    /* renamed from: a */
    public final byte[] mo28171a(int i) {
        return mo28172a(i, 0);
    }

    /* renamed from: b */
    public final char[] mo28173b(int i) {
        return mo28174b(i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo28175c(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo28176d(int i) {
        return f25978c[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public char[] mo28177e(int i) {
        return new char[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo28178f(int i) {
        return f25979d[i];
    }

    protected C10934a(int i, int i2) {
        this.f25980a = new byte[i][];
        this.f25981b = new char[i2][];
    }

    /* renamed from: a */
    public byte[] mo28172a(int i, int i2) {
        int d = mo28176d(i);
        if (i2 < d) {
            i2 = d;
        }
        byte[][] bArr = this.f25980a;
        byte[] bArr2 = bArr[i];
        if (bArr2 == null || bArr2.length < i2) {
            return mo28175c(i2);
        }
        bArr[i] = null;
        return bArr2;
    }

    /* renamed from: b */
    public char[] mo28174b(int i, int i2) {
        int f = mo28178f(i);
        if (i2 < f) {
            i2 = f;
        }
        char[][] cArr = this.f25981b;
        char[] cArr2 = cArr[i];
        if (cArr2 == null || cArr2.length < i2) {
            return mo28177e(i2);
        }
        cArr[i] = null;
        return cArr2;
    }

    /* renamed from: a */
    public void mo28169a(int i, byte[] bArr) {
        this.f25980a[i] = bArr;
    }

    /* renamed from: a */
    public void mo28170a(int i, char[] cArr) {
        this.f25981b[i] = cArr;
    }
}
