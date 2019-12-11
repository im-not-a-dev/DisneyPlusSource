package p520io.reactivex.subjects;

import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p547j.C12540a;
import p520io.reactivex.p531y.p547j.C12540a.C12541a;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.subjects.c */
/* compiled from: SerializedSubject */
final class C11980c<T> extends C11983e<T> implements C12541a<Object> {

    /* renamed from: U */
    boolean f27694U;

    /* renamed from: V */
    C12540a<Object> f27695V;

    /* renamed from: W */
    volatile boolean f27696W;

    /* renamed from: c */
    final C11983e<T> f27697c;

    C11980c(C11983e<T> eVar) {
        this.f27697c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f27697c.mo30162a(qVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo30317o() {
        C12540a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f27695V;
                if (aVar == null) {
                    this.f27694U = false;
                    return;
                }
                this.f27695V = null;
            }
            aVar.mo30662a((C12541a<? super T>) this);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f27696W) {
            synchronized (this) {
                if (!this.f27696W) {
                    this.f27696W = true;
                    if (this.f27694U) {
                        C12540a<Object> aVar = this.f27695V;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27695V = aVar;
                        }
                        aVar.mo30663a(C12551j.m39357a());
                        return;
                    }
                    this.f27694U = true;
                    this.f27697c.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p520io.reactivex.p523c0.C11915a.m38466b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f27697c.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f27696W
            if (r0 == 0) goto L_0x0008
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f27696W     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f27696W = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f27694U     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.y.j.a<java.lang.Object> r0 = r2.f27695V     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.y.j.a r0 = new io.reactivex.y.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f27695V = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p520io.reactivex.p531y.p547j.C12551j.m39359a(r3)     // Catch:{ all -> 0x003b }
            r0.mo30666b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f27694U = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0035:
            io.reactivex.subjects.e<T> r0 = r2.f27697c
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.subjects.C11980c.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f27696W) {
            synchronized (this) {
                if (!this.f27696W) {
                    if (this.f27694U) {
                        C12540a<Object> aVar = this.f27695V;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27695V = aVar;
                        }
                        C12551j.m39368e(t);
                        aVar.mo30663a(t);
                        return;
                    }
                    this.f27694U = true;
                    this.f27697c.onNext(t);
                    mo30317o();
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f27696W) {
            synchronized (this) {
                if (!this.f27696W) {
                    if (this.f27694U) {
                        C12540a<Object> aVar = this.f27695V;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27695V = aVar;
                        }
                        aVar.mo30663a(C12551j.m39358a(disposable));
                        return;
                    }
                    this.f27694U = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.dispose();
        } else {
            this.f27697c.onSubscribe(disposable);
            mo30317o();
        }
    }

    public boolean test(Object obj) {
        return C12551j.m39365b(obj, this.f27697c);
    }
}
