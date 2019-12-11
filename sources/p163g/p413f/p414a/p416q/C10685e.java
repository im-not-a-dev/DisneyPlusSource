package p163g.p413f.p414a.p416q;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p163g.p413f.p414a.p416q.C10680a.C10681a;

/* renamed from: g.f.a.q.e */
/* compiled from: StandardGifDecoder */
public class C10685e implements C10680a {

    /* renamed from: u */
    private static final String f25270u = "e";

    /* renamed from: a */
    private int[] f25271a;

    /* renamed from: b */
    private final int[] f25272b;

    /* renamed from: c */
    private final C10681a f25273c;

    /* renamed from: d */
    private ByteBuffer f25274d;

    /* renamed from: e */
    private byte[] f25275e;

    /* renamed from: f */
    private short[] f25276f;

    /* renamed from: g */
    private byte[] f25277g;

    /* renamed from: h */
    private byte[] f25278h;

    /* renamed from: i */
    private byte[] f25279i;

    /* renamed from: j */
    private int[] f25280j;

    /* renamed from: k */
    private int f25281k;

    /* renamed from: l */
    private C10683c f25282l;

    /* renamed from: m */
    private Bitmap f25283m;

    /* renamed from: n */
    private boolean f25284n;

    /* renamed from: o */
    private int f25285o;

    /* renamed from: p */
    private int f25286p;

    /* renamed from: q */
    private int f25287q;

    /* renamed from: r */
    private int f25288r;

    /* renamed from: s */
    private Boolean f25289s;

    /* renamed from: t */
    private Config f25290t;

    public C10685e(C10681a aVar, C10683c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo27620a(cVar, byteBuffer, i);
    }

    /* renamed from: i */
    private Bitmap m33601i() {
        Boolean bool = this.f25289s;
        Bitmap a = this.f25273c.mo21589a(this.f25288r, this.f25287q, (bool == null || bool.booleanValue()) ? Config.ARGB_8888 : this.f25290t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: j */
    private int m33602j() {
        int k = m33603k();
        if (k <= 0) {
            return k;
        }
        ByteBuffer byteBuffer = this.f25274d;
        byteBuffer.get(this.f25275e, 0, Math.min(k, byteBuffer.remaining()));
        return k;
    }

    /* renamed from: k */
    private int m33603k() {
        return this.f25274d.get() & 255;
    }

    /* renamed from: a */
    public int mo27619a(int i) {
        if (i >= 0) {
            C10683c cVar = this.f25282l;
            if (i < cVar.f25255c) {
                return ((C10682b) cVar.f25257e.get(i)).f25250i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo27604b() {
        this.f25281k = (this.f25281k + 1) % this.f25282l.f25255c;
    }

    /* renamed from: c */
    public int mo27605c() {
        return this.f25282l.f25255c;
    }

    public void clear() {
        this.f25282l = null;
        byte[] bArr = this.f25279i;
        if (bArr != null) {
            this.f25273c.mo21591a(bArr);
        }
        int[] iArr = this.f25280j;
        if (iArr != null) {
            this.f25273c.mo21592a(iArr);
        }
        Bitmap bitmap = this.f25283m;
        if (bitmap != null) {
            this.f25273c.mo21590a(bitmap);
        }
        this.f25283m = null;
        this.f25274d = null;
        this.f25289s = null;
        byte[] bArr2 = this.f25275e;
        if (bArr2 != null) {
            this.f25273c.mo21591a(bArr2);
        }
    }

    /* renamed from: d */
    public int mo27607d() {
        if (this.f25282l.f25255c > 0) {
            int i = this.f25281k;
            if (i >= 0) {
                return mo27619a(i);
            }
        }
        return 0;
    }

    /* renamed from: e */
    public ByteBuffer mo27608e() {
        return this.f25274d;
    }

    /* renamed from: f */
    public void mo27609f() {
        this.f25281k = -1;
    }

    /* renamed from: g */
    public int mo27610g() {
        return this.f25281k;
    }

    /* renamed from: h */
    public int mo27611h() {
        return this.f25274d.limit() + this.f25279i.length + (this.f25280j.length * 4);
    }

    /* renamed from: b */
    private void m33599b(C10682b bVar) {
        C10682b bVar2 = bVar;
        int[] iArr = this.f25280j;
        int i = bVar2.f25245d;
        int i2 = bVar2.f25243b;
        int i3 = bVar2.f25244c;
        int i4 = bVar2.f25242a;
        boolean z = this.f25281k == 0;
        int i5 = this.f25288r;
        byte[] bArr = this.f25279i;
        int[] iArr2 = this.f25271a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f25244c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i13 = iArr2[b3];
                    if (i13 != 0) {
                        iArr[i12] = i13;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C10682b bVar3 = bVar;
            }
            i6++;
            bVar2 = bVar;
        }
        this.f25289s = Boolean.valueOf(this.f25289s == null && z && b != -1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [short[]] */
    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r22v1 */
    /* JADX WARNING: type inference failed for: r28v0 */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r28v2 */
    /* JADX WARNING: type inference failed for: r22v4 */
    /* JADX WARNING: type inference failed for: r4v16, types: [short] */
    /* JADX WARNING: type inference failed for: r4v18, types: [int] */
    /* JADX WARNING: type inference failed for: r28v5 */
    /* JADX WARNING: type inference failed for: r22v5 */
    /* JADX WARNING: type inference failed for: r28v6 */
    /* JADX WARNING: type inference failed for: r22v6 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r28v7 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r28v8 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r4v16, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r3v1, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r22v3
      assigns: []
      uses: []
      mth insns count: 170
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
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33600c(p163g.p413f.p414a.p416q.C10682b r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f25274d
            int r3 = r1.f25251j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            g.f.a.q.c r1 = r0.f25282l
            int r2 = r1.f25258f
            int r1 = r1.f25259g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f25244c
            int r1 = r1.f25245d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f25279i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            g.f.a.q.a$a r1 = r0.f25273c
            byte[] r1 = r1.mo21594b(r2)
            r0.f25279i = r1
        L_0x002b:
            byte[] r1 = r0.f25279i
            short[] r3 = r0.f25276f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f25276f = r3
        L_0x0037:
            short[] r3 = r0.f25276f
            byte[] r5 = r0.f25277g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f25277g = r5
        L_0x0041:
            byte[] r5 = r0.f25277g
            byte[] r6 = r0.f25278h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f25278h = r6
        L_0x004d:
            byte[] r6 = r0.f25278h
            int r7 = r29.m33603k()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f25275e
            r15 = -1
            r26 = r7
            r24 = r11
            r25 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1
            r22 = 0
            r23 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x0159
            if (r16 != 0) goto L_0x0094
            int r16 = r29.m33602j()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f25285o = r3
            goto L_0x0159
        L_0x0092:
            r19 = 0
        L_0x0094:
            byte r4 = r14[r19]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r17
            int r18 = r18 + r4
            int r17 = r17 + 8
            int r19 = r19 + 1
            int r16 = r16 + -1
            r4 = r17
            r8 = r21
            r28 = r22
            r27 = r24
            r21 = r20
            r20 = r13
            r13 = r26
        L_0x00b0:
            if (r4 < r13) goto L_0x013d
            r15 = r18 & r25
            int r18 = r18 >> r13
            int r4 = r4 - r13
            if (r15 != r9) goto L_0x00c1
            r13 = r7
            r27 = r11
            r25 = r12
            r8 = -1
        L_0x00bf:
            r15 = -1
            goto L_0x00b0
        L_0x00c1:
            if (r15 != r10) goto L_0x00d6
            r17 = r4
            r26 = r13
            r13 = r20
            r20 = r21
            r24 = r27
            r22 = r28
            r4 = 4096(0x1000, float:5.74E-42)
            r15 = -1
            r21 = r8
            r8 = 1
            goto L_0x0083
        L_0x00d6:
            r0 = -1
            if (r8 != r0) goto L_0x00e7
            byte r8 = r5[r15]
            r1[r21] = r8
            int r21 = r21 + 1
            int r20 = r20 + 1
            r0 = r29
            r8 = r15
            r28 = r8
            goto L_0x00bf
        L_0x00e7:
            r0 = r27
            r24 = r4
            if (r15 < r0) goto L_0x00f6
            r4 = r28
            byte r4 = (byte) r4
            r6[r23] = r4
            int r23 = r23 + 1
            r4 = r8
            goto L_0x00f7
        L_0x00f6:
            r4 = r15
        L_0x00f7:
            if (r4 < r9) goto L_0x0102
            byte r26 = r5[r4]
            r6[r23] = r26
            int r23 = r23 + 1
            short r4 = r3[r4]
            goto L_0x00f7
        L_0x0102:
            byte r4 = r5[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r26 = r7
            byte r7 = (byte) r4
            r1[r21] = r7
        L_0x010b:
            int r21 = r21 + 1
            int r20 = r20 + 1
            if (r23 <= 0) goto L_0x0118
            int r23 = r23 + -1
            byte r27 = r6[r23]
            r1[r21] = r27
            goto L_0x010b
        L_0x0118:
            r27 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r4) goto L_0x012f
            short r8 = (short) r8
            r3[r0] = r8
            r5[r0] = r7
            int r0 = r0 + 1
            r7 = r0 & r25
            if (r7 != 0) goto L_0x012f
            if (r0 >= r4) goto L_0x012f
            int r13 = r13 + 1
            int r25 = r25 + r0
        L_0x012f:
            r8 = r15
            r4 = r24
            r7 = r26
            r28 = r27
            r15 = -1
            r27 = r0
            r0 = r29
            goto L_0x00b0
        L_0x013d:
            r24 = r4
            r0 = r27
            r15 = r28
            r26 = r13
            r22 = r15
            r13 = r20
            r20 = r21
            r17 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r15 = -1
            r24 = r0
            r21 = r8
            r8 = 1
            r0 = r29
            goto L_0x0083
        L_0x0159:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p416q.C10685e.m33600c(g.f.a.q.b):void");
    }

    public C10685e(C10681a aVar) {
        this.f25272b = new int[256];
        this.f25290t = Config.ARGB_8888;
        this.f25273c = aVar;
        this.f25282l = new C10683c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e9, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo27602a() {
        /*
            r7 = this;
            monitor-enter(r7)
            g.f.a.q.c r0 = r7.f25282l     // Catch:{ all -> 0x00ea }
            int r0 = r0.f25255c     // Catch:{ all -> 0x00ea }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f25281k     // Catch:{ all -> 0x00ea }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r3.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            g.f.a.q.c r4 = r7.f25282l     // Catch:{ all -> 0x00ea }
            int r4 = r4.f25255c     // Catch:{ all -> 0x00ea }
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            int r4 = r7.f25281k     // Catch:{ all -> 0x00ea }
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ea }
        L_0x0039:
            r7.f25285o = r2     // Catch:{ all -> 0x00ea }
        L_0x003b:
            int r0 = r7.f25285o     // Catch:{ all -> 0x00ea }
            r3 = 0
            if (r0 == r2) goto L_0x00c8
            int r0 = r7.f25285o     // Catch:{ all -> 0x00ea }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00c8
        L_0x0047:
            r0 = 0
            r7.f25285o = r0     // Catch:{ all -> 0x00ea }
            byte[] r4 = r7.f25275e     // Catch:{ all -> 0x00ea }
            if (r4 != 0) goto L_0x0058
            g.f.a.q.a$a r4 = r7.f25273c     // Catch:{ all -> 0x00ea }
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.mo21594b(r5)     // Catch:{ all -> 0x00ea }
            r7.f25275e = r4     // Catch:{ all -> 0x00ea }
        L_0x0058:
            g.f.a.q.c r4 = r7.f25282l     // Catch:{ all -> 0x00ea }
            java.util.List<g.f.a.q.b> r4 = r4.f25257e     // Catch:{ all -> 0x00ea }
            int r5 = r7.f25281k     // Catch:{ all -> 0x00ea }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00ea }
            g.f.a.q.b r4 = (p163g.p413f.p414a.p416q.C10682b) r4     // Catch:{ all -> 0x00ea }
            int r5 = r7.f25281k     // Catch:{ all -> 0x00ea }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x0074
            g.f.a.q.c r6 = r7.f25282l     // Catch:{ all -> 0x00ea }
            java.util.List<g.f.a.q.b> r6 = r6.f25257e     // Catch:{ all -> 0x00ea }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00ea }
            g.f.a.q.b r5 = (p163g.p413f.p414a.p416q.C10682b) r5     // Catch:{ all -> 0x00ea }
            goto L_0x0075
        L_0x0074:
            r5 = r3
        L_0x0075:
            int[] r6 = r4.f25252k     // Catch:{ all -> 0x00ea }
            if (r6 == 0) goto L_0x007c
            int[] r6 = r4.f25252k     // Catch:{ all -> 0x00ea }
            goto L_0x0080
        L_0x007c:
            g.f.a.q.c r6 = r7.f25282l     // Catch:{ all -> 0x00ea }
            int[] r6 = r6.f25253a     // Catch:{ all -> 0x00ea }
        L_0x0080:
            r7.f25271a = r6     // Catch:{ all -> 0x00ea }
            int[] r6 = r7.f25271a     // Catch:{ all -> 0x00ea }
            if (r6 != 0) goto L_0x00aa
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00ea }
            int r4 = r7.f25281k     // Catch:{ all -> 0x00ea }
            r1.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ea }
        L_0x00a6:
            r7.f25285o = r2     // Catch:{ all -> 0x00ea }
            monitor-exit(r7)
            return r3
        L_0x00aa:
            boolean r1 = r4.f25247f     // Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x00c2
            int[] r1 = r7.f25271a     // Catch:{ all -> 0x00ea }
            int[] r2 = r7.f25272b     // Catch:{ all -> 0x00ea }
            int[] r3 = r7.f25271a     // Catch:{ all -> 0x00ea }
            int r3 = r3.length     // Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)     // Catch:{ all -> 0x00ea }
            int[] r1 = r7.f25272b     // Catch:{ all -> 0x00ea }
            r7.f25271a = r1     // Catch:{ all -> 0x00ea }
            int[] r1 = r7.f25271a     // Catch:{ all -> 0x00ea }
            int r2 = r4.f25249h     // Catch:{ all -> 0x00ea }
            r1[r2] = r0     // Catch:{ all -> 0x00ea }
        L_0x00c2:
            android.graphics.Bitmap r0 = r7.m33597a(r4, r5)     // Catch:{ all -> 0x00ea }
            monitor-exit(r7)
            return r0
        L_0x00c8:
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = f25270u     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00ea }
            int r2 = r7.f25285o     // Catch:{ all -> 0x00ea }
            r1.append(r2)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r7)
            return r3
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p416q.C10685e.mo27602a():android.graphics.Bitmap");
    }

    /* renamed from: a */
    public synchronized void mo27620a(C10683c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f25285o = 0;
            this.f25282l = cVar;
            this.f25281k = -1;
            this.f25274d = byteBuffer.asReadOnlyBuffer();
            this.f25274d.position(0);
            this.f25274d.order(ByteOrder.LITTLE_ENDIAN);
            this.f25284n = false;
            Iterator it = cVar.f25257e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C10682b) it.next()).f25248g == 3) {
                        this.f25284n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f25286p = highestOneBit;
            this.f25288r = cVar.f25258f / highestOneBit;
            this.f25287q = cVar.f25259g / highestOneBit;
            this.f25279i = this.f25273c.mo21594b(cVar.f25258f * cVar.f25259g);
            this.f25280j = this.f25273c.mo21593a(this.f25288r * this.f25287q);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo27603a(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f25290t = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private Bitmap m33597a(C10682b bVar, C10682b bVar2) {
        int[] iArr = this.f25280j;
        int i = 0;
        if (bVar2 == null) {
            Bitmap bitmap = this.f25283m;
            if (bitmap != null) {
                this.f25273c.mo21590a(bitmap);
            }
            this.f25283m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f25248g == 3 && this.f25283m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null) {
            int i2 = bVar2.f25248g;
            if (i2 > 0) {
                if (i2 == 2) {
                    if (!bVar.f25247f) {
                        C10683c cVar = this.f25282l;
                        int i3 = cVar.f25264l;
                        if (bVar.f25252k == null || cVar.f25262j != bVar.f25249h) {
                            i = i3;
                        }
                    } else if (this.f25281k == 0) {
                        this.f25289s = Boolean.valueOf(true);
                    }
                    int i4 = bVar2.f25245d;
                    int i5 = this.f25286p;
                    int i6 = i4 / i5;
                    int i7 = bVar2.f25243b / i5;
                    int i8 = bVar2.f25244c / i5;
                    int i9 = bVar2.f25242a / i5;
                    int i10 = this.f25288r;
                    int i11 = (i7 * i10) + i9;
                    int i12 = (i6 * i10) + i11;
                    while (i11 < i12) {
                        int i13 = i11 + i8;
                        for (int i14 = i11; i14 < i13; i14++) {
                            iArr[i14] = i;
                        }
                        i11 += this.f25288r;
                    }
                } else if (i2 == 3) {
                    Bitmap bitmap2 = this.f25283m;
                    if (bitmap2 != null) {
                        int i15 = this.f25288r;
                        bitmap2.getPixels(iArr, 0, i15, 0, 0, i15, this.f25287q);
                    }
                }
            }
        }
        m33600c(bVar);
        if (bVar.f25246e || this.f25286p != 1) {
            m33598a(bVar);
        } else {
            m33599b(bVar);
        }
        if (this.f25284n) {
            int i16 = bVar.f25248g;
            if (i16 == 0 || i16 == 1) {
                if (this.f25283m == null) {
                    this.f25283m = m33601i();
                }
                Bitmap bitmap3 = this.f25283m;
                int i17 = this.f25288r;
                bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f25287q);
            }
        }
        Bitmap i18 = m33601i();
        int i19 = this.f25288r;
        i18.setPixels(iArr, 0, i19, 0, 0, i19, this.f25287q);
        return i18;
    }

    /* renamed from: a */
    private void m33598a(C10682b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C10682b bVar2 = bVar;
        int[] iArr = this.f25280j;
        int i6 = bVar2.f25245d;
        int i7 = this.f25286p;
        int i8 = i6 / i7;
        int i9 = bVar2.f25243b / i7;
        int i10 = bVar2.f25244c / i7;
        int i11 = bVar2.f25242a / i7;
        int i12 = this.f25281k;
        Boolean valueOf = Boolean.valueOf(true);
        boolean z2 = i12 == 0;
        int i13 = this.f25286p;
        int i14 = this.f25288r;
        int i15 = this.f25287q;
        byte[] bArr = this.f25279i;
        int[] iArr2 = this.f25271a;
        Boolean bool = this.f25289s;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        int i19 = 8;
        while (i16 < i8) {
            Boolean bool2 = valueOf;
            if (bVar2.f25246e) {
                if (i17 >= i8) {
                    i = i8;
                    i5 = i18 + 1;
                    if (i5 == 2) {
                        i17 = 4;
                    } else if (i5 == 3) {
                        i17 = 2;
                        i19 = 4;
                    } else if (i5 == 4) {
                        i17 = 1;
                        i19 = 2;
                    }
                } else {
                    i = i8;
                    i5 = i18;
                }
                i2 = i17 + i19;
                i18 = i5;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z3 = i13 == 1;
            if (i20 < i15) {
                int i21 = i20 * i14;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i14;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i9;
                int i25 = i16 * i13 * bVar2.f25244c;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z2 && bool == null) {
                            bool = bool2;
                        }
                        i25 += i13;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i4 = i10;
                    int i29 = ((i23 - i22) * i13) + i25;
                    int i30 = i22;
                    while (i30 < i23) {
                        int i31 = i23;
                        int a = m33596a(i25, i29, bVar2.f25244c);
                        if (a != 0) {
                            iArr[i30] = a;
                        } else if (z2 && bool == null) {
                            bool = bool2;
                        }
                        i25 += i13;
                        i30++;
                        i23 = i31;
                    }
                    i16++;
                    i17 = i2;
                    i10 = i4;
                    valueOf = bool2;
                    i8 = i;
                    i9 = i3;
                }
            } else {
                i3 = i9;
            }
            i4 = i10;
            i16++;
            i17 = i2;
            i10 = i4;
            valueOf = bool2;
            i8 = i;
            i9 = i3;
        }
        if (this.f25289s == null) {
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.f25289s = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private int m33596a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f25286p + i; i9++) {
            byte[] bArr = this.f25279i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f25271a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f25286p + i11; i12++) {
            byte[] bArr2 = this.f25279i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f25271a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }
}
