package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.media.offline.CachedMedia;
import java.util.concurrent.Callable;
import kotlin.C13142s;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getLocalBifThumbnail$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Presentation $presentation;

    DefaultOfflineMediaClient$getLocalBifThumbnail$1(Context context, Presentation presentation) {
        this.$context = context;
        this.$presentation = presentation;
    }

    public final Single<String> apply(final CachedMedia cachedMedia) {
        return Single.m38401c((Callable<? extends T>) new Callable<T>(this) {
            final /* synthetic */ DefaultOfflineMediaClient$getLocalBifThumbnail$1 this$0;

            {
                this.this$0 = r1;
            }

            public final String call() {
                CachedMedia cachedMedia = cachedMedia;
                if (cachedMedia != null) {
                    ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
                    DefaultOfflineMediaClient$getLocalBifThumbnail$1 defaultOfflineMediaClient$getLocalBifThumbnail$1 = this.this$0;
                    return exoCachedMedia.getLocalBifFile(defaultOfflineMediaClient$getLocalBifThumbnail$1.$context, defaultOfflineMediaClient$getLocalBifThumbnail$1.$presentation);
                }
                throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.internal.media.ExoCachedMedia");
            }
        });
    }
}
