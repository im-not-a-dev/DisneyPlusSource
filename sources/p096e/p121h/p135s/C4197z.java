package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import p096e.p121h.C4020e;

/* renamed from: e.h.s.z */
/* compiled from: ViewGroupCompat */
public final class C4197z {
    /* renamed from: a */
    public static boolean m14437a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C4020e.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C4187x.m14405t(viewGroup) == null) ? false : true;
    }
}
