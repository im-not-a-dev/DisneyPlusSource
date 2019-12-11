package com.google.android.exoplayer2.p391ui.p392r;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.exoplayer2.p391ui.p392r.C9424d.C9425a;

/* renamed from: com.google.android.exoplayer2.ui.r.i */
/* compiled from: TouchTracker */
class C9432i extends SimpleOnGestureListener implements OnTouchListener, C9425a {

    /* renamed from: U */
    private final PointF f21931U = new PointF();

    /* renamed from: V */
    private final C9433a f21932V;

    /* renamed from: W */
    private final float f21933W;

    /* renamed from: X */
    private final GestureDetector f21934X;

    /* renamed from: Y */
    private volatile float f21935Y;

    /* renamed from: Z */
    private C9429g f21936Z;

    /* renamed from: c */
    private final PointF f21937c = new PointF();

    /* renamed from: com.google.android.exoplayer2.ui.r.i$a */
    /* compiled from: TouchTracker */
    interface C9433a {
        /* renamed from: a */
        void mo24435a(PointF pointF);
    }

    public C9432i(Context context, C9433a aVar, float f) {
        this.f21932V = aVar;
        this.f21933W = f;
        this.f21934X = new GestureDetector(context, this);
        this.f21935Y = 3.1415927f;
    }

    /* renamed from: a */
    public void mo24439a(C9429g gVar) {
        this.f21936Z = gVar;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f21937c.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f21937c.x) / this.f21933W;
        float y = motionEvent2.getY();
        PointF pointF = this.f21937c;
        float f3 = (y - pointF.y) / this.f21933W;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f21935Y;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f21931U;
        pointF2.x -= (cos * x) - (sin * f3);
        pointF2.y += (sin * x) + (cos * f3);
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, pointF2.y));
        this.f21932V.mo24435a(this.f21931U);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C9429g gVar = this.f21936Z;
        if (gVar != null) {
            return gVar.onSingleTapUp(motionEvent);
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f21934X.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo24416a(float[] fArr, float f) {
        this.f21935Y = -f;
    }
}
