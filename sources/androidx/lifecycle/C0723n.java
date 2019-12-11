package androidx.lifecycle;

import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p096e.p105b.p106a.p108b.C3908a;

/* renamed from: androidx.lifecycle.n */
/* compiled from: LifecycleRegistry */
public class C0723n extends C0715i {

    /* renamed from: a */
    private C3908a<C0721l, C0725b> f3000a = new C3908a<>();

    /* renamed from: b */
    private C0717b f3001b;

    /* renamed from: c */
    private final WeakReference<C0722m> f3002c;

    /* renamed from: d */
    private int f3003d = 0;

    /* renamed from: e */
    private boolean f3004e = false;

    /* renamed from: f */
    private boolean f3005f = false;

    /* renamed from: g */
    private ArrayList<C0717b> f3006g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.n$a */
    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class C0724a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3007a = new int[C0716a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f3008b = new int[C0717b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C0715i.C0717b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3008b = r0
                r0 = 1
                int[] r1 = f3008b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$b r2 = androidx.lifecycle.C0715i.C0717b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f3008b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$b r3 = androidx.lifecycle.C0715i.C0717b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f3008b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$b r4 = androidx.lifecycle.C0715i.C0717b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f3008b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$b r5 = androidx.lifecycle.C0715i.C0717b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f3008b     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$b r6 = androidx.lifecycle.C0715i.C0717b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.lifecycle.i$a[] r5 = androidx.lifecycle.C0715i.C0716a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3007a = r5
                int[] r5 = f3007a     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.lifecycle.i$a r6 = androidx.lifecycle.C0715i.C0716a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.lifecycle.i$a r5 = androidx.lifecycle.C0715i.C0716a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x0067 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x007b }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x0086 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f3007a     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0723n.C0724a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.n$b */
    /* compiled from: LifecycleRegistry */
    static class C0725b {

        /* renamed from: a */
        C0717b f3009a;

        /* renamed from: b */
        C0720k f3010b;

        C0725b(C0721l lVar, C0717b bVar) {
            this.f3010b = C0728q.m3771a((Object) lVar);
            this.f3009a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4142a(C0722m mVar, C0716a aVar) {
            C0717b b = C0723n.m3753b(aVar);
            this.f3009a = C0723n.m3751a(this.f3009a, b);
            this.f3010b.mo330a(mVar, aVar);
            this.f3009a = b;
        }
    }

    public C0723n(C0722m mVar) {
        this.f3002c = new WeakReference<>(mVar);
        this.f3001b = C0717b.INITIALIZED;
    }

    /* renamed from: c */
    private C0717b m3757c(C0721l lVar) {
        Entry b = this.f3000a.mo13979b(lVar);
        C0717b bVar = null;
        C0717b bVar2 = b != null ? ((C0725b) b.getValue()).f3009a : null;
        if (!this.f3006g.isEmpty()) {
            ArrayList<C0717b> arrayList = this.f3006g;
            bVar = (C0717b) arrayList.get(arrayList.size() - 1);
        }
        return m3751a(m3751a(this.f3001b, bVar2), bVar);
    }

    /* renamed from: d */
    private void m3760d(C0717b bVar) {
        if (this.f3001b != bVar) {
            this.f3001b = bVar;
            if (this.f3004e || this.f3003d != 0) {
                this.f3005f = true;
                return;
            }
            this.f3004e = true;
            m3759d();
            this.f3004e = false;
        }
    }

    /* renamed from: e */
    private void m3761e(C0717b bVar) {
        this.f3006g.add(bVar);
    }

    /* renamed from: f */
    private static C0716a m3762f(C0717b bVar) {
        int i = C0724a.f3008b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0716a.ON_START;
            }
            if (i == 3) {
                return C0716a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C0716a.ON_CREATE;
    }

    @Deprecated
    /* renamed from: a */
    public void mo4140a(C0717b bVar) {
        mo4141b(bVar);
    }

    /* renamed from: b */
    public void mo4141b(C0717b bVar) {
        m3760d(bVar);
    }

    /* renamed from: b */
    private boolean m3755b() {
        boolean z = true;
        if (this.f3000a.size() == 0) {
            return true;
        }
        C0717b bVar = ((C0725b) this.f3000a.mo13984c().getValue()).f3009a;
        C0717b bVar2 = ((C0725b) this.f3000a.mo13986e().getValue()).f3009a;
        if (!(bVar == bVar2 && this.f3001b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo4139a(C0716a aVar) {
        m3760d(m3753b(aVar));
    }

    /* renamed from: a */
    public void mo4134a(C0721l lVar) {
        C0717b bVar = this.f3001b;
        C0717b bVar2 = C0717b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0717b.INITIALIZED;
        }
        C0725b bVar3 = new C0725b(lVar, bVar2);
        if (((C0725b) this.f3000a.mo13978b(lVar, bVar3)) == null) {
            C0722m mVar = (C0722m) this.f3002c.get();
            if (mVar != null) {
                boolean z = this.f3003d != 0 || this.f3004e;
                C0717b c = m3757c(lVar);
                this.f3003d++;
                while (bVar3.f3009a.compareTo(c) < 0 && this.f3000a.contains(lVar)) {
                    m3761e(bVar3.f3009a);
                    bVar3.mo4142a(mVar, m3762f(bVar3.f3009a));
                    m3758c();
                    c = m3757c(lVar);
                }
                if (!z) {
                    m3759d();
                }
                this.f3003d--;
            }
        }
    }

    /* renamed from: c */
    private void m3758c() {
        ArrayList<C0717b> arrayList = this.f3006g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private static C0716a m3756c(C0717b bVar) {
        int i = C0724a.f3008b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0716a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0716a.ON_STOP;
            }
            if (i == 4) {
                return C0716a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public void mo4135b(C0721l lVar) {
        this.f3000a.remove(lVar);
    }

    /* renamed from: b */
    static C0717b m3753b(C0716a aVar) {
        switch (C0724a.f3007a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0717b.CREATED;
            case 3:
            case 4:
                return C0717b.STARTED;
            case 5:
                return C0717b.RESUMED;
            case 6:
                return C0717b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private void m3759d() {
        C0722m mVar = (C0722m) this.f3002c.get();
        if (mVar != null) {
            while (!m3755b()) {
                this.f3005f = false;
                if (this.f3001b.compareTo(((C0725b) this.f3000a.mo13984c().getValue()).f3009a) < 0) {
                    m3752a(mVar);
                }
                Entry e = this.f3000a.mo13986e();
                if (!this.f3005f && e != null && this.f3001b.compareTo(((C0725b) e.getValue()).f3009a) > 0) {
                    m3754b(mVar);
                }
            }
            this.f3005f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: b */
    private void m3754b(C0722m mVar) {
        C3913d d = this.f3000a.mo13985d();
        while (d.hasNext() && !this.f3005f) {
            Entry entry = (Entry) d.next();
            C0725b bVar = (C0725b) entry.getValue();
            while (bVar.f3009a.compareTo(this.f3001b) < 0 && !this.f3005f && this.f3000a.contains(entry.getKey())) {
                m3761e(bVar.f3009a);
                bVar.mo4142a(mVar, m3762f(bVar.f3009a));
                m3758c();
            }
        }
    }

    /* renamed from: a */
    public C0717b mo4133a() {
        return this.f3001b;
    }

    /* renamed from: a */
    private void m3752a(C0722m mVar) {
        Iterator b = this.f3000a.mo13983b();
        while (b.hasNext() && !this.f3005f) {
            Entry entry = (Entry) b.next();
            C0725b bVar = (C0725b) entry.getValue();
            while (bVar.f3009a.compareTo(this.f3001b) > 0 && !this.f3005f && this.f3000a.contains(entry.getKey())) {
                C0716a c = m3756c(bVar.f3009a);
                m3761e(m3753b(c));
                bVar.mo4142a(mVar, c);
                m3758c();
            }
        }
    }

    /* renamed from: a */
    static C0717b m3751a(C0717b bVar, C0717b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
