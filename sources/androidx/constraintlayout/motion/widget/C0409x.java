package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0436i;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C0500b;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.x */
/* compiled from: TouchResponse */
class C0409x {

    /* renamed from: s */
    private static final float[][] f1716s = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}};

    /* renamed from: t */
    private static final float[][] f1717t = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a */
    private int f1718a = 0;

    /* renamed from: b */
    private int f1719b = 0;

    /* renamed from: c */
    private int f1720c = 0;

    /* renamed from: d */
    private int f1721d = -1;

    /* renamed from: e */
    private int f1722e = -1;

    /* renamed from: f */
    private float f1723f = 0.5f;

    /* renamed from: g */
    private float f1724g = 0.5f;

    /* renamed from: h */
    private float f1725h = 0.0f;

    /* renamed from: i */
    private float f1726i = 1.0f;

    /* renamed from: j */
    private boolean f1727j = false;

    /* renamed from: k */
    private float[] f1728k = new float[2];

    /* renamed from: l */
    private float f1729l;

    /* renamed from: m */
    private float f1730m;

    /* renamed from: n */
    private final MotionLayout f1731n;

    /* renamed from: o */
    private float f1732o = 4.0f;

    /* renamed from: p */
    private float f1733p = 1.2f;

    /* renamed from: q */
    private boolean f1734q = true;

    /* renamed from: r */
    private float f1735r = 1.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.x$a */
    /* compiled from: TouchResponse */
    class C0410a implements OnTouchListener {
        C0410a(C0409x xVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.x$b */
    /* compiled from: TouchResponse */
    class C0411b implements C0500b {
        C0411b(C0409x xVar) {
        }

        /* renamed from: a */
        public void mo358a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    C0409x(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1731n = motionLayout;
        m2222a(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: a */
    private void m2222a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.OnSwipe);
        m2223a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2334b(float f, float f2) {
        float f3;
        float progress = this.f1731n.getProgress();
        if (!this.f1727j) {
            this.f1727j = true;
            this.f1731n.setProgress(progress);
        }
        this.f1731n.mo2136a(this.f1721d, progress, this.f1724g, this.f1723f, this.f1728k);
        float f4 = this.f1725h;
        float[] fArr = this.f1728k;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f1726i * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f1728k;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f1725h;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f1728k[0];
        } else {
            f3 = (f2 * this.f1726i) / this.f1728k[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f1731n.getProgress()) {
            this.f1731n.setProgress(max);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2335c(float f, float f2) {
        float f3;
        boolean z = false;
        this.f1727j = false;
        float progress = this.f1731n.getProgress();
        this.f1731n.mo2136a(this.f1721d, progress, this.f1724g, this.f1723f, this.f1728k);
        float f4 = this.f1725h;
        float[] fArr = this.f1728k;
        float f5 = fArr[0];
        float f6 = this.f1726i;
        float f7 = fArr[1];
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            float f8 = 1.0f;
            boolean z2 = progress != 1.0f;
            if (this.f1720c != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.f1731n;
                int i = this.f1720c;
                if (((double) progress) < 0.5d) {
                    f8 = 0.0f;
                }
                motionLayout.mo2135a(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2338d(float f, float f2) {
        this.f1729l = f;
        this.f1730m = f2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2339e(float f, float f2) {
        this.f1729l = f;
        this.f1730m = f2;
        this.f1727j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1725h);
        sb.append(" , ");
        sb.append(this.f1726i);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2337d() {
        View findViewById = this.f1731n.findViewById(this.f1721d);
        if (findViewById == null) {
            Log.w("TouchResponse", " cannot find view to handle touch");
        }
        if (findViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
            nestedScrollView.setOnTouchListener(new C0410a(this));
            nestedScrollView.setOnScrollChangeListener(new C0411b(this));
        }
    }

    /* renamed from: a */
    private void m2223a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0436i.OnSwipe_touchAnchorId) {
                this.f1721d = typedArray.getResourceId(index, this.f1721d);
            } else if (index == C0436i.OnSwipe_touchAnchorSide) {
                this.f1718a = typedArray.getInt(index, this.f1718a);
                float[][] fArr = f1716s;
                int i2 = this.f1718a;
                this.f1724g = fArr[i2][0];
                this.f1723f = fArr[i2][1];
            } else if (index == C0436i.OnSwipe_dragDirection) {
                this.f1719b = typedArray.getInt(index, this.f1719b);
                float[][] fArr2 = f1717t;
                int i3 = this.f1719b;
                this.f1725h = fArr2[i3][0];
                this.f1726i = fArr2[i3][1];
            } else if (index == C0436i.OnSwipe_maxVelocity) {
                this.f1732o = typedArray.getFloat(index, this.f1732o);
            } else if (index == C0436i.OnSwipe_maxAcceleration) {
                this.f1733p = typedArray.getFloat(index, this.f1733p);
            } else if (index == C0436i.OnSwipe_moveWhenScrollAtTop) {
                this.f1734q = typedArray.getBoolean(index, this.f1734q);
            } else if (index == C0436i.OnSwipe_dragScale) {
                this.f1735r = typedArray.getFloat(index, this.f1735r);
            } else if (index == C0436i.OnSwipe_touchRegionId) {
                this.f1722e = typedArray.getResourceId(index, this.f1722e);
            } else if (index == C0436i.OnSwipe_onTouchUp) {
                this.f1720c = typedArray.getInt(index, this.f1720c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2336c() {
        return this.f1734q;
    }

    /* renamed from: b */
    public float mo2333b() {
        return this.f1732o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2332a(MotionEvent motionEvent, VelocityTracker velocityTracker, int i, C0358s sVar) {
        float f;
        float f2;
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            float f3 = 1.0f;
            if (action == 1) {
                this.f1727j = false;
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                float progress = this.f1731n.getProgress();
                int i2 = this.f1721d;
                if (i2 != -1) {
                    this.f1731n.mo2136a(i2, progress, this.f1724g, this.f1723f, this.f1728k);
                } else {
                    float min = (float) Math.min(this.f1731n.getWidth(), this.f1731n.getHeight());
                    float[] fArr = this.f1728k;
                    fArr[0] = min;
                    fArr[1] = min;
                }
                float f4 = this.f1725h;
                float[] fArr2 = this.f1728k;
                float f5 = fArr2[0];
                float f6 = fArr2[1];
                if (f4 != 0.0f) {
                    f = xVelocity / fArr2[0];
                } else {
                    f = yVelocity / fArr2[1];
                }
                if (!Float.isNaN(f)) {
                    progress += f / 3.0f;
                }
                if (progress != 0.0f && progress != 1.0f) {
                    int i3 = this.f1720c;
                    if (i3 != 3) {
                        MotionLayout motionLayout = this.f1731n;
                        if (((double) progress) < 0.5d) {
                            f3 = 0.0f;
                        }
                        motionLayout.mo2135a(i3, f3, f);
                    }
                }
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f1730m;
                float rawX = motionEvent.getRawX() - this.f1729l;
                if (Math.abs((this.f1725h * rawX) + (this.f1726i * rawY)) > 10.0f || this.f1727j) {
                    float progress2 = this.f1731n.getProgress();
                    if (!this.f1727j) {
                        this.f1727j = true;
                        this.f1731n.setProgress(progress2);
                    }
                    int i4 = this.f1721d;
                    if (i4 != -1) {
                        this.f1731n.mo2136a(i4, progress2, this.f1724g, this.f1723f, this.f1728k);
                    } else {
                        float min2 = (float) Math.min(this.f1731n.getWidth(), this.f1731n.getHeight());
                        float[] fArr3 = this.f1728k;
                        fArr3[0] = min2;
                        fArr3[1] = min2;
                    }
                    float f7 = this.f1725h;
                    float[] fArr4 = this.f1728k;
                    if (((double) Math.abs(((f7 * fArr4[0]) + (this.f1726i * fArr4[1])) * this.f1735r)) < 0.01d) {
                        float[] fArr5 = this.f1728k;
                        fArr5[0] = 0.01f;
                        fArr5[1] = 0.01f;
                    }
                    if (this.f1725h != 0.0f) {
                        f2 = rawX / this.f1728k[0];
                    } else {
                        f2 = rawY / this.f1728k[1];
                    }
                    float max = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                    if (max != this.f1731n.getProgress()) {
                        this.f1731n.setProgress(max);
                    }
                    this.f1729l = motionEvent.getRawX();
                    this.f1730m = motionEvent.getRawY();
                }
            }
        } else {
            this.f1729l = motionEvent.getRawX();
            this.f1730m = motionEvent.getRawY();
            this.f1727j = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo2329a() {
        return this.f1733p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public RectF mo2331a(ViewGroup viewGroup, RectF rectF) {
        int i = this.f1722e;
        if (i == -1) {
            return null;
        }
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo2330a(float f, float f2) {
        return (f * this.f1725h) + (f2 * this.f1726i);
    }
}
