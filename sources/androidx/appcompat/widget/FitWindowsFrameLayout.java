package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0217d0.C0218a;

public class FitWindowsFrameLayout extends FrameLayout implements C0217d0 {

    /* renamed from: c */
    private C0218a f775c;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0218a aVar = this.f775c;
        if (aVar != null) {
            aVar.mo527a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0218a aVar) {
        this.f775c = aVar;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
