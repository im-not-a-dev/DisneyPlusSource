package com.bamtechmedia.dominguez.core.design.widgets.vadergrid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bamtechmedia.dominguez.core.p088i.C3834d;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3839i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.vadergrid.a */
/* compiled from: VaderGridDebugView.kt */
public final class C5725a extends View {

    /* renamed from: U */
    private final C12757d f13471U;

    /* renamed from: V */
    private final float f13472V;

    /* renamed from: W */
    private final float f13473W;

    /* renamed from: a0 */
    private final Paint f13474a0;

    /* renamed from: b0 */
    private final Paint f13475b0;

    /* renamed from: c */
    private final int f13476c;

    /* renamed from: c0 */
    private final Paint f13477c0;

    /* renamed from: d0 */
    private final TextPaint f13478d0;

    /* renamed from: e0 */
    private final float f13479e0;

    /* renamed from: f0 */
    private final List<String> f13480f0;

    /* renamed from: g0 */
    private List<Float> f13481g0;

    public /* synthetic */ C5725a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) 2;
        float measuredWidth = ((float) getMeasuredWidth()) - (this.f13472V * f);
        float f2 = this.f13473W;
        int i = this.f13476c;
        float f3 = (measuredWidth - (f2 * ((float) (i - 1)))) / ((float) i);
        float measuredHeight = (float) getMeasuredHeight();
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.f13472V, measuredHeight, this.f13475b0);
        canvas.translate(this.f13472V, 0.0f);
        C12757d dVar = this.f13471U;
        int b = dVar.mo31070b();
        int c = dVar.mo31071c();
        if (b <= c) {
            int i2 = b;
            while (true) {
                canvas.drawRect(0.0f, 0.0f, f3, measuredHeight, this.f13474a0);
                canvas.drawText((String) this.f13480f0.get(i2), (f3 - ((Number) this.f13481g0.get(i2)).floatValue()) / f, this.f13479e0, this.f13478d0);
                canvas.translate(f3, 0.0f);
                float f4 = this.f13473W;
                if (f4 > 0.0f) {
                    canvas.drawRect(0.0f, 0.0f, f4, measuredHeight, this.f13475b0);
                    canvas.translate(this.f13473W, 0.0f);
                } else if (i2 + 1 < this.f13476c) {
                    canvas.drawLine(0.0f, 0.0f, 0.0f, measuredHeight, this.f13477c0);
                }
                if (i2 == c) {
                    break;
                }
                i2++;
            }
        }
        canvas.drawRect(0.0f, 0.0f, this.f13472V - this.f13473W, measuredHeight, this.f13475b0);
        canvas.restore();
    }

    public C5725a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13476c = context.getResources().getInteger(C3839i.vader_grid_column_count);
        this.f13471U = C12762h.m39920d(0, this.f13476c);
        this.f13472V = context.getResources().getDimension(C3835e.vader_grid_start_margin);
        this.f13473W = context.getResources().getDimension(C3835e.vader_grid_item_margin);
        Paint paint = new Paint();
        paint.setColor(C4025a.m13788a(context, C3834d.vader_grid_column));
        paint.setStyle(Style.FILL);
        this.f13474a0 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(C4025a.m13788a(context, C3834d.vader_grid_background));
        paint2.setStyle(Style.FILL);
        this.f13475b0 = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-16777216);
        this.f13477c0 = paint3;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(context.getResources().getDimension(C3835e.vader_grid_title_size));
        textPaint.setColor(-1);
        this.f13478d0 = textPaint;
        this.f13479e0 = context.getResources().getDimension(C3835e.vader_grid_title_margin_top);
        C12757d dVar = this.f13471U;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) dVar, 10));
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((C13162e0) it).mo31079b() + 1));
        }
        this.f13480f0 = arrayList;
        List<String> list = this.f13480f0;
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (String measureText : list) {
            arrayList2.add(Float.valueOf(this.f13478d0.measureText(measureText)));
        }
        this.f13481g0 = arrayList2;
    }
}
