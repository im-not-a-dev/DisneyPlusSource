package p163g.p201e.p203b.p299m.p300y.p302i;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p163g.p201e.p203b.p299m.C7563u;

/* renamed from: g.e.b.m.y.i.a */
/* compiled from: Tier0TextSizeCalculator.kt */
public final class C7579a {

    /* renamed from: a */
    private final Context f16589a;

    /* renamed from: b */
    private final DisplayMetrics f16590b;

    /* renamed from: c */
    private final Paint f16591c;

    /* renamed from: d */
    private final float f16592d;

    public C7579a(Context context, DisplayMetrics displayMetrics, Paint paint, float f) {
        this.f16589a = context;
        this.f16590b = displayMetrics;
        this.f16591c = paint;
        this.f16592d = f;
    }

    /* renamed from: a */
    public static /* synthetic */ int m22537a(C7579a aVar, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return aVar.mo20515a(str, num);
    }

    /* renamed from: a */
    public final int mo20515a(String str, Integer num) {
        int intValue = num != null ? num.intValue() : this.f16589a.getResources().getInteger(C7563u.min_text_size);
        return mo20514a(str, intValue) < this.f16592d ? intValue : mo20515a(str, Integer.valueOf(intValue - 1));
    }

    /* renamed from: a */
    public final float mo20514a(String str, int i) {
        this.f16591c.setTextSize(TypedValue.applyDimension(2, (float) i, this.f16590b));
        Rect rect = new Rect();
        this.f16591c.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) / this.f16590b.scaledDensity;
    }
}
