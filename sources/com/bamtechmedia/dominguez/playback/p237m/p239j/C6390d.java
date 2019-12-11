package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3693o;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.d */
/* compiled from: ConvivaSetup.kt */
public final class C6390d {
    /* renamed from: b */
    private static final String m20025b(C3693o oVar) {
        if (!(oVar instanceof C3685g)) {
            return "movie";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('s');
        C3685g gVar = (C3685g) oVar;
        sb.append(gVar.mo12876F());
        sb.append(" e");
        sb.append(gVar.mo12878I());
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m20023a(C3693o oVar) {
        String u = oVar.mo12912u();
        if (u != null) {
            return u;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(oVar.getTitle());
        String str = " - ";
        sb.append(str);
        sb.append(m20025b(oVar));
        sb.append(str);
        sb.append(oVar.mo12903f());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m20026b(Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2;
            }
        }
        return "NA";
    }
}
