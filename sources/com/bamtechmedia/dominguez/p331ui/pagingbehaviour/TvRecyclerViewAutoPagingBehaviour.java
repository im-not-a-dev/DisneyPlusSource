package com.bamtechmedia.dominguez.p331ui.pagingbehaviour;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import com.bamtechmedia.dominguez.collections.C3323f0;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;
import p520io.reactivex.C11969r;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0007J\r\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\bH\u0002J\u001c\u0010#\u001a\u00020\t*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/TvRecyclerViewAutoPagingBehaviour;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/BaseAutoPagingBehaviour;", "parentRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemView", "Landroid/view/View;", "pageIndicatorNewPosition", "Lkotlin/Function1;", "", "", "autoPagingSession", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;Lio/reactivex/Scheduler;)V", "currentPosition", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "isInRecyclerView", "", "(Landroid/view/View;)Z", "calculateTargetScrollPosition", "startPosition", "targetPosition", "maxAnimateItemScrollSpan", "createLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "createLayoutManager$core_release", "selectNextItem", "updateCurrentPosition", "position", "smoothScrollWithLimitedAnimationSpan", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.TvRecyclerViewAutoPagingBehaviour */
/* compiled from: TvRecyclerViewAutoPagingBehaviour.kt */
public final class TvRecyclerViewAutoPagingBehaviour extends C8087a {

    /* renamed from: X */
    private int f17309X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final RecyclerView f17310Y;

    /* renamed from: Z */
    private final View f17311Z;

    /* renamed from: a0 */
    private final Function1<Integer, C13145v> f17312a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C3323f0 f17313b0;

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.TvRecyclerViewAutoPagingBehaviour$a */
    /* compiled from: TvRecyclerViewAutoPagingBehaviour.kt */
    public static final class C8085a {
        private C8085a() {
        }

        public /* synthetic */ C8085a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.TvRecyclerViewAutoPagingBehaviour$b */
    /* compiled from: TvRecyclerViewAutoPagingBehaviour.kt */
    static final class C8086b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ int f17314U;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f17315c;

        C8086b(TvRecyclerViewAutoPagingBehaviour tvRecyclerViewAutoPagingBehaviour, RecyclerView recyclerView, int i, int i2) {
            this.f17315c = recyclerView;
            this.f17314U = i;
        }

        public final void run() {
            this.f17315c.mo3685j(this.f17314U);
        }
    }

    static {
        new C8085a(null);
    }

    public /* synthetic */ TvRecyclerViewAutoPagingBehaviour(RecyclerView recyclerView, View view, Function1 function1, C3323f0 f0Var, C3441g gVar, C11969r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 32) != 0) {
            rVar = C11992a.m38600a();
            Intrinsics.checkReturnedValueIsNotNull((Object) rVar, "AndroidSchedulers.mainThread()");
        }
        this(recyclerView, view, function1, f0Var, gVar, rVar);
    }

    /* renamed from: a */
    public final int mo21082a(int i, int i2, int i3) {
        int i4 = i - i2;
        return i4 > i3 ? i2 + i3 : i4 < (-i3) ? i2 - i3 : i;
    }

    /* renamed from: c */
    public final LinearLayoutManager mo21084c() {
        return new TvRecyclerViewAutoPagingBehaviour$createLayoutManager$1(this, this.f17311Z.getContext(), 0, false);
    }

    /* renamed from: d */
    public final int mo21085d() {
        return this.f17309X;
    }

    public TvRecyclerViewAutoPagingBehaviour(RecyclerView recyclerView, View view, Function1<? super Integer, C13145v> function1, C3323f0 f0Var, C3441g gVar, C11969r rVar) {
        super(f0Var, gVar, rVar);
        this.f17310Y = recyclerView;
        this.f17311Z = view;
        this.f17312a0 = function1;
        this.f17313b0 = f0Var;
        View view2 = this.f17311Z;
        int i = C5363f.focusHelperHideNavOnViewFocus;
        Boolean valueOf = Boolean.valueOf(true);
        view2.setTag(i, valueOf);
        this.f17311Z.setTag(C3838h.focusHelperHorizontalFocusSearchWithinParent, valueOf);
        this.f17310Y.setLayoutManager(mo21084c());
    }

    /* renamed from: b */
    public void mo21083b() {
        C0808o layoutManager = this.f17310Y.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            int H = linearLayoutManager.mo4318H() + 1;
            if (!linearLayoutManager.mo4764y() && this.f17310Y.getScrollState() == 0) {
                m23453a(this.f17310Y, H, 1);
                m23452a(H);
                if (this.f17310Y.hasFocus()) {
                    View c = linearLayoutManager.mo4337c(H);
                    if (c != null) {
                        c.requestFocus(66);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m23455a(View view) {
        return Intrinsics.areEqual((Object) view.getParent(), (Object) this.f17310Y);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23452a(int i) {
        this.f17312a0.invoke(Integer.valueOf(i));
        this.f17309X = i;
    }

    /* renamed from: a */
    private final void m23453a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (recyclerView instanceof LinearLayoutManager) {
            int I = ((LinearLayoutManager) recyclerView).mo4319I();
            int a = mo21082a(I, i, i2);
            if (a != I) {
                recyclerView.mo3684i(a);
            }
            recyclerView.post(new C8086b(this, recyclerView, i, i2));
            return;
        }
        recyclerView.mo3685j(i);
    }
}
