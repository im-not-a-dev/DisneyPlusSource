package com.bamtechmedia.dominguez.core.content;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.assets.C3634h;
import com.bamtechmedia.dominguez.core.content.assets.C3636j;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.C3779i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

/* renamed from: com.bamtechmedia.dominguez.core.content.d */
/* compiled from: CoreContentJsonAdapterFactory.kt */
public final class C3682d implements C11732g {
    /* renamed from: a */
    public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
        Class d = C11780y.m37902d(type);
        if (Intrinsics.areEqual((Object) d, (Object) C3626b.class) || Intrinsics.areEqual((Object) d, (Object) C3632f.class)) {
            return new C3634h(vVar);
        }
        if (Intrinsics.areEqual((Object) d, (Object) C3778h.class)) {
            return new C3779i(vVar);
        }
        if (Intrinsics.areEqual((Object) d, (Object) C3680n.class)) {
            return new C3636j(vVar);
        }
        return null;
    }
}
