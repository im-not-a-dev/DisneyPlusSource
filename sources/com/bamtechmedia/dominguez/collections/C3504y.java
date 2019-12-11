package com.bamtechmedia.dominguez.collections;

import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.google.common.base.Optional;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.collections.y */
/* compiled from: CollectionViewPresenterImpl.kt */
public final class C3504y implements C3502x {

    /* renamed from: a */
    private final C3347e f8791a;

    /* renamed from: b */
    private final Optional<C3316d0> f8792b;

    public C3504y(C3347e eVar, Optional<C3316d0> optional) {
        this.f8791a = eVar;
        this.f8792b = optional;
    }

    /* renamed from: a */
    public List<C3626b> mo12702a(C3456b bVar) {
        C3658a e = bVar.mo12657e();
        if (e != null) {
            List<C3626b> R = e.mo13346R();
            if (R != null) {
                return R;
            }
        }
        return C13185o.m40513a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p163g.p509o.p510a.C11847b> mo12713b(com.bamtechmedia.dominguez.collections.C3454q.C3456b r5) {
        /*
            r4 = this;
            com.bamtechmedia.dominguez.core.content.collections.a r0 = r5.mo12657e()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.bamtechmedia.dominguez.collections.items.e r2 = r4.f8791a
            r3 = 2
            java.util.List r0 = com.bamtechmedia.dominguez.collections.items.C3347e.C3348a.m11520a(r2, r0, r1, r3, r1)
            if (r0 == 0) goto L_0x0012
            r1 = r0
            goto L_0x0035
        L_0x0012:
            java.lang.Throwable r0 = r5.mo12656d()
            if (r0 == 0) goto L_0x0035
            boolean r5 = r5.mo12660g()
            if (r5 != 0) goto L_0x0030
            com.google.common.base.Optional<com.bamtechmedia.dominguez.collections.d0> r5 = r4.f8792b
            com.bamtechmedia.dominguez.collections.h0 r1 = new com.bamtechmedia.dominguez.collections.h0
            r1.<init>()
            java.lang.Object r5 = r5.mo27105a(r1)
            com.bamtechmedia.dominguez.collections.d0 r5 = (com.bamtechmedia.dominguez.collections.C3316d0) r5
            java.util.List r5 = r5.mo12368a(r0)
            goto L_0x0034
        L_0x0030:
            java.util.List r5 = kotlin.p590y.C13185o.m40513a()
        L_0x0034:
            r1 = r5
        L_0x0035:
            if (r1 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3504y.mo12713b(com.bamtechmedia.dominguez.collections.q$b):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r1.getVisibility() == 0) != true) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12703a(com.bamtechmedia.dominguez.collections.C3502x.C3503a r6, com.bamtechmedia.dominguez.collections.C3454q.C3456b r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.mo12713b(r7)
            g.o.a.c r1 = r6.mo12704a()
            java.util.List r2 = r6.mo12707d()
            java.util.List r2 = kotlin.p590y.C13199w.m40583d(r2, r0)
            r1.mo29963a(r2)
            android.view.View r1 = r6.mo12705b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002d
            com.bamtechmedia.dominguez.core.content.collections.a r4 = r7.mo12653a()
            if (r4 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            p096e.p121h.p135s.C4127b0.m14131b(r1, r0)
        L_0x002d:
            com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r0 = r6.mo12706c()
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.mo12660g()
            if (r1 == 0) goto L_0x0043
            com.bamtechmedia.dominguez.core.content.collections.a r1 = r7.mo12653a()
            if (r1 != 0) goto L_0x0043
            r0.mo17432a(r3)
            goto L_0x0056
        L_0x0043:
            java.lang.Throwable r1 = r7.mo12656d()
            if (r1 == 0) goto L_0x0053
            com.bamtechmedia.dominguez.core.content.collections.a r1 = r7.mo12653a()
            if (r1 != 0) goto L_0x0053
            r0.mo17432a(r2)
            goto L_0x0056
        L_0x0053:
            com.bamtechmedia.dominguez.core.utils.C5852n0.m18887b(r0)
        L_0x0056:
            android.widget.ProgressBar r0 = r6.mo12708e()
            boolean r1 = r7.mo12659f()
            if (r1 == 0) goto L_0x0079
            com.bamtechmedia.dominguez.core.content.collections.a r1 = r7.mo12653a()
            if (r1 != 0) goto L_0x0079
            com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r1 = r6.mo12706c()
            if (r1 == 0) goto L_0x0077
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 == r2) goto L_0x0079
        L_0x0077:
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            r4 = 8
            if (r1 == 0) goto L_0x0080
            r1 = 0
            goto L_0x0082
        L_0x0080:
            r1 = 8
        L_0x0082:
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r6 = r6.mo12710f()
            com.bamtechmedia.dominguez.core.content.collections.a r7 = r7.mo12653a()
            if (r7 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            if (r2 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r3 = 8
        L_0x0096:
            r6.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3504y.mo12703a(com.bamtechmedia.dominguez.collections.x$a, com.bamtechmedia.dominguez.collections.q$b):void");
    }
}
