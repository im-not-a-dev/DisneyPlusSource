package kotlin.p580c0;

import java.io.Closeable;

/* renamed from: kotlin.c0.b */
/* compiled from: Closeable.kt */
public final class C12724b {
    /* renamed from: a */
    public static final void m39863a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C12722c.m39860a(th, th2);
            }
        }
    }
}
