package p163g.p449j.p487c.p490y.p491l;

import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p489x.C11575b;
import p163g.p449j.p487c.p490y.C11584c;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.d */
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
public final class C11627d implements C11573w {

    /* renamed from: c */
    private final C11584c f27102c;

    public C11627d(C11584c cVar) {
        this.f27102c = cVar;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        C11575b bVar = (C11575b) aVar.mo29701a().getAnnotation(C11575b.class);
        if (bVar == null) {
            return null;
        }
        return mo29652a(this.f27102c, fVar, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [g.j.c.v<?>, g.j.c.v] */
    /* JADX WARNING: type inference failed for: r9v13, types: [g.j.c.v] */
    /* JADX WARNING: type inference failed for: r9v14, types: [g.j.c.v] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p163g.p449j.p487c.C11571v<?> mo29652a(p163g.p449j.p487c.p490y.C11584c r9, p163g.p449j.p487c.C11547f r10, p163g.p449j.p487c.p493z.C11689a<?> r11, p163g.p449j.p487c.p489x.C11575b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            g.j.c.z.a r0 = p163g.p449j.p487c.p493z.C11689a.m37636a(r0)
            g.j.c.y.h r9 = r9.mo29591a(r0)
            java.lang.Object r9 = r9.mo29593a()
            boolean r0 = r9 instanceof p163g.p449j.p487c.C11571v
            if (r0 == 0) goto L_0x0017
            g.j.c.v r9 = (p163g.p449j.p487c.C11571v) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof p163g.p449j.p487c.C11573w
            if (r0 == 0) goto L_0x0022
            g.j.c.w r9 = (p163g.p449j.p487c.C11573w) r9
            g.j.c.v r9 = r9.mo16202a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof p163g.p449j.p487c.C11566s
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof p163g.p449j.p487c.C11558k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            g.j.c.s r0 = (p163g.p449j.p487c.C11566s) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof p163g.p449j.p487c.C11558k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            g.j.c.k r1 = (p163g.p449j.p487c.C11558k) r1
        L_0x006b:
            r4 = r1
            g.j.c.y.l.l r9 = new g.j.c.y.l.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            g.j.c.v r9 = r9.mo29567a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.p491l.C11627d.mo29652a(g.j.c.y.c, g.j.c.f, g.j.c.z.a, g.j.c.x.b):g.j.c.v");
    }
}
