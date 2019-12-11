package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.io.File;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getBifThumbnail$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Presentation $presentation;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getBifThumbnail$1(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction, Presentation presentation) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
        this.$presentation = presentation;
    }

    public final Single<String> apply(String str) {
        Context access$getContext$p = this.this$0.context;
        File file = new File(access$getContext$p != null ? access$getContext$p.getCacheDir() : null, "onlineThumbnails");
        if (!file.isDirectory()) {
            file.mkdir();
        }
        File generateEmptyBifFile = this.this$0.generateEmptyBifFile(file);
        return this.this$0.onlineMediaClient.downloadBifThumbnail(this.$transaction, this.$presentation, generateEmptyBifFile, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str))).mo30044a((SingleSource<T>) Single.m38399b(generateEmptyBifFile.getAbsolutePath()));
    }
}
