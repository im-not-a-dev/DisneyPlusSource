package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import androidx.recyclerview.widget.RecyclerView.C0816s;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import com.facebook.stetho.server.http.HttpStatus;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: FastScroller */
class C0863g extends C0807n implements C0816s {

    /* renamed from: D */
    private static final int[] f3502D = {16842919};

    /* renamed from: E */
    private static final int[] f3503E = new int[0];

    /* renamed from: A */
    int f3504A = 0;

    /* renamed from: B */
    private final Runnable f3505B = new C0864a();

    /* renamed from: C */
    private final C0817t f3506C = new C0865b();

    /* renamed from: a */
    private final int f3507a;

    /* renamed from: b */
    private final int f3508b;

    /* renamed from: c */
    final StateListDrawable f3509c;

    /* renamed from: d */
    final Drawable f3510d;

    /* renamed from: e */
    private final int f3511e;

    /* renamed from: f */
    private final int f3512f;

    /* renamed from: g */
    private final StateListDrawable f3513g;

    /* renamed from: h */
    private final Drawable f3514h;

    /* renamed from: i */
    private final int f3515i;

    /* renamed from: j */
    private final int f3516j;

    /* renamed from: k */
    int f3517k;

    /* renamed from: l */
    int f3518l;

    /* renamed from: m */
    float f3519m;

    /* renamed from: n */
    int f3520n;

    /* renamed from: o */
    int f3521o;

    /* renamed from: p */
    float f3522p;

    /* renamed from: q */
    private int f3523q = 0;

    /* renamed from: r */
    private int f3524r = 0;

    /* renamed from: s */
    private RecyclerView f3525s;

    /* renamed from: t */
    private boolean f3526t = false;

    /* renamed from: u */
    private boolean f3527u = false;

    /* renamed from: v */
    private int f3528v = 0;

    /* renamed from: w */
    private int f3529w = 0;

    /* renamed from: x */
    private final int[] f3530x = new int[2];

    /* renamed from: y */
    private final int[] f3531y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3532z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: FastScroller */
    class C0864a implements Runnable {
        C0864a() {
        }

        public void run() {
            C0863g.this.mo5015a((int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* compiled from: FastScroller */
    class C0865b extends C0817t {
        C0865b() {
        }

        /* renamed from: a */
        public void mo4784a(RecyclerView recyclerView, int i, int i2) {
            C0863g.this.mo5016a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* compiled from: FastScroller */
    private class C0866c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3535a = false;

        C0866c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3535a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3535a) {
                this.f3535a = false;
                return;
            }
            if (((Float) C0863g.this.f3532z.getAnimatedValue()).floatValue() == 0.0f) {
                C0863g gVar = C0863g.this;
                gVar.f3504A = 0;
                gVar.mo5020b(0);
            } else {
                C0863g gVar2 = C0863g.this;
                gVar2.f3504A = 2;
                gVar2.mo5014a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* compiled from: FastScroller */
    private class C0867d implements AnimatorUpdateListener {
        C0867d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0863g.this.f3509c.setAlpha(floatValue);
            C0863g.this.f3510d.setAlpha(floatValue);
            C0863g.this.mo5014a();
        }
    }

    C0863g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3509c = stateListDrawable;
        this.f3510d = drawable;
        this.f3513g = stateListDrawable2;
        this.f3514h = drawable2;
        this.f3511e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3512f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3515i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3516j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3507a = i2;
        this.f3508b = i3;
        this.f3509c.setAlpha(255);
        this.f3510d.setAlpha(255);
        this.f3532z.addListener(new C0866c());
        this.f3532z.addUpdateListener(new C0867d());
        mo5017a(recyclerView);
    }

    /* renamed from: c */
    private void m4820c() {
        this.f3525s.removeCallbacks(this.f3505B);
    }

    /* renamed from: d */
    private void m4822d() {
        this.f3525s.mo4401b((C0807n) this);
        this.f3525s.mo4403b((C0816s) this);
        this.f3525s.mo4404b(this.f3506C);
        m4820c();
    }

    /* renamed from: e */
    private int[] m4823e() {
        int[] iArr = this.f3531y;
        int i = this.f3508b;
        iArr[0] = i;
        iArr[1] = this.f3523q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m4824f() {
        int[] iArr = this.f3530x;
        int i = this.f3508b;
        iArr[0] = i;
        iArr[1] = this.f3524r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m4825g() {
        return C4187x.m14399n(this.f3525s) == 1;
    }

    /* renamed from: h */
    private void m4826h() {
        this.f3525s.mo4381a((C0807n) this);
        this.f3525s.mo4384a((C0816s) this);
        this.f3525s.mo4385a(this.f3506C);
    }

    /* renamed from: a */
    public void mo5017a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3525s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4822d();
            }
            this.f3525s = recyclerView;
            if (this.f3525s != null) {
                m4826h();
            }
        }
    }

    /* renamed from: a */
    public void mo4781a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5020b(int i) {
        if (i == 2 && this.f3528v != 2) {
            this.f3509c.setState(f3502D);
            m4820c();
        }
        if (i == 0) {
            mo5014a();
        } else {
            mo5019b();
        }
        if (this.f3528v == 2 && i != 2) {
            this.f3509c.setState(f3503E);
            m4821c(1200);
        } else if (i == 1) {
            m4821c(1500);
        }
        this.f3528v = i;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
        if (this.f3523q == this.f3525s.getWidth() && this.f3524r == this.f3525s.getHeight()) {
            if (this.f3504A != 0) {
                if (this.f3526t) {
                    m4819b(canvas);
                }
                if (this.f3527u) {
                    m4817a(canvas);
                }
            }
            return;
        }
        this.f3523q = this.f3525s.getWidth();
        this.f3524r = this.f3525s.getHeight();
        mo5020b(0);
    }

    /* renamed from: c */
    private void m4821c(int i) {
        m4820c();
        this.f3525s.postDelayed(this.f3505B, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5014a() {
        this.f3525s.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5015a(int i) {
        int i2 = this.f3504A;
        if (i2 == 1) {
            this.f3532z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3504A = 3;
        ValueAnimator valueAnimator = this.f3532z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3532z.setDuration((long) i);
        this.f3532z.start();
    }

    /* renamed from: b */
    public void mo5019b() {
        int i = this.f3504A;
        if (i != 0) {
            if (i == 3) {
                this.f3532z.cancel();
            } else {
                return;
            }
        }
        this.f3504A = 1;
        ValueAnimator valueAnimator = this.f3532z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3532z.setDuration(500);
        this.f3532z.setStartDelay(0);
        this.f3532z.start();
    }

    /* renamed from: a */
    private void m4817a(Canvas canvas) {
        int i = this.f3524r;
        int i2 = this.f3515i;
        int i3 = i - i2;
        int i4 = this.f3521o;
        int i5 = this.f3520n;
        int i6 = i4 - (i5 / 2);
        this.f3513g.setBounds(0, 0, i5, i2);
        this.f3514h.setBounds(0, 0, this.f3523q, this.f3516j);
        canvas.translate(0.0f, (float) i3);
        this.f3514h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3513g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m4819b(Canvas canvas) {
        int i = this.f3523q;
        int i2 = this.f3511e;
        int i3 = i - i2;
        int i4 = this.f3518l;
        int i5 = this.f3517k;
        int i6 = i4 - (i5 / 2);
        this.f3509c.setBounds(0, 0, i2, i5);
        this.f3510d.setBounds(0, 0, this.f3512f, this.f3524r);
        if (m4825g()) {
            this.f3510d.draw(canvas);
            canvas.translate((float) this.f3511e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3509c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f3511e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f3510d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f3509c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5016a(int i, int i2) {
        int computeVerticalScrollRange = this.f3525s.computeVerticalScrollRange();
        int i3 = this.f3524r;
        this.f3526t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3507a;
        int computeHorizontalScrollRange = this.f3525s.computeHorizontalScrollRange();
        int i4 = this.f3523q;
        this.f3527u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3507a;
        if (this.f3526t || this.f3527u) {
            if (this.f3526t) {
                float f = (float) i3;
                this.f3518l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3517k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3527u) {
                float f2 = (float) i4;
                this.f3521o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3520n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3528v;
            if (i5 == 0 || i5 == 1) {
                mo5020b(1);
            }
            return;
        }
        if (this.f3528v != 0) {
            mo5020b(0);
        }
    }

    /* renamed from: b */
    public boolean mo4782b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3528v;
        if (i == 1) {
            boolean b = mo5021b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo5018a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f3529w = 1;
                this.f3522p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f3529w = 2;
                this.f3519m = (float) ((int) motionEvent.getY());
            }
            mo5020b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo4780a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3528v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo5021b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo5018a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f3529w = 1;
                        this.f3522p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f3529w = 2;
                        this.f3519m = (float) ((int) motionEvent.getY());
                    }
                    mo5020b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3528v == 2) {
                this.f3519m = 0.0f;
                this.f3522p = 0.0f;
                mo5020b(1);
                this.f3529w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3528v == 2) {
                mo5019b();
                if (this.f3529w == 1) {
                    m4816a(motionEvent.getX());
                }
                if (this.f3529w == 2) {
                    m4818b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    private void m4818b(float f) {
        int[] f2 = m4824f();
        float max = Math.max((float) f2[0], Math.min((float) f2[1], f));
        if (Math.abs(((float) this.f3518l) - max) >= 2.0f) {
            int a = m4815a(this.f3519m, max, f2, this.f3525s.computeVerticalScrollRange(), this.f3525s.computeVerticalScrollOffset(), this.f3524r);
            if (a != 0) {
                this.f3525s.scrollBy(0, a);
            }
            this.f3519m = max;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5021b(float f, float f2) {
        if (!m4825g() ? f >= ((float) (this.f3523q - this.f3511e)) : f <= ((float) (this.f3511e / 2))) {
            int i = this.f3518l;
            int i2 = this.f3517k;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m4816a(float f) {
        int[] e = m4823e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f3521o) - max) >= 2.0f) {
            int a = m4815a(this.f3522p, max, e, this.f3525s.computeHorizontalScrollRange(), this.f3525s.computeHorizontalScrollOffset(), this.f3523q);
            if (a != 0) {
                this.f3525s.scrollBy(a, 0);
            }
            this.f3522p = max;
        }
    }

    /* renamed from: a */
    private int m4815a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5018a(float f, float f2) {
        if (f2 >= ((float) (this.f3524r - this.f3515i))) {
            int i = this.f3521o;
            int i2 = this.f3520n;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }
}
