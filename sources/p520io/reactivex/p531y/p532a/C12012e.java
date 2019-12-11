package p520io.reactivex.p531y.p532a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.a.e */
/* compiled from: ListCompositeDisposable */
public final class C12012e implements Disposable, C12009b {

    /* renamed from: U */
    volatile boolean f27740U;

    /* renamed from: c */
    List<Disposable> f27741c;

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
        C12036b.m38663a(disposable, "d is null");
        if (!this.f27740U) {
            synchronized (this) {
                if (!this.f27740U) {
                    List list = this.f27741c;
                    if (list == null) {
                        list = new LinkedList();
                        this.f27741c = list;
                    }
                    list.add(disposable);
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
            java.lang.String r0 = "Disposable item is null"
            p520io.reactivex.p531y.p533b.C12036b.m38663a(r3, r0)
            boolean r0 = r2.f27740U
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f27740U     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.f27741c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p532a.C12012e.mo30251c(io.reactivex.disposables.Disposable):boolean");
    }

    public void dispose() {
        if (!this.f27740U) {
            synchronized (this) {
                if (!this.f27740U) {
                    this.f27740U = true;
                    List<Disposable> list = this.f27741c;
                    this.f27741c = null;
                    mo30343a(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f27740U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30343a(List<Disposable> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (Disposable dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C12548h.m39353b((Throwable) arrayList.get(0));
            }
            throw new C11998a((Iterable<? extends Throwable>) arrayList);
        }
    }
}
