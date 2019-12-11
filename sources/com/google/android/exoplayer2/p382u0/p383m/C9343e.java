package com.google.android.exoplayer2.p382u0.p383m;

import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p382u0.C9326f;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.p382u0.C9330i;
import com.google.android.exoplayer2.p382u0.C9331j;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.u0.m.e */
/* compiled from: CeaDecoder */
abstract class C9343e implements C9326f {

    /* renamed from: a */
    private final ArrayDeque<C9345b> f21460a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<C9331j> f21461b;

    /* renamed from: c */
    private final PriorityQueue<C9345b> f21462c;

    /* renamed from: d */
    private C9345b f21463d;

    /* renamed from: e */
    private long f21464e;

    /* renamed from: f */
    private long f21465f;

    /* renamed from: com.google.android.exoplayer2.u0.m.e$b */
    /* compiled from: CeaDecoder */
    private static final class C9345b extends C9330i implements Comparable<C9345b> {
        /* access modifiers changed from: private */

        /* renamed from: Z */
        public long f21466Z;

        private C9345b() {
        }

        /* renamed from: a */
        public int compareTo(C9345b bVar) {
            int i = 1;
            if (mo23211d() != bVar.mo23211d()) {
                if (!mo23211d()) {
                    i = -1;
                }
                return i;
            }
            long j = this.f19024W - bVar.f19024W;
            if (j == 0) {
                j = this.f21466Z - bVar.f21466Z;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                i = -1;
            }
            return i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.m.e$c */
    /* compiled from: CeaDecoder */
    private final class C9346c extends C9331j {
        private C9346c() {
        }

        /* renamed from: f */
        public final void mo23227f() {
            C9343e.this.mo24181a((C9331j) this);
        }
    }

    public C9343e() {
        for (int i = 0; i < 10; i++) {
            this.f21460a.add(new C9345b());
        }
        this.f21461b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f21461b.add(new C9346c());
        }
        this.f21462c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public void mo23217a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24152a(C9330i iVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C9325e mo24153d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo24154e();

    public void flush() {
        this.f21465f = 0;
        this.f21464e = 0;
        while (!this.f21462c.isEmpty()) {
            m28476a((C9345b) this.f21462c.poll());
        }
        C9345b bVar = this.f21463d;
        if (bVar != null) {
            m28476a(bVar);
            this.f21463d = null;
        }
    }

    /* renamed from: a */
    public void mo24142a(long j) {
        this.f21464e = j;
    }

    /* renamed from: b */
    public void mo23218a(C9330i iVar) throws C9327g {
        C9537e.m29299a(iVar == this.f21463d);
        if (iVar.mo23210c()) {
            m28476a(this.f21463d);
        } else {
            C9345b bVar = this.f21463d;
            long j = this.f21465f;
            this.f21465f = 1 + j;
            bVar.f21466Z = j;
            this.f21462c.add(this.f21463d);
        }
        this.f21463d = null;
    }

    /* renamed from: c */
    public C9330i m28486c() throws C9327g {
        C9537e.m29301b(this.f21463d == null);
        if (this.f21460a.isEmpty()) {
            return null;
        }
        this.f21463d = (C9345b) this.f21460a.pollFirst();
        return this.f21463d;
    }

    /* renamed from: a */
    private void m28476a(C9345b bVar) {
        bVar.mo23207b();
        this.f21460a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24181a(C9331j jVar) {
        jVar.mo23207b();
        this.f21461b.add(jVar);
    }

    /* renamed from: b */
    public C9331j m28483b() throws C9327g {
        if (this.f21461b.isEmpty()) {
            return null;
        }
        while (!this.f21462c.isEmpty() && ((C9345b) this.f21462c.peek()).f19024W <= this.f21464e) {
            C9345b bVar = (C9345b) this.f21462c.poll();
            if (bVar.mo23211d()) {
                C9331j jVar = (C9331j) this.f21461b.pollFirst();
                jVar.mo23208b(4);
                m28476a(bVar);
                return jVar;
            }
            mo24152a((C9330i) bVar);
            if (mo24154e()) {
                C9325e d = mo24153d();
                if (!bVar.mo23210c()) {
                    C9331j jVar2 = (C9331j) this.f21461b.pollFirst();
                    jVar2.mo24150a(bVar.f19024W, d, Long.MAX_VALUE);
                    m28476a(bVar);
                    return jVar2;
                }
            }
            m28476a(bVar);
        }
        return null;
    }
}
