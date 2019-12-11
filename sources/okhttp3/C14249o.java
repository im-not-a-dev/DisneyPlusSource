package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.o */
/* compiled from: Dispatcher */
public final class C14249o {

    /* renamed from: a */
    private int f31801a = 64;

    /* renamed from: b */
    private int f31802b = 5;

    /* renamed from: c */
    private Runnable f31803c;

    /* renamed from: d */
    private ExecutorService f31804d;

    /* renamed from: e */
    private final Deque<C14261a> f31805e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C14261a> f31806f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C14260w> f31807g = new ArrayDeque();

    /* renamed from: c */
    private boolean m45421c() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f31805e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14261a aVar = (C14261a) it.next();
                if (this.f31806f.size() >= this.f31801a) {
                    break;
                } else if (aVar.mo36272c().get() < this.f31802b) {
                    it.remove();
                    aVar.mo36272c().incrementAndGet();
                    arrayList.add(aVar);
                    this.f31806f.add(aVar);
                }
            }
            z = mo36211b() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C14261a) arrayList.get(i)).mo36270a(mo36208a());
        }
        return z;
    }

    /* renamed from: a */
    public synchronized ExecutorService mo36208a() {
        if (this.f31804d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14126e.m44827a("OkHttp Dispatcher", false));
            this.f31804d = threadPoolExecutor;
        }
        return this.f31804d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36212b(C14261a aVar) {
        aVar.mo36272c().decrementAndGet();
        m45420a(this.f31806f, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36213b(C14260w wVar) {
        m45420a(this.f31807g, wVar);
    }

    /* renamed from: b */
    public synchronized int mo36211b() {
        return this.f31806f.size() + this.f31807g.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36209a(C14261a aVar) {
        synchronized (this) {
            this.f31805e.add(aVar);
            if (!aVar.mo36273d().f31830W) {
                C14261a a = m45419a(aVar.mo36274e());
                if (a != null) {
                    aVar.mo36271a(a);
                }
            }
        }
        m45421c();
    }

    /* renamed from: a */
    private C14261a m45419a(String str) {
        for (C14261a aVar : this.f31806f) {
            if (aVar.mo36274e().equals(str)) {
                return aVar;
            }
        }
        for (C14261a aVar2 : this.f31805e) {
            if (aVar2.mo36274e().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo36210a(C14260w wVar) {
        this.f31807g.add(wVar);
    }

    /* renamed from: a */
    private <T> void m45420a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f31803c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m45421c() && runnable != null) {
            runnable.run();
        }
    }
}
