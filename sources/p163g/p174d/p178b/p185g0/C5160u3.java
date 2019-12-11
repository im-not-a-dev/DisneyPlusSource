package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p413f.p414a.C10652e;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\fJ\b\u0010\u0012\u001a\u00020\fH\u0003J\b\u0010\u0013\u001a\u00020\fH\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/player/delegates/BrandLogoDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "view", "Landroid/view/View;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;Lcom/bamtech/player/PlayerEvents;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "getView", "()Landroid/view/View;", "glideLoadImage", "", "uri", "Landroid/net/Uri;", "hideBranding", "loadImage", "showBranding", "subscribeToAdEvents", "subscribeToOnBrandLogoUriChanged", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.u3 */
/* compiled from: BrandLogoDelegate.kt */
public final class C5160u3 implements C5271z3 {

    /* renamed from: U */
    private final C5300m f12476U;

    /* renamed from: c */
    private final View f12477c;

    /* renamed from: g.d.b.g0.u3$a */
    /* compiled from: BrandLogoDelegate.kt */
    static final class C5161a<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5160u3 f12478c;

        C5161a(C5160u3 u3Var) {
            this.f12478c = u3Var;
        }

        public final void accept(Object obj) {
            this.f12478c.mo16656a();
        }
    }

    /* renamed from: g.d.b.g0.u3$b */
    /* compiled from: BrandLogoDelegate.kt */
    static final class C5162b<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5160u3 f12479c;

        C5162b(C5160u3 u3Var) {
            this.f12479c = u3Var;
        }

        public final void accept(Object obj) {
            this.f12479c.mo16658b();
        }
    }

    /* renamed from: g.d.b.g0.u3$c */
    /* compiled from: BrandLogoDelegate.kt */
    static final class C5163c<T> implements Consumer<Uri> {

        /* renamed from: c */
        final /* synthetic */ C5160u3 f12480c;

        C5163c(C5160u3 u3Var) {
            this.f12480c = u3Var;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f12480c.mo16659b(uri);
        }
    }

    public C5160u3(View view, C5300m mVar) {
        this.f12477c = view;
        this.f12476U = mVar;
        if (this.f12477c != null) {
            m17472d();
            m17471c();
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: c */
    private final void m17471c() {
        this.f12476U.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5161a<Object>(this));
        this.f12476U.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C5162b<Object>(this));
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    private final void m17472d() {
        this.f12476U.mo17064r().mo30192f((Consumer<? super T>) new C5163c<Object>(this));
    }

    /* renamed from: a */
    public final void mo16656a() {
        View view = this.f12477c;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo16658b() {
        View view = this.f12477c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo16657a(Uri uri) {
        View view = this.f12477c;
        if (view != null && (view instanceof ImageView)) {
            C10652e.m33421e(((ImageView) view).getContext()).mo19944a(uri).mo27564a((ImageView) this.f12477c);
        }
    }

    /* renamed from: b */
    public final void mo16659b(Uri uri) {
        mo16657a(uri);
        mo16658b();
    }
}
