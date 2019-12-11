package okhttp3.p688d0.p689g;

import java.io.IOException;
import okio.Buffer;
import okio.C14281g;
import okio.C14300v;

/* renamed from: okhttp3.d0.g.e */
/* compiled from: FaultHidingSink */
class C14140e extends C14281g {

    /* renamed from: U */
    private boolean f31400U;

    C14140e(C14300v vVar) {
        super(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35916a(IOException iOException) {
        throw null;
    }

    /* renamed from: b */
    public void mo35927b(Buffer buffer, long j) throws IOException {
        if (this.f31400U) {
            buffer.skip(j);
            return;
        }
        try {
            super.mo35927b(buffer, j);
        } catch (IOException e) {
            this.f31400U = true;
            mo35916a(e);
        }
    }

    public void close() throws IOException {
        if (!this.f31400U) {
            try {
                super.close();
            } catch (IOException e) {
                this.f31400U = true;
                mo35916a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f31400U) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f31400U = true;
                mo35916a(e);
            }
        }
    }
}
