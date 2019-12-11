package p602m.p613d.p639c.p640a.p641a.p642a;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p614a.p626n2.C13625k;
import p602m.p613d.p639c.p640a.p641a.p643b.C13772a;
import p602m.p613d.p639c.p640a.p641a.p643b.C13773b;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p639c.p640a.p647d.C13783b;
import p602m.p613d.p649d.p651b.C13792a;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p649d.p652c.C13800f;
import p602m.p613d.p649d.p652c.C13801g;

/* renamed from: m.d.c.a.a.a.d */
/* compiled from: KeyFactorySpi */
public class C13768d extends C13772a implements C13783b {

    /* renamed from: a */
    String f30584a;

    /* renamed from: b */
    C13778b f30585b;

    /* renamed from: m.d.c.a.a.a.d$a */
    /* compiled from: KeyFactorySpi */
    public static class C13769a extends C13768d {
        public C13769a() {
            super("EC", C13792a.f30600U);
        }
    }

    C13768d(String str, C13778b bVar) {
        this.f30584a = str;
        this.f30585b = bVar;
    }

    /* renamed from: a */
    public PrivateKey mo35014a(C13521a aVar) throws IOException {
        C13626o e = aVar.mo34802e().mo34822e();
        if (e.equals(C13625k.f30320n)) {
            return new C13765a(this.f30584a, aVar, this.f30585b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("algorithm identifier ");
        sb.append(e);
        sb.append(" in key not recognised");
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C13800f) {
            return new C13765a(this.f30584a, (C13800f) keySpec, this.f30585b);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new C13765a(this.f30584a, (ECPrivateKeySpec) keySpec, this.f30585b);
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof C13801g) {
                return new C13766b(this.f30584a, (C13801g) keySpec, this.f30585b);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new C13766b(this.f30584a, (ECPublicKeySpec) keySpec, this.f30585b);
            }
            return super.engineGeneratePublic(keySpec);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid KeySpec: ");
            sb.append(e.getMessage());
            throw new InvalidKeySpecException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C13799e b = C13792a.f30600U.mo35028b();
            return new ECPublicKeySpec(eCPublicKey.getW(), C13773b.m42269a(C13773b.m42271a(b.mo35043a(), b.mo35047e()), b));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C13799e b2 = C13792a.f30600U.mo35028b();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), C13773b.m42269a(C13773b.m42271a(b2.mo35043a(), b2.mo35047e()), b2));
        } else if (cls.isAssignableFrom(C13801g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C13801g(C13773b.m42276a(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), C13773b.m42273a(eCPublicKey2.getParams(), false));
            }
            return new C13801g(C13773b.m42276a(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), C13792a.f30600U.mo35028b());
        } else if (!cls.isAssignableFrom(C13800f.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new C13800f(eCPrivateKey2.getS(), C13773b.m42273a(eCPrivateKey2.getParams(), false));
            }
            return new C13800f(eCPrivateKey2.getS(), C13792a.f30600U.mo35028b());
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new C13766b((ECPublicKey) key, this.f30585b);
        }
        if (key instanceof ECPrivateKey) {
            return new C13765a((ECPrivateKey) key, this.f30585b);
        }
        throw new InvalidKeyException("key type unknown");
    }

    /* renamed from: a */
    public PublicKey mo35015a(C13588b bVar) throws IOException {
        C13626o e = bVar.mo34824e().mo34822e();
        if (e.equals(C13625k.f30320n)) {
            return new C13766b(this.f30584a, bVar, this.f30585b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("algorithm identifier ");
        sb.append(e);
        sb.append(" in key not recognised");
        throw new IOException(sb.toString());
    }
}
