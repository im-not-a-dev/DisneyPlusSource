package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.p088i.C3834d;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0002-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010\u0014\u001a\u00020\u000eJ\"\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001d0'J(\u0010)\u001a\u00020(*\u00020(2\u0006\u0010*\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001d0'H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "animSet", "Landroid/animation/AnimatorSet;", "bottomBarState", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar$BottomBarState;", "getBottomBarState", "()Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar$BottomBarState;", "setBottomBarState", "(Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar$BottomBarState;)V", "maxStroke", "", "paintError", "Landroid/graphics/Paint;", "paintFocus", "paintSuccess", "radius", "stroke", "strokePath", "Landroid/graphics/Path;", "vaderError", "", "vaderGrey", "createPaint", "colorResId", "drawBottomBar", "", "canvas", "Landroid/graphics/Canvas;", "drawPathBottomBar", "paint", "setupPath", "startErrorAnimationCustom", "errorTextView", "Landroid/widget/TextView;", "backgroundAction", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "withUpdateListener", "duration", "", "animation", "BottomBarState", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c */
/* compiled from: InputLayoutBottomBar.kt */
public final class C5714c {

    /* renamed from: a */
    private C5715a f13436a = C5715a.NONE;

    /* renamed from: b */
    private final AnimatorSet f13437b = new AnimatorSet();

    /* renamed from: c */
    private final float f13438c;

    /* renamed from: d */
    private final float f13439d;

    /* renamed from: e */
    private final float f13440e;

    /* renamed from: f */
    private final int f13441f;

    /* renamed from: g */
    private final int f13442g;

    /* renamed from: h */
    private final Path f13443h;

    /* renamed from: i */
    private final Paint f13444i;

    /* renamed from: j */
    private final Paint f13445j;

    /* renamed from: k */
    private final Paint f13446k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final View f13447l;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$a */
    /* compiled from: InputLayoutBottomBar.kt */
    public enum C5715a {
        ERROR,
        VALID,
        NONE
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$b */
    /* compiled from: InputLayoutBottomBar.kt */
    public static final class C5716b {
        private C5716b() {
        }

        public /* synthetic */ C5716b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$c */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5717c extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ TextView f13452c;

        C5717c(TextView textView) {
            this.f13452c = textView;
            super(1);
        }

        /* renamed from: a */
        public final void mo17595a(ValueAnimator valueAnimator) {
            TextView textView = this.f13452c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                C5852n0.m18878a((View) textView, ((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17595a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$d */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5718d extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ TextView f13453c;

        C5718d(TextView textView) {
            this.f13453c = textView;
            super(1);
        }

        /* renamed from: a */
        public final void mo17596a(ValueAnimator valueAnimator) {
            TextView textView = this.f13453c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                C5852n0.m18878a((View) textView, ((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17596a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$e */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5719e extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5714c f13454c;

        C5719e(C5714c cVar) {
            this.f13454c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17597a(ValueAnimator valueAnimator) {
            C5714c cVar = this.f13454c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                cVar.mo17591a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17597a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$f */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5720f extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Function1 f13455c;

        C5720f(Function1 function1) {
            this.f13455c = function1;
            super(1);
        }

        /* renamed from: a */
        public final void mo17598a(ValueAnimator valueAnimator) {
            this.f13455c.invoke(valueAnimator);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17598a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$g */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5721g extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Function1 f13456c;

        C5721g(Function1 function1) {
            this.f13456c = function1;
            super(1);
        }

        /* renamed from: a */
        public final void mo17599a(ValueAnimator valueAnimator) {
            this.f13456c.invoke(valueAnimator);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17599a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$h */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5722h extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5714c f13457c;

        C5722h(C5714c cVar) {
            this.f13457c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17600a(ValueAnimator valueAnimator) {
            C5714c cVar = this.f13457c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                cVar.mo17591a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17600a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.c$i */
    /* compiled from: InputLayoutBottomBar.kt */
    static final class C5723i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f13458a;

        /* renamed from: b */
        final /* synthetic */ C5714c f13459b;

        /* renamed from: c */
        final /* synthetic */ Function1 f13460c;

        C5723i(ValueAnimator valueAnimator, C5714c cVar, long j, Function1 function1) {
            this.f13458a = valueAnimator;
            this.f13459b = cVar;
            this.f13460c = function1;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13460c.invoke(this.f13458a);
            this.f13459b.f13447l.invalidate();
        }
    }

    static {
        new C5716b(null);
    }

    public C5714c(View view) {
        this.f13447l = view;
        Context context = this.f13447l.getContext();
        String str = "view.context";
        Intrinsics.checkReturnedValueIsNotNull((Object) context, str);
        this.f13438c = (float) context.getResources().getDimensionPixelSize(C3835e.text_input_layout_stroke);
        Context context2 = this.f13447l.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context2, str);
        this.f13439d = (float) context2.getResources().getDimensionPixelSize(C3835e.text_input_layout_stroke_max);
        Context context3 = this.f13447l.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context3, str);
        this.f13440e = C5837i.m18833a(context3, C3835e.text_input_layout_radius);
        this.f13441f = C4025a.m13788a(this.f13447l.getContext(), C3834d.vader_grey4);
        this.f13442g = C4025a.m13788a(this.f13447l.getContext(), C3834d.input_layout_error);
        this.f13443h = new Path();
        this.f13444i = m18621a(C3834d.vader_error);
        this.f13445j = m18621a(C3834d.vader_success);
        this.f13446k = m18621a(C3834d.vader_white_20);
    }

    /* renamed from: a */
    public final void mo17594a(C5715a aVar) {
        this.f13436a = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m18624a(C5714c cVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cVar.f13438c;
        }
        cVar.mo17591a(f);
    }

    /* renamed from: a */
    public final void mo17591a(float f) {
        float f2 = this.f13440e;
        float f3 = f2 - f;
        float sqrt = f2 - ((float) Math.sqrt((double) ((f2 * f2) - (f3 * f3))));
        float f4 = (f / this.f13440e) * 90.0f;
        Path path = this.f13443h;
        path.reset();
        float f5 = (float) 1;
        path.moveTo(sqrt - f5, ((float) this.f13447l.getMeasuredHeight()) - f);
        path.lineTo((((float) this.f13447l.getMeasuredWidth()) - sqrt) + f5, ((float) this.f13447l.getMeasuredHeight()) - f);
        float f6 = (float) 2;
        Path path2 = path;
        float f7 = f4;
        path2.arcTo((((float) this.f13447l.getMeasuredWidth()) - (this.f13440e * f6)) + f5, ((float) this.f13447l.getMeasuredHeight()) - (this.f13440e * f6), ((float) this.f13447l.getMeasuredWidth()) + f5, (float) this.f13447l.getMeasuredHeight(), 90.0f - f4, f7, false);
        path.lineTo(this.f13440e - f5, (float) this.f13447l.getMeasuredHeight());
        float measuredHeight = (float) this.f13447l.getMeasuredHeight();
        float f8 = this.f13440e;
        path2.arcTo(-1.0f, measuredHeight - (f8 * f6), (f8 * f6) - f5, (float) this.f13447l.getMeasuredHeight(), 90.0f, f7, false);
        path.close();
    }

    /* renamed from: a */
    public final void mo17592a(Canvas canvas) {
        int i = C5724d.$EnumSwitchMapping$0[this.f13436a.ordinal()];
        if (i == 1) {
            m18623a(canvas, this.f13444i);
        } else if (i == 2) {
            m18623a(canvas, this.f13445j);
        } else if (i == 3 && this.f13447l.hasFocus()) {
            m18623a(canvas, this.f13446k);
        }
    }

    /* renamed from: a */
    private final void m18623a(Canvas canvas, Paint paint) {
        paint.setAntiAlias(true);
        canvas.drawPath(this.f13443h, paint);
    }

    /* renamed from: a */
    public final void mo17593a(TextView textView, Function1<? super ValueAnimator, C13145v> function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f13438c, this.f13439d});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofFloat, "ValueAnimator.ofFloat(stroke, maxStroke)");
        m18620a(ofFloat, 0, new C5719e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f13439d, this.f13438c});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofFloat2, "ValueAnimator.ofFloat(maxStroke, stroke)");
        m18620a(ofFloat2, 500, new C5722h(this));
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{this.f13441f, this.f13442g});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofArgb, "ValueAnimator.ofArgb(vaderGrey, vaderError)");
        m18620a(ofArgb, 200, new C5720f(function1));
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{this.f13442g, this.f13441f});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofArgb2, "ValueAnimator.ofArgb(vaderError, vaderGrey)");
        m18620a(ofArgb2, 500, new C5721g(function1));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 1.02f});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofFloat3, "ValueAnimator.ofFloat(SCALE_ORIGIN, SCALE_UP_02)");
        m18620a(ofFloat3, 0, new C5717c(textView));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.02f, 1.0f});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofFloat4, "ValueAnimator.ofFloat(SCALE_UP_02, SCALE_ORIGIN)");
        m18620a(ofFloat4, 300, new C5718d(textView));
        this.f13437b.setInterpolator(new LinearInterpolator());
        this.f13437b.play(ofFloat).with(ofArgb).with(ofFloat3).before(ofFloat2).with(ofArgb2).with(ofFloat4);
        this.f13437b.start();
    }

    /* renamed from: a */
    private final ValueAnimator m18620a(ValueAnimator valueAnimator, long j, Function1<? super ValueAnimator, C13145v> function1) {
        valueAnimator.setDuration(j);
        C5723i iVar = new C5723i(valueAnimator, this, j, function1);
        valueAnimator.addUpdateListener(iVar);
        return valueAnimator;
    }

    /* renamed from: a */
    private final Paint m18621a(int i) {
        Paint paint = new Paint();
        paint.setColor(C4025a.m13788a(this.f13447l.getContext(), i));
        return paint;
    }
}
