package com.bumptech.glide.load.p341p.p346g;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.C8227j;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10665m;
import p163g.p413f.p414a.C10667n;
import p163g.p413f.p414a.p416q.C10680a;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p420u.C10731h;
import p163g.p413f.p414a.p420u.p421l.C10745g;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p420u.p422m.C10756d;
import p163g.p413f.p414a.p423v.C10760b;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.g.g */
/* compiled from: GifFrameLoader */
class C8417g {

    /* renamed from: a */
    private final C10680a f17928a;

    /* renamed from: b */
    private final Handler f17929b;

    /* renamed from: c */
    private final List<C8419b> f17930c;

    /* renamed from: d */
    final C10667n f17931d;

    /* renamed from: e */
    private final C8159e f17932e;

    /* renamed from: f */
    private boolean f17933f;

    /* renamed from: g */
    private boolean f17934g;

    /* renamed from: h */
    private boolean f17935h;

    /* renamed from: i */
    private C10665m<Bitmap> f17936i;

    /* renamed from: j */
    private C8418a f17937j;

    /* renamed from: k */
    private boolean f17938k;

    /* renamed from: l */
    private C8418a f17939l;

    /* renamed from: m */
    private Bitmap f17940m;

    /* renamed from: n */
    private C8418a f17941n;

    /* renamed from: o */
    private C8421d f17942o;

    /* renamed from: com.bumptech.glide.load.p.g.g$a */
    /* compiled from: GifFrameLoader */
    static class C8418a extends C10745g<Bitmap> {

        /* renamed from: W */
        private final Handler f17943W;

        /* renamed from: X */
        final int f17944X;

        /* renamed from: Y */
        private final long f17945Y;

        /* renamed from: Z */
        private Bitmap f17946Z;

        C8418a(Handler handler, int i, long j) {
            this.f17943W = handler;
            this.f17944X = i;
            this.f17945Y = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Bitmap mo21633f() {
            return this.f17946Z;
        }

        /* renamed from: a */
        public void mo20648a(Bitmap bitmap, C10756d<? super Bitmap> dVar) {
            this.f17946Z = bitmap;
            this.f17943W.sendMessageAtTime(this.f17943W.obtainMessage(1, this), this.f17945Y);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.g.g$b */
    /* compiled from: GifFrameLoader */
    public interface C8419b {
        /* renamed from: a */
        void mo21595a();
    }

    /* renamed from: com.bumptech.glide.load.p.g.g$c */
    /* compiled from: GifFrameLoader */
    private class C8420c implements Callback {
        C8420c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C8417g.this.mo21621a((C8418a) message.obj);
                return true;
            }
            if (i == 2) {
                C8417g.this.f17931d.mo27567a((C10747i<?>) (C8418a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.g.g$d */
    /* compiled from: GifFrameLoader */
    interface C8421d {
        /* renamed from: a */
        void mo21635a();
    }

    C8417g(C10652e eVar, C10680a aVar, int i, int i2, C8118l<Bitmap> lVar, Bitmap bitmap) {
        this(eVar.mo27523c(), C10652e.m33421e(eVar.mo27525e()), aVar, null, m24483a(C10652e.m33421e(eVar.mo27525e()), i, i2), lVar, bitmap);
    }

    /* renamed from: j */
    private static C8111g m24484j() {
        return new C10760b(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    private int m24485k() {
        return C10775k.m34020a(mo21625c().getWidth(), mo21625c().getHeight(), mo21625c().getConfig());
    }

    /* renamed from: l */
    private void m24486l() {
        if (this.f17933f && !this.f17934g) {
            if (this.f17935h) {
                C10774j.m34016a(this.f17941n == null, "Pending target must be null when starting from the first frame");
                this.f17928a.mo27609f();
                this.f17935h = false;
            }
            C8418a aVar = this.f17941n;
            if (aVar != null) {
                this.f17941n = null;
                mo21621a(aVar);
                return;
            }
            this.f17934g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f17928a.mo27607d());
            this.f17928a.mo27604b();
            this.f17939l = new C8418a(this.f17929b, this.f17928a.mo27610g(), uptimeMillis);
            this.f17936i.m33481a((C10723a<?>) C10731h.m33831b(m24484j())).mo19942a((Object) this.f17928a).mo27562a(this.f17939l);
        }
    }

    /* renamed from: m */
    private void m24487m() {
        Bitmap bitmap = this.f17940m;
        if (bitmap != null) {
            this.f17932e.mo21244a(bitmap);
            this.f17940m = null;
        }
    }

    /* renamed from: n */
    private void m24488n() {
        if (!this.f17933f) {
            this.f17933f = true;
            this.f17938k = false;
            m24486l();
        }
    }

    /* renamed from: o */
    private void m24489o() {
        this.f17933f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21620a(C8118l<Bitmap> lVar, Bitmap bitmap) {
        C10774j.m34012a(lVar);
        C8118l lVar2 = lVar;
        C10774j.m34012a(bitmap);
        this.f17940m = bitmap;
        this.f17936i = this.f17936i.m33481a(new C10731h().mo19927a(lVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21624b(C8419b bVar) {
        this.f17930c.remove(bVar);
        if (this.f17930c.isEmpty()) {
            m24489o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Bitmap mo21625c() {
        C8418a aVar = this.f17937j;
        return aVar != null ? aVar.mo21633f() : this.f17940m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo21626d() {
        C8418a aVar = this.f17937j;
        if (aVar != null) {
            return aVar.f17944X;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Bitmap mo21627e() {
        return this.f17940m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo21628f() {
        return this.f17928a.mo27605c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo21629g() {
        return mo21625c().getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo21630h() {
        return this.f17928a.mo27611h() + m24485k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo21631i() {
        return mo21625c().getWidth();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21622a(C8419b bVar) {
        if (this.f17938k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f17930c.contains(bVar)) {
            boolean isEmpty = this.f17930c.isEmpty();
            this.f17930c.add(bVar);
            if (isEmpty) {
                m24488n();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ByteBuffer mo21623b() {
        return this.f17928a.mo27608e().asReadOnlyBuffer();
    }

    C8417g(C8159e eVar, C10667n nVar, C10680a aVar, Handler handler, C10665m<Bitmap> mVar, C8118l<Bitmap> lVar, Bitmap bitmap) {
        this.f17930c = new ArrayList();
        this.f17931d = nVar;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C8420c());
        }
        this.f17932e = eVar;
        this.f17929b = handler;
        this.f17936i = mVar;
        this.f17928a = aVar;
        mo21620a(lVar, bitmap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21619a() {
        this.f17930c.clear();
        m24487m();
        m24489o();
        C8418a aVar = this.f17937j;
        if (aVar != null) {
            this.f17931d.mo27567a((C10747i<?>) aVar);
            this.f17937j = null;
        }
        C8418a aVar2 = this.f17939l;
        if (aVar2 != null) {
            this.f17931d.mo27567a((C10747i<?>) aVar2);
            this.f17939l = null;
        }
        C8418a aVar3 = this.f17941n;
        if (aVar3 != null) {
            this.f17931d.mo27567a((C10747i<?>) aVar3);
            this.f17941n = null;
        }
        this.f17928a.clear();
        this.f17938k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21621a(C8418a aVar) {
        C8421d dVar = this.f17942o;
        if (dVar != null) {
            dVar.mo21635a();
        }
        this.f17934g = false;
        if (this.f17938k) {
            this.f17929b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f17933f) {
            this.f17941n = aVar;
        } else {
            if (aVar.mo21633f() != null) {
                m24487m();
                C8418a aVar2 = this.f17937j;
                this.f17937j = aVar;
                for (int size = this.f17930c.size() - 1; size >= 0; size--) {
                    ((C8419b) this.f17930c.get(size)).mo21595a();
                }
                if (aVar2 != null) {
                    this.f17929b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m24486l();
        }
    }

    /* renamed from: a */
    private static C10665m<Bitmap> m24483a(C10667n nVar, int i, int i2) {
        return nVar.mo19948e().m33481a(((C10731h) ((C10731h) C10731h.m33832b(C8227j.f17607a).mo19936b(true)).mo19933a(true)).mo19922a(i, i2));
    }
}
