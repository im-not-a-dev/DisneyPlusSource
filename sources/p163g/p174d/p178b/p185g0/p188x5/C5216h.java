package p163g.p174d.p178b.p185g0.p188x5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import p096e.p121h.p135s.C4130d;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5324u;
import p163g.p174d.p178b.p185g0.C5271z3;
import p163g.p494k.p495a.p497b.C11692a;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.x5.h */
/* compiled from: PlayerTouchedDelegate */
public class C5216h implements C5271z3, OnGestureListener, OnDoubleTapListener, OnTouchListener, OnClickListener, OnScaleGestureListener {

    /* renamed from: U */
    private final int f12550U;

    /* renamed from: V */
    private final C5300m f12551V;

    /* renamed from: W */
    private final Rect f12552W = new Rect();

    /* renamed from: X */
    private final Rect f12553X = new Rect();

    /* renamed from: Y */
    private final Rect f12554Y = new Rect();

    /* renamed from: Z */
    private final Rect f12555Z = new Rect();

    /* renamed from: a0 */
    C5210g f12556a0;

    /* renamed from: b0 */
    private int f12557b0;

    /* renamed from: c */
    private final double f12558c;

    /* renamed from: c0 */
    private int f12559c0;

    /* renamed from: d0 */
    private View f12560d0;

    /* renamed from: e0 */
    C5324u f12561e0;

    /* renamed from: f0 */
    boolean f12562f0;

    /* renamed from: g0 */
    C4130d f12563g0;

    /* renamed from: h0 */
    ScaleGestureDetector f12564h0;

    /* renamed from: i0 */
    float f12565i0 = 1.0f;

    /* renamed from: j0 */
    BroadcastReceiver f12566j0 = new C5217a();

    /* renamed from: g.d.b.g0.x5.h$a */
    /* compiled from: PlayerTouchedDelegate */
    class C5217a extends BroadcastReceiver {
        C5217a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("command");
            String str = "value";
            if ("aspectRatio".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.setAspectRatio(intent.getFloatExtra(str, 1.0f));
            } else if ("resizeMode".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.setResizeMode(intent.getIntExtra(str, 0));
            } else if ("scale".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.setScale(intent.getFloatExtra(str, 1.0f));
            } else if ("zoomIn".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.mo7556a();
            } else if ("zoomOut".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.mo7558b();
            } else if ("activeAspectRatio".equalsIgnoreCase(stringExtra)) {
                C5216h.this.f12561e0.setActiveAspectRatio(intent.getFloatExtra(str, 1.77f));
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public C5216h(View view, boolean z, int i, float f, C5300m mVar) {
        this.f12551V = mVar;
        this.f12550U = i;
        this.f12558c = (double) f;
        this.f12556a0 = new C5210g(this);
        if (view != null) {
            this.f12560d0 = view;
            if (view instanceof C5324u) {
                this.f12561e0 = (C5324u) view;
            }
            if (z) {
                m17554a(view);
                m17553a(view.getContext());
            } else {
                m17558b(view);
            }
            mVar.mo17069t0().mo30192f((Consumer<? super T>) new C5205b<Object>(this));
            mVar.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5206c<Object>(this));
            mVar.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C5207d<Object>(this));
            mVar.mo16955L().mo30192f((Consumer<? super T>) new C5209f<Object>(this));
            mVar.mo16957M().mo30192f((Consumer<? super T>) new C5204a<Object>(this));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo16713a(Object obj) throws Exception {
        this.f12556a0.mo16703b();
    }

    /* renamed from: b */
    public /* synthetic */ void mo16714b(Object obj) throws Exception {
        this.f12556a0.mo16701a();
    }

    /* renamed from: c */
    public void mo16715c(Object obj) {
        this.f12560d0.getContext().registerReceiver(this.f12566j0, new IntentFilter(C5216h.class.getName()));
    }

    /* renamed from: d */
    public void mo16716d(Object obj) {
        this.f12560d0.getContext().unregisterReceiver(this.f12566j0);
    }

    public void onClick(View view) {
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f12556a0.mo16702a(motionEvent);
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f12565i0 *= this.f12564h0.getScaleFactor();
        C5324u uVar = this.f12561e0;
        if (uVar != null) {
            float f = this.f12565i0;
            if (f <= 0.9f) {
                uVar.mo7558b();
            } else if (f >= 1.1f) {
                uVar.mo7556a();
            }
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f12556a0.mo16705c();
        this.f12565i0 = 1.0f;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f12556a0.mo16706d();
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f12556a0.mo16704b(motionEvent);
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f12563g0.mo14699a(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.f12564h0;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    private void m17554a(View view) {
        view.setOnTouchListener(this);
        this.f12563g0 = new C4130d(view.getContext(), this);
        this.f12563g0.mo14698a((OnDoubleTapListener) this);
    }

    /* renamed from: b */
    private void m17558b(View view) {
        Observable i = C11692a.m37643a(view).mo30197i();
        C5300m mVar = this.f12551V;
        mVar.getClass();
        this.f12551V.mo17030f().mo16909j(i.mo30188e((Consumer<? super Disposable>) new C5208e<Object>(mVar)));
    }

    /* renamed from: b */
    private void m17557b() {
        int width = this.f12560d0.getWidth();
        int height = this.f12560d0.getHeight();
        if (width != this.f12557b0 || height != this.f12559c0) {
            this.f12557b0 = width;
            this.f12559c0 = height;
            double d = (double) width;
            double d2 = this.f12558c;
            int i = (int) (d * d2);
            int i2 = (int) (((double) height) * d2);
            this.f12552W.set(i, i2, width - i, height - i2);
            int width2 = this.f12552W.width() / 3;
            Rect rect = this.f12553X;
            Rect rect2 = this.f12552W;
            rect.set(rect2.left, rect2.top, width2, rect2.bottom);
            this.f12555Z.set(this.f12553X);
            this.f12555Z.offset(width2, 0);
            this.f12554Y.set(this.f12555Z);
            this.f12554Y.offset(width2, 0);
        }
    }

    /* renamed from: a */
    private void m17553a(Context context) {
        this.f12564h0 = new ScaleGestureDetector(context, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17556a(boolean z) {
        this.f12562f0 = z;
    }

    /* renamed from: a */
    public void mo16711a() {
        this.f12551V.mo17030f().mo16916n();
    }

    /* renamed from: a */
    public void mo16712a(MotionEvent motionEvent) {
        m17557b();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f12562f0 || this.f12555Z.contains(x, y)) {
            mo16711a();
        } else if (this.f12553X.contains(x, y)) {
            this.f12551V.mo17004b(-this.f12550U);
        } else if (this.f12554Y.contains(x, y)) {
            this.f12551V.mo17004b(this.f12550U);
        }
    }
}
