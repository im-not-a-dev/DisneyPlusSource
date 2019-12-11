package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: okio.w */
/* compiled from: Okio.kt */
final class C14301w extends C14274d {

    /* renamed from: l */
    private final Logger f31913l = Logger.getLogger("okio.Okio");

    /* renamed from: m */
    private final Socket f31914m;

    public C14301w(Socket socket) {
        this.f31914m = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo36089b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo36001i() {
        String str = "Failed to close timed out socket ";
        try {
            this.f31914m.close();
        } catch (Exception e) {
            Logger logger = this.f31913l;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f31914m);
            logger.log(level, sb.toString(), e);
        } catch (AssertionError e2) {
            if (C14287m.m45725a(e2)) {
                Logger logger2 = this.f31913l;
                Level level2 = Level.WARNING;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f31914m);
                logger2.log(level2, sb2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
