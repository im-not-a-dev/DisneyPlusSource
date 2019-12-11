package com.bamtechmedia.dominguez.detail.common;

import android.content.res.Resources;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p287k.C7308b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/TitleTreatmentImpl;", "Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "resources", "Landroid/content/res/Resources;", "imageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "(Landroid/content/res/Resources;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;)V", "bind", "", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "imageView", "Landroid/widget/ImageView;", "updateLayoutParams", "ratio", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.y */
/* compiled from: TitleTreatmentImpl.kt */
public final class C6009y implements C3850c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Resources f13853a;

    /* renamed from: b */
    private final C7159g f13854b;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.y$a */
    /* compiled from: TitleTreatmentImpl.kt */
    static final class C6010a extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6009y f13855c;

        C6010a(C6009y yVar) {
            this.f13855c = yVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo18053a(C7162c cVar) {
            cVar.mo19996e(Integer.valueOf(this.f13855c.f13853a.getDimensionPixelSize(C7308b.detail_title_treatment_max_width)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18053a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    public C6009y(Resources resources, C7159g gVar) {
        this.f13853a = resources;
        this.f13854b = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13768a(com.bamtechmedia.dominguez.core.content.assets.C3626b r3, android.widget.ImageView r4) {
        /*
            r2 = this;
            com.bamtechmedia.dominguez.core.content.j r0 = com.bamtechmedia.dominguez.core.content.C3688j.TITLE_TREATMENT
            com.bamtechmedia.dominguez.core.content.assets.a$a r1 = com.bamtechmedia.dominguez.core.content.assets.C3623a.f9125b0
            com.bamtechmedia.dominguez.core.content.assets.a r1 = r1.mo13248a()
            com.bamtechmedia.dominguez.core.content.assets.Image r3 = r3.mo12845a(r0, r1)
            if (r3 == 0) goto L_0x0015
            com.bamtechmedia.dominguez.core.content.assets.a r0 = r3.mo13087X()
            if (r0 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            com.bamtechmedia.dominguez.core.content.assets.a$a r0 = com.bamtechmedia.dominguez.core.content.assets.C3623a.f9125b0
            com.bamtechmedia.dominguez.core.content.assets.a r0 = r0.mo13248a()
        L_0x001b:
            float r0 = r0.mo13242X()
            r2.m19238a(r4, r0)
            g.e.b.a0.g r0 = r2.f13854b
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r3.mo13085U()
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            com.bamtechmedia.dominguez.detail.common.y$a r1 = new com.bamtechmedia.dominguez.detail.common.y$a
            r1.<init>(r2)
            r0.mo19957a(r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.C6009y.mo13768a(com.bamtechmedia.dominguez.core.content.assets.b, android.widget.ImageView):void");
    }

    /* renamed from: a */
    private final void m19238a(ImageView imageView, float f) {
        if (((float) imageView.getMaxHeight()) * f > ((float) imageView.getMaxWidth())) {
            imageView.getLayoutParams().height = (int) (((float) imageView.getMaxWidth()) / f);
            imageView.getLayoutParams().width = imageView.getMaxWidth();
            return;
        }
        imageView.getLayoutParams().height = imageView.getMaxHeight();
        imageView.getLayoutParams().width = (int) (((float) imageView.getMaxHeight()) * f);
    }
}
