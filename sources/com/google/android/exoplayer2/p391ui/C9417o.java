package com.google.android.exoplayer2.p391ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.exoplayer2.p382u0.C9321a;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.ui.o */
/* compiled from: SubtitlePainter */
final class C9417o {

    /* renamed from: A */
    private float f21830A;

    /* renamed from: B */
    private int f21831B;

    /* renamed from: C */
    private int f21832C;

    /* renamed from: D */
    private int f21833D;

    /* renamed from: E */
    private int f21834E;

    /* renamed from: F */
    private StaticLayout f21835F;

    /* renamed from: G */
    private int f21836G;

    /* renamed from: H */
    private int f21837H;

    /* renamed from: I */
    private int f21838I;

    /* renamed from: J */
    private Rect f21839J;

    /* renamed from: a */
    private final float f21840a;

    /* renamed from: b */
    private final float f21841b;

    /* renamed from: c */
    private final float f21842c;

    /* renamed from: d */
    private final float f21843d;

    /* renamed from: e */
    private final float f21844e;

    /* renamed from: f */
    private final TextPaint f21845f = new TextPaint();

    /* renamed from: g */
    private final Paint f21846g;

    /* renamed from: h */
    private CharSequence f21847h;

    /* renamed from: i */
    private Alignment f21848i;

    /* renamed from: j */
    private Bitmap f21849j;

    /* renamed from: k */
    private float f21850k;

    /* renamed from: l */
    private int f21851l;

    /* renamed from: m */
    private int f21852m;

    /* renamed from: n */
    private float f21853n;

    /* renamed from: o */
    private int f21854o;

    /* renamed from: p */
    private float f21855p;

    /* renamed from: q */
    private float f21856q;

    /* renamed from: r */
    private boolean f21857r;

    /* renamed from: s */
    private boolean f21858s;

    /* renamed from: t */
    private int f21859t;

    /* renamed from: u */
    private int f21860u;

    /* renamed from: v */
    private int f21861v;

    /* renamed from: w */
    private int f21862w;

    /* renamed from: x */
    private int f21863x;

    /* renamed from: y */
    private float f21864y;

    /* renamed from: z */
    private float f21865z;

    public C9417o(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f21844e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21843d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f21840a = round;
        this.f21841b = round;
        this.f21842c = round;
        this.f21845f.setAntiAlias(true);
        this.f21845f.setSubpixelText(true);
        this.f21846g = new Paint();
        this.f21846g.setAntiAlias(true);
        this.f21846g.setStyle(Style.FILL);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r18v1 */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28894b() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.f21833D
            int r2 = r0.f21831B
            int r1 = r1 - r2
            int r2 = r0.f21834E
            int r3 = r0.f21832C
            int r2 = r2 - r3
            android.text.TextPaint r3 = r0.f21845f
            float r4 = r0.f21864y
            r3.setTextSize(r4)
            float r3 = r0.f21864y
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            int r4 = r3 * 2
            int r5 = r1 - r4
            float r6 = r0.f21855p
            r7 = 1
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x002c
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
        L_0x002c:
            java.lang.String r6 = "SubtitlePainter"
            if (r5 > 0) goto L_0x0036
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            com.google.android.exoplayer2.util.Log.m29500d(r6, r1)
            return
        L_0x0036:
            java.lang.CharSequence r8 = r0.f21847h
            boolean r9 = r0.f21857r
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r16 = 0
            r15 = 0
            if (r9 != 0) goto L_0x0046
            java.lang.String r8 = r8.toString()
            goto L_0x0096
        L_0x0046:
            boolean r9 = r0.f21858s
            if (r9 != 0) goto L_0x007b
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            int r8 = r9.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r11 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r11 = r9.getSpans(r15, r8, r11)
            android.text.style.AbsoluteSizeSpan[] r11 = (android.text.style.AbsoluteSizeSpan[]) r11
            java.lang.Class<android.text.style.RelativeSizeSpan> r12 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r8 = r9.getSpans(r15, r8, r12)
            android.text.style.RelativeSizeSpan[] r8 = (android.text.style.RelativeSizeSpan[]) r8
            int r12 = r11.length
            r13 = 0
        L_0x0065:
            if (r13 >= r12) goto L_0x006f
            r14 = r11[r13]
            r9.removeSpan(r14)
            int r13 = r13 + 1
            goto L_0x0065
        L_0x006f:
            int r11 = r8.length
            r12 = 0
        L_0x0071:
            if (r12 >= r11) goto L_0x0095
            r13 = r8[r12]
            r9.removeSpan(r13)
            int r12 = r12 + 1
            goto L_0x0071
        L_0x007b:
            float r9 = r0.f21865z
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0096
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            float r11 = r0.f21865z
            int r11 = (int) r11
            r8.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r8, r15, r11, r10)
        L_0x0095:
            r8 = r9
        L_0x0096:
            int r9 = r0.f21860u
            int r9 = android.graphics.Color.alpha(r9)
            if (r9 <= 0) goto L_0x00b4
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            int r11 = r0.f21860u
            r8.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r8, r15, r11, r10)
            r18 = r9
            goto L_0x00b6
        L_0x00b4:
            r18 = r8
        L_0x00b6:
            android.text.Layout$Alignment r8 = r0.f21848i
            if (r8 != 0) goto L_0x00bc
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00bc:
            r21 = r8
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.TextPaint r10 = r0.f21845f
            float r13 = r0.f21843d
            float r12 = r0.f21844e
            r17 = 1
            r8 = r14
            r9 = r18
            r11 = r5
            r19 = r12
            r12 = r21
            r7 = r14
            r14 = r19
            r25 = r3
            r3 = 0
            r15 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f21835F = r7
            android.text.StaticLayout r7 = r0.f21835F
            int r7 = r7.getHeight()
            android.text.StaticLayout r8 = r0.f21835F
            int r8 = r8.getLineCount()
            r9 = 0
            r10 = 0
        L_0x00eb:
            if (r9 >= r8) goto L_0x0100
            android.text.StaticLayout r11 = r0.f21835F
            float r11 = r11.getLineWidth(r9)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r10 = java.lang.Math.max(r11, r10)
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x0100:
            float r8 = r0.f21855p
            r9 = 1
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x010a
            if (r10 >= r5) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r5 = r10
        L_0x010b:
            int r5 = r5 + r4
            float r4 = r0.f21853n
            r8 = 1
            r10 = 2
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0138
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r4 = r0.f21831B
            int r1 = r1 + r4
            int r4 = r0.f21854o
            if (r4 != r10) goto L_0x0124
            int r1 = r1 - r5
            goto L_0x012a
        L_0x0124:
            if (r4 != r8) goto L_0x012a
            int r1 = r1 * 2
            int r1 = r1 - r5
            int r1 = r1 / r10
        L_0x012a:
            int r4 = r0.f21831B
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r5 + r1
            int r4 = r0.f21833D
            int r4 = java.lang.Math.min(r5, r4)
            goto L_0x013f
        L_0x0138:
            int r1 = r1 - r5
            int r1 = r1 / r10
            int r4 = r0.f21831B
            int r1 = r1 + r4
            int r4 = r1 + r5
        L_0x013f:
            int r4 = r4 - r1
            if (r4 > 0) goto L_0x0148
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            com.google.android.exoplayer2.util.Log.m29500d(r6, r1)
            return
        L_0x0148:
            float r5 = r0.f21850k
            r6 = 1
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x01a3
            int r6 = r0.f21851l
            if (r6 != 0) goto L_0x015e
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
            int r3 = r0.f21832C
        L_0x015c:
            int r2 = r2 + r3
            goto L_0x0188
        L_0x015e:
            android.text.StaticLayout r2 = r0.f21835F
            int r2 = r2.getLineBottom(r3)
            android.text.StaticLayout r5 = r0.f21835F
            int r3 = r5.getLineTop(r3)
            int r2 = r2 - r3
            float r3 = r0.f21850k
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x017b
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = r0.f21832C
            goto L_0x015c
        L_0x017b:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r5
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = r0.f21834E
            goto L_0x015c
        L_0x0188:
            int r3 = r0.f21852m
            if (r3 != r10) goto L_0x018e
            int r2 = r2 - r7
            goto L_0x0194
        L_0x018e:
            if (r3 != r8) goto L_0x0194
            int r2 = r2 * 2
            int r2 = r2 - r7
            int r2 = r2 / r10
        L_0x0194:
            int r3 = r2 + r7
            int r5 = r0.f21834E
            if (r3 <= r5) goto L_0x019d
            int r2 = r5 - r7
            goto L_0x01ae
        L_0x019d:
            int r3 = r0.f21832C
            if (r2 >= r3) goto L_0x01ae
            r2 = r3
            goto L_0x01ae
        L_0x01a3:
            int r3 = r0.f21834E
            int r3 = r3 - r7
            float r2 = (float) r2
            float r5 = r0.f21830A
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r3 - r2
        L_0x01ae:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f21845f
            float r6 = r0.f21843d
            float r7 = r0.f21844e
            r24 = 1
            r17 = r3
            r19 = r5
            r20 = r4
            r22 = r6
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f21835F = r3
            r0.f21836G = r1
            r0.f21837H = r2
            r1 = r25
            r0.f21838I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9417o.m28894b():void");
    }

    /* renamed from: a */
    public void mo24410a(C9322b bVar, boolean z, boolean z2, C9321a aVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        C9322b bVar2 = bVar;
        boolean z3 = z;
        boolean z4 = z2;
        C9321a aVar2 = aVar;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        Canvas canvas2 = canvas;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z5 = bVar2.f21347V == null;
        int i9 = -16777216;
        if (z5) {
            if (!TextUtils.isEmpty(bVar2.f21354c)) {
                i9 = (!bVar2.f21356d0 || !z3) ? aVar2.f21341c : bVar2.f21357e0;
            } else {
                return;
            }
        }
        if (m28893a(this.f21847h, bVar2.f21354c) && Util.m29414a((Object) this.f21848i, (Object) bVar2.f21346U) && this.f21849j == bVar2.f21347V && this.f21850k == bVar2.f21348W && this.f21851l == bVar2.f21349X && Util.m29414a((Object) Integer.valueOf(this.f21852m), (Object) Integer.valueOf(bVar2.f21350Y)) && this.f21853n == bVar2.f21351Z && Util.m29414a((Object) Integer.valueOf(this.f21854o), (Object) Integer.valueOf(bVar2.f21352a0)) && this.f21855p == bVar2.f21353b0 && this.f21856q == bVar2.f21355c0 && this.f21857r == z3 && this.f21858s == z4 && this.f21859t == aVar2.f21339a && this.f21860u == aVar2.f21340b && this.f21861v == i9 && this.f21863x == aVar2.f21342d && this.f21862w == aVar2.f21343e && Util.m29414a((Object) this.f21845f.getTypeface(), (Object) aVar2.f21344f) && this.f21864y == f4 && this.f21865z == f5 && this.f21830A == f6 && this.f21831B == i5 && this.f21832C == i6 && this.f21833D == i7 && this.f21834E == i8) {
            m28892a(canvas, z5);
            return;
        }
        Canvas canvas3 = canvas;
        this.f21847h = bVar2.f21354c;
        this.f21848i = bVar2.f21346U;
        this.f21849j = bVar2.f21347V;
        this.f21850k = bVar2.f21348W;
        this.f21851l = bVar2.f21349X;
        this.f21852m = bVar2.f21350Y;
        this.f21853n = bVar2.f21351Z;
        this.f21854o = bVar2.f21352a0;
        this.f21855p = bVar2.f21353b0;
        this.f21856q = bVar2.f21355c0;
        this.f21857r = z3;
        this.f21858s = z4;
        this.f21859t = aVar2.f21339a;
        this.f21860u = aVar2.f21340b;
        this.f21861v = i9;
        this.f21863x = aVar2.f21342d;
        this.f21862w = aVar2.f21343e;
        this.f21845f.setTypeface(aVar2.f21344f);
        this.f21864y = f4;
        this.f21865z = f5;
        this.f21830A = f6;
        this.f21831B = i5;
        this.f21832C = i6;
        this.f21833D = i7;
        this.f21834E = i8;
        if (z5) {
            m28894b();
        } else {
            m28890a();
        }
        m28892a(canvas3, z5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28890a() {
        /*
            r7 = this;
            int r0 = r7.f21833D
            int r1 = r7.f21831B
            int r0 = r0 - r1
            int r2 = r7.f21834E
            int r3 = r7.f21832C
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.f21853n
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.f21850k
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.f21855p
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.f21856q
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x002e
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            goto L_0x0044
        L_0x002e:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.f21849j
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.f21849j
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
        L_0x0044:
            int r4 = r7.f21854o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x004d
            float r4 = (float) r0
        L_0x004b:
            float r1 = r1 - r4
            goto L_0x0053
        L_0x004d:
            if (r4 != r5) goto L_0x0053
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L_0x004b
        L_0x0053:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.f21852m
            if (r4 != r6) goto L_0x005e
            float r4 = (float) r2
        L_0x005c:
            float r3 = r3 - r4
            goto L_0x0064
        L_0x005e:
            if (r4 != r5) goto L_0x0064
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L_0x005c
        L_0x0064:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.f21839J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9417o.m28890a():void");
    }

    /* renamed from: a */
    private void m28892a(Canvas canvas, boolean z) {
        if (z) {
            m28895b(canvas);
        } else {
            m28891a(canvas);
        }
    }

    /* renamed from: a */
    private void m28891a(Canvas canvas) {
        canvas.drawBitmap(this.f21849j, null, this.f21839J, null);
    }

    /* renamed from: a */
    private static boolean m28893a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: b */
    private void m28895b(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f21835F;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate((float) this.f21836G, (float) this.f21837H);
            if (Color.alpha(this.f21861v) > 0) {
                this.f21846g.setColor(this.f21861v);
                canvas.drawRect((float) (-this.f21838I), 0.0f, (float) (staticLayout.getWidth() + this.f21838I), (float) staticLayout.getHeight(), this.f21846g);
            }
            int i2 = this.f21863x;
            boolean z = true;
            if (i2 == 1) {
                this.f21845f.setStrokeJoin(Join.ROUND);
                this.f21845f.setStrokeWidth(this.f21840a);
                this.f21845f.setColor(this.f21862w);
                this.f21845f.setStyle(Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f21845f;
                float f = this.f21841b;
                float f2 = this.f21842c;
                textPaint.setShadowLayer(f, f2, f2, this.f21862w);
            } else if (i2 == 3 || i2 == 4) {
                if (this.f21863x != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f21862w;
                }
                if (z) {
                    i3 = this.f21862w;
                }
                float f3 = this.f21841b / 2.0f;
                this.f21845f.setColor(this.f21859t);
                this.f21845f.setStyle(Style.FILL);
                float f4 = -f3;
                this.f21845f.setShadowLayer(this.f21841b, f4, f4, i);
                staticLayout.draw(canvas);
                this.f21845f.setShadowLayer(this.f21841b, f3, f3, i3);
            }
            this.f21845f.setColor(this.f21859t);
            this.f21845f.setStyle(Style.FILL);
            staticLayout.draw(canvas);
            this.f21845f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }
}
