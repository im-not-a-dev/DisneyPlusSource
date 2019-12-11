package com.bamtechmedia.dominguez.collections.p080o0;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.p078m0.C3426e;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.utils.C5819b0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.n */
/* compiled from: ContainerConfigResolverImpl.kt */
public final class C3449n implements C3448m {

    /* renamed from: a */
    private final Resources f8704a;

    /* renamed from: b */
    private final C3435b f8705b;

    public C3449n(Resources resources, C3435b bVar) {
        this.f8704a = resources;
        this.f8705b = bVar;
    }

    /* renamed from: a */
    public C3444j mo12644a(String str, ContainerType containerType, String str2, C3343b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resolving config for collection: ");
        sb.append(str);
        sb.append(", set: ");
        sb.append(str2);
        sb.append(", container: ");
        sb.append(containerType.getConfigKey());
        boolean z = false;
        Timber.m44522a(sb.toString(), new Object[0]);
        Map a = this.f8705b.mo12612a();
        String string = this.f8704a.getString(C3426e.collection_size_qualifier);
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "resources.getString(R.st…ollection_size_qualifier)");
        C3447l lVar = new C3447l(a, string, str, containerType, str2);
        String str3 = "gridMargin";
        int a2 = C5819b0.m18811a(this.f8704a, ((Number) lVar.mo12643b(str3)).intValue());
        int a3 = C5819b0.m18811a(this.f8704a, ((Number) lVar.mo12643b(str3)).intValue());
        int a4 = C5819b0.m18811a(this.f8704a, ((Number) lVar.mo12643b("topGridMargin")).intValue());
        if (containerType == ContainerType.GridContainer) {
            z = true;
        }
        boolean booleanValue = ((Boolean) lVar.mo12642a("render")).booleanValue();
        String str4 = "title";
        ContainerType containerType2 = containerType;
        String str5 = str2;
        C3444j jVar = new C3444j(containerType2, a2, a3, a4, z, str5, (String) lVar.mo12642a(str4), booleanValue, ((Number) lVar.mo12643b("tiles")).intValue(), C5819b0.m18811a(this.f8704a, ((Number) lVar.mo12643b("itemMargin")).intValue()), C3623a.f9125b0.mo13249a(((Number) lVar.mo12643b("aspectRatio")).floatValue()), ((Boolean) lVar.mo12643b("list")).booleanValue(), (String) lVar.mo12643b("purpose"), (String) lVar.mo12643b(str4), (String) lVar.mo12643b("meta"), ((Number) lVar.mo12642a("scaleOnFocus")).floatValue(), (String) lVar.mo12642a("snap"), (List) lVar.mo12642a("tags"), bVar);
        return jVar;
    }
}
