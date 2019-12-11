package com.bamtechmedia.dominguez.ripcut.glide;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.ripcut.cache.C7120c;
import com.bamtechmedia.dominguez.ripcut.cache.C7120c.C7121a;
import com.bumptech.glide.load.C8106b;
import com.bumptech.glide.load.p341p.p344e.C8402c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p275a0.C7152e;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p275a0.p276k.C7170a;
import p163g.p201e.p203b.p275a0.p276k.C7175e;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10665m;
import p163g.p413f.p414a.C10667n;
import p163g.p413f.p414a.C10670o;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p420u.C10731h;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJJ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b 2\b\b\u0002\u0010!\u001a\u00020\u0012H\bJ \u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001eH\u0002J)\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J1\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0002J+\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J3\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J3\u0010+\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010/2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J)\u00100\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J)\u00101\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016J\u0010\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\u001eH\u0002J)\u00104\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/glide/RipcutGlideImageLoader;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "context", "Landroid/content/Context;", "uriFactory", "Lcom/bamtechmedia/dominguez/ripcut/uri/CachedRipcutUriFactory;", "activityManager", "Landroid/app/ActivityManager;", "uriCaching", "Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching;", "config", "Lcom/bamtechmedia/dominguez/ripcut/RipcutConfig;", "prefetchScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/ripcut/uri/CachedRipcutUriFactory;Landroid/app/ActivityManager;Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching;Lcom/bamtechmedia/dominguez/ripcut/RipcutConfig;Lio/reactivex/Scheduler;)V", "availableMemory", "", "preferRgb565", "", "getPreferRgb565", "()Z", "createRequest", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "masterId", "", "parametersBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader$Parameters;", "", "Lkotlin/ExtensionFunctionType;", "includeTransition", "createUri", "Landroid/net/Uri;", "parameters", "download", "Lio/reactivex/Completable;", "downloadAction", "action", "Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching$Action;", "getCachedUri", "loadImage", "imageView", "Landroid/widget/ImageView;", "notificationTarget", "Lcom/bumptech/glide/request/target/NotificationTarget;", "prefetch", "removeDownload", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "submit", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ripcut.glide.f */
/* compiled from: RipcutGlideImageLoader.kt */
public final class C7136f implements C7159g {

    /* renamed from: a */
    private final long f15771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f15772b;

    /* renamed from: c */
    private final C7170a f15773c;

    /* renamed from: d */
    private final C7120c f15774d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7152e f15775e;

    /* renamed from: f */
    private final C11969r f15776f;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.glide.f$a */
    /* compiled from: RipcutGlideImageLoader.kt */
    static final class C7137a<V> implements Callable<CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ String f15777U;

        /* renamed from: V */
        final /* synthetic */ Function1 f15778V;

        /* renamed from: c */
        final /* synthetic */ C7136f f15779c;

        C7137a(C7136f fVar, String str, Function1 function1) {
            this.f15779c = fVar;
            this.f15777U = str;
            this.f15778V = function1;
        }

        public final Completable call() {
            C7136f fVar = this.f15779c;
            Context b = fVar.f15772b;
            C10667n e = C10652e.m33421e(this.f15779c.f15772b);
            C12880j.m40222a((Object) e, "Glide.with(context)");
            String str = this.f15777U;
            Function1 function1 = this.f15778V;
            C7162c cVar = new C7162c();
            function1.invoke(cVar);
            Uri a = fVar.m21647a(b, str, cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("Loading image: ");
            sb.append(a);
            C14100a.m44529c(sb.toString(), new Object[0]);
            C10723a a2 = e.mo19944a(a).mo19941a(cVar.mo20005m()).m33481a((C10723a<?>) fVar.m21651a(cVar)).mo19924a(fVar.m21653a() ? C8106b.PREFER_RGB_565 : C8106b.f17363V);
            C12880j.m40222a((Object) a2, "requestManager.load(uri)…FER_RGB_565 else DEFAULT)");
            C10665m mVar = (C10665m) a2;
            if (cVar.mo20000h() != null) {
                C10670o h = cVar.mo20000h();
                if (h != null) {
                    C12880j.m40222a((Object) mVar.mo19940a(h), "builder.transition(requi…errideTransitionOptions))");
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            return Completable.m38155a((Future<?>) mVar.mo27561F());
        }
    }

    public C7136f(Context context, C7170a aVar, ActivityManager activityManager, C7120c cVar, C7152e eVar, C11969r rVar) {
        this.f15772b = context;
        this.f15773c = aVar;
        this.f15774d = cVar;
        this.f15775e = eVar;
        this.f15776f = rVar;
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.f15771a = memoryInfo.availMem;
    }

    /* renamed from: d */
    public Uri mo19960d(String str, Function1<? super C7162c, C13145v> function1) {
        C7162c cVar = new C7162c();
        function1.invoke(cVar);
        return this.f15773c.mo20011a(new C7175e(str, this.f15772b, cVar));
    }

    /* renamed from: b */
    public Completable mo19958b(String str, Function1<? super C7162c, C13145v> function1) {
        return m21652a(C7121a.DOWNLOAD, str, function1);
    }

    /* renamed from: c */
    public Completable mo19959c(String str, Function1<? super C7162c, C13145v> function1) {
        Completable b = Completable.m38162b((Callable<? extends CompletableSource>) new C7137a<Object>(this, str, function1)).mo30051b(this.f15776f);
        C12880j.m40222a((Object) b, "Completable.defer {\n    …ribeOn(prefetchScheduler)");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m21653a() {
        return this.f15771a <= this.f15775e.mo19975c() || VERSION.SDK_INT < this.f15775e.mo19976d();
    }

    /* renamed from: a */
    public void mo19957a(ImageView imageView, String str, Function1<? super C7162c, C13145v> function1) {
        boolean z = true;
        Integer num = null;
        if (!(str == null || str.length() == 0)) {
            Context context = imageView.getContext();
            C12880j.m40222a((Object) context, "imageView.context");
            C10667n a = C10652e.m33414a((View) imageView);
            C12880j.m40222a((Object) a, "Glide.with(imageView)");
            C7162c cVar = new C7162c();
            function1.invoke(cVar);
            Uri a2 = m21647a(context, str, cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("Loading image: ");
            sb.append(a2);
            C14100a.m44529c(sb.toString(), new Object[0]);
            C10723a a3 = a.mo19944a(a2).mo19941a(cVar.mo20005m()).m33481a((C10723a<?>) m21651a(cVar)).mo19924a(m21653a() ? C8106b.PREFER_RGB_565 : C8106b.f17363V);
            C12880j.m40222a((Object) a3, "requestManager.load(uri)…FER_RGB_565 else DEFAULT)");
            C10665m mVar = (C10665m) a3;
            if (cVar.mo20000h() != null) {
                C10670o h = cVar.mo20000h();
                if (h != null) {
                    C12880j.m40222a((Object) mVar.mo19940a(h), "builder.transition(requi…errideTransitionOptions))");
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (cVar.mo19995e() == C7161b.JPEG) {
                Integer b = this.f15775e.mo19974b();
                if (b != null) {
                    if (b.intValue() == 0) {
                        z = false;
                    }
                    if (z) {
                        num = b;
                    }
                }
                if (num != null) {
                    mVar.mo19940a((C10670o<?, ? super TranscodeType>) C8402c.m24423b(num.intValue()));
                }
            }
            C12880j.m40222a((Object) mVar.mo27564a(imageView), "createRequest(\n         …        ).into(imageView)");
            return;
        }
        C7162c cVar2 = new C7162c();
        function1.invoke(cVar2);
        Integer d = cVar2.mo19993d();
        if (C12880j.m40224a((Object) d, (Object) Integer.valueOf(0))) {
            d = null;
        }
        if (d != null) {
            imageView.setImageResource(d.intValue());
        } else {
            imageView.setImageDrawable(cVar2.mo19991c());
        }
    }

    /* renamed from: a */
    public Drawable mo19956a(String str, Function1<? super C7162c, C13145v> function1) {
        Context context = this.f15772b;
        C10667n e = C10652e.m33421e(context);
        C12880j.m40222a((Object) e, "Glide.with(context)");
        C7162c cVar = new C7162c();
        function1.invoke(cVar);
        Uri a = m21647a(context, str, cVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading image: ");
        sb.append(a);
        C14100a.m44529c(sb.toString(), new Object[0]);
        C10723a a2 = e.mo19944a(a).mo19941a(cVar.mo20005m()).m33481a((C10723a<?>) m21651a(cVar)).mo19924a(m21653a() ? C8106b.PREFER_RGB_565 : C8106b.f17363V);
        C12880j.m40222a((Object) a2, "requestManager.load(uri)…FER_RGB_565 else DEFAULT)");
        C10665m mVar = (C10665m) a2;
        if (cVar.mo20000h() != null) {
            C10670o h = cVar.mo20000h();
            if (h != null) {
                C12880j.m40222a((Object) mVar.mo19940a(h), "builder.transition(requi…errideTransitionOptions))");
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Object obj = mVar.mo27561F().get();
        C12880j.m40222a(obj, "createRequest(context, G…tersBlock).submit().get()");
        return (Drawable) obj;
    }

    /* renamed from: a */
    private final Completable m21652a(C7121a aVar, String str, Function1<? super C7162c, C13145v> function1) {
        C7162c cVar = new C7162c();
        function1.invoke(cVar);
        Uri a = m21647a(this.f15772b, str, cVar);
        String scheme = a.getScheme();
        if (scheme != null) {
            if (scheme == null) {
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            } else if (scheme.contentEquals("file")) {
                Completable h = Completable.m38169h();
                C12880j.m40222a((Object) h, "Completable.complete()");
                return h;
            }
        }
        return this.f15774d.mo19909a(aVar, a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Uri m21647a(Context context, String str, C7162c cVar) {
        return this.f15773c.mo20012b(new C7175e(str, context, cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10731h m21651a(C7162c cVar) {
        C10731h g = cVar.mo19999g();
        if (g == null) {
            g = new C10731h();
        }
        Integer j = cVar.mo20002j();
        if (C12880j.m40224a((Object) j, (Object) Integer.valueOf(0))) {
            j = null;
        }
        if (j != null) {
            C10731h hVar = (C10731h) g.mo19937c(j.intValue());
        }
        Drawable i = cVar.mo20001i();
        if (i != null) {
            C10731h hVar2 = (C10731h) g.mo19935b(i);
        }
        Integer d = cVar.mo19993d();
        if (C12880j.m40224a((Object) d, (Object) Integer.valueOf(0))) {
            d = null;
        }
        if (d != null) {
            C10731h hVar3 = (C10731h) g.mo19921a(d.intValue());
        }
        Drawable c = cVar.mo19991c();
        if (c != null) {
            C10731h hVar4 = (C10731h) g.mo19923a(c);
        }
        return g;
    }
}
