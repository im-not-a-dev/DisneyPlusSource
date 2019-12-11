package p602m.p613d.p639c.p640a.p641a.p642a;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p626n2.C13592a;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p627b.C13664a;
import p602m.p613d.p627b.p629b0.C13668b;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13683d;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p639c.p640a.p641a.p643b.C13773b;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p649d.p651b.C13792a;
import p602m.p613d.p649d.p652c.C13796b;
import p602m.p613d.p649d.p652c.C13798d;
import p602m.p613d.p649d.p652c.C13799e;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p683g.C14084e;

/* renamed from: m.d.c.a.a.a.e */
/* compiled from: KeyPairGeneratorSpi */
public abstract class C13770e extends KeyPairGenerator {

    /* renamed from: m.d.c.a.a.a.e$a */
    /* compiled from: KeyPairGeneratorSpi */
    public static class C13771a extends C13770e {

        /* renamed from: h */
        private static Hashtable f30586h = new Hashtable();

        /* renamed from: a */
        C13683d f30587a;

        /* renamed from: b */
        C13668b f30588b = new C13668b();

        /* renamed from: c */
        Object f30589c = null;

        /* renamed from: d */
        int f30590d = 239;

        /* renamed from: e */
        boolean f30591e;

        /* renamed from: f */
        String f30592f;

        /* renamed from: g */
        C13778b f30593g;

        static {
            f30586h.put(C14084e.m44468a(192), new ECGenParameterSpec("prime192v1"));
            f30586h.put(C14084e.m44468a(239), new ECGenParameterSpec("prime239v1"));
            f30586h.put(C14084e.m44468a(256), new ECGenParameterSpec("prime256v1"));
            f30586h.put(C14084e.m44468a(224), new ECGenParameterSpec("P-224"));
            f30586h.put(C14084e.m44468a(384), new ECGenParameterSpec("P-384"));
            f30586h.put(C14084e.m44468a(521), new ECGenParameterSpec("P-521"));
        }

        public C13771a() {
            String str = "EC";
            super(str);
            new SecureRandom();
            this.f30591e = false;
            this.f30592f = str;
            this.f30593g = C13792a.f30600U;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13683d mo35021a(C13799e eVar, SecureRandom secureRandom) {
            return new C13683d(new C13682c(eVar.mo35043a(), eVar.mo35044b(), eVar.mo35046d(), eVar.mo35045c()), secureRandom);
        }

        public KeyPair generateKeyPair() {
            if (!this.f30591e) {
                initialize(this.f30590d, new SecureRandom());
            }
            C13664a a = this.f30588b.mo34907a();
            C13687h hVar = (C13687h) a.mo34902b();
            C13686g gVar = (C13686g) a.mo34901a();
            Object obj = this.f30589c;
            if (obj instanceof C13799e) {
                C13799e eVar = (C13799e) obj;
                C13766b bVar = new C13766b(this.f30592f, hVar, eVar, this.f30593g);
                C13765a aVar = new C13765a(this.f30592f, gVar, bVar, eVar, this.f30593g);
                return new KeyPair(bVar, aVar);
            } else if (obj == null) {
                return new KeyPair(new C13766b(this.f30592f, hVar, this.f30593g), new C13765a(this.f30592f, gVar, this.f30593g));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                C13766b bVar2 = new C13766b(this.f30592f, hVar, eCParameterSpec, this.f30593g);
                C13765a aVar2 = new C13765a(this.f30592f, gVar, bVar2, eCParameterSpec, this.f30593g);
                return new KeyPair(bVar2, aVar2);
            }
        }

        public void initialize(int i, SecureRandom secureRandom) {
            this.f30590d = i;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) f30586h.get(C14084e.m44468a(i));
            if (eCGenParameterSpec != null) {
                try {
                    initialize((AlgorithmParameterSpec) eCGenParameterSpec, secureRandom);
                } catch (InvalidAlgorithmParameterException unused) {
                    throw new InvalidParameterException("key size not configurable.");
                }
            } else {
                throw new InvalidParameterException("unknown key size.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13683d mo35020a(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            C13806d a = C13773b.m42274a(eCParameterSpec.getCurve());
            return new C13683d(new C13682c(a, C13773b.m42277a(a, eCParameterSpec.getGenerator(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
        }

        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null) {
                C13799e b = this.f30593g.mo35028b();
                if (b != null) {
                    this.f30589c = null;
                    this.f30587a = mo35021a(b, secureRandom);
                } else {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
            } else if (algorithmParameterSpec instanceof C13799e) {
                this.f30589c = algorithmParameterSpec;
                this.f30587a = mo35021a((C13799e) algorithmParameterSpec, secureRandom);
            } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.f30589c = algorithmParameterSpec;
                this.f30587a = mo35020a((ECParameterSpec) algorithmParameterSpec, secureRandom);
            } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                mo35023a(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
            } else if (algorithmParameterSpec instanceof C13796b) {
                mo35023a(((C13796b) algorithmParameterSpec).mo35040a(), secureRandom);
            } else {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
            }
            this.f30588b.mo34910a(this.f30587a);
            this.f30591e = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13798d mo35022a(String str) throws InvalidAlgorithmParameterException {
            C13619e a = C13767c.m42261a(str);
            if (a == null) {
                try {
                    a = C13592a.m41779a(new C13626o(str));
                    if (a == null) {
                        a = (C13619e) this.f30593g.mo35027a().get(new C13626o(str));
                        if (a == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown curve OID: ");
                            sb.append(str);
                            throw new InvalidAlgorithmParameterException(sb.toString());
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unknown curve name: ");
                    sb2.append(str);
                    throw new InvalidAlgorithmParameterException(sb2.toString());
                }
            }
            C13798d dVar = new C13798d(str, a.mo34835e(), a.mo34836f(), a.mo34838h(), a.mo34837g(), null);
            return dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35023a(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            C13798d a = mo35022a(str);
            this.f30589c = a;
            this.f30587a = mo35020a((ECParameterSpec) a, secureRandom);
        }
    }

    public C13770e(String str) {
        super(str);
    }
}
