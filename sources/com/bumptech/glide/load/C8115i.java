package com.bumptech.glide.load;

import java.security.MessageDigest;
import p096e.p113e.C3926a;
import p096e.p113e.C3941i;
import p163g.p413f.p414a.p424w.C10764b;

/* renamed from: com.bumptech.glide.load.i */
/* compiled from: Options */
public final class C8115i implements C8111g {

    /* renamed from: b */
    private final C3926a<C8112h<?>, Object> f17376b = new C10764b();

    /* renamed from: a */
    public void mo21163a(C8115i iVar) {
        this.f17376b.mo14149a((C3941i<? extends K, ? extends V>) iVar.f17376b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8115i)) {
            return false;
        }
        return this.f17376b.equals(((C8115i) obj).f17376b);
    }

    public int hashCode() {
        return this.f17376b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.f17376b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public <T> C8115i mo21161a(C8112h<T> hVar, T t) {
        this.f17376b.put(hVar, t);
        return this;
    }

    /* renamed from: a */
    public <T> T mo21162a(C8112h<T> hVar) {
        return this.f17376b.containsKey(hVar) ? this.f17376b.get(hVar) : hVar.mo21155a();
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f17376b.size(); i++) {
            m23540a((C8112h) this.f17376b.mo14151b(i), this.f17376b.mo14157d(i), messageDigest);
        }
    }

    /* renamed from: a */
    private static <T> void m23540a(C8112h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo21156a(obj, messageDigest);
    }
}
