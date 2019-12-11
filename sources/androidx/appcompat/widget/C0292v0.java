package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: androidx.appcompat.widget.v0 */
/* compiled from: TooltipCompat */
public class C0292v0 {
    /* renamed from: a */
    public static void m1576a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0294w0.m1578a(view, charSequence);
        }
    }
}
