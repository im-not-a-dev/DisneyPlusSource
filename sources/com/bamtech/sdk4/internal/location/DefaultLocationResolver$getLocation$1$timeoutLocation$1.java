package com.bamtech.sdk4.internal.location;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.location.UnavailableLocation;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/location/UnavailableLocation;", "it", "", "apply", "(Ljava/lang/Long;)Lcom/bamtech/sdk4/location/UnavailableLocation;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LocationResolver.kt */
final class DefaultLocationResolver$getLocation$1$timeoutLocation$1<T, R> implements Function<T, R> {
    final /* synthetic */ DefaultLocationResolver$getLocation$1 this$0;

    DefaultLocationResolver$getLocation$1$timeoutLocation$1(DefaultLocationResolver$getLocation$1 defaultLocationResolver$getLocation$1) {
        this.this$0 = defaultLocationResolver$getLocation$1;
    }

    public final UnavailableLocation apply(Long l) {
        DefaultLocationResolver$getLocation$1 defaultLocationResolver$getLocation$1 = this.this$0;
        DefaultImpls.d$default(defaultLocationResolver$getLocation$1.$transaction, defaultLocationResolver$getLocation$1.this$0, "LocationRequestTimedOut", false, 4, null);
        return new UnavailableLocation();
    }
}
