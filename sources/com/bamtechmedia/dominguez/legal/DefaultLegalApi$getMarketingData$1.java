package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "it", "Lcom/bamtechmedia/dominguez/legal/SiteConfigResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLegalApi.kt */
final class DefaultLegalApi$getMarketingData$1<T, R> implements Function<T, R> {
    public static final DefaultLegalApi$getMarketingData$1 INSTANCE = new DefaultLegalApi$getMarketingData$1();

    DefaultLegalApi$getMarketingData$1() {
    }

    public final List<MarketingEntity> apply(SiteConfigResponse siteConfigResponse) {
        if (siteConfigResponse.getData() != null) {
            return siteConfigResponse.getData().getMarketing().getAdult().getEntities();
        }
        return C13185o.m40513a();
    }
}
