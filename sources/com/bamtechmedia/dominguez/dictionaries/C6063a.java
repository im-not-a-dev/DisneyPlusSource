package com.bamtechmedia.dominguez.dictionaries;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.Environment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.a */
/* compiled from: DictionaryConfig.kt */
public final class C6063a {

    /* renamed from: a */
    private final C3524e f13962a;

    /* renamed from: b */
    private final BuildInfo f13963b;

    public C6063a(C3524e eVar, BuildInfo buildInfo) {
        this.f13962a = eVar;
        this.f13963b = buildInfo;
    }

    /* renamed from: a */
    public final Map<String, String> mo18336a() {
        Map<String, String> map = (Map) this.f13962a.mo12720d("dictionaryVersions", new String[0]);
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: b */
    public final List<String> mo18337b() {
        List<String> list = (List) this.f13962a.mo12720d("launchDictionaries", new String[0]);
        return list != null ? list : C13185o.m40520c("application", "accessibility", "sdk-errors", "paywall", "ratings");
    }

    /* renamed from: c */
    public final Map<String, String> mo18338c() {
        List<String> b = mo18337b();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) b, 10));
        for (String str : b) {
            arrayList.add(C12907r.m40244a(str, mo18335a(str)));
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }

    /* renamed from: d */
    public final boolean mo18339d() {
        Environment environment = (Environment) this.f13962a.mo12720d("useDictionary", new String[0]);
        if (environment == null) {
            environment = this.f13963b.mo12778a();
        }
        return environment == Environment.QA;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f13963b, (java.lang.Object) r3.f13963b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.dictionaries.C6063a
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.dictionaries.a r3 = (com.bamtechmedia.dominguez.dictionaries.C6063a) r3
            com.bamtechmedia.dominguez.config.e r0 = r2.f13962a
            com.bamtechmedia.dominguez.config.e r1 = r3.f13962a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.BuildInfo r0 = r2.f13963b
            com.bamtechmedia.dominguez.core.BuildInfo r3 = r3.f13963b
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.dictionaries.C6063a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3524e eVar = this.f13962a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        BuildInfo buildInfo = this.f13963b;
        if (buildInfo != null) {
            i = buildInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DictionaryConfig(map=");
        sb.append(this.f13962a);
        sb.append(", buildInfo=");
        sb.append(this.f13963b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo18335a(String str) {
        return (String) mo18336a().get(str);
    }
}
