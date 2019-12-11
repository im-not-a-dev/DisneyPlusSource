package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.i */
/* compiled from: ForwardingTimeout.kt */
public class C14283i extends C14303y {

    /* renamed from: e */
    private C14303y f31870e;

    public C14283i(C14303y yVar) {
        this.f31870e = yVar;
    }

    /* renamed from: a */
    public final C14283i mo36414a(C14303y yVar) {
        this.f31870e = yVar;
        return this;
    }

    /* renamed from: b */
    public C14303y mo36418b() {
        return this.f31870e.mo36418b();
    }

    /* renamed from: c */
    public long mo36419c() {
        return this.f31870e.mo36419c();
    }

    /* renamed from: d */
    public boolean mo36420d() {
        return this.f31870e.mo36420d();
    }

    /* renamed from: e */
    public void mo36421e() throws IOException {
        this.f31870e.mo36421e();
    }

    /* renamed from: g */
    public final C14303y mo36422g() {
        return this.f31870e;
    }

    /* renamed from: a */
    public C14303y mo36417a(long j, TimeUnit timeUnit) {
        return this.f31870e.mo36417a(j, timeUnit);
    }

    /* renamed from: a */
    public C14303y mo36416a(long j) {
        return this.f31870e.mo36416a(j);
    }

    /* renamed from: a */
    public C14303y mo36415a() {
        return this.f31870e.mo36415a();
    }
}
