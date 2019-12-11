package com.bamtechmedia.dominguez.core.design.sample.p212g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.design.sample.C5607e;
import com.bamtechmedia.dominguez.core.design.sample.p211f.C5609b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p097a.p104o.C3892d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/sample/fragment/BasicDesignFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bamtechmedia/dominguez/core/design/sample/adapter/TitleProvider;", "()V", "layoutResId", "", "themeResId", "title", "", "getTitle", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "sample_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.a */
/* compiled from: BasicDesignFragment.kt */
public final class C5610a extends Fragment implements C5609b {

    /* renamed from: X */
    public static final C5611a f13181X = new C5611a(null);

    /* renamed from: U */
    private String f13182U = "";

    /* renamed from: V */
    private int f13183V;

    /* renamed from: W */
    private HashMap f13184W;

    /* renamed from: c */
    private int f13185c;

    /* renamed from: com.bamtechmedia.dominguez.core.design.sample.g.a$a */
    /* compiled from: BasicDesignFragment.kt */
    public static final class C5611a {
        private C5611a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C5610a m18430a(C5611a aVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i3 = C5607e.AppTheme_Vader;
            }
            return aVar.mo17354a(i, i2, i3);
        }

        public /* synthetic */ C5611a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5610a mo17354a(int i, int i2, int i3) {
            C5610a aVar = new C5610a();
            Bundle bundle = new Bundle();
            bundle.putInt("layoutRes", i);
            bundle.putInt("titleREs", i2);
            bundle.putInt("themeRes", i3);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f13184W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public String getTitle() {
        return this.f13182U;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13185c = arguments.getInt("layoutRes");
            this.f13183V = arguments.getInt("themeRes");
            String string = requireContext().getString(arguments.getInt("titleREs"));
            C12880j.m40222a((Object) string, "requireContext().getStri…it.getInt(ARG_TITLE_RES))");
            this.f13182U = string;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return getLayoutInflater().cloneInContext(new C3892d(getContext(), this.f13183V)).inflate(this.f13185c, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
