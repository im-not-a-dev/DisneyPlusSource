package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentContainer */
public abstract class C0534e {
    /* renamed from: a */
    public abstract View mo3021a(int i);

    @Deprecated
    /* renamed from: a */
    public Fragment mo3116a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: a */
    public abstract boolean mo3022a();
}
