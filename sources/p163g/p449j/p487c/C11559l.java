package p163g.p449j.p487c;

import java.io.IOException;
import java.io.StringWriter;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11613j;

/* renamed from: g.j.c.l */
/* compiled from: JsonElement */
public abstract class C11559l {
    /* renamed from: b */
    public C11556i mo29538b() {
        if (mo29541e()) {
            return (C11556i) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C11562o mo29539c() {
        if (mo29543g()) {
            return (C11562o) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C11564q mo29540d() {
        if (mo29544h()) {
            return (C11564q) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public boolean mo29541e() {
        return this instanceof C11556i;
    }

    /* renamed from: f */
    public boolean mo29542f() {
        return this instanceof C11561n;
    }

    /* renamed from: g */
    public boolean mo29543g() {
        return this instanceof C11562o;
    }

    /* renamed from: h */
    public boolean mo29544h() {
        return this instanceof C11564q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C11536c cVar = new C11536c(stringWriter);
            cVar.mo29490b(true);
            C11613j.m37403a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
