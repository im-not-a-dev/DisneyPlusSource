package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aî\u0001\u0012p\u0012n\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*6\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0002 \u0005*v\u0012p\u0012n\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*6\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0002\u0018\u00010\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "list", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaApi.kt */
final class DefaultOfflineMediaApi$removeAllLicensesOnLogout$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ DefaultOfflineMediaApi this$0;

    DefaultOfflineMediaApi$removeAllLicensesOnLogout$2(DefaultOfflineMediaApi defaultOfflineMediaApi) {
        this.this$0 = defaultOfflineMediaApi;
    }

    public final Single<List<Triple<String, String, String>>> apply(List<? extends CachedMedia> list) {
        if (!list.isEmpty()) {
            this.this$0.helper.cancelPeriodicRenewal();
        }
        final ServiceTransaction serviceTransaction = (ServiceTransaction) this.this$0.transactionProvider.get();
        return Observable.m38302a((Iterable<? extends T>) list).mo30193g(C19971.INSTANCE).mo30150a((C11952h<? super T>) C19982.INSTANCE).mo30193g(new Function<T, R>(this) {
            final /* synthetic */ DefaultOfflineMediaApi$removeAllLicensesOnLogout$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Triple<String, String, String> apply(ExoCachedMedia exoCachedMedia) {
                Triple<String, String, String> triple = new Triple<>(exoCachedMedia.getId(), new String(exoCachedMedia.getLicense(), C12801c.f29474a), new String(exoCachedMedia.getAudioLicense(), C12801c.f29474a));
                exoCachedMedia.setLicense(new byte[0]);
                exoCachedMedia.setAudioLicense(new byte[0]);
                exoCachedMedia.setExpiration(null);
                MediaStorage access$getMediaStorage$p = this.this$0.this$0.mediaStorage;
                ServiceTransaction serviceTransaction = serviceTransaction;
                Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
                access$getMediaStorage$p.store(serviceTransaction, exoCachedMedia).mo30053d();
                return triple;
            }
        }).mo30201k();
    }
}
