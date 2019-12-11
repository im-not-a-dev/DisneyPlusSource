package com.bamtechmedia.dominguez.playback.p254tv.web;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.utils.p223t0.C5878b;
import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14264y;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R$\u0010\f\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvPresenter;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "view", "Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvView;", "okHttpClient", "Lokhttp3/OkHttpClient;", "url", "", "ioScheduler", "Lio/reactivex/Scheduler;", "mainScheduler", "(Lcom/bamtechmedia/dominguez/playback/tv/web/WebContentTvView;Lokhttp3/OkHttpClient;Ljava/lang/String;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "disposable$annotations", "()V", "getDisposable$tv_prodGoogleRelease", "()Lio/reactivex/disposables/Disposable;", "setDisposable$tv_prodGoogleRelease", "(Lio/reactivex/disposables/Disposable;)V", "buildRequest", "Lokhttp3/Request;", "fetchRawHtml", "Lio/reactivex/Single;", "fetchRawHtml$tv_prodGoogleRelease", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.web.WebContentTvPresenter */
/* compiled from: WebContentTvPresenter.kt */
public final class WebContentTvPresenter implements C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C6596f f14880U;

    /* renamed from: V */
    private final OkHttpClient f14881V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final String f14882W;

    /* renamed from: X */
    private final C11969r f14883X;

    /* renamed from: Y */
    private final C11969r f14884Y;

    /* renamed from: c */
    private Disposable f14885c;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.web.WebContentTvPresenter$a */
    /* compiled from: WebContentTvPresenter.kt */
    static final class C6586a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6586a f14886c = new C6586a();

        C6586a() {
        }

        /* renamed from: a */
        public final String apply(Response response) {
            if (!response.mo35863f() || response.mo35855a() == null) {
                throw new C5878b(response);
            }
            C14264y a = response.mo35855a();
            if (a != null) {
                return a.mo36279e();
            }
            return null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.web.WebContentTvPresenter$b */
    /* compiled from: WebContentTvPresenter.kt */
    static final class C6587b<T> implements Consumer<String> {

        /* renamed from: c */
        final /* synthetic */ WebContentTvPresenter f14887c;

        C6587b(WebContentTvPresenter webContentTvPresenter) {
            this.f14887c = webContentTvPresenter;
        }

        /* renamed from: a */
        public final void accept(String str) {
            this.f14887c.f14880U.mo19238a(false);
            C6596f b = this.f14887c.f14880U;
            C12880j.m40222a((Object) str, "rawHtml");
            b.mo19240c(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.web.WebContentTvPresenter$c */
    /* compiled from: WebContentTvPresenter.kt */
    static final class C6588c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ WebContentTvPresenter f14888c;

        C6588c(WebContentTvPresenter webContentTvPresenter) {
            this.f14888c = webContentTvPresenter;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f14888c.f14880U.mo19238a(false);
            StringBuilder sb = new StringBuilder();
            sb.append("Error fetching raw html from ");
            sb.append(this.f14888c.f14882W);
            sb.append('!');
            C14100a.m44528b(th, sb.toString(), new Object[0]);
        }
    }

    public WebContentTvPresenter(C6596f fVar, OkHttpClient okHttpClient, String str, C11969r rVar, C11969r rVar2) {
        this.f14880U = fVar;
        this.f14881V = okHttpClient;
        this.f14882W = str;
        this.f14883X = rVar;
        this.f14884Y = rVar2;
        Disposable b = C11929b.m38493b();
        C12880j.m40222a((Object) b, "Disposables.empty()");
        this.f14885c = b;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        this.f14885c.dispose();
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        String str = this.f14882W;
        if (str != null) {
            this.f14880U.mo19241d(str);
            this.f14880U.mo19238a(true);
            Disposable a = mo19232a(str).mo30211a(this.f14884Y).mo30214a((Consumer<? super T>) new C6587b<Object>(this), (Consumer<? super Throwable>) new C6588c<Object>(this));
            C12880j.m40222a((Object) a, "fetchRawHtml(it)\n       …\")\n                    })");
            this.f14885c = a;
            return;
        }
        throw new AssertionError("No URL parameter provided");
    }

    /* renamed from: b */
    private final Request m20479b(String str) {
        C14113a aVar = new C14113a();
        aVar.mo35847b();
        aVar.mo35848b(str);
        Request a = aVar.mo35846a();
        C12880j.m40222a((Object) a, "Request.Builder()\n      …url)\n            .build()");
        return a;
    }

    /* renamed from: a */
    public final Single<String> mo19232a(String str) {
        Single<String> g = C5879c.m18933a(m20479b(str), this.f14881V).mo30220b(this.f14883X).mo30233g(C6586a.f14886c);
        C12880j.m40222a((Object) g, "buildRequest(url)\n      …)?.string()\n            }");
        return g;
    }
}
