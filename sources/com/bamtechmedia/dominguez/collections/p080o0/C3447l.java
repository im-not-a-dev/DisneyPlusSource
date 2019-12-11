package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.Map;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.l */
/* compiled from: ContainerConfigParser.kt */
public final class C3447l {

    /* renamed from: a */
    private final Map<String, Object> f8700a;

    /* renamed from: b */
    private final Map<String, ?> f8701b;

    /* renamed from: c */
    private final Map<String, Object> f8702c;

    /* renamed from: d */
    private final String f8703d;

    public C3447l(Map<String, ?> map, String str, String str2, ContainerType containerType, String str3) {
        this.f8703d = str;
        String str4 = "default";
        Map<String, Object> map2 = (Map) C5859p.m18897a(map, str4, new String[0]);
        if (map2 != null) {
            this.f8700a = map2;
            String str5 = "sets";
            Map<String, ?> map3 = (Map) C5859p.m18898a(this.f8700a, C13185o.m40520c(str5, str4, "shelf_grid"));
            if (map3 != null) {
                this.f8701b = map3;
                Map<String, Object> map4 = (Map) C5859p.m18897a(map, str2, str5, str3, containerType.getConfigKey());
                if (map4 == null) {
                    map4 = C13173j0.m40350a();
                }
                this.f8702c = map4;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No default set config available in ");
            sb.append(this.f8700a);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Default collection must be present");
    }

    /* renamed from: a */
    public final <T> T mo12642a(String str) {
        T a = C5859p.m18898a(this.f8702c, C13183n.m40498a(str));
        if (a == null) {
            a = C5859p.m18898a(this.f8701b, C13183n.m40498a(str));
        }
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(str);
        sb.append("' not available in overrides ");
        sb.append(this.f8702c);
        sb.append(" or defaults ");
        sb.append(this.f8701b);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final <T> T mo12643b(String str) {
        String str2 = "breakpoints";
        T a = C5859p.m18898a(this.f8702c, C13185o.m40520c(str2, this.f8703d, str));
        if (a == null) {
            a = C5859p.m18898a(this.f8702c, C13183n.m40498a(str));
        }
        if (a == null) {
            a = C5859p.m18898a(this.f8701b, C13185o.m40520c(str2, this.f8703d, str));
        }
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'breakpoints.");
        sb.append(this.f8703d);
        sb.append('.');
        sb.append(str);
        sb.append("' not available in overrides ");
        sb.append(this.f8702c);
        sb.append(" or defaults ");
        sb.append(this.f8701b);
        throw new IllegalStateException(sb.toString());
    }
}
