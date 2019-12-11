package com.bamtechmedia.dominguez.detail.common.p226c0;

import com.bamtech.sdk4.content.GraphQlError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.detail.common.c0.c */
/* compiled from: DetailResponseErrorHandler.kt */
public final class C5911c {
    /* renamed from: a */
    public final List<Throwable> mo17818a(List<GraphQlError> list) {
        ArrayList arrayList = new ArrayList();
        for (GraphQlError message : list) {
            String message2 = message.getMessage();
            C5913e eVar = (message2.hashCode() == 285283791 && message2.equals("Content filtered by kids mode")) ? new C5913e() : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }
}
