package p602m.p613d.p614a;

import java.io.IOException;
import java.math.BigInteger;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14088i;

/* renamed from: m.d.a.l */
/* compiled from: ASN1Integer */
public class C13565l extends C13643t {

    /* renamed from: c */
    private final byte[] f30197c;

    public C13565l(long j) {
        this.f30197c = BigInteger.valueOf(j).toByteArray();
    }

    /* renamed from: a */
    public static C13565l m41715a(Object obj) {
        if (obj == null || (obj instanceof C13565l)) {
            return (C13565l) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C13565l) C13643t.m41897a((byte[]) obj);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoding error in getInstance: ");
                sb.append(e.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    static boolean m41716b(byte[] bArr) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            return bArr[0] == -1 && (bArr[1] & 128) != 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30197c.length) + 1 + this.f30197c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f30197c;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    /* renamed from: i */
    public BigInteger mo34814i() {
        return new BigInteger(this.f30197c);
    }

    public String toString() {
        return mo34814i().toString();
    }

    public C13565l(BigInteger bigInteger) {
        this.f30197c = bigInteger.toByteArray();
    }

    C13565l(byte[] bArr, boolean z) {
        if (C14088i.m44484b("org.spongycastle.asn1.allow_unsafe_integer") || !m41716b(bArr)) {
            if (z) {
                bArr = C14079a.m44450a(bArr);
            }
            this.f30197c = bArr;
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(2, this.f30197c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13565l)) {
            return false;
        }
        return C14079a.m44446a(this.f30197c, ((C13565l) tVar).f30197c);
    }
}
