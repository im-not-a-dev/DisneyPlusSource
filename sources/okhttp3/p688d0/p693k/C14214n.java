package okhttp3.p688d0.p693k;

import java.io.IOException;

/* renamed from: okhttp3.d0.k.n */
/* compiled from: StreamResetException */
public final class C14214n extends IOException {

    /* renamed from: c */
    public final C14179b f31698c;

    public C14214n(C14179b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(bVar);
        super(sb.toString());
        this.f31698c = bVar;
    }
}
