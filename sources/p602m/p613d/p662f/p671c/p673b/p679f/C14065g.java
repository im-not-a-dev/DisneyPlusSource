package p602m.p613d.p662f.p671c.p673b.p679f;

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

/* renamed from: m.d.f.c.b.f.g */
/* compiled from: XMSSMTKeyFactorySpi */
public class C14065g extends KeyFactorySpi implements C13783b {
    /* renamed from: a */
    public PrivateKey mo35014a(C13521a aVar) throws IOException {
        return new C14059a(aVar);
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo35014a(C13521a.m41635a(C13643t.m41897a(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported key specification: ");
            sb.append(keySpec.getClass());
            sb.append(".");
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo35015a(C13588b.m41764a(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown key specification: ");
            sb.append(keySpec);
            sb.append(".");
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        String str = ".";
        if (key instanceof C14059a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof C14060b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported key type: ");
            sb.append(key.getClass());
            sb.append(str);
            throw new InvalidKeySpecException(sb.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unknown key specification: ");
        sb2.append(cls);
        sb2.append(str);
        throw new InvalidKeySpecException(sb2.toString());
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C14059a) || (key instanceof C14060b)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }

    /* renamed from: a */
    public PublicKey mo35015a(C13588b bVar) throws IOException {
        return new C14060b(bVar);
    }
}
