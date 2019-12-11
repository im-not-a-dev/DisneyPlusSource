package com.bamtechmedia.dominguez.collections;

import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/PlaceholderErrorStateFactory;", "Lcom/bamtechmedia/dominguez/collections/ErrorStateFactory;", "()V", "createItems", "", "Lcom/xwray/groupie/Group;", "throwable", "", "ErrorItem", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.h0 */
/* compiled from: PlaceholderErrorStateFactory.kt */
public final class C3331h0 implements C3316d0 {

    /* renamed from: com.bamtechmedia.dominguez.collections.h0$a */
    /* compiled from: PlaceholderErrorStateFactory.kt */
    private static final class C3332a extends C11866a {

        /* renamed from: c */
        private final Throwable f8386c;

        public C3332a(Throwable th) {
            this.f8386c = th;
        }

        public int getLayout() {
            return C3414j0.placeholder_error_state_item;
        }

        public void bind(C11867b bVar, int i) {
            TextView textView = (TextView) bVar.mo20994a().findViewById(C3337i0.errorMessage);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "errorMessage");
            textView.setText(this.f8386c.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public List<C11847b> mo12368a(Throwable th) {
        return C13183n.m40498a(new C3332a(th));
    }
}
