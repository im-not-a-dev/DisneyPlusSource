package com.bamtechmedia.dominguez.legal.api;

import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000bH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u000bH&¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalApi;", "", "createNrtAccount", "Lio/reactivex/Completable;", "emailAddress", "", "legalAcceptance", "", "marketingInput", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "getLegalData", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "getLegalDocContent", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "documentCode", "getMarketingData", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalApi.kt */
public interface LegalApi {
    Completable createNrtAccount(String str, List<String> list, List<MarketingInput> list2);

    Single<List<LegalDisclosure>> getLegalData();

    Single<LegalDocContent> getLegalDocContent(String str);

    Single<List<MarketingEntity>> getMarketingData();
}
