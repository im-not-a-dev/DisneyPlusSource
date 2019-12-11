package p163g.p441i.p442a.p443a;

import p163g.p441i.p442a.p443a.p445r.C10916a;

/* renamed from: g.i.a.a.k */
/* compiled from: JsonStreamContext */
public abstract class C10909k {

    /* renamed from: a */
    protected int f25897a;

    /* renamed from: b */
    protected int f25898b;

    protected C10909k() {
    }

    /* renamed from: a */
    public final int mo28081a() {
        int i = this.f25898b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public abstract String mo28082b();

    /* renamed from: c */
    public final int mo28083c() {
        return this.f25898b + 1;
    }

    /* renamed from: d */
    public final boolean mo28084d() {
        return this.f25897a == 1;
    }

    /* renamed from: e */
    public final boolean mo28085e() {
        return this.f25897a == 2;
    }

    /* renamed from: f */
    public String mo28086f() {
        int i = this.f25897a;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f25897a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String b = mo28082b();
            if (b != null) {
                sb.append('\"');
                C10916a.m34445a(sb, b);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(mo28081a());
            sb.append(']');
        }
        return sb.toString();
    }
}
