package com.bamtechmedia.dominguez.core.content.sets;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "", "(Ljava/lang/String;I)V", "CuratedSet", "RecommendationSet", "TrendingSet", "BookmarkSet", "WatchlistSet", "BecauseYouSet", "ContinueWatchingSet", "UnsupportedSet", "SearchItemSet", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SetModels.kt */
public enum ContentSetType {
    CuratedSet,
    RecommendationSet,
    TrendingSet,
    BookmarkSet,
    WatchlistSet,
    BecauseYouSet,
    ContinueWatchingSet,
    UnsupportedSet,
    SearchItemSet;
    
    public static final C3755a Companion = null;

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.ContentSetType$a */
    /* compiled from: SetModels.kt */
    public static final class C3755a {
        private C3755a() {
        }

        /* renamed from: a */
        public final ContentSetType mo13625a(String str) {
            try {
                return ContentSetType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return ContentSetType.UnsupportedSet;
            }
        }

        public /* synthetic */ C3755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new C3755a(null);
    }
}
