package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: okhttp3.p */
/* compiled from: Dns */
public final /* synthetic */ class C14250p {
    /* renamed from: a */
    public static /* synthetic */ List m45428a(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Broken system behaviour for dns lookup of ");
                sb.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }
}
