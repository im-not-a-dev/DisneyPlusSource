package p163g.p426g.p436g;

import java.util.concurrent.Callable;
import p163g.p426g.p427a.p429j.C10828b;
import p163g.p426g.p427a.p429j.C10835i;

/* renamed from: g.g.g.o */
/* compiled from: Timer */
public class C10888o {

    /* renamed from: a */
    private C10835i f25811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10875d f25812b;

    /* renamed from: c */
    private C10880i f25813c;

    /* renamed from: g.g.g.o$a */
    /* compiled from: Timer */
    class C10889a implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: U */
        public Runnable f25814U;

        /* renamed from: c */
        private String f25816c;

        /* renamed from: g.g.g.o$a$a */
        /* compiled from: Timer */
        class C10890a implements Callable<Void> {
            C10890a() {
            }

            public Void call() throws Exception {
                C10889a.this.f25814U.run();
                return null;
            }
        }

        public C10889a(String str, Runnable runnable) {
            this.f25816c = str;
            this.f25814U = runnable;
        }

        public void run() {
            if (C10888o.this.f25812b != null) {
                try {
                    C10888o.this.f25812b.mo27986a((Callable<V>) new C10890a<V>(), this.f25816c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: g.g.g.o$b */
    /* compiled from: Timer */
    class C10891b implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: U */
        public Runnable f25818U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C10828b f25819V = null;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public boolean f25820W = false;

        /* renamed from: c */
        private String f25822c;

        /* renamed from: g.g.g.o$b$a */
        /* compiled from: Timer */
        class C10892a implements Callable<Void> {
            C10892a() {
            }

            public Void call() throws Exception {
                if (C10891b.this.f25819V != null) {
                    C10891b.this.f25819V.cancel();
                    C10891b.this.f25819V = null;
                }
                C10891b.this.f25818U.run();
                C10891b.this.f25820W = true;
                return null;
            }
        }

        public C10891b(String str, Runnable runnable) {
            this.f25822c = str;
            this.f25818U = runnable;
        }

        public void run() {
            if (C10888o.this.f25812b != null) {
                try {
                    C10888o.this.f25812b.mo27986a((Callable<V>) new C10892a<V>(), this.f25822c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public void mo28009a(C10828b bVar) {
            this.f25819V = bVar;
        }

        /* renamed from: a */
        public boolean mo28010a() {
            return this.f25820W;
        }
    }

    public C10888o(C10880i iVar, C10835i iVar2, C10875d dVar) {
        this.f25811a = iVar2;
        this.f25812b = dVar;
        this.f25813c = iVar;
    }

    /* renamed from: b */
    public C10828b mo28005b(Runnable runnable, int i, String str) {
        return mo28006c(new C10889a(str, runnable), i, str);
    }

    /* renamed from: c */
    public C10828b mo28006c(Runnable runnable, int i, String str) {
        this.f25813c.mo27992c("createTimer(): calling TimerInterface.createTimer");
        return this.f25811a.mo27911a(runnable, i, str);
    }

    /* renamed from: a */
    public C10828b mo28004a(Runnable runnable, int i, String str) {
        C10891b bVar = new C10891b(str, runnable);
        C10828b c = mo28006c(bVar, i, str);
        bVar.mo28009a(c);
        if (!bVar.mo28010a() || c == null) {
            return c;
        }
        c.cancel();
        return null;
    }
}
