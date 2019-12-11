package p163g.p174d.p178b.p179a0;

import kotlin.jvm.internal.C12880j;

/* renamed from: g.d.b.a0.f */
/* compiled from: BifSpec.kt */
public final class C4831f {

    /* renamed from: a */
    private final String f11989a;

    /* renamed from: b */
    private final int f11990b;

    /* renamed from: c */
    private final int f11991c;

    /* renamed from: d */
    private final int f11992d;

    /* renamed from: e */
    private final int f11993e;

    public C4831f(String str, int i, int i2, int i3, int i4) {
        this.f11989a = str;
        this.f11990b = i;
        this.f11991c = i2;
        this.f11992d = i3;
        this.f11993e = i4;
    }

    /* renamed from: a */
    public final int mo16239a() {
        return this.f11991c;
    }

    /* renamed from: b */
    public final String mo16240b() {
        return this.f11989a;
    }

    /* renamed from: c */
    public final int mo16241c() {
        return this.f11990b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4831f) {
                C4831f fVar = (C4831f) obj;
                if (C12880j.m40224a((Object) this.f11989a, (Object) fVar.f11989a)) {
                    if (this.f11990b == fVar.f11990b) {
                        if (this.f11991c == fVar.f11991c) {
                            if (this.f11992d == fVar.f11992d) {
                                if (this.f11993e == fVar.f11993e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11989a;
        return ((((((((str != null ? str.hashCode() : 0) * 31) + this.f11990b) * 31) + this.f11991c) * 31) + this.f11992d) * 31) + this.f11993e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BifSpec(filename=");
        sb.append(this.f11989a);
        sb.append(", startTimeMs=");
        sb.append(this.f11990b);
        sb.append(", endTimeMs=");
        sb.append(this.f11991c);
        sb.append(", width=");
        sb.append(this.f11992d);
        sb.append(", height=");
        sb.append(this.f11993e);
        sb.append(")");
        return sb.toString();
    }
}
