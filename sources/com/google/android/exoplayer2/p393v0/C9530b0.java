package com.google.android.exoplayer2.p393v0;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.exoplayer2.v0.b0 */
/* compiled from: ReusableBufferedOutputStream */
public final class C9530b0 extends BufferedOutputStream {

    /* renamed from: c */
    private boolean f22232c;

    public C9530b0(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo24595a(OutputStream outputStream) {
        Assertions.checkState(this.f22232c);
        this.out = outputStream;
        this.count = 0;
        this.f22232c = false;
    }

    public void close() throws IOException {
        this.f22232c = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            Util.m29408a(th);
            throw null;
        }
    }

    public C9530b0(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
