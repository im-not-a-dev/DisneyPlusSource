package com.bumptech.glide.load.p334n.p335a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.n.a0.c */
/* compiled from: AttributeStrategy */
class C8155c implements C8171l {

    /* renamed from: a */
    private final C8157b f17429a = new C8157b();

    /* renamed from: b */
    private final C8162h<C8156a, Bitmap> f17430b = new C8162h<>();

    /* renamed from: com.bumptech.glide.load.n.a0.c$a */
    /* compiled from: AttributeStrategy */
    static class C8156a implements C8172m {

        /* renamed from: a */
        private final C8157b f17431a;

        /* renamed from: b */
        private int f17432b;

        /* renamed from: c */
        private int f17433c;

        /* renamed from: d */
        private Config f17434d;

        public C8156a(C8157b bVar) {
            this.f17431a = bVar;
        }

        /* renamed from: a */
        public void mo21233a(int i, int i2, Config config) {
            this.f17432b = i;
            this.f17433c = i2;
            this.f17434d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8156a)) {
                return false;
            }
            C8156a aVar = (C8156a) obj;
            if (this.f17432b == aVar.f17432b && this.f17433c == aVar.f17433c && this.f17434d == aVar.f17434d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f17432b * 31) + this.f17433c) * 31;
            Config config = this.f17434d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8155c.m23652c(this.f17432b, this.f17433c, this.f17434d);
        }

        /* renamed from: a */
        public void mo21232a() {
            this.f17431a.mo21239a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.c$b */
    /* compiled from: AttributeStrategy */
    static class C8157b extends C8158d<C8156a> {
        C8157b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8156a mo21238a(int i, int i2, Config config) {
            C8156a aVar = (C8156a) mo21240b();
            aVar.mo21233a(i, i2, config);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8156a m23664a() {
            return new C8156a(this);
        }
    }

    C8155c() {
    }

    /* renamed from: d */
    private static String m23653d(Bitmap bitmap) {
        return m23652c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public void mo21227a(Bitmap bitmap) {
        this.f17430b.mo21249a(this.f17429a.mo21238a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public String mo21229b(int i, int i2, Config config) {
        return m23652c(i, i2, config);
    }

    /* renamed from: c */
    public String mo21230c(Bitmap bitmap) {
        return m23653d(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f17430b);
        return sb.toString();
    }

    /* renamed from: c */
    static String m23652c(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: b */
    public int mo21228b(Bitmap bitmap) {
        return C10775k.m34022a(bitmap);
    }

    /* renamed from: a */
    public Bitmap mo21226a(int i, int i2, Config config) {
        return (Bitmap) this.f17430b.mo21248a(this.f17429a.mo21238a(i, i2, config));
    }

    /* renamed from: a */
    public Bitmap mo21225a() {
        return (Bitmap) this.f17430b.mo21247a();
    }
}
