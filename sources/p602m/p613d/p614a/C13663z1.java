package p602m.p613d.p614a;

import java.io.InputStream;

/* renamed from: m.d.a.z1 */
/* compiled from: LimitedInputStream */
abstract class C13663z1 extends InputStream {

    /* renamed from: U */
    private int f30379U;

    /* renamed from: c */
    protected final InputStream f30380c;

    C13663z1(InputStream inputStream, int i) {
        this.f30380c = inputStream;
        this.f30379U = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo34876a() {
        return this.f30379U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34900a(boolean z) {
        InputStream inputStream = this.f30380c;
        if (inputStream instanceof C13654w1) {
            ((C13654w1) inputStream).mo34889b(z);
        }
    }
}
