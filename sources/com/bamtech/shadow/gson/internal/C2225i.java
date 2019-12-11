package com.bamtech.shadow.gson.internal;

import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.internal.bind.TypeAdapters;
import com.bamtech.shadow.gson.p051s.C2252c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.bamtech.shadow.gson.internal.i */
/* compiled from: Streams */
public final class C2225i {

    /* renamed from: com.bamtech.shadow.gson.internal.i$a */
    /* compiled from: Streams */
    private static final class C2226a extends Writer {

        /* renamed from: U */
        private final C2227a f6327U = new C2227a();

        /* renamed from: c */
        private final Appendable f6328c;

        /* renamed from: com.bamtech.shadow.gson.internal.i$a$a */
        /* compiled from: Streams */
        static class C2227a implements CharSequence {

            /* renamed from: c */
            char[] f6329c;

            C2227a() {
            }

            public char charAt(int i) {
                return this.f6329c[i];
            }

            public int length() {
                return this.f6329c.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f6329c, i, i2 - i);
            }
        }

        C2226a(Appendable appendable) {
            this.f6328c = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C2227a aVar = this.f6327U;
            aVar.f6329c = cArr;
            this.f6328c.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f6328c.append((char) i);
        }
    }

    /* JADX INFO: used method not loaded: com.bamtech.shadow.gson.n.<init>(java.lang.Throwable):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.bamtech.shadow.gson.C2133i((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.bamtech.shadow.gson.C2237n((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.bamtech.shadow.gson.C2233j.f6335a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.bamtech.shadow.gson.C2237n((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.bamtech.shadow.gson.C2237n((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' com.bamtech.shadow.gson.s.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bamtech.shadow.gson.JsonElement m8573a(com.bamtech.shadow.gson.p051s.C2249a r2) throws com.bamtech.shadow.gson.C2234k {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.bamtech.shadow.gson.p<com.bamtech.shadow.gson.JsonElement> r1 = com.bamtech.shadow.gson.internal.bind.TypeAdapters.f6230X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo11055a(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.bamtech.shadow.gson.JsonElement r2 = (com.bamtech.shadow.gson.JsonElement) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.bamtech.shadow.gson.n r0 = new com.bamtech.shadow.gson.n
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.bamtech.shadow.gson.i r0 = new com.bamtech.shadow.gson.i
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.bamtech.shadow.gson.n r0 = new com.bamtech.shadow.gson.n
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.bamtech.shadow.gson.j r2 = com.bamtech.shadow.gson.C2233j.f6335a
            return r2
        L_0x002b:
            com.bamtech.shadow.gson.n r0 = new com.bamtech.shadow.gson.n
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.C2225i.m8573a(com.bamtech.shadow.gson.s.a):com.bamtech.shadow.gson.JsonElement");
    }

    /* renamed from: a */
    public static void m8575a(JsonElement jsonElement, C2252c cVar) throws IOException {
        TypeAdapters.f6230X.mo11057a(cVar, jsonElement);
    }

    /* renamed from: a */
    public static Writer m8574a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C2226a(appendable);
    }
}
