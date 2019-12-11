package com.bamtechmedia.dominguez.detail.series.models;

import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtechmedia.dominguez.core.content.C3685g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.detail.series.models.f */
/* compiled from: SeriesUserData.kt */
public final class C6048f {

    /* renamed from: a */
    private final boolean f13934a;

    /* renamed from: b */
    private final C3685g f13935b;

    /* renamed from: c */
    private final Bookmark f13936c;

    public C6048f(boolean z, C3685g gVar, Bookmark bookmark) {
        this.f13934a = z;
        this.f13935b = gVar;
        this.f13936c = bookmark;
    }

    /* renamed from: a */
    public static /* synthetic */ C6048f m19380a(C6048f fVar, boolean z, C3685g gVar, Bookmark bookmark, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fVar.f13934a;
        }
        if ((i & 2) != 0) {
            gVar = fVar.f13935b;
        }
        if ((i & 4) != 0) {
            bookmark = fVar.f13936c;
        }
        return fVar.mo18298a(z, gVar, bookmark);
    }

    /* renamed from: a */
    public final C3685g mo18297a() {
        return this.f13935b;
    }

    /* renamed from: a */
    public final C6048f mo18298a(boolean z, C3685g gVar, Bookmark bookmark) {
        return new C6048f(z, gVar, bookmark);
    }

    /* renamed from: b */
    public final Bookmark mo18299b() {
        return this.f13936c;
    }

    /* renamed from: c */
    public final boolean mo18300c() {
        return this.f13934a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6048f) {
                C6048f fVar = (C6048f) obj;
                if (!(this.f13934a == fVar.f13934a) || !Intrinsics.areEqual((Object) this.f13935b, (Object) fVar.f13935b) || !Intrinsics.areEqual((Object) this.f13936c, (Object) fVar.f13936c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f13934a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C3685g gVar = this.f13935b;
        int i2 = 0;
        int hashCode = (i + (gVar != null ? gVar.hashCode() : 0)) * 31;
        Bookmark bookmark = this.f13936c;
        if (bookmark != null) {
            i2 = bookmark.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesUserData(isInWatchlist=");
        sb.append(this.f13934a);
        sb.append(", activeEpisode=");
        sb.append(this.f13935b);
        sb.append(", bookmark=");
        sb.append(this.f13936c);
        sb.append(")");
        return sb.toString();
    }
}
