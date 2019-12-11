package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/BookmarkHitJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "userMediaMetaAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "contentDetailApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarkHitJsonAdapter.kt */
public final class BookmarkHitJsonAdapter extends C11725h<BookmarkHit> {
    private final C11739b options;
    private final C11725h<String> stringAdapter;
    private final C11725h<UserMediaMeta> userMediaMetaAdapter;

    public BookmarkHitJsonAdapter(C11760v vVar) {
        String str = "userMeta";
        String str2 = "contentId";
        C11739b a = C11739b.m37729a(str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"contentId\", \"userMeta\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St….emptySet(), \"contentId\")");
        this.stringAdapter = a2;
        C11725h<UserMediaMeta> a3 = vVar.mo29869a((Type) UserMediaMeta.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<UserMediaM…s.emptySet(), \"userMeta\")");
        this.userMediaMetaAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, BookmarkHit bookmarkHit) {
        if (bookmarkHit != null) {
            sVar.mo29791b();
            sVar.mo29796e("contentId");
            this.stringAdapter.toJson(sVar, bookmarkHit.mo17784f());
            sVar.mo29796e("userMeta");
            this.userMediaMetaAdapter.toJson(sVar, bookmarkHit.mo17780X());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(BookmarkHit)";
    }

    public BookmarkHit fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        UserMediaMeta userMediaMeta = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'contentId' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a != 1) {
                continue;
            } else {
                userMediaMeta = (UserMediaMeta) this.userMediaMetaAdapter.fromJson(mVar);
                if (userMediaMeta == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'userMeta' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'contentId' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (userMediaMeta != null) {
            return new BookmarkHit(str, userMediaMeta);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'userMeta' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
