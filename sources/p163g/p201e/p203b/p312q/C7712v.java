package p163g.p201e.p203b.p312q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.disney.disneyplus.R;

/* renamed from: g.e.b.q.v */
/* compiled from: GlobalNavViewExt.kt */
public final class C7712v {
    /* renamed from: a */
    public static final boolean m22751a(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        return viewGroup != null && viewGroup.getId() == R.id.iconLayout;
    }
}
