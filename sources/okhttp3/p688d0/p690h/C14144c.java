package okhttp3.p688d0.p690h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.C14245m;
import okhttp3.p688d0.C14124c;

/* renamed from: okhttp3.d0.h.c */
/* compiled from: ConnectionSpecSelector */
final class C14144c {

    /* renamed from: a */
    private final List<C14245m> f31402a;

    /* renamed from: b */
    private int f31403b = 0;

    /* renamed from: c */
    private boolean f31404c;

    /* renamed from: d */
    private boolean f31405d;

    C14144c(List<C14245m> list) {
        this.f31402a = list;
    }

    /* renamed from: b */
    private boolean m44904b(SSLSocket sSLSocket) {
        for (int i = this.f31403b; i < this.f31402a.size(); i++) {
            if (((C14245m) this.f31402a.get(i)).mo36195a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14245m mo35930a(SSLSocket sSLSocket) throws IOException {
        C14245m mVar;
        int i = this.f31403b;
        int size = this.f31402a.size();
        while (true) {
            if (i >= size) {
                mVar = null;
                break;
            }
            mVar = (C14245m) this.f31402a.get(i);
            if (mVar.mo36195a(sSLSocket)) {
                this.f31403b = i + 1;
                break;
            }
            i++;
        }
        if (mVar != null) {
            this.f31404c = m44904b(sSLSocket);
            C14124c.f31328a.mo35825a(mVar, sSLSocket, this.f31405d);
            return mVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f31405d);
        sb.append(", modes=");
        sb.append(this.f31402a);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35931a(IOException iOException) {
        this.f31405d = true;
        if (!this.f31404c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
