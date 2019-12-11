package com.bamtech.sdk4.internal.media.offline;

import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012p\u0010\u0003\u001al\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006 \u0002*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0002*4\u00120\u0012.\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006 \u0002*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u00070\u0004H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "list", "", "Lkotlin/Triple;", "", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaApi.kt */
final class DefaultOfflineMediaApi$removeAllLicensesOnLogout$3<T, R> implements Function<List<Triple<? extends String, ? extends String, ? extends String>>, CompletableSource> {
    final /* synthetic */ DefaultOfflineMediaApi this$0;

    DefaultOfflineMediaApi$removeAllLicensesOnLogout$3(DefaultOfflineMediaApi defaultOfflineMediaApi) {
        this.this$0 = defaultOfflineMediaApi;
    }

    public final CompletableSource apply(List<Triple<String, String, String>> list) {
        if (!list.isEmpty()) {
            return this.this$0.helper.removeAllLicenses(list);
        }
        return Completable.m38169h();
    }
}
