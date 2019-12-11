package p096e.p121h.p135s.p136i0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

/* renamed from: e.h.s.i0.c */
/* compiled from: AccessibilityManagerCompat */
public final class C4151c {

    /* renamed from: e.h.s.i0.c$a */
    /* compiled from: AccessibilityManagerCompat */
    public interface C4152a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: e.h.s.i0.c$b */
    /* compiled from: AccessibilityManagerCompat */
    private static class C4153b implements TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C4152a f10451a;

        C4153b(C4152a aVar) {
            this.f10451a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4153b.class != obj.getClass()) {
                return false;
            }
            return this.f10451a.equals(((C4153b) obj).f10451a);
        }

        public int hashCode() {
            return this.f10451a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f10451a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m14210a(AccessibilityManager accessibilityManager, C4152a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new C4153b(aVar));
    }

    /* renamed from: b */
    public static boolean m14211b(AccessibilityManager accessibilityManager, C4152a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C4153b(aVar));
    }
}
