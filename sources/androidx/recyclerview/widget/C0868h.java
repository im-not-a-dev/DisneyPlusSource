package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import androidx.recyclerview.widget.RecyclerView.C0820v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p096e.p121h.p130o.C4070g;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: GapWorker */
final class C0868h implements Runnable {

    /* renamed from: X */
    static final ThreadLocal<C0868h> f3538X = new ThreadLocal<>();

    /* renamed from: Y */
    static Comparator<C0871c> f3539Y = new C0869a();

    /* renamed from: U */
    long f3540U;

    /* renamed from: V */
    long f3541V;

    /* renamed from: W */
    private ArrayList<C0871c> f3542W = new ArrayList<>();

    /* renamed from: c */
    ArrayList<RecyclerView> f3543c = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* compiled from: GapWorker */
    static class C0869a implements Comparator<C0871c> {
        C0869a() {
        }

        /* renamed from: a */
        public int compare(C0871c cVar, C0871c cVar2) {
            int i = 1;
            if ((cVar.f3551d == null) != (cVar2.f3551d == null)) {
                if (cVar.f3551d != null) {
                    i = -1;
                }
                return i;
            }
            boolean z = cVar.f3548a;
            if (z != cVar2.f3548a) {
                if (z) {
                    i = -1;
                }
                return i;
            }
            int i2 = cVar2.f3549b - cVar.f3549b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f3550c - cVar2.f3550c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* compiled from: GapWorker */
    static class C0870b implements C0811c {

        /* renamed from: a */
        int f3544a;

        /* renamed from: b */
        int f3545b;

        /* renamed from: c */
        int[] f3546c;

        /* renamed from: d */
        int f3547d;

        C0870b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5034a(RecyclerView recyclerView, boolean z) {
            this.f3547d = 0;
            int[] iArr = this.f3546c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0808o oVar = recyclerView.f3226i0;
            if (recyclerView.f3224h0 != null && oVar != null && oVar.mo4763x()) {
                if (z) {
                    if (!recyclerView.f3204W.mo4939c()) {
                        oVar.mo3844a(recyclerView.f3224h0.getItemCount(), (C0811c) this);
                    }
                } else if (!recyclerView.mo4473k()) {
                    oVar.mo3841a(this.f3544a, this.f3545b, recyclerView.f3210a1, (C0811c) this);
                }
                int i = this.f3547d;
                if (i > oVar.f3304m) {
                    oVar.f3304m = i;
                    oVar.f3305n = z;
                    recyclerView.f3200U.mo4830j();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5036b(int i, int i2) {
            this.f3544a = i;
            this.f3545b = i2;
        }

        /* renamed from: a */
        public void mo4770a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3547d * 2;
                int[] iArr = this.f3546c;
                if (iArr == null) {
                    this.f3546c = new int[4];
                    Arrays.fill(this.f3546c, -1);
                } else if (i3 >= iArr.length) {
                    this.f3546c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f3546c, 0, iArr.length);
                }
                int[] iArr2 = this.f3546c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f3547d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5035a(int i) {
            if (this.f3546c != null) {
                int i2 = this.f3547d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3546c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5033a() {
            int[] iArr = this.f3546c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3547d = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* compiled from: GapWorker */
    static class C0871c {

        /* renamed from: a */
        public boolean f3548a;

        /* renamed from: b */
        public int f3549b;

        /* renamed from: c */
        public int f3550c;

        /* renamed from: d */
        public RecyclerView f3551d;

        /* renamed from: e */
        public int f3552e;

        C0871c() {
        }

        /* renamed from: a */
        public void mo5037a() {
            this.f3548a = false;
            this.f3549b = 0;
            this.f3550c = 0;
            this.f3551d = null;
            this.f3552e = 0;
        }
    }

    C0868h() {
    }

    /* renamed from: a */
    public void mo5027a(RecyclerView recyclerView) {
        this.f3543c.add(recyclerView);
    }

    /* renamed from: b */
    public void mo5029b(RecyclerView recyclerView) {
        this.f3543c.remove(recyclerView);
    }

    public void run() {
        try {
            C4070g.m13983a("RV Prefetch");
            if (!this.f3543c.isEmpty()) {
                int size = this.f3543c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3543c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5026a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3541V);
                    this.f3540U = 0;
                    C4070g.m13982a();
                }
            }
        } finally {
            this.f3540U = 0;
            C4070g.m13982a();
        }
    }

    /* renamed from: b */
    private void m4844b(long j) {
        int i = 0;
        while (i < this.f3542W.size()) {
            C0871c cVar = (C0871c) this.f3542W.get(i);
            if (cVar.f3551d != null) {
                m4842a(cVar, j);
                cVar.mo5037a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5028a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3540U == 0) {
            this.f3540U = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3208Z0.mo5036b(i, i2);
    }

    /* renamed from: a */
    private void m4840a() {
        C0871c cVar;
        int size = this.f3543c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f3543c.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3208Z0.mo5034a(recyclerView, false);
                i += recyclerView.f3208Z0.f3547d;
            }
        }
        this.f3542W.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3543c.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0870b bVar = recyclerView2.f3208Z0;
                int abs = Math.abs(bVar.f3544a) + Math.abs(bVar.f3545b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f3547d * 2; i6 += 2) {
                    if (i5 >= this.f3542W.size()) {
                        cVar = new C0871c();
                        this.f3542W.add(cVar);
                    } else {
                        cVar = (C0871c) this.f3542W.get(i5);
                    }
                    int i7 = bVar.f3546c[i6 + 1];
                    cVar.f3548a = i7 <= abs;
                    cVar.f3549b = abs;
                    cVar.f3550c = i7;
                    cVar.f3551d = recyclerView2;
                    cVar.f3552e = bVar.f3546c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3542W, f3539Y);
    }

    /* renamed from: a */
    static boolean m4843a(RecyclerView recyclerView, int i) {
        int b = recyclerView.f3209a0.mo4960b();
        for (int i2 = 0; i2 < b; i2++) {
            C0794d0 m = RecyclerView.m4118m(recyclerView.f3209a0.mo4966d(i2));
            if (m.mPosition == i && !m.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C0794d0 m4839a(RecyclerView recyclerView, int i, long j) {
        if (m4843a(recyclerView, i)) {
            return null;
        }
        C0820v vVar = recyclerView.f3200U;
        try {
            recyclerView.mo4492r();
            C0794d0 a = vVar.mo4798a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    vVar.mo4806a(a, false);
                } else {
                    vVar.mo4813b(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.mo4387a(false);
        }
    }

    /* renamed from: a */
    private void m4841a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3253z0 && recyclerView.f3209a0.mo4960b() != 0) {
                recyclerView.mo4522u();
            }
            C0870b bVar = recyclerView.f3208Z0;
            bVar.mo5034a(recyclerView, true);
            if (bVar.f3547d != 0) {
                try {
                    C4070g.m13983a("RV Nested Prefetch");
                    recyclerView.f3210a1.mo4529a(recyclerView.f3224h0);
                    for (int i = 0; i < bVar.f3547d * 2; i += 2) {
                        m4839a(recyclerView, bVar.f3546c[i], j);
                    }
                } finally {
                    C4070g.m13982a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m4842a(C0871c cVar, long j) {
        C0794d0 a = m4839a(cVar.f3551d, cVar.f3552e, cVar.f3548a ? Long.MAX_VALUE : j);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m4841a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5026a(long j) {
        m4840a();
        m4844b(j);
    }
}
