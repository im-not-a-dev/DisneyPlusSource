package p163g.p413f.p414a.p424w;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: g.f.a.w.d */
/* compiled from: ExceptionCatchingInputStream */
public class C10766d extends InputStream {

    /* renamed from: V */
    private static final Queue<C10766d> f25474V = C10775k.m34028a(0);

    /* renamed from: U */
    private IOException f25475U;

    /* renamed from: c */
    private InputStream f25476c;

    C10766d() {
    }

    /* renamed from: b */
    public static C10766d m33992b(InputStream inputStream) {
        C10766d dVar;
        synchronized (f25474V) {
            dVar = (C10766d) f25474V.poll();
        }
        if (dVar == null) {
            dVar = new C10766d();
        }
        dVar.mo27790a(inputStream);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27790a(InputStream inputStream) {
        this.f25476c = inputStream;
    }

    public int available() throws IOException {
        return this.f25476c.available();
    }

    public void close() throws IOException {
        this.f25476c.close();
    }

    public void mark(int i) {
        this.f25476c.mark(i);
    }

    public boolean markSupported() {
        return this.f25476c.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f25476c.read(bArr);
        } catch (IOException e) {
            this.f25475U = e;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f25476c.reset();
    }

    public long skip(long j) {
        try {
            return this.f25476c.skip(j);
        } catch (IOException e) {
            this.f25475U = e;
            return 0;
        }
    }

    /* renamed from: a */
    public IOException mo27789a() {
        return this.f25475U;
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f25476c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f25475U = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f25476c.read();
        } catch (IOException e) {
            this.f25475U = e;
            return -1;
        }
    }

    /* renamed from: b */
    public void mo27792b() {
        this.f25475U = null;
        this.f25476c = null;
        synchronized (f25474V) {
            f25474V.offer(this);
        }
    }
}
