package kotlin.p588j0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, mo31007d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, mo31008k = 5, mo31009mv = {1, 1, 15}, mo31011xi = 1, mo31012xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.j0.p */
/* compiled from: Indent.kt */
class C12823p {

    /* renamed from: kotlin.j0.p$a */
    /* compiled from: Indent.kt */
    static final class C12824a extends C12881k implements Function1<String, String> {

        /* renamed from: c */
        public static final C12824a f29504c = new C12824a();

        C12824a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            invoke(str);
            return str;
        }

        public final String invoke(String str) {
            return str;
        }
    }

    /* renamed from: kotlin.j0.p$b */
    /* compiled from: Indent.kt */
    static final class C12825b extends C12881k implements Function1<String, String> {

        /* renamed from: c */
        final /* synthetic */ String f29505c;

        C12825b(String str) {
            this.f29505c = str;
            super(1);
        }

        public final String invoke(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29505c);
            sb.append(str);
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (r7 != null) goto L_0x00a9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m40098a(java.lang.String r14, java.lang.String r15) {
        /*
            java.util.List r0 = kotlin.p588j0.C12833x.m40180e(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x000d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.p588j0.C12832w.m40118a(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x000d
            r1.add(r3)
            goto L_0x000d
        L_0x0026:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.p590y.C13187p.m40525a(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004d
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = m40100b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L_0x0035
        L_0x004d:
            java.lang.Comparable r1 = kotlin.p590y.C13199w.m40598k(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L_0x005b
            int r1 = r1.intValue()
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            kotlin.jvm.functions.Function1 r15 = m40099a(r15)
            int r3 = kotlin.p590y.C13185o.m40507a(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            r7 = 0
            if (r2 < 0) goto L_0x00b0
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x0091
            if (r2 != r3) goto L_0x0098
        L_0x0091:
            boolean r2 = kotlin.p588j0.C12832w.m40118a(r5)
            if (r2 == 0) goto L_0x0098
            goto L_0x00a9
        L_0x0098:
            java.lang.String r2 = kotlin.p588j0.C12839z.m40186e(r5, r1)
            if (r2 == 0) goto L_0x00a8
            java.lang.Object r2 = r15.invoke(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r7 = r5
        L_0x00a9:
            if (r7 == 0) goto L_0x00ae
            r4.add(r7)
        L_0x00ae:
            r2 = r6
            goto L_0x007c
        L_0x00b0:
            kotlin.p590y.C13180m.m40455c()
            throw r7
        L_0x00b4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            r5 = r15
            kotlin.p590y.C13199w.m40557a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r15 = (java.lang.StringBuilder) r15
            java.lang.String r14 = r15.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.C12880j.m40222a(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12823p.m40098a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static final int m40100b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C12798a.m40012a(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: c */
    public static String m40101c(String str) {
        return m40098a(str, "");
    }

    /* renamed from: a */
    private static final Function1<String, String> m40099a(String str) {
        if (str.length() == 0) {
            return C12824a.f29504c;
        }
        return new C12825b(str);
    }
}
