package p551j.p552a.p565o;

import java.io.IOException;
import java.io.OutputStream;
import p520io.sentry.event.Event;

/* renamed from: j.a.o.a */
/* compiled from: Marshaller */
public interface C12660a {

    /* renamed from: j.a.o.a$a */
    /* compiled from: Marshaller */
    public static final class C12661a extends OutputStream {

        /* renamed from: c */
        private final OutputStream f29348c;

        public C12661a(OutputStream outputStream) {
            this.f29348c = outputStream;
        }

        public void close() throws IOException {
        }

        public void flush() throws IOException {
            this.f29348c.flush();
        }

        public void write(int i) throws IOException {
            this.f29348c.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f29348c.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f29348c.write(bArr, i, i2);
        }
    }

    /* renamed from: a */
    String mo30979a();

    /* renamed from: a */
    void mo30980a(Event event, OutputStream outputStream) throws IOException;

    String getContentType();
}
