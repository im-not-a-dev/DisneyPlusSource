package p602m.p613d.p639c.p640a.p641a.p643b;

import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p639c.p640a.p647d.C13783b;

/* renamed from: m.d.c.a.a.b.a */
/* compiled from: BaseKeyFactorySpi */
public abstract class C13772a extends KeyFactorySpi implements C13783b {
    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo35014a(C13521a.m41635a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoded key spec not recognized: ");
                sb.append(e.getMessage());
                throw new InvalidKeySpecException(sb.toString());
            }
        } else {
            throw new InvalidKeySpecException("key spec not recognized");
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo35015a(C13588b.m41764a(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoded key spec not recognized: ");
                sb.append(e.getMessage());
                throw new InvalidKeySpecException(sb.toString());
            }
        } else {
            throw new InvalidKeySpecException("key spec not recognized");
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("not implemented yet ");
        sb.append(key);
        sb.append(" ");
        sb.append(cls);
        throw new InvalidKeySpecException(sb.toString());
    }
}
