package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.l */
/* compiled from: LottieTask */
public class C1212l<T> {

    /* renamed from: e */
    public static Executor f4549e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<C1208h<T>> f4550a;

    /* renamed from: b */
    private final Set<C1208h<Throwable>> f4551b;

    /* renamed from: c */
    private final Handler f4552c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile C1211k<T> f4553d;

    /* renamed from: com.airbnb.lottie.l$a */
    /* compiled from: LottieTask */
    class C1213a implements Runnable {
        C1213a() {
        }

        public void run() {
            if (C1212l.this.f4553d != null) {
                C1211k a = C1212l.this.f4553d;
                if (a.mo6125b() != null) {
                    C1212l.this.m6161a(a.mo6125b());
                } else {
                    C1212l.this.m6162a(a.mo6124a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.l$b */
    /* compiled from: LottieTask */
    private class C1214b extends FutureTask<C1211k<T>> {
        C1214b(Callable<C1211k<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C1212l.this.m6157a((C1211k) get());
                } catch (InterruptedException | ExecutionException e) {
                    C1212l.this.m6157a(new C1211k<>(e));
                }
            }
        }
    }

    public C1212l(Callable<C1211k<T>> callable) {
        this(callable, false);
    }

    /* renamed from: b */
    public synchronized C1212l<T> mo6129b(C1208h<T> hVar) {
        if (!(this.f4553d == null || this.f4553d.mo6125b() == null)) {
            hVar.mo6018a(this.f4553d.mo6125b());
        }
        this.f4550a.add(hVar);
        return this;
    }

    /* renamed from: c */
    public synchronized C1212l<T> mo6130c(C1208h<Throwable> hVar) {
        this.f4551b.remove(hVar);
        return this;
    }

    /* renamed from: d */
    public synchronized C1212l<T> mo6131d(C1208h<T> hVar) {
        this.f4550a.remove(hVar);
        return this;
    }

    C1212l(Callable<C1211k<T>> callable, boolean z) {
        this.f4550a = new LinkedHashSet(1);
        this.f4551b = new LinkedHashSet(1);
        this.f4552c = new Handler(Looper.getMainLooper());
        this.f4553d = null;
        if (z) {
            try {
                m6157a((C1211k) callable.call());
            } catch (Throwable th) {
                m6157a(new C1211k<>(th));
            }
        } else {
            f4549e.execute(new C1214b(callable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6157a(C1211k<T> kVar) {
        if (this.f4553d == null) {
            this.f4553d = kVar;
            m6156a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public synchronized C1212l<T> mo6128a(C1208h<Throwable> hVar) {
        if (!(this.f4553d == null || this.f4553d.mo6124a() == null)) {
            hVar.mo6018a(this.f4553d.mo6124a());
        }
        this.f4551b.add(hVar);
        return this;
    }

    /* renamed from: a */
    private void m6156a() {
        this.f4552c.post(new C1213a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m6161a(T t) {
        for (C1208h a : new ArrayList(this.f4550a)) {
            a.mo6018a(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m6162a(Throwable th) {
        ArrayList<C1208h> arrayList = new ArrayList<>(this.f4551b);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        for (C1208h a : arrayList) {
            a.mo6018a(th);
        }
    }
}
