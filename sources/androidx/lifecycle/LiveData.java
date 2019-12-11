package androidx.lifecycle;

import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import java.util.Map.Entry;
import p096e.p105b.p106a.p107a.C3902a;
import p096e.p105b.p106a.p108b.C3909b;

public abstract class LiveData<T> {

    /* renamed from: j */
    static final Object f2964j = new Object();

    /* renamed from: a */
    final Object f2965a = new Object();

    /* renamed from: b */
    private C3909b<C0731t<? super T>, C0701b> f2966b = new C3909b<>();

    /* renamed from: c */
    int f2967c = 0;

    /* renamed from: d */
    private volatile Object f2968d = f2964j;

    /* renamed from: e */
    volatile Object f2969e = f2964j;

    /* renamed from: f */
    private int f2970f = -1;

    /* renamed from: g */
    private boolean f2971g;

    /* renamed from: h */
    private boolean f2972h;

    /* renamed from: i */
    private final Runnable f2973i = new C0700a();

    class LifecycleBoundObserver extends C0701b implements C0720k {

        /* renamed from: X */
        final C0722m f2974X;

        LifecycleBoundObserver(C0722m mVar, C0731t<? super T> tVar) {
            super(tVar);
            this.f2974X = mVar;
        }

        /* renamed from: a */
        public void mo330a(C0722m mVar, C0716a aVar) {
            if (this.f2974X.getLifecycle().mo4133a() == C0717b.DESTROYED) {
                LiveData.this.mo4094a(this.f2980c);
            } else {
                mo4104a(mo4102b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4102b() {
            return this.f2974X.getLifecycle().mo4133a().mo4136a(C0717b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4101a(C0722m mVar) {
            return this.f2974X == mVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4100a() {
            this.f2974X.getLifecycle().mo4135b(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0700a implements Runnable {
        C0700a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2965a) {
                obj = LiveData.this.f2969e;
                LiveData.this.f2969e = LiveData.f2964j;
            }
            LiveData.this.mo4096b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private abstract class C0701b {

        /* renamed from: U */
        boolean f2977U;

        /* renamed from: V */
        int f2978V = -1;

        /* renamed from: c */
        final C0731t<? super T> f2980c;

        C0701b(C0731t<? super T> tVar) {
            this.f2980c = tVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4100a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4104a(boolean z) {
            if (z != this.f2977U) {
                this.f2977U = z;
                int i = 1;
                boolean z2 = LiveData.this.f2967c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f2967c;
                if (!this.f2977U) {
                    i = -1;
                }
                liveData.f2967c = i2 + i;
                if (z2 && this.f2977U) {
                    LiveData.this.mo4098c();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f2967c == 0 && !this.f2977U) {
                    liveData2.mo4099d();
                }
                if (this.f2977U) {
                    LiveData.this.mo4092a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4101a(C0722m mVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo4102b();
    }

    /* renamed from: b */
    private void m3694b(C0701b bVar) {
        if (bVar.f2977U) {
            if (!bVar.mo4102b()) {
                bVar.mo4104a(false);
                return;
            }
            int i = bVar.f2978V;
            int i2 = this.f2970f;
            if (i < i2) {
                bVar.f2978V = i2;
                bVar.f2980c.mo4149a(this.f2968d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4092a(C0701b bVar) {
        if (this.f2971g) {
            this.f2972h = true;
            return;
        }
        this.f2971g = true;
        do {
            this.f2972h = false;
            if (bVar == null) {
                C3913d d = this.f2966b.mo13985d();
                while (d.hasNext()) {
                    m3694b((C0701b) ((Entry) d.next()).getValue());
                    if (this.f2972h) {
                        break;
                    }
                }
            } else {
                m3694b(bVar);
                bVar = null;
            }
        } while (this.f2972h);
        this.f2971g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4098c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4099d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4096b(T t) {
        m3693a("setValue");
        this.f2970f++;
        this.f2968d = t;
        mo4092a(null);
    }

    /* renamed from: b */
    public boolean mo4097b() {
        return this.f2967c > 0;
    }

    /* renamed from: a */
    public void mo4093a(C0722m mVar, C0731t<? super T> tVar) {
        m3693a("observe");
        if (mVar.getLifecycle().mo4133a() != C0717b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, tVar);
            C0701b bVar = (C0701b) this.f2966b.mo13978b(tVar, lifecycleBoundObserver);
            if (bVar != null && !bVar.mo4101a(mVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (bVar == null) {
                mVar.getLifecycle().mo4134a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo4094a(C0731t<? super T> tVar) {
        m3693a("removeObserver");
        C0701b bVar = (C0701b) this.f2966b.remove(tVar);
        if (bVar != null) {
            bVar.mo4100a();
            bVar.mo4104a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4095a(T t) {
        boolean z;
        synchronized (this.f2965a) {
            z = this.f2969e == f2964j;
            this.f2969e = t;
        }
        if (z) {
            C3902a.m13112c().mo13973b(this.f2973i);
        }
    }

    /* renamed from: a */
    public T mo4091a() {
        T t = this.f2968d;
        if (t != f2964j) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    static void m3693a(String str) {
        if (!C3902a.m13112c().mo13972a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
