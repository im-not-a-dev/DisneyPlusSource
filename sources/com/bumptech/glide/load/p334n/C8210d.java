package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8111g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.n.d */
/* compiled from: DataCacheKey */
final class C8210d implements C8111g {

    /* renamed from: b */
    private final C8111g f17526b;

    /* renamed from: c */
    private final C8111g f17527c;

    C8210d(C8111g gVar, C8111g gVar2) {
        this.f17526b = gVar;
        this.f17527c = gVar2;
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        this.f17526b.mo21152a(messageDigest);
        this.f17527c.mo21152a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8210d)) {
            return false;
        }
        C8210d dVar = (C8210d) obj;
        if (!this.f17526b.equals(dVar.f17526b) || !this.f17527c.equals(dVar.f17527c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f17526b.hashCode() * 31) + this.f17527c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.f17526b);
        sb.append(", signature=");
        sb.append(this.f17527c);
        sb.append('}');
        return sb.toString();
    }
}
