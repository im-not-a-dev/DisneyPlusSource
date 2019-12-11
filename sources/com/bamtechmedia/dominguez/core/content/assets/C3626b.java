package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.C3688j;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0000H&R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "", "images", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "getImages", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "getPhoto", "purpose", "Lcom/bamtechmedia/dominguez/core/content/ImagePurpose;", "preferredAspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "isSameAs", "", "other", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.assets.b */
/* compiled from: Asset.kt */
public interface C3626b {

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.b$a */
    /* compiled from: Asset.kt */
    public static final class C3627a {
        /* renamed from: a */
        public static Image m12343a(C3626b bVar, C3688j jVar, C3623a aVar) {
            return bVar.mo12846a(jVar.mo13408a(), aVar);
        }

        /* renamed from: a */
        public static Image m12344a(C3626b bVar, String str, C3623a aVar) {
            List a = bVar.mo12847a();
            if (a != null) {
                return C3637k.m12383a(a, str, aVar);
            }
            return null;
        }
    }

    /* renamed from: a */
    Image mo12845a(C3688j jVar, C3623a aVar);

    /* renamed from: a */
    Image mo12846a(String str, C3623a aVar);

    /* renamed from: a */
    List<Image> mo12847a();

    /* renamed from: a */
    boolean mo12848a(C3626b bVar);

    String getTitle();
}
