package com.bamtechmedia.dominguez.detail.common.formats;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p287k.C7308b;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0000¢\u0006\u0002\b\u0015J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesStringBuilder;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "resources", "Landroid/content/res/Resources;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Landroid/content/res/Resources;)V", "height", "", "formatForImage", "Landroid/text/Spannable;", "format", "Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeatureData;", "formatForText", "", "mapDictionary", "Lio/reactivex/Single;", "formats", "", "mapDictionary$contentDetail_release", "appendSpacerIfEmpty", "", "Landroid/text/SpannableStringBuilder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.formats.c */
/* compiled from: AvailableFeaturesStringBuilder.kt */
public final class C5935c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f13739a;

    /* renamed from: b */
    private final C3572r0 f13740b;

    /* renamed from: c */
    private final C7159g f13741c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.c$a */
    /* compiled from: AvailableFeaturesStringBuilder.kt */
    static final class C5936a extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5935c f13742c;

        C5936a(C5935c cVar) {
            this.f13742c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17863a(C7162c cVar) {
            cVar.mo19994d(Integer.valueOf(this.f13742c.f13739a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17863a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.c$b */
    /* compiled from: AvailableFeaturesStringBuilder.kt */
    static final class C5937b<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ List f13743U;

        /* renamed from: c */
        final /* synthetic */ C5935c f13744c;

        C5937b(C5935c cVar, List list) {
            this.f13744c = cVar;
            this.f13743U = list;
        }

        public final SpannableStringBuilder call() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C5928a aVar : this.f13743U) {
                this.f13744c.m19049a(spannableStringBuilder);
                if (aVar.mo17852d()) {
                    spannableStringBuilder.append(this.f13744c.m19047a(aVar));
                } else {
                    spannableStringBuilder.append(this.f13744c.m19051b(aVar));
                }
            }
            return spannableStringBuilder;
        }
    }

    public C5935c(C3572r0 r0Var, C7159g gVar, Resources resources) {
        this.f13740b = r0Var;
        this.f13741c = gVar;
        this.f13739a = resources.getDimensionPixelOffset(C7308b.content_detail_available_feature_height);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final CharSequence m19051b(C5928a aVar) {
        return C3573a.m12037b(this.f13740b, aVar.mo17849a(), null, 2, null);
    }

    /* renamed from: a */
    public final Single<CharSequence> mo17862a(List<C5928a> list) {
        Single<CharSequence> c = Single.m38401c((Callable<? extends T>) new C5937b<Object>(this, list));
        C12880j.m40222a((Object) c, "Single.fromCallable {\n  …leStringBuilder\n        }");
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Spannable m19047a(C5928a aVar) {
        String b = C3573a.m12037b(this.f13740b, aVar.mo17849a(), null, 2, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
        Drawable a = this.f13741c.mo19956a(b, new C5936a(this));
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        int a2 = C12833x.m40132a((CharSequence) spannableStringBuilder, b, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new ImageSpan(a, 1), a2, b.length() + a2, 33);
        return spannableStringBuilder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19049a(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append(" • ");
        }
    }
}
