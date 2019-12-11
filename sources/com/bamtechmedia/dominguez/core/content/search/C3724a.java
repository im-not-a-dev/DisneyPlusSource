package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.content.GraphQlResponse;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "", "search", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "queryId", "", "variables", "", "contentTransactionId", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.a */
/* compiled from: DmgzSearchApi.kt */
public interface C3724a {

    /* renamed from: a */
    public static final C3725a f9310a = C3725a.f9312b;

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.a$a */
    /* compiled from: DmgzSearchApi.kt */
    public static final class C3725a {

        /* renamed from: a */
        private static Long f9311a;

        /* renamed from: b */
        static final /* synthetic */ C3725a f9312b = new C3725a();

        private C3725a() {
        }

        /* renamed from: a */
        public final void mo13579a(Long l) {
            f9311a = l;
        }

        /* renamed from: a */
        public final Long mo13578a() {
            Long l = f9311a;
            if (l == null) {
                return null;
            }
            if (l.longValue() > System.currentTimeMillis()) {
                return l;
            }
            return null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.a$b */
    /* compiled from: DmgzSearchApi.kt */
    public static final class C3726b {
        /* renamed from: a */
        public static /* synthetic */ Single m12662a(C3724a aVar, Type type, String str, Map map, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str2 = null;
                }
                return aVar.mo13577a(type, str, map, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
        }
    }

    /* renamed from: a */
    <T> Single<GraphQlResponse<T>> mo13577a(Type type, String str, Map<String, ?> map, String str2);
}
