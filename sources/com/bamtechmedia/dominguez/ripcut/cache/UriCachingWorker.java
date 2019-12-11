package com.bamtechmedia.dominguez.ripcut.cache;

import android.content.Context;
import android.net.Uri;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.RxWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.bamtechmedia.dominguez.ripcut.cache.C7120c.C7121a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/cache/UriCachingWorker;", "Landroidx/work/RxWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "uriCaching", "Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching;)V", "remoteUri", "Landroid/net/Uri;", "getRemoteUri", "()Landroid/net/Uri;", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "Factory", "Helper", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UriCachingWorker.kt */
public final class UriCachingWorker extends RxWorker {

    /* renamed from: c */
    private final C7120c f15741c;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.UriCachingWorker$a */
    /* compiled from: UriCachingWorker.kt */
    public static final class C7113a extends WorkerFactory {

        /* renamed from: b */
        private final Provider<C7120c> f15742b;

        public C7113a(Provider<C7120c> provider) {
            this.f15742b = provider;
        }

        /* renamed from: a */
        public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
            if (!Intrinsics.areEqual((Object) str, (Object) UriCachingWorker.class.getCanonicalName())) {
                return null;
            }
            Object obj = this.f15742b.get();
            Intrinsics.checkReturnedValueIsNotNull(obj, "actionsProvider.get()");
            return new UriCachingWorker(context, workerParameters, (C7120c) obj);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.UriCachingWorker$b */
    /* compiled from: UriCachingWorker.kt */
    static final class C7114b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7114b f15743c = new C7114b();

        C7114b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.UriCachingWorker$c */
    /* compiled from: UriCachingWorker.kt */
    static final class C7115c<T, R> implements Function<Throwable, Result> {

        /* renamed from: c */
        public static final C7115c f15744c = new C7115c();

        C7115c() {
        }

        /* renamed from: a */
        public final Result apply(Throwable th) {
            return Result.m5469b();
        }
    }

    public UriCachingWorker(Context context, WorkerParameters workerParameters, C7120c cVar) {
        super(context, workerParameters);
        this.f15741c = cVar;
    }

    /* renamed from: c */
    private final Uri m21511c() {
        Uri parse = Uri.parse(getInputData().mo5584a("url"));
        Intrinsics.checkReturnedValueIsNotNull((Object) parse, "Uri.parse(inputData.getString(\"url\"))");
        return parse;
    }

    /* renamed from: a */
    public Single<Result> mo5623a() {
        String a = getInputData().mo5584a("action");
        if (a != null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "inputData.getString(\"action\")!!");
            Single<Result> i = this.f15741c.mo19909a(C7121a.valueOf(a), m21511c()).mo30045a(Result.m5470c()).mo30218b((Consumer<? super Throwable>) C7114b.f15743c).mo30237i(C7115c.f15744c);
            Intrinsics.checkReturnedValueIsNotNull((Object) i, "uriCaching.run(requested…Return { Result.retry() }");
            return i;
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
