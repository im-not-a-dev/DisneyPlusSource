package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.C4196y;

/* renamed from: androidx.appcompat.widget.w0 */
/* compiled from: TooltipCompatHandler */
class C0294w0 implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: c0 */
    private static C0294w0 f1288c0;

    /* renamed from: d0 */
    private static C0294w0 f1289d0;

    /* renamed from: U */
    private final CharSequence f1290U;

    /* renamed from: V */
    private final int f1291V;

    /* renamed from: W */
    private final Runnable f1292W = new C0295a();

    /* renamed from: X */
    private final Runnable f1293X = new C0296b();

    /* renamed from: Y */
    private int f1294Y;

    /* renamed from: Z */
    private int f1295Z;

    /* renamed from: a0 */
    private C0298x0 f1296a0;

    /* renamed from: b0 */
    private boolean f1297b0;

    /* renamed from: c */
    private final View f1298c;

    /* renamed from: androidx.appcompat.widget.w0$a */
    /* compiled from: TooltipCompatHandler */
    class C0295a implements Runnable {
        C0295a() {
        }

        public void run() {
            C0294w0.this.mo2000a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    /* compiled from: TooltipCompatHandler */
    class C0296b implements Runnable {
        C0296b() {
        }

        public void run() {
            C0294w0.this.mo1999a();
        }
    }

    private C0294w0(View view, CharSequence charSequence) {
        this.f1298c = view;
        this.f1290U = charSequence;
        this.f1291V = C4196y.m14433a(ViewConfiguration.get(this.f1298c.getContext()));
        m1582c();
        this.f1298c.setOnLongClickListener(this);
        this.f1298c.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1578a(View view, CharSequence charSequence) {
        C0294w0 w0Var = f1288c0;
        if (w0Var != null && w0Var.f1298c == view) {
            m1579a((C0294w0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0294w0 w0Var2 = f1289d0;
            if (w0Var2 != null && w0Var2.f1298c == view) {
                w0Var2.mo1999a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0294w0(view, charSequence);
    }

    /* renamed from: b */
    private void m1581b() {
        this.f1298c.removeCallbacks(this.f1292W);
    }

    /* renamed from: c */
    private void m1582c() {
        this.f1294Y = Integer.MAX_VALUE;
        this.f1295Z = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1583d() {
        this.f1298c.postDelayed(this.f1292W, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1296a0 != null && this.f1297b0) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1298c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1582c();
                mo1999a();
            }
        } else if (this.f1298c.isEnabled() && this.f1296a0 == null && m1580a(motionEvent)) {
            m1579a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1294Y = view.getWidth() / 2;
        this.f1295Z = view.getHeight() / 2;
        mo2000a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1999a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2000a(boolean z) {
        long j;
        int i;
        long j2;
        if (C4187x.m14339D(this.f1298c)) {
            m1579a((C0294w0) null);
            C0294w0 w0Var = f1289d0;
            if (w0Var != null) {
                w0Var.mo1999a();
            }
            f1289d0 = this;
            this.f1297b0 = z;
            this.f1296a0 = new C0298x0(this.f1298c.getContext());
            this.f1296a0.mo2022a(this.f1298c, this.f1294Y, this.f1295Z, this.f1297b0, this.f1290U);
            this.f1298c.addOnAttachStateChangeListener(this);
            if (this.f1297b0) {
                j = 2500;
            } else {
                if ((C4187x.m14408w(this.f1298c) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1298c.removeCallbacks(this.f1293X);
            this.f1298c.postDelayed(this.f1293X, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1999a() {
        if (f1289d0 == this) {
            f1289d0 = null;
            C0298x0 x0Var = this.f1296a0;
            if (x0Var != null) {
                x0Var.mo2021a();
                this.f1296a0 = null;
                m1582c();
                this.f1298c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1288c0 == this) {
            m1579a((C0294w0) null);
        }
        this.f1298c.removeCallbacks(this.f1293X);
    }

    /* renamed from: a */
    private static void m1579a(C0294w0 w0Var) {
        C0294w0 w0Var2 = f1288c0;
        if (w0Var2 != null) {
            w0Var2.m1581b();
        }
        f1288c0 = w0Var;
        C0294w0 w0Var3 = f1288c0;
        if (w0Var3 != null) {
            w0Var3.m1583d();
        }
    }

    /* renamed from: a */
    private boolean m1580a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1294Y) <= this.f1291V && Math.abs(y - this.f1295Z) <= this.f1291V) {
            return false;
        }
        this.f1294Y = x;
        this.f1295Z = y;
        return true;
    }
}
