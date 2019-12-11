package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.d */
/* compiled from: ASN1Boolean */
public class C13492d extends C13643t {

    /* renamed from: U */
    private static final byte[] f30032U = {-1};

    /* renamed from: V */
    private static final byte[] f30033V = {0};

    /* renamed from: W */
    public static final C13492d f30034W = new C13492d(false);

    /* renamed from: X */
    public static final C13492d f30035X = new C13492d(true);

    /* renamed from: c */
    private final byte[] f30036c;

    C13492d(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        } else if (bArr[0] == 0) {
            this.f30036c = f30033V;
        } else if ((bArr[0] & 255) == 255) {
            this.f30036c = f30032U;
        } else {
            this.f30036c = C14079a.m44450a(bArr);
        }
    }

    /* renamed from: b */
    static C13492d m41566b(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        } else if (bArr[0] == 0) {
            return f30034W;
        } else {
            if ((bArr[0] & 255) == 255) {
                return f30035X;
            }
            return new C13492d(bArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(1, this.f30036c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return 3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return this.f30036c[0];
    }

    public String toString() {
        return this.f30036c[0] != 0 ? "TRUE" : "FALSE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13492d) || this.f30036c[0] != ((C13492d) tVar).f30036c[0]) {
            return false;
        }
        return true;
    }

    public C13492d(boolean z) {
        this.f30036c = z ? f30032U : f30033V;
    }
}
