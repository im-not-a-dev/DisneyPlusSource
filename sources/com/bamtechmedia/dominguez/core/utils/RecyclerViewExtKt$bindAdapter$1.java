package com.bamtechmedia.dominguez.core.utils;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo31007d2 = {"com/bamtechmedia/dominguez/core/utils/RecyclerViewExtKt$bindAdapter$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RecyclerViewExt.kt */
public final class RecyclerViewExtKt$bindAdapter$1 implements C0710d {

    /* renamed from: c */
    final /* synthetic */ RecyclerView f13606c;

    /* renamed from: com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt$bindAdapter$1$a */
    /* compiled from: RecyclerViewExt.kt */
    public static final class C5815a implements OnAttachStateChangeListener {

        /* renamed from: c */
        final /* synthetic */ RecyclerViewExtKt$bindAdapter$1 f13607c;

        C5815a(RecyclerViewExtKt$bindAdapter$1 recyclerViewExtKt$bindAdapter$1) {
            this.f13607c = recyclerViewExtKt$bindAdapter$1;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f13607c.f13606c.setAdapter(null);
            this.f13607c.f13606c.removeOnAttachStateChangeListener(this);
        }
    }

    RecyclerViewExtKt$bindAdapter$1(RecyclerView recyclerView) {
        this.f13606c = recyclerView;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        if (this.f13606c.isAttachedToWindow()) {
            this.f13606c.addOnAttachStateChangeListener(new C5815a(this));
        } else {
            this.f13606c.setAdapter(null);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }
}
