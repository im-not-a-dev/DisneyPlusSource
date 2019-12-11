package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.Playhead;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "playhead", "Lcom/bamtech/sdk4/media/Playhead;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getCachedItem$3<T> implements Consumer<Playhead> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getCachedItem$3(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
    }

    public final void accept(Playhead playhead) {
        LocalPlayheadStore access$getLocalPlayheadStore$p = this.this$0.localPlayheadStore;
        ServiceTransaction serviceTransaction = this.$transaction;
        Intrinsics.checkReturnedValueIsNotNull((Object) playhead, "playhead");
        access$getLocalPlayheadStore$p.importPlayhead(serviceTransaction, playhead);
    }
}
