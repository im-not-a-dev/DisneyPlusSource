package com.bamtechmedia.dominguez.bookmarks;

import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry.BookmarkData;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarksRegistry_BookmarkDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarksRegistry$BookmarkData;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "longAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocalBookmarksRegistry_BookmarkDataJsonAdapter.kt */
public final class LocalBookmarksRegistry_BookmarkDataJsonAdapter extends C11725h<BookmarkData> {
    private final C11725h<Long> longAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public LocalBookmarksRegistry_BookmarkDataJsonAdapter(C11760v vVar) {
        String str = StreamSampleTelemetryData.TIMESTAMP_KEY;
        String str2 = "seriesId";
        String str3 = "mediaId";
        C11739b a = C11739b.m37729a(str3, "contentId", str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"m… \"seriesId\", \"timestamp\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ns.emptySet(), \"mediaId\")");
        this.stringAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<String?>(S…s.emptySet(), \"seriesId\")");
        this.nullableStringAdapter = a3;
        C11725h<Long> a4 = vVar.mo29869a((Type) Long.TYPE, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<Long>(Long….emptySet(), \"timestamp\")");
        this.longAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, BookmarkData bookmarkData) {
        if (bookmarkData != null) {
            sVar.mo29791b();
            sVar.mo29796e("mediaId");
            this.stringAdapter.toJson(sVar, bookmarkData.mo12191b());
            sVar.mo29796e("contentId");
            this.stringAdapter.toJson(sVar, bookmarkData.mo12190a());
            sVar.mo29796e("seriesId");
            this.nullableStringAdapter.toJson(sVar, bookmarkData.mo12192c());
            sVar.mo29796e(StreamSampleTelemetryData.TIMESTAMP_KEY);
            this.longAdapter.toJson(sVar, Long.valueOf(bookmarkData.mo12193d()));
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(LocalBookmarksRegistry.BookmarkData)";
    }

    public BookmarkData fromJson(C11737m mVar) {
        mVar.mo29763b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                String str4 = (String) this.stringAdapter.fromJson(mVar);
                if (str4 != null) {
                    str = str4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'mediaId' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str5 = (String) this.stringAdapter.fromJson(mVar);
                if (str5 != null) {
                    str2 = str5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'contentId' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (a != 3) {
                continue;
            } else {
                Long l2 = (Long) this.longAdapter.fromJson(mVar);
                if (l2 != null) {
                    l = Long.valueOf(l2.longValue());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'timestamp' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'mediaId' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (str2 == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'contentId' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (l != null) {
            BookmarkData bookmarkData = new BookmarkData(str, str2, str3, l.longValue());
            return bookmarkData;
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'timestamp' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }
}
