package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.C13708l;

/* renamed from: m.d.f.b.e.o */
/* compiled from: XMSSMTParameters */
public final class C14017o {

    /* renamed from: a */
    private final C14027u f31000a;

    /* renamed from: b */
    private final int f31001b;

    /* renamed from: c */
    private final int f31002c;

    public C14017o(int i, int i2, C13708l lVar) {
        this.f31001b = i;
        this.f31002c = i2;
        this.f31000a = new C14027u(m44236a(i, i2), lVar);
        C13999d.m44166b(mo35431a().mo34971a(), mo35432b(), mo35436f(), mo35435e(), mo35433c(), i2);
    }

    /* renamed from: a */
    private static int m44236a(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                return i3;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    /* renamed from: b */
    public int mo35432b() {
        return this.f31000a.mo35458b();
    }

    /* renamed from: c */
    public int mo35433c() {
        return this.f31001b;
    }

    /* renamed from: d */
    public int mo35434d() {
        return this.f31002c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo35435e() {
        return this.f31000a.mo35461e().mo35417b().mo35422c();
    }

    /* renamed from: f */
    public int mo35436f() {
        return this.f31000a.mo35462f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C14027u mo35437g() {
        return this.f31000a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13708l mo35431a() {
        return this.f31000a.mo35457a();
    }
}
