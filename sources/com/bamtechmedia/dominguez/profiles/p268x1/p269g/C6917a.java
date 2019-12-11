package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.core.content.assets.Language;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6862b;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.a */
/* compiled from: AbstractCaptionsHandler.kt */
public abstract class C6917a {

    /* renamed from: a */
    private C6917a f15391a;

    /* renamed from: b */
    private final C6862b f15392b = new C6862b(null, false, false);

    /* renamed from: a */
    public abstract C6862b mo19681a(String str);

    /* renamed from: a */
    public abstract String mo19683a();

    /* renamed from: a */
    public final void mo19684a(C6917a aVar) {
        this.f15391a = aVar;
    }

    /* renamed from: a */
    public abstract boolean mo19685a(C7019z zVar, String str);

    /* renamed from: a */
    public final C6862b mo19682a(List<Language> list, C7019z zVar, List<String> list2, String str) {
        String a = mo19685a(zVar, str) ? m21140a(list, list2) : null;
        if (a != null) {
            return mo19681a(a);
        }
        C6917a aVar = this.f15391a;
        if (aVar == null) {
            return this.f15392b;
        }
        if (aVar != null) {
            return aVar.mo19682a(list, zVar, list2, str);
        }
        return null;
    }

    /* renamed from: a */
    private final String m21140a(List<Language> list, List<String> list2) {
        Language language;
        boolean z;
        Iterator it = list2.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Language language2 = (Language) next;
                String b0 = language2.mo13107b0();
                if (b0 != null) {
                    String lowerCase = b0.toLowerCase();
                    C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (!C12880j.m40224a((Object) lowerCase, (Object) mo19683a()) || !C12880j.m40224a((Object) language2.mo13104Y(), (Object) str)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type java.lang.String");
                }
            }
            language = (Language) obj;
        } while (language == null);
        return language.mo13104Y();
    }
}
