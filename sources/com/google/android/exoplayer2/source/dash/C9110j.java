package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8742d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.p356g.C8746a;
import com.google.android.exoplayer2.metadata.p356g.C8748b;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.source.C9137e0;
import com.google.android.exoplayer2.source.dash.p376k.C9115b;
import com.google.android.exoplayer2.source.p379m0.C9212d;
import com.google.android.exoplayer2.upstream.C9491f;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.google.android.exoplayer2.source.dash.j */
/* compiled from: PlayerEmsgHandler */
public final class C9110j implements Callback {

    /* renamed from: U */
    private final C9112b f20401U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C8748b f20402V = new C8748b();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final Handler f20403W = Util.m29392a((Callback) this);

    /* renamed from: X */
    private final TreeMap<Long, Long> f20404X = new TreeMap<>();

    /* renamed from: Y */
    private C9115b f20405Y;

    /* renamed from: Z */
    private long f20406Z;

    /* renamed from: a0 */
    private long f20407a0 = -9223372036854775807L;

    /* renamed from: b0 */
    private long f20408b0 = -9223372036854775807L;

    /* renamed from: c */
    private final C9491f f20409c;

    /* renamed from: c0 */
    private boolean f20410c0;

    /* renamed from: d0 */
    private boolean f20411d0;

    /* renamed from: com.google.android.exoplayer2.source.dash.j$a */
    /* compiled from: PlayerEmsgHandler */
    private static final class C9111a {

        /* renamed from: a */
        public final long f20412a;

        /* renamed from: b */
        public final long f20413b;

        public C9111a(long j, long j2) {
            this.f20412a = j;
            this.f20413b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.j$b */
    /* compiled from: PlayerEmsgHandler */
    public interface C9112b {
        /* renamed from: a */
        void mo23616a();

        /* renamed from: a */
        void mo23617a(long j);
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.j$c */
    /* compiled from: PlayerEmsgHandler */
    public final class C9113c implements C8924q {

        /* renamed from: a */
        private final C9137e0 f20414a;

        /* renamed from: b */
        private final C8679b0 f20415b = new C8679b0();

        /* renamed from: c */
        private final C8742d f20416c = new C8742d();

        C9113c(C9137e0 e0Var) {
            this.f20414a = e0Var;
        }

        /* renamed from: c */
        private void m27249c() {
            while (this.f20414a.mo23765j()) {
                C8742d b = m27248b();
                if (b != null) {
                    long j = b.f19024W;
                    Metadata a = C9110j.this.f20402V.mo22875a(b);
                    if (a != null) {
                        C8746a aVar = (C8746a) a.mo22863a(0);
                        if (C9110j.m27231a(aVar.f18577c, aVar.f18572U)) {
                            m27247a(j, aVar);
                        }
                    }
                }
            }
            this.f20414a.mo23757c();
        }

        /* renamed from: a */
        public void mo23304a(Format format) {
            this.f20414a.mo23304a(format);
        }

        /* renamed from: b */
        public void mo23673b(C9212d dVar) {
            C9110j.this.mo23668b(dVar);
        }

        /* renamed from: b */
        private C8742d m27248b() {
            this.f20416c.mo23207b();
            if (this.f20414a.mo23749a(this.f20415b, (C8879e) this.f20416c, false, false, 0) != -4) {
                return null;
            }
            this.f20416c.mo23223f();
            return this.f20416c;
        }

        /* renamed from: a */
        public int mo23302a(C8913h hVar, int i, boolean z) throws IOException, InterruptedException {
            return this.f20414a.mo23302a(hVar, i, z);
        }

        /* renamed from: a */
        public void mo23305a(C9572w wVar, int i) {
            this.f20414a.mo23305a(wVar, i);
        }

        /* renamed from: a */
        public void mo23303a(long j, int i, int i2, int i3, C8925a aVar) {
            this.f20414a.mo23303a(j, i, i2, i3, aVar);
            m27249c();
        }

        /* renamed from: a */
        public boolean mo23671a(long j) {
            return C9110j.this.mo23665a(j);
        }

        /* renamed from: a */
        public boolean mo23672a(C9212d dVar) {
            return C9110j.this.mo23666a(dVar);
        }

        /* renamed from: a */
        public void mo23670a() {
            this.f20414a.mo23768m();
        }

        /* renamed from: a */
        private void m27247a(long j, C8746a aVar) {
            long a = C9110j.m27232b(aVar);
            if (a != -9223372036854775807L) {
                m27246a(j, a);
            }
        }

        /* renamed from: a */
        private void m27246a(long j, long j2) {
            C9110j.this.f20403W.sendMessage(C9110j.this.f20403W.obtainMessage(1, new C9111a(j, j2)));
        }
    }

    public C9110j(C9115b bVar, C9112b bVar2, C9491f fVar) {
        this.f20405Y = bVar;
        this.f20401U = bVar2;
        this.f20409c = fVar;
    }

    /* renamed from: c */
    private void m27235c() {
        long j = this.f20408b0;
        if (j == -9223372036854775807L || j != this.f20407a0) {
            this.f20410c0 = true;
            this.f20408b0 = this.f20407a0;
            this.f20401U.mo23616a();
        }
    }

    /* renamed from: d */
    private void m27236d() {
        this.f20401U.mo23617a(this.f20406Z);
    }

    /* renamed from: e */
    private void m27237e() {
        Iterator it = this.f20404X.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Entry) it.next()).getKey()).longValue() < this.f20405Y.f20430h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f20411d0) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C9111a aVar = (C9111a) message.obj;
        m27230a(aVar.f20412a, aVar.f20413b);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23668b(C9212d dVar) {
        long j = this.f20407a0;
        if (j != -9223372036854775807L || dVar.f20862g > j) {
            this.f20407a0 = dVar.f20862g;
        }
    }

    /* renamed from: a */
    public void mo23664a(C9115b bVar) {
        this.f20410c0 = false;
        this.f20406Z = -9223372036854775807L;
        this.f20405Y = bVar;
        m27237e();
    }

    /* renamed from: b */
    public void mo23667b() {
        this.f20411d0 = true;
        this.f20403W.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    private Entry<Long, Long> m27234b(long j) {
        return this.f20404X.ceilingEntry(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static long m27232b(C8746a aVar) {
        try {
            return Util.m29454h(Util.m29399a(aVar.f18575X));
        } catch (C8723g0 unused) {
            return -9223372036854775807L;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23665a(long j) {
        C9115b bVar = this.f20405Y;
        boolean z = false;
        if (!bVar.f20426d) {
            return false;
        }
        if (this.f20410c0) {
            return true;
        }
        Entry b = m27234b(bVar.f20430h);
        if (b != null && ((Long) b.getValue()).longValue() < j) {
            this.f20406Z = ((Long) b.getKey()).longValue();
            m27236d();
            z = true;
        }
        if (z) {
            m27235c();
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23666a(C9212d dVar) {
        if (!this.f20405Y.f20426d) {
            return false;
        }
        if (this.f20410c0) {
            return true;
        }
        long j = this.f20407a0;
        if (!(j != -9223372036854775807L && j < dVar.f20861f)) {
            return false;
        }
        m27235c();
        return true;
    }

    /* renamed from: a */
    public static boolean m27231a(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: a */
    public C9113c mo23663a() {
        return new C9113c(new C9137e0(this.f20409c));
    }

    /* renamed from: a */
    private void m27230a(long j, long j2) {
        Long l = (Long) this.f20404X.get(Long.valueOf(j2));
        if (l == null) {
            this.f20404X.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f20404X.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }
}
