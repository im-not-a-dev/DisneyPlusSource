package p096e.p121h.p135s.p136i0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: e.h.s.i0.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C4149a extends ClickableSpan {

    /* renamed from: U */
    private final C4154d f10448U;

    /* renamed from: V */
    private final int f10449V;

    /* renamed from: c */
    private final int f10450c;

    public C4149a(int i, C4154d dVar, int i2) {
        this.f10450c = i;
        this.f10448U = dVar;
        this.f10449V = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10450c);
        this.f10448U.mo14743a(this.f10449V, bundle);
    }
}
