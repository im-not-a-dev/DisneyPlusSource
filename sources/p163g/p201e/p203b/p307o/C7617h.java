package p163g.p201e.p203b.p307o;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import kotlin.Metadata;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.C7558p;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7628b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/error/ErrorRouterImpl;", "Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;", "fullscreenDialogFactory", "Lcom/bamtechmedia/dominguez/dialogs/FullscreenDialogFactory;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "(Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;Lcom/bamtechmedia/dominguez/dialogs/FullscreenDialogFactory;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "showErrorDialog", "", "throwable", "", "showGlobalError", "errorMessage", "", "showGlobalErrorDialog", "Provider", "error_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.o.h */
/* compiled from: ErrorRouterImpl.kt */
public final class C7617h implements C7626a {

    /* renamed from: a */
    private final C5792f f16628a;

    /* renamed from: b */
    private final C7558p f16629b;

    /* renamed from: c */
    private final C7614e f16630c;

    /* renamed from: d */
    private final C7547h f16631d;

    /* renamed from: g.e.b.o.h$a */
    /* compiled from: ErrorRouterImpl.kt */
    public static final class C7618a implements C7628b {

        /* renamed from: a */
        private final C7558p f16632a;

        /* renamed from: b */
        private final C7614e f16633b;

        /* renamed from: c */
        private final C7547h f16634c;

        public C7618a(C7558p pVar, C7614e eVar, C7547h hVar) {
            this.f16632a = pVar;
            this.f16633b = eVar;
            this.f16634c = hVar;
        }

        /* renamed from: a */
        public C7626a mo20542a(Fragment fragment, int i) {
            return new C7617h(C5792f.f13565c.mo17699a(fragment, i), this.f16632a, this.f16633b, this.f16634c);
        }
    }

    public C7617h(C5792f fVar, C7558p pVar, C7614e eVar, C7547h hVar) {
        this.f16628a = fVar;
        this.f16629b = pVar;
        this.f16630c = eVar;
        this.f16631d = hVar;
    }

    /* renamed from: a */
    public void mo20539a(String str) {
        C5792f fVar = this.f16628a;
        C7558p pVar = this.f16629b;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C7621k.account_one_id_error);
        aVar.mo20485i(str);
        aVar.mo20484i(Integer.valueOf(C7623m.error_generic));
        aVar.mo20480g(Integer.valueOf(C7623m.btn_ok));
        aVar.mo20482h(Integer.valueOf(C7624n.FullscreenDialog_WithAppBackground));
        C5792f.m18757a(fVar, pVar.mo20493a(aVar.mo20465a()), true, null, null, null, 28, null);
    }

    /* renamed from: b */
    public void mo20541b(String str) {
        C7547h hVar = this.f16631d;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C7621k.account_one_id_error);
        aVar.mo20485i(str);
        aVar.mo20484i(Integer.valueOf(C7623m.error_generic));
        aVar.mo20480g(Integer.valueOf(C7623m.btn_ok));
        aVar.mo20482h(Integer.valueOf(C7624n.FullscreenDialog_WithAppBackground));
        hVar.mo20488a(aVar.mo20465a());
    }

    /* renamed from: a */
    public void mo20540a(Throwable th) {
        mo20541b(this.f16630c.mo20537a(th));
    }
}
