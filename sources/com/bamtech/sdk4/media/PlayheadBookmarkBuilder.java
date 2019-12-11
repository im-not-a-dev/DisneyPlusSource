package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlayheadBookmarkBuilder;", "", "bookmark", "Lcom/bamtech/sdk4/media/Playhead;", "(Lcom/bamtech/sdk4/media/Playhead;)V", "getBookmark", "()Lcom/bamtech/sdk4/media/Playhead;", "lastUpdated", "Lorg/joda/time/DateTime;", "getLastUpdated", "()Lorg/joda/time/DateTime;", "setLastUpdated", "(Lorg/joda/time/DateTime;)V", "profileId", "", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "build", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaPlayhead.kt */
public final class PlayheadBookmarkBuilder {
    private final Playhead bookmark;
    public DateTime lastUpdated;
    private String profileId;

    public PlayheadBookmarkBuilder(Playhead playhead) {
        this.bookmark = playhead;
    }

    public final Playhead build() {
        String str = this.profileId;
        Playhead playhead = this.bookmark;
        if (playhead == null || str == null) {
            return null;
        }
        String contentId = playhead.getContentId();
        long playhead2 = this.bookmark.getPlayhead();
        DateTime dateTime = this.lastUpdated;
        if (dateTime != null) {
            Playhead playhead3 = new Playhead(contentId, playhead2, dateTime.getMillis(), str);
            return playhead3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastUpdated");
        throw null;
    }

    public final Playhead getBookmark() {
        return this.bookmark;
    }

    public final DateTime getLastUpdated() {
        DateTime dateTime = this.lastUpdated;
        if (dateTime != null) {
            return dateTime;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastUpdated");
        throw null;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final void setLastUpdated(DateTime dateTime) {
        this.lastUpdated = dateTime;
    }

    public final void setProfileId(String str) {
        this.profileId = str;
    }
}
