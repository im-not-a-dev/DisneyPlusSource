package com.google.android.exoplayer2.p393v0;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.v0.m */
/* compiled from: EventDispatcher */
public final class C9557m<T> {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C9559b<T>> f22293a = new CopyOnWriteArrayList<>();

    /* renamed from: com.google.android.exoplayer2.v0.m$a */
    /* compiled from: EventDispatcher */
    public interface C9558a<T> {
        /* renamed from: a */
        void mo22792a(T t);
    }

    /* renamed from: com.google.android.exoplayer2.v0.m$b */
    /* compiled from: EventDispatcher */
    private static final class C9559b<T> {

        /* renamed from: a */
        private final Handler f22294a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T f22295b;

        /* renamed from: c */
        private boolean f22296c;

        public C9559b(Handler handler, T t) {
            this.f22294a = handler;
            this.f22295b = t;
        }

        /* renamed from: b */
        public /* synthetic */ void mo24652b(C9558a aVar) {
            if (!this.f22296c) {
                aVar.mo22792a(this.f22295b);
            }
        }

        /* renamed from: a */
        public void mo24650a() {
            this.f22296c = true;
        }

        /* renamed from: a */
        public void mo24651a(C9558a<T> aVar) {
            this.f22294a.post(new C9527a(this, aVar));
        }
    }

    /* renamed from: a */
    public void mo24647a(Handler handler, T t) {
        Assertions.m29299a((handler == null || t == null) ? false : true);
        mo24649a(t);
        this.f22293a.add(new C9559b(handler, t));
    }

    /* renamed from: a */
    public void mo24649a(T t) {
        Iterator it = this.f22293a.iterator();
        while (it.hasNext()) {
            C9559b bVar = (C9559b) it.next();
            if (bVar.f22295b == t) {
                bVar.mo24650a();
                this.f22293a.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo24648a(C9558a<T> aVar) {
        Iterator it = this.f22293a.iterator();
        while (it.hasNext()) {
            ((C9559b) it.next()).mo24651a(aVar);
        }
    }
}
