package com.bamtechmedia.dominguez.collections;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.collections.p */
/* compiled from: CollectionViewFocusHelper.kt */
public final class C3453p {
    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m11781g(View view) {
        return Intrinsics.areEqual(view.getTag(C3424c.focusHelperExpandNavOnFocusSearchLeft), (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C3319e0 m11782h(View view) {
        Object tag = view.getTag(C3424c.focusHelperFocusChangeInfoVertical);
        if (!(tag instanceof C3319e0)) {
            tag = null;
        }
        return (C3319e0) tag;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m11783i(View view) {
        return Intrinsics.areEqual(view.getTag(C3424c.focusHelperFullBleedItem), (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m11784j(View view) {
        return Intrinsics.areEqual(view.getTag(C3424c.focusHelperHeroShelfListItem), (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final boolean m11785k(View view) {
        return Intrinsics.areEqual(view.getTag(C3424c.focusHelperHorizontalFocusSearchWithinParent), (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m11786l(View view) {
        return Intrinsics.areEqual(view.getTag(C3424c.focusHelperSkipCollectionViewFocusHelperHorizontal), (Object) Boolean.valueOf(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final long m11775c() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final FocusFinder m11777d() {
        return FocusFinder.getInstance();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m11774b(ViewGroup viewGroup) {
        return (viewGroup instanceof RecyclerView) && Intrinsics.areEqual(viewGroup.getTag(C3424c.focusHelperShelfRecyclerView), (Object) Boolean.valueOf(true));
    }
}
