package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.media.offline.DefaultOfflineMediaApi.WhenMappings;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "mode", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaApi.kt */
final class DefaultOfflineMediaApi$removeAllLicensesOnLogout$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ DefaultOfflineMediaApi this$0;

    DefaultOfflineMediaApi$removeAllLicensesOnLogout$1(DefaultOfflineMediaApi defaultOfflineMediaApi) {
        this.this$0 = defaultOfflineMediaApi;
    }

    public final Single<? extends List<CachedMedia>> apply(LogoutMode logoutMode) {
        if (WhenMappings.$EnumSwitchMapping$0[logoutMode.ordinal()] != 1) {
            Single<? extends List<CachedMedia>> b = Single.m38399b(C13185o.m40513a());
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(listOf())");
            return b;
        }
        MediaStorage access$getMediaStorage$p = this.this$0.mediaStorage;
        Object obj = this.this$0.transactionProvider.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "transactionProvider.get()");
        return access$getMediaStorage$p.getAll((ServiceTransaction) obj);
    }
}
