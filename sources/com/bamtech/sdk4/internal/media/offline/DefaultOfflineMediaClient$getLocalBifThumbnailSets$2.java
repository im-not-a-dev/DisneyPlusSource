package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bamtech/sdk4/BifThumbnailSet;", "kotlin.jvm.PlatformType", "media", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getLocalBifThumbnailSets$2<T, R> implements Function<T, ObservableSource<? extends R>> {
    final /* synthetic */ Context $context;

    DefaultOfflineMediaClient$getLocalBifThumbnailSets$2(Context context) {
        this.$context = context;
    }

    public final Observable<BifThumbnailSet> apply(ExoCachedMedia exoCachedMedia) {
        List<String> thumbnailFileNames = exoCachedMedia.getThumbnailFileNames(this.$context);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) thumbnailFileNames, 10));
        for (String str : thumbnailFileNames) {
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            sb.append(str);
            arrayList.add(exoCachedMedia.thumbnailFileNameToSet(sb.toString()));
        }
        return Observable.m38302a((Iterable<? extends T>) arrayList);
    }
}
