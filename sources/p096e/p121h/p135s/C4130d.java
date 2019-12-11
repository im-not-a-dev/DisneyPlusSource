package p096e.p121h.p135s;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: e.h.s.d */
/* compiled from: GestureDetectorCompat */
public final class C4130d {

    /* renamed from: a */
    private final C4131a f10404a;

    /* renamed from: e.h.s.d$a */
    /* compiled from: GestureDetectorCompat */
    interface C4131a {
        /* renamed from: a */
        void mo14700a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        boolean mo14701a(MotionEvent motionEvent);
    }

    /* renamed from: e.h.s.d$b */
    /* compiled from: GestureDetectorCompat */
    static class C4132b implements C4131a {

        /* renamed from: v */
        private static final int f10405v = ViewConfiguration.getLongPressTimeout();

        /* renamed from: w */
        private static final int f10406w = ViewConfiguration.getTapTimeout();

        /* renamed from: x */
        private static final int f10407x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f10408a;

        /* renamed from: b */
        private int f10409b;

        /* renamed from: c */
        private int f10410c;

        /* renamed from: d */
        private int f10411d;

        /* renamed from: e */
        private final Handler f10412e;

        /* renamed from: f */
        final OnGestureListener f10413f;

        /* renamed from: g */
        OnDoubleTapListener f10414g;

        /* renamed from: h */
        boolean f10415h;

        /* renamed from: i */
        boolean f10416i;

        /* renamed from: j */
        private boolean f10417j;

        /* renamed from: k */
        private boolean f10418k;

        /* renamed from: l */
        private boolean f10419l;

        /* renamed from: m */
        MotionEvent f10420m;

        /* renamed from: n */
        private MotionEvent f10421n;

        /* renamed from: o */
        private boolean f10422o;

        /* renamed from: p */
        private float f10423p;

        /* renamed from: q */
        private float f10424q;

        /* renamed from: r */
        private float f10425r;

        /* renamed from: s */
        private float f10426s;

        /* renamed from: t */
        private boolean f10427t;

        /* renamed from: u */
        private VelocityTracker f10428u;

        /* renamed from: e.h.s.d$b$a */
        /* compiled from: GestureDetectorCompat */
        private class C4133a extends Handler {
            C4133a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C4132b bVar = C4132b.this;
                    bVar.f10413f.onShowPress(bVar.f10420m);
                } else if (i == 2) {
                    C4132b.this.mo14702a();
                } else if (i == 3) {
                    C4132b bVar2 = C4132b.this;
                    OnDoubleTapListener onDoubleTapListener = bVar2.f10414g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f10415h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f10420m);
                    } else {
                        bVar2.f10416i = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown message ");
                    sb.append(message);
                    throw new RuntimeException(sb.toString());
                }
            }

            C4133a(Handler handler) {
                super(handler.getLooper());
            }
        }

        C4132b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f10412e = new C4133a(handler);
            } else {
                this.f10412e = new C4133a();
            }
            this.f10413f = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo14700a((OnDoubleTapListener) onGestureListener);
            }
            m14149a(context);
        }

        /* renamed from: a */
        private void m14149a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f10413f != null) {
                this.f10427t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f10410c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f10411d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f10408a = scaledTouchSlop * scaledTouchSlop;
                this.f10409b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: b */
        private void m14151b() {
            this.f10412e.removeMessages(1);
            this.f10412e.removeMessages(2);
            this.f10412e.removeMessages(3);
            this.f10428u.recycle();
            this.f10428u = null;
            this.f10422o = false;
            this.f10415h = false;
            this.f10418k = false;
            this.f10419l = false;
            this.f10416i = false;
            if (this.f10417j) {
                this.f10417j = false;
            }
        }

        /* renamed from: c */
        private void m14152c() {
            this.f10412e.removeMessages(1);
            this.f10412e.removeMessages(2);
            this.f10412e.removeMessages(3);
            this.f10422o = false;
            this.f10418k = false;
            this.f10419l = false;
            this.f10416i = false;
            if (this.f10417j) {
                this.f10417j = false;
            }
        }

        /* renamed from: a */
        public void mo14700a(OnDoubleTapListener onDoubleTapListener) {
            this.f10414g = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14701a(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f10428u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f10428u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f10428u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x024e
            L_0x005b:
                r12.f10423p = r9
                r12.f10425r = r9
                r12.f10424q = r10
                r12.f10426s = r10
                android.view.VelocityTracker r0 = r12.f10428u
                int r1 = r12.f10411d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f10428u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f10428u
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x024e
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f10428u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f10428u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f10428u
                r13.clear()
                goto L_0x024e
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f10423p = r9
                r12.f10425r = r9
                r12.f10424q = r10
                r12.f10426s = r10
                r12.m14152c()
                goto L_0x024e
            L_0x00b5:
                r12.m14151b()
                goto L_0x024e
            L_0x00ba:
                boolean r0 = r12.f10417j
                if (r0 == 0) goto L_0x00c0
                goto L_0x024e
            L_0x00c0:
                float r0 = r12.f10423p
                float r0 = r0 - r9
                float r1 = r12.f10424q
                float r1 = r1 - r10
                boolean r6 = r12.f10422o
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f10414g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024e
            L_0x00d3:
                boolean r6 = r12.f10418k
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f10425r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f10426s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f10408a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f10413f
                android.view.MotionEvent r8 = r12.f10420m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f10423p = r9
                r12.f10424q = r10
                r12.f10418k = r3
                android.os.Handler r0 = r12.f10412e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f10412e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f10412e
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f10408a
                if (r6 <= r0) goto L_0x01bc
                r12.f10419l = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024e
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f10413f
                android.view.MotionEvent r3 = r12.f10420m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f10423p = r9
                r12.f10424q = r10
                goto L_0x024e
            L_0x0131:
                r12.f10415h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f10422o
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f10414g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f10417j
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f10412e
                r13.removeMessages(r5)
                r12.f10417j = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f10418k
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f10413f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f10416i
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f10414g
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f10428u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f10411d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f10410c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f10410c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f10413f
                android.view.MotionEvent r7 = r12.f10420m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f10421n
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f10421n = r0
                android.view.VelocityTracker r0 = r12.f10428u
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f10428u = r0
            L_0x01ae:
                r12.f10422o = r3
                r12.f10416i = r3
                android.os.Handler r0 = r12.f10412e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f10412e
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x024e
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f10414g
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f10412e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f10412e
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f10420m
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f10421n
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.m14150a(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f10422o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f10414g
                android.view.MotionEvent r1 = r12.f10420m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f10414g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f10412e
                int r1 = f10407x
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f10423p = r9
                r12.f10425r = r9
                r12.f10424q = r10
                r12.f10426s = r10
                android.view.MotionEvent r1 = r12.f10420m
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f10420m = r1
                r12.f10418k = r2
                r12.f10419l = r2
                r12.f10415h = r2
                r12.f10417j = r3
                r12.f10416i = r3
                boolean r1 = r12.f10427t
                if (r1 == 0) goto L_0x0237
                android.os.Handler r1 = r12.f10412e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f10412e
                android.view.MotionEvent r3 = r12.f10420m
                long r5 = r3.getDownTime()
                int r3 = f10406w
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f10405v
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0237:
                android.os.Handler r1 = r12.f10412e
                android.view.MotionEvent r3 = r12.f10420m
                long r3 = r3.getDownTime()
                int r5 = f10406w
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f10413f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p135s.C4130d.C4132b.mo14701a(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        private boolean m14150a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f10419l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f10407x)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f10409b) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo14702a() {
            this.f10412e.removeMessages(3);
            this.f10416i = false;
            this.f10417j = true;
            this.f10413f.onLongPress(this.f10420m);
        }
    }

    /* renamed from: e.h.s.d$c */
    /* compiled from: GestureDetectorCompat */
    static class C4134c implements C4131a {

        /* renamed from: a */
        private final GestureDetector f10430a;

        C4134c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f10430a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo14701a(MotionEvent motionEvent) {
            return this.f10430a.onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo14700a(OnDoubleTapListener onDoubleTapListener) {
            this.f10430a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public C4130d(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean mo14699a(MotionEvent motionEvent) {
        return this.f10404a.mo14701a(motionEvent);
    }

    public C4130d(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f10404a = new C4134c(context, onGestureListener, handler);
        } else {
            this.f10404a = new C4132b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public void mo14698a(OnDoubleTapListener onDoubleTapListener) {
        this.f10404a.mo14700a(onDoubleTapListener);
    }
}
