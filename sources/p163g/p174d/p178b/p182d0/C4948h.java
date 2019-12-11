package p163g.p174d.p178b.p182d0;

import java.util.Iterator;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p185g0.C5271z3;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.d0.h */
/* compiled from: PlaybackRangeDelegate */
public class C4948h implements C5271z3 {

    /* renamed from: U */
    private C5300m f12107U;

    /* renamed from: V */
    C4949i f12108V;

    /* renamed from: W */
    Iterator<C4946g> f12109W;

    /* renamed from: X */
    C4946g f12110X;

    /* renamed from: c */
    private C5326w f12111c;

    public C4948h(C5326w wVar, C5300m mVar) {
        this.f12111c = wVar;
        this.f12107U = mVar;
        mVar.mo16938C0().mo30192f((Consumer<? super T>) new C4945f<Object>(this));
        mVar.mo17039g0().mo30192f((Consumer<? super T>) new C4941b<Object>(this));
        mVar.mo17049j0().mo30192f((Consumer<? super T>) new C4944e<Object>(this));
        mVar.mo17067s0().mo30192f((Consumer<? super T>) new C4942c<Object>(this));
        mVar.mo17030f().mo16908j().mo30192f((Consumer<? super T>) new C4943d<Object>(this));
        mVar.mo17030f().mo16898e().mo30192f((Consumer<? super T>) new C4940a<Object>(this));
    }

    /* renamed from: b */
    private void m17121b() {
        if (this.f12109W.hasNext()) {
            this.f12110X = (C4946g) this.f12109W.next();
            this.f12111c.mo7602a(this.f12110X.f12106c);
            return;
        }
        if (this.f12111c.mo7617c()) {
            this.f12111c.mo7635p();
        }
        m17120a();
    }

    /* renamed from: c */
    private void m17122c() {
        this.f12109W = this.f12108V.iterator();
        this.f12110X = (C4946g) this.f12109W.next();
        this.f12111c.mo7602a(this.f12110X.f12106c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16349a(boolean z) {
        if (this.f12110X != null) {
            long currentPosition = this.f12111c.getCurrentPosition();
            C4946g gVar = this.f12110X;
            if (currentPosition == gVar.f12106c) {
                this.f12107U.mo16990a(gVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16347a(C4949i iVar) {
        this.f12108V = iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16346a(long j) {
        C4949i iVar = this.f12108V;
        if (!(iVar == null || iVar.size() == 0)) {
            C4946g gVar = this.f12110X;
            if (gVar == null) {
                m17122c();
                return;
            }
            if (j > gVar.f12106c) {
                this.f12107U.mo17006b(gVar);
            }
            if (j >= this.f12110X.f12105U) {
                m17121b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16348a(Object obj) {
        m17120a();
    }

    /* renamed from: a */
    private void m17120a() {
        this.f12107U.mo16956L0();
        this.f12108V = null;
        this.f12110X = null;
        this.f12109W = null;
    }
}
