package p163g.p441i.p442a.p443a.p446s;

import java.io.IOException;
import p163g.p441i.p442a.p443a.C10903f;
import p163g.p441i.p442a.p443a.C10903f.C10904a;
import p163g.p441i.p442a.p443a.C10910l;
import p163g.p441i.p442a.p443a.C10912n;
import p163g.p441i.p442a.p443a.p444q.C10915a;
import p163g.p441i.p442a.p443a.p445r.C10916a;
import p163g.p441i.p442a.p443a.p445r.C10917b;
import p163g.p441i.p442a.p443a.p445r.C10918c;
import p163g.p441i.p442a.p443a.p448u.C10937d;

/* renamed from: g.i.a.a.s.b */
/* compiled from: JsonGeneratorImpl */
public abstract class C10925b extends C10915a {

    /* renamed from: e0 */
    protected static final int[] f25937e0 = C10916a.m34448c();

    /* renamed from: Y */
    protected final C10918c f25938Y;

    /* renamed from: Z */
    protected int[] f25939Z = f25937e0;

    /* renamed from: a0 */
    protected int f25940a0;

    /* renamed from: b0 */
    protected C10917b f25941b0;

    /* renamed from: c0 */
    protected C10912n f25942c0 = C10937d.f25990c;

    /* renamed from: d0 */
    protected boolean f25943d0;

    public C10925b(C10918c cVar, int i, C10910l lVar) {
        super(i, lVar);
        this.f25938Y = cVar;
        if (C10904a.ESCAPE_NON_ASCII.mo28068a(i)) {
            this.f25940a0 = 127;
        }
        this.f25943d0 = !C10904a.QUOTE_FIELD_NAMES.mo28068a(i);
    }

    /* renamed from: a */
    public C10903f mo28137a(C10917b bVar) {
        this.f25941b0 = bVar;
        if (bVar == null) {
            this.f25939Z = f25937e0;
        } else {
            this.f25939Z = bVar.mo28106a();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28138b(String str, int i) throws IOException {
        if (i != 0) {
            if (i == 1) {
                this.f25860c.mo28093c(this);
            } else if (i == 2) {
                this.f25860c.mo28098h(this);
            } else if (i == 3) {
                this.f25860c.mo28091b(this);
            } else if (i != 5) {
                mo28036a();
                throw null;
            } else {
                mo28140k(str);
                throw null;
            }
        } else if (this.f25902X.mo28084d()) {
            this.f25860c.mo28096f(this);
        } else if (this.f25902X.mo28085e()) {
            this.f25860c.mo28094d(this);
        }
    }

    /* renamed from: c */
    public C10903f mo28139c(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f25940a0 = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo28140k(String str) throws IOException {
        mo28059e(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.f25902X.mo28086f()}));
        throw null;
    }

    /* renamed from: a */
    public C10903f mo28136a(C10912n nVar) {
        this.f25942c0 = nVar;
        return this;
    }

    /* renamed from: a */
    public final void mo28045a(String str, String str2) throws IOException {
        mo28063g(str);
        mo28066j(str2);
    }
}
