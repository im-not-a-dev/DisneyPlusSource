package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.util.ArrayList;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11603g;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.h */
/* compiled from: ObjectTypeAdapter */
public final class C11634h extends C11571v<Object> {

    /* renamed from: b */
    public static final C11573w f27119b = new C11635a();

    /* renamed from: a */
    private final C11547f f27120a;

    /* renamed from: g.j.c.y.l.h$a */
    /* compiled from: ObjectTypeAdapter */
    static class C11635a implements C11573w {
        C11635a() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() == Object.class) {
                return new C11634h(fVar);
            }
            return null;
        }
    }

    /* renamed from: g.j.c.y.l.h$b */
    /* compiled from: ObjectTypeAdapter */
    static /* synthetic */ class C11636b {

        /* renamed from: a */
        static final /* synthetic */ int[] f27121a = new int[C11535b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                g.j.c.a0.b[] r0 = p163g.p449j.p487c.p488a0.C11535b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27121a = r0
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27121a     // Catch:{ NoSuchFieldError -> 0x004b }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.p491l.C11634h.C11636b.<clinit>():void");
        }
    }

    C11634h(C11547f fVar) {
        this.f27120a = fVar;
    }

    /* renamed from: a */
    public Object mo29458a(C11533a aVar) throws IOException {
        switch (C11636b.f27121a[aVar.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo29462a();
                while (aVar.mo29469f()) {
                    arrayList.add(mo29458a(aVar));
                }
                aVar.mo29467d();
                return arrayList;
            case 2:
                C11603g gVar = new C11603g();
                aVar.mo29464b();
                while (aVar.mo29469f()) {
                    gVar.put(aVar.mo29477m(), mo29458a(aVar));
                }
                aVar.mo29468e();
                return gVar;
            case 3:
                return aVar.mo29479o();
            case 4:
                return Double.valueOf(aVar.mo29473j());
            case 5:
                return Boolean.valueOf(aVar.mo29472i());
            case 6:
                aVar.mo29478n();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo29459a(C11536c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo29503h();
            return;
        }
        C11571v a = this.f27120a.mo29511a(obj.getClass());
        if (a instanceof C11634h) {
            cVar.mo29489b();
            cVar.mo29494d();
            return;
        }
        a.mo29459a(cVar, obj);
    }
}
