package com.bamtechmedia.dominguez.config;

import java.util.Map;

/* renamed from: com.bamtechmedia.dominguez.config.s0 */
/* compiled from: StringDictionaryExt.kt */
public final class C3575s0 {
    /* renamed from: a */
    public static /* synthetic */ String m12040a(C3572r0 r0Var, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C13173j0.m40350a();
        }
        return m12039a(r0Var, str, str2, map);
    }

    /* renamed from: a */
    public static final String m12039a(C3572r0 r0Var, String str, String str2, Map<String, ? extends Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(str2);
        String a = r0Var.mo12773a(sb3.toString(), map);
        return a != null ? a : r0Var.mo12775b(str, map);
    }
}
