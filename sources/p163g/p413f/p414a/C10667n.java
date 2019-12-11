package p163g.p413f.p414a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p334n.C8227j;
import com.bumptech.glide.load.p341p.p346g.C8412c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p163g.p413f.p414a.p417r.C10688c;
import p163g.p413f.p414a.p417r.C10688c.C10689a;
import p163g.p413f.p414a.p417r.C10690d;
import p163g.p413f.p414a.p417r.C10695h;
import p163g.p413f.p414a.p417r.C10696i;
import p163g.p413f.p414a.p417r.C10703m;
import p163g.p413f.p414a.p417r.C10704n;
import p163g.p413f.p414a.p417r.C10707p;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p420u.C10726d;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.n */
/* compiled from: RequestManager */
public class C10667n implements C10696i, C10656i<C10665m<Drawable>> {

    /* renamed from: e0 */
    private static final C10731h f25191e0 = ((C10731h) C10731h.m33833b(Bitmap.class).mo19915B());

    /* renamed from: U */
    protected final Context f25192U;

    /* renamed from: V */
    final C10695h f25193V;

    /* renamed from: W */
    private final C10704n f25194W;

    /* renamed from: X */
    private final C10703m f25195X;

    /* renamed from: Y */
    private final C10707p f25196Y;

    /* renamed from: Z */
    private final Runnable f25197Z;

    /* renamed from: a0 */
    private final Handler f25198a0;

    /* renamed from: b0 */
    private final C10688c f25199b0;

    /* renamed from: c */
    protected final C10652e f25200c;

    /* renamed from: c0 */
    private final CopyOnWriteArrayList<C10730g<Object>> f25201c0;

    /* renamed from: d0 */
    private C10731h f25202d0;

    /* renamed from: g.f.a.n$a */
    /* compiled from: RequestManager */
    class C10668a implements Runnable {
        C10668a() {
        }

        public void run() {
            C10667n nVar = C10667n.this;
            nVar.f25193V.mo27622a(nVar);
        }
    }

    /* renamed from: g.f.a.n$b */
    /* compiled from: RequestManager */
    private class C10669b implements C10689a {

        /* renamed from: a */
        private final C10704n f25204a;

        C10669b(C10704n nVar) {
            this.f25204a = nVar;
        }

        /* renamed from: a */
        public void mo27579a(boolean z) {
            if (z) {
                synchronized (C10667n.this) {
                    this.f25204a.mo27654c();
                }
            }
        }
    }

    static {
        C10731h hVar = (C10731h) C10731h.m33833b(C8412c.class).mo19915B();
        C10731h hVar2 = (C10731h) ((C10731h) C10731h.m33832b(C8227j.f17608b).mo19930a(C10657j.LOW)).mo19933a(true);
    }

    public C10667n(C10652e eVar, C10695h hVar, C10703m mVar, Context context) {
        this(eVar, hVar, mVar, new C10704n(), eVar.mo27524d(), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo19947a(C10731h hVar) {
        this.f25202d0 = (C10731h) ((C10731h) hVar.clone()).mo19919a();
    }

    /* renamed from: b */
    public synchronized void mo27570b() {
        this.f25196Y.mo27570b();
        for (C10747i a : this.f25196Y.mo27666f()) {
            mo27567a(a);
        }
        this.f25196Y.mo27665e();
        this.f25194W.mo27650a();
        this.f25193V.mo27624b(this);
        this.f25193V.mo27624b(this.f25199b0);
        this.f25198a0.removeCallbacks(this.f25197Z);
        this.f25200c.mo27522b(this);
    }

    /* renamed from: c */
    public synchronized void mo27572c() {
        mo27575i();
        this.f25196Y.mo27572c();
    }

    /* renamed from: e */
    public C10665m<Bitmap> mo19948e() {
        return mo19945a(Bitmap.class).m33481a((C10723a<?>) f25191e0);
    }

    /* renamed from: f */
    public C10665m<Drawable> mo19949f() {
        return mo19945a(Drawable.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C10730g<Object>> mo27573g() {
        return this.f25201c0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public synchronized C10731h mo27574h() {
        return this.f25202d0;
    }

    /* renamed from: i */
    public synchronized void mo27575i() {
        this.f25194W.mo27652b();
    }

    /* renamed from: j */
    public synchronized void mo27576j() {
        this.f25194W.mo27655d();
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{tracker=");
        sb.append(this.f25194W);
        sb.append(", treeNode=");
        sb.append(this.f25195X);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized void mo27566a() {
        mo27576j();
        this.f25196Y.mo27566a();
    }

    C10667n(C10652e eVar, C10695h hVar, C10703m mVar, C10704n nVar, C10690d dVar, Context context) {
        this.f25196Y = new C10707p();
        this.f25197Z = new C10668a();
        this.f25198a0 = new Handler(Looper.getMainLooper());
        this.f25200c = eVar;
        this.f25193V = hVar;
        this.f25195X = mVar;
        this.f25194W = nVar;
        this.f25192U = context;
        this.f25199b0 = dVar.mo27626a(context.getApplicationContext(), new C10669b(nVar));
        if (C10775k.m34035c()) {
            this.f25198a0.post(this.f25197Z);
        } else {
            hVar.mo27622a(this);
        }
        hVar.mo27622a(this.f25199b0);
        this.f25201c0 = new CopyOnWriteArrayList<>(eVar.mo27526f().mo27537b());
        mo19947a(eVar.mo27526f().mo27538c());
        eVar.mo27519a(this);
    }

    /* renamed from: c */
    private void m33486c(C10747i<?> iVar) {
        if (!mo27571b(iVar) && !this.f25200c.mo27520a(iVar) && iVar.mo27742d() != null) {
            C10726d d = iVar.mo27742d();
            iVar.mo27734a((C10726d) null);
            d.clear();
        }
    }

    /* renamed from: a */
    public C10665m<Drawable> mo19946a(String str) {
        return mo19949f().mo19943a(str);
    }

    /* renamed from: a */
    public C10665m<Drawable> mo19944a(Uri uri) {
        return mo19949f().mo19939a(uri);
    }

    /* renamed from: a */
    public <ResourceType> C10665m<ResourceType> mo19945a(Class<ResourceType> cls) {
        return new C10665m<>(this.f25200c, this, cls, this.f25192U);
    }

    /* renamed from: a */
    public synchronized void mo27567a(C10747i<?> iVar) {
        if (iVar != null) {
            m33486c(iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo27571b(C10747i<?> iVar) {
        C10726d d = iVar.mo27742d();
        if (d == null) {
            return true;
        }
        if (!this.f25194W.mo27651a(d)) {
            return false;
        }
        this.f25196Y.mo27664b(iVar);
        iVar.mo27734a((C10726d) null);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo27568a(C10747i<?> iVar, C10726d dVar) {
        this.f25196Y.mo27663a(iVar);
        this.f25194W.mo27653b(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> C10670o<?, T> mo27569b(Class<T> cls) {
        return this.f25200c.mo27526f().mo27535a(cls);
    }
}
