package com.google.common.collect;

import com.google.common.base.C10368c;
import com.google.common.base.C10373e;
import com.google.common.base.C10374f;
import java.io.Serializable;

/* renamed from: com.google.common.collect.b */
/* compiled from: ByFunctionOrdering */
final class C10380b<F, T> extends C10398n<F> implements Serializable {

    /* renamed from: U */
    final C10398n<T> f24688U;

    /* renamed from: c */
    final C10368c<F, ? extends T> f24689c;

    C10380b(C10368c<F, ? extends T> cVar, C10398n<T> nVar) {
        C10374f.m32809a(cVar);
        this.f24689c = cVar;
        C10374f.m32809a(nVar);
        this.f24688U = nVar;
    }

    public int compare(F f, F f2) {
        return this.f24688U.compare(this.f24689c.apply(f), this.f24689c.apply(f2));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10380b)) {
            return false;
        }
        C10380b bVar = (C10380b) obj;
        if (!this.f24689c.equals(bVar.f24689c) || !this.f24688U.equals(bVar.f24688U)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C10373e.m32806a(this.f24689c, this.f24688U);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24688U);
        sb.append(".onResultOf(");
        sb.append(this.f24689c);
        sb.append(")");
        return sb.toString();
    }
}
