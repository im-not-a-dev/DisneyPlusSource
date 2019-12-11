package com.bamtechmedia.dominguez.core.content.sets;

import com.google.common.base.Optional;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0018\u00010\fj\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0013\u001a\b\u0018\u00010\fj\u0002`\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetRepository;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "remote", "Lcom/bamtechmedia/dominguez/core/content/sets/RemoteContentSetDataSource;", "availabilityHint", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetAvailabilityHint;", "offlineSetCache", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/core/content/sets/OfflineSetCache;", "(Lcom/bamtechmedia/dominguez/core/content/sets/RemoteContentSetDataSource;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetAvailabilityHint;Lcom/google/common/base/Optional;)V", "loadingContentSets", "", "", "getContentSet", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "type", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "setId", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "forceRefresh", "", "loadNextPage", "Lio/reactivex/Maybe;", "set", "positionInSet", "", "offsetFromEndToStartLoading", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.sets.d */
/* compiled from: ContentSetRepository.kt */
public final class C3768d implements C3765c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set<String> f9398a = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RemoteContentSetDataSource f9399b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3762a f9400c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Optional<C3780j> f9401d;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$a */
    /* compiled from: ContentSetRepository.kt */
    static final class C3769a<V> implements Callable<SingleSource<? extends T>> {

        /* renamed from: U */
        final /* synthetic */ ContentSetType f9402U;

        /* renamed from: V */
        final /* synthetic */ String f9403V;

        /* renamed from: W */
        final /* synthetic */ String f9404W;

        /* renamed from: X */
        final /* synthetic */ boolean f9405X;

        /* renamed from: c */
        final /* synthetic */ C3768d f9406c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$a$a */
        /* compiled from: ContentSetRepository.kt */
        static final class C3770a<T> implements Consumer<ContentSet> {

            /* renamed from: c */
            final /* synthetic */ C3769a f9407c;

            C3770a(C3769a aVar) {
                this.f9407c = aVar;
            }

            /* renamed from: a */
            public final void accept(ContentSet contentSet) {
                C3762a a = this.f9407c.f9406c.f9400c;
                Intrinsics.checkReturnedValueIsNotNull((Object) contentSet, "it");
                a.mo13657a(contentSet);
                C3780j jVar = (C3780j) this.f9407c.f9406c.f9401d.mo27107c();
                if (jVar != null) {
                    jVar.mo13688a(contentSet);
                }
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$a$b */
        /* compiled from: ContentSetRepository.kt */
        static final class C3771b<T, R> implements Function<Throwable, ContentSet> {

            /* renamed from: c */
            final /* synthetic */ C3769a f9408c;

            C3771b(C3769a aVar) {
                this.f9408c = aVar;
            }

            /* renamed from: a */
            public final ContentSet apply(Throwable th) {
                C3780j jVar = (C3780j) this.f9408c.f9406c.f9401d.mo27107c();
                if (jVar != null) {
                    ContentSet b = jVar.mo13689b(this.f9408c.f9403V);
                    if (b != null) {
                        return b;
                    }
                }
                throw th;
            }
        }

        C3769a(C3768d dVar, ContentSetType contentSetType, String str, String str2, boolean z) {
            this.f9406c = dVar;
            this.f9402U = contentSetType;
            this.f9403V = str;
            this.f9404W = str2;
            this.f9405X = z;
        }

        public final Single<ContentSet> call() {
            return RemoteContentSetDataSource.m12748a(this.f9406c.f9399b, this.f9402U, this.f9403V, this.f9404W, this.f9405X ? Long.valueOf(System.currentTimeMillis()) : null, null, 16, null).mo30227d((Consumer<? super T>) new C3770a<Object>(this)).mo30237i(new C3771b(this));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$b */
    /* compiled from: ContentSetRepository.kt */
    static final class C3772b<T> implements Consumer<ContentSet> {

        /* renamed from: c */
        final /* synthetic */ C3768d f9409c;

        C3772b(C3768d dVar) {
            this.f9409c = dVar;
        }

        /* renamed from: a */
        public final void accept(ContentSet contentSet) {
            if (contentSet.mo13673d()) {
                this.f9409c.f9398a.remove(contentSet.mo13608e());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$c */
    /* compiled from: ContentSetRepository.kt */
    static final class C3773c<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ ContentSet f9410U;

        /* renamed from: c */
        final /* synthetic */ C3768d f9411c;

        C3773c(C3768d dVar, ContentSet contentSet) {
            this.f9411c = dVar;
            this.f9410U = contentSet;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f9411c.f9398a.remove(this.f9410U.mo13608e());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.d$d */
    /* compiled from: ContentSetRepository.kt */
    static final class C3774d<T> implements Consumer<ContentSet> {

        /* renamed from: c */
        final /* synthetic */ C3768d f9412c;

        C3774d(C3768d dVar) {
            this.f9412c = dVar;
        }

        /* renamed from: a */
        public final void accept(ContentSet contentSet) {
            C3780j jVar = (C3780j) this.f9412c.f9401d.mo27107c();
            if (jVar != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) contentSet, "it");
                jVar.mo13688a(contentSet);
            }
        }
    }

    public C3768d(RemoteContentSetDataSource remoteContentSetDataSource, C3762a aVar, Optional<C3780j> optional) {
        this.f9399b = remoteContentSetDataSource;
        this.f9400c = aVar;
        this.f9401d = optional;
    }

    /* renamed from: a */
    public Single<ContentSet> mo13659a(ContentSetType contentSetType, String str, String str2, boolean z) {
        C3769a aVar = new C3769a(this, contentSetType, str, str2, z);
        Single<ContentSet> b = Single.m38396a((Callable<? extends SingleSource<? extends T>>) aVar).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.defer {\n         …scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public Maybe<ContentSet> mo13658a(ContentSet contentSet, int i, String str, int i2) {
        boolean contains = this.f9398a.contains(contentSet.mo13608e());
        boolean z = true;
        if (!(i + i2 >= contentSet.size()) || !contentSet.mo13457f0().mo13412a0() || contains) {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Starting next page load: ");
            sb.append(contentSet.mo13608e());
            Timber.m44529c(sb.toString(), new Object[0]);
            this.f9398a.add(contentSet.mo13608e());
            Maybe<ContentSet> h = this.f9399b.mo13643a(contentSet, str).mo30227d((Consumer<? super T>) new C3772b<Object>(this)).mo30218b((Consumer<? super Throwable>) new C3773c<Object>(this, contentSet)).mo30227d((Consumer<? super T>) new C3774d<Object>(this)).mo30234h();
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "remote.getNextPage(set, …               .toMaybe()");
            return h;
        }
        Maybe<ContentSet> h2 = Maybe.m38259h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h2, "Maybe.empty()");
        return h2;
    }
}
