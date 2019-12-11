package com.bamtechmedia.dominguez.core.p218n;

import androidx.fragment.app.C0530c;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/navigation/DialogFragmentHost;", "", "showDialogFragment", "", "fragment", "Landroidx/fragment/app/DialogFragment;", "tag", "", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.n.b */
/* compiled from: DialogFragmentHost.kt */
public interface C5783b {

    /* renamed from: com.bamtechmedia.dominguez.core.n.b$a */
    /* compiled from: DialogFragmentHost.kt */
    public static final class C5784a {
        /* renamed from: a */
        public static /* synthetic */ void m18743a(C5783b bVar, C0530c cVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                bVar.mo17668a(cVar, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialogFragment");
        }
    }

    /* renamed from: a */
    void mo17668a(C0530c cVar, String str);
}
