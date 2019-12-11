package com.bamtechmedia.dominguez.core.content;

import android.os.Parcelable;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3626b.C3627a;
import com.bamtechmedia.dominguez.core.content.assets.C3647r;
import com.bamtechmedia.dominguez.core.content.assets.C3649t;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.assets.Rating;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H&J\u001a\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00060\bj\u0002`\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0012\u0010\u0017\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/Browsable;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Landroid/os/Parcelable;", "availableForDownload", "", "getAvailableForDownload", "()Z", "contentId", "", "Lcom/bamtechmedia/dominguez/core/content/ContentId;", "getContentId", "()Ljava/lang/String;", "description", "getDescription", "familyId", "getFamilyId", "isOriginal", "rating", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "getRating", "()Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "releaseYear", "getReleaseYear", "slug", "getSlug", "typedGenres", "", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "getTypedGenres", "()Ljava/util/List;", "textType", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryType;", "sourceType", "Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;", "getTitle", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.b */
/* compiled from: DmcInterfaces.kt */
public interface C3651b extends C3626b, Parcelable {

    /* renamed from: com.bamtechmedia.dominguez.core.content.b$a */
    /* compiled from: DmcInterfaces.kt */
    public static final class C3652a {
        /* renamed from: a */
        public static Image m12417a(C3651b bVar, C3688j jVar, C3623a aVar) {
            return C3627a.m12343a((C3626b) bVar, jVar, aVar);
        }

        /* renamed from: a */
        public static Image m12418a(C3651b bVar, String str, C3623a aVar) {
            return C3627a.m12344a((C3626b) bVar, str, aVar);
        }

        /* renamed from: a */
        public static /* synthetic */ String m12419a(C3651b bVar, C3649t tVar, C3647r rVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rVar = C3647r.PROGRAM;
                }
                return bVar.mo13261a(tVar, rVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDescription");
        }

        /* renamed from: b */
        public static /* synthetic */ String m12420b(C3651b bVar, C3649t tVar, C3647r rVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rVar = C3647r.PROGRAM;
                }
                return bVar.mo13262b(tVar, rVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTitle");
        }
    }

    /* renamed from: a */
    String mo13261a(C3649t tVar, C3647r rVar);

    /* renamed from: b */
    String mo13040b();

    /* renamed from: b */
    String mo13262b(C3649t tVar, C3647r rVar);

    /* renamed from: c */
    List<GenreMeta> mo12896c();

    /* renamed from: d */
    boolean mo13263d();

    /* renamed from: e */
    String mo13264e();

    /* renamed from: f */
    String mo12903f();

    /* renamed from: g */
    Rating mo13265g();

    String getDescription();

    /* renamed from: h */
    String mo13267h();

    /* renamed from: i */
    boolean mo13268i();
}
