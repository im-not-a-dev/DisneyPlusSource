package okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.f */
/* compiled from: BufferedSink.kt */
public interface C14280f extends C14300v, WritableByteChannel {
    /* renamed from: a */
    C14280f mo36301a(String str) throws IOException;

    /* renamed from: a */
    C14280f mo36302a(String str, int i, int i2) throws IOException;

    /* renamed from: a */
    C14280f mo36304a(String str, Charset charset) throws IOException;

    void flush() throws IOException;

    /* renamed from: g */
    C14280f mo36333g(long j) throws IOException;

    /* renamed from: h */
    C14280f mo36336h(long j) throws IOException;

    /* renamed from: h0 */
    Buffer mo36337h0();

    /* renamed from: i0 */
    C14280f mo36341i0() throws IOException;

    C14280f write(byte[] bArr) throws IOException;

    C14280f write(byte[] bArr, int i, int i2) throws IOException;

    C14280f writeByte(int i) throws IOException;

    C14280f writeInt(int i) throws IOException;

    C14280f writeShort(int i) throws IOException;
}
