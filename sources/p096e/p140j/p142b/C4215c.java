package p096e.p140j.p142b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p096e.p121h.p135s.C4187x;

/* renamed from: e.j.b.c */
/* compiled from: ViewDragHelper */
public class C4215c {

    /* renamed from: w */
    private static final Interpolator f10534w = new C4216a();

    /* renamed from: a */
    private int f10535a;

    /* renamed from: b */
    private int f10536b;

    /* renamed from: c */
    private int f10537c = -1;

    /* renamed from: d */
    private float[] f10538d;

    /* renamed from: e */
    private float[] f10539e;

    /* renamed from: f */
    private float[] f10540f;

    /* renamed from: g */
    private float[] f10541g;

    /* renamed from: h */
    private int[] f10542h;

    /* renamed from: i */
    private int[] f10543i;

    /* renamed from: j */
    private int[] f10544j;

    /* renamed from: k */
    private int f10545k;

    /* renamed from: l */
    private VelocityTracker f10546l;

    /* renamed from: m */
    private float f10547m;

    /* renamed from: n */
    private float f10548n;

    /* renamed from: o */
    private int f10549o;

    /* renamed from: p */
    private int f10550p;

    /* renamed from: q */
    private OverScroller f10551q;

    /* renamed from: r */
    private final C4218c f10552r;

    /* renamed from: s */
    private View f10553s;

    /* renamed from: t */
    private boolean f10554t;

    /* renamed from: u */
    private final ViewGroup f10555u;

    /* renamed from: v */
    private final Runnable f10556v = new C4217b();

    /* renamed from: e.j.b.c$a */
    /* compiled from: ViewDragHelper */
    static class C4216a implements Interpolator {
        C4216a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: e.j.b.c$b */
    /* compiled from: ViewDragHelper */
    class C4217b implements Runnable {
        C4217b() {
        }

        public void run() {
            C4215c.this.mo14893b(0);
        }
    }

    /* renamed from: e.j.b.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C4218c {
        /* renamed from: a */
        public int mo14901a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo14902a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo14903a(View view, int i, int i2);

        /* renamed from: a */
        public void mo14904a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo14905a(View view, float f, float f2);

        /* renamed from: a */
        public void mo14906a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo14907a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo14908b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo14909b(View view, int i, int i2);

        /* renamed from: b */
        public void mo14910b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo14911b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo14912b(View view, int i);

        /* renamed from: c */
        public abstract void mo14913c(int i);
    }

    private C4215c(Context context, ViewGroup viewGroup, C4218c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f10555u = viewGroup;
            this.f10552r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f10549o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f10536b = viewConfiguration.getScaledTouchSlop();
            this.f10547m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10548n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10551q = new OverScroller(context, f10534w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public static C4215c m14522a(ViewGroup viewGroup, C4218c cVar) {
        return new C4215c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: d */
    private void m14536d(int i) {
        float[] fArr = this.f10538d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f10538d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f10539e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f10540f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f10541g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f10542h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10543i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10544j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10538d = fArr2;
            this.f10539e = fArr3;
            this.f10540f = fArr4;
            this.f10541g = fArr5;
            this.f10542h = iArr;
            this.f10543i = iArr2;
            this.f10544j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m14537e(int i) {
        if (mo14889a(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: b */
    public int mo14892b() {
        return this.f10536b;
    }

    /* renamed from: c */
    public boolean mo14898c(int i, int i2) {
        if (this.f10554t) {
            return m14530b(i, i2, (int) this.f10546l.getXVelocity(this.f10537c), (int) this.f10546l.getYVelocity(this.f10537c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public static C4215c m14521a(ViewGroup viewGroup, float f, C4218c cVar) {
        C4215c a = m14522a(viewGroup, cVar);
        a.f10536b = (int) (((float) a.f10536b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    public boolean mo14897b(View view, int i, int i2) {
        this.f10553s = view;
        this.f10537c = -1;
        boolean b = m14530b(i, i2, 0, 0);
        if (!b && this.f10535a == 0 && this.f10553s != null) {
            this.f10553s = null;
        }
        return b;
    }

    /* renamed from: a */
    public void mo14888a(View view, int i) {
        if (view.getParent() == this.f10555u) {
            this.f10553s = view;
            this.f10537c = i;
            this.f10552r.mo14906a(view, i);
            mo14893b(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f10555u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private boolean m14530b(int i, int i2, int i3, int i4) {
        int left = this.f10553s.getLeft();
        int top = this.f10553s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f10551q.abortAnimation();
            mo14893b(0);
            return false;
        }
        this.f10551q.startScroll(left, top, i5, i6, m14520a(this.f10553s, i5, i6, i3, i4));
        mo14893b(2);
        return true;
    }

    /* renamed from: c */
    private void m14531c() {
        float[] fArr = this.f10538d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10539e, 0.0f);
            Arrays.fill(this.f10540f, 0.0f);
            Arrays.fill(this.f10541g, 0.0f);
            Arrays.fill(this.f10542h, 0);
            Arrays.fill(this.f10543i, 0);
            Arrays.fill(this.f10544j, 0);
            this.f10545k = 0;
        }
    }

    /* renamed from: a */
    public void mo14886a() {
        this.f10537c = -1;
        m14531c();
        VelocityTracker velocityTracker = this.f10546l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10546l = null;
        }
    }

    /* renamed from: b */
    private int m14528b(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f10555u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m14517a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private int m14520a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m14519a(i3, (int) this.f10548n, (int) this.f10547m);
        int a2 = m14519a(i4, (int) this.f10548n, (int) this.f10547m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m14528b(i, a, this.f10552r.mo14902a(view))) * f5) + (((float) m14528b(i2, a2, this.f10552r.mo14908b(view))) * f6));
    }

    /* renamed from: c */
    private void m14532c(int i) {
        if (this.f10538d != null && mo14889a(i)) {
            this.f10538d[i] = 0.0f;
            this.f10539e[i] = 0.0f;
            this.f10540f[i] = 0.0f;
            this.f10541g[i] = 0.0f;
            this.f10542h[i] = 0;
            this.f10543i[i] = 0;
            this.f10544j[i] = 0;
            this.f10545k = (~(1 << i)) & this.f10545k;
        }
    }

    /* renamed from: b */
    private void m14529b(float f, float f2, int i) {
        m14536d(i);
        float[] fArr = this.f10538d;
        this.f10540f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f10539e;
        this.f10541g[i] = f2;
        fArr2[i] = f2;
        this.f10542h[i] = m14534d((int) f, (int) f2);
        this.f10545k |= 1 << i;
    }

    /* renamed from: a */
    private int m14519a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m14518a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: d */
    private void m14535d() {
        this.f10546l.computeCurrentVelocity(1000, this.f10547m);
        m14523a(m14518a(this.f10546l.getXVelocity(this.f10537c), this.f10548n, this.f10547m), m14518a(this.f10546l.getYVelocity(this.f10537c), this.f10548n, this.f10547m));
    }

    /* renamed from: a */
    private float m14517a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    private void m14533c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m14537e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f10540f[pointerId] = x;
                this.f10541g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public boolean mo14891a(boolean z) {
        if (this.f10535a == 2) {
            boolean computeScrollOffset = this.f10551q.computeScrollOffset();
            int currX = this.f10551q.getCurrX();
            int currY = this.f10551q.getCurrY();
            int left = currX - this.f10553s.getLeft();
            int top = currY - this.f10553s.getTop();
            if (left != 0) {
                C4187x.m14383d(this.f10553s, left);
            }
            if (top != 0) {
                C4187x.m14386e(this.f10553s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f10552r.mo14907a(this.f10553s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f10551q.getFinalX() && currY == this.f10551q.getFinalY()) {
                this.f10551q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f10555u.post(this.f10556v);
                } else {
                    mo14893b(0);
                }
            }
        }
        if (this.f10535a == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14893b(int i) {
        this.f10555u.removeCallbacks(this.f10556v);
        if (this.f10535a != i) {
            this.f10535a = i;
            this.f10552r.mo14913c(i);
            if (this.f10535a == 0) {
                this.f10553s = null;
            }
        }
    }

    /* renamed from: d */
    private int m14534d(int i, int i2) {
        int i3 = i < this.f10555u.getLeft() + this.f10549o ? 1 : 0;
        if (i2 < this.f10555u.getTop() + this.f10549o) {
            i3 |= 4;
        }
        if (i > this.f10555u.getRight() - this.f10549o) {
            i3 |= 2;
        }
        return i2 > this.f10555u.getBottom() - this.f10549o ? i3 | 8 : i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo14896b(View view, int i) {
        if (view == this.f10553s && this.f10537c == i) {
            return true;
        }
        if (view == null || !this.f10552r.mo14912b(view, i)) {
            return false;
        }
        this.f10537c = i;
        mo14888a(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14895b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo14886a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f10546l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f10546l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f10546l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m14532c(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m14529b(r7, r1, r2)
            int r3 = r0.f10535a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f10542h
            r1 = r1[r2]
            int r3 = r0.f10550p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            e.j.b.c$c r4 = r0.f10552r
            r1 = r1 & r3
            r4.mo14910b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo14885a(r3, r1)
            android.view.View r3 = r0.f10553s
            if (r1 != r3) goto L_0x0031
            r0.mo14896b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f10538d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f10539e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m14537e(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f10538d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f10539e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo14885a(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m14527a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            e.j.b.c$c r14 = r0.f10552r
            int r12 = r14.mo14903a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            e.j.b.c$c r5 = r0.f10552r
            int r5 = r5.mo14909b(r7, r15, r14)
            e.j.b.c$c r14 = r0.f10552r
            int r14 = r14.mo14902a(r7)
            e.j.b.c$c r15 = r0.f10552r
            int r15 = r15.mo14908b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m14524a(r9, r10, r4)
            int r5 = r0.f10535a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo14896b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m14533c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo14886a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m14529b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo14885a(r2, r3)
            android.view.View r3 = r0.f10553s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f10535a
            if (r3 != r4) goto L_0x0125
            r0.mo14896b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f10542h
            r2 = r2[r1]
            int r3 = r0.f10550p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            e.j.b.c$c r4 = r0.f10552r
            r2 = r2 & r3
            r4.mo14910b(r2, r1)
        L_0x0135:
            int r1 = r0.f10535a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p140j.p142b.C4215c.mo14895b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m14523a(float f, float f2) {
        this.f10554t = true;
        this.f10552r.mo14905a(this.f10553s, f, f2);
        this.f10554t = false;
        if (this.f10535a == 1) {
            mo14893b(0);
        }
    }

    /* renamed from: a */
    public boolean mo14889a(int i) {
        return ((1 << i) & this.f10545k) != 0;
    }

    /* renamed from: a */
    public void mo14887a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo14886a();
        }
        if (this.f10546l == null) {
            this.f10546l = VelocityTracker.obtain();
        }
        this.f10546l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View a = mo14885a((int) x, (int) y);
            m14529b(x, y, pointerId);
            mo14896b(a, pointerId);
            int i3 = this.f10542h[pointerId];
            int i4 = this.f10550p;
            if ((i3 & i4) != 0) {
                this.f10552r.mo14910b(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f10535a == 1) {
                m14535d();
            }
            mo14886a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f10535a == 1) {
                    m14523a(0.0f, 0.0f);
                }
                mo14886a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m14529b(x2, y2, pointerId2);
                if (this.f10535a == 0) {
                    mo14896b(mo14885a((int) x2, (int) y2), pointerId2);
                    int i5 = this.f10542h[pointerId2];
                    int i6 = this.f10550p;
                    if ((i5 & i6) != 0) {
                        this.f10552r.mo14910b(i5 & i6, pointerId2);
                    }
                } else if (mo14894b((int) x2, (int) y2)) {
                    mo14896b(this.f10553s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f10535a == 1 && pointerId3 == this.f10537c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f10537c) {
                            View a2 = mo14885a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f10553s;
                            if (a2 == view && mo14896b(view, pointerId4)) {
                                i = this.f10537c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m14535d();
                    }
                }
                m14532c(pointerId3);
            }
        } else if (this.f10535a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m14537e(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f10538d[pointerId5];
                    float f2 = y3 - this.f10539e[pointerId5];
                    m14524a(f, f2, pointerId5);
                    if (this.f10535a != 1) {
                        View a3 = mo14885a((int) x3, (int) y3);
                        if (m14527a(a3, f, f2) && mo14896b(a3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m14533c(motionEvent);
        } else if (m14537e(this.f10537c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f10537c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f10540f;
            int i7 = this.f10537c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f10541g[i7]);
            m14525a(this.f10553s.getLeft() + i8, this.f10553s.getTop() + i9, i8, i9);
            m14533c(motionEvent);
        }
    }

    /* renamed from: b */
    public boolean mo14894b(int i, int i2) {
        return mo14890a(this.f10553s, i, i2);
    }

    /* renamed from: a */
    private void m14524a(float f, float f2, int i) {
        int i2 = 1;
        if (!m14526a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m14526a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m14526a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m14526a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f10543i;
            iArr[i] = iArr[i] | i2;
            this.f10552r.mo14904a(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m14526a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f10542h[i] & i2) != i2 || (this.f10550p & i2) == 0 || (this.f10544j[i] & i2) == i2 || (this.f10543i[i] & i2) == i2)) {
            int i3 = this.f10536b;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f10552r.mo14911b(i2)) {
                    int[] iArr = this.f10544j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f10543i[i] & i2) == 0 && abs > ((float) this.f10536b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m14527a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f10552r.mo14902a(view) > 0;
        boolean z3 = this.f10552r.mo14908b(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f10536b;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f10536b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f10536b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    private void m14525a(int i, int i2, int i3, int i4) {
        int left = this.f10553s.getLeft();
        int top = this.f10553s.getTop();
        if (i3 != 0) {
            i = this.f10552r.mo14903a(this.f10553s, i, i3);
            C4187x.m14383d(this.f10553s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f10552r.mo14909b(this.f10553s, i2, i4);
            C4187x.m14386e(this.f10553s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f10552r.mo14907a(this.f10553s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    public boolean mo14890a(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public View mo14885a(int i, int i2) {
        for (int childCount = this.f10555u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f10555u;
            this.f10552r.mo14901a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
