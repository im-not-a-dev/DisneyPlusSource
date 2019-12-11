package com.bamtechmedia.dominguez.detail.movie.models;

import com.bamtech.sdk4.bookmarks.Bookmark;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.detail.movie.models.d */
/* compiled from: MovieUserData.kt */
public final class C6026d {

    /* renamed from: a */
    private final boolean f13888a;

    /* renamed from: b */
    private final Bookmark f13889b;

    public C6026d() {
        this(false, null, 3, null);
    }

    public C6026d(boolean z, Bookmark bookmark) {
        this.f13888a = z;
        this.f13889b = bookmark;
    }

    /* renamed from: a */
    public static /* synthetic */ C6026d m19290a(C6026d dVar, boolean z, Bookmark bookmark, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dVar.f13888a;
        }
        if ((i & 2) != 0) {
            bookmark = dVar.f13889b;
        }
        return dVar.mo18121a(z, bookmark);
    }

    /* renamed from: a */
    public final Bookmark mo18120a() {
        return this.f13889b;
    }

    /* renamed from: a */
    public final C6026d mo18121a(boolean z, Bookmark bookmark) {
        return new C6026d(z, bookmark);
    }

    /* renamed from: b */
    public final boolean mo18122b() {
        return this.f13888a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6026d) {
                C6026d dVar = (C6026d) obj;
                if (!(this.f13888a == dVar.f13888a) || !Intrinsics.areEqual((Object) this.f13889b, (Object) dVar.f13889b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f13888a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Bookmark bookmark = this.f13889b;
        return i + (bookmark != null ? bookmark.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieUserData(isInWatchlist=");
        sb.append(this.f13888a);
        sb.append(", bookmark=");
        sb.append(this.f13889b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6026d(boolean z, Bookmark bookmark, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bookmark = null;
        }
        this(z, bookmark);
    }
}
