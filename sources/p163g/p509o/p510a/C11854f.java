package p163g.p509o.p510a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: g.o.a.f */
/* compiled from: NestedGroup */
public abstract class C11854f implements C11847b, C11852d {

    /* renamed from: c */
    private final C11856b f27509c = new C11856b();

    /* renamed from: g.o.a.f$b */
    /* compiled from: NestedGroup */
    private static class C11856b {

        /* renamed from: a */
        final List<C11852d> f27510a;

        private C11856b() {
            this.f27510a = new ArrayList();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30000a(C11847b bVar, int i, int i2, Object obj) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29960a(bVar, i, i2, obj);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30003b(C11847b bVar, int i, int i2) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29959a(bVar, i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30005c(C11847b bVar, int i, int i2) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29969b(bVar, i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29998a(C11847b bVar, int i) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29958a(bVar, i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30004b(C11852d dVar) {
            synchronized (this.f27510a) {
                this.f27510a.remove(this.f27510a.indexOf(dVar));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30001a(C11847b bVar, int i, Object obj) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29961a(bVar, i, obj);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29999a(C11847b bVar, int i, int i2) {
            for (int size = this.f27510a.size() - 1; size >= 0; size--) {
                ((C11852d) this.f27510a.get(size)).mo29973c(bVar, i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30002a(C11852d dVar) {
            synchronized (this.f27510a) {
                if (!this.f27510a.contains(dVar)) {
                    this.f27510a.add(dVar);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Observer ");
                    sb.append(dVar);
                    sb.append(" is already registered.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public abstract int mo29986a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29987a(C11847b bVar) {
        return mo29992b(mo29993b(bVar));
    }

    /* renamed from: a */
    public abstract C11847b mo29988a(int i);

    /* renamed from: b */
    public abstract int mo29993b(C11847b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo29994b(Collection<? extends C11847b> collection) {
        int i = 0;
        for (C11847b itemCount : collection) {
            i += itemCount.getItemCount();
        }
        return i;
    }

    /* renamed from: c */
    public void mo29997c(Collection<? extends C11847b> collection) {
        for (C11847b unregisterGroupDataObserver : collection) {
            unregisterGroupDataObserver.unregisterGroupDataObserver(this);
        }
    }

    public C11853e getItem(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < mo29986a()) {
            C11847b a = mo29988a(i2);
            int itemCount = a.getItemCount() + i3;
            if (itemCount > i) {
                return a.getItem(i - i3);
            }
            i2++;
            i3 = itemCount;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wanted item at ");
        sb.append(i);
        sb.append(" but there are only ");
        sb.append(getItemCount());
        sb.append(" items");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemCount() {
        int i = 0;
        for (int i2 = 0; i2 < mo29986a(); i2++) {
            i += mo29988a(i2).getItemCount();
        }
        return i;
    }

    public final void registerGroupDataObserver(C11852d dVar) {
        this.f27509c.mo30002a(dVar);
    }

    public void unregisterGroupDataObserver(C11852d dVar) {
        this.f27509c.mo30004b(dVar);
    }

    /* renamed from: a */
    public void mo29991a(Collection<? extends C11847b> collection) {
        for (C11847b registerGroupDataObserver : collection) {
            registerGroupDataObserver.registerGroupDataObserver(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo29992b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += mo29988a(i3).getItemCount();
        }
        return i2;
    }

    /* renamed from: c */
    public void mo29973c(C11847b bVar, int i, int i2) {
        int a = mo29987a(bVar);
        this.f27509c.mo29999a((C11847b) this, i + a, a + i2);
    }

    /* renamed from: a */
    public void mo29958a(C11847b bVar, int i) {
        this.f27509c.mo29998a(this, mo29987a(bVar) + i);
    }

    /* renamed from: b */
    public void mo29969b(C11847b bVar, int i, int i2) {
        this.f27509c.mo30005c(this, mo29987a(bVar) + i, i2);
    }

    /* renamed from: c */
    public void mo29996c(int i, int i2) {
        this.f27509c.mo30005c(this, i, i2);
    }

    /* renamed from: a */
    public void mo29961a(C11847b bVar, int i, Object obj) {
        this.f27509c.mo30001a((C11847b) this, mo29987a(bVar) + i, obj);
    }

    /* renamed from: b */
    public void mo29995b(int i, int i2) {
        this.f27509c.mo30003b(this, i, i2);
    }

    /* renamed from: a */
    public void mo29960a(C11847b bVar, int i, int i2, Object obj) {
        this.f27509c.mo30000a(this, mo29987a(bVar) + i, i2, obj);
    }

    /* renamed from: a */
    public void mo29959a(C11847b bVar, int i, int i2) {
        this.f27509c.mo30003b(this, mo29987a(bVar) + i, i2);
    }

    /* renamed from: a */
    public void mo29989a(int i, int i2) {
        this.f27509c.mo29999a((C11847b) this, i, i2);
    }

    /* renamed from: a */
    public void mo29990a(int i, int i2, Object obj) {
        this.f27509c.mo30000a(this, i, i2, obj);
    }
}
