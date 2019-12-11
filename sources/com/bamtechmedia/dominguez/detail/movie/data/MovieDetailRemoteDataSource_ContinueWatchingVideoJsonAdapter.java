package com.bamtechmedia.dominguez.detail.movie.data;

import com.bamtechmedia.dominguez.core.content.assets.DmcLabel;
import com.bamtechmedia.dominguez.detail.common.BookmarkHit;
import com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource_ContinueWatchingVideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableBookmarkHitAdapter", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;", "nullableDmcLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MovieDetailRemoteDataSource_ContinueWatchingVideoJsonAdapter.kt */
public final class MovieDetailRemoteDataSource_ContinueWatchingVideoJsonAdapter extends C11725h<ContinueWatchingVideo> {
    private final C11725h<BookmarkHit> nullableBookmarkHitAdapter;
    private final C11725h<DmcLabel> nullableDmcLabelAdapter;
    private final C11739b options;

    public MovieDetailRemoteDataSource_ContinueWatchingVideoJsonAdapter(C11760v vVar) {
        String str = "labels";
        String str2 = "resume";
        C11739b a = C11739b.m37729a(str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"resume\", \"labels\")");
        this.options = a;
        C11725h<BookmarkHit> a2 = vVar.mo29869a((Type) BookmarkHit.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a2, "moshi.adapter<BookmarkHi…ons.emptySet(), \"resume\")");
        this.nullableBookmarkHitAdapter = a2;
        C11725h<DmcLabel> a3 = vVar.mo29869a((Type) DmcLabel.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a3, "moshi.adapter<DmcLabel?>…ons.emptySet(), \"labels\")");
        this.nullableDmcLabelAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, ContinueWatchingVideo continueWatchingVideo) {
        if (continueWatchingVideo != null) {
            sVar.mo29791b();
            sVar.mo29796e("resume");
            this.nullableBookmarkHitAdapter.toJson(sVar, continueWatchingVideo.mo18058b());
            sVar.mo29796e("labels");
            this.nullableDmcLabelAdapter.toJson(sVar, continueWatchingVideo.mo18057a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(MovieDetailRemoteDataSource.ContinueWatchingVideo)";
    }

    public ContinueWatchingVideo fromJson(C11737m mVar) {
        mVar.mo29763b();
        BookmarkHit bookmarkHit = null;
        DmcLabel dmcLabel = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                bookmarkHit = (BookmarkHit) this.nullableBookmarkHitAdapter.fromJson(mVar);
            } else if (a == 1) {
                dmcLabel = (DmcLabel) this.nullableDmcLabelAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        return new ContinueWatchingVideo(bookmarkHit, dmcLabel);
    }
}
