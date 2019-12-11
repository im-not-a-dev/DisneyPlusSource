package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p163g.p413f.p414a.p424w.C10771g;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.n.x */
/* compiled from: ResourceCacheKey */
final class C8260x implements C8111g {

    /* renamed from: j */
    private static final C10771g<Class<?>, byte[]> f17711j = new C10771g<>(50);

    /* renamed from: b */
    private final C8154b f17712b;

    /* renamed from: c */
    private final C8111g f17713c;

    /* renamed from: d */
    private final C8111g f17714d;

    /* renamed from: e */
    private final int f17715e;

    /* renamed from: f */
    private final int f17716f;

    /* renamed from: g */
    private final Class<?> f17717g;

    /* renamed from: h */
    private final C8115i f17718h;

    /* renamed from: i */
    private final C8118l<?> f17719i;

    C8260x(C8154b bVar, C8111g gVar, C8111g gVar2, int i, int i2, C8118l<?> lVar, Class<?> cls, C8115i iVar) {
        this.f17712b = bVar;
        this.f17713c = gVar;
        this.f17714d = gVar2;
        this.f17715e = i;
        this.f17716f = i2;
        this.f17719i = lVar;
        this.f17717g = cls;
        this.f17718h = iVar;
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f17712b.mo21220a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f17715e).putInt(this.f17716f).array();
        this.f17714d.mo21152a(messageDigest);
        this.f17713c.mo21152a(messageDigest);
        messageDigest.update(bArr);
        C8118l<?> lVar = this.f17719i;
        if (lVar != null) {
            lVar.mo21152a(messageDigest);
        }
        this.f17718h.mo21152a(messageDigest);
        messageDigest.update(m24005a());
        this.f17712b.mo21223a(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8260x)) {
            return false;
        }
        C8260x xVar = (C8260x) obj;
        if (this.f17716f != xVar.f17716f || this.f17715e != xVar.f17715e || !C10775k.m34034b((Object) this.f17719i, (Object) xVar.f17719i) || !this.f17717g.equals(xVar.f17717g) || !this.f17713c.equals(xVar.f17713c) || !this.f17714d.equals(xVar.f17714d) || !this.f17718h.equals(xVar.f17718h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f17713c.hashCode() * 31) + this.f17714d.hashCode()) * 31) + this.f17715e) * 31) + this.f17716f;
        C8118l<?> lVar = this.f17719i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f17717g.hashCode()) * 31) + this.f17718h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.f17713c);
        sb.append(", signature=");
        sb.append(this.f17714d);
        sb.append(", width=");
        sb.append(this.f17715e);
        sb.append(", height=");
        sb.append(this.f17716f);
        sb.append(", decodedResourceClass=");
        sb.append(this.f17717g);
        sb.append(", transformation='");
        sb.append(this.f17719i);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.f17718h);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private byte[] m24005a() {
        byte[] bArr = (byte[]) f17711j.mo27803a(this.f17717g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f17717g.getName().getBytes(C8111g.f17370a);
        f17711j.mo27807b(this.f17717g, bytes);
        return bytes;
    }
}
