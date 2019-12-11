package com.google.android.exoplayer2.p382u0.p384n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9571v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.n.b */
/* compiled from: DvbParser */
final class C9350b {

    /* renamed from: h */
    private static final byte[] f21471h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f21472i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f21473j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f21474a = new Paint();

    /* renamed from: b */
    private final Paint f21475b;

    /* renamed from: c */
    private final Canvas f21476c;

    /* renamed from: d */
    private final C9352b f21477d;

    /* renamed from: e */
    private final C9351a f21478e;

    /* renamed from: f */
    private final C9358h f21479f;

    /* renamed from: g */
    private Bitmap f21480g;

    /* renamed from: com.google.android.exoplayer2.u0.n.b$a */
    /* compiled from: DvbParser */
    private static final class C9351a {

        /* renamed from: a */
        public final int f21481a;

        /* renamed from: b */
        public final int[] f21482b;

        /* renamed from: c */
        public final int[] f21483c;

        /* renamed from: d */
        public final int[] f21484d;

        public C9351a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f21481a = i;
            this.f21482b = iArr;
            this.f21483c = iArr2;
            this.f21484d = iArr3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$b */
    /* compiled from: DvbParser */
    private static final class C9352b {

        /* renamed from: a */
        public final int f21485a;

        /* renamed from: b */
        public final int f21486b;

        /* renamed from: c */
        public final int f21487c;

        /* renamed from: d */
        public final int f21488d;

        /* renamed from: e */
        public final int f21489e;

        /* renamed from: f */
        public final int f21490f;

        public C9352b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f21485a = i;
            this.f21486b = i2;
            this.f21487c = i3;
            this.f21488d = i4;
            this.f21489e = i5;
            this.f21490f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$c */
    /* compiled from: DvbParser */
    private static final class C9353c {

        /* renamed from: a */
        public final int f21491a;

        /* renamed from: b */
        public final boolean f21492b;

        /* renamed from: c */
        public final byte[] f21493c;

        /* renamed from: d */
        public final byte[] f21494d;

        public C9353c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f21491a = i;
            this.f21492b = z;
            this.f21493c = bArr;
            this.f21494d = bArr2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$d */
    /* compiled from: DvbParser */
    private static final class C9354d {

        /* renamed from: a */
        public final int f21495a;

        /* renamed from: b */
        public final int f21496b;

        /* renamed from: c */
        public final SparseArray<C9355e> f21497c;

        public C9354d(int i, int i2, int i3, SparseArray<C9355e> sparseArray) {
            this.f21495a = i2;
            this.f21496b = i3;
            this.f21497c = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$e */
    /* compiled from: DvbParser */
    private static final class C9355e {

        /* renamed from: a */
        public final int f21498a;

        /* renamed from: b */
        public final int f21499b;

        public C9355e(int i, int i2) {
            this.f21498a = i;
            this.f21499b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$f */
    /* compiled from: DvbParser */
    private static final class C9356f {

        /* renamed from: a */
        public final int f21500a;

        /* renamed from: b */
        public final boolean f21501b;

        /* renamed from: c */
        public final int f21502c;

        /* renamed from: d */
        public final int f21503d;

        /* renamed from: e */
        public final int f21504e;

        /* renamed from: f */
        public final int f21505f;

        /* renamed from: g */
        public final int f21506g;

        /* renamed from: h */
        public final int f21507h;

        /* renamed from: i */
        public final int f21508i;

        /* renamed from: j */
        public final SparseArray<C9357g> f21509j;

        public C9356f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C9357g> sparseArray) {
            this.f21500a = i;
            this.f21501b = z;
            this.f21502c = i2;
            this.f21503d = i3;
            this.f21504e = i5;
            this.f21505f = i6;
            this.f21506g = i7;
            this.f21507h = i8;
            this.f21508i = i9;
            this.f21509j = sparseArray;
        }

        /* renamed from: a */
        public void mo24187a(C9356f fVar) {
            if (fVar != null) {
                SparseArray<C9357g> sparseArray = fVar.f21509j;
                for (int i = 0; i < sparseArray.size(); i++) {
                    this.f21509j.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$g */
    /* compiled from: DvbParser */
    private static final class C9357g {

        /* renamed from: a */
        public final int f21510a;

        /* renamed from: b */
        public final int f21511b;

        public C9357g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f21510a = i3;
            this.f21511b = i4;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.n.b$h */
    /* compiled from: DvbParser */
    private static final class C9358h {

        /* renamed from: a */
        public final int f21512a;

        /* renamed from: b */
        public final int f21513b;

        /* renamed from: c */
        public final SparseArray<C9356f> f21514c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C9351a> f21515d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C9353c> f21516e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C9351a> f21517f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C9353c> f21518g = new SparseArray<>();

        /* renamed from: h */
        public C9352b f21519h;

        /* renamed from: i */
        public C9354d f21520i;

        public C9358h(int i, int i2) {
            this.f21512a = i;
            this.f21513b = i2;
        }

        /* renamed from: a */
        public void mo24188a() {
            this.f21514c.clear();
            this.f21515d.clear();
            this.f21516e.clear();
            this.f21517f.clear();
            this.f21518g.clear();
            this.f21519h = null;
            this.f21520i = null;
        }
    }

    public C9350b(int i, int i2) {
        this.f21474a.setStyle(Style.FILL_AND_STROKE);
        this.f21474a.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f21474a.setPathEffect(null);
        this.f21475b = new Paint();
        this.f21475b.setStyle(Style.FILL);
        this.f21475b.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f21475b.setPathEffect(null);
        this.f21476c = new Canvas();
        C9352b bVar = new C9352b(719, 575, 0, 719, 0, 575);
        this.f21477d = bVar;
        this.f21478e = new C9351a(0, m28512b(), m28515c(), m28516d());
        this.f21479f = new C9358h(i, i2);
    }

    /* renamed from: a */
    private static int m28501a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: b */
    private static C9354d m28511b(C9571v vVar, int i) {
        int a = vVar.mo24660a(8);
        int a2 = vVar.mo24660a(4);
        int a3 = vVar.mo24660a(2);
        vVar.mo24670c(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int a4 = vVar.mo24660a(8);
            vVar.mo24670c(8);
            i2 -= 6;
            sparseArray.put(a4, new C9355e(vVar.mo24660a(16), vVar.mo24660a(16)));
        }
        return new C9354d(a, a2, a3, sparseArray);
    }

    /* renamed from: c */
    private static C9356f m28514c(C9571v vVar, int i) {
        int i2;
        int i3;
        C9571v vVar2 = vVar;
        int a = vVar2.mo24660a(8);
        vVar2.mo24670c(4);
        boolean e = vVar.mo24673e();
        vVar2.mo24670c(3);
        int i4 = 16;
        int a2 = vVar2.mo24660a(16);
        int a3 = vVar2.mo24660a(16);
        int a4 = vVar2.mo24660a(3);
        int a5 = vVar2.mo24660a(3);
        int i5 = 2;
        vVar2.mo24670c(2);
        int a6 = vVar2.mo24660a(8);
        int a7 = vVar2.mo24660a(8);
        int a8 = vVar2.mo24660a(4);
        int a9 = vVar2.mo24660a(2);
        vVar2.mo24670c(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int a10 = vVar2.mo24660a(i4);
            int a11 = vVar2.mo24660a(i5);
            int a12 = vVar2.mo24660a(i5);
            int a13 = vVar2.mo24660a(12);
            int i7 = a9;
            vVar2.mo24670c(4);
            int a14 = vVar2.mo24660a(12);
            i6 -= 6;
            if (a11 == 1 || a11 == 2) {
                i6 -= 2;
                i3 = vVar2.mo24660a(8);
                i2 = vVar2.mo24660a(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            C9357g gVar = new C9357g(a11, a12, a13, a14, i3, i2);
            sparseArray.put(a10, gVar);
            a9 = i7;
            i5 = 2;
            i4 = 16;
        }
        C9356f fVar = new C9356f(a, e, a2, a3, a4, a5, a6, a7, a8, a9, sparseArray);
        return fVar;
    }

    /* renamed from: d */
    private static int[] m28516d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m28501a(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m28501a(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m28501a(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m28501a(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m28501a(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public void mo24186a() {
        this.f21479f.mo24188a();
    }

    /* renamed from: a */
    public List<C9322b> mo24185a(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C9357g> sparseArray;
        C9571v vVar = new C9571v(bArr, i);
        while (vVar.mo24659a() >= 48 && vVar.mo24660a(8) == 15) {
            m28506a(vVar, this.f21479f);
        }
        C9358h hVar = this.f21479f;
        if (hVar.f21520i == null) {
            return Collections.emptyList();
        }
        C9352b bVar = hVar.f21519h;
        if (bVar == null) {
            bVar = this.f21477d;
        }
        Bitmap bitmap = this.f21480g;
        if (!(bitmap != null && bVar.f21485a + 1 == bitmap.getWidth() && bVar.f21486b + 1 == this.f21480g.getHeight())) {
            this.f21480g = Bitmap.createBitmap(bVar.f21485a + 1, bVar.f21486b + 1, Config.ARGB_8888);
            this.f21476c.setBitmap(this.f21480g);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C9355e> sparseArray2 = this.f21479f.f21520i.f21497c;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f21476c.save();
            C9355e eVar = (C9355e) sparseArray2.valueAt(i4);
            C9356f fVar = (C9356f) this.f21479f.f21514c.get(sparseArray2.keyAt(i4));
            int i5 = eVar.f21498a + bVar.f21487c;
            int i6 = eVar.f21499b + bVar.f21489e;
            this.f21476c.clipRect(i5, i6, Math.min(fVar.f21502c + i5, bVar.f21488d), Math.min(fVar.f21503d + i6, bVar.f21490f));
            C9351a aVar = (C9351a) this.f21479f.f21515d.get(fVar.f21505f);
            if (aVar == null) {
                aVar = (C9351a) this.f21479f.f21517f.get(fVar.f21505f);
                if (aVar == null) {
                    aVar = this.f21478e;
                }
            }
            SparseArray<C9357g> sparseArray3 = fVar.f21509j;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C9357g gVar = (C9357g) sparseArray3.valueAt(i7);
                C9353c cVar = (C9353c) this.f21479f.f21516e.get(keyAt);
                C9353c cVar2 = cVar == null ? (C9353c) this.f21479f.f21518g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m28505a(cVar2, aVar, fVar.f21504e, gVar.f21510a + i5, i6 + gVar.f21511b, cVar2.f21492b ? null : this.f21474a, this.f21476c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f21501b) {
                int i8 = fVar.f21504e;
                if (i8 == 3) {
                    i2 = aVar.f21484d[fVar.f21506g];
                } else if (i8 == 2) {
                    i2 = aVar.f21483c[fVar.f21507h];
                } else {
                    i2 = aVar.f21482b[fVar.f21508i];
                }
                this.f21475b.setColor(i2);
                this.f21476c.drawRect((float) i5, (float) i6, (float) (fVar.f21502c + i5), (float) (fVar.f21503d + i6), this.f21475b);
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.f21480g, i5, i6, fVar.f21502c, fVar.f21503d);
            float f = (float) i5;
            int i9 = bVar.f21485a;
            float f2 = f / ((float) i9);
            float f3 = (float) i6;
            int i10 = bVar.f21486b;
            C9322b bVar2 = new C9322b(createBitmap, f2, 0, f3 / ((float) i10), 0, ((float) fVar.f21502c) / ((float) i9), ((float) fVar.f21503d) / ((float) i10));
            arrayList.add(bVar2);
            this.f21476c.drawColor(0, Mode.CLEAR);
            this.f21476c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    private static C9353c m28510b(C9571v vVar) {
        byte[] bArr;
        int a = vVar.mo24660a(16);
        vVar.mo24670c(4);
        int a2 = vVar.mo24660a(2);
        boolean e = vVar.mo24673e();
        vVar.mo24670c(1);
        byte[] bArr2 = null;
        if (a2 == 1) {
            vVar.mo24670c(vVar.mo24660a(8) * 16);
        } else if (a2 == 0) {
            int a3 = vVar.mo24660a(16);
            int a4 = vVar.mo24660a(16);
            if (a3 > 0) {
                bArr2 = new byte[a3];
                vVar.mo24668b(bArr2, 0, a3);
            }
            if (a4 > 0) {
                bArr = new byte[a4];
                vVar.mo24668b(bArr, 0, a4);
                return new C9353c(a, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C9353c(a, e, bArr2, bArr);
    }

    /* renamed from: b */
    private static int[] m28512b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: c */
    private static int[] m28515c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = m28501a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m28501a(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v10
      assigns: []
      uses: []
      mth insns count: 77
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[LOOP:0: B:1:0x0009->B:33:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28509b(com.google.android.exoplayer2.p393v0.C9571v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo24660a(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0017
            r12 = r2
            r3 = r4
        L_0x0014:
            r11 = 1
            goto L_0x006f
        L_0x0017:
            boolean r4 = r13.mo24673e()
            r7 = 3
            if (r4 != 0) goto L_0x002e
            int r3 = r13.mo24660a(r7)
            if (r3 == 0) goto L_0x002a
            int r3 = r3 + 2
            r12 = r2
            r11 = r3
            r3 = 0
            goto L_0x006f
        L_0x002a:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x006f
        L_0x002e:
            boolean r4 = r13.mo24673e()
            if (r4 != 0) goto L_0x0040
            int r4 = r13.mo24660a(r5)
            int r4 = r4 + r3
            int r3 = r13.mo24660a(r3)
        L_0x003d:
            r12 = r2
            r11 = r4
            goto L_0x006f
        L_0x0040:
            int r4 = r13.mo24660a(r5)
            if (r4 == 0) goto L_0x006c
            if (r4 == r6) goto L_0x0068
            if (r4 == r5) goto L_0x005d
            if (r4 == r7) goto L_0x0050
            r12 = r2
            r3 = 0
            r11 = 0
            goto L_0x006f
        L_0x0050:
            r4 = 8
            int r4 = r13.mo24660a(r4)
            int r4 = r4 + 25
            int r3 = r13.mo24660a(r3)
            goto L_0x003d
        L_0x005d:
            int r4 = r13.mo24660a(r3)
            int r4 = r4 + 9
            int r3 = r13.mo24660a(r3)
            goto L_0x003d
        L_0x0068:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x006f
        L_0x006c:
            r12 = r2
            r3 = 0
            goto L_0x0014
        L_0x006f:
            if (r11 == 0) goto L_0x008b
            if (r8 == 0) goto L_0x008b
            if (r15 == 0) goto L_0x0077
            byte r3 = r15[r3]
        L_0x0077:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008b:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x008f
            return r10
        L_0x008f:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p384n.C9350b.m28509b(com.google.android.exoplayer2.v0.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v4, types: [byte] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28513c(com.google.android.exoplayer2.p393v0.C9571v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo24660a(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0016
            r12 = r2
            r3 = r4
            r11 = 1
            goto L_0x0035
        L_0x0016:
            boolean r4 = r13.mo24673e()
            r6 = 7
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo24660a(r6)
            if (r3 == 0) goto L_0x0027
            r12 = r2
            r11 = r3
            r3 = 0
            goto L_0x0035
        L_0x0027:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x0035
        L_0x002b:
            int r4 = r13.mo24660a(r6)
            int r3 = r13.mo24660a(r3)
            r12 = r2
            r11 = r4
        L_0x0035:
            if (r11 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r3 = r15[r3]
        L_0x003d:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p384n.C9350b.m28513c(com.google.android.exoplayer2.v0.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: a */
    private static void m28506a(C9571v vVar, C9358h hVar) {
        int a = vVar.mo24660a(8);
        int a2 = vVar.mo24660a(16);
        int a3 = vVar.mo24660a(16);
        int c = vVar.mo24669c() + a3;
        if (a3 * 8 > vVar.mo24659a()) {
            Log.m29500d("DvbParser", "Data field length exceeds limit");
            vVar.mo24670c(vVar.mo24659a());
            return;
        }
        switch (a) {
            case 16:
                if (a2 == hVar.f21512a) {
                    C9354d dVar = hVar.f21520i;
                    C9354d b = m28511b(vVar, a3);
                    if (b.f21496b == 0) {
                        if (!(dVar == null || dVar.f21495a == b.f21495a)) {
                            hVar.f21520i = b;
                            break;
                        }
                    } else {
                        hVar.f21520i = b;
                        hVar.f21514c.clear();
                        hVar.f21515d.clear();
                        hVar.f21516e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C9354d dVar2 = hVar.f21520i;
                if (a2 == hVar.f21512a && dVar2 != null) {
                    C9356f c2 = m28514c(vVar, a3);
                    if (dVar2.f21496b == 0) {
                        c2.mo24187a((C9356f) hVar.f21514c.get(c2.f21500a));
                    }
                    hVar.f21514c.put(c2.f21500a, c2);
                    break;
                }
            case 18:
                if (a2 != hVar.f21512a) {
                    if (a2 == hVar.f21513b) {
                        C9351a a4 = m28503a(vVar, a3);
                        hVar.f21517f.put(a4.f21481a, a4);
                        break;
                    }
                } else {
                    C9351a a5 = m28503a(vVar, a3);
                    hVar.f21515d.put(a5.f21481a, a5);
                    break;
                }
                break;
            case 19:
                if (a2 != hVar.f21512a) {
                    if (a2 == hVar.f21513b) {
                        C9353c b2 = m28510b(vVar);
                        hVar.f21518g.put(b2.f21491a, b2);
                        break;
                    }
                } else {
                    C9353c b3 = m28510b(vVar);
                    hVar.f21516e.put(b3.f21491a, b3);
                    break;
                }
                break;
            case 20:
                if (a2 == hVar.f21512a) {
                    hVar.f21519h = m28504a(vVar);
                    break;
                }
                break;
        }
        vVar.mo24672d(c - vVar.mo24669c());
    }

    /* renamed from: a */
    private static C9352b m28504a(C9571v vVar) {
        int i;
        int i2;
        int i3;
        int i4;
        vVar.mo24670c(4);
        boolean e = vVar.mo24673e();
        vVar.mo24670c(3);
        int a = vVar.mo24660a(16);
        int a2 = vVar.mo24660a(16);
        if (e) {
            int a3 = vVar.mo24660a(16);
            int a4 = vVar.mo24660a(16);
            int a5 = vVar.mo24660a(16);
            i = vVar.mo24660a(16);
            i3 = a4;
            i2 = a5;
            i4 = a3;
        } else {
            i3 = a;
            i = a2;
            i4 = 0;
            i2 = 0;
        }
        C9352b bVar = new C9352b(a, a2, i4, i3, i2, i);
        return bVar;
    }

    /* renamed from: a */
    private static C9351a m28503a(C9571v vVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C9571v vVar2 = vVar;
        int i7 = 8;
        int a = vVar2.mo24660a(8);
        vVar2.mo24670c(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] b = m28512b();
        int[] c = m28515c();
        int[] d = m28516d();
        while (i9 > 0) {
            int a2 = vVar2.mo24660a(i7);
            int a3 = vVar2.mo24660a(i7);
            int i10 = i9 - 2;
            int[] iArr = (a3 & 128) != 0 ? b : (a3 & 64) != 0 ? c : d;
            if ((a3 & 1) != 0) {
                i5 = vVar2.mo24660a(i7);
                i4 = vVar2.mo24660a(i7);
                i3 = vVar2.mo24660a(i7);
                i2 = vVar2.mo24660a(i7);
                i6 = i10 - 4;
            } else {
                i3 = vVar2.mo24660a(4) << 4;
                i6 = i10 - 2;
                i2 = vVar2.mo24660a(i8) << 6;
                i5 = vVar2.mo24660a(6) << i8;
                i4 = vVar2.mo24660a(4) << 4;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            int i11 = i6;
            double d2 = (double) i5;
            int i12 = a;
            double d3 = (double) (i4 - 128);
            double d4 = (double) (i3 - 128);
            iArr[a2] = m28501a((byte) (255 - (i2 & 255)), Util.m29382a((int) (d2 + (1.402d * d3)), 0, 255), Util.m29382a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), Util.m29382a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i11;
            a = i12;
            i7 = 8;
            i8 = 2;
        }
        return new C9351a(a, b, c, d);
    }

    /* renamed from: a */
    private static void m28505a(C9353c cVar, C9351a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f21484d;
        } else if (i == 2) {
            iArr = aVar.f21483c;
        } else {
            iArr = aVar.f21482b;
        }
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m28507a(cVar.f21493c, iArr2, i4, i5, i3, paint2, canvas2);
        m28507a(cVar.f21494d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: a */
    private static void m28507a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        int a;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = i;
        byte[] bArr5 = bArr;
        C9571v vVar = new C9571v(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (vVar.mo24659a() != 0) {
            int a2 = vVar.mo24660a(8);
            if (a2 != 240) {
                switch (a2) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                a = m28502a(vVar, iArr, bArr2, i5, i6, paint, canvas);
                                vVar.mo24666b();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f21471h : bArr7;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f21472i : bArr6;
                        }
                        bArr2 = bArr3;
                        a = m28502a(vVar, iArr, bArr2, i5, i6, paint, canvas);
                        vVar.mo24666b();
                    case 17:
                        a = m28509b(vVar, iArr, i4 == 3 ? f21473j : null, i5, i6, paint, canvas);
                        vVar.mo24666b();
                        break;
                    case 18:
                        a = m28513c(vVar, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (a2) {
                            case 32:
                                bArr7 = m28508a(4, 4, vVar);
                                continue;
                            case 33:
                                bArr4 = m28508a(4, 8, vVar);
                                break;
                            case 34:
                                bArr4 = m28508a(16, 8, vVar);
                                break;
                            default:
                                continue;
                        }
                        bArr6 = bArr4;
                        break;
                }
                i5 = a;
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v11
      assigns: []
      uses: []
      mth insns count: 72
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[LOOP:0: B:1:0x0009->B:30:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28502a(com.google.android.exoplayer2.p393v0.C9571v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo24660a(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r12 = r2
            r3 = r4
        L_0x0013:
            r11 = 1
            goto L_0x0061
        L_0x0015:
            boolean r4 = r13.mo24673e()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo24660a(r6)
            int r4 = r4 + r6
            int r3 = r13.mo24660a(r3)
        L_0x0025:
            r12 = r2
            r11 = r4
            goto L_0x0061
        L_0x0028:
            boolean r4 = r13.mo24673e()
            if (r4 == 0) goto L_0x0031
            r12 = r2
            r3 = 0
            goto L_0x0013
        L_0x0031:
            int r4 = r13.mo24660a(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            r12 = r2
            r3 = 0
            r11 = 0
            goto L_0x0061
        L_0x0041:
            r4 = 8
            int r4 = r13.mo24660a(r4)
            int r4 = r4 + 29
            int r3 = r13.mo24660a(r3)
            goto L_0x0025
        L_0x004e:
            r4 = 4
            int r4 = r13.mo24660a(r4)
            int r4 = r4 + 12
            int r3 = r13.mo24660a(r3)
            goto L_0x0025
        L_0x005a:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x0061
        L_0x005e:
            r3 = 0
            r11 = 0
            r12 = 1
        L_0x0061:
            if (r11 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x0069
            byte r3 = r15[r3]
        L_0x0069:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007f:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0083
            return r10
        L_0x0083:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p384n.C9350b.m28502a(com.google.android.exoplayer2.v0.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: a */
    private static byte[] m28508a(int i, int i2, C9571v vVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) vVar.mo24660a(i2);
        }
        return bArr;
    }
}
