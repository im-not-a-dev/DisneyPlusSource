package com.bamtechmedia.dominguez.core.framework;

import android.os.Bundle;
import android.view.LayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p512h.p513c.p514k.C11883b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/framework/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "inflater", "Landroid/view/LayoutInflater;", "layoutInflaterWrapper", "Lcom/bamtechmedia/dominguez/core/framework/BaseActivity$LayoutInflaterWrapper;", "getLayoutInflaterWrapper", "()Lcom/bamtechmedia/dominguez/core/framework/BaseActivity$LayoutInflaterWrapper;", "setLayoutInflaterWrapper", "(Lcom/bamtechmedia/dominguez/core/framework/BaseActivity$LayoutInflaterWrapper;)V", "getLayoutInflater", "getSystemService", "", "name", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "LayoutInflaterWrapper", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.framework.b */
/* compiled from: BaseActivity.kt */
public abstract class C5735b extends C11883b {

    /* renamed from: W */
    public C5736a f13498W;

    /* renamed from: X */
    private LayoutInflater f13499X;

    /* renamed from: com.bamtechmedia.dominguez.core.framework.b$a */
    /* compiled from: BaseActivity.kt */
    public interface C5736a {
        /* renamed from: a */
        LayoutInflater mo12759a(LayoutInflater layoutInflater);
    }

    public LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.f13499X;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = super.getLayoutInflater();
        Intrinsics.checkReturnedValueIsNotNull((Object) layoutInflater2, "super.getLayoutInflater()");
        return layoutInflater2;
    }

    public Object getSystemService(String str) {
        if (!Intrinsics.areEqual((Object) "layout_inflater", (Object) str)) {
            return super.getSystemService(str);
        }
        Object obj = this.f13499X;
        if (obj == null) {
            obj = super.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5736a aVar = this.f13498W;
        if (aVar != null) {
            LayoutInflater layoutInflater = super.getLayoutInflater();
            Intrinsics.checkReturnedValueIsNotNull((Object) layoutInflater, "super.getLayoutInflater()");
            this.f13499X = aVar.mo12759a(layoutInflater);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutInflaterWrapper");
        throw null;
    }
}
