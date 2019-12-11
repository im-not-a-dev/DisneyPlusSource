package com.google.android.exoplayer2.p393v0;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.v0.z */
/* compiled from: PriorityTaskManager */
public final class C9575z {

    /* renamed from: a */
    private final Object f22340a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f22341b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f22342c = Integer.MIN_VALUE;

    /* renamed from: com.google.android.exoplayer2.v0.z$a */
    /* compiled from: PriorityTaskManager */
    public static class C9576a extends IOException {
        public C9576a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Priority too low [priority=");
            sb.append(i);
            sb.append(", highest=");
            sb.append(i2);
            sb.append("]");
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo24725a(int i) {
        synchronized (this.f22340a) {
            this.f22341b.add(Integer.valueOf(i));
            this.f22342c = Math.max(this.f22342c, i);
        }
    }

    /* renamed from: b */
    public void mo24726b(int i) throws InterruptedException {
        synchronized (this.f22340a) {
            while (this.f22342c != i) {
                this.f22340a.wait();
            }
        }
    }

    /* renamed from: c */
    public void mo24727c(int i) throws C9576a {
        synchronized (this.f22340a) {
            if (this.f22342c != i) {
                throw new C9576a(i, this.f22342c);
            }
        }
    }

    /* renamed from: d */
    public void mo24728d(int i) {
        int i2;
        synchronized (this.f22340a) {
            this.f22341b.remove(Integer.valueOf(i));
            if (this.f22341b.isEmpty()) {
                i2 = Integer.MIN_VALUE;
            } else {
                Object peek = this.f22341b.peek();
                C9554k0.m29394a(peek);
                i2 = ((Integer) peek).intValue();
            }
            this.f22342c = i2;
            this.f22340a.notifyAll();
        }
    }
}
