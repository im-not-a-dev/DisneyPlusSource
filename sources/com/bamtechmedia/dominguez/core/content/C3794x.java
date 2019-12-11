package com.bamtechmedia.dominguez.core.content;

import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.x */
/* compiled from: VideoArtAssetExt.kt */
public final class C3794x {
    /* renamed from: a */
    public static final C3680n m12817a(C3793w wVar, String str) {
        List H = wVar.mo12839H();
        Object obj = null;
        if (H == null) {
            return null;
        }
        Iterator it = H.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C12880j.m40224a((Object) ((C3680n) next).mo13319W(), (Object) str)) {
                obj = next;
                break;
            }
        }
        return (C3680n) obj;
    }
}
