package okhttp3.p688d0.p690h;

import java.io.IOException;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.d0.h.i */
/* compiled from: RouteException */
public final class C14152i extends RuntimeException {

    /* renamed from: U */
    private IOException f31456U;

    /* renamed from: c */
    private IOException f31457c;

    C14152i(IOException iOException) {
        super(iOException);
        this.f31457c = iOException;
        this.f31456U = iOException;
    }

    /* renamed from: a */
    public IOException mo35979a() {
        return this.f31457c;
    }

    /* renamed from: b */
    public IOException mo35981b() {
        return this.f31456U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35980a(IOException iOException) {
        C14126e.m44831a((Throwable) this.f31457c, (Throwable) iOException);
        this.f31456U = iOException;
    }
}
