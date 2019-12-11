package okhttp3.p688d0.p693k;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

/* renamed from: okhttp3.d0.k.l */
/* compiled from: PushObserver */
public interface C14211l {

    /* renamed from: a */
    public static final C14211l f31695a = new C14212a();

    /* renamed from: okhttp3.d0.k.l$a */
    /* compiled from: PushObserver */
    class C14212a implements C14211l {
        C14212a() {
        }

        /* renamed from: a */
        public void mo36109a(int i, C14179b bVar) {
        }

        /* renamed from: a */
        public boolean mo36110a(int i, List<C14180c> list) {
            return true;
        }

        /* renamed from: a */
        public boolean mo36111a(int i, List<C14180c> list, boolean z) {
            return true;
        }

        /* renamed from: a */
        public boolean mo36112a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }
    }

    /* renamed from: a */
    void mo36109a(int i, C14179b bVar);

    /* renamed from: a */
    boolean mo36110a(int i, List<C14180c> list);

    /* renamed from: a */
    boolean mo36111a(int i, List<C14180c> list, boolean z);

    /* renamed from: a */
    boolean mo36112a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;
}
