package com.bamtechmedia.dominguez.detail.common;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.assets.DmcExtra;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContentResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0018\u00010\rj\u0002`\u000fH\u0016J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0018\u00010\rj\u0002`\u000fH\u0016J6\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u000e\u001a\b\u0018\u00010\rj\u0002`\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/RemoteExtrasContentDataSource;", "Lcom/bamtechmedia/dominguez/detail/common/ExtrasContentDataSource;", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lio/reactivex/Scheduler;)V", "isLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "extras", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "familyId", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "loadNextPage", "Lio/reactivex/Maybe;", "extraContent", "performRequest", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContentResponse;", "map", "", "", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.v */
/* compiled from: RemoteExtrasContentDataSource.kt */
public final class C6004v implements C5983k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AtomicBoolean f13844a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C3724a f13845b;

    /* renamed from: c */
    private final C11969r f13846c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.v$a */
    /* compiled from: RemoteExtrasContentDataSource.kt */
    public static final class C6005a {
        private C6005a() {
        }

        public /* synthetic */ C6005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.v$b */
    /* compiled from: RemoteExtrasContentDataSource.kt */
    static final class C6006b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C5982j f13847U;

        /* renamed from: c */
        final /* synthetic */ C6004v f13848c;

        C6006b(C6004v vVar, C5982j jVar) {
            this.f13848c = vVar;
            this.f13847U = jVar;
        }

        /* renamed from: a */
        public final DmcExtraContent apply(GraphQlResponse<DmcExtraContentResponse> graphQlResponse) {
            this.f13848c.f13844a.set(false);
            DmcExtraContentResponse dmcExtraContentResponse = (DmcExtraContentResponse) graphQlResponse.getData();
            DmcExtraContent a = dmcExtraContentResponse != null ? dmcExtraContentResponse.mo17977a() : null;
            if (a != null) {
                List<C3686h> d = C13199w.m40583d((Collection) C13199w.m40574c((Collection) this.f13847U), (Iterable) a.mo17938Y());
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
                for (C3686h hVar : d) {
                    if (hVar != null) {
                        arrayList.add((DmcExtra) hVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.assets.DmcExtra");
                    }
                }
                return DmcExtraContent.m19159a(a, arrayList, null, 2, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Missing or bad data in GraphQlResponse ");
            sb.append(graphQlResponse);
            throw new AssertionError(sb.toString());
        }
    }

    static {
        new C6005a(null);
    }

    public C6004v(C3724a aVar, C11969r rVar) {
        this.f13845b = aVar;
        this.f13846c = rVar;
    }

    /* renamed from: a */
    public Maybe<C5982j> mo17936a(String str, C5982j jVar, String str2) {
        if (this.f13844a.get() || !jVar.mo13457f0().mo13412a0()) {
            Maybe<C5982j> h = Maybe.m38259h();
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "Maybe.empty()");
            return h;
        }
        this.f13844a.set(true);
        Maybe<C5982j> h2 = m19225a(C13173j0.m40356a(C12907r.m40244a("familyId", str), C12907r.m40244a("page", Integer.valueOf(jVar.mo13457f0().mo13410Y())), C12907r.m40244a("pageSize", Integer.valueOf(jVar.mo13457f0().mo13411Z()))), str2).mo30220b(this.f13846c).mo30233g(new C6006b(this, jVar)).mo30234h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h2, "performRequest(map, tran…              }.toMaybe()");
        return h2;
    }

    /* renamed from: a */
    private final Single<GraphQlResponse<DmcExtraContentResponse>> m19225a(Map<String, ? extends Object> map, String str) {
        return this.f13845b.mo13577a(DmcExtraContentResponse.class, "core/DmcExtras", map, str);
    }
}
