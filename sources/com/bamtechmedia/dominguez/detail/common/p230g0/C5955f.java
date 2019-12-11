package com.bamtechmedia.dominguez.detail.common.p230g0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0802l;
import com.bamtechmedia.dominguez.core.p084g.p085c.C3821b;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11859i;
import p163g.p509o.p510a.C11863k;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.f */
/* compiled from: DetailsListTvContentManipulator.kt */
public final class C5955f {

    /* renamed from: a */
    private final C11859i f13766a = new C11859i();

    /* renamed from: b */
    private int f13767b;

    /* renamed from: c */
    private C11848c<C11863k> f13768c;

    /* renamed from: d */
    private RecyclerView f13769d;

    /* renamed from: e */
    private TabLayout f13770e;

    /* renamed from: f */
    private long f13771f;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17888a(p163g.p509o.p510a.C11848c<p163g.p509o.p510a.C11863k> r3, androidx.recyclerview.widget.RecyclerView r4, com.google.android.material.tabs.TabLayout r5) {
        /*
            r2 = this;
            g.o.a.c<g.o.a.k> r0 = r2.f13768c
            if (r0 == 0) goto L_0x0015
            if (r0 == 0) goto L_0x000e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x000e:
            java.lang.String r3 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = 0
            throw r3
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001f
            r2.f13768c = r3
            g.o.a.i r0 = r2.f13766a
            r3.mo29957a(r0)
        L_0x001f:
            r2.f13769d = r4
            r2.f13770e = r5
            android.content.res.Resources r3 = r4.getResources()
            int r5 = p163g.p201e.p203b.p287k.C7311e.duration2
            int r3 = r3.getInteger(r5)
            long r0 = (long) r3
            r2.f13771f = r0
            android.content.res.Resources r3 = r4.getResources()
            int r5 = p163g.p201e.p203b.p287k.C7308b.vader_grid_start_margin
            int r3 = r3.getDimensionPixelSize(r5)
            com.bamtechmedia.dominguez.detail.common.d r5 = new com.bamtechmedia.dominguez.detail.common.d
            r5.<init>(r3)
            r4.mo4381a(r5)
            r2.m19102a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p230g0.C5955f.mo17888a(g.o.a.c, androidx.recyclerview.widget.RecyclerView, com.google.android.material.tabs.TabLayout):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m19103a(C5955f fVar, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        fVar.mo17889a(list, i, z);
    }

    /* renamed from: a */
    public final void mo17889a(List<? extends C11847b> list, int i, boolean z) {
        String str = "recyclerView";
        if (z) {
            RecyclerView recyclerView = this.f13769d;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(m19101a(i));
                this.f13766a.mo30011d(list);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            RecyclerView recyclerView2 = this.f13769d;
            if (recyclerView2 != null) {
                recyclerView2.setItemAnimator(null);
                this.f13766a.mo30011d(list);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        }
        m19102a();
    }

    /* renamed from: a */
    private final C0802l m19101a(int i) {
        int i2 = i;
        int i3 = this.f13767b - i2;
        this.f13767b = i2;
        if (i3 > 0) {
            C3821b bVar = new C3821b(C3822a.f9509k.mo13747b(), null, this.f13771f, 0, 10, null);
            return bVar;
        } else if (i3 >= 0) {
            return null;
        } else {
            C3821b bVar2 = new C3821b(C3822a.f9509k.mo13747b(), null, this.f13771f, 0, 10, null);
            return bVar2;
        }
    }

    /* renamed from: a */
    private final void m19102a() {
        TabLayout tabLayout = this.f13770e;
        String str = "tabLayout";
        if (tabLayout != null) {
            boolean z = tabLayout.getTabCount() > 0;
            TabLayout tabLayout2 = this.f13770e;
            if (tabLayout2 != null) {
                tabLayout2.setFocusable(z);
                RecyclerView recyclerView = this.f13769d;
                if (recyclerView != null) {
                    recyclerView.setFocusable(z);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }
}
