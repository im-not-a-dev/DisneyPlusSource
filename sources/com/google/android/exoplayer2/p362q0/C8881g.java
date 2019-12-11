package com.google.android.exoplayer2.p362q0;

import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p362q0.C8880f;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: com.google.android.exoplayer2.q0.g */
/* compiled from: SimpleDecoder */
public abstract class C8881g<I extends C8879e, O extends C8880f, E extends Exception> implements C8877c<I, O, E> {

    /* renamed from: a */
    private final Thread f19028a;

    /* renamed from: b */
    private final Object f19029b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f19030c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f19031d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f19032e;

    /* renamed from: f */
    private final O[] f19033f;

    /* renamed from: g */
    private int f19034g;

    /* renamed from: h */
    private int f19035h;

    /* renamed from: i */
    private I f19036i;

    /* renamed from: j */
    private E f19037j;

    /* renamed from: k */
    private boolean f19038k;

    /* renamed from: l */
    private boolean f19039l;

    /* renamed from: m */
    private int f19040m;

    /* renamed from: com.google.android.exoplayer2.q0.g$a */
    /* compiled from: SimpleDecoder */
    class C8882a extends Thread {
        C8882a() {
        }

        public void run() {
            C8881g.this.m25952j();
        }
    }

    protected C8881g(I[] iArr, O[] oArr) {
        this.f19032e = iArr;
        this.f19034g = iArr.length;
        for (int i = 0; i < this.f19034g; i++) {
            this.f19032e[i] = mo23233d();
        }
        this.f19033f = oArr;
        this.f19035h = oArr.length;
        for (int i2 = 0; i2 < this.f19035h; i2++) {
            this.f19033f[i2] = mo23234e();
        }
        this.f19028a = new C8882a();
        this.f19028a.start();
    }

    /* renamed from: f */
    private boolean m25948f() {
        return !this.f19030c.isEmpty() && this.f19035h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo23211d() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo23208b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo23210c() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo23208b(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.f19037j = mo23228a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r6.f19037j = mo23229a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6.f19037j = mo23229a((java.lang.Throwable) r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25949g() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f19029b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f19039l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m25948f()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f19029b     // Catch:{ all -> 0x0096 }
            r1.wait()     // Catch:{ all -> 0x0096 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f19039l     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f19030c     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0096 }
            com.google.android.exoplayer2.q0.e r1 = (com.google.android.exoplayer2.p362q0.C8879e) r1     // Catch:{ all -> 0x0096 }
            O[] r3 = r6.f19033f     // Catch:{ all -> 0x0096 }
            int r4 = r6.f19035h     // Catch:{ all -> 0x0096 }
            r5 = 1
            int r4 = r4 - r5
            r6.f19035h = r4     // Catch:{ all -> 0x0096 }
            r3 = r3[r4]     // Catch:{ all -> 0x0096 }
            boolean r4 = r6.f19038k     // Catch:{ all -> 0x0096 }
            r6.f19038k = r2     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r1.mo23211d()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo23208b(r0)
            goto L_0x0069
        L_0x003c:
            boolean r0 = r1.mo23210c()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo23208b(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.mo23228a(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            r6.f19037j = r0     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r0 = move-exception
            java.lang.Exception r0 = r6.mo23229a(r0)
            r6.f19037j = r0
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            java.lang.Exception r0 = r6.mo23229a(r0)
            r6.f19037j = r0
        L_0x005d:
            E r0 = r6.f19037j
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r6.f19029b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r1
        L_0x0069:
            java.lang.Object r4 = r6.f19029b
            monitor-enter(r4)
            boolean r0 = r6.f19038k     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0074
            r3.mo23227f()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0074:
            boolean r0 = r3.mo23210c()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0083
            int r0 = r6.f19040m     // Catch:{ all -> 0x0093 }
            int r0 = r0 + r5
            r6.f19040m = r0     // Catch:{ all -> 0x0093 }
            r3.mo23227f()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0083:
            int r0 = r6.f19040m     // Catch:{ all -> 0x0093 }
            r3.f19027V = r0     // Catch:{ all -> 0x0093 }
            r6.f19040m = r2     // Catch:{ all -> 0x0093 }
            java.util.ArrayDeque<O> r0 = r6.f19031d     // Catch:{ all -> 0x0093 }
            r0.addLast(r3)     // Catch:{ all -> 0x0093 }
        L_0x008e:
            r6.m25946b((I) r1)     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            return r5
        L_0x0093:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p362q0.C8881g.m25949g():boolean");
    }

    /* renamed from: h */
    private void m25950h() {
        if (m25948f()) {
            this.f19029b.notify();
        }
    }

    /* renamed from: i */
    private void m25951i() throws Exception {
        E e = this.f19037j;
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25952j() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m25949g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo23228a(I i, O o, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo23229a(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract I mo23233d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract O mo23234e();

    public final void flush() {
        synchronized (this.f19029b) {
            this.f19038k = true;
            this.f19040m = 0;
            if (this.f19036i != null) {
                m25946b(this.f19036i);
                this.f19036i = null;
            }
            while (!this.f19030c.isEmpty()) {
                m25946b((I) (C8879e) this.f19030c.removeFirst());
            }
            while (!this.f19031d.isEmpty()) {
                ((C8880f) this.f19031d.removeFirst()).mo23227f();
            }
        }
    }

    /* renamed from: b */
    public final O m25961b() throws Exception {
        synchronized (this.f19029b) {
            m25951i();
            if (this.f19031d.isEmpty()) {
                return null;
            }
            O o = (C8880f) this.f19031d.removeFirst();
            return o;
        }
    }

    /* renamed from: c */
    public final I m25963c() throws Exception {
        I i;
        I i2;
        synchronized (this.f19029b) {
            m25951i();
            Assertions.checkState(this.f19036i == null);
            if (this.f19034g == 0) {
                i = null;
            } else {
                I[] iArr = this.f19032e;
                int i3 = this.f19034g - 1;
                this.f19034g = i3;
                i = iArr[i3];
            }
            this.f19036i = i;
            i2 = this.f19036i;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23230a(int i) {
        Assertions.checkState(this.f19034g == this.f19032e.length);
        for (I f : this.f19032e) {
            f.mo23224f(i);
        }
    }

    /* renamed from: a */
    public final void mo23218a(I i) throws Exception {
        synchronized (this.f19029b) {
            m25951i();
            Assertions.checkArgument(i == this.f19036i);
            this.f19030c.addLast(i);
            m25950h();
            this.f19036i = null;
        }
    }

    /* renamed from: b */
    private void m25946b(I i) {
        i.mo23207b();
        I[] iArr = this.f19032e;
        int i2 = this.f19034g;
        this.f19034g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private void m25947b(O o) {
        o.mo23207b();
        O[] oArr = this.f19033f;
        int i = this.f19035h;
        this.f19035h = i + 1;
        oArr[i] = o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23232a(O o) {
        synchronized (this.f19029b) {
            m25947b(o);
            m25950h();
        }
    }

    /* renamed from: a */
    public void mo23217a() {
        synchronized (this.f19029b) {
            this.f19039l = true;
            this.f19029b.notify();
        }
        try {
            this.f19028a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
