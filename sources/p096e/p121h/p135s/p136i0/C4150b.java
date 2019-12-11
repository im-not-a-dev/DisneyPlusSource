package p096e.p121h.p135s.p136i0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: e.h.s.i0.b */
/* compiled from: AccessibilityEventCompat */
public final class C4150b {
    /* renamed from: a */
    public static void m14209a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m14208a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
