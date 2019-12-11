package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse;
import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime;
import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$BookmarkRuntime;", "it", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$getRuntimes$1<T, R> implements Function<T, R> {
    public static final DefaultBookmarkApi$getRuntimes$1 INSTANCE = new DefaultBookmarkApi$getRuntimes$1();

    DefaultBookmarkApi$getRuntimes$1() {
    }

    public final List<BookmarkRuntime> apply(GraphQlResponse<DmcVideoResponse> graphQlResponse) {
        List errors = graphQlResponse.getErrors();
        if (errors == null || errors.isEmpty()) {
            DmcVideoResponse dmcVideoResponse = (DmcVideoResponse) graphQlResponse.getData();
            if (dmcVideoResponse != null) {
                RuntimeData dmcVideos = dmcVideoResponse.getDmcVideos();
                if (dmcVideos != null) {
                    return dmcVideos.getVideos();
                }
            }
            return null;
        }
        throw new GetBookmarksFailedException(graphQlResponse.getErrors());
    }
}
