package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9575z;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.exoplayer2.upstream.cache.k */
/* compiled from: CacheUtil */
public final class C9471k {

    /* renamed from: a */
    public static final C9469i f22036a = C9459a.f21980a;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.k$a */
    /* compiled from: CacheUtil */
    public interface C9472a {
        /* renamed from: a */
        void mo23040a(long j, long j2, long j3);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.k$b */
    /* compiled from: CacheUtil */
    private static final class C9473b {

        /* renamed from: a */
        private final C9472a f22037a;

        /* renamed from: b */
        private long f22038b;

        /* renamed from: c */
        private long f22039c;

        public C9473b(C9472a aVar) {
            this.f22037a = aVar;
        }

        /* renamed from: a */
        public void mo24508a(long j, long j2) {
            this.f22038b = j;
            this.f22039c = j2;
            this.f22037a.mo23040a(j, j2, 0);
        }

        /* renamed from: b */
        public void mo24509b(long j) {
            if (this.f22038b == -1 && j != -1) {
                this.f22038b = j;
                this.f22037a.mo23040a(j, this.f22039c, 0);
            }
        }

        /* renamed from: a */
        public void mo24507a(long j) {
            this.f22039c += j;
            this.f22037a.mo23040a(this.f22038b, this.f22039c, j);
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m29048a(DataSpec dataSpec) {
        String str = dataSpec.f21944g;
        return str != null ? str : m29047a(dataSpec.f21938a);
    }

    /* renamed from: a */
    public static String m29047a(Uri uri) {
        return uri.toString();
    }

    /* renamed from: a */
    public static Pair<Long, Long> m29046a(DataSpec dataSpec, Cache cache, C9469i iVar) {
        DataSpec dataSpec2 = dataSpec;
        String a = m29049a(dataSpec2, iVar);
        long j = dataSpec2.f21941d;
        long a2 = m29045a(dataSpec2, cache, a);
        long j2 = j;
        long j3 = a2;
        long j4 = 0;
        while (j3 != 0) {
            int i = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long b = cache.mo24483b(a, j2, i != 0 ? j3 : Long.MAX_VALUE);
            if (b <= 0) {
                b = -b;
                if (b == Long.MAX_VALUE) {
                    break;
                }
            } else {
                j4 += b;
            }
            j2 += b;
            if (i == 0) {
                b = 0;
            }
            j3 -= b;
        }
        return Pair.create(Long.valueOf(a2), Long.valueOf(j4));
    }

    /* renamed from: a */
    public static void m29050a(DataSpec dataSpec, Cache cache, C9469i iVar, C9463d dVar, byte[] bArr, C9575z zVar, int i, C9472a aVar, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        C9473b bVar;
        long j;
        long j2;
        DataSpec dataSpec2 = dataSpec;
        C9472a aVar2 = aVar;
        C9537e.m29296a(dVar);
        C9537e.m29296a(bArr);
        String a = m29049a(dataSpec2, iVar);
        if (aVar2 != null) {
            bVar = new C9473b(aVar2);
            Pair a2 = m29046a(dataSpec, cache, iVar);
            bVar.mo24508a(((Long) a2.first).longValue(), ((Long) a2.second).longValue());
            j = ((Long) a2.first).longValue();
            Cache cache2 = cache;
        } else {
            j = m29045a(dataSpec2, cache, a);
            bVar = null;
        }
        C9473b bVar2 = bVar;
        long j3 = dataSpec2.f21941d;
        boolean z2 = j == -1;
        long j4 = j;
        long j5 = j3;
        while (j4 != 0) {
            m29051a(atomicBoolean);
            long b = cache.mo24483b(a, j5, z2 ? Long.MAX_VALUE : j4);
            if (b > 0) {
                j2 = b;
            } else {
                long j6 = -b;
                long j7 = j6 == Long.MAX_VALUE ? -1 : j6;
                j2 = j6;
                if (m29044a(dataSpec, j5, j7, (DataSource) dVar, bArr, zVar, i, bVar2, j7 == j4, atomicBoolean) < j2) {
                    if (z && !z2) {
                        throw new EOFException();
                    }
                    return;
                }
            }
            j5 += j2;
            if (!z2) {
                j4 -= j2;
            }
        }
    }

    /* renamed from: a */
    private static long m29045a(DataSpec dataSpec, Cache cache, String str) {
        long j = dataSpec.f21943f;
        long j2 = -1;
        if (j != -1) {
            return j;
        }
        long a = C9479n.m29126a(cache.mo24476a(str));
        if (a != -1) {
            j2 = a - dataSpec.f21941d;
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r13 = r7;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        com.google.android.exoplayer2.p393v0.C9554k0.m29405a(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[ExcHandler: all (r0v12 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:10:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m29044a(com.google.android.exoplayer2.upstream.DataSpec r15, long r16, long r18, com.google.android.exoplayer2.upstream.DataSource r20, byte[] r21, com.google.android.exoplayer2.p393v0.C9575z r22, int r23, com.google.android.exoplayer2.upstream.cache.C9471k.C9473b r24, boolean r25, java.util.concurrent.atomic.AtomicBoolean r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r15
            r2 = r20
            r3 = r21
            r4 = r24
            long r5 = r1.f21941d
            long r5 = r16 - r5
            r7 = -1
            int r0 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            long r9 = r5 + r18
            goto L_0x0015
        L_0x0014:
            r9 = r7
        L_0x0015:
            r11 = r5
        L_0x0016:
            if (r22 == 0) goto L_0x001b
            r22.mo24726b(r23)
        L_0x001b:
            m29051a(r26)
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0040
            r17 = r14
            long r13 = r9 - r11
            com.google.android.exoplayer2.upstream.DataSpec r0 = r15.mo24450a(r11, r13)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            long r13 = r2.open(r0)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            r0 = 1
            goto L_0x0044
        L_0x0030:
            r0 = move-exception
            goto L_0x0086
        L_0x0032:
            r0 = move-exception
            if (r25 == 0) goto L_0x003f
            boolean r13 = m29052a(r0)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            if (r13 == 0) goto L_0x003f
            com.google.android.exoplayer2.p393v0.C9554k0.m29405a(r20)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            goto L_0x0042
        L_0x003f:
            throw r0     // Catch:{ a -> 0x008a, all -> 0x0030 }
        L_0x0040:
            r17 = r14
        L_0x0042:
            r13 = r7
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x004e
            com.google.android.exoplayer2.upstream.DataSpec r0 = r15.mo24450a(r11, r7)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            long r13 = r2.open(r0)     // Catch:{ a -> 0x008a, all -> 0x0030 }
        L_0x004e:
            if (r25 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x005a
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            long r13 = r13 + r11
            r4.mo24509b(r13)     // Catch:{ a -> 0x008a, all -> 0x0030 }
        L_0x005a:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            m29051a(r26)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            if (r17 == 0) goto L_0x006d
            int r0 = r3.length     // Catch:{ a -> 0x008a, all -> 0x0030 }
            long r13 = (long) r0     // Catch:{ a -> 0x008a, all -> 0x0030 }
            long r7 = r9 - r11
            long r7 = java.lang.Math.min(r13, r7)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            int r0 = (int) r7     // Catch:{ a -> 0x008a, all -> 0x0030 }
            goto L_0x006e
        L_0x006d:
            int r0 = r3.length     // Catch:{ a -> 0x008a, all -> 0x0030 }
        L_0x006e:
            r7 = 0
            int r0 = r2.read(r3, r7, r0)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            r8 = -1
            if (r0 != r8) goto L_0x007c
            if (r4 == 0) goto L_0x0090
            r4.mo24509b(r11)     // Catch:{ a -> 0x008a, all -> 0x0030 }
            goto L_0x0090
        L_0x007c:
            long r13 = (long) r0     // Catch:{ a -> 0x008a, all -> 0x0030 }
            long r11 = r11 + r13
            if (r4 == 0) goto L_0x0083
            r4.mo24507a(r13)     // Catch:{ a -> 0x008a, all -> 0x0030 }
        L_0x0083:
            r7 = -1
            goto L_0x005a
        L_0x0086:
            com.google.android.exoplayer2.p393v0.C9554k0.m29405a(r20)
            throw r0
        L_0x008a:
            com.google.android.exoplayer2.p393v0.C9554k0.m29405a(r20)
            r7 = -1
            goto L_0x0016
        L_0x0090:
            long r11 = r11 - r5
            com.google.android.exoplayer2.p393v0.C9554k0.m29405a(r20)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9471k.m29044a(com.google.android.exoplayer2.upstream.DataSpec, long, long, com.google.android.exoplayer2.upstream.DataSource, byte[], com.google.android.exoplayer2.v0.z, int, com.google.android.exoplayer2.upstream.cache.k$b, boolean, java.util.concurrent.atomic.AtomicBoolean):long");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.io.IOException, code=java.lang.Throwable, for r1v0, types: [java.lang.Throwable, java.io.IOException] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m29052a(java.lang.Throwable r1) {
        /*
        L_0x0000:
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1 instanceof com.google.android.exoplayer2.upstream.C9507m
            if (r0 == 0) goto L_0x000f
            r0 = r1
            com.google.android.exoplayer2.upstream.m r0 = (com.google.android.exoplayer2.upstream.C9507m) r0
            int r0 = r0.f22139c
            if (r0 != 0) goto L_0x000f
            r1 = 1
            return r1
        L_0x000f:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0000
        L_0x0014:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9471k.m29052a(java.io.IOException):boolean");
    }

    /* renamed from: a */
    private static String m29049a(DataSpec dataSpec, C9469i iVar) {
        if (iVar == null) {
            iVar = f22036a;
        }
        return iVar.mo24488a(dataSpec);
    }

    /* renamed from: a */
    private static void m29051a(AtomicBoolean atomicBoolean) throws InterruptedException {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }
}
