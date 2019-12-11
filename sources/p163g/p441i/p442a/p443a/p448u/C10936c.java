package p163g.p441i.p442a.p443a.p448u;

import com.facebook.stetho.server.http.HttpStatus;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import net.danlew.android.joda.DateUtils;

/* renamed from: g.i.a.a.u.c */
/* compiled from: ByteArrayBuilder */
public final class C10936c extends OutputStream {

    /* renamed from: X */
    public static final byte[] f25985X = new byte[0];

    /* renamed from: U */
    private int f25986U;

    /* renamed from: V */
    private byte[] f25987V;

    /* renamed from: W */
    private int f25988W;

    /* renamed from: c */
    private final LinkedList<byte[]> f25989c;

    public C10936c(C10934a aVar) {
        this(aVar, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    /* renamed from: e */
    private void m34624e() {
        int length = this.f25986U + this.f25987V.length;
        if (length >= 0) {
            this.f25986U = length;
            int max = Math.max(this.f25986U >> 1, 1000);
            if (max > 262144) {
                max = DateUtils.FORMAT_ABBREV_RELATIVE;
            }
            this.f25989c.add(this.f25987V);
            this.f25987V = new byte[max];
            this.f25988W = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    /* renamed from: a */
    public byte[] mo28179a() {
        m34624e();
        return this.f25987V;
    }

    /* renamed from: b */
    public void mo28180b() {
        this.f25986U = 0;
        this.f25988W = 0;
        if (!this.f25989c.isEmpty()) {
            this.f25989c.clear();
        }
    }

    /* renamed from: c */
    public byte[] mo28182c() {
        mo28180b();
        return this.f25987V;
    }

    public void close() {
    }

    /* renamed from: d */
    public byte[] mo28185d() {
        int i = this.f25986U + this.f25988W;
        if (i == 0) {
            return f25985X;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f25989c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f25987V, 0, bArr, i2, this.f25988W);
        int i3 = i2 + this.f25988W;
        if (i3 == i) {
            if (!this.f25989c.isEmpty()) {
                mo28180b();
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Internal error: total len assumed to be ");
        sb.append(i);
        sb.append(", copied ");
        sb.append(i3);
        sb.append(" bytes");
        throw new RuntimeException(sb.toString());
    }

    public void flush() {
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C10936c(C10934a aVar, int i) {
        this.f25989c = new LinkedList<>();
        this.f25987V = aVar == null ? new byte[i] : aVar.mo28171a(2);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f25987V.length - this.f25988W, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f25987V, this.f25988W, min);
                i += min;
                this.f25988W += min;
                i2 -= min;
            }
            if (i2 > 0) {
                m34624e();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public byte[] mo28183c(int i) {
        this.f25988W = i;
        return mo28185d();
    }

    /* renamed from: b */
    public void mo28181b(int i) {
        if (this.f25988W >= this.f25987V.length) {
            m34624e();
        }
        byte[] bArr = this.f25987V;
        int i2 = this.f25988W;
        this.f25988W = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void write(int i) {
        mo28181b(i);
    }
}
