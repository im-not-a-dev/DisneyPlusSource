package p163g.p449j.p487c.p490y;

import java.io.IOException;
import java.io.Writer;
import p163g.p449j.p487c.C11559l;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.p491l.C11649n;

/* renamed from: g.j.c.y.j */
/* compiled from: Streams */
public final class C11613j {

    /* renamed from: g.j.c.y.j$a */
    /* compiled from: Streams */
    private static final class C11614a extends Writer {

        /* renamed from: U */
        private final C11615a f27085U = new C11615a();

        /* renamed from: c */
        private final Appendable f27086c;

        /* renamed from: g.j.c.y.j$a$a */
        /* compiled from: Streams */
        static class C11615a implements CharSequence {

            /* renamed from: c */
            char[] f27087c;

            C11615a() {
            }

            public char charAt(int i) {
                return this.f27087c[i];
            }

            public int length() {
                return this.f27087c.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f27087c, i, i2 - i);
            }
        }

        C11614a(Appendable appendable) {
            this.f27086c = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C11615a aVar = this.f27085U;
            aVar.f27087c = cArr;
            this.f27086c.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f27086c.append((char) i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p163g.p449j.p487c.C11560m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p163g.p449j.p487c.C11567t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p163g.p449j.p487c.C11561n.f27022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p163g.p449j.p487c.C11567t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p163g.p449j.p487c.C11567t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' g.j.c.a0.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p163g.p449j.p487c.C11559l m37401a(p163g.p449j.p487c.p488a0.C11533a r2) throws p163g.p449j.p487c.C11563p {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            g.j.c.v<g.j.c.l> r1 = p163g.p449j.p487c.p490y.p491l.C11649n.f27174X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo29458a(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            g.j.c.l r2 = (p163g.p449j.p487c.C11559l) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            g.j.c.t r0 = new g.j.c.t
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            g.j.c.m r0 = new g.j.c.m
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            g.j.c.t r0 = new g.j.c.t
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            g.j.c.n r2 = p163g.p449j.p487c.C11561n.f27022a
            return r2
        L_0x002b:
            g.j.c.t r0 = new g.j.c.t
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.C11613j.m37401a(g.j.c.a0.a):g.j.c.l");
    }

    /* renamed from: a */
    public static void m37403a(C11559l lVar, C11536c cVar) throws IOException {
        C11649n.f27174X.mo29459a(cVar, lVar);
    }

    /* renamed from: a */
    public static Writer m37402a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C11614a(appendable);
    }
}
