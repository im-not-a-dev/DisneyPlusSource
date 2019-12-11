package com.bamtechmedia.dominguez.core.content.assets;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.u */
/* compiled from: TextModels.kt */
public final class C3650u {
    /* renamed from: a */
    public static /* synthetic */ String m12406a(List list, C3648s sVar, C3649t tVar, C3647r rVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tVar = C3649t.FULL;
        }
        if ((i & 4) != 0) {
            rVar = C3647r.PROGRAM;
        }
        return m12405a(list, sVar, tVar, rVar);
    }

    /* renamed from: a */
    public static final String m12405a(List<TextEntry> list, C3648s sVar, C3649t tVar, C3647r rVar) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            TextEntry textEntry = (TextEntry) obj;
            if (!C12880j.m40224a((Object) textEntry.mo13211Y(), (Object) sVar.mo13289a()) || !C12880j.m40224a((Object) textEntry.mo13214b0(), (Object) tVar.mo13290a()) || !C12880j.m40224a((Object) textEntry.mo13213a0(), (Object) rVar.mo13288a())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        TextEntry textEntry2 = (TextEntry) obj;
        if (textEntry2 != null) {
            String X = textEntry2.mo13210X();
            if (X != null) {
                return X;
            }
        }
        return "";
    }
}
