package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import android.widget.ImageView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p330z.C7944c;
import p163g.p201e.p203b.p330z.C7945d;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "", "context", "Landroid/content/Context;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;)V", "parametersBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader$Parameters;", "", "Lkotlin/ExtensionFunctionType;", "download", "Lio/reactivex/Completable;", "entity", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "load", "imageView", "Landroid/widget/ImageView;", "avatar", "remove", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.f */
/* compiled from: AvatarImages.kt */
public final class C6657f {

    /* renamed from: a */
    private final Function1<C7162c, C13145v> f14998a = new C6658a(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f14999b;

    /* renamed from: c */
    private final C7159g f15000c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.f$a */
    /* compiled from: AvatarImages.kt */
    static final class C6658a extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6657f f15001c;

        C6658a(C6657f fVar) {
            this.f15001c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19350a(C7162c cVar) {
            cVar.mo19996e(Integer.valueOf(this.f15001c.f14999b.getResources().getDimensionPixelSize(C7944c.avatar_download_size)));
            cVar.mo19990b(Integer.valueOf(C7945d.fallback_avatar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19350a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    public C6657f(Context context, C7159g gVar) {
        this.f14999b = context;
        this.f15000c = gVar;
    }

    /* renamed from: a */
    public final void mo19349a(ImageView imageView, C6653e eVar) {
        if (imageView != null) {
            this.f15000c.mo19957a(imageView, eVar != null ? eVar.mo19331U() : null, this.f14998a);
        }
    }

    /* renamed from: a */
    public final Completable mo19348a(C6653e eVar) {
        String U = eVar.mo19331U();
        if (U != null) {
            return this.f15000c.mo19958b(U, this.f14998a);
        }
        Completable h = Completable.m38169h();
        C12880j.m40222a((Object) h, "Completable.complete()");
        return h;
    }
}
