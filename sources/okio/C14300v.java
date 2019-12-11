package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: okio.v */
/* compiled from: Sink.kt */
public interface C14300v extends Closeable, Flushable {
    /* renamed from: X */
    C14303y mo36019X();

    /* renamed from: b */
    void mo35927b(Buffer buffer, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;
}
