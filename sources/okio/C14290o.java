package okio;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: okio.o */
/* compiled from: Okio.kt */
final class C14290o implements C14300v {

    /* renamed from: U */
    private final C14303y f31885U;

    /* renamed from: c */
    private final OutputStream f31886c;

    public C14290o(OutputStream outputStream, C14303y yVar) {
        this.f31886c = outputStream;
        this.f31885U = yVar;
    }

    /* renamed from: X */
    public C14303y mo36019X() {
        return this.f31885U;
    }

    /* renamed from: b */
    public void mo35927b(Buffer buffer, long j) {
        C14273c.m45651a(buffer.mo36335h(), 0, j);
        while (j > 0) {
            this.f31885U.mo36421e();
            C14295s sVar = buffer.f31848c;
            if (sVar != null) {
                int min = (int) Math.min(j, (long) (sVar.f31902c - sVar.f31901b));
                this.f31886c.write(sVar.f31900a, sVar.f31901b, min);
                sVar.f31901b += min;
                long j2 = (long) min;
                j -= j2;
                buffer.mo36344k(buffer.mo36335h() - j2);
                if (sVar.f31901b == sVar.f31902c) {
                    buffer.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                }
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
    }

    public void close() {
        this.f31886c.close();
    }

    public void flush() {
        this.f31886c.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.f31886c);
        sb.append(')');
        return sb.toString();
    }
}
