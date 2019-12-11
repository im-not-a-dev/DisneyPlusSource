package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.core.p214j.C5756a;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C14264y;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okio.BufferedSource;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.C11969r;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\"#BM\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J\u0016\u0010 \u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001f0\u001f0!H\u0002R\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R8\u0010\u0013\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00018\u00008\u0000 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00140\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/ConfigLoader;", "T", "", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "moshi", "Lcom/squareup/moshi/Moshi;", "documentStore", "Lcom/bamtechmedia/dominguez/core/documents/DocumentStore;", "overrideConfigResolver", "Lcom/bamtechmedia/dominguez/config/OverrideConfigResolver;", "parameters", "Lcom/bamtechmedia/dominguez/config/ConfigLoader$Parameters;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/config/ConfigLoader$Parameters;)V", "cached", "Ljava/lang/Object;", "configId", "", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "kotlin.jvm.PlatformType", "getJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "path", "single", "Lio/reactivex/Single;", "fetchConfig", "ignoreCache", "", "loadFromNetwork", "Lokio/BufferedSource;", "localOverride", "Lio/reactivex/Maybe;", "Factory", "Parameters", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.h */
/* compiled from: ConfigLoader.kt */
public final class C3532h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f8835a = this.f8843i.mo12737a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public T f8836b;

    /* renamed from: c */
    private final Single<T> f8837c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f8838d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Provider<OkHttpClient> f8839e;

    /* renamed from: f */
    private final Provider<C11760v> f8840f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Provider<C5756a> f8841g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Provider<C3561m0> f8842h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3534b<T> f8843i;

    /* renamed from: com.bamtechmedia.dominguez.config.h$a */
    /* compiled from: ConfigLoader.kt */
    public static final class C3533a {

        /* renamed from: a */
        private final Provider<OkHttpClient> f8844a;

        /* renamed from: b */
        private final Provider<C11760v> f8845b;

        /* renamed from: c */
        private final Provider<C5756a> f8846c;

        /* renamed from: d */
        private final Provider<C3561m0> f8847d;

        public C3533a(Provider<OkHttpClient> provider, Provider<C11760v> provider2, Provider<C5756a> provider3, Provider<C3561m0> provider4) {
            this.f8844a = provider;
            this.f8845b = provider2;
            this.f8846c = provider3;
            this.f8847d = provider4;
        }

        /* renamed from: a */
        public final <T> C3532h<T> mo12736a(C3534b<T> bVar) {
            C3532h hVar = new C3532h(this.f8844a, this.f8845b, this.f8846c, this.f8847d, bVar);
            return hVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$b */
    /* compiled from: ConfigLoader.kt */
    public static final class C3534b<T> {

        /* renamed from: a */
        private final String f8848a;

        /* renamed from: b */
        private final Type f8849b;

        /* renamed from: c */
        private final String f8850c;

        /* renamed from: d */
        private final String f8851d;

        /* renamed from: e */
        private final Long f8852e;

        /* renamed from: f */
        private final Integer f8853f;

        /* renamed from: g */
        private final Function0<T> f8854g;

        public C3534b(String str, Type type, String str2, String str3, Long l, Integer num, Function0<? extends T> function0) {
            this.f8848a = str;
            this.f8849b = type;
            this.f8850c = str2;
            this.f8851d = str3;
            this.f8852e = l;
            this.f8853f = num;
            this.f8854g = function0;
        }

        /* renamed from: a */
        public final String mo12737a() {
            return this.f8850c;
        }

        /* renamed from: b */
        public final Function0<T> mo12738b() {
            return this.f8854g;
        }

        /* renamed from: c */
        public final Integer mo12739c() {
            return this.f8853f;
        }

        /* renamed from: d */
        public final String mo12740d() {
            return this.f8851d;
        }

        /* renamed from: e */
        public final Long mo12741e() {
            return this.f8852e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8854g, (java.lang.Object) r3.f8854g) != false) goto L_0x0051;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0051
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.config.C3532h.C3534b
                if (r0 == 0) goto L_0x004f
                com.bamtechmedia.dominguez.config.h$b r3 = (com.bamtechmedia.dominguez.config.C3532h.C3534b) r3
                java.lang.String r0 = r2.f8848a
                java.lang.String r1 = r3.f8848a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                java.lang.reflect.Type r0 = r2.f8849b
                java.lang.reflect.Type r1 = r3.f8849b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                java.lang.String r0 = r2.f8850c
                java.lang.String r1 = r3.f8850c
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                java.lang.String r0 = r2.f8851d
                java.lang.String r1 = r3.f8851d
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                java.lang.Long r0 = r2.f8852e
                java.lang.Long r1 = r3.f8852e
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                java.lang.Integer r0 = r2.f8853f
                java.lang.Integer r1 = r3.f8853f
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x004f
                kotlin.jvm.functions.Function0<T> r0 = r2.f8854g
                kotlin.jvm.functions.Function0<T> r3 = r3.f8854g
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r3 = 0
                return r3
            L_0x0051:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.config.C3532h.C3534b.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final Type mo12743f() {
            return this.f8849b;
        }

        /* renamed from: g */
        public final String mo12744g() {
            return this.f8848a;
        }

        public int hashCode() {
            String str = this.f8848a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Type type = this.f8849b;
            int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
            String str2 = this.f8850c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8851d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Long l = this.f8852e;
            int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
            Integer num = this.f8853f;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
            Function0<T> function0 = this.f8854g;
            if (function0 != null) {
                i = function0.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Parameters(url=");
            sb.append(this.f8848a);
            sb.append(", type=");
            sb.append(this.f8849b);
            sb.append(", documentStoreFileName=");
            sb.append(this.f8850c);
            sb.append(", localConfigOverride=");
            sb.append(this.f8851d);
            sb.append(", timeoutMillis=");
            sb.append(this.f8852e);
            sb.append(", fallbackRawResId=");
            sb.append(this.f8853f);
            sb.append(", fallbackInstance=");
            sb.append(this.f8854g);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3534b(String str, Type type, String str2, String str3, Long l, Integer num, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, type, str2, str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : function0);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$c */
    /* compiled from: ConfigLoader.kt */
    static final class C3535c<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ boolean f8855U;

        /* renamed from: c */
        final /* synthetic */ C3532h f8856c;

        C3535c(C3532h hVar, boolean z) {
            this.f8856c = hVar;
            this.f8855U = z;
        }

        public final T call() {
            if (this.f8855U) {
                return null;
            }
            return this.f8856c.f8836b;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$d */
    /* compiled from: ConfigLoader.kt */
    static final class C3536d<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8857c;

        C3536d(C3532h hVar) {
            this.f8857c = hVar;
        }

        public final OkHttpClient call() {
            return (OkHttpClient) this.f8857c.f8839e.get();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$e */
    /* compiled from: ConfigLoader.kt */
    static final class C3537e<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8858c;

        C3537e(C3532h hVar) {
            this.f8858c = hVar;
        }

        /* renamed from: a */
        public final Single<Response> apply(OkHttpClient okHttpClient) {
            return C5879c.m18932a(okHttpClient, this.f8858c.f8843i.mo12744g());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$f */
    /* compiled from: ConfigLoader.kt */
    static final class C3538f<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8859c;

        C3538f(C3532h hVar) {
            this.f8859c = hVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            StringBuilder sb = new StringBuilder();
            sb.append("Loading config of type '");
            sb.append(this.f8859c.f8843i.mo12743f());
            sb.append("' from '");
            sb.append(this.f8859c.f8843i.mo12744g());
            sb.append('\'');
            Timber.m44529c(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$g */
    /* compiled from: ConfigLoader.kt */
    static final class C3539g<T> implements Consumer<Response> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8860c;

        C3539g(C3532h hVar) {
            this.f8860c = hVar;
        }

        /* renamed from: a */
        public final void accept(Response response) {
            StringBuilder sb = new StringBuilder();
            sb.append("Successfully loaded config from '");
            sb.append(this.f8860c.f8843i.mo12744g());
            Timber.m44529c(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$h */
    /* compiled from: ConfigLoader.kt */
    static final class C3540h<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8861c;

        C3540h(C3532h hVar) {
            this.f8861c = hVar;
        }

        /* renamed from: a */
        public final BufferedSource apply(Response response) {
            C14264y a = response.mo35855a();
            if (a != null) {
                BufferedSource d = a.mo35703d();
                if (d != null) {
                    return d;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Empty response: ");
            sb.append(this.f8861c.f8843i.mo12744g());
            sb.append(", ");
            sb.append(response.mo35864g());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$i */
    /* compiled from: ConfigLoader.kt */
    static final class C3541i<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8862c;

        C3541i(C3532h hVar) {
            this.f8862c = hVar;
        }

        public final BufferedSource call() {
            return ((C3561m0) this.f8862c.f8842h.get()).mo12770a(this.f8862c.f8843i.mo12740d());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$j */
    /* compiled from: ConfigLoader.kt */
    static final class C3542j<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8863c;

        C3542j(C3532h hVar) {
            this.f8863c = hVar;
        }

        /* renamed from: a */
        public final T apply(BufferedSource bufferedSource) {
            return this.f8863c.m11947a().fromJson(bufferedSource);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$k */
    /* compiled from: ConfigLoader.kt */
    static final class C3543k<T> implements Consumer<T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8864c;

        C3543k(C3532h hVar) {
            this.f8864c = hVar;
        }

        public final void accept(T t) {
            ((C5756a) this.f8864c.f8841g.get()).mo17636a(this.f8864c.f8838d, t, this.f8864c.f8843i.mo12743f());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$l */
    /* compiled from: ConfigLoader.kt */
    static final class C3544l<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8865c;

        C3544l(C3532h hVar) {
            this.f8865c = hVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load from network '");
            sb.append(this.f8865c.f8843i.mo12744g());
            sb.append("'. Trying documentStore");
            Timber.m44528b(th, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$m */
    /* compiled from: ConfigLoader.kt */
    static final class C3545m<T, R> implements Function<Throwable, T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8866c;

        C3545m(C3532h hVar) {
            this.f8866c = hVar;
        }

        /* renamed from: a */
        public final T apply(Throwable th) {
            T a = C5756a.m18680a((C5756a) this.f8866c.f8841g.get(), this.f8866c.f8843i.mo12743f(), this.f8866c.f8838d, this.f8866c.f8843i.mo12739c(), null, 8, null);
            if (a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Document store could not load ");
            sb.append(this.f8866c.f8838d);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$n */
    /* compiled from: ConfigLoader.kt */
    static final class C3546n<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8867c;

        C3546n(C3532h hVar) {
            this.f8867c = hVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Config '");
            sb.append(this.f8867c.f8835a);
            sb.append("' not available in document store. Falling back to default");
            Timber.m44528b(th, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$o */
    /* compiled from: ConfigLoader.kt */
    static final class C3547o<T, R> implements Function<Throwable, T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8868c;

        C3547o(C3532h hVar) {
            this.f8868c = hVar;
        }

        /* renamed from: a */
        public final T apply(Throwable th) {
            Function0 b = this.f8868c.f8843i.mo12738b();
            if (b != null) {
                T invoke = b.invoke();
                if (invoke != null) {
                    return invoke;
                }
            }
            throw th;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$p */
    /* compiled from: ConfigLoader.kt */
    static final class C3548p<T> implements Consumer<T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8869c;

        C3548p(C3532h hVar) {
            this.f8869c = hVar;
        }

        public final void accept(T t) {
            StringBuilder sb = new StringBuilder();
            sb.append("Config of type '");
            sb.append(this.f8869c.f8843i.mo12743f());
            sb.append("; loaded");
            Timber.m44529c(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.config.h$q */
    /* compiled from: ConfigLoader.kt */
    static final class C3549q<T> implements Consumer<T> {

        /* renamed from: c */
        final /* synthetic */ C3532h f8870c;

        C3549q(C3532h hVar) {
            this.f8870c = hVar;
        }

        public final void accept(T t) {
            this.f8870c.f8836b = t;
        }
    }

    public C3532h(Provider<OkHttpClient> provider, Provider<C11760v> provider2, Provider<C5756a> provider3, Provider<C3561m0> provider4, C3534b<T> bVar) {
        this.f8839e = provider;
        this.f8840f = provider2;
        this.f8841g = provider3;
        this.f8842h = provider4;
        this.f8843i = bVar;
        Single<T> d = m11953c().mo30109a((SingleSource<? extends T>) m11951b()).mo30233g(new C3542j(this)).mo30207a((Consumer<? super T>) new C3543k<Object>(this)).mo30218b((Consumer<? super Throwable>) new C3544l<Object>(this)).mo30237i(new C3545m(this)).mo30218b((Consumer<? super Throwable>) new C3546n<Object>(this)).mo30237i(new C3547o(this)).mo30227d((Consumer<? super T>) new C3548p<Object>(this)).mo30227d((Consumer<? super T>) new C3549q<Object>(this)).mo30236i().mo30197i().mo30186d();
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "localOverride()\n        …)\n        .firstOrError()");
        this.f8837c = d;
        StringBuilder sb = new StringBuilder();
        sb.append("configs");
        sb.append(File.separator);
        sb.append(this.f8835a);
        this.f8838d = sb.toString();
    }

    /* renamed from: b */
    private final Single<BufferedSource> m11951b() {
        Single g = Single.m38401c((Callable<? extends T>) new C3536d<Object>(this)).mo30220b(C11934b.m38500b()).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C3537e<Object,Object>(this)).mo30222c((Consumer<? super Disposable>) new C3538f<Object>(this)).mo30227d((Consumer<? super T>) new C3539g<Object>(this)).mo30233g(new C3540h(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "Single.fromCallable { cl…url}, ${it.message()}\") }");
        Long e = this.f8843i.mo12741e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C11969r b = C11934b.m38500b();
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Schedulers.io()");
        return C5826e0.m18821a(g, e, timeUnit, b);
    }

    /* renamed from: c */
    private final Maybe<BufferedSource> m11953c() {
        Maybe<BufferedSource> b = Maybe.m38257b((Callable<? extends T>) new C3541i<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Maybe.fromCallable<Buffe…rs.localConfigOverride) }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C11725h<T> m11947a() {
        return ((C11760v) this.f8840f.get()).mo29867a(this.f8843i.mo12743f());
    }

    /* renamed from: a */
    public static /* synthetic */ Single m11948a(C3532h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return hVar.mo12735a(z);
    }

    /* renamed from: a */
    public final Single<T> mo12735a(boolean z) {
        Single<T> a = Maybe.m38257b((Callable<? extends T>) new C3535c<Object>(this, z)).mo30109a((SingleSource<? extends T>) this.f8837c);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Maybe.fromCallable<T> { …   .switchIfEmpty(single)");
        return a;
    }
}
