package com.bamtechmedia.dominguez.detail.common.p230g0;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7160a;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p287k.C7309c;
import p163g.p201e.p203b.p287k.C7310d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;", "", "imageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "config", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "loadBackgroundImage", "", "backgroundImageView", "Landroid/widget/ImageView;", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "blurred", "", "onDataLoaded", "fragment", "Landroidx/fragment/app/Fragment;", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.e */
/* compiled from: DetailImageLoader.kt */
public final class C5951e {
    @Deprecated

    /* renamed from: c */
    public static final C5952a f13759c = new C5952a(null);

    /* renamed from: a */
    private final C7159g f13760a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5948c f13761b;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.e$a */
    /* compiled from: DetailImageLoader.kt */
    private static final class C5952a {
        private C5952a() {
        }

        public /* synthetic */ C5952a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.e$b */
    /* compiled from: DetailImageLoader.kt */
    static final class C5953b extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: U */
        final /* synthetic */ ImageView f13762U;

        /* renamed from: V */
        final /* synthetic */ boolean f13763V;

        /* renamed from: c */
        final /* synthetic */ C5951e f13764c;

        C5953b(C5951e eVar, ImageView imageView, boolean z) {
            this.f13764c = eVar;
            this.f13762U = imageView;
            this.f13763V = z;
            super(1);
        }

        /* renamed from: a */
        public final void mo17886a(C7162c cVar) {
            Resources resources = this.f13762U.getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "backgroundImageView.resources");
            cVar.mo19996e(Integer.valueOf(resources.getDisplayMetrics().widthPixels));
            cVar.mo19986a(C7161b.JPEG);
            Integer valueOf = Integer.valueOf(C7309c.fallback_1_78_tile);
            valueOf.intValue();
            if (this.f13763V) {
                valueOf = null;
            }
            cVar.mo19990b(valueOf);
            cVar.mo19983a(this.f13762U.getDrawable());
            C7160a aVar = C7160a.GAUSSIAN;
            if (!this.f13763V) {
                aVar = null;
            }
            cVar.mo19985a(aVar);
            Integer valueOf2 = Integer.valueOf(this.f13764c.f13761b.mo13755c());
            valueOf2.intValue();
            if (!this.f13763V) {
                valueOf2 = null;
            }
            cVar.mo19988a(valueOf2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17886a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.e$c */
    /* compiled from: DetailImageLoader.kt */
    static final class C5954c extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        public static final C5954c f13765c = new C5954c();

        C5954c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17887a(C7162c cVar) {
            C5951e.f13759c;
            cVar.mo19998f(Integer.valueOf(256));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17887a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    public C5951e(C7159g gVar, C5948c cVar) {
        this.f13760a = gVar;
        this.f13761b = cVar;
    }

    /* renamed from: a */
    public final void mo17885a(Fragment fragment, C3626b bVar) {
        ImageView imageView = (ImageView) fragment.getView().findViewById(C7310d.contentDetailBackgroundImage);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "fragment.contentDetailBackgroundImage");
        m19097a(this, imageView, bVar, false, 4, null);
        if (VERSION.SDK_INT >= this.f13761b.mo13754b()) {
            ImageView imageView2 = (ImageView) fragment.getView().findViewById(C7310d.contentDetailBlurredBackgroundImage);
            Intrinsics.checkReturnedValueIsNotNull((Object) imageView2, "fragment.contentDetailBlurredBackgroundImage");
            m19096a(imageView2, bVar, true);
        }
        Image a = bVar.mo12845a(C3688j.TITLE_TREATMENT, C3623a.f9125b0.mo13248a());
        C7159g gVar = this.f13760a;
        ImageView imageView3 = (ImageView) fragment.getView().findViewById(C7310d.includeTitleImage);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView3, "fragment.includeTitleImage");
        gVar.mo19957a(imageView3, a != null ? a.mo13085U() : null, C5954c.f13765c);
    }

    /* renamed from: a */
    static /* synthetic */ void m19097a(C5951e eVar, ImageView imageView, C3626b bVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        eVar.m19096a(imageView, bVar, z);
    }

    /* renamed from: a */
    private final void m19096a(ImageView imageView, C3626b bVar, boolean z) {
        imageView.setTag(C7310d.background_blurred, Boolean.valueOf(z));
        Image a = bVar.mo12845a(C3688j.BACKGROUND_DETAILS, C3623a.f9125b0.mo13248a());
        this.f13760a.mo19957a(imageView, a != null ? a.mo13085U() : null, new C5953b(this, imageView, z));
    }
}
