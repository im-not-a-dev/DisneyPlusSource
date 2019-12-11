package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.Response;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "OUT", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/core/networking/Response;", "apply", "ServiceRequestExtensionsKt$toMaybe$3"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.account.DefaultUserProfileClient$deleteUserProfile$2$$special$$inlined$toMaybe$4 */
/* compiled from: ServiceRequestExtensions.kt */
public final class C1797xafb91f30<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ String $dustEvent;
    final /* synthetic */ ServiceTransaction $transaction;

    public C1797xafb91f30(ServiceTransaction serviceTransaction, String str) {
        this.$transaction = serviceTransaction;
        this.$dustEvent = str;
    }

    public final Maybe<CreateAccountGrantResponse> apply(Response<? extends CreateAccountGrantResponse> response) {
        C1169c.m6005a(this.$transaction, this.$dustEvent, response.mo7485b());
        if (response.mo7484a() == null) {
            return Maybe.m38259h();
        }
        return Maybe.m38258c(response.mo7484a());
    }
}
