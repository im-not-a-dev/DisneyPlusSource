package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.p685l.C14099a;

/* renamed from: m.d.a.c */
/* compiled from: ASN1BitString */
public abstract class C13486c extends C13643t implements C13661z {

    /* renamed from: V */
    private static final char[] f30022V = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: U */
    protected final int f30023U;

    /* renamed from: c */
    protected final byte[] f30024c;

    public C13486c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f30024c = C14079a.m44450a(bArr);
            this.f30023U = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        boolean z = false;
        if (!(tVar instanceof C13486c)) {
            return false;
        }
        C13486c cVar = (C13486c) tVar;
        if (this.f30023U == cVar.f30023U && C14079a.m44446a(mo34779i(), cVar.mo34779i())) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        return new C13641s0(this.f30024c, this.f30023U);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        return new C13632p1(this.f30024c, this.f30023U);
    }

    public int hashCode() {
        return this.f30023U ^ C14079a.m44457b(mo34779i());
    }

    /* renamed from: i */
    public byte[] mo34779i() {
        return m41541a(this.f30024c, this.f30023U);
    }

    /* renamed from: j */
    public byte[] mo34780j() {
        if (this.f30023U == 0) {
            return C14079a.m44450a(this.f30024c);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    /* renamed from: k */
    public int mo34781k() {
        return this.f30023U;
    }

    /* renamed from: l */
    public String mo34782l() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C13636r(byteArrayOutputStream).mo34790a((C13501f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(f30022V[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(f30022V[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Internal error encoding BitString: ");
            sb.append(e.getMessage());
            throw new C13640s(sb.toString(), e);
        }
    }

    public String toString() {
        return mo34782l();
    }

    /* renamed from: a */
    protected static byte[] m41541a(byte[] bArr, int i) {
        byte[] a = C14079a.m44450a(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            a[length] = (byte) ((255 << i) & a[length]);
        }
        return a;
    }

    /* renamed from: a */
    static C13486c m41540a(int i, InputStream inputStream) throws IOException {
        if (i >= 1) {
            int read = inputStream.read();
            byte[] bArr = new byte[(i - 1)];
            if (bArr.length != 0) {
                if (C14099a.m44517a(inputStream, bArr) != bArr.length) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                } else if (read > 0 && read < 8 && bArr[bArr.length - 1] != ((byte) (bArr[bArr.length - 1] & (255 << read)))) {
                    return new C13632p1(bArr, read);
                }
            }
            return new C13641s0(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }
}
