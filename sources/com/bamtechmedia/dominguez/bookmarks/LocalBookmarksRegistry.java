package com.bamtechmedia.dominguez.bookmarks;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.bookmarks.BookmarksApi;
import com.bamtech.sdk4.bookmarks.BookmarksApi.DefaultImpls;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionProfileInfo;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11733i;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J$\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0%2\u0006\u0010&\u001a\u00020\u001dH\u0002J\u001c\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0%H\u0016J$\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0%2\u0006\u0010)\u001a\u00020\u001dH\u0016J$\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0%2\u0006\u0010+\u001a\u00020\u001dH\u0016J\u0014\u0010,\u001a\u0004\u0018\u00010\u00132\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0017H\u0016J\f\u00100\u001a\u000201*\u00020\u0002H\u0002J\f\u00102\u001a\u000201*\u00020\u0013H\u0002J\u0014\u00103\u001a\u00020\"*\u00020\u00022\u0006\u00104\u001a\u00020\u001dH\u0002J \u00105\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0%*\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u00068"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarksRegistry;", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "bookmarksApi", "Lcom/bamtech/sdk4/bookmarks/BookmarksApi;", "preferences", "Landroid/content/SharedPreferences;", "config", "Lcom/bamtechmedia/dominguez/bookmarks/BookmarksConfig;", "computationThread", "Lio/reactivex/Scheduler;", "moshi", "Lcom/squareup/moshi/Moshi;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "(Lcom/bamtech/sdk4/bookmarks/BookmarksApi;Landroid/content/SharedPreferences;Lcom/bamtechmedia/dominguez/bookmarks/BookmarksConfig;Lio/reactivex/Scheduler;Lcom/squareup/moshi/Moshi;Lio/reactivex/Single;)V", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarksRegistry$BookmarkData;", "getJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "cleanup", "", "createBookmark", "Lio/reactivex/Completable;", "asset", "createBookmarksMap", "", "", "", "mediaId", "seriesId", "bookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "getBookmark", "lastBookmarkMaybe", "Lio/reactivex/Maybe;", "preferenceKey", "lastLocalBookmarkMapMaybe", "lastMovieBookmarkMaybe", "familyId", "lastSeriesBookmarkMaybe", "encodedSeriesId", "parseBookmarkData", "json", "preparePlayback", "updateTimestamp", "hasValidRuntime", "", "outdated", "toBookmark", "profileId", "withSdkBookmark", "BookmarkData", "Companion", "bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocalBookmarksRegistry.kt */
public final class LocalBookmarksRegistry implements C3165c<C3693o> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BookmarksApi f8079a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SharedPreferences f8080b;

    /* renamed from: c */
    private final C3163a f8081c;

    /* renamed from: d */
    private final C11969r f8082d;

    /* renamed from: e */
    private final C11760v f8083e;

    /* renamed from: f */
    private final Single<Session> f8084f;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarksRegistry$BookmarkData;", "", "mediaId", "", "contentId", "seriesId", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getContentId", "()Ljava/lang/String;", "getMediaId", "getSeriesId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LocalBookmarksRegistry.kt */
    public static final class BookmarkData {

        /* renamed from: a */
        private final String f8085a;

        /* renamed from: b */
        private final String f8086b;

        /* renamed from: c */
        private final String f8087c;

        /* renamed from: d */
        private final long f8088d;

        public BookmarkData(String str, String str2, String str3, long j) {
            this.f8085a = str;
            this.f8086b = str2;
            this.f8087c = str3;
            this.f8088d = j;
        }

        /* renamed from: a */
        public static /* synthetic */ BookmarkData m11043a(BookmarkData bookmarkData, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bookmarkData.f8085a;
            }
            if ((i & 2) != 0) {
                str2 = bookmarkData.f8086b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = bookmarkData.f8087c;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                j = bookmarkData.f8088d;
            }
            return bookmarkData.mo12189a(str, str4, str5, j);
        }

        /* renamed from: a */
        public final BookmarkData mo12189a(String str, String str2, String str3, long j) {
            BookmarkData bookmarkData = new BookmarkData(str, str2, str3, j);
            return bookmarkData;
        }

        /* renamed from: a */
        public final String mo12190a() {
            return this.f8086b;
        }

        /* renamed from: b */
        public final String mo12191b() {
            return this.f8085a;
        }

        /* renamed from: c */
        public final String mo12192c() {
            return this.f8087c;
        }

        /* renamed from: d */
        public final long mo12193d() {
            return this.f8088d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BookmarkData) {
                    BookmarkData bookmarkData = (BookmarkData) obj;
                    if (C12880j.m40224a((Object) this.f8085a, (Object) bookmarkData.f8085a) && C12880j.m40224a((Object) this.f8086b, (Object) bookmarkData.f8086b) && C12880j.m40224a((Object) this.f8087c, (Object) bookmarkData.f8087c)) {
                        if (this.f8088d == bookmarkData.f8088d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f8085a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f8086b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8087c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            long j = this.f8088d;
            return i2 + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BookmarkData(mediaId=");
            sb.append(this.f8085a);
            sb.append(", contentId=");
            sb.append(this.f8086b);
            sb.append(", seriesId=");
            sb.append(this.f8087c);
            sb.append(", timestamp=");
            sb.append(this.f8088d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$a */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3147a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ LocalBookmarksRegistry f8089a;

        C3147a(LocalBookmarksRegistry localBookmarksRegistry) {
            this.f8089a = localBookmarksRegistry;
        }

        public final void run() {
            this.f8089a.m11033c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$b */
    /* compiled from: LocalBookmarksRegistry.kt */
    public static final class C3148b {
        private C3148b() {
        }

        public /* synthetic */ C3148b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$c */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3149c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C3149c f8090c = new C3149c();

        C3149c() {
        }

        /* renamed from: a */
        public final Single<SessionInfo> apply(Session session) {
            return session.getSessionInfo();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$d */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3150d<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        public static final C3150d f8091c = new C3150d();

        C3150d() {
        }

        /* renamed from: a */
        public final Maybe<SessionProfileInfo> apply(SessionInfo sessionInfo) {
            return sessionInfo.getProfile() != null ? Maybe.m38258c(sessionInfo.getProfile()) : Maybe.m38259h();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$e */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3151e<T, R> implements Function<SessionProfileInfo, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C3693o f8092U;

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8093c;

        C3151e(LocalBookmarksRegistry localBookmarksRegistry, C3693o oVar) {
            this.f8093c = localBookmarksRegistry;
            this.f8092U = oVar;
        }

        /* renamed from: a */
        public final Completable apply(SessionProfileInfo sessionProfileInfo) {
            return this.f8093c.f8079a.importBookmarks(C13183n.m40498a(this.f8093c.m11017a(this.f8092U, sessionProfileInfo.getId())));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$f */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3152f<T, R> implements Function<Throwable, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C3693o f8094U;

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8095c;

        C3152f(LocalBookmarksRegistry localBookmarksRegistry, C3693o oVar) {
            this.f8095c = localBookmarksRegistry;
            this.f8094U = oVar;
        }

        /* renamed from: a */
        public final CompletableSource apply(Throwable th) {
            C14100a.m44527b(th);
            if (this.f8095c.m11036d(this.f8094U)) {
                return this.f8095c.m11026b(this.f8094U);
            }
            return Completable.m38169h();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$g */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3153g<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ String f8096U;

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8097c;

        C3153g(LocalBookmarksRegistry localBookmarksRegistry, String str) {
            this.f8097c = localBookmarksRegistry;
            this.f8096U = str;
        }

        public final String call() {
            return this.f8097c.f8080b.getString(this.f8096U, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$h */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3154h<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8098c;

        C3154h(LocalBookmarksRegistry localBookmarksRegistry) {
            this.f8098c = localBookmarksRegistry;
        }

        /* renamed from: a */
        public final BookmarkData apply(String str) {
            Object fromJson = this.f8098c.m11035d().fromJson(str);
            if (fromJson != null) {
                return (BookmarkData) fromJson;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$i */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3155i<T> implements Consumer<BookmarkData> {

        /* renamed from: c */
        public static final C3155i f8099c = new C3155i();

        C3155i() {
        }

        /* renamed from: a */
        public final void accept(BookmarkData bookmarkData) {
            C5855o oVar = C5855o.f13640a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$j */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3156j<T> implements Consumer<BookmarkData> {

        /* renamed from: U */
        final /* synthetic */ String f8100U;

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8101c;

        C3156j(LocalBookmarksRegistry localBookmarksRegistry, String str) {
            this.f8101c = localBookmarksRegistry;
            this.f8100U = str;
        }

        /* renamed from: a */
        public final void accept(BookmarkData bookmarkData) {
            LocalBookmarksRegistry localBookmarksRegistry = this.f8101c;
            C12880j.m40222a((Object) bookmarkData, "it");
            if (localBookmarksRegistry.m11022a(bookmarkData)) {
                C5855o oVar = C5855o.f13640a;
                Editor edit = this.f8101c.f8080b.edit();
                C12880j.m40222a((Object) edit, "editor");
                edit.remove(this.f8100U);
                edit.apply();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$k */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3157k<T> implements C11952h<BookmarkData> {

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8102c;

        C3157k(LocalBookmarksRegistry localBookmarksRegistry) {
            this.f8102c = localBookmarksRegistry;
        }

        /* renamed from: a */
        public final boolean test(BookmarkData bookmarkData) {
            return !this.f8102c.m11022a(bookmarkData);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$l */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3158l<T> implements Consumer<BookmarkData> {

        /* renamed from: c */
        public static final C3158l f8103c = new C3158l();

        C3158l() {
        }

        /* renamed from: a */
        public final void accept(BookmarkData bookmarkData) {
            C5855o oVar = C5855o.f13640a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$m */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3159m<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8104c;

        C3159m(LocalBookmarksRegistry localBookmarksRegistry) {
            this.f8104c = localBookmarksRegistry;
        }

        /* renamed from: a */
        public final Maybe<Map<String, Object>> apply(BookmarkData bookmarkData) {
            return this.f8104c.m11027b(bookmarkData);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$n */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3160n<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: c */
        public static final C3160n f8105c = new C3160n();

        C3160n() {
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            C5855o oVar = C5855o.f13640a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$o */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3161o<T> implements C11952h<List<? extends Bookmark>> {

        /* renamed from: c */
        public static final C3161o f8106c = new C3161o();

        C3161o() {
        }

        /* renamed from: a */
        public final boolean test(List<Bookmark> list) {
            return !list.isEmpty();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry$p */
    /* compiled from: LocalBookmarksRegistry.kt */
    static final class C3162p<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ BookmarkData f8107U;

        /* renamed from: c */
        final /* synthetic */ LocalBookmarksRegistry f8108c;

        C3162p(LocalBookmarksRegistry localBookmarksRegistry, BookmarkData bookmarkData) {
            this.f8108c = localBookmarksRegistry;
            this.f8107U = bookmarkData;
        }

        /* renamed from: a */
        public final Map<String, Object> apply(List<Bookmark> list) {
            return this.f8108c.m11020a(this.f8107U.mo12191b(), this.f8107U.mo12192c(), (Bookmark) C13199w.m40589f((List) list));
        }
    }

    static {
        new C3148b(null);
    }

    public LocalBookmarksRegistry(BookmarksApi bookmarksApi, SharedPreferences sharedPreferences, C3163a aVar, C11969r rVar, C11760v vVar, Single<Session> single) {
        this.f8079a = bookmarksApi;
        this.f8080b = sharedPreferences;
        this.f8081c = aVar;
        this.f8082d = rVar;
        this.f8083e = vVar;
        this.f8084f = single;
        Completable b = Completable.m38166c((C11945a) new C3147a(this)).mo30051b(this.f8082d);
        C12880j.m40222a((Object) b, "Completable.fromAction {…ribeOn(computationThread)");
        C5826e0.m18823a(b, null, null, 3, null);
    }

    /* renamed from: c */
    private final Maybe<Map<String, Object>> m11032c(String str) {
        Maybe<Map<String, Object>> c = Maybe.m38257b((Callable<? extends T>) new C3153g<Object>(this, str)).mo30131f(new C3154h(this)).mo30123c((Consumer<? super T>) C3155i.f8099c).mo30123c((Consumer<? super T>) new C3156j<Object>(this, str)).mo30106a((C11952h<? super T>) new C3157k<Object>(this)).mo30123c((Consumer<? super T>) C3158l.f8103c).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C3159m<Object,Object>(this)).mo30123c((Consumer<? super T>) C3160n.f8105c);
        C12880j.m40222a((Object) c, "Maybe.fromCallable<Strin…okmark from SDK $map\" } }");
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C11725h<BookmarkData> m11035d() {
        C11725h<BookmarkData> a = this.f8083e.mo29866a(BookmarkData.class);
        C12880j.m40222a((Object) a, "moshi.adapter(BookmarkData::class.java)");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m11036d(C3693o oVar) {
        Long w = oVar.mo12913w();
        if (C12880j.m40224a((Object) w, (Object) Integer.valueOf(0))) {
            w = null;
        }
        if (w != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Maybe<Map<String, Object>> mo12187b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("bookmarksHandshakeLastSeries_");
        sb.append(str);
        return m11032c(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Maybe<Map<String, Object>> m11027b(BookmarkData bookmarkData) {
        Maybe<Map<String, Object>> f = this.f8079a.getLocalBookmarks(C13183n.m40498a(bookmarkData.mo12190a())).mo30202a((C11952h<? super T>) C3161o.f8106c).mo30131f(new C3162p(this, bookmarkData));
        C12880j.m40222a((Object) f, "bookmarksApi.getLocalBoo…, seriesId, it.first()) }");
        return f;
    }

    /* renamed from: a */
    public Maybe<Map<String, Object>> mo12185a() {
        return m11032c("bookmarksHandshakeLastBookmark");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Completable m11026b(C3693o oVar) {
        Completable f = this.f8084f.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C3149c.f8090c).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) C3150d.f8091c).mo30114b((Function<? super T, ? extends CompletableSource>) new C3151e<Object,Object>(this, oVar)).mo30055f();
        C12880j.m40222a((Object) f, "sessionOnce.flatMap { it…       .onErrorComplete()");
        return f;
    }

    /* renamed from: a */
    public Maybe<Map<String, Object>> mo12186a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("bookmarksHandshakeLastMovie_");
        sb.append(str);
        return m11032c(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m11022a(BookmarkData bookmarkData) {
        return bookmarkData.mo12193d() + TimeUnit.MINUTES.toMillis(this.f8081c.mo12213a()) < System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, Object> m11020a(String str, String str2, Bookmark bookmark) {
        return C13173j0.m40356a(C12907r.m40244a("seriesId", str2), C12907r.m40244a("mediaId", str), C12907r.m40244a("contentId", bookmark.getContentId()), C12907r.m40244a("playhead", Long.valueOf(bookmark.getPlayhead())), C12907r.m40244a("ccMedia", bookmark.getCcMedia()), C12907r.m40244a("runtime", Long.valueOf(bookmark.getRuntime())), C12907r.m40244a("occurredOn", Long.valueOf(bookmark.getOccurredOn())));
    }

    /* renamed from: c */
    private final Completable m11031c(C3693o oVar) {
        Completable a = DefaultImpls.getBookmarks$default(this.f8079a, C13183n.m40498a(oVar.mo12903f()), null, 2, null).mo30228e().mo30033a(5000, TimeUnit.MILLISECONDS, this.f8082d).mo30037a((Function<? super Throwable, ? extends CompletableSource>) new C3152f<Object,Object>(this, oVar));
        C12880j.m40222a((Object) a, "bookmarksApi.getBookmark… complete()\n            }");
        return a;
    }

    /* renamed from: b */
    public void mo12188b() {
        Map all = this.f8080b.getAll();
        C12880j.m40222a((Object) all, "preferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : all.entrySet()) {
            String str = (String) entry.getKey();
            C12880j.m40222a((Object) str, "it");
            if (C12832w.m40123b(str, "bookmarksHandshake", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap.size()));
        for (Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), m11025b(entry2.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap2.size()));
        for (Entry entry3 : linkedHashMap2.entrySet()) {
            BookmarkData bookmarkData = (BookmarkData) entry3.getValue();
            linkedHashMap3.put(entry3.getKey(), bookmarkData != null ? BookmarkData.m11043a(bookmarkData, null, null, null, System.currentTimeMillis(), 7, null) : null);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap3.size()));
        for (Entry entry4 : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(entry4.getKey(), m11035d().toJson(entry4.getValue()));
        }
        Editor edit = this.f8080b.edit();
        C12880j.m40222a((Object) edit, "editor");
        for (Entry entry5 : linkedHashMap4.entrySet()) {
            edit.putString((String) entry5.getKey(), (String) entry5.getValue());
        }
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m11033c() {
        Map all = this.f8080b.getAll();
        C12880j.m40222a((Object) all, "preferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : all.entrySet()) {
            String str = (String) entry.getKey();
            C12880j.m40222a((Object) str, "it");
            if (C12832w.m40123b(str, "bookmarksHandshake", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap.size()));
        for (Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), m11025b(entry2.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Entry entry3 : linkedHashMap2.entrySet()) {
            BookmarkData bookmarkData = (BookmarkData) entry3.getValue();
            if (bookmarkData == null || m11022a(bookmarkData)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Editor edit = this.f8080b.edit();
        C12880j.m40222a((Object) edit, "editor");
        for (Entry key : linkedHashMap3.entrySet()) {
            edit.remove((String) key.getKey());
        }
        edit.apply();
    }

    /* renamed from: a */
    public Completable mo12184a(C3693o oVar) {
        Editor edit = this.f8080b.edit();
        C12880j.m40222a((Object) edit, "editor");
        String mediaId = oVar.getMediaId();
        String f = oVar.mo12903f();
        boolean z = oVar instanceof C3685g;
        String str = null;
        C3685g gVar = (C3685g) (!z ? null : oVar);
        if (gVar != null) {
            str = gVar.mo12874D();
        }
        BookmarkData bookmarkData = new BookmarkData(mediaId, f, str, System.currentTimeMillis());
        String json = m11035d().toJson(bookmarkData);
        C5855o oVar2 = C5855o.f13640a;
        edit.putString("bookmarksHandshakeLastBookmark", json);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("bookmarksHandshakeLastSeries_");
            sb.append(((C3685g) oVar).mo12873C());
            edit.putString(sb.toString(), json);
        } else if (oVar instanceof C3692n) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bookmarksHandshakeLastMovie_");
            sb2.append(oVar.mo13264e());
            edit.putString(sb2.toString(), json);
        }
        edit.apply();
        return m11031c(oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bookmark m11017a(C3693o oVar, String str) {
        C5855o oVar2 = C5855o.f13640a;
        Long w = oVar.mo12913w();
        if (C12880j.m40224a((Object) w, (Object) Integer.valueOf(0))) {
            w = null;
        }
        C5884x.m18951a((Object) w, (String) null, 1, (Object) null);
        long longValue = w.longValue() / ((long) 1000);
        String f = oVar.mo12903f();
        Long playhead = oVar.getPlayhead();
        Bookmark bookmark = new Bookmark(f, playhead != null ? playhead.longValue() : 0, longValue, str, System.currentTimeMillis(), (long) (((double) longValue) * 0.95d), null);
        return bookmark;
    }

    /* renamed from: b */
    private final BookmarkData m11025b(Object obj) {
        try {
            C11725h d = m11035d();
            if (obj != null) {
                return (BookmarkData) d.fromJson((String) obj);
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return null;
        }
    }
}
