package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p096e.p146l.C4226d;

/* renamed from: androidx.leanback.widget.w */
/* compiled from: StreamingTextView */
class C0692w extends EditText {

    /* renamed from: b0 */
    private static final Pattern f2946b0 = Pattern.compile("\\S+");

    /* renamed from: c0 */
    private static final Property<C0692w, Integer> f2947c0 = new C0693a(Integer.class, "streamPosition");

    /* renamed from: U */
    Bitmap f2948U;

    /* renamed from: V */
    Bitmap f2949V;

    /* renamed from: W */
    int f2950W;

    /* renamed from: a0 */
    private ObjectAnimator f2951a0;

    /* renamed from: c */
    final Random f2952c = new Random();

    /* renamed from: androidx.leanback.widget.w$a */
    /* compiled from: StreamingTextView */
    static class C0693a extends Property<C0692w, Integer> {
        C0693a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Integer get(C0692w wVar) {
            return Integer.valueOf(wVar.getStreamPosition());
        }

        /* renamed from: a */
        public void set(C0692w wVar, Integer num) {
            wVar.setStreamPosition(num.intValue());
        }
    }

    /* renamed from: androidx.leanback.widget.w$b */
    /* compiled from: StreamingTextView */
    private class C0694b extends ReplacementSpan {

        /* renamed from: U */
        private final int f2953U;

        /* renamed from: c */
        private final int f2955c;

        public C0694b(int i, int i2) {
            this.f2955c = i;
            this.f2953U = i2;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int measureText = (int) paint.measureText(charSequence, i, i2);
            int width = C0692w.this.f2948U.getWidth();
            int i6 = width * 2;
            int i7 = measureText / i6;
            int i8 = (measureText % i6) / 2;
            boolean a = C0692w.m3668a((View) C0692w.this);
            C0692w.this.f2952c.setSeed((long) this.f2955c);
            int alpha = paint.getAlpha();
            int i9 = 0;
            while (i9 < i7 && this.f2953U + i9 < C0692w.this.f2950W) {
                float f2 = (float) ((i9 * i6) + i8 + (width / 2));
                float f3 = a ? ((((float) measureText) + f) - f2) - ((float) width) : f + f2;
                paint.setAlpha((C0692w.this.f2952c.nextInt(4) + 1) * 63);
                if (C0692w.this.f2952c.nextBoolean()) {
                    Bitmap bitmap = C0692w.this.f2949V;
                    canvas.drawBitmap(bitmap, f3, (float) (i4 - bitmap.getHeight()), paint);
                } else {
                    Bitmap bitmap2 = C0692w.this.f2948U;
                    canvas.drawBitmap(bitmap2, f3, (float) (i4 - bitmap2.getHeight()), paint);
                }
                i9++;
            }
            paint.setAlpha(alpha);
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i, i2);
        }
    }

    public C0692w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private Bitmap m3665a(int i, float f) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        return Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * f), (int) (((float) decodeResource.getHeight()) * f), false);
    }

    /* renamed from: b */
    private void m3669b() {
        ObjectAnimator objectAnimator = this.f2951a0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    private void m3670c() {
        m3669b();
        int streamPosition = getStreamPosition();
        int length = length();
        int i = length - streamPosition;
        if (i > 0) {
            if (this.f2951a0 == null) {
                this.f2951a0 = new ObjectAnimator();
                this.f2951a0.setTarget(this);
                this.f2951a0.setProperty(f2947c0);
            }
            this.f2951a0.setIntValues(new int[]{streamPosition, length});
            this.f2951a0.setDuration(((long) i) * 50);
            this.f2951a0.start();
        }
    }

    /* access modifiers changed from: 0000 */
    public int getStreamPosition() {
        return this.f2950W;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2948U = m3665a(C4226d.lb_text_dot_one, 1.3f);
        this.f2949V = m3665a(C4226d.lb_text_dot_two, 1.3f);
        mo4066a();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0692w.class.getCanonicalName());
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        m3667a(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public void setStreamPosition(int i) {
        this.f2950W = i;
        invalidate();
    }

    public C0692w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo4066a() {
        this.f2950W = -1;
        m3669b();
        setText("");
    }

    /* renamed from: a */
    public void mo4067a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str2);
            m3666a(spannableStringBuilder, str2, length);
        }
        this.f2950W = Math.max(str.length(), this.f2950W);
        m3667a((CharSequence) new SpannedString(spannableStringBuilder));
        m3670c();
    }

    /* renamed from: a */
    private void m3666a(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        Matcher matcher = f2946b0.matcher(str);
        while (matcher.find()) {
            int start = matcher.start() + i;
            spannableStringBuilder.setSpan(new C0694b(str.charAt(matcher.start()), start), start, matcher.end() + i, 33);
        }
    }

    /* renamed from: a */
    private void m3667a(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    /* renamed from: a */
    public static boolean m3668a(View view) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        boolean z = true;
        if (1 != view.getLayoutDirection()) {
            z = false;
        }
        return z;
    }
}
