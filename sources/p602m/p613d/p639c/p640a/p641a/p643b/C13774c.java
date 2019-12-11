package p602m.p613d.p639c.p640a.p641a.p643b;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p615c2.C13489a;
import p602m.p613d.p614a.p617e2.C13500b;
import p602m.p613d.p614a.p618f2.C13504a;
import p602m.p613d.p614a.p619g2.C13512a;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p623k2.C13530b;
import p602m.p613d.p614a.p624l2.C13568a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p614a.p626n2.C13593b;
import p602m.p613d.p614a.p626n2.C13617c;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13685f;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p627b.p638z.C13732a;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p649d.p650a.C13789c;
import p602m.p613d.p649d.p650a.C13790d;
import p602m.p613d.p649d.p651b.C13792a;
import p602m.p613d.p649d.p652c.C13797c;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14083d;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.c.a.a.b.c */
/* compiled from: ECUtil */
public class C13774c {
    /* renamed from: a */
    static int[] m42289a(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
            iArr2[0] = iArr[0];
            if (iArr[1] < iArr[2]) {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[1];
            }
        } else if (iArr[1] < iArr[2]) {
            iArr2[0] = iArr[1];
            if (iArr[0] < iArr[2]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[0];
            }
        } else {
            iArr2[0] = iArr[2];
            if (iArr[0] < iArr[1]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[1];
            } else {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[0];
            }
        }
        return iArr2;
    }

    /* renamed from: b */
    public static C13626o m42291b(String str) {
        if (str.indexOf(32) > 0) {
            str = str.substring(str.indexOf(32) + 1);
        }
        try {
            if (str.charAt(0) < '0' || str.charAt(0) > '2') {
                return m42292c(str);
            }
            return new C13626o(str);
        } catch (IllegalArgumentException unused) {
            return m42292c(str);
        }
    }

    /* renamed from: c */
    private static C13626o m42292c(String str) {
        C13626o b = C13593b.m41784b(str);
        if (b != null) {
            return b;
        }
        C13626o d = C13530b.m41681d(str);
        if (d == null) {
            d = C13512a.m41619b(str);
        }
        if (d == null) {
            d = C13568a.m41734b(str);
        }
        if (d == null) {
            d = C13500b.m41584a(str);
        }
        if (d == null) {
            d = C13489a.m41564d(str);
        }
        return d == null ? C13504a.m41598d(str) : d;
    }

    /* renamed from: b */
    public static C13619e m42290b(C13626o oVar) {
        C13619e a = C13732a.m42212a(oVar);
        if (a != null) {
            return a;
        }
        C13619e a2 = C13593b.m41781a(oVar);
        if (a2 == null) {
            a2 = C13530b.m41672a(oVar);
        }
        if (a2 == null) {
            a2 = C13512a.m41616a(oVar);
        }
        if (a2 == null) {
            a2 = C13568a.m41730a(oVar);
        }
        if (a2 == null) {
            a2 = C13489a.m41557a(oVar);
        }
        return a2 == null ? C13504a.m41591a(oVar) : a2;
    }

    /* renamed from: a */
    public static C13682c m42287a(C13778b bVar, C13799e eVar) {
        if (eVar instanceof C13797c) {
            C13797c cVar = (C13797c) eVar;
            C13685f fVar = new C13685f(m42291b(cVar.mo35041f()), cVar.mo35043a(), cVar.mo35044b(), cVar.mo35046d(), cVar.mo35045c(), cVar.mo35047e());
            return fVar;
        } else if (eVar == null) {
            C13799e b = bVar.mo35028b();
            C13682c cVar2 = new C13682c(b.mo35043a(), b.mo35044b(), b.mo35046d(), b.mo35045c(), b.mo35047e());
            return cVar2;
        } else {
            C13682c cVar3 = new C13682c(eVar.mo35043a(), eVar.mo35044b(), eVar.mo35046d(), eVar.mo35045c(), eVar.mo35047e());
            return cVar3;
        }
    }

    /* renamed from: a */
    public static C13682c m42286a(C13778b bVar, C13617c cVar) {
        if (cVar.mo34832g()) {
            C13626o a = C13626o.m41837a((Object) cVar.mo34830e());
            C13619e b = m42290b(a);
            if (b == null) {
                b = (C13619e) bVar.mo35027a().get(a);
            }
            C13685f fVar = new C13685f(a, b.mo34835e(), b.mo34836f(), b.mo34838h(), b.mo34837g(), b.mo34839i());
            return fVar;
        } else if (cVar.mo34831f()) {
            C13799e b2 = bVar.mo35028b();
            C13682c cVar2 = new C13682c(b2.mo35043a(), b2.mo35044b(), b2.mo35046d(), b2.mo35045c(), b2.mo35047e());
            return cVar2;
        } else {
            C13619e a2 = C13619e.m41817a(cVar.mo34830e());
            C13682c cVar3 = new C13682c(a2.mo34835e(), a2.mo34836f(), a2.mo34838h(), a2.mo34837g(), a2.mo34839i());
            return cVar3;
        }
    }

    /* renamed from: a */
    public static C13681b m42285a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof C13790d) {
            C13790d dVar = (C13790d) publicKey;
            C13799e parameters = dVar.getParameters();
            C13816g Y = dVar.mo35004Y();
            C13682c cVar = new C13682c(parameters.mo35043a(), parameters.mo35044b(), parameters.mo35046d(), parameters.mo35045c(), parameters.mo35047e());
            return new C13687h(Y, cVar);
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            C13799e a = C13773b.m42273a(eCPublicKey.getParams(), false);
            C13816g a2 = C13773b.m42276a(eCPublicKey.getParams(), eCPublicKey.getW(), false);
            C13682c cVar2 = new C13682c(a.mo35043a(), a.mo35044b(), a.mo35046d(), a.mo35045c(), a.mo35047e());
            return new C13687h(a2, cVar2);
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey a3 = C13792a.m42307a(C13588b.m41764a(encoded));
                    if (a3 instanceof ECPublicKey) {
                        return m42285a(a3);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot identify EC public key: ");
                sb.append(e.toString());
                throw new InvalidKeyException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static C13681b m42284a(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof C13789c) {
            C13789c cVar = (C13789c) privateKey;
            C13799e parameters = cVar.getParameters();
            if (parameters == null) {
                parameters = C13792a.f30600U.mo35028b();
            }
            BigInteger X = cVar.mo34993X();
            C13682c cVar2 = new C13682c(parameters.mo35043a(), parameters.mo35044b(), parameters.mo35046d(), parameters.mo35045c(), parameters.mo35047e());
            return new C13686g(X, cVar2);
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            C13799e a = C13773b.m42273a(eCPrivateKey.getParams(), false);
            BigInteger s = eCPrivateKey.getS();
            C13682c cVar3 = new C13682c(a.mo35043a(), a.mo35044b(), a.mo35046d(), a.mo35045c(), a.mo35047e());
            return new C13686g(s, cVar3);
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey a2 = C13792a.m42306a(C13521a.m41635a(encoded));
                    if (a2 instanceof ECPrivateKey) {
                        return m42284a(a2);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot identify EC private key: ");
                sb.append(e.toString());
                throw new InvalidKeyException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static int m42278a(C13778b bVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        C13799e b = bVar.mo35028b();
        if (b == null) {
            return bigInteger2.bitLength();
        }
        return b.mo35046d().bitLength();
    }

    /* renamed from: a */
    public static C13619e m42283a(String str) {
        C13619e a = C13732a.m42211a(str);
        if (a != null) {
            return a;
        }
        C13619e a2 = C13593b.m41780a(str);
        if (a2 == null) {
            a2 = C13530b.m41680c(str);
        }
        if (a2 == null) {
            a2 = C13512a.m41615a(str);
        }
        if (a2 == null) {
            a2 = C13568a.m41729a(str);
        }
        if (a2 == null) {
            a2 = C13489a.m41563c(str);
        }
        return a2 == null ? C13504a.m41597c(str) : a2;
    }

    /* renamed from: a */
    public static String m42281a(C13626o oVar) {
        String b = C13593b.m41783b(oVar);
        if (b != null) {
            return b;
        }
        String b2 = C13530b.m41676b(oVar);
        if (b2 == null) {
            b2 = C13512a.m41618b(oVar);
        }
        if (b2 == null) {
            b2 = C13568a.m41733b(oVar);
        }
        if (b2 == null) {
            b2 = C13500b.m41583a(oVar);
        }
        if (b2 == null) {
            b2 = C13489a.m41560b(oVar);
        }
        return b2 == null ? C13504a.m41594b(oVar) : b2;
    }

    /* renamed from: a */
    public static String m42279a(String str, BigInteger bigInteger, C13799e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String a = C14090j.m44485a();
        C13816g a2 = m42288a(bigInteger, eVar);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(m42282a(a2, eVar));
        stringBuffer.append("]");
        stringBuffer.append(a);
        stringBuffer.append("            X: ");
        stringBuffer.append(a2.mo35141c().mo35117l().toString(16));
        stringBuffer.append(a);
        stringBuffer.append("            Y: ");
        stringBuffer.append(a2.mo35144d().mo35117l().toString(16));
        stringBuffer.append(a);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static C13816g m42288a(BigInteger bigInteger, C13799e eVar) {
        return eVar.mo35044b().mo35131a(bigInteger).mo35161r();
    }

    /* renamed from: a */
    public static String m42280a(String str, C13816g gVar, C13799e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String a = C14090j.m44485a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(m42282a(gVar, eVar));
        stringBuffer.append("]");
        stringBuffer.append(a);
        stringBuffer.append("            X: ");
        stringBuffer.append(gVar.mo35141c().mo35117l().toString(16));
        stringBuffer.append(a);
        stringBuffer.append("            Y: ");
        stringBuffer.append(gVar.mo35144d().mo35117l().toString(16));
        stringBuffer.append(a);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m42282a(C13816g gVar, C13799e eVar) {
        C13806d a = eVar.mo35043a();
        C13816g b = eVar.mo35044b();
        if (a != null) {
            return new C14083d(C14079a.m44452a(gVar.mo35136a(false), a.mo35082d().mo35107c(), a.mo35083e().mo35107c(), b.mo35136a(false))).toString();
        }
        return new C14083d(gVar.mo35136a(false)).toString();
    }
}
