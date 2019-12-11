package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.config.C3556k;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6936o;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.c */
/* compiled from: DefaultLanguageProviderImpl.kt */
public final class C6911c implements C3556k {

    /* renamed from: a */
    private final C6865a f15387a;

    public C6911c(C6865a aVar) {
        this.f15387a = aVar;
    }

    /* renamed from: a */
    public String mo12763a(C3572r0 r0Var) {
        List<String> a = C6936o.m21182a(this.f15387a.mo19637c());
        C6913e eVar = new C6913e(r0Var);
        for (String c : a) {
            String str = (String) C13199w.m40591g(C6913e.m21128c(eVar, c, null, 2, null));
            if (str != null) {
                return str;
            }
        }
        return eVar.mo19677c();
    }
}
