package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0153q;

/* renamed from: androidx.appcompat.widget.e0 */
/* compiled from: ForwardingListener */
public abstract class C0220e0 implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: U */
    private final int f1018U;

    /* renamed from: V */
    private final int f1019V;

    /* renamed from: W */
    final View f1020W;

    /* renamed from: X */
    private Runnable f1021X;

    /* renamed from: Y */
    private Runnable f1022Y;

    /* renamed from: Z */
    private boolean f1023Z;

    /* renamed from: a0 */
    private int f1024a0;

    /* renamed from: b0 */
    private final int[] f1025b0 = new int[2];

    /* renamed from: c */
    private final float f1026c;

    /* renamed from: androidx.appcompat.widget.e0$a */
    /* compiled from: ForwardingListener */
    private class C0221a implements Runnable {
        C0221a() {
        }

        public void run() {
            ViewParent parent = C0220e0.this.f1020W.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    /* compiled from: ForwardingListener */
    private class C0222b implements Runnable {
        C0222b() {
        }

        public void run() {
            C0220e0.this.mo1572d();
        }
    }

    public C0220e0(View view) {
        this.f1020W = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1026c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1018U = ViewConfiguration.getTapTimeout();
        this.f1019V = (this.f1018U + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m1241a(MotionEvent motionEvent) {
        View view = this.f1020W;
        C0153q a = mo631a();
        if (a != null && a.mo733b()) {
            C0213c0 c0Var = (C0213c0) a.mo739f();
            if (c0Var != null && c0Var.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                m1243a(view, obtainNoHistory);
                m1245b(c0Var, obtainNoHistory);
                boolean a2 = c0Var.mo1536a(obtainNoHistory, this.f1024a0);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z = true;
                boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!a2 || !z2) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1244b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1020W
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1024a0
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1026c
            boolean r6 = m1242a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1246e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1246e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1024a0 = r6
            java.lang.Runnable r6 = r5.f1021X
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.e0$a r6 = new androidx.appcompat.widget.e0$a
            r6.<init>()
            r5.f1021X = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1021X
            int r1 = r5.f1018U
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1022Y
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.f1022Y = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1022Y
            int r1 = r5.f1019V
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0220e0.m1244b(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    private void m1246e() {
        Runnable runnable = this.f1022Y;
        if (runnable != null) {
            this.f1020W.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1021X;
        if (runnable2 != null) {
            this.f1020W.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0153q mo631a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo632b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1534c() {
        C0153q a = mo631a();
        if (a != null && a.mo733b()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1572d() {
        m1246e();
        View view = this.f1020W;
        if (view.isEnabled() && !view.isLongClickable() && mo632b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1023Z = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1023Z;
        if (z2) {
            z = m1241a(motionEvent) || !mo1534c();
        } else {
            z = m1244b(motionEvent) && mo632b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1020W.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1023Z = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1023Z = false;
        this.f1024a0 = -1;
        Runnable runnable = this.f1021X;
        if (runnable != null) {
            this.f1020W.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private static boolean m1242a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m1243a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1025b0;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: b */
    private boolean m1245b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1025b0;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }
}
