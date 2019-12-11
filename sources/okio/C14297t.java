package okio;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import kotlin.C13145v;

/* renamed from: okio.t */
/* compiled from: SegmentPool.kt */
public final class C14297t {

    /* renamed from: a */
    public static C14295s f31907a;

    /* renamed from: b */
    public static long f31908b;

    /* renamed from: c */
    public static final C14297t f31909c = new C14297t();

    private C14297t() {
    }

    /* renamed from: a */
    public static final C14295s m45788a() {
        synchronized (f31909c) {
            C14295s sVar = f31907a;
            if (sVar == null) {
                return new C14295s();
            }
            f31907a = sVar.f31905f;
            sVar.f31905f = null;
            f31908b -= (long) ContentServiceClientExtras.URL_SIZE_LIMIT;
            return sVar;
        }
    }

    /* renamed from: a */
    public static final void m45789a(C14295s sVar) {
        if (!(sVar.f31905f == null && sVar.f31906g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!sVar.f31903d) {
            synchronized (f31909c) {
                long j = (long) ContentServiceClientExtras.URL_SIZE_LIMIT;
                if (f31908b + j <= 65536) {
                    f31908b += j;
                    sVar.f31905f = f31907a;
                    sVar.f31902c = 0;
                    sVar.f31901b = sVar.f31902c;
                    f31907a = sVar;
                    C13145v vVar = C13145v.f29587a;
                }
            }
        }
    }
}
