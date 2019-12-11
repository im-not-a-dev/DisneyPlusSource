package com.bamtechmedia.dominguez.core.design.sample.p212g;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.design.sample.C5603a;
import com.bamtechmedia.dominguez.core.design.sample.C5604b;
import com.bamtechmedia.dominguez.core.design.sample.p211f.C5609b;
import com.bamtechmedia.dominguez.core.design.widgets.StorageIndicator;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/sample/fragment/StorageIndicatorFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bamtechmedia/dominguez/core/design/sample/adapter/TitleProvider;", "()V", "handler", "Landroid/os/Handler;", "getTitle", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "scheduleEmpty", "scheduleUsed", "Companion", "sample_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c */
/* compiled from: StorageIndicatorFragment.kt */
public final class C5613c extends Fragment implements C5609b {
    @Deprecated

    /* renamed from: V */
    public static final C5614a f13187V = new C5614a(null);

    /* renamed from: U */
    private HashMap f13188U;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f13189c = new Handler(Looper.getMainLooper());

    /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c$a */
    /* compiled from: StorageIndicatorFragment.kt */
    private static final class C5614a {
        private C5614a() {
        }

        public /* synthetic */ C5614a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "", "run", "androidx/core/os/HandlerKt$postDelayed$runnable$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c$b */
    /* compiled from: Handler.kt */
    public static final class C5615b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5613c f13190c;

        /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c$b$a */
        /* compiled from: Handler.kt */
        public static final class C5616a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C5615b f13191c;

            public C5616a(C5615b bVar) {
                this.f13191c = bVar;
            }

            public final void run() {
                this.f13191c.f13190c.m18438q();
            }
        }

        public C5615b(C5613c cVar) {
            this.f13190c = cVar;
        }

        public final void run() {
            if (this.f13190c.getView() != null) {
                StorageIndicator storageIndicator = (StorageIndicator) this.f13190c._$_findCachedViewById(C5603a.storage_indicator);
                C5613c.f13187V;
                C5613c.f13187V;
                storageIndicator.mo17469a(0.3f, 0.0f);
                Handler a = this.f13190c.f13189c;
                C5613c.f13187V;
                a.postDelayed(new C5616a(this), 1000);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "", "run", "androidx/core/os/HandlerKt$postDelayed$runnable$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c$c */
    /* compiled from: Handler.kt */
    public static final class C5617c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5613c f13192c;

        /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.c$c$a */
        /* compiled from: Handler.kt */
        public static final class C5618a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C5617c f13193c;

            public C5618a(C5617c cVar) {
                this.f13193c = cVar;
            }

            public final void run() {
                this.f13193c.f13192c.m18437p();
            }
        }

        public C5617c(C5613c cVar) {
            this.f13192c = cVar;
        }

        public final void run() {
            if (this.f13192c.getView() != null) {
                StorageIndicator storageIndicator = (StorageIndicator) this.f13192c._$_findCachedViewById(C5603a.storage_indicator);
                C5613c.f13187V;
                C5613c.f13187V;
                storageIndicator.mo17469a(0.3f, 0.25f);
                Handler a = this.f13192c.f13189c;
                C5613c.f13187V;
                a.postDelayed(new C5618a(this), 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m18437p() {
        this.f13189c.postDelayed(new C5615b(this), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m18438q() {
        this.f13189c.postDelayed(new C5617c(this), 1000);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f13188U;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f13188U == null) {
            this.f13188U = new HashMap();
        }
        View view = (View) this.f13188U.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13188U.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public String getTitle() {
        return "Downloads Storage Indicator";
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5604b.storage_indicator_fragment, viewGroup, false);
    }

    public void onDestroyView() {
        this.f13189c.removeCallbacks(null);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((StorageIndicator) _$_findCachedViewById(C5603a.storage_indicator)).mo17469a(0.3f, 0.25f);
        m18437p();
    }
}
