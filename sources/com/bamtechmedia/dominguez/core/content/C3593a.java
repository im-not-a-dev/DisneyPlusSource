package com.bamtechmedia.dominguez.core.content;

import android.os.Parcelable;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3626b.C3627a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/Avatar;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/Filterable;", "avatarId", "", "getAvatarId", "()Ljava/lang/String;", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.a */
/* compiled from: DmcInterfaces.kt */
public interface C3593a extends C3626b, Parcelable, C3687i {

    /* renamed from: com.bamtechmedia.dominguez.core.content.a$a */
    /* compiled from: DmcInterfaces.kt */
    public static final class C3594a {
        /* renamed from: a */
        public static Image m12091a(C3593a aVar, C3688j jVar, C3623a aVar2) {
            return C3627a.m12343a((C3626b) aVar, jVar, aVar2);
        }

        /* renamed from: a */
        public static Image m12092a(C3593a aVar, String str, C3623a aVar2) {
            return C3627a.m12344a((C3626b) aVar, str, aVar2);
        }
    }

    /* renamed from: j */
    String mo12824j();
}
