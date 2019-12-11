package com.bamtechmedia.dominguez.core.content.sets;

import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J8\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0018\u00010\bj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\t\u001a\b\u0018\u00010\bj\u0002`\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "", "getContentSet", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "type", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "setId", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "forceRefresh", "", "loadNextPage", "Lio/reactivex/Maybe;", "set", "positionInSet", "", "offsetFromEndToStartLoading", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.sets.c */
/* compiled from: ContentSetDataSource.kt */
public interface C3765c {

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.c$a */
    /* compiled from: ContentSetDataSource.kt */
    public static final class C3766a {

        /* renamed from: a */
        static final /* synthetic */ C3766a f9397a = new C3766a();

        private C3766a() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.c$b */
    /* compiled from: ContentSetDataSource.kt */
    public static final class C3767b {
        /* renamed from: a */
        public static /* synthetic */ Single m12769a(C3765c cVar, ContentSetType contentSetType, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                return cVar.mo13659a(contentSetType, str, str2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContentSet");
        }

        /* renamed from: a */
        public static /* synthetic */ Maybe m12768a(C3765c cVar, ContentSet contentSet, int i, String str, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    str = null;
                }
                if ((i3 & 8) != 0) {
                    i2 = 5;
                }
                return cVar.mo13658a(contentSet, i, str, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadNextPage");
        }
    }

    static {
        C3766a aVar = C3766a.f9397a;
    }

    /* renamed from: a */
    Maybe<ContentSet> mo13658a(ContentSet contentSet, int i, String str, int i2);

    /* renamed from: a */
    Single<ContentSet> mo13659a(ContentSetType contentSetType, String str, String str2, boolean z);
}
