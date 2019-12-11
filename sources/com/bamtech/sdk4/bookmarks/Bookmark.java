package com.bamtech.sdk4.bookmarks;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\u0006\u0010%\u001a\u00020!J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006'"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/Bookmark;", "", "contentId", "", "playhead", "", "runtime", "profileId", "occurredOn", "ccDefault", "ccMedia", "(Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/Long;)V", "getCcDefault", "()J", "getCcMedia", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContentId", "()Ljava/lang/String;", "getOccurredOn", "getPlayhead", "getProfileId", "getRuntime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/Long;)Lcom/bamtech/sdk4/bookmarks/Bookmark;", "equals", "", "other", "hashCode", "", "isMetaDataValid", "toString", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Bookmark.kt */
public final class Bookmark {
    private final long ccDefault;
    private final Long ccMedia;
    private final String contentId;
    private final long occurredOn;
    private final long playhead;
    private final String profileId;
    private final long runtime;

    public Bookmark(String str, long j, long j2, String str2, long j3, long j4, Long l) {
        this.contentId = str;
        this.playhead = j;
        this.runtime = j2;
        this.profileId = str2;
        this.occurredOn = j3;
        this.ccDefault = j4;
        this.ccMedia = l;
    }

    public static /* synthetic */ Bookmark copy$default(Bookmark bookmark, String str, long j, long j2, String str2, long j3, long j4, Long l, int i, Object obj) {
        Bookmark bookmark2 = bookmark;
        return bookmark.copy((i & 1) != 0 ? bookmark2.contentId : str, (i & 2) != 0 ? bookmark2.playhead : j, (i & 4) != 0 ? bookmark2.runtime : j2, (i & 8) != 0 ? bookmark2.profileId : str2, (i & 16) != 0 ? bookmark2.occurredOn : j3, (i & 32) != 0 ? bookmark2.ccDefault : j4, (i & 64) != 0 ? bookmark2.ccMedia : l);
    }

    public final String component1() {
        return this.contentId;
    }

    public final long component2() {
        return this.playhead;
    }

    public final long component3() {
        return this.runtime;
    }

    public final String component4() {
        return this.profileId;
    }

    public final long component5() {
        return this.occurredOn;
    }

    public final long component6() {
        return this.ccDefault;
    }

    public final Long component7() {
        return this.ccMedia;
    }

    public final Bookmark copy(String str, long j, long j2, String str2, long j3, long j4, Long l) {
        Bookmark bookmark = new Bookmark(str, j, j2, str2, j3, j4, l);
        return bookmark;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bookmark) {
                Bookmark bookmark = (Bookmark) obj;
                if (C12880j.m40224a((Object) this.contentId, (Object) bookmark.contentId)) {
                    if (this.playhead == bookmark.playhead) {
                        if ((this.runtime == bookmark.runtime) && C12880j.m40224a((Object) this.profileId, (Object) bookmark.profileId)) {
                            if (this.occurredOn == bookmark.occurredOn) {
                                if (!(this.ccDefault == bookmark.ccDefault) || !C12880j.m40224a((Object) this.ccMedia, (Object) bookmark.ccMedia)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getCcDefault() {
        return this.ccDefault;
    }

    public final Long getCcMedia() {
        return this.ccMedia;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getOccurredOn() {
        return this.occurredOn;
    }

    public final long getPlayhead() {
        return this.playhead;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final long getRuntime() {
        return this.runtime;
    }

    public int hashCode() {
        String str = this.contentId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.playhead;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.runtime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.profileId;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j3 = this.occurredOn;
        int i4 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.ccDefault;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        Long l = this.ccMedia;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    public final boolean isMetaDataValid() {
        Long l = this.ccMedia;
        boolean z = l == null || l.longValue() > 0;
        if (this.runtime <= 0 || this.ccDefault <= 0 || !z) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bookmark(contentId=");
        sb.append(this.contentId);
        sb.append(", playhead=");
        sb.append(this.playhead);
        sb.append(", runtime=");
        sb.append(this.runtime);
        sb.append(", profileId=");
        sb.append(this.profileId);
        sb.append(", occurredOn=");
        sb.append(this.occurredOn);
        sb.append(", ccDefault=");
        sb.append(this.ccDefault);
        sb.append(", ccMedia=");
        sb.append(this.ccMedia);
        sb.append(")");
        return sb.toString();
    }
}
