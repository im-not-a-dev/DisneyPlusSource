package p602m.p613d.p662f.p664b.p667c;

import p602m.p613d.p662f.p664b.p667c.p668b.C13993a;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.b.c.a */
/* compiled from: Layer */
public class C13992a {

    /* renamed from: a */
    private int f30928a;

    /* renamed from: b */
    private int f30929b;

    /* renamed from: c */
    private int f30930c = (this.f30929b - this.f30928a);

    /* renamed from: d */
    private short[][][] f30931d;

    /* renamed from: e */
    private short[][][] f30932e;

    /* renamed from: f */
    private short[][] f30933f;

    /* renamed from: g */
    private short[] f30934g;

    public C13992a(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        this.f30928a = b & 255;
        this.f30929b = b2 & 255;
        this.f30931d = sArr;
        this.f30932e = sArr2;
        this.f30933f = sArr3;
        this.f30934g = sArr4;
    }

    /* renamed from: a */
    public short[][][] mo35360a() {
        return this.f30931d;
    }

    /* renamed from: b */
    public short[][][] mo35361b() {
        return this.f30932e;
    }

    /* renamed from: c */
    public short[] mo35362c() {
        return this.f30934g;
    }

    /* renamed from: d */
    public short[][] mo35363d() {
        return this.f30933f;
    }

    /* renamed from: e */
    public int mo35364e() {
        return this.f30930c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13992a)) {
            return false;
        }
        C13992a aVar = (C13992a) obj;
        if (this.f30928a != aVar.mo35366f() || this.f30929b != aVar.mo35367g() || this.f30930c != aVar.mo35364e() || !C13993a.m44134a(this.f30931d, aVar.mo35360a()) || !C13993a.m44134a(this.f30932e, aVar.mo35361b()) || !C13993a.m44133a(this.f30933f, aVar.mo35363d()) || !C13993a.m44132a(this.f30934g, aVar.mo35362c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo35366f() {
        return this.f30928a;
    }

    /* renamed from: g */
    public int mo35367g() {
        return this.f30929b;
    }

    public int hashCode() {
        return (((((((((((this.f30928a * 37) + this.f30929b) * 37) + this.f30930c) * 37) + C14079a.m44444a(this.f30931d)) * 37) + C14079a.m44444a(this.f30932e)) * 37) + C14079a.m44443a(this.f30933f)) * 37) + C14079a.m44460b(this.f30934g);
    }
}
