package p163g.p449j.p450a.p451a.p457d.p463f;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g.j.a.a.d.f.j */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public final class C11011j {

    /* renamed from: a */
    private static final Logger f26032a = Logger.getLogger(C11011j.class.getName());

    private C11011j() {
    }

    /* renamed from: a */
    public static void m34725a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f26032a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
