package com.airbnb.lottie.p012r.p013b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.p016t.p018k.C1298h;
import com.airbnb.lottie.p016t.p018k.C1298h.C1299a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.r.b.l */
/* compiled from: MergePathsContent */
public class C1236l implements C1239n, C1234j {

    /* renamed from: a */
    private final Path f4637a = new Path();

    /* renamed from: b */
    private final Path f4638b = new Path();

    /* renamed from: c */
    private final Path f4639c = new Path();

    /* renamed from: d */
    private final List<C1239n> f4640d = new ArrayList();

    /* renamed from: e */
    private final C1298h f4641e;

    /* renamed from: com.airbnb.lottie.r.b.l$a */
    /* compiled from: MergePathsContent */
    static /* synthetic */ class C1237a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4642a = new int[C1299a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.airbnb.lottie.t.k.h$a[] r0 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4642a = r0
                int[] r0 = f4642a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.t.k.h$a r1 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.MERGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4642a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.t.k.h$a r1 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.ADD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4642a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.t.k.h$a r1 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4642a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.airbnb.lottie.t.k.h$a r1 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4642a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.airbnb.lottie.t.k.h$a r1 = com.airbnb.lottie.p016t.p018k.C1298h.C1299a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p012r.p013b.C1236l.C1237a.<clinit>():void");
        }
    }

    public C1236l(C1298h hVar) {
        if (VERSION.SDK_INT >= 19) {
            hVar.mo6273b();
            this.f4641e = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: a */
    public void mo6153a(ListIterator<C1227c> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            C1227c cVar = (C1227c) listIterator.previous();
            if (cVar instanceof C1239n) {
                this.f4640d.add((C1239n) cVar);
                listIterator.remove();
            }
        }
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        this.f4639c.reset();
        if (this.f4641e.mo6274c()) {
            return this.f4639c;
        }
        int i = C1237a.f4642a[this.f4641e.mo6272a().ordinal()];
        if (i == 1) {
            m6227a();
        } else if (i == 2) {
            m6228a(Op.UNION);
        } else if (i == 3) {
            m6228a(Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m6228a(Op.INTERSECT);
        } else if (i == 5) {
            m6228a(Op.XOR);
        }
        return this.f4639c;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < this.f4640d.size(); i++) {
            ((C1239n) this.f4640d.get(i)).mo6146a(list, list2);
        }
    }

    /* renamed from: a */
    private void m6227a() {
        for (int i = 0; i < this.f4640d.size(); i++) {
            this.f4639c.addPath(((C1239n) this.f4640d.get(i)).mo6152j0());
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m6228a(Op op) {
        this.f4638b.reset();
        this.f4637a.reset();
        for (int size = this.f4640d.size() - 1; size >= 1; size--) {
            C1239n nVar = (C1239n) this.f4640d.get(size);
            if (nVar instanceof C1228d) {
                C1228d dVar = (C1228d) nVar;
                List b = dVar.mo6150b();
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    Path j0 = ((C1239n) b.get(size2)).mo6152j0();
                    j0.transform(dVar.mo6151c());
                    this.f4638b.addPath(j0);
                }
            } else {
                this.f4638b.addPath(nVar.mo6152j0());
            }
        }
        C1239n nVar2 = (C1239n) this.f4640d.get(0);
        if (nVar2 instanceof C1228d) {
            C1228d dVar2 = (C1228d) nVar2;
            List b2 = dVar2.mo6150b();
            for (int i = 0; i < b2.size(); i++) {
                Path j02 = ((C1239n) b2.get(i)).mo6152j0();
                j02.transform(dVar2.mo6151c());
                this.f4637a.addPath(j02);
            }
        } else {
            this.f4637a.set(nVar2.mo6152j0());
        }
        this.f4639c.op(this.f4637a, this.f4638b, op);
    }
}
