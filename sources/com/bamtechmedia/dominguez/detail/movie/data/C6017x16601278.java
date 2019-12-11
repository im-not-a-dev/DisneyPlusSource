package com.bamtechmedia.dominguez.detail.movie.data;

import com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo;
import com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideoResponse;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource_ContinueWatchingVideoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideoResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "continueWatchingVideoAdapter", "Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource_ContinueWatchingVideoResponseJsonAdapter */
/* compiled from: MovieDetailRemoteDataSource_ContinueWatchingVideoResponseJsonAdapter.kt */
public final class C6017x16601278 extends C11725h<ContinueWatchingVideoResponse> {
    private final C11725h<ContinueWatchingVideo> continueWatchingVideoAdapter;
    private final C11739b options;

    public C6017x16601278(C11760v vVar) {
        C11739b a = C11739b.m37729a("ContinueWatchingVideo");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"ContinueWatchingVideo\")");
        this.options = a;
        C11725h<ContinueWatchingVideo> a2 = vVar.mo29869a((Type) ContinueWatchingVideo.class, C13188p0.m40531a(), "continueWatchingVideo");
        C12880j.m40222a((Object) a2, "moshi.adapter<MovieDetai… \"continueWatchingVideo\")");
        this.continueWatchingVideoAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, ContinueWatchingVideoResponse continueWatchingVideoResponse) {
        if (continueWatchingVideoResponse != null) {
            sVar.mo29791b();
            sVar.mo29796e("ContinueWatchingVideo");
            this.continueWatchingVideoAdapter.toJson(sVar, continueWatchingVideoResponse.mo18063a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(MovieDetailRemoteDataSource.ContinueWatchingVideoResponse)";
    }

    public ContinueWatchingVideoResponse fromJson(C11737m mVar) {
        mVar.mo29763b();
        ContinueWatchingVideo continueWatchingVideo = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a != 0) {
                continue;
            } else {
                continueWatchingVideo = (ContinueWatchingVideo) this.continueWatchingVideoAdapter.fromJson(mVar);
                if (continueWatchingVideo == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'continueWatchingVideo' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            }
        }
        mVar.mo29767d();
        if (continueWatchingVideo != null) {
            return new ContinueWatchingVideoResponse(continueWatchingVideo);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'continueWatchingVideo' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
