package okio;

import java.io.IOException;

/* renamed from: okio.g */
/* compiled from: ForwardingSink.kt */
public abstract class C14281g implements C14300v {

    /* renamed from: c */
    private final C14300v f31868c;

    public C14281g(C14300v vVar) {
        this.f31868c = vVar;
    }

    /* renamed from: X */
    public C14303y mo36019X() {
        return this.f31868c.mo36019X();
    }

    /* renamed from: b */
    public void mo35927b(Buffer buffer, long j) throws IOException {
        this.f31868c.mo35927b(buffer, j);
    }

    public void close() throws IOException {
        this.f31868c.close();
    }

    public void flush() throws IOException {
        this.f31868c.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f31868c);
        sb.append(')');
        return sb.toString();
    }
}
