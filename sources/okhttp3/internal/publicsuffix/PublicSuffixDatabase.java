package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f31748e = {42};

    /* renamed from: f */
    private static final String[] f31749f = new String[0];

    /* renamed from: g */
    private static final String[] f31750g = {"*"};

    /* renamed from: h */
    private static final PublicSuffixDatabase f31751h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f31752a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f31753b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f31754c;

    /* renamed from: d */
    private byte[] f31755d;

    /* renamed from: a */
    public static PublicSuffixDatabase m45387a() {
        return f31751h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45389b() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            okio.j r1 = new okio.j
            okio.x r0 = okio.C14287m.m45724a(r0)
            r1.<init>(r0)
            okio.BufferedSource r0 = okio.C14287m.m45716a(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003e }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003e }
            r0.readFully(r1)     // Catch:{ all -> 0x003e }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003e }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003e }
            r0.readFully(r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            monitor-enter(r3)
            r3.f31754c = r1     // Catch:{ all -> 0x003b }
            r3.f31755d = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            java.util.concurrent.CountDownLatch r0 = r3.f31753b
            r0.countDown()
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x004b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m45389b():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45390c() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m45389b()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            okhttp3.d0.m.e r2 = okhttp3.p688d0.p695m.C14225e.m45335d()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.mo36133a(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m45390c():void");
    }

    /* renamed from: a */
    public String mo36188a(String str) {
        int i;
        int i2;
        if (str != null) {
            String str2 = "\\.";
            String[] split = IDN.toUnicode(str).split(str2);
            String[] a = m45388a(split);
            if (split.length == a.length && a[0].charAt(0) != '!') {
                return null;
            }
            if (a[0].charAt(0) == '!') {
                i2 = split.length;
                i = a.length;
            } else {
                i2 = split.length;
                i = a.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split(str2);
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] m45388a(java.lang.String[] r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f31752a
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f31752a
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0016
            r7.m45390c()
            goto L_0x0023
        L_0x0016:
            java.util.concurrent.CountDownLatch r0 = r7.f31753b     // Catch:{ InterruptedException -> 0x001c }
            r0.await()     // Catch:{ InterruptedException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0023:
            monitor-enter(r7)
            byte[] r0 = r7.f31754c     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00bf
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
            int r0 = r8.length
            byte[][] r0 = new byte[r0][]
            r3 = 0
        L_0x002d:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x003d
            r4 = r8[r3]
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r5)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x002d
        L_0x003d:
            r8 = 0
        L_0x003e:
            int r3 = r0.length
            r4 = 0
            if (r8 >= r3) goto L_0x004e
            byte[] r3 = r7.f31754c
            java.lang.String r3 = m45386a(r3, r0, r8)
            if (r3 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            int r8 = r8 + 1
            goto L_0x003e
        L_0x004e:
            r3 = r4
        L_0x004f:
            int r8 = r0.length
            if (r8 <= r2) goto L_0x006d
            java.lang.Object r8 = r0.clone()
            byte[][] r8 = (byte[][]) r8
            r5 = 0
        L_0x0059:
            int r6 = r8.length
            int r6 = r6 - r2
            if (r5 >= r6) goto L_0x006d
            byte[] r6 = f31748e
            r8[r5] = r6
            byte[] r6 = r7.f31754c
            java.lang.String r6 = m45386a(r6, r8, r5)
            if (r6 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x006d:
            r6 = r4
        L_0x006e:
            if (r6 == 0) goto L_0x0080
        L_0x0070:
            int r8 = r0.length
            int r8 = r8 - r2
            if (r1 >= r8) goto L_0x0080
            byte[] r8 = r7.f31755d
            java.lang.String r8 = m45386a(r8, r0, r1)
            if (r8 == 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0070
        L_0x0080:
            r8 = r4
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = r8.split(r0)
            return r8
        L_0x009b:
            if (r3 != 0) goto L_0x00a2
            if (r6 != 0) goto L_0x00a2
            java.lang.String[] r8 = f31750g
            return r8
        L_0x00a2:
            if (r3 == 0) goto L_0x00ab
            java.lang.String r8 = "\\."
            java.lang.String[] r8 = r3.split(r8)
            goto L_0x00ad
        L_0x00ab:
            java.lang.String[] r8 = f31749f
        L_0x00ad:
            if (r6 == 0) goto L_0x00b6
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r6.split(r0)
            goto L_0x00b8
        L_0x00b6:
            java.lang.String[] r0 = f31749f
        L_0x00b8:
            int r1 = r8.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r8 = r0
        L_0x00be:
            return r8
        L_0x00bf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r8.<init>(r0)     // Catch:{ all -> 0x00c7 }
            throw r8     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c7 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m45388a(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: a */
    private static String m45386a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z) {
                    z = false;
                    b = 46;
                } else {
                    b = bArr4[i9][i10] & 255;
                }
                i3 = b - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length == i10) {
                        if (i9 == bArr4.length - 1) {
                            break;
                        }
                        i9++;
                        z = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, StandardCharsets.UTF_8);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }
}
