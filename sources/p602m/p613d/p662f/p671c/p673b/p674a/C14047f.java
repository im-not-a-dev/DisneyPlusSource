package p602m.p613d.p662f.p671c.p673b.p674a;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p639c.p640a.p647d.C13783b;
import p602m.p613d.p662f.p663a.C13972c;
import p602m.p613d.p662f.p663a.C13973d;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p665a.C13988f;
import p602m.p613d.p662f.p664b.p665a.C13989g;

/* renamed from: m.d.f.c.b.a.f */
/* compiled from: McElieceKeyFactorySpi */
public class C14047f extends KeyFactorySpi implements C13783b {
    /* renamed from: a */
    public PublicKey mo35015a(C13588b bVar) throws IOException {
        C13973d a = C13973d.m44059a(bVar.mo34826g());
        return new C14045d(new C13989g(a.mo35312f(), a.mo35313g(), a.mo35311e()));
    }

    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C13521a a = C13521a.m41635a(C13643t.m41897a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C13974e.f30863c.equals(a.mo34802e().mo34822e())) {
                        C13972c a2 = C13972c.m44050a(a.mo34803f());
                        C13988f fVar = new C13988f(a2.mo35307h(), a2.mo35306g(), a2.mo35304e(), a2.mo35305f(), a2.mo35308i(), a2.mo35309j(), a2.mo35310k());
                        return new C14044c(fVar);
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to decode PKCS8EncodedKeySpec: ");
                sb.append(e);
                throw new InvalidKeySpecException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported key specification: ");
            sb2.append(keySpec.getClass());
            sb2.append(".");
            throw new InvalidKeySpecException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C13588b a = C13588b.m41764a(C13643t.m41897a(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C13974e.f30863c.equals(a.mo34824e().mo34822e())) {
                        C13973d a2 = C13973d.m44059a(a.mo34826g());
                        return new C14045d(new C13989g(a2.mo35312f(), a2.mo35313g(), a2.mo35311e()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to decode X509EncodedKeySpec: ");
                    sb.append(e.getMessage());
                    throw new InvalidKeySpecException(sb.toString());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported key specification: ");
            sb2.append(keySpec.getClass());
            sb2.append(".");
            throw new InvalidKeySpecException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }

    /* renamed from: a */
    public PrivateKey mo35014a(C13521a aVar) throws IOException {
        C13972c a = C13972c.m44050a(aVar.mo34803f().mo34785a());
        C13988f fVar = new C13988f(a.mo35307h(), a.mo35306g(), a.mo35304e(), a.mo35305f(), a.mo35308i(), a.mo35309j(), a.mo35310k());
        return new C14044c(fVar);
    }
}
