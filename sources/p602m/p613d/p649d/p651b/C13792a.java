package p602m.p613d.p649d.p651b;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p639c.p640a.p644b.C13777a;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p639c.p640a.p645c.p646a.C13780a;
import p602m.p613d.p639c.p640a.p647d.C13782a;
import p602m.p613d.p639c.p640a.p647d.C13783b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p671c.p673b.p674a.C14046e;
import p602m.p613d.p662f.p671c.p673b.p674a.C14047f;
import p602m.p613d.p662f.p671c.p673b.p675b.C14051c;
import p602m.p613d.p662f.p671c.p673b.p676c.C14054c;
import p602m.p613d.p662f.p671c.p673b.p677d.C14057c;
import p602m.p613d.p662f.p671c.p673b.p679f.C14064f;
import p602m.p613d.p662f.p671c.p673b.p679f.C14065g;

/* renamed from: m.d.d.b.a */
/* compiled from: BouncyCastleProvider */
public final class C13792a extends Provider implements C13777a {

    /* renamed from: U */
    public static final C13778b f30600U = new C13794b();

    /* renamed from: V */
    private static final Map f30601V = new HashMap();

    /* renamed from: W */
    private static final String[] f30602W = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF"};

    /* renamed from: X */
    private static final String[] f30603X = {"SipHash", "Poly1305"};

    /* renamed from: Y */
    private static final String[] f30604Y = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624"};

    /* renamed from: Z */
    private static final String[] f30605Z = {"X509", "IES"};

    /* renamed from: a0 */
    private static final String[] f30606a0 = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};

    /* renamed from: b0 */
    private static final String[] f30607b0 = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "DSTU7564"};

    /* renamed from: c */
    private static String f30608c = "BouncyCastle Security Provider v1.58";

    /* renamed from: c0 */
    private static final String[] f30609c0 = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: d0 */
    private static final String[] f30610d0 = {"DRBG"};

    /* renamed from: m.d.d.b.a$a */
    /* compiled from: BouncyCastleProvider */
    class C13793a implements PrivilegedAction {
        C13793a() {
        }

        public Object run() {
            C13792a.this.m42312b();
            return null;
        }
    }

    public C13792a() {
        super("SC", 1.58d, f30608c);
        AccessController.doPrivileged(new C13793a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m42312b() {
        m42310a("org.spongycastle.jcajce.provider.digest.", f30607b0);
        String str = "org.spongycastle.jcajce.provider.symmetric.";
        m42310a(str, f30602W);
        m42310a(str, f30603X);
        m42310a(str, f30604Y);
        String str2 = "org.spongycastle.jcajce.provider.asymmetric.";
        m42310a(str2, f30605Z);
        m42310a(str2, f30606a0);
        m42310a("org.spongycastle.jcajce.provider.keystore.", f30609c0);
        m42310a("org.spongycastle.jcajce.provider.drbg.", f30610d0);
        m42309a();
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        String str3 = "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi";
        put("CertPathValidator.RFC3280", str3);
        String str4 = "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi";
        put("CertPathBuilder.RFC3280", str4);
        put("CertPathValidator.PKIX", str3);
        put("CertPathBuilder.PKIX", str4);
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    /* renamed from: a */
    private void m42310a(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("$Mappings");
            Class a = C13780a.m42298a(C13792a.class, sb.toString());
            if (a != null) {
                try {
                    ((C13782a) a.newInstance()).mo35035a(this);
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cannot create instance of ");
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings : ");
                    sb2.append(e);
                    throw new InternalError(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m42309a() {
        mo35037a(C13974e.f30865e, (C13783b) new C14057c());
        mo35037a(C13974e.f30866f, (C13783b) new C14051c());
        mo35037a(C13974e.f30867g, (C13783b) new C14064f());
        mo35037a(C13974e.f30868h, (C13783b) new C14065g());
        mo35037a(C13974e.f30863c, (C13783b) new C14047f());
        mo35037a(C13974e.f30864d, (C13783b) new C14046e());
        mo35037a(C13974e.f30861a, (C13783b) new C14054c());
    }

    /* renamed from: a */
    public void mo35037a(C13626o oVar, C13783b bVar) {
        synchronized (f30601V) {
            f30601V.put(oVar, bVar);
        }
    }

    /* renamed from: a */
    private static C13783b m42308a(C13626o oVar) {
        C13783b bVar;
        synchronized (f30601V) {
            bVar = (C13783b) f30601V.get(oVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public static PublicKey m42307a(C13588b bVar) throws IOException {
        C13783b a = m42308a(bVar.mo34824e().mo34822e());
        if (a == null) {
            return null;
        }
        return a.mo35015a(bVar);
    }

    /* renamed from: a */
    public static PrivateKey m42306a(C13521a aVar) throws IOException {
        C13783b a = m42308a(aVar.mo34802e().mo34822e());
        if (a == null) {
            return null;
        }
        return a.mo35014a(aVar);
    }
}
