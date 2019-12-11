package p163g.p201e.p203b.p275a0.p276k;

import p163g.p201e.p203b.p275a0.C7146a;
import p163g.p201e.p203b.p275a0.C7159g.C7160a;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;

/* renamed from: g.e.b.a0.k.e */
/* compiled from: RipcutRequest.kt */
public final class C7175e {

    /* renamed from: a */
    private final String f15857a;

    /* renamed from: b */
    private final Integer f15858b;

    /* renamed from: c */
    private final Integer f15859c;

    /* renamed from: d */
    private final C7160a f15860d;

    /* renamed from: e */
    private final Integer f15861e;

    /* renamed from: f */
    private final C7161b f15862f;

    /* renamed from: g */
    private final C7146a f15863g;

    public C7175e(String str, Integer num, Integer num2, C7160a aVar, Integer num3, C7161b bVar, C7146a aVar2) {
        this.f15857a = str;
        this.f15858b = num;
        this.f15859c = num2;
        this.f15860d = aVar;
        this.f15861e = num3;
        this.f15862f = bVar;
        this.f15863g = aVar2;
    }

    /* renamed from: a */
    public final C7160a mo20014a() {
        return this.f15860d;
    }

    /* renamed from: b */
    public final Integer mo20015b() {
        return this.f15861e;
    }

    /* renamed from: c */
    public final C7161b mo20016c() {
        return this.f15862f;
    }

    /* renamed from: d */
    public final Integer mo20017d() {
        return this.f15859c;
    }

    /* renamed from: e */
    public final C7146a mo20018e() {
        return this.f15863g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f15863g, (java.lang.Object) r3.f15863g) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof p163g.p201e.p203b.p275a0.p276k.C7175e
            if (r0 == 0) goto L_0x004f
            g.e.b.a0.k.e r3 = (p163g.p201e.p203b.p275a0.p276k.C7175e) r3
            java.lang.String r0 = r2.f15857a
            java.lang.String r1 = r3.f15857a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.f15858b
            java.lang.Integer r1 = r3.f15858b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.f15859c
            java.lang.Integer r1 = r3.f15859c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            g.e.b.a0.g$a r0 = r2.f15860d
            g.e.b.a0.g$a r1 = r3.f15860d
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.f15861e
            java.lang.Integer r1 = r3.f15861e
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            g.e.b.a0.g$b r0 = r2.f15862f
            g.e.b.a0.g$b r1 = r3.f15862f
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            g.e.b.a0.a r0 = r2.f15863g
            g.e.b.a0.a r3 = r3.f15863g
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p275a0.p276k.C7175e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo20020f() {
        return this.f15857a;
    }

    /* renamed from: g */
    public final Integer mo20021g() {
        return this.f15858b;
    }

    public int hashCode() {
        String str = this.f15857a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f15858b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f15859c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C7160a aVar = this.f15860d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Integer num3 = this.f15861e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        C7161b bVar = this.f15862f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C7146a aVar2 = this.f15863g;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RipcutRequest(masterId=");
        sb.append(this.f15857a);
        sb.append(", width=");
        sb.append(this.f15858b);
        sb.append(", height=");
        sb.append(this.f15859c);
        sb.append(", blurFilter=");
        sb.append(this.f15860d);
        sb.append(", blurRadius=");
        sb.append(this.f15861e);
        sb.append(", format=");
        sb.append(this.f15862f);
        sb.append(", imageType=");
        sb.append(this.f15863g);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7175e(java.lang.String r13, android.content.Context r14, p163g.p201e.p203b.p275a0.C7159g.C7162c r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r15.mo20006n()
            java.lang.String r1 = "resources"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000a:
            r6 = r0
            goto L_0x002d
        L_0x000c:
            java.lang.Integer r0 = r15.mo20007o()
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            float r0 = (float) r0
            android.content.res.Resources r4 = r14.getResources()
            kotlin.jvm.internal.C12880j.m40222a(r4, r1)
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r2, r0, r4)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x000a
        L_0x002c:
            r6 = r3
        L_0x002d:
            java.lang.Integer r0 = r15.mo20003k()
            if (r0 == 0) goto L_0x0035
            r7 = r0
            goto L_0x0057
        L_0x0035:
            java.lang.Integer r0 = r15.mo20004l()
            if (r0 == 0) goto L_0x0056
            int r0 = r0.intValue()
            float r0 = (float) r0
            android.content.res.Resources r14 = r14.getResources()
            kotlin.jvm.internal.C12880j.m40222a(r14, r1)
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = android.util.TypedValue.applyDimension(r2, r0, r14)
            int r14 = (int) r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7 = r14
            goto L_0x0057
        L_0x0056:
            r7 = r3
        L_0x0057:
            g.e.b.a0.g$a r8 = r15.mo19982a()
            java.lang.Integer r9 = r15.mo19989b()
            g.e.b.a0.g$b r14 = r15.mo19995e()
            g.e.b.a0.g$b r0 = p163g.p201e.p203b.p275a0.C7159g.C7161b.SOURCE
            if (r14 != r0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 != 0) goto L_0x006d
            r10 = r14
            goto L_0x006e
        L_0x006d:
            r10 = r3
        L_0x006e:
            g.e.b.a0.a r11 = r15.mo19997f()
            r4 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p275a0.p276k.C7175e.<init>(java.lang.String, android.content.Context, g.e.b.a0.g$c):void");
    }
}
