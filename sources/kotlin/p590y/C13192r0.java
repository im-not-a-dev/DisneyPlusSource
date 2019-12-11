package kotlin.p590y;

import java.util.Iterator;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12712k;
import kotlin.p587i0.C12777j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, mo31007d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.y.r0 */
/* compiled from: SlidingWindow.kt */
public final class C13192r0 {

    @C12706f(mo31052c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo31053f = "SlidingWindow.kt", mo31054l = {33, 39, 46, 52, 55}, mo31055m = "invokeSuspend")
    /* renamed from: kotlin.y.r0$a */
    /* compiled from: SlidingWindow.kt */
    static final class C13193a extends C12712k implements Function2<C12777j<? super List<? extends T>>, C12683c<? super C13145v>, Object> {

        /* renamed from: V */
        private C12777j f29620V;

        /* renamed from: W */
        Object f29621W;

        /* renamed from: X */
        Object f29622X;

        /* renamed from: Y */
        Object f29623Y;

        /* renamed from: Z */
        Object f29624Z;

        /* renamed from: a0 */
        int f29625a0;

        /* renamed from: b0 */
        int f29626b0;

        /* renamed from: c0 */
        int f29627c0;

        /* renamed from: d0 */
        final /* synthetic */ int f29628d0;

        /* renamed from: e0 */
        final /* synthetic */ int f29629e0;

        /* renamed from: f0 */
        final /* synthetic */ Iterator f29630f0;

        /* renamed from: g0 */
        final /* synthetic */ boolean f29631g0;

        /* renamed from: h0 */
        final /* synthetic */ boolean f29632h0;

        C13193a(int i, int i2, Iterator it, boolean z, boolean z2, C12683c cVar) {
            this.f29628d0 = i;
            this.f29629e0 = i2;
            this.f29630f0 = it;
            this.f29631g0 = z;
            this.f29632h0 = z2;
            super(2, cVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x00c3 A[SYNTHETIC] */
        /* renamed from: a */
        public final java.lang.Object mo5580a(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r12.f29627c0
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x006a
                if (r1 == r6) goto L_0x0055
                if (r1 == r5) goto L_0x0048
                if (r1 == r4) goto L_0x0034
                if (r1 == r3) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                java.lang.Object r0 = r12.f29622X
                kotlin.y.m0 r0 = (kotlin.p590y.C13181m0) r0
                goto L_0x004c
            L_0x001c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0024:
                java.lang.Object r1 = r12.f29622X
                kotlin.y.m0 r1 = (kotlin.p590y.C13181m0) r1
                int r4 = r12.f29625a0
                java.lang.Object r5 = r12.f29621W
                kotlin.i0.j r5 = (kotlin.p587i0.C12777j) r5
                kotlin.C12903o.m40241a(r13)
                r13 = r12
                goto L_0x0153
            L_0x0034:
                java.lang.Object r1 = r12.f29624Z
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r12.f29622X
                kotlin.y.m0 r5 = (kotlin.p590y.C13181m0) r5
                int r7 = r12.f29625a0
                java.lang.Object r8 = r12.f29621W
                kotlin.i0.j r8 = (kotlin.p587i0.C12777j) r8
                kotlin.C12903o.m40241a(r13)
                r13 = r12
                goto L_0x0124
            L_0x0048:
                java.lang.Object r0 = r12.f29622X
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L_0x004c:
                java.lang.Object r0 = r12.f29621W
                kotlin.i0.j r0 = (kotlin.p587i0.C12777j) r0
                kotlin.C12903o.m40241a(r13)
                goto L_0x016f
            L_0x0055:
                java.lang.Object r1 = r12.f29624Z
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r12.f29622X
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r3 = r12.f29625a0
                java.lang.Object r4 = r12.f29621W
                kotlin.i0.j r4 = (kotlin.p587i0.C12777j) r4
                kotlin.C12903o.m40241a(r13)
                r13 = r12
                r7 = r0
                r0 = r3
                goto L_0x00b2
            L_0x006a:
                kotlin.C12903o.m40241a(r13)
                kotlin.i0.j r13 = r12.f29620V
                int r1 = r12.f29628d0
                int r7 = r12.f29629e0
                int r1 = r1 - r7
                if (r1 < 0) goto L_0x00e7
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r7)
                r3 = 0
                java.util.Iterator r4 = r12.f29630f0
                r7 = r0
                r0 = r1
                r1 = r4
                r4 = r13
                r13 = r12
            L_0x0083:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L_0x00c3
                java.lang.Object r8 = r1.next()
                if (r3 <= 0) goto L_0x0092
                int r3 = r3 + -1
                goto L_0x0083
            L_0x0092:
                r2.add(r8)
                int r9 = r2.size()
                int r10 = r13.f29629e0
                if (r9 != r10) goto L_0x0083
                r13.f29621W = r4
                r13.f29625a0 = r0
                r13.f29622X = r2
                r13.f29626b0 = r3
                r13.f29623Y = r8
                r13.f29624Z = r1
                r13.f29627c0 = r6
                java.lang.Object r3 = r4.mo31098a(r2, r13)
                if (r3 != r7) goto L_0x00b2
                return r7
            L_0x00b2:
                boolean r3 = r13.f29631g0
                if (r3 == 0) goto L_0x00ba
                r2.clear()
                goto L_0x00c1
            L_0x00ba:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r13.f29629e0
                r2.<init>(r3)
            L_0x00c1:
                r3 = r0
                goto L_0x0083
            L_0x00c3:
                boolean r1 = r2.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x016f
                boolean r1 = r13.f29632h0
                if (r1 != 0) goto L_0x00d6
                int r1 = r2.size()
                int r6 = r13.f29629e0
                if (r1 != r6) goto L_0x016f
            L_0x00d6:
                r13.f29621W = r4
                r13.f29625a0 = r0
                r13.f29622X = r2
                r13.f29626b0 = r3
                r13.f29627c0 = r5
                java.lang.Object r13 = r4.mo31098a(r2, r13)
                if (r13 != r7) goto L_0x016f
                return r7
            L_0x00e7:
                kotlin.y.m0 r5 = new kotlin.y.m0
                r5.<init>(r7)
                java.util.Iterator r7 = r12.f29630f0
                r8 = r13
                r13 = r12
                r11 = r7
                r7 = r1
                r1 = r11
            L_0x00f3:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x012a
                java.lang.Object r9 = r1.next()
                r5.add(r9)
                boolean r10 = r5.mo34266d()
                if (r10 == 0) goto L_0x00f3
                boolean r10 = r13.f29631g0
                if (r10 == 0) goto L_0x010c
                r10 = r5
                goto L_0x0111
            L_0x010c:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>(r5)
            L_0x0111:
                r13.f29621W = r8
                r13.f29625a0 = r7
                r13.f29622X = r5
                r13.f29623Y = r9
                r13.f29624Z = r1
                r13.f29627c0 = r4
                java.lang.Object r9 = r8.mo31098a(r10, r13)
                if (r9 != r0) goto L_0x0124
                return r0
            L_0x0124:
                int r9 = r13.f29628d0
                r5.mo34267f(r9)
                goto L_0x00f3
            L_0x012a:
                boolean r1 = r13.f29632h0
                if (r1 == 0) goto L_0x016f
                r1 = r5
                r4 = r7
                r5 = r8
            L_0x0131:
                int r7 = r1.size()
                int r8 = r13.f29628d0
                if (r7 <= r8) goto L_0x0159
                boolean r7 = r13.f29631g0
                if (r7 == 0) goto L_0x013f
                r7 = r1
                goto L_0x0144
            L_0x013f:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>(r1)
            L_0x0144:
                r13.f29621W = r5
                r13.f29625a0 = r4
                r13.f29622X = r1
                r13.f29627c0 = r3
                java.lang.Object r7 = r5.mo31098a(r7, r13)
                if (r7 != r0) goto L_0x0153
                return r0
            L_0x0153:
                int r7 = r13.f29628d0
                r1.mo34267f(r7)
                goto L_0x0131
            L_0x0159:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x016f
                r13.f29621W = r5
                r13.f29625a0 = r4
                r13.f29622X = r1
                r13.f29627c0 = r2
                java.lang.Object r13 = r5.mo31098a(r1, r13)
                if (r13 != r0) goto L_0x016f
                return r0
            L_0x016f:
                kotlin.v r13 = kotlin.C13145v.f29587a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p590y.C13192r0.C13193a.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C13193a aVar = new C13193a(this.f29628d0, this.f29629e0, this.f29630f0, this.f29631g0, this.f29632h0, cVar);
            aVar.f29620V = (C12777j) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C13193a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    /* renamed from: a */
    public static final void m40538a(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            String str2 = " must be greater than zero.";
            if (i != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(str2);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size ");
                sb2.append(i);
                sb2.append(str2);
                str = sb2.toString();
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<List<T>> m40537a(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        if (!it.hasNext()) {
            return C13202x.f29640c;
        }
        C13193a aVar = new C13193a(i2, i, it, z2, z, null);
        return C12779l.m39971a(aVar);
    }
}
