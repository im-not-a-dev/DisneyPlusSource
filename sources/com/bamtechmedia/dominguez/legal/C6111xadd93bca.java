package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;
import okhttp3.C14264y;
import okhttp3.Response;
import p163g.p500m.p501a.C11725h;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "T", "it", "Lokhttp3/Response;", "apply", "(Lokhttp3/Response;)Ljava/lang/Object;", "com/bamtechmedia/dominguez/core/utils/network/NetworkExtensionsKt$createTypedSingle$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.legal.DefaultLegalApi$siteConfigOnce$1$$special$$inlined$createTypedSingle$1 */
/* compiled from: NetworkExtensions.kt */
public final class C6111xadd93bca<T, R> implements Function<T, R> {
    final /* synthetic */ C11725h $adapter;

    public C6111xadd93bca(C11725h hVar) {
        this.$adapter = hVar;
    }

    public final T apply(Response response) {
        C14264y a = response.mo35855a();
        if (a != null) {
            return this.$adapter.fromJson(a.mo35703d());
        }
        return null;
    }
}
