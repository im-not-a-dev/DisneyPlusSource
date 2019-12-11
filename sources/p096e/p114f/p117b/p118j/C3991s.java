package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3995a;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3996b;

/* renamed from: e.f.b.j.s */
/* compiled from: VirtualLayout */
public class C3991s extends C3983l {

    /* renamed from: L0 */
    private int f10151L0 = 0;

    /* renamed from: M0 */
    private int f10152M0 = 0;

    /* renamed from: N0 */
    private int f10153N0 = 0;

    /* renamed from: O0 */
    private int f10154O0 = 0;

    /* renamed from: P0 */
    private boolean f10155P0 = false;

    /* renamed from: Q0 */
    private int f10156Q0 = 0;

    /* renamed from: R0 */
    private int f10157R0 = 0;

    /* renamed from: S0 */
    protected C3995a f10158S0 = new C3995a();

    /* renamed from: A */
    public void mo14487A(int i) {
        this.f10152M0 = i;
    }

    /* renamed from: B */
    public void mo14488B(int i) {
        this.f10153N0 = i;
    }

    /* renamed from: C */
    public void mo14489C(int i) {
        this.f10154O0 = i;
    }

    /* renamed from: D */
    public void mo14490D(int i) {
        this.f10151L0 = i;
    }

    /* renamed from: R */
    public void mo14286R() {
        for (int i = 0; i < this.f10125K0; i++) {
            C3973f fVar = this.f10124J0[i];
            if (fVar != null) {
                fVar.mo14362c(true);
            }
        }
    }

    /* renamed from: S */
    public int mo14491S() {
        return this.f10157R0;
    }

    /* renamed from: T */
    public int mo14492T() {
        return this.f10156Q0;
    }

    /* renamed from: U */
    public int mo14493U() {
        return this.f10152M0;
    }

    /* renamed from: V */
    public int mo14494V() {
        return this.f10153N0;
    }

    /* renamed from: W */
    public int mo14495W() {
        return this.f10154O0;
    }

    /* renamed from: X */
    public int mo14496X() {
        return this.f10151L0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public boolean mo14497Y() {
        C3973f fVar = this.f9986M;
        C3996b V = fVar != null ? ((C3976g) fVar).mo14413V() : null;
        if (V == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f10125K0) {
                return true;
            }
            C3973f fVar2 = this.f10124J0[i];
            if (fVar2 != null && !(fVar2 instanceof C3980j)) {
                C3975b c = fVar2.mo14356c(0);
                C3975b c2 = fVar2.mo14356c(1);
                C3975b bVar = C3975b.MATCH_CONSTRAINT;
                if (c != bVar || fVar2.f10020k == 1 || c2 != bVar || fVar2.f10022l == 1) {
                    z = false;
                }
                if (!z) {
                    if (c == C3975b.MATCH_CONSTRAINT) {
                        c = C3975b.WRAP_CONTENT;
                    }
                    if (c2 == C3975b.MATCH_CONSTRAINT) {
                        c2 = C3975b.WRAP_CONTENT;
                    }
                    C3995a aVar = this.f10158S0;
                    aVar.f10162a = c;
                    aVar.f10163b = c2;
                    aVar.f10164c = fVar2.mo14316B();
                    this.f10158S0.f10165d = fVar2.mo14381l();
                    V.mo2382a(fVar2, this.f10158S0);
                    if (c == C3975b.WRAP_CONTENT) {
                        fVar2.mo14405w(this.f10158S0.f10166e);
                    }
                    if (c2 == C3975b.WRAP_CONTENT) {
                        fVar2.mo14403v(this.f10158S0.f10167f);
                    }
                    fVar2.mo14401u(this.f10158S0.f10166e);
                    fVar2.mo14384m(this.f10158S0.f10167f);
                    fVar2.mo14378j(this.f10158S0.f10168g);
                }
            }
            i++;
        }
    }

    /* renamed from: Z */
    public boolean mo14498Z() {
        return this.f10155P0;
    }

    /* renamed from: a */
    public void mo14466a(C3976g gVar) {
        mo14286R();
    }

    /* renamed from: b */
    public void mo14446b(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14499d(boolean z) {
        this.f10155P0 = z;
    }

    /* renamed from: e */
    public void mo14500e(int i, int i2) {
        this.f10156Q0 = i;
        this.f10157R0 = i2;
    }

    /* renamed from: z */
    public void mo14294z(int i) {
        this.f10153N0 = i;
        this.f10151L0 = i;
        this.f10154O0 = i;
        this.f10152M0 = i;
    }
}
