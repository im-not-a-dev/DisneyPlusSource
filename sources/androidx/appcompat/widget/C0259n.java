package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0512h;
import p096e.p097a.C3867j;

/* renamed from: androidx.appcompat.widget.n */
/* compiled from: AppCompatPopupWindow */
class C0259n extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1160b = (VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1161a;

    public C0259n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1403a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1403a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0284t0 a = C0284t0.m1486a(context, attributeSet, C3867j.PopupWindow, i, i2);
        if (a.mo1922g(C3867j.PopupWindow_overlapAnchor)) {
            m1404a(a.mo1909a(C3867j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo1912b(C3867j.PopupWindow_android_popupBackground));
        a.mo1908a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1160b && this.f1161a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1160b && this.f1161a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1160b && this.f1161a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    /* renamed from: a */
    private void m1404a(boolean z) {
        if (f1160b) {
            this.f1161a = z;
        } else {
            C0512h.m2761a((PopupWindow) this, z);
        }
    }
}
