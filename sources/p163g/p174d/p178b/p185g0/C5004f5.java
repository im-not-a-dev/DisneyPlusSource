package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import kotlin.C13142s;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10665m;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\nH\u0003J\b\u0010\u0012\u001a\u00020\nH\u0003J\b\u0010\u0013\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/player/delegates/ShutterImageDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "view", "Landroid/view/View;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;Lcom/bamtech/player/PlayerEvents;)V", "uri", "Landroid/net/Uri;", "glideLoadImage", "", "hideShutter", "loadImage", "onPlaybackChanged", "playing", "", "showShutter", "subscribeToOnNewMedia", "subscribeToOnPlaybackChanged", "subscribeToOnShutterImageUriChanged", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.f5 */
/* compiled from: ShutterImageDelegate.kt */
public final class C5004f5 implements C5271z3 {

    /* renamed from: U */
    private final View f12276U;

    /* renamed from: V */
    private final C5300m f12277V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Uri f12278c;

    /* renamed from: g.d.b.g0.f5$a */
    /* compiled from: ShutterImageDelegate.kt */
    static final class C5005a<T> implements Consumer<Uri> {

        /* renamed from: c */
        final /* synthetic */ C5004f5 f12279c;

        C5005a(C5004f5 f5Var) {
            this.f12279c = f5Var;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f12279c.mo16507c();
        }
    }

    /* renamed from: g.d.b.g0.f5$b */
    /* compiled from: ShutterImageDelegate.kt */
    static final class C5006b<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5004f5 f12280c;

        C5006b(C5004f5 f5Var) {
            this.f12280c = f5Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12280c.mo16505a(bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.f5$c */
    /* compiled from: ShutterImageDelegate.kt */
    static final class C5007c<T> implements Consumer<Uri> {

        /* renamed from: c */
        final /* synthetic */ C5004f5 f12281c;

        C5007c(C5004f5 f5Var) {
            this.f12281c = f5Var;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f12281c.f12278c = uri;
        }
    }

    public C5004f5(View view, C5300m mVar) {
        this.f12276U = view;
        this.f12277V = mVar;
        if (this.f12276U != null) {
            m17295g();
            m17293e();
            m17294f();
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: e */
    private final void m17293e() {
        this.f12277V.mo16973U().mo30192f((Consumer<? super T>) new C5005a<Object>(this));
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: f */
    private final void m17294f() {
        this.f12277V.mo17014b0().mo30192f((Consumer<? super T>) new C5006b<Object>(this));
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: g */
    private final void m17295g() {
        this.f12277V.mo17073v0().mo30192f((Consumer<? super T>) new C5007c<Object>(this));
    }

    /* renamed from: b */
    public final void mo16506b() {
        View view = this.f12276U;
        if (view != null && view.getVisibility() == 0) {
            this.f12276U.setVisibility(8);
            this.f12277V.mo17033f(false);
        }
    }

    /* renamed from: c */
    public final void mo16507c() {
        mo16504a();
        mo16508d();
    }

    /* renamed from: d */
    public final void mo16508d() {
        View view = this.f12276U;
        if (view != null && view.getVisibility() != 0) {
            this.f12276U.setVisibility(0);
            this.f12277V.mo17033f(true);
        }
    }

    /* renamed from: a */
    public final void mo16505a(boolean z) {
        if (z) {
            mo16506b();
        }
    }

    /* renamed from: a */
    public final void mo16504a() {
        View view = this.f12276U;
        if (view != null && this.f12278c != null) {
            C10665m a = C10652e.m33421e(view.getContext()).mo19944a(this.f12278c);
            View view2 = this.f12276U;
            if (view2 != null) {
                a.mo27564a((ImageView) view2);
                return;
            }
            throw new C13142s("null cannot be cast to non-null type android.widget.ImageView");
        }
    }
}
