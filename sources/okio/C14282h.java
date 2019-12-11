package okio;

import java.io.IOException;

/* renamed from: okio.h */
/* compiled from: ForwardingSource.kt */
public abstract class C14282h implements C14302x {

    /* renamed from: c */
    private final C14302x f31869c;

    public C14282h(C14302x xVar) {
        this.f31869c = xVar;
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31869c.mo35898X();
    }

    /* renamed from: a */
    public final C14302x mo36412a() {
        return this.f31869c;
    }

    public void close() throws IOException {
        this.f31869c.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f31869c);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) throws IOException {
        return this.f31869c.mo35899a(buffer, j);
    }
}
