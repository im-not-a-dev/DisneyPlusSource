package com.bamtechmedia.dominguez.auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5841k;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/AuthHostFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "authHostRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/AuthHostRouter;", "getAuthHostRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/AuthHostRouter;", "setAuthHostRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/AuthHostRouter;)V", "initialViewType", "", "getInitialViewType", "()I", "initialViewType$delegate", "Lcom/bamtechmedia/dominguez/core/utils/IntFragmentArgumentDelegate;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.g */
/* compiled from: AuthHostFragment.kt */
public final class C2712g extends C11890i {

    /* renamed from: X */
    static final /* synthetic */ KProperty[] f7464X = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C2712g.class), "initialViewType", "getInitialViewType()I"))};

    /* renamed from: U */
    public C2754c f7465U;

    /* renamed from: V */
    private final C5841k f7466V = C5839j.m18848a("initialViewType", Integer.valueOf(0));

    /* renamed from: W */
    private HashMap f7467W;

    /* renamed from: com.bamtechmedia.dominguez.auth.g$a */
    /* compiled from: AuthHostFragment.kt */
    public static final class C2713a {
        private C2713a() {
        }

        public /* synthetic */ C2713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2713a(null);
    }

    /* renamed from: o */
    private final int m10347o() {
        return this.f7466V.mo17742a(this, f7464X[0]).intValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7467W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2718i0.fragment_auth_host, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            String str = "authHostRouter";
            if (m10347o() == 0) {
                C2754c cVar = this.f7465U;
                if (cVar != null) {
                    cVar.mo11767c();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else if (m10347o() == 1) {
                C2754c cVar2 = this.f7465U;
                if (cVar2 != null) {
                    cVar2.mo11768e();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            }
        }
    }
}
