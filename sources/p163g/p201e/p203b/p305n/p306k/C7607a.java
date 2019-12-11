package p163g.p201e.p203b.p305n.p306k;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.p088i.p089n.C3844a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7160a;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p305n.C7587a;
import p163g.p201e.p203b.p305n.C7588b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/editorial/tv/TvEditorialImageLoader;", "Lcom/bamtechmedia/dominguez/editorial/EditorialImageLoader;", "fragment", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageFragment;", "imageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "blurConfig", "Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;", "resources", "Landroid/content/res/Resources;", "(Lcom/bamtechmedia/dominguez/editorial/EditorialPageFragment;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;Landroid/content/res/Resources;)V", "blurredBackground", "Landroid/widget/ImageView;", "getBlurredBackground", "()Landroid/widget/ImageView;", "editorialBackgroundImageView", "getEditorialBackgroundImageView", "loadBackgroundImage", "", "image", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "aspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "loadBlurredBackgroundImage", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.n.k.a */
/* compiled from: TvEditorialImageLoader.kt */
public final class C7607a extends C7587a {

    /* renamed from: b */
    private final C7588b f16620b;

    /* renamed from: c */
    private final C7159g f16621c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3844a f16622d;

    /* renamed from: g.e.b.n.k.a$a */
    /* compiled from: TvEditorialImageLoader.kt */
    static final class C7608a extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C7607a f16623U;

        /* renamed from: c */
        final /* synthetic */ ImageView f16624c;

        C7608a(ImageView imageView, C7607a aVar, String str) {
            this.f16624c = imageView;
            this.f16623U = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20535a(C7162c cVar) {
            cVar.mo19996e(Integer.valueOf(this.f16624c.getMeasuredWidth()));
            cVar.mo19986a(C7161b.JPEG);
            cVar.mo19985a(C7160a.GAUSSIAN);
            cVar.mo19988a(Integer.valueOf(this.f16623U.f16622d.mo13755c()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20535a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    public C7607a(C7588b bVar, C7159g gVar, C3844a aVar, Resources resources) {
        super(resources);
        this.f16620b = bVar;
        this.f16621c = gVar;
        this.f16622d = aVar;
    }

    /* renamed from: b */
    private final ImageView m22586b() {
        View _$_findCachedViewById = this.f16620b._$_findCachedViewById(C5363f.editorialBackgroundImageView);
        if (!(_$_findCachedViewById instanceof ImageView)) {
            _$_findCachedViewById = null;
        }
        return (ImageView) _$_findCachedViewById;
    }

    /* renamed from: a */
    private final ImageView m22583a() {
        return (ImageView) this.f16620b._$_findCachedViewById(C5363f.blurredEditorialBackgroundImageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20523a(Image image, C3623a aVar) {
        ImageView b = m22586b();
        if (b != null) {
            C5763b.m18702a(b, image, C3849b.m12935a(C3849b.f9526a, aVar.mo13242X(), 0, 2, null), null, null, true, false, false, 108, null);
        }
        if (this.f16622d.mo13753a()) {
            m22585a(image);
        }
    }

    /* renamed from: a */
    private final void m22585a(Image image) {
        String U = image != null ? image.mo13085U() : null;
        ImageView a = m22583a();
        if (a != null) {
            this.f16621c.mo19957a(a, U, new C7608a(a, this, U));
        }
    }
}
