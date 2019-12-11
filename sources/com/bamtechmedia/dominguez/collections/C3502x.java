package com.bamtechmedia.dominguez.collections;

import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import java.util.List;
import kotlin.Metadata;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;", "", "bind", "", "view", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "state", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "createItems", "", "Lcom/xwray/groupie/Group;", "getHiddenAssets", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "CollectionView", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.x */
/* compiled from: CollectionViewPresenter.kt */
public interface C3502x {

    /* renamed from: com.bamtechmedia.dominguez.collections.x$a */
    /* compiled from: CollectionViewPresenter.kt */
    public static final class C3503a {

        /* renamed from: a */
        private final C11848c<C11863k> f8785a;

        /* renamed from: b */
        private final RecyclerView f8786b;

        /* renamed from: c */
        private final ProgressBar f8787c;

        /* renamed from: d */
        private final NoConnectionView f8788d;

        /* renamed from: e */
        private final View f8789e;

        /* renamed from: f */
        private final List<C11847b> f8790f;

        public C3503a(C11848c<C11863k> cVar, RecyclerView recyclerView, ProgressBar progressBar, NoConnectionView noConnectionView, View view, List<? extends C11847b> list) {
            this.f8785a = cVar;
            this.f8786b = recyclerView;
            this.f8787c = progressBar;
            this.f8788d = noConnectionView;
            this.f8789e = view;
            this.f8790f = list;
        }

        /* renamed from: a */
        public final C11848c<C11863k> mo12704a() {
            return this.f8785a;
        }

        /* renamed from: b */
        public final View mo12705b() {
            return this.f8789e;
        }

        /* renamed from: c */
        public final NoConnectionView mo12706c() {
            return this.f8788d;
        }

        /* renamed from: d */
        public final List<C11847b> mo12707d() {
            return this.f8790f;
        }

        /* renamed from: e */
        public final ProgressBar mo12708e() {
            return this.f8787c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8790f, (java.lang.Object) r3.f8790f) != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0047
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.C3502x.C3503a
                if (r0 == 0) goto L_0x0045
                com.bamtechmedia.dominguez.collections.x$a r3 = (com.bamtechmedia.dominguez.collections.C3502x.C3503a) r3
                g.o.a.c<g.o.a.k> r0 = r2.f8785a
                g.o.a.c<g.o.a.k> r1 = r3.f8785a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                androidx.recyclerview.widget.RecyclerView r0 = r2.f8786b
                androidx.recyclerview.widget.RecyclerView r1 = r3.f8786b
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                android.widget.ProgressBar r0 = r2.f8787c
                android.widget.ProgressBar r1 = r3.f8787c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r0 = r2.f8788d
                com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r1 = r3.f8788d
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                android.view.View r0 = r2.f8789e
                android.view.View r1 = r3.f8789e
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.util.List<g.o.a.b> r0 = r2.f8790f
                java.util.List<g.o.a.b> r3 = r3.f8790f
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r3 = 0
                return r3
            L_0x0047:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3502x.C3503a.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final RecyclerView mo12710f() {
            return this.f8786b;
        }

        public int hashCode() {
            C11848c<C11863k> cVar = this.f8785a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            RecyclerView recyclerView = this.f8786b;
            int hashCode2 = (hashCode + (recyclerView != null ? recyclerView.hashCode() : 0)) * 31;
            ProgressBar progressBar = this.f8787c;
            int hashCode3 = (hashCode2 + (progressBar != null ? progressBar.hashCode() : 0)) * 31;
            NoConnectionView noConnectionView = this.f8788d;
            int hashCode4 = (hashCode3 + (noConnectionView != null ? noConnectionView.hashCode() : 0)) * 31;
            View view = this.f8789e;
            int hashCode5 = (hashCode4 + (view != null ? view.hashCode() : 0)) * 31;
            List<C11847b> list = this.f8790f;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollectionView(adapter=");
            sb.append(this.f8785a);
            sb.append(", recyclerView=");
            sb.append(this.f8786b);
            sb.append(", progressBar=");
            sb.append(this.f8787c);
            sb.append(", noConnectionView=");
            sb.append(this.f8788d);
            sb.append(", emptyView=");
            sb.append(this.f8789e);
            sb.append(", otherItems=");
            sb.append(this.f8790f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3503a(C11848c cVar, RecyclerView recyclerView, ProgressBar progressBar, NoConnectionView noConnectionView, View view, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, recyclerView, progressBar, (i & 8) != 0 ? null : noConnectionView, (i & 16) != 0 ? null : view, (i & 32) != 0 ? C13185o.m40513a() : list);
        }
    }

    /* renamed from: a */
    List<C3626b> mo12702a(C3456b bVar);

    /* renamed from: a */
    void mo12703a(C3503a aVar, C3456b bVar);
}
