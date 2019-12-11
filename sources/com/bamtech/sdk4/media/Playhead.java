package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.bookmarks.Bookmark;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000J\u0012\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/media/Playhead;", "", "contentId", "", "playhead", "", "lastUpdated", "profileId", "(Ljava/lang/String;JJLjava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getLastUpdated", "()J", "getPlayhead", "getProfileId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isNewerThan", "toMediaPlayhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "referenceBookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "toString", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaPlayhead.kt */
public final class Playhead {
    public static final Companion Companion = new Companion(null);
    private final String contentId;
    private final long lastUpdated;
    private final long playhead;
    private final String profileId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/Playhead$Companion;", "", "()V", "fromMediaPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "mediaPlayhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "profileId", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MediaPlayhead.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Playhead fromMediaPlayhead(MediaPlayhead mediaPlayhead, String str) {
            if (!(mediaPlayhead == null || MediaPlayheadStatus.PlayheadFound != mediaPlayhead.getStatus() || mediaPlayhead.getContentId() == null || str == null)) {
                mediaPlayhead.getPosition();
                if (mediaPlayhead.getLastUpdated() != null) {
                    String contentId = mediaPlayhead.getContentId();
                    long position = (long) mediaPlayhead.getPosition();
                    DateTime dateTime = mediaPlayhead.getLastUpdated().toDateTime(DateTimeZone.UTC);
                    C12880j.m40222a((Object) dateTime, "mediaPlayhead.lastUpdate…ateTime(DateTimeZone.UTC)");
                    Playhead playhead = new Playhead(contentId, position, dateTime.getMillis(), str);
                    return playhead;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Playhead(String str, long j, long j2, String str2) {
        this.contentId = str;
        this.playhead = j;
        this.lastUpdated = j2;
        this.profileId = str2;
    }

    public static /* synthetic */ Playhead copy$default(Playhead playhead2, String str, long j, long j2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playhead2.contentId;
        }
        if ((i & 2) != 0) {
            j = playhead2.playhead;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = playhead2.lastUpdated;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str2 = playhead2.profileId;
        }
        return playhead2.copy(str, j3, j4, str2);
    }

    public static /* synthetic */ MediaPlayhead toMediaPlayhead$default(Playhead playhead2, Bookmark bookmark, int i, Object obj) {
        if ((i & 1) != 0) {
            bookmark = null;
        }
        return playhead2.toMediaPlayhead(bookmark);
    }

    public final String component1() {
        return this.contentId;
    }

    public final long component2() {
        return this.playhead;
    }

    public final long component3() {
        return this.lastUpdated;
    }

    public final String component4() {
        return this.profileId;
    }

    public final Playhead copy(String str, long j, long j2, String str2) {
        Playhead playhead2 = new Playhead(str, j, j2, str2);
        return playhead2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Playhead) {
                Playhead playhead2 = (Playhead) obj;
                if (C12880j.m40224a((Object) this.contentId, (Object) playhead2.contentId)) {
                    if (this.playhead == playhead2.playhead) {
                        if (!(this.lastUpdated == playhead2.lastUpdated) || !C12880j.m40224a((Object) this.profileId, (Object) playhead2.profileId)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final long getPlayhead() {
        return this.playhead;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public int hashCode() {
        String str = this.contentId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.playhead;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.lastUpdated;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.profileId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final boolean isNewerThan(Playhead playhead2) {
        return this.lastUpdated > playhead2.lastUpdated;
    }

    public final MediaPlayhead toMediaPlayhead(Bookmark bookmark) {
        long j;
        if (bookmark == null) {
            j = this.playhead;
        } else if (MediaPlayheadKt.shouldResetPlayhead(bookmark, this.playhead)) {
            j = 0;
        } else {
            j = this.playhead;
        }
        MediaPlayhead mediaPlayhead = new MediaPlayhead((double) j, new DateTime(this.lastUpdated, DateTimeZone.UTC), MediaPlayheadStatus.PlayheadFound, this.contentId);
        return mediaPlayhead;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Playhead(contentId=");
        sb.append(this.contentId);
        sb.append(", playhead=");
        sb.append(this.playhead);
        sb.append(", lastUpdated=");
        sb.append(this.lastUpdated);
        sb.append(", profileId=");
        sb.append(this.profileId);
        sb.append(")");
        return sb.toString();
    }
}
