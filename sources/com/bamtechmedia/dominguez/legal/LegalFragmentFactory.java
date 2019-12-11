package com.bamtechmedia.dominguez.legal;

import androidx.fragment.app.C0530c;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalFragmentFactory;", "", "newLegalCenterFragment", "Landroidx/fragment/app/DialogFragment;", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "documentId", "", "Companion", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalFragmentFactory.kt */
public interface LegalFragmentFactory {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String TAG = "LegalCenterFragment";

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalFragmentFactory$Companion;", "", "()V", "TAG", "", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LegalFragmentFactory.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String TAG = "LegalCenterFragment";

        private Companion() {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: LegalFragmentFactory.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C0530c newLegalCenterFragment$default(LegalFragmentFactory legalFragmentFactory, List list, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    list = null;
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                return legalFragmentFactory.newLegalCenterFragment(list, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newLegalCenterFragment");
        }
    }

    C0530c newLegalCenterFragment(List<LegalDocument> list, String str);
}
