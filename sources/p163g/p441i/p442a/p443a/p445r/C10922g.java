package p163g.p441i.p442a.p443a.p445r;

import java.io.Serializable;
import p163g.p441i.p442a.p443a.C10912n;
import p163g.p441i.p442a.p443a.p448u.C10935b;

/* renamed from: g.i.a.a.r.g */
/* compiled from: SerializedString */
public class C10922g implements C10912n, Serializable {

    /* renamed from: U */
    protected byte[] f25925U;

    /* renamed from: c */
    protected final String f25926c;

    public C10922g(String str) {
        if (str != null) {
            this.f25926c = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    /* renamed from: a */
    public final byte[] mo28099a() {
        byte[] bArr = this.f25925U;
        if (bArr != null) {
            return bArr;
        }
        byte[] a = C10935b.m34622a(this.f25926c);
        this.f25925U = a;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C10922g.class) {
            return false;
        }
        return this.f25926c.equals(((C10922g) obj).f25926c);
    }

    public final String getValue() {
        return this.f25926c;
    }

    public final int hashCode() {
        return this.f25926c.hashCode();
    }

    public final String toString() {
        return this.f25926c;
    }
}
