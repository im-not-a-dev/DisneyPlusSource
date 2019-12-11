package okhttp3;

import java.io.IOException;

public interface Call extends Cloneable {

    /* renamed from: okhttp3.Call$a */
    public interface C14111a {
        /* renamed from: a */
        Call mo35727a(Request request);
    }

    /* renamed from: a */
    void mo35722a(C14235h hVar);

    void cancel();

    Call clone();

    /* renamed from: m0 */
    Request mo35725m0();

    /* renamed from: n0 */
    Response mo35726n0() throws IOException;
}
