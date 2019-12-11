package okhttp3.p688d0.p691i;

import okhttp3.C14258u;
import okhttp3.C14264y;
import okio.BufferedSource;

/* renamed from: okhttp3.d0.i.h */
/* compiled from: RealResponseBody */
public final class C14166h extends C14264y {

    /* renamed from: U */
    private final long f31500U;

    /* renamed from: V */
    private final BufferedSource f31501V;

    /* renamed from: c */
    private final String f31502c;

    public C14166h(String str, long j, BufferedSource bufferedSource) {
        this.f31502c = str;
        this.f31500U = j;
        this.f31501V = bufferedSource;
    }

    /* renamed from: b */
    public long mo35701b() {
        return this.f31500U;
    }

    /* renamed from: c */
    public C14258u mo35702c() {
        String str = this.f31502c;
        if (str != null) {
            return C14258u.m45482b(str);
        }
        return null;
    }

    /* renamed from: d */
    public BufferedSource mo35703d() {
        return this.f31501V;
    }
}
