package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "kotlin.jvm.PlatformType", "countryCode", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLegalApi.kt */
final class DefaultLegalApi$getLegalDocContent$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $documentCode;
    final /* synthetic */ DefaultLegalApi this$0;

    DefaultLegalApi$getLegalDocContent$1(DefaultLegalApi defaultLegalApi, String str) {
        this.this$0 = defaultLegalApi;
        this.$documentCode = str;
    }

    public final Single<LegalDocContent> apply(String str) {
        return this.this$0.legalDocContentOnce(this.$documentCode, str).mo30233g(C61131.INSTANCE);
    }
}
