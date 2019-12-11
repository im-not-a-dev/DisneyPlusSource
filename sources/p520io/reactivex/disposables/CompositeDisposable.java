package p520io.reactivex.disposables;

import java.util.ArrayList;
import java.util.List;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12009b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12548h;
import p520io.reactivex.p531y.p547j.C12555k;

/* renamed from: io.reactivex.disposables.CompositeDisposable */
public final class CompositeDisposable implements Disposable, C12009b {

    /* renamed from: U */
    volatile boolean f27611U;

    /* renamed from: c */
    C12555k<Disposable> f27612c;

    /* renamed from: a */
    public boolean mo30249a(Disposable disposable) {
        if (!mo30251c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    /* renamed from: b */
    public boolean mo30250b(Disposable disposable) {
        C12036b.m38663a(disposable, "disposable is null");
        if (!this.f27611U) {
            synchronized (this) {
                if (!this.f27611U) {
                    C12555k<Disposable> kVar = this.f27612c;
                    if (kVar == null) {
                        kVar = new C12555k<>();
                        this.f27612c = kVar;
                    }
                    kVar.mo30678a(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo30251c(p520io.reactivex.disposables.Disposable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            p520io.reactivex.p531y.p533b.C12036b.m38663a(r3, r0)
            boolean r0 = r2.f27611U
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f27611U     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            io.reactivex.y.j.k<io.reactivex.disposables.Disposable> r0 = r2.f27612c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo30681b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.disposables.CompositeDisposable.mo30251c(io.reactivex.disposables.Disposable):boolean");
    }

    public void dispose() {
        if (!this.f27611U) {
            synchronized (this) {
                if (!this.f27611U) {
                    this.f27611U = true;
                    C12555k<Disposable> kVar = this.f27612c;
                    this.f27612c = null;
                    mo30248a(kVar);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f27611U;
    }

    /* renamed from: a */
    public void mo30247a() {
        if (!this.f27611U) {
            synchronized (this) {
                if (!this.f27611U) {
                    C12555k<Disposable> kVar = this.f27612c;
                    this.f27612c = null;
                    mo30248a(kVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30248a(C12555k<Disposable> kVar) {
        Object[] a;
        if (kVar != null) {
            List list = null;
            for (Object obj : kVar.mo30679a()) {
                if (obj instanceof Disposable) {
                    try {
                        ((Disposable) obj).dispose();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C12548h.m39353b((Throwable) list.get(0));
            }
            throw new C11998a((Iterable<? extends Throwable>) list);
        }
    }
}
