package com.bamtechmedia.dominguez.core.content.assets;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.k */
/* compiled from: ImageExt.kt */
public final class C3637k {
    /* renamed from: a */
    public static final Image m12383a(List<Image> list, String str, C3623a aVar) {
        return m12384a(list, C12833x.m40142a((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null), aVar);
    }

    /* renamed from: a */
    private static final Image m12384a(List<Image> list, List<String> list2, C3623a aVar) {
        Object obj;
        boolean z;
        String str = (String) C13199w.m40589f((List) list2);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Image image = (Image) obj;
            if (!Intrinsics.areEqual((Object) image.mo13086W(), (Object) str) || !Intrinsics.areEqual((Object) image.mo13087X(), (Object) aVar)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        Image image2 = (Image) obj;
        if (image2 != null) {
            return image2;
        }
        if (list2.size() > 1) {
            return m12384a(list, C13199w.m40571c((Iterable) list2, 1), aVar);
        }
        return null;
    }
}
