package com.bamtechmedia.dominguez.channels.p073tv.p077j;

import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3663f;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.content.sets.C3765c.C3767b;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.google.common.base.C10368c;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J,\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0004R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/programs/BaseProgramCandidateProvider;", "Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;", "collectionsRemoteDataSource", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRemoteDataSource;", "contentSetDataSource", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "assetToProgramMapper", "Lcom/google/common/base/Function;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Lcom/bamtechmedia/dominguez/channels/tv/db/ProgramCandidate;", "(Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRemoteDataSource;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;Lcom/google/common/base/Function;)V", "contentSetOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "programsForSlug", "Lio/reactivex/Maybe;", "", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "filteredSetTypes", "", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.j.b */
/* compiled from: BaseProgramCandidateProvider.kt */
public abstract class C3228b implements C3233d {

    /* renamed from: a */
    private final C3663f f8213a;

    /* renamed from: b */
    private final C3765c f8214b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10368c<C3626b, C3224c> f8215c;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.j.b$a */
    /* compiled from: BaseProgramCandidateProvider.kt */
    static final class C3229a<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ Set f8216c;

        C3229a(Set set) {
            this.f8216c = set;
        }

        /* renamed from: a */
        public final C3778h apply(C3658a aVar) {
            boolean z;
            List<Container> O = aVar.mo13343O();
            ArrayList<C3778h> arrayList = new ArrayList<>(C13187p.m40525a((Iterable) O, 10));
            for (Container a : O) {
                arrayList.add(a.mo13400a());
            }
            for (C3778h hVar : arrayList) {
                if (this.f8216c.isEmpty() || this.f8216c.contains(hVar.mo13604b())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return hVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.j.b$b */
    /* compiled from: BaseProgramCandidateProvider.kt */
    static final class C3230b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C3228b f8217c;

        C3230b(C3228b bVar) {
            this.f8217c = bVar;
        }

        /* renamed from: a */
        public final Single<ContentSet> apply(C3778h hVar) {
            return this.f8217c.m11206a(hVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.j.b$c */
    /* compiled from: BaseProgramCandidateProvider.kt */
    static final class C3231c<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C3228b f8218c;

        C3231c(C3228b bVar) {
            this.f8218c = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
            if ((r2.mo12266a().length() > 0) != false) goto L_0x0056;
         */
        /* JADX WARNING: Incorrect type for immutable var: ssa=com.bamtechmedia.dominguez.core.content.sets.ContentSet, code=com.bamtechmedia.dominguez.core.content.sets.ContentSet<com.bamtechmedia.dominguez.core.content.assets.b>, for r7v0, types: [com.bamtechmedia.dominguez.core.content.sets.ContentSet, com.bamtechmedia.dominguez.core.content.sets.ContentSet<com.bamtechmedia.dominguez.core.content.assets.b>, java.lang.Iterable] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c> apply(com.bamtechmedia.dominguez.core.content.sets.ContentSet<com.bamtechmedia.dominguez.core.content.assets.C3626b> r7) {
            /*
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0009:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L_0x0027
                java.lang.Object r1 = r7.next()
                com.bamtechmedia.dominguez.core.content.assets.b r1 = (com.bamtechmedia.dominguez.core.content.assets.C3626b) r1
                com.bamtechmedia.dominguez.channels.tv.j.b r2 = r6.f8218c
                com.google.common.base.c r2 = r2.f8215c
                java.lang.Object r1 = r2.apply(r1)
                com.bamtechmedia.dominguez.channels.tv.i.c r1 = (com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c) r1
                if (r1 == 0) goto L_0x0009
                r0.add(r1)
                goto L_0x0009
            L_0x0027:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0030:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x005c
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.bamtechmedia.dominguez.channels.tv.i.c r2 = (com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c) r2
                java.lang.String r3 = r2.mo12272f()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0055
                java.lang.String r2 = r2.mo12266a()
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0051
                r2 = 1
                goto L_0x0052
            L_0x0051:
                r2 = 0
            L_0x0052:
                if (r2 == 0) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r4 = 0
            L_0x0056:
                if (r4 == 0) goto L_0x0030
                r7.add(r1)
                goto L_0x0030
            L_0x005c:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.channels.p073tv.p077j.C3228b.C3231c.apply(com.bamtechmedia.dominguez.core.content.sets.ContentSet):java.util.List");
        }
    }

    public C3228b(C3663f fVar, C3765c cVar, C10368c<C3626b, C3224c> cVar2) {
        this.f8213a = fVar;
        this.f8214b = cVar;
        this.f8215c = cVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ Maybe m11204a(C3228b bVar, C3676k kVar, Set set, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                set = C13188p0.m40531a();
            }
            return bVar.mo12284a(kVar, set);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: programsForSlug");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Maybe<List<C3224c>> mo12284a(C3676k kVar, Set<? extends ContentSetType> set) {
        Maybe<List<C3224c>> h = C3663f.m12492a(this.f8213a, kVar, null, 2, null).mo30233g(new C3229a(set)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C3230b<Object,Object>(this)).mo30233g(new C3231c(this)).mo30234h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "collectionsRemoteDataSou…}\n            }.toMaybe()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<ContentSet> m11206a(C3778h hVar) {
        if (!(hVar instanceof ContentSet)) {
            return C3767b.m12769a(this.f8214b, hVar.mo13604b(), hVar.mo13608e(), (String) null, true, 4, (Object) null);
        }
        Single<ContentSet> b = Single.m38399b(hVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(set)");
        return b;
    }
}
