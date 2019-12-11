package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.o */
/* compiled from: ASN1ObjectIdentifier */
public class C13626o extends C13643t {

    /* renamed from: V */
    private static final ConcurrentMap<C13627a, C13626o> f30333V = new ConcurrentHashMap();

    /* renamed from: U */
    private byte[] f30334U;

    /* renamed from: c */
    private final String f30335c;

    /* renamed from: m.d.a.o$a */
    /* compiled from: ASN1ObjectIdentifier */
    private static class C13627a {

        /* renamed from: a */
        private final int f30336a;

        /* renamed from: b */
        private final byte[] f30337b;

        C13627a(byte[] bArr) {
            this.f30336a = C14079a.m44457b(bArr);
            this.f30337b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13627a) {
                return C14079a.m44446a(this.f30337b, ((C13627a) obj).f30337b);
            }
            return false;
        }

        public int hashCode() {
            return this.f30336a;
        }
    }

    C13626o(byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        BigInteger bigInteger = null;
        boolean z = true;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j);
                }
                BigInteger or = bigInteger.or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f30335c = stringBuffer.toString();
        this.f30334U = C14079a.m44450a(bArr);
    }

    /* renamed from: a */
    public static C13626o m41837a(Object obj) {
        if (obj == null || (obj instanceof C13626o)) {
            return (C13626o) obj;
        }
        if (obj instanceof C13501f) {
            C13501f fVar = (C13501f) obj;
            if (fVar.mo34785a() instanceof C13626o) {
                return (C13626o) fVar.mo34785a();
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C13626o) C13643t.m41897a((byte[]) obj);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct object identifier from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: c */
    private static boolean m41843c(String str) {
        if (str.length() >= 3 && str.charAt(1) == '.') {
            char charAt = str.charAt(0);
            if (charAt >= '0' && charAt <= '2') {
                return m41841a(str, 2);
            }
        }
        return false;
    }

    /* renamed from: j */
    private synchronized byte[] m41844j() {
        if (this.f30334U == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m41838a(byteArrayOutputStream);
            this.f30334U = byteArrayOutputStream.toByteArray();
        }
        return this.f30334U;
    }

    /* renamed from: b */
    public C13626o mo34848b(String str) {
        return new C13626o(this, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() throws IOException {
        int length = m41844j().length;
        return C13485b2.m41537a(length) + 1 + length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return this.f30335c.hashCode();
    }

    /* renamed from: i */
    public String mo34849i() {
        return this.f30335c;
    }

    public String toString() {
        return mo34849i();
    }

    /* renamed from: b */
    static C13626o m41842b(byte[] bArr) {
        C13626o oVar = (C13626o) f30333V.get(new C13627a(bArr));
        return oVar == null ? new C13626o(bArr) : oVar;
    }

    /* renamed from: a */
    private void m41839a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: a */
    private void m41840a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        BigInteger bigInteger2 = bigInteger;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger2.intValue() & 127) | 128);
            bigInteger2 = bigInteger2.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public C13626o(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        } else if (m41843c(str)) {
            this.f30335c = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("string ");
            sb.append(str);
            sb.append(" not an OID");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m41838a(ByteArrayOutputStream byteArrayOutputStream) {
        C13481a2 a2Var = new C13481a2(this.f30335c);
        int parseInt = Integer.parseInt(a2Var.mo34778b()) * 40;
        String b = a2Var.mo34778b();
        if (b.length() <= 18) {
            m41839a(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(b));
        } else {
            m41840a(byteArrayOutputStream, new BigInteger(b).add(BigInteger.valueOf((long) parseInt)));
        }
        while (a2Var.mo34777a()) {
            String b2 = a2Var.mo34778b();
            if (b2.length() <= 18) {
                m41839a(byteArrayOutputStream, Long.parseLong(b2));
            } else {
                m41840a(byteArrayOutputStream, new BigInteger(b2));
            }
        }
    }

    C13626o(C13626o oVar, String str) {
        if (m41841a(str, 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(oVar.mo34849i());
            sb.append(".");
            sb.append(str);
            this.f30335c = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("string ");
        sb2.append(str);
        sb2.append(" not a valid OID branch");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        byte[] j = m41844j();
        rVar.mo34859a(6);
        rVar.mo34866b(j.length);
        rVar.mo34864a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (tVar == this) {
            return true;
        }
        if (!(tVar instanceof C13626o)) {
            return false;
        }
        return this.f30335c.equals(((C13626o) tVar).f30335c);
    }

    /* renamed from: a */
    private static boolean m41841a(String str, int i) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }
}
