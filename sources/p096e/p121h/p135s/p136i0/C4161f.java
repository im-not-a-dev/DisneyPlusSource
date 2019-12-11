package p096e.p121h.p135s.p136i0;

import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: e.h.s.i0.f */
/* compiled from: AccessibilityRecordCompat */
public class C4161f {
    /* renamed from: a */
    public static void m14294a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: b */
    public static void m14295b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: a */
    public static void m14293a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }
}
