package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import java.util.Iterator;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.b */
/* compiled from: CollectionExt.kt */
public final class C3659b {
    /* renamed from: a */
    public static final boolean m12473a(C3658a aVar, ContentSet contentSet) {
        ContainerType containerType;
        Object obj;
        if (!C12880j.m40224a((Object) aVar.mo13344P(), (Object) "contentType")) {
            Iterator it = aVar.mo13343O().iterator();
            while (true) {
                containerType = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12880j.m40224a((Object) ((Container) obj).mo13400a().mo13608e(), (Object) contentSet.mo13608e())) {
                    break;
                }
            }
            Container container = (Container) obj;
            if (container != null) {
                containerType = container.mo13401b();
            }
            if (containerType == ContainerType.GridContainer) {
                return false;
            }
        }
        return true;
    }
}
