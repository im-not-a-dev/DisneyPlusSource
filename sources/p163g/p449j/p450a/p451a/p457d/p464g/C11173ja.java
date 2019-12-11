package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.j.a.a.d.g.ja */
public final class C11173ja extends C11033ac {

    /* renamed from: a */
    private final AtomicReference<Bundle> f26281a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f26282b;

    /* renamed from: a */
    public static <T> T m35425a(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get("r");
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    Object[] objArr = {canonicalName, canonicalName2};
                    String str = "AM";
                    Log.w(str, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), objArr), e);
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo28331c(Bundle bundle) {
        synchronized (this.f26281a) {
            try {
                this.f26281a.set(bundle);
                this.f26282b = true;
                this.f26281a.notify();
            } catch (Throwable th) {
                this.f26281a.notify();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo28614d(long j) {
        Bundle bundle;
        synchronized (this.f26281a) {
            if (!this.f26282b) {
                try {
                    this.f26281a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f26281a.get();
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo28613c(long j) {
        return (String) m35425a(mo28614d(j), String.class);
    }
}
