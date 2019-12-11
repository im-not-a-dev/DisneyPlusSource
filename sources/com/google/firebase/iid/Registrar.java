package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.C10429d;
import com.google.firebase.components.C10429d.C10431b;
import com.google.firebase.components.C10438h;
import com.google.firebase.components.C10447n;
import com.google.firebase.iid.p404b.C10461a;
import java.util.Arrays;
import java.util.List;
import p163g.p449j.p482b.C11512c;
import p163g.p449j.p482b.p483e.C11522d;
import p163g.p449j.p482b.p486h.C11530f;
import p163g.p449j.p482b.p486h.C11531g;

@Keep
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class Registrar implements C10438h {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
    private static class C10457a implements C10461a {
        public C10457a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Keep
    public final List<C10429d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C10431b a = C10429d.m32955a(cls);
        a.mo27230a(C10447n.m33011a(C11512c.class));
        a.mo27230a(C10447n.m33011a(C11522d.class));
        a.mo27230a(C10447n.m33011a(C11531g.class));
        a.mo27229a(C10481k.f24841a);
        a.mo27228a();
        C10429d b = a.mo27231b();
        C10431b a2 = C10429d.m32955a(C10461a.class);
        a2.mo27230a(C10447n.m33011a(cls));
        a2.mo27229a(C10483l.f24846a);
        return Arrays.asList(new C10429d[]{b, a2.mo27231b(), C11530f.m37168a("fire-iid", "19.0.1")});
    }
}
