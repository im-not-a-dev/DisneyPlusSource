package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoExtension.DefaultImpls;
import com.bamtech.sdk4.session.SessionProfileInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/media/MediaItem;", "mediaItem", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getOnlineItem$1<T, R> implements Function<T, R> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getOnlineItem$1(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
    }

    public final MediaItem apply(MediaItem mediaItem) {
        OnlineMediaItem onlineMediaItem = (OnlineMediaItem) mediaItem;
        MediaPlayhead mediaPlayhead = null;
        SessionProfileInfo profile = ((SessionInfo) DefaultImpls.getSessionInfo$default(this.this$0.sessionInfoExtension, this.$transaction, false, 2, null).mo30224c()).getProfile();
        String id = profile != null ? profile.getId() : null;
        MediaPlayhead playhead = mediaItem.getPlayhead();
        String contentId = mediaItem.getPlayhead().getContentId();
        if (contentId != null) {
            Object c = ((LocalBookmarkStore) this.this$0.localBookmarkStore.get()).fetchBookmarks(this.$transaction, C13183n.m40498a(contentId)).mo30224c();
            C12880j.m40222a(c, "localBookmarkStore.get()…contentId)).blockingGet()");
            Bookmark bookmark = (Bookmark) C13199w.m40591g((List) c);
            Playhead fetchPlayhead = this.this$0.localPlayheadStore.fetchPlayhead(this.$transaction, contentId);
            if (fetchPlayhead != null) {
                mediaPlayhead = fetchPlayhead.toMediaPlayhead(bookmark);
            }
        }
        Playhead fromMediaPlayhead = Playhead.Companion.fromMediaPlayhead(playhead, id);
        if (fromMediaPlayhead != null) {
            this.this$0.localPlayheadStore.importPlayhead(this.$transaction, fromMediaPlayhead);
        }
        return this.this$0.replacePlayheadIfNewer(onlineMediaItem, mediaPlayhead);
    }
}
