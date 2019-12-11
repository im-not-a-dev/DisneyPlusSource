package com.bamtechmedia.dominguez.p331ui.pagingbehaviour;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import com.bamtechmedia.dominguez.collections.C3323f0;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/MobileRecyclerViewAutoPagingBehaviour;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/BaseAutoPagingBehaviour;", "parentRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "autoPagingSession", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;Lio/reactivex/Scheduler;)V", "scrollListener", "com/bamtechmedia/dominguez/ui/pagingbehaviour/MobileRecyclerViewAutoPagingBehaviour$scrollListener$1", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/MobileRecyclerViewAutoPagingBehaviour$scrollListener$1;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "selectNextItem", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.c */
/* compiled from: MobileRecyclerViewAutoPagingBehaviour.kt */
public final class C8094c extends C8087a {

    /* renamed from: X */
    private final C8095a f17327X;

    /* renamed from: Y */
    private final RecyclerView f17328Y;

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.c$a */
    /* compiled from: MobileRecyclerViewAutoPagingBehaviour.kt */
    public static final class C8095a extends C0817t {

        /* renamed from: a */
        final /* synthetic */ C8094c f17329a;

        C8095a(C8094c cVar) {
            this.f17329a = cVar;
        }

        /* renamed from: a */
        public void mo4783a(RecyclerView recyclerView, int i) {
            super.mo4783a(recyclerView, i);
            if (i == 1) {
                this.f17329a.mo21088a(false, Boolean.valueOf(true));
            }
        }
    }

    public /* synthetic */ C8094c(RecyclerView recyclerView, C3323f0 f0Var, C3441g gVar, C11969r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            rVar = C11992a.m38600a();
            C12880j.m40222a((Object) rVar, "AndroidSchedulers.mainThread()");
        }
        this(recyclerView, f0Var, gVar, rVar);
    }

    /* renamed from: b */
    public void mo21083b() {
        C0808o layoutManager = this.f17328Y.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            int H = linearLayoutManager.mo4318H() + 1;
            if (H > 0) {
                this.f17328Y.mo3685j(H);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        this.f17328Y.mo4385a((C0817t) this.f17327X);
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.f17328Y.mo4404b((C0817t) this.f17327X);
    }

    public C8094c(RecyclerView recyclerView, C3323f0 f0Var, C3441g gVar, C11969r rVar) {
        super(f0Var, gVar, rVar);
        this.f17328Y = recyclerView;
        this.f17327X = new C8095a(this);
    }
}
