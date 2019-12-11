package p163g.p201e.p203b.p319v;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bumptech.glide.load.p334n.C8227j;
import javax.inject.Provider;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p413f.p414a.p420u.C10731h;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002J\b\u0010%\u001a\u00020&H\u0002R\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00060\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoaderImpl;", "Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "resources", "Landroid/content/res/Resources;", "dictionaryProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "io", "Lio/reactivex/Scheduler;", "(Landroid/content/res/Resources;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Lio/reactivex/Scheduler;)V", "completePurchaseSuffix", "", "getCompletePurchaseSuffix", "()Ljava/lang/String;", "dictionary", "kotlin.jvm.PlatformType", "getDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "welcomeScreenSuffix", "getWelcomeScreenSuffix", "loadBrandLogos", "", "imageView", "Landroid/widget/ImageView;", "loadCompletePurchase", "loadPromoLogo", "logo", "loadRestartSubscription", "loadWelcome", "prefetchCompletePurchase", "Lio/reactivex/Completable;", "prefetchRestartPurchase", "prefetchWelcome", "retrieveMasterIdForKey", "key", "screenSize", "", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.d */
/* compiled from: OnboardingImageLoaderImpl.kt */
public final class C7864d implements C7862c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Resources f16989a;

    /* renamed from: b */
    private final Provider<C3572r0> f16990b;

    /* renamed from: c */
    private final C7159g f16991c;

    /* renamed from: g.e.b.v.d$a */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    private static final class C7865a {
        private C7865a() {
        }

        public /* synthetic */ C7865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.v.d$b */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7866b extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: U */
        final /* synthetic */ ImageView f16992U;

        /* renamed from: c */
        final /* synthetic */ C7864d f16993c;

        C7866b(C7864d dVar, ImageView imageView) {
            this.f16993c = dVar;
            this.f16992U = imageView;
            super(1);
        }

        /* renamed from: a */
        public final void mo20788a(C7162c cVar) {
            float f;
            cVar.mo19987a((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17609c)).mo19934b(Integer.MIN_VALUE));
            Context context = this.f16992U.getContext();
            String str = "imageView.context";
            C12880j.m40222a((Object) context, str);
            if (!C5837i.m18842d(context)) {
                Context context2 = this.f16992U.getContext();
                C12880j.m40222a((Object) context2, str);
                if (!C5837i.m18843e(context2)) {
                    f = ((float) this.f16993c.m23053e()) - (this.f16993c.f16989a.getDimension(C7903s.padding_extra_large) * ((float) 2));
                    cVar.mo19996e(Integer.valueOf((int) f));
                    cVar.mo19986a(C7161b.PNG);
                }
            }
            f = this.f16993c.f16989a.getDimension(C7903s.welcome_brand_logos_width);
            cVar.mo19996e(Integer.valueOf((int) f));
            cVar.mo19986a(C7161b.PNG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20788a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.d$c */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7867c extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7864d f16994c;

        C7867c(C7864d dVar) {
            this.f16994c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20789a(C7162c cVar) {
            cVar.mo19987a((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17609c)).mo19934b(Integer.MIN_VALUE));
            cVar.mo19996e(Integer.valueOf(this.f16994c.m23053e()));
            cVar.mo19986a(C7161b.JPEG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20789a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.d$d */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7868d extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        public static final C7868d f16995c = new C7868d();

        C7868d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20790a(C7162c cVar) {
            cVar.mo19987a((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17609c)).mo19934b(Integer.MIN_VALUE));
            cVar.mo19986a(C7161b.PNG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20790a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.d$e */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7869e extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7864d f16996c;

        C7869e(C7864d dVar) {
            this.f16996c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20791a(C7162c cVar) {
            cVar.mo19987a((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17609c)).mo19934b(Integer.MIN_VALUE));
            cVar.mo19996e(Integer.valueOf(this.f16996c.m23053e()));
            cVar.mo19986a(C7161b.JPEG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20791a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.d$f */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7870f extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7864d f16997c;

        C7870f(C7864d dVar) {
            this.f16997c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20792a(C7162c cVar) {
            cVar.mo19987a((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17609c)).mo19934b(Integer.MIN_VALUE));
            cVar.mo19996e(Integer.valueOf(this.f16997c.m23053e()));
            cVar.mo19986a(C7161b.JPEG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20792a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.d$g */
    /* compiled from: OnboardingImageLoaderImpl.kt */
    static final class C7871g extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7864d f16998c;

        C7871g(C7864d dVar) {
            this.f16998c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20793a(C7162c cVar) {
            cVar.mo19987a((C10731h) new C10731h().mo19928a(C8227j.f17609c));
            cVar.mo19996e(Integer.valueOf(this.f16998c.m23053e()));
            cVar.mo19986a(C7161b.JPEG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20793a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7865a(null);
    }

    public C7864d(Resources resources, Provider<C3572r0> provider, C7159g gVar, C11969r rVar) {
        this.f16989a = resources;
        this.f16990b = provider;
        this.f16991c = gVar;
    }

    /* renamed from: c */
    private final C3572r0 m23051c() {
        return (C3572r0) this.f16990b.get();
    }

    /* renamed from: d */
    private final String m23052d() {
        String string = this.f16989a.getString(C7906v.welcome_screen_suffix);
        C12880j.m40222a((Object) string, "resources.getString(R.st…ng.welcome_screen_suffix)");
        return string;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final int m23053e() {
        return this.f16989a.getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    private final String m23050b() {
        String string = this.f16989a.getString(C7906v.complete_purchase_suffix);
        C12880j.m40222a((Object) string, "resources.getString(R.st…complete_purchase_suffix)");
        return string;
    }

    /* renamed from: a */
    public void mo20783a(ImageView imageView) {
        C3572r0 c = m23051c();
        StringBuilder sb = new StringBuilder();
        sb.append("image_welcome_background_unauthenticated_");
        sb.append(m23052d());
        this.f16991c.mo19957a(imageView, C3573a.m12037b(c, sb.toString(), null, 2, null), new C7870f(this));
    }

    /* renamed from: c */
    public void mo20786c(ImageView imageView) {
        this.f16991c.mo19957a(imageView, m23048a("image_welcome_background_authenticated_unentitled_new"), new C7867c(this));
    }

    /* renamed from: d */
    public void mo20787d(ImageView imageView) {
        this.f16991c.mo19957a(imageView, m23048a("image_welcome_background_authenticated_unentitled_returning"), new C7869e(this));
    }

    /* renamed from: b */
    public void mo20785b(ImageView imageView) {
        this.f16991c.mo19957a(imageView, C3573a.m12037b(m23051c(), "image_welcome_brandlogos_unauthenticated", null, 2, null), new C7866b(this, imageView));
    }

    /* renamed from: a */
    public void mo20784a(ImageView imageView, String str) {
        this.f16991c.mo19957a(imageView, C3573a.m12037b(m23051c(), str, null, 2, null), C7868d.f16995c);
    }

    /* renamed from: a */
    public Completable mo20782a() {
        C3572r0 c = m23051c();
        StringBuilder sb = new StringBuilder();
        sb.append("image_welcome_background_unauthenticated_");
        sb.append(m23052d());
        return this.f16991c.mo19959c(C3573a.m12037b(c, sb.toString(), null, 2, null), new C7871g(this));
    }

    /* renamed from: a */
    private final String m23048a(String str) {
        C3572r0 c = m23051c();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(m23050b());
        return C3573a.m12037b(c, sb.toString(), null, 2, null);
    }
}
