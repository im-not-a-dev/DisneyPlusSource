package com.bamtech.sdk4.bookmarks;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$purgeOnProfileChangeOrLogout$2<T> implements Consumer<Throwable> {
    final /* synthetic */ DefaultBookmarkApi this$0;

    DefaultBookmarkApi$purgeOnProfileChangeOrLogout$2(DefaultBookmarkApi defaultBookmarkApi) {
        this.this$0 = defaultBookmarkApi;
    }

    public final void accept(Throwable th) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.this$0.transactionProvider.get();
        C12880j.m40222a((Object) th, "throwable");
        DefaultImpls.logException$default(serviceTransaction, th, null, null, false, 14, null);
    }
}
