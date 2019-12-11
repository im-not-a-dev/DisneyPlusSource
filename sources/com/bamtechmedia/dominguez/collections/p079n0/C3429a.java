package com.bamtechmedia.dominguez.collections.p079n0;

import android.content.Context;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingBehaviour;", "", "requestStartAutoPaging", "", "context", "Landroid/content/Context;", "forceAutoPaging", "", "stopAutoPaging", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.n0.a */
/* compiled from: AutoPagingBehaviour.kt */
public interface C3429a {

    /* renamed from: com.bamtechmedia.dominguez.collections.n0.a$a */
    /* compiled from: AutoPagingBehaviour.kt */
    public static final class C3430a {
        /* renamed from: a */
        public static /* synthetic */ void m11713a(C3429a aVar, Context context, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                aVar.mo12601a(context, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestStartAutoPaging");
        }
    }

    /* renamed from: a */
    void mo12600a();

    /* renamed from: a */
    void mo12601a(Context context, boolean z);
}
