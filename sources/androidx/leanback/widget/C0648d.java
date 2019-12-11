package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: androidx.leanback.widget.d */
/* compiled from: ForegroundHelper */
final class C0648d {
    /* renamed from: a */
    static void m3320a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }
}
