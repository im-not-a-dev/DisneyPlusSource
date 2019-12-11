package p163g.p413f.p414a.p423v;

import com.bumptech.glide.load.C8111g;
import java.security.MessageDigest;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: g.f.a.v.b */
/* compiled from: ObjectKey */
public final class C10760b implements C8111g {

    /* renamed from: b */
    private final Object f25465b;

    public C10760b(Object obj) {
        C10774j.m34012a(obj);
        this.f25465b = obj;
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        messageDigest.update(this.f25465b.toString().getBytes(C8111g.f17370a));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10760b)) {
            return false;
        }
        return this.f25465b.equals(((C10760b) obj).f25465b);
    }

    public int hashCode() {
        return this.f25465b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.f25465b);
        sb.append('}');
        return sb.toString();
    }
}
