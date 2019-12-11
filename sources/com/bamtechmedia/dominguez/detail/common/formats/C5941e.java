package com.bamtechmedia.dominguez.detail.common.formats;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display.Mode;
import java.util.ArrayList;
import p096e.p121h.p134r.C4117i;

/* renamed from: com.bamtechmedia.dominguez.detail.common.formats.e */
/* compiled from: DisplayCompat */
public final class C5941e {

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.e$a */
    /* compiled from: DisplayCompat */
    public static final class C5942a {

        /* renamed from: a */
        private final Point f13749a;

        C5942a(Point point) {
            C4117i.m14096a(point, "physicalDisplaySize == null");
            this.f13749a = point;
        }

        /* renamed from: a */
        public int mo17868a() {
            return this.f13749a.y;
        }

        /* renamed from: b */
        public int mo17869b() {
            return this.f13749a.x;
        }

        C5942a(Mode mode, boolean z) {
            C4117i.m14096a(mode, "Display.Mode == null, can't wrap a null reference");
            this.f13749a = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
        }
    }

    /* renamed from: a */
    private static String m19064a(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C5942a[] m19069b(Context context, Display display) {
        Point a = m19062a(context, display);
        if (VERSION.SDK_INT >= 23) {
            Mode[] supportedModes = display.getSupportedModes();
            ArrayList arrayList = new ArrayList(supportedModes.length);
            boolean z = false;
            for (int i = 0; i < supportedModes.length; i++) {
                if (m19066a(supportedModes[i], a)) {
                    arrayList.add(i, new C5942a(supportedModes[i], true));
                    z = true;
                } else {
                    arrayList.add(i, new C5942a(supportedModes[i], false));
                }
            }
            if (!z) {
                arrayList.add(new C5942a(a));
            }
            return (C5942a[]) arrayList.toArray(new C5942a[arrayList.size()]);
        }
        return new C5942a[]{new C5942a(a)};
    }

    /* renamed from: a */
    private static boolean m19066a(Mode mode, Point point) {
        return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
    }

    /* renamed from: a */
    private static Point m19063a(String str, Display display) {
        if (display.getDisplayId() == 0) {
            String a = m19064a(str);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return m19067b(a);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Point m19062a(Context context, Display display) {
        Point point;
        if (VERSION.SDK_INT < 28) {
            point = m19063a("sys.display-size", display);
        } else {
            point = m19063a("vendor.display-size", display);
        }
        if (point != null) {
            return point;
        }
        if (m19065a(context)) {
            return new Point(3840, 2160);
        }
        Point point2 = new Point();
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            Mode mode = display.getMode();
            point2.x = mode.getPhysicalWidth();
            point2.y = mode.getPhysicalHeight();
        } else if (i >= 17) {
            display.getRealSize(point2);
        } else {
            display.getSize(point2);
        }
        return point2;
    }

    /* renamed from: b */
    private static Point m19067b(String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    /* renamed from: b */
    private static boolean m19068b(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: a */
    private static boolean m19065a(Context context) {
        if (m19068b(context)) {
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return true;
            }
        }
        return false;
    }
}
