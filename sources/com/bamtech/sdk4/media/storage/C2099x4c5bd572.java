package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder$recordPlayheadAndBookmark$bookmarkMaybe$1 */
/* compiled from: PlayheadRecorder.kt */
final class C2099x4c5bd572<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ String $contentId;
    final /* synthetic */ long $occurredOn;
    final /* synthetic */ long $playhead;
    final /* synthetic */ String $profileId;
    final /* synthetic */ DefaultPlayheadRecorder this$0;

    C2099x4c5bd572(DefaultPlayheadRecorder defaultPlayheadRecorder, long j, long j2, String str, String str2) {
        this.this$0 = defaultPlayheadRecorder;
        this.$playhead = j;
        this.$occurredOn = j2;
        this.$profileId = str;
        this.$contentId = str2;
    }

    public final Maybe<Bookmark> apply(List<Bookmark> list) {
        Bookmark bookmark = (Bookmark) C13199w.m40591g((List) list);
        if (bookmark != null) {
            return Maybe.m38258c(this.this$0.update(bookmark, this.$playhead, this.$occurredOn));
        }
        String str = this.$profileId;
        if (str == null) {
            return Maybe.m38259h();
        }
        Bookmark bookmark2 = new Bookmark(this.$contentId, this.$playhead, 0, str, this.$occurredOn, 0, null);
        return Maybe.m38258c(bookmark2);
    }
}
