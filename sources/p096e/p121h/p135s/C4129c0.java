package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: e.h.s.c0 */
/* compiled from: ViewParentCompat */
public final class C4129c0 {
    @Deprecated
    /* renamed from: a */
    public static boolean m14143a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static boolean m14144b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C4178o) {
            return ((C4178o) viewParent).mo1082a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C4180q) {
                return ((C4180q) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m14140a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C4178o) {
            ((C4178o) viewParent).mo1084b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C4180q) {
                ((C4180q) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static void m14137a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C4178o) {
            ((C4178o) viewParent).mo1077a(view, i);
        } else if (i != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C4180q) {
                ((C4180q) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static void m14138a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C4179p) {
            ((C4179p) viewParent2).mo1079a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C4178o) {
            ((C4178o) viewParent2).mo1078a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    AbstractMethodError abstractMethodError = e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), abstractMethodError);
                }
            } else if (viewParent2 instanceof C4180q) {
                ((C4180q) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m14139a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C4178o) {
            ((C4178o) viewParent).mo1080a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C4180q) {
                ((C4180q) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static boolean m14142a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C4180q) {
                return ((C4180q) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m14141a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C4180q) {
                return ((C4180q) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }
}
