package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p163g.p449j.p487c.C11556i;
import p163g.p449j.p487c.C11559l;
import p163g.p449j.p487c.C11561n;
import p163g.p449j.p487c.C11562o;
import p163g.p449j.p487c.C11564q;
import p163g.p449j.p487c.p488a0.C11536c;

/* renamed from: g.j.c.y.l.f */
/* compiled from: JsonTreeWriter */
public final class C11630f extends C11536c {

    /* renamed from: h0 */
    private static final Writer f27108h0 = new C11631a();

    /* renamed from: i0 */
    private static final C11564q f27109i0 = new C11564q("closed");

    /* renamed from: e0 */
    private final List<C11559l> f27110e0 = new ArrayList();

    /* renamed from: f0 */
    private String f27111f0;

    /* renamed from: g0 */
    private C11559l f27112g0 = C11561n.f27022a;

    /* renamed from: g.j.c.y.l.f$a */
    /* compiled from: JsonTreeWriter */
    static class C11631a extends Writer {
        C11631a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C11630f() {
        super(f27108h0);
    }

    /* renamed from: a */
    private void m37447a(C11559l lVar) {
        if (this.f27111f0 != null) {
            if (!lVar.mo29542f() || mo29497e()) {
                ((C11562o) peek()).mo29548a(this.f27111f0, lVar);
            }
            this.f27111f0 = null;
        } else if (this.f27110e0.isEmpty()) {
            this.f27112g0 = lVar;
        } else {
            C11559l peek = peek();
            if (peek instanceof C11556i) {
                ((C11556i) peek).mo29533a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private C11559l peek() {
        List<C11559l> list = this.f27110e0;
        return (C11559l) list.get(list.size() - 1);
    }

    /* renamed from: b */
    public C11536c mo29489b() throws IOException {
        C11562o oVar = new C11562o();
        m37447a((C11559l) oVar);
        this.f27110e0.add(oVar);
        return this;
    }

    /* renamed from: c */
    public C11536c mo29491c() throws IOException {
        if (this.f27110e0.isEmpty() || this.f27111f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C11556i) {
            List<C11559l> list = this.f27110e0;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() throws IOException {
        if (this.f27110e0.isEmpty()) {
            this.f27110e0.add(f27109i0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C11536c mo29494d() throws IOException {
        if (this.f27110e0.isEmpty() || this.f27111f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C11562o) {
            List<C11559l> list = this.f27110e0;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public C11536c mo29496e(String str) throws IOException {
        if (this.f27110e0.isEmpty() || this.f27111f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C11562o) {
            this.f27111f0 = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    /* renamed from: g */
    public C11536c mo29501g(String str) throws IOException {
        if (str == null) {
            mo29503h();
            return this;
        }
        m37447a((C11559l) new C11564q(str));
        return this;
    }

    /* renamed from: h */
    public C11536c mo29503h() throws IOException {
        m37447a((C11559l) C11561n.f27022a);
        return this;
    }

    /* renamed from: i */
    public C11559l mo29656i() {
        if (this.f27110e0.isEmpty()) {
            return this.f27112g0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(this.f27110e0);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C11536c mo29495d(boolean z) throws IOException {
        m37447a((C11559l) new C11564q(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C11536c mo29484a() throws IOException {
        C11556i iVar = new C11556i();
        m37447a((C11559l) iVar);
        this.f27110e0.add(iVar);
        return this;
    }

    /* renamed from: a */
    public C11536c mo29486a(Boolean bool) throws IOException {
        if (bool == null) {
            mo29503h();
            return this;
        }
        m37447a((C11559l) new C11564q(bool));
        return this;
    }

    /* renamed from: a */
    public C11536c mo29485a(long j) throws IOException {
        m37447a((C11559l) new C11564q((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C11536c mo29487a(Number number) throws IOException {
        if (number == null) {
            mo29503h();
            return this;
        }
        if (!mo29502g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m37447a((C11559l) new C11564q(number));
        return this;
    }
}
