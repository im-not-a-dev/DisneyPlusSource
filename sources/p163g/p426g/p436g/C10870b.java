package p163g.p426g.p436g;

import p163g.p426g.p427a.p429j.C10827a;

/* renamed from: g.g.g.b */
/* compiled from: CallbackWithTimeout */
public class C10870b {

    /* renamed from: a */
    private C10888o f25756a;

    /* renamed from: g.g.g.b$a */
    /* compiled from: CallbackWithTimeout */
    class C10871a implements C10827a, Runnable {

        /* renamed from: U */
        private int f25757U;

        /* renamed from: V */
        private String f25758V;

        /* renamed from: W */
        private boolean f25759W = false;

        /* renamed from: c */
        private C10827a f25760c;

        public C10871a(C10870b bVar, C10827a aVar, int i, String str) {
            this.f25760c = aVar;
            this.f25757U = i;
            this.f25758V = str;
        }

        /* renamed from: a */
        public void mo27892a(boolean z, String str) {
            if (!this.f25759W) {
                this.f25759W = true;
                this.f25760c.mo27892a(z, str);
            }
        }

        public void run() {
            if (!this.f25759W) {
                this.f25759W = true;
                C10827a aVar = this.f25760c;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f25758V);
                sb.append(" (");
                sb.append(this.f25757U);
                sb.append(" ms)");
                aVar.mo27892a(false, sb.toString());
            }
        }
    }

    public C10870b(C10888o oVar) {
        this.f25756a = oVar;
    }

    /* renamed from: a */
    public C10827a mo27976a(C10827a aVar, int i, String str) {
        C10871a aVar2 = new C10871a(this, aVar, i, str);
        this.f25756a.mo28004a(aVar2, i, "CallbackWithTimeout.wrap");
        return aVar2;
    }
}
