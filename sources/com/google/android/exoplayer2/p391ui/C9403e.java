package com.google.android.exoplayer2.p391ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.exoplayer2.p391ui.C9418p.C9419a;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.ui.e */
/* compiled from: DefaultTimeBar */
public class C9403e extends View implements C9418p {

    /* renamed from: A0 */
    private long f21739A0;

    /* renamed from: B0 */
    private long f21740B0;

    /* renamed from: C0 */
    private long f21741C0;

    /* renamed from: D0 */
    private long f21742D0;

    /* renamed from: E0 */
    private int f21743E0;

    /* renamed from: F0 */
    private long[] f21744F0;

    /* renamed from: G0 */
    private boolean[] f21745G0;

    /* renamed from: U */
    private final Rect f21746U = new Rect();

    /* renamed from: V */
    private final Rect f21747V = new Rect();

    /* renamed from: W */
    private final Rect f21748W = new Rect();

    /* renamed from: a0 */
    private final Paint f21749a0 = new Paint();

    /* renamed from: b0 */
    private final Paint f21750b0 = new Paint();

    /* renamed from: c */
    private final Rect f21751c = new Rect();

    /* renamed from: c0 */
    private final Paint f21752c0 = new Paint();

    /* renamed from: d0 */
    private final Paint f21753d0 = new Paint();

    /* renamed from: e0 */
    private final Paint f21754e0 = new Paint();

    /* renamed from: f0 */
    private final Paint f21755f0 = new Paint();

    /* renamed from: g0 */
    private final Drawable f21756g0;

    /* renamed from: h0 */
    private final int f21757h0;

    /* renamed from: i0 */
    private final int f21758i0;

    /* renamed from: j0 */
    private final int f21759j0;

    /* renamed from: k0 */
    private final int f21760k0;

    /* renamed from: l0 */
    private final int f21761l0;

    /* renamed from: m0 */
    private final int f21762m0;

    /* renamed from: n0 */
    private final int f21763n0;

    /* renamed from: o0 */
    private final int f21764o0;

    /* renamed from: p0 */
    private final StringBuilder f21765p0;

    /* renamed from: q0 */
    private final Formatter f21766q0;

    /* renamed from: r0 */
    private final Runnable f21767r0;

    /* renamed from: s0 */
    private final CopyOnWriteArraySet<C9419a> f21768s0;

    /* renamed from: t0 */
    private final int[] f21769t0;

    /* renamed from: u0 */
    private final Point f21770u0;

    /* renamed from: v0 */
    private final float f21771v0;

    /* renamed from: w0 */
    private int f21772w0;

    /* renamed from: x0 */
    private long f21773x0;

    /* renamed from: y0 */
    private int f21774y0;

    /* renamed from: z0 */
    private boolean f21775z0;

    public C9403e(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        this.f21755f0.setAntiAlias(true);
        this.f21768s0 = new CopyOnWriteArraySet<>();
        this.f21769t0 = new int[2];
        this.f21770u0 = new Point();
        this.f21771v0 = context.getResources().getDisplayMetrics().density;
        this.f21764o0 = m28799a(this.f21771v0, -50);
        int a = m28799a(this.f21771v0, 4);
        int a2 = m28799a(this.f21771v0, 26);
        int a3 = m28799a(this.f21771v0, 4);
        int a4 = m28799a(this.f21771v0, 12);
        int a5 = m28799a(this.f21771v0, 0);
        int a6 = m28799a(this.f21771v0, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C9416n.DefaultTimeBar, 0, 0);
            try {
                this.f21756g0 = obtainStyledAttributes.getDrawable(C9416n.DefaultTimeBar_scrubber_drawable);
                if (this.f21756g0 != null) {
                    m28807a(this.f21756g0);
                    a2 = Math.max(this.f21756g0.getMinimumHeight(), a2);
                }
                this.f21757h0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_bar_height, a);
                this.f21758i0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_touch_target_height, a2);
                this.f21759j0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_ad_marker_width, a3);
                this.f21760k0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_scrubber_enabled_size, a4);
                this.f21761l0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_scrubber_disabled_size, a5);
                this.f21762m0 = obtainStyledAttributes.getDimensionPixelSize(C9416n.DefaultTimeBar_scrubber_dragged_size, a6);
                int i2 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_played_color, -1);
                int i3 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_scrubber_color, m28814c(i2));
                int i4 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_buffered_color, m28800a(i2));
                int i5 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_unplayed_color, m28817d(i2));
                int i6 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_ad_marker_color, -1291845888);
                int i7 = obtainStyledAttributes.getInt(C9416n.DefaultTimeBar_played_ad_marker_color, m28810b(i6));
                this.f21749a0.setColor(i2);
                this.f21755f0.setColor(i3);
                this.f21750b0.setColor(i4);
                this.f21752c0.setColor(i5);
                this.f21753d0.setColor(i6);
                this.f21754e0.setColor(i7);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f21757h0 = a;
            this.f21758i0 = a2;
            this.f21759j0 = a3;
            this.f21760k0 = a4;
            this.f21761l0 = a5;
            this.f21762m0 = a6;
            this.f21749a0.setColor(-1);
            this.f21755f0.setColor(m28814c(-1));
            this.f21750b0.setColor(m28800a(-1));
            this.f21752c0.setColor(m28817d(-1));
            this.f21753d0.setColor(-1291845888);
            this.f21756g0 = null;
        }
        this.f21765p0 = new StringBuilder();
        this.f21766q0 = new Formatter(this.f21765p0, Locale.getDefault());
        this.f21767r0 = new C9400b(this);
        Drawable drawable = this.f21756g0;
        if (drawable != null) {
            this.f21763n0 = (drawable.getMinimumWidth() + 1) / 2;
        } else {
            this.f21763n0 = (Math.max(this.f21761l0, Math.max(this.f21760k0, this.f21762m0)) + 1) / 2;
        }
        this.f21740B0 = -9223372036854775807L;
        this.f21773x0 = -9223372036854775807L;
        this.f21772w0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    private static int m28799a(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    /* renamed from: a */
    public static int m28800a(int i) {
        return (i & 16777215) | -872415232;
    }

    /* renamed from: b */
    private static int m28809b(float f, int i) {
        return (int) (((float) i) / f);
    }

    /* renamed from: b */
    public static int m28810b(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: b */
    private void m28812b(long j) {
        this.f21739A0 = j;
        this.f21775z0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f21768s0.iterator();
        while (it.hasNext()) {
            ((C9419a) it.next()).mo24406b(this, j);
        }
    }

    /* renamed from: c */
    public static int m28814c(int i) {
        return i | -16777216;
    }

    /* renamed from: c */
    private void m28816c(long j) {
        if (this.f21739A0 != j) {
            this.f21739A0 = j;
            Iterator it = this.f21768s0.iterator();
            while (it.hasNext()) {
                ((C9419a) it.next()).mo24404a(this, j);
            }
        }
    }

    /* renamed from: d */
    public static int m28817d(int i) {
        return (i & 16777215) | 855638016;
    }

    private long getPositionIncrement() {
        long j = this.f21773x0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f21740B0;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f21772w0);
    }

    private String getProgressText() {
        return Util.m29398a(this.f21765p0, this.f21766q0, this.f21741C0);
    }

    private long getScrubberPosition() {
        if (this.f21746U.width() <= 0 || this.f21740B0 == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f21748W.width()) * this.f21740B0) / ((long) this.f21746U.width());
    }

    /* renamed from: a */
    public /* synthetic */ void mo24348a() {
        m28804a(false);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m28815c();
    }

    public long getPreferredUpdateDelay() {
        int b = m28809b(this.f21771v0, this.f21746U.width());
        if (b != 0) {
            long j = this.f21740B0;
            if (!(j == 0 || j == -9223372036854775807L)) {
                return j / ((long) b);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21756g0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        m28813b(canvas);
        m28803a(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f21775z0 && !z) {
            m28804a(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f21740B0 > 0) {
            if (Util.SDK_INT >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(ContentServiceClientExtras.URL_SIZE_LIMIT);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (m28806a(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f21767r0);
        postDelayed(r4.f21767r0, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m28806a(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f21767r0
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f21767r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f21775z0
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.m28804a(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9403e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = ((i4 - i2) - this.f21758i0) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f21758i0;
        int i8 = ((i7 - this.f21757h0) / 2) + i6;
        this.f21751c.set(paddingLeft, i6, paddingRight, i7 + i6);
        Rect rect = this.f21746U;
        Rect rect2 = this.f21751c;
        int i9 = rect2.left;
        int i10 = this.f21763n0;
        rect.set(i9 + i10, i8, rect2.right - i10, this.f21757h0 + i8);
        m28811b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f21758i0;
        } else if (mode != 1073741824) {
            size = Math.min(this.f21758i0, size);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), size);
        m28815c();
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f21756g0;
        if (drawable != null && m28808a(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.f21740B0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.m28801a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.f21775z0
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f21764o0
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.f21774y0
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m28802a(r8)
            goto L_0x0040
        L_0x003a:
            r7.f21774y0 = r2
            float r8 = (float) r2
            r7.m28802a(r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.m28816c(r0)
            r7.m28811b()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.f21775z0
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = 1
        L_0x0059:
            r7.m28804a(r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m28805a(r8, r0)
            if (r0 == 0) goto L_0x0076
            r7.m28802a(r8)
            long r0 = r7.getScrubberPosition()
            r7.m28812b(r0)
            r7.m28811b()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9403e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f21740B0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m28806a(-getPositionIncrement())) {
                m28804a(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m28806a(getPositionIncrement())) {
                m28804a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f21753d0.setColor(i);
        invalidate(this.f21751c);
    }

    public void setBufferedColor(int i) {
        this.f21750b0.setColor(i);
        invalidate(this.f21751c);
    }

    public void setBufferedPosition(long j) {
        this.f21742D0 = j;
        m28811b();
    }

    public void setDuration(long j) {
        this.f21740B0 = j;
        if (this.f21775z0 && j == -9223372036854775807L) {
            m28804a(true);
        }
        m28811b();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f21775z0 && !z) {
            m28804a(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        Assertions.checkArgument(i > 0);
        this.f21772w0 = i;
        this.f21773x0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Assertions.checkArgument(j > 0);
        this.f21772w0 = -1;
        this.f21773x0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f21754e0.setColor(i);
        invalidate(this.f21751c);
    }

    public void setPlayedColor(int i) {
        this.f21749a0.setColor(i);
        invalidate(this.f21751c);
    }

    public void setPosition(long j) {
        this.f21741C0 = j;
        setContentDescription(getProgressText());
        m28811b();
    }

    public void setScrubberColor(int i) {
        this.f21755f0.setColor(i);
        invalidate(this.f21751c);
    }

    public void setUnplayedColor(int i) {
        this.f21752c0.setColor(i);
        invalidate(this.f21751c);
    }

    /* renamed from: a */
    public void mo24349a(C9419a aVar) {
        this.f21768s0.add(aVar);
    }

    /* renamed from: a */
    public void mo24350a(long[] jArr, boolean[] zArr, int i) {
        Assertions.checkArgument(i == 0 || !(jArr == null || zArr == null));
        this.f21743E0 = i;
        this.f21744F0 = jArr;
        this.f21745G0 = zArr;
        m28811b();
    }

    /* renamed from: c */
    private void m28815c() {
        Drawable drawable = this.f21756g0;
        if (drawable != null && drawable.isStateful() && this.f21756g0.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: a */
    private void m28804a(boolean z) {
        removeCallbacks(this.f21767r0);
        this.f21775z0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f21768s0.iterator();
        while (it.hasNext()) {
            ((C9419a) it.next()).mo24405a(this, this.f21739A0, z);
        }
    }

    /* renamed from: b */
    private void m28811b() {
        this.f21747V.set(this.f21746U);
        this.f21748W.set(this.f21746U);
        long j = this.f21775z0 ? this.f21739A0 : this.f21741C0;
        if (this.f21740B0 > 0) {
            int width = (int) ((((long) this.f21746U.width()) * this.f21742D0) / this.f21740B0);
            Rect rect = this.f21747V;
            Rect rect2 = this.f21746U;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f21746U.width()) * j) / this.f21740B0);
            Rect rect3 = this.f21748W;
            Rect rect4 = this.f21746U;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f21747V;
            int i = this.f21746U.left;
            rect5.right = i;
            this.f21748W.right = i;
        }
        invalidate(this.f21751c);
    }

    /* renamed from: a */
    private boolean m28806a(long j) {
        if (this.f21740B0 <= 0) {
            return false;
        }
        long j2 = this.f21775z0 ? this.f21739A0 : this.f21741C0;
        long b = Util.m29431b(j2 + j, 0, this.f21740B0);
        if (b == j2) {
            return false;
        }
        if (!this.f21775z0) {
            m28812b(b);
        } else {
            m28816c(b);
        }
        m28811b();
        return true;
    }

    /* renamed from: b */
    private void m28813b(Canvas canvas) {
        int height = this.f21746U.height();
        int centerY = this.f21746U.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f21740B0 <= 0) {
            Rect rect = this.f21746U;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i, this.f21752c0);
            return;
        }
        Rect rect2 = this.f21747V;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f21746U.left, i3), this.f21748W.right);
        int i4 = this.f21746U.right;
        if (max < i4) {
            canvas.drawRect((float) max, (float) centerY, (float) i4, (float) i, this.f21752c0);
        }
        int max2 = Math.max(i2, this.f21748W.right);
        if (i3 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f21750b0);
        }
        if (this.f21748W.width() > 0) {
            Rect rect3 = this.f21748W;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i, this.f21749a0);
        }
        if (this.f21743E0 != 0) {
            long[] jArr = this.f21744F0;
            Assertions.checkNotNull(jArr);
            long[] jArr2 = jArr;
            boolean[] zArr = this.f21745G0;
            Assertions.checkNotNull(zArr);
            boolean[] zArr2 = zArr;
            int i5 = this.f21759j0 / 2;
            for (int i6 = 0; i6 < this.f21743E0; i6++) {
                int width = ((int) ((((long) this.f21746U.width()) * Util.m29431b(jArr2[i6], 0, this.f21740B0)) / this.f21740B0)) - i5;
                Rect rect4 = this.f21746U;
                int min = rect4.left + Math.min(rect4.width() - this.f21759j0, Math.max(0, width));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f21759j0), (float) i, zArr2[i6] ? this.f21754e0 : this.f21753d0);
            }
        }
    }

    /* renamed from: a */
    private void m28802a(float f) {
        Rect rect = this.f21748W;
        int i = (int) f;
        Rect rect2 = this.f21746U;
        rect.right = Util.m29382a(i, rect2.left, rect2.right);
    }

    /* renamed from: a */
    private Point m28801a(MotionEvent motionEvent) {
        getLocationOnScreen(this.f21769t0);
        this.f21770u0.set(((int) motionEvent.getRawX()) - this.f21769t0[0], ((int) motionEvent.getRawY()) - this.f21769t0[1]);
        return this.f21770u0;
    }

    /* renamed from: a */
    private boolean m28805a(float f, float f2) {
        return this.f21751c.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private void m28803a(Canvas canvas) {
        if (this.f21740B0 > 0) {
            Rect rect = this.f21748W;
            int a = Util.m29382a(rect.right, rect.left, this.f21746U.right);
            int centerY = this.f21748W.centerY();
            Drawable drawable = this.f21756g0;
            if (drawable == null) {
                int i = (this.f21775z0 || isFocused()) ? this.f21762m0 : isEnabled() ? this.f21760k0 : this.f21761l0;
                canvas.drawCircle((float) a, (float) centerY, (float) (i / 2), this.f21755f0);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight = this.f21756g0.getIntrinsicHeight() / 2;
                this.f21756g0.setBounds(a - intrinsicWidth, centerY - intrinsicHeight, a + intrinsicWidth, centerY + intrinsicHeight);
                this.f21756g0.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private boolean m28807a(Drawable drawable) {
        return Util.SDK_INT >= 23 && m28808a(drawable, getLayoutDirection());
    }

    /* renamed from: a */
    private static boolean m28808a(Drawable drawable, int i) {
        return Util.SDK_INT >= 23 && drawable.setLayoutDirection(i);
    }
}
