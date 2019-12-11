package com.bamtech.sdk4.media;

import com.bamtech.sdk4.bookmarks.Bookmark;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, mo31007d2 = {"shouldResetPlayhead", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "referencePlayhead", "", "extension-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: MediaPlayhead.kt */
public final class MediaPlayheadKt {
    /* access modifiers changed from: private */
    public static final boolean shouldResetPlayhead(Bookmark bookmark, long j) {
        Long ccMedia = bookmark.getCcMedia();
        if (ccMedia != null) {
            if (j > ccMedia.longValue()) {
                return true;
            }
        } else if (bookmark.getCcDefault() > 0 && j > bookmark.getCcDefault()) {
            return true;
        }
        return false;
    }
}
