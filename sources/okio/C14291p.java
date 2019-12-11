package okio;

/* renamed from: okio.p */
/* compiled from: PeekSource.kt */
public final class C14291p implements C14302x {

    /* renamed from: U */
    private C14295s f31887U;

    /* renamed from: V */
    private int f31888V;

    /* renamed from: W */
    private boolean f31889W;

    /* renamed from: X */
    private long f31890X;

    /* renamed from: Y */
    private final BufferedSource f31891Y;

    /* renamed from: c */
    private final Buffer f31892c = this.f31891Y.mo36288Z();

    public C14291p(BufferedSource bufferedSource) {
        this.f31891Y = bufferedSource;
        C14295s sVar = this.f31892c.f31848c;
        this.f31887U = sVar;
        this.f31888V = sVar != null ? sVar.f31901b : -1;
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31891Y.mo35898X();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 == r3.f31901b) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo35899a(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            boolean r0 = r8.f31889W
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0071
            okio.s r0 = r8.f31887U
            r2 = 0
            if (r0 == 0) goto L_0x001f
            okio.Buffer r3 = r8.f31892c
            okio.s r3 = r3.f31848c
            if (r0 != r3) goto L_0x001e
            int r0 = r8.f31888V
            if (r3 == 0) goto L_0x001a
            int r3 = r3.f31901b
            if (r0 != r3) goto L_0x001e
            goto L_0x001f
        L_0x001a:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r2
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0065
            okio.BufferedSource r0 = r8.f31891Y
            long r3 = r8.f31890X
            long r3 = r3 + r10
            r0.mo36314b(r3)
            okio.s r0 = r8.f31887U
            if (r0 != 0) goto L_0x0040
            okio.Buffer r0 = r8.f31892c
            okio.s r0 = r0.f31848c
            if (r0 == 0) goto L_0x0040
            r8.f31887U = r0
            if (r0 == 0) goto L_0x003c
            int r0 = r0.f31901b
            r8.f31888V = r0
            goto L_0x0040
        L_0x003c:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r2
        L_0x0040:
            okio.Buffer r0 = r8.f31892c
            long r0 = r0.mo36335h()
            long r2 = r8.f31890X
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0056
            r9 = -1
            return r9
        L_0x0056:
            okio.Buffer r2 = r8.f31892c
            long r4 = r8.f31890X
            r3 = r9
            r6 = r10
            r2.mo36305a(r3, r4, r6)
            long r0 = r8.f31890X
            long r0 = r0 + r10
            r8.f31890X = r0
            return r10
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0071:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C14291p.mo35899a(okio.Buffer, long):long");
    }

    public void close() {
        this.f31889W = true;
    }
}
