package p602m.p613d.p662f.p671c.p673b.p676c;

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
import p602m.p613d.p662f.p663a.C13975f;
import p602m.p613d.p662f.p663a.C13976g;
import p602m.p613d.p662f.p671c.p680c.C14066a;
import p602m.p613d.p662f.p671c.p680c.C14067b;

/* renamed from: m.d.f.c.b.c.c */
/* compiled from: RainbowKeyFactorySpi */
public class C14054c extends KeyFactorySpi implements C13783b {
    /* renamed from: a */
    public PrivateKey mo35014a(C13521a aVar) throws IOException {
        C13975f a = C13975f.m44064a(aVar.mo34803f());
        C14052a aVar2 = new C14052a(a.mo35316g(), a.mo35314e(), a.mo35317h(), a.mo35315f(), a.mo35319j(), a.mo35318i());
        return aVar2;
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C14066a) {
            return new C14052a((C14066a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo35014a(C13521a.m41635a(C13643t.m41897a(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported key specification: ");
            sb.append(keySpec.getClass());
            sb.append(".");
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C14067b) {
            return new C14053b((C14067b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo35015a(C13588b.m41764a(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown key specification: ");
            sb.append(keySpec);
            sb.append(".");
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        String str = ".";
        if (key instanceof C14052a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C14066a.class.isAssignableFrom(cls)) {
                C14052a aVar = (C14052a) key;
                C14066a aVar2 = new C14066a(aVar.mo35544c(), aVar.mo35542a(), aVar.mo35545d(), aVar.mo35543b(), aVar.mo35548f(), aVar.mo35546e());
                return aVar2;
            }
        } else if (!(key instanceof C14053b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported key type: ");
            sb.append(key.getClass());
            sb.append(str);
            throw new InvalidKeySpecException(sb.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (C14067b.class.isAssignableFrom(cls)) {
                C14053b bVar = (C14053b) key;
                return new C14067b(bVar.mo35556d(), bVar.mo35553a(), bVar.mo35555c(), bVar.mo35554b());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown key specification: ");
        sb2.append(cls);
        sb2.append(str);
        throw new InvalidKeySpecException(sb2.toString());
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C14052a) || (key instanceof C14053b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* renamed from: a */
    public PublicKey mo35015a(C13588b bVar) throws IOException {
        C13976g a = C13976g.m44072a(bVar.mo34826g());
        return new C14053b(a.mo35323h(), a.mo35320e(), a.mo35322g(), a.mo35321f());
    }
}
