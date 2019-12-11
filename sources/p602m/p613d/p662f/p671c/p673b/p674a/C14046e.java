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
import p602m.p613d.p662f.p663a.C13970a;
import p602m.p613d.p662f.p663a.C13971b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p665a.C13984b;
import p602m.p613d.p662f.p664b.p665a.C13985c;

/* renamed from: m.d.f.c.b.a.e */
/* compiled from: McElieceCCA2KeyFactorySpi */
public class C14046e extends KeyFactorySpi implements C13783b {
    /* renamed from: a */
    public PublicKey mo35015a(C13588b bVar) throws IOException {
        C13971b a = C13971b.m44044a(bVar.mo34826g());
        return new C14043b(new C13985c(a.mo35302g(), a.mo35303h(), a.mo35301f(), C14048g.m44353a(a.mo35300e()).mo34971a()));
    }

    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C13521a a = C13521a.m41635a(C13643t.m41897a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C13974e.f30864d.equals(a.mo34802e().mo34822e())) {
                        C13970a a2 = C13970a.m44036a(a.mo34803f());
                        C13984b bVar = new C13984b(a2.mo35298i(), a2.mo35297h(), a2.mo35295f(), a2.mo35296g(), a2.mo35299j(), C14048g.m44353a(a2.mo35294e()).mo34971a());
                        return new C14042a(bVar);
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
                    if (C13974e.f30864d.equals(a.mo34824e().mo34822e())) {
                        C13971b a2 = C13971b.m44044a(a.mo34826g());
                        return new C14043b(new C13985c(a2.mo35302g(), a2.mo35303h(), a2.mo35301f(), C14048g.m44353a(a2.mo35300e()).mo34971a()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
        C13970a a = C13970a.m44036a(aVar.mo34803f().mo34785a());
        C13984b bVar = new C13984b(a.mo35298i(), a.mo35297h(), a.mo35295f(), a.mo35296g(), a.mo35299j(), null);
        return new C14042a(bVar);
    }
}
