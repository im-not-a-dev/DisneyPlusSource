package okhttp3;

import java.io.IOException;

public interface Interceptor {

    public interface Chain {
        /* renamed from: a */
        Response mo35780a(Request request) throws IOException;

        /* renamed from: a */
        C14240k mo35781a();

        /* renamed from: b */
        int mo35782b();

        /* renamed from: c */
        int mo35783c();

        /* renamed from: d */
        int mo35784d();

        /* renamed from: m0 */
        Request mo35785m0();
    }

    Response intercept(Chain chain) throws IOException;
}
