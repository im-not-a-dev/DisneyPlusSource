package p602m.p613d.p639c.p648b;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/* renamed from: m.d.c.b.c */
/* compiled from: ProviderJcaJceHelper */
public class C13786c implements C13785b {

    /* renamed from: a */
    protected final Provider f30599a;

    public C13786c(Provider provider) {
        this.f30599a = provider;
    }

    /* renamed from: a */
    public AlgorithmParameters mo35036a(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.f30599a);
    }
}
