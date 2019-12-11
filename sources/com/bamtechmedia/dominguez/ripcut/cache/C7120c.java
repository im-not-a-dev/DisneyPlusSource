package com.bamtechmedia.dominguez.ripcut.cache;

import android.net.Uri;
import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import java.io.File;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\rJ\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching;", "", "cacheFileResolver", "Lcom/bamtechmedia/dominguez/ripcut/cache/CacheFileResolver;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/ripcut/cache/CacheFileResolver;Ljavax/inject/Provider;Lio/reactivex/Scheduler;)V", "download", "Lio/reactivex/Completable;", "url", "Landroid/net/Uri;", "downloadToFile", "", "response", "Lokhttp3/Response;", "localFile", "Ljava/io/File;", "localUrl", "remoteUri", "removeDownload", "uri", "run", "action", "Lcom/bamtechmedia/dominguez/ripcut/cache/UriCaching$Action;", "Action", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c */
/* compiled from: UriCaching.kt */
public final class C7120c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7116a f15750a;

    /* renamed from: b */
    private final Provider<OkHttpClient> f15751b;

    /* renamed from: c */
    private final C11969r f15752c;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c$a */
    /* compiled from: UriCaching.kt */
    public enum C7121a {
        DOWNLOAD,
        REMOVE
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c$b */
    /* compiled from: UriCaching.kt */
    static final class C7122b<T> implements Consumer<Response> {

        /* renamed from: U */
        final /* synthetic */ Uri f15756U;

        /* renamed from: c */
        final /* synthetic */ C7120c f15757c;

        C7122b(C7120c cVar, Uri uri) {
            this.f15757c = cVar;
            this.f15756U = uri;
        }

        /* renamed from: a */
        public final void accept(Response response) {
            C7120c cVar = this.f15757c;
            Intrinsics.checkReturnedValueIsNotNull((Object) response, "it");
            cVar.m21524a(response, this.f15757c.f15750a.mo19907a(this.f15756U));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c$c */
    /* compiled from: UriCaching.kt */
    static final class C7123c<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ Uri f15758U;

        /* renamed from: c */
        final /* synthetic */ C7120c f15759c;

        C7123c(C7120c cVar, Uri uri) {
            this.f15759c = cVar;
            this.f15758U = uri;
        }

        public final File call() {
            return this.f15759c.f15750a.mo19907a(this.f15758U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c$d */
    /* compiled from: UriCaching.kt */
    static final class C7124d<T> implements C11952h<File> {

        /* renamed from: c */
        public static final C7124d f15760c = new C7124d();

        C7124d() {
        }

        /* renamed from: a */
        public final boolean test(File file) {
            return file.exists();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.c$e */
    /* compiled from: UriCaching.kt */
    static final class C7125e<T> implements Consumer<File> {

        /* renamed from: c */
        public static final C7125e f15761c = new C7125e();

        C7125e() {
        }

        /* renamed from: a */
        public final void accept(File file) {
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to deleted ");
                sb.append(file);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public C7120c(C7116a aVar, Provider<OkHttpClient> provider, C11969r rVar) {
        this.f15750a = aVar;
        this.f15751b = provider;
        this.f15752c = rVar;
    }

    /* renamed from: b */
    private final Completable m21525b(Uri uri) {
        Completable c = Single.m38401c((Callable<? extends T>) new C7123c<Object>(this, uri)).mo30220b(this.f15752c).mo30202a((C11952h<? super T>) C7124d.f15760c).mo30123c((Consumer<? super T>) C7125e.f15761c).mo30122c();
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Single.fromCallable { ca…         .ignoreElement()");
        return c;
    }

    /* renamed from: a */
    public final Completable mo19909a(C7121a aVar, Uri uri) {
        int i = C7126d.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            return m21522a(uri);
        }
        if (i == 2) {
            return m21525b(uri);
        }
        throw new C12898l();
    }

    /* renamed from: a */
    private final Completable m21522a(Uri uri) {
        C14113a aVar = new C14113a();
        aVar.mo35848b(uri.toString());
        Request a = aVar.mo35846a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "request");
        Object obj = this.f15751b.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "client.get()");
        Completable e = C5879c.m18933a(a, (OkHttpClient) obj).mo30227d((Consumer<? super T>) new C7122b<Object>(this, uri)).mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "request.createSingle(cli…         .ignoreElement()");
        return e;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        kotlin.p580c0.C12724b.m39863a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21524a(okhttp3.Response r4, java.io.File r5) {
        /*
            r3 = this;
            java.io.File r0 = r5.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0011
            java.io.File r0 = r5.getParentFile()
            r0.mkdirs()
        L_0x0011:
            okhttp3.y r4 = r4.mo35855a()
            if (r4 == 0) goto L_0x003c
            okio.BufferedSource r4 = r4.mo35703d()
            if (r4 == 0) goto L_0x003c
            r0 = 0
            r1 = 1
            r2 = 0
            okio.v r5 = okio.C14287m.m45721a(r5, r0, r1, r2)     // Catch:{ all -> 0x0035 }
            r4.mo36297a(r5)     // Catch:{ all -> 0x002e }
            kotlin.p580c0.C12724b.m39863a(r5, r2)     // Catch:{ all -> 0x0035 }
            kotlin.p580c0.C12724b.m39863a(r4, r2)
            return
        L_0x002e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r5, r0)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r4, r5)
            throw r0
        L_0x003c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Response did not contain a body"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.ripcut.cache.C7120c.m21524a(okhttp3.Response, java.io.File):void");
    }
}
