package okhttp3.p688d0.p691i;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.p690h.C14149f;
import okio.C14300v;
import okio.C14302x;

/* renamed from: okhttp3.d0.i.c */
/* compiled from: ExchangeCodec */
public interface C14160c {
    /* renamed from: a */
    C14114a mo36002a(boolean z) throws IOException;

    /* renamed from: a */
    C14149f mo36003a();

    /* renamed from: a */
    C14300v mo36004a(Request request, long j) throws IOException;

    /* renamed from: a */
    C14302x mo36005a(Response response) throws IOException;

    /* renamed from: a */
    void mo36006a(Request request) throws IOException;

    /* renamed from: b */
    long mo36007b(Response response) throws IOException;

    /* renamed from: b */
    void mo36008b() throws IOException;

    /* renamed from: c */
    void mo36009c() throws IOException;

    void cancel();
}
