package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.core.content.assets.Language;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.b */
/* compiled from: AbstractLanguageHandler.kt */
public abstract class C6918b {

    /* renamed from: a */
    private C6918b f15393a;

    /* renamed from: a */
    public abstract String mo19687a();

    /* renamed from: a */
    public abstract List<String> mo19688a(String str, String str2);

    /* renamed from: a */
    public final void mo19689a(C6918b bVar) {
        this.f15393a = bVar;
    }

    /* renamed from: a */
    public boolean mo19690a(boolean z) {
        return true;
    }

    /* renamed from: a */
    public final Language mo19686a(List<String> list, boolean z, String str, List<Language> list2) {
        Language a = mo19690a(z) ? m21146a(m21147a(list, str), list2) : null;
        if (a != null) {
            return a;
        }
        C6918b bVar = this.f15393a;
        if (bVar != null) {
            return bVar.mo19686a(list, z, str, list2);
        }
        return null;
    }

    /* renamed from: a */
    private final Language m21146a(List<String> list, List<Language> list2) {
        for (String str : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    Language language = (Language) it.next();
                    if (Intrinsics.areEqual((Object) language.mo13104Y(), (Object) str)) {
                        String b0 = language.mo13107b0();
                        if (b0 != null) {
                            String lowerCase = b0.toLowerCase();
                            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (Intrinsics.areEqual((Object) lowerCase, (Object) mo19687a())) {
                                return language;
                            }
                        } else {
                            throw new C13142s("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final List<String> m21147a(List<String> list, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (String a : list) {
            arrayList.add(mo19688a(a, str));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((List) obj).isEmpty()) {
                break;
            }
        }
        List<String> list2 = (List) obj;
        return list2 != null ? list2 : C13185o.m40513a();
    }
}
