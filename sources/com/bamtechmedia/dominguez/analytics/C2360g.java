package com.bamtechmedia.dominguez.analytics;

import java.util.Map;
import kotlin.C13145v;
import p163g.p164a.p165a.C4662d;
import p686n.p687a.C14100a;

/* renamed from: com.bamtechmedia.dominguez.analytics.g */
/* compiled from: AdobeWrapper.kt */
public final class C2360g {
    /* renamed from: a */
    public final void mo11487a(String str, Map<String, ? extends Object> map) {
        C4662d.m16243a(str, map);
        C13145v vVar = C13145v.f29587a;
        StringBuilder sb = new StringBuilder();
        sb.append("Adobe Action: ");
        sb.append(str);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public final void mo11488b(String str, Map<String, ? extends Object> map) {
        C4662d.m16244b(str, map);
        C13145v vVar = C13145v.f29587a;
        StringBuilder sb = new StringBuilder();
        sb.append("Adobe State: '");
        sb.append(str);
        sb.append("', section: '");
        sb.append(map.get("section"));
        sb.append('\'');
        C14100a.m44529c(sb.toString(), new Object[0]);
    }
}
