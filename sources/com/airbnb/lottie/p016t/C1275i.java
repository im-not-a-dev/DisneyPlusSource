package com.airbnb.lottie.p016t;

import p096e.p121h.p134r.C4112d;

/* renamed from: com.airbnb.lottie.t.i */
/* compiled from: MutablePair */
public class C1275i<T> {

    /* renamed from: a */
    T f4783a;

    /* renamed from: b */
    T f4784b;

    /* renamed from: b */
    private static boolean m6366b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public void mo6219a(T t, T t2) {
        this.f4783a = t;
        this.f4784b = t2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C4112d)) {
            return false;
        }
        C4112d dVar = (C4112d) obj;
        if (m6366b(dVar.f10379a, this.f4783a) && m6366b(dVar.f10380b, this.f4784b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        T t = this.f4783a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f4784b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f4783a));
        sb.append(" ");
        sb.append(String.valueOf(this.f4784b));
        sb.append("}");
        return sb.toString();
    }
}
