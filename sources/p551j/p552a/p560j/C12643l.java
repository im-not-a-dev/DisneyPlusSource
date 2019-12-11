package p551j.p552a.p560j;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p520io.sentry.event.Event;
import p551j.p552a.p565o.C12660a;

/* renamed from: j.a.j.l */
/* compiled from: OutputStreamConnection */
public class C12643l extends C12624a {

    /* renamed from: a0 */
    private static final Charset f29317a0 = Charset.forName(Utf8Charset.NAME);

    /* renamed from: Y */
    private final OutputStream f29318Y;

    /* renamed from: Z */
    private C12660a f29319Z;

    public C12643l(OutputStream outputStream) {
        super(null, null);
        this.f29318Y = outputStream;
    }

    /* renamed from: a */
    public void mo30952a(C12660a aVar) {
        this.f29319Z = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo30926b(Event event) throws C12635e {
        try {
            this.f29318Y.write("Sentry event:\n".getBytes(f29317a0));
            this.f29319Z.mo30980a(event, this.f29318Y);
            this.f29318Y.write("\n".getBytes(f29317a0));
            this.f29318Y.flush();
        } catch (IOException e) {
            throw new C12635e("Couldn't sent the event properly", e);
        }
    }

    public void close() throws IOException {
        this.f29318Y.close();
    }
}
