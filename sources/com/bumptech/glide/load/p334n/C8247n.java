package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8118l;
import java.security.MessageDigest;
import java.util.Map;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.n */
/* compiled from: EngineKey */
class C8247n implements C8111g {

    /* renamed from: b */
    private final Object f17667b;

    /* renamed from: c */
    private final int f17668c;

    /* renamed from: d */
    private final int f17669d;

    /* renamed from: e */
    private final Class<?> f17670e;

    /* renamed from: f */
    private final Class<?> f17671f;

    /* renamed from: g */
    private final C8111g f17672g;

    /* renamed from: h */
    private final Map<Class<?>, C8118l<?>> f17673h;

    /* renamed from: i */
    private final C8115i f17674i;

    /* renamed from: j */
    private int f17675j;

    C8247n(Object obj, C8111g gVar, int i, int i2, Map<Class<?>, C8118l<?>> map, Class<?> cls, Class<?> cls2, C8115i iVar) {
        C10774j.m34012a(obj);
        this.f17667b = obj;
        C10774j.m34013a(gVar, "Signature must not be null");
        this.f17672g = gVar;
        this.f17668c = i;
        this.f17669d = i2;
        C10774j.m34012a(map);
        this.f17673h = map;
        C10774j.m34013a(cls, "Resource class must not be null");
        this.f17670e = cls;
        C10774j.m34013a(cls2, "Transcode class must not be null");
        this.f17671f = cls2;
        C10774j.m34012a(iVar);
        this.f17674i = iVar;
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8247n)) {
            return false;
        }
        C8247n nVar = (C8247n) obj;
        if (!this.f17667b.equals(nVar.f17667b) || !this.f17672g.equals(nVar.f17672g) || this.f17669d != nVar.f17669d || this.f17668c != nVar.f17668c || !this.f17673h.equals(nVar.f17673h) || !this.f17670e.equals(nVar.f17670e) || !this.f17671f.equals(nVar.f17671f) || !this.f17674i.equals(nVar.f17674i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f17675j == 0) {
            this.f17675j = this.f17667b.hashCode();
            this.f17675j = (this.f17675j * 31) + this.f17672g.hashCode();
            this.f17675j = (this.f17675j * 31) + this.f17668c;
            this.f17675j = (this.f17675j * 31) + this.f17669d;
            this.f17675j = (this.f17675j * 31) + this.f17673h.hashCode();
            this.f17675j = (this.f17675j * 31) + this.f17670e.hashCode();
            this.f17675j = (this.f17675j * 31) + this.f17671f.hashCode();
            this.f17675j = (this.f17675j * 31) + this.f17674i.hashCode();
        }
        return this.f17675j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.f17667b);
        sb.append(", width=");
        sb.append(this.f17668c);
        sb.append(", height=");
        sb.append(this.f17669d);
        sb.append(", resourceClass=");
        sb.append(this.f17670e);
        sb.append(", transcodeClass=");
        sb.append(this.f17671f);
        sb.append(", signature=");
        sb.append(this.f17672g);
        sb.append(", hashCode=");
        sb.append(this.f17675j);
        sb.append(", transformations=");
        sb.append(this.f17673h);
        sb.append(", options=");
        sb.append(this.f17674i);
        sb.append('}');
        return sb.toString();
    }
}
