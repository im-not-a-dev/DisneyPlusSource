package com.bamtech.sdk4.internal.bookmarks;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse;", "", "dmcVideos", "Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$RuntimeData;", "(Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$RuntimeData;)V", "getDmcVideos", "()Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$RuntimeData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BookmarkRuntime", "RuntimeData", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcVideoResponse.kt */
public final class DmcVideoResponse {
    @C2246c("DmcVideos")
    private final RuntimeData dmcVideos;

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$BookmarkRuntime;", "", "contentId", "", "runtime", "", "(Ljava/lang/String;J)V", "getContentId", "()Ljava/lang/String;", "getRuntime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toBookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "profileId", "toString", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DmcVideoResponse.kt */
    public static final class BookmarkRuntime {
        private final String contentId;
        @C2246c("runtimeMillis")
        private final long runtime;

        public BookmarkRuntime(String str, long j) {
            this.contentId = str;
            this.runtime = j;
        }

        public static /* synthetic */ BookmarkRuntime copy$default(BookmarkRuntime bookmarkRuntime, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bookmarkRuntime.contentId;
            }
            if ((i & 2) != 0) {
                j = bookmarkRuntime.runtime;
            }
            return bookmarkRuntime.copy(str, j);
        }

        public final String component1() {
            return this.contentId;
        }

        public final long component2() {
            return this.runtime;
        }

        public final BookmarkRuntime copy(String str, long j) {
            return new BookmarkRuntime(str, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BookmarkRuntime) {
                    BookmarkRuntime bookmarkRuntime = (BookmarkRuntime) obj;
                    if (Intrinsics.areEqual((Object) this.contentId, (Object) bookmarkRuntime.contentId)) {
                        if (this.runtime == bookmarkRuntime.runtime) {
                            return true;
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

        public final long getRuntime() {
            return this.runtime;
        }

        public int hashCode() {
            String str = this.contentId;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.runtime;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final Bookmark toBookmark(String str) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.runtime);
            String str2 = this.contentId;
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            Bookmark bookmark = new Bookmark(str2, 0, seconds, str, now.getMillis(), (long) (((double) seconds) * 0.95d), null);
            return bookmark;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BookmarkRuntime(contentId=");
            sb.append(this.contentId);
            sb.append(", runtime=");
            sb.append(this.runtime);
            sb.append(")");
            return sb.toString();
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$RuntimeData;", "", "videos", "", "Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$BookmarkRuntime;", "(Ljava/util/List;)V", "getVideos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DmcVideoResponse.kt */
    public static final class RuntimeData {
        private final List<BookmarkRuntime> videos;

        public RuntimeData(List<BookmarkRuntime> list) {
            this.videos = list;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$BookmarkRuntime>, for r1v0, types: [java.util.List] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData copy$default(com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData r0, java.util.List<com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime> r1, int r2, java.lang.Object r3) {
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0006
                java.util.List<com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$BookmarkRuntime> r1 = r0.videos
            L_0x0006:
                com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData r0 = r0.copy(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData.copy$default(com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData, java.util.List, int, java.lang.Object):com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData");
        }

        public final List<BookmarkRuntime> component1() {
            return this.videos;
        }

        public final RuntimeData copy(List<BookmarkRuntime> list) {
            return new RuntimeData(list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.videos, (java.lang.Object) ((com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData) r2).videos) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData
                if (r0 == 0) goto L_0x0013
                com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData r2 = (com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData) r2
                java.util.List<com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$BookmarkRuntime> r0 = r1.videos
                java.util.List<com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$BookmarkRuntime> r2 = r2.videos
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.RuntimeData.equals(java.lang.Object):boolean");
        }

        public final List<BookmarkRuntime> getVideos() {
            return this.videos;
        }

        public int hashCode() {
            List<BookmarkRuntime> list = this.videos;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeData(videos=");
            sb.append(this.videos);
            sb.append(")");
            return sb.toString();
        }
    }

    public DmcVideoResponse(RuntimeData runtimeData) {
        this.dmcVideos = runtimeData;
    }

    public static /* synthetic */ DmcVideoResponse copy$default(DmcVideoResponse dmcVideoResponse, RuntimeData runtimeData, int i, Object obj) {
        if ((i & 1) != 0) {
            runtimeData = dmcVideoResponse.dmcVideos;
        }
        return dmcVideoResponse.copy(runtimeData);
    }

    public final RuntimeData component1() {
        return this.dmcVideos;
    }

    public final DmcVideoResponse copy(RuntimeData runtimeData) {
        return new DmcVideoResponse(runtimeData);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.dmcVideos, (java.lang.Object) ((com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse) r2).dmcVideos) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse r2 = (com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse) r2
            com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData r0 = r1.dmcVideos
            com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$RuntimeData r2 = r2.dmcVideos
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.equals(java.lang.Object):boolean");
    }

    public final RuntimeData getDmcVideos() {
        return this.dmcVideos;
    }

    public int hashCode() {
        RuntimeData runtimeData = this.dmcVideos;
        if (runtimeData != null) {
            return runtimeData.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoResponse(dmcVideos=");
        sb.append(this.dmcVideos);
        sb.append(")");
        return sb.toString();
    }
}
