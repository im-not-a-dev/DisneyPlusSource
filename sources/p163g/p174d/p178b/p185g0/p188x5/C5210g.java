package p163g.p174d.p178b.p185g0.p188x5;

import android.view.MotionEvent;
import p163g.p174d.p178b.C5325v;

/* renamed from: g.d.b.g0.x5.g */
/* compiled from: PlayerTouchStateMachine */
public class C5210g {

    /* renamed from: a */
    final C5215e f12538a;

    /* renamed from: b */
    final C5215e f12539b;

    /* renamed from: c */
    final C5215e f12540c;

    /* renamed from: d */
    final C5215e f12541d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5325v f12542e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5216h f12543f;

    /* renamed from: g */
    C5215e f12544g;

    /* renamed from: h */
    long f12545h;

    /* renamed from: g.d.b.g0.x5.g$a */
    /* compiled from: PlayerTouchStateMachine */
    class C5211a implements C5215e {
        C5211a() {
        }

        /* renamed from: a */
        public C5215e mo16707a() {
            return this;
        }

        /* renamed from: a */
        public C5215e mo16708a(MotionEvent motionEvent) {
            C5210g.this.f12543f.mo16711a();
            return this;
        }

        /* renamed from: b */
        public C5215e mo16709b() {
            return this;
        }

        public C5215e onDoubleTap(MotionEvent motionEvent) {
            mo16708a(motionEvent);
            return this;
        }
    }

    /* renamed from: g.d.b.g0.x5.g$b */
    /* compiled from: PlayerTouchStateMachine */
    class C5212b implements C5215e {
        C5212b() {
        }

        /* renamed from: a */
        public C5215e mo16708a(MotionEvent motionEvent) {
            C5210g.this.f12543f.mo16711a();
            return this;
        }

        /* renamed from: b */
        public C5215e mo16709b() {
            return C5210g.this.f12541d;
        }

        public C5215e onDoubleTap(MotionEvent motionEvent) {
            C5210g.this.f12543f.mo16712a(motionEvent);
            C5210g gVar = C5210g.this;
            gVar.f12545h = gVar.f12542e.mo17097a();
            return C5210g.this.f12540c;
        }

        /* renamed from: a */
        public C5215e mo16707a() {
            return C5210g.this.f12539b;
        }
    }

    /* renamed from: g.d.b.g0.x5.g$c */
    /* compiled from: PlayerTouchStateMachine */
    class C5213c implements C5215e {
        C5213c() {
        }

        /* renamed from: c */
        private boolean m17543c() {
            return C5210g.this.f12542e.mo17097a() - C5210g.this.f12545h > 1000;
        }

        /* renamed from: a */
        public C5215e mo16708a(MotionEvent motionEvent) {
            if (m17543c()) {
                C5210g.this.f12543f.mo16711a();
                return C5210g.this.f12539b;
            }
            C5210g.this.f12543f.mo16712a(motionEvent);
            C5210g gVar = C5210g.this;
            gVar.f12545h = gVar.f12542e.mo17097a();
            return this;
        }

        /* renamed from: b */
        public C5215e mo16709b() {
            return C5210g.this.f12541d;
        }

        public C5215e onDoubleTap(MotionEvent motionEvent) {
            if (!m17543c()) {
                C5210g.this.f12543f.mo16712a(motionEvent);
            }
            C5210g.this.f12543f.mo16712a(motionEvent);
            C5210g gVar = C5210g.this;
            gVar.f12545h = gVar.f12542e.mo17097a();
            return this;
        }

        /* renamed from: a */
        public C5215e mo16707a() {
            return C5210g.this.f12539b;
        }
    }

    /* renamed from: g.d.b.g0.x5.g$d */
    /* compiled from: PlayerTouchStateMachine */
    class C5214d implements C5215e {
        C5214d() {
        }

        /* renamed from: a */
        public C5215e mo16708a(MotionEvent motionEvent) {
            return C5210g.this.f12539b;
        }

        /* renamed from: b */
        public C5215e mo16709b() {
            return C5210g.this.f12541d;
        }

        public C5215e onDoubleTap(MotionEvent motionEvent) {
            return C5210g.this.f12539b;
        }

        /* renamed from: a */
        public C5215e mo16707a() {
            return C5210g.this.f12539b;
        }
    }

    /* renamed from: g.d.b.g0.x5.g$e */
    /* compiled from: PlayerTouchStateMachine */
    interface C5215e {
        /* renamed from: a */
        C5215e mo16707a();

        /* renamed from: a */
        C5215e mo16708a(MotionEvent motionEvent);

        /* renamed from: b */
        C5215e mo16709b();

        C5215e onDoubleTap(MotionEvent motionEvent);
    }

    public C5210g(C5216h hVar) {
        this(hVar, new C5325v());
    }

    /* renamed from: c */
    public void mo16705c() {
        this.f12544g = this.f12544g.mo16709b();
    }

    /* renamed from: d */
    public void mo16706d() {
        this.f12544g = this.f12544g.mo16707a();
    }

    C5210g(C5216h hVar, C5325v vVar) {
        this.f12538a = new C5211a();
        this.f12539b = new C5212b();
        this.f12540c = new C5213c();
        this.f12541d = new C5214d();
        this.f12544g = this.f12539b;
        this.f12542e = vVar;
        this.f12543f = hVar;
    }

    /* renamed from: a */
    public void mo16702a(MotionEvent motionEvent) {
        this.f12544g = this.f12544g.onDoubleTap(motionEvent);
    }

    /* renamed from: b */
    public void mo16704b(MotionEvent motionEvent) {
        this.f12544g = this.f12544g.mo16708a(motionEvent);
    }

    /* renamed from: a */
    public void mo16701a() {
        this.f12544g = this.f12539b;
    }

    /* renamed from: b */
    public void mo16703b() {
        this.f12544g = this.f12538a;
    }
}
