package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0800j;
import androidx.recyclerview.widget.RecyclerView.C0802l;
import androidx.recyclerview.widget.RecyclerView.C0802l.C0803a;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0814q;
import androidx.recyclerview.widget.RecyclerView.C0816s;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p135s.C4130d;
import p096e.p121h.p135s.C4187x;
import p096e.p153o.C4258a;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: ItemTouchHelper */
public class C0872i extends C0807n implements C0814q {

    /* renamed from: A */
    private C0881g f3553A;

    /* renamed from: B */
    private final C0816s f3554B = new C0874b();

    /* renamed from: C */
    private Rect f3555C;

    /* renamed from: D */
    private long f3556D;

    /* renamed from: a */
    final List<View> f3557a = new ArrayList();

    /* renamed from: b */
    private final float[] f3558b = new float[2];

    /* renamed from: c */
    C0794d0 f3559c = null;

    /* renamed from: d */
    float f3560d;

    /* renamed from: e */
    float f3561e;

    /* renamed from: f */
    private float f3562f;

    /* renamed from: g */
    private float f3563g;

    /* renamed from: h */
    float f3564h;

    /* renamed from: i */
    float f3565i;

    /* renamed from: j */
    private float f3566j;

    /* renamed from: k */
    private float f3567k;

    /* renamed from: l */
    int f3568l = -1;

    /* renamed from: m */
    C0878f f3569m;

    /* renamed from: n */
    private int f3570n = 0;

    /* renamed from: o */
    int f3571o;

    /* renamed from: p */
    List<C0882h> f3572p = new ArrayList();

    /* renamed from: q */
    private int f3573q;

    /* renamed from: r */
    RecyclerView f3574r;

    /* renamed from: s */
    final Runnable f3575s = new C0873a();

    /* renamed from: t */
    VelocityTracker f3576t;

    /* renamed from: u */
    private List<C0794d0> f3577u;

    /* renamed from: v */
    private List<Integer> f3578v;

    /* renamed from: w */
    private C0800j f3579w = null;

    /* renamed from: x */
    View f3580x = null;

    /* renamed from: y */
    int f3581y = -1;

    /* renamed from: z */
    C4130d f3582z;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: ItemTouchHelper */
    class C0873a implements Runnable {
        C0873a() {
        }

        public void run() {
            C0872i iVar = C0872i.this;
            if (iVar.f3559c != null && iVar.mo5050c()) {
                C0872i iVar2 = C0872i.this;
                C0794d0 d0Var = iVar2.f3559c;
                if (d0Var != null) {
                    iVar2.mo5041a(d0Var);
                }
                C0872i iVar3 = C0872i.this;
                iVar3.f3574r.removeCallbacks(iVar3.f3575s);
                C4187x.m14363a((View) C0872i.this.f3574r, (Runnable) this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* compiled from: ItemTouchHelper */
    class C0874b implements C0816s {
        C0874b() {
        }

        /* renamed from: a */
        public void mo4780a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C0872i.this.f3582z.mo14699a(motionEvent);
            VelocityTracker velocityTracker = C0872i.this.f3576t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0872i.this.f3568l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C0872i.this.f3568l);
                if (findPointerIndex >= 0) {
                    C0872i.this.mo5039a(actionMasked, motionEvent, findPointerIndex);
                }
                C0872i iVar = C0872i.this;
                C0794d0 d0Var = iVar.f3559c;
                if (d0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = iVar.f3576t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == C0872i.this.f3568l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    C0872i.this.f3568l = motionEvent.getPointerId(i);
                                    C0872i iVar2 = C0872i.this;
                                    iVar2.mo5040a(motionEvent, iVar2.f3571o, actionIndex);
                                }
                            }
                        } else if (findPointerIndex >= 0) {
                            iVar.mo5040a(motionEvent, iVar.f3571o, findPointerIndex);
                            C0872i.this.mo5041a(d0Var);
                            C0872i iVar3 = C0872i.this;
                            iVar3.f3574r.removeCallbacks(iVar3.f3575s);
                            C0872i.this.f3575s.run();
                            C0872i.this.f3574r.invalidate();
                        }
                    }
                    C0872i.this.mo5042a((C0794d0) null, 0);
                    C0872i.this.f3568l = -1;
                }
            }
        }

        /* renamed from: b */
        public boolean mo4782b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C0872i.this.f3582z.mo14699a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C0872i.this.f3568l = motionEvent.getPointerId(0);
                C0872i.this.f3560d = motionEvent.getX();
                C0872i.this.f3561e = motionEvent.getY();
                C0872i.this.mo5048b();
                C0872i iVar = C0872i.this;
                if (iVar.f3559c == null) {
                    C0882h a = iVar.mo5038a(motionEvent);
                    if (a != null) {
                        C0872i iVar2 = C0872i.this;
                        iVar2.f3560d -= a.f3602i;
                        iVar2.f3561e -= a.f3603j;
                        iVar2.mo5043a(a.f3598e, true);
                        if (C0872i.this.f3557a.remove(a.f3598e.itemView)) {
                            C0872i iVar3 = C0872i.this;
                            iVar3.f3569m.clearView(iVar3.f3574r, a.f3598e);
                        }
                        C0872i.this.mo5042a(a.f3598e, a.f3599f);
                        C0872i iVar4 = C0872i.this;
                        iVar4.mo5040a(motionEvent, iVar4.f3571o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C0872i iVar5 = C0872i.this;
                iVar5.f3568l = -1;
                iVar5.mo5042a((C0794d0) null, 0);
            } else {
                int i = C0872i.this.f3568l;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex >= 0) {
                        C0872i.this.mo5039a(actionMasked, motionEvent, findPointerIndex);
                    }
                }
            }
            VelocityTracker velocityTracker = C0872i.this.f3576t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0872i.this.f3559c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo4781a(boolean z) {
            if (z) {
                C0872i.this.mo5042a((C0794d0) null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    /* compiled from: ItemTouchHelper */
    class C0875c extends C0882h {

        /* renamed from: n */
        final /* synthetic */ int f3585n;

        /* renamed from: o */
        final /* synthetic */ C0794d0 f3586o;

        /* renamed from: p */
        final /* synthetic */ C0872i f3587p;

        C0875c(C0872i iVar, C0794d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, C0794d0 d0Var2) {
            this.f3587p = iVar;
            this.f3585n = i3;
            this.f3586o = d0Var2;
            super(d0Var, i, i2, f, f2, f3, f4);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f3604k) {
                if (this.f3585n <= 0) {
                    C0872i iVar = this.f3587p;
                    iVar.f3569m.clearView(iVar.f3574r, this.f3586o);
                } else {
                    this.f3587p.f3557a.add(this.f3586o.itemView);
                    this.f3601h = true;
                    int i = this.f3585n;
                    if (i > 0) {
                        this.f3587p.mo5045a((C0882h) this, i);
                    }
                }
                C0872i iVar2 = this.f3587p;
                View view = iVar2.f3580x;
                View view2 = this.f3586o.itemView;
                if (view == view2) {
                    iVar2.mo5049c(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    /* compiled from: ItemTouchHelper */
    class C0876d implements Runnable {

        /* renamed from: U */
        final /* synthetic */ int f3588U;

        /* renamed from: c */
        final /* synthetic */ C0882h f3590c;

        C0876d(C0882h hVar, int i) {
            this.f3590c = hVar;
            this.f3588U = i;
        }

        public void run() {
            RecyclerView recyclerView = C0872i.this.f3574r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C0882h hVar = this.f3590c;
                if (!hVar.f3604k && hVar.f3598e.getAdapterPosition() != -1) {
                    C0802l itemAnimator = C0872i.this.f3574r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo4660a((C0803a) null)) && !C0872i.this.mo5046a()) {
                        C0872i.this.f3569m.onSwiped(this.f3590c.f3598e, this.f3588U);
                    } else {
                        C0872i.this.f3574r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$e */
    /* compiled from: ItemTouchHelper */
    class C0877e implements C0800j {
        C0877e() {
        }

        /* renamed from: a */
        public int mo4649a(int i, int i2) {
            C0872i iVar = C0872i.this;
            View view = iVar.f3580x;
            if (view == null) {
                return i2;
            }
            int i3 = iVar.f3581y;
            if (i3 == -1) {
                i3 = iVar.f3574r.indexOfChild(view);
                C0872i.this.f3581y = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                i2++;
            }
            return i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$f */
    /* compiled from: ItemTouchHelper */
    public static abstract class C0878f {
        private static final Interpolator sDragScrollInterpolator = new C0879a();
        private static final Interpolator sDragViewScrollCapInterpolator = new C0880b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.i$f$a */
        /* compiled from: ItemTouchHelper */
        static class C0879a implements Interpolator {
            C0879a() {
            }

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.i$f$b */
        /* compiled from: ItemTouchHelper */
        static class C0880b implements Interpolator {
            C0880b() {
            }

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C4258a.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, C0794d0 d0Var, C0794d0 d0Var2) {
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0794d0 chooseDropTarget(androidx.recyclerview.widget.RecyclerView.C0794d0 r15, java.util.List<androidx.recyclerview.widget.RecyclerView.C0794d0> r16, int r17, int r18) {
            /*
                r14 = this;
                r0 = r15
                android.view.View r1 = r0.itemView
                int r1 = r1.getWidth()
                int r1 = r17 + r1
                android.view.View r2 = r0.itemView
                int r2 = r2.getHeight()
                int r2 = r18 + r2
                android.view.View r3 = r0.itemView
                int r3 = r3.getLeft()
                int r3 = r17 - r3
                android.view.View r4 = r0.itemView
                int r4 = r4.getTop()
                int r4 = r18 - r4
                int r5 = r16.size()
                r6 = 0
                r7 = -1
                r8 = 0
            L_0x0028:
                if (r8 >= r5) goto L_0x00be
                r9 = r16
                java.lang.Object r10 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r10 = (androidx.recyclerview.widget.RecyclerView.C0794d0) r10
                if (r3 <= 0) goto L_0x0053
                android.view.View r11 = r10.itemView
                int r11 = r11.getRight()
                int r11 = r11 - r1
                if (r11 >= 0) goto L_0x0053
                android.view.View r12 = r10.itemView
                int r12 = r12.getRight()
                android.view.View r13 = r0.itemView
                int r13 = r13.getRight()
                if (r12 <= r13) goto L_0x0053
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L_0x0053
                r6 = r10
                goto L_0x0054
            L_0x0053:
                r11 = r7
            L_0x0054:
                if (r3 >= 0) goto L_0x0076
                android.view.View r7 = r10.itemView
                int r7 = r7.getLeft()
                int r7 = r7 - r17
                if (r7 <= 0) goto L_0x0076
                android.view.View r12 = r10.itemView
                int r12 = r12.getLeft()
                android.view.View r13 = r0.itemView
                int r13 = r13.getLeft()
                if (r12 >= r13) goto L_0x0076
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0076
                r11 = r7
                r6 = r10
            L_0x0076:
                if (r4 >= 0) goto L_0x0098
                android.view.View r7 = r10.itemView
                int r7 = r7.getTop()
                int r7 = r7 - r18
                if (r7 <= 0) goto L_0x0098
                android.view.View r12 = r10.itemView
                int r12 = r12.getTop()
                android.view.View r13 = r0.itemView
                int r13 = r13.getTop()
                if (r12 >= r13) goto L_0x0098
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0098
                r11 = r7
                r6 = r10
            L_0x0098:
                if (r4 <= 0) goto L_0x00b9
                android.view.View r7 = r10.itemView
                int r7 = r7.getBottom()
                int r7 = r7 - r2
                if (r7 >= 0) goto L_0x00b9
                android.view.View r12 = r10.itemView
                int r12 = r12.getBottom()
                android.view.View r13 = r0.itemView
                int r13 = r13.getBottom()
                if (r12 <= r13) goto L_0x00b9
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x00b9
                r6 = r10
                goto L_0x00ba
            L_0x00b9:
                r7 = r11
            L_0x00ba:
                int r8 = r8 + 1
                goto L_0x0028
            L_0x00be:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0872i.C0878f.chooseDropTarget(androidx.recyclerview.widget.RecyclerView$d0, java.util.List, int, int):androidx.recyclerview.widget.RecyclerView$d0");
        }

        public void clearView(RecyclerView recyclerView, C0794d0 d0Var) {
            C0886k.f3608a.mo5093a(d0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* access modifiers changed from: 0000 */
        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, C0794d0 d0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, d0Var), C4187x.m14399n(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            long j;
            C0802l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                j = itemAnimator.mo4670e();
            } else {
                j = itemAnimator.mo4671f();
            }
            return j;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(C0794d0 d0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, C0794d0 d0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(C0794d0 d0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasDragFlag(RecyclerView recyclerView, C0794d0 d0Var) {
            return (getAbsoluteMovementFlags(recyclerView, d0Var) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * getMaxDragScroll(recyclerView))) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * sDragScrollInterpolator.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public abstract boolean isItemViewSwipeEnabled();

        public abstract boolean isLongPressDragEnabled();

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, C0794d0 d0Var, float f, float f2, int i, boolean z) {
            C0886k.f3608a.mo5094b(canvas, recyclerView, d0Var.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, C0794d0 d0Var, float f, float f2, int i, boolean z) {
            C0886k.f3608a.mo5092a(canvas, recyclerView, d0Var.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: 0000 */
        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0794d0 d0Var, List<C0882h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0882h hVar = (C0882h) list.get(i2);
                hVar.mo5087c();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, hVar.f3598e, hVar.f3602i, hVar.f3603j, hVar.f3599f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* access modifiers changed from: 0000 */
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0794d0 d0Var, List<C0882h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C0882h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0882h hVar = (C0882h) list2.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, hVar.f3598e, hVar.f3602i, hVar.f3603j, hVar.f3599f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0882h hVar2 = (C0882h) list2.get(i3);
                if (hVar2.f3605l && !hVar2.f3601h) {
                    list2.remove(i3);
                } else if (!hVar2.f3605l) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, C0794d0 d0Var, C0794d0 d0Var2);

        public void onMoved(RecyclerView recyclerView, C0794d0 d0Var, int i, C0794d0 d0Var2, int i2, int i3, int i4) {
            C0808o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C0884i) {
                ((C0884i) layoutManager).mo4329a(d0Var.itemView, d0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo3862a()) {
                if (layoutManager.mo3898f(d0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo3684i(i2);
                }
                if (layoutManager.mo3902i(d0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo3684i(i2);
                }
            }
            if (layoutManager.mo3882b()) {
                if (layoutManager.mo3905j(d0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo3684i(i2);
                }
                if (layoutManager.mo3893e(d0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo3684i(i2);
                }
            }
        }

        public void onSelectedChanged(C0794d0 d0Var, int i) {
            if (d0Var != null) {
                C0886k.f3608a.mo5095b(d0Var.itemView);
            }
        }

        public abstract void onSwiped(C0794d0 d0Var, int i);
    }

    /* renamed from: androidx.recyclerview.widget.i$g */
    /* compiled from: ItemTouchHelper */
    private class C0881g extends SimpleOnGestureListener {

        /* renamed from: c */
        private boolean f3593c = true;

        C0881g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5080a() {
            this.f3593c = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f3593c) {
                View b = C0872i.this.mo5047b(motionEvent);
                if (b != null) {
                    C0794d0 g = C0872i.this.f3574r.mo4439g(b);
                    if (g != null) {
                        C0872i iVar = C0872i.this;
                        if (iVar.f3569m.hasDragFlag(iVar.f3574r, g)) {
                            int pointerId = motionEvent.getPointerId(0);
                            int i = C0872i.this.f3568l;
                            if (pointerId == i) {
                                int findPointerIndex = motionEvent.findPointerIndex(i);
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                C0872i iVar2 = C0872i.this;
                                iVar2.f3560d = x;
                                iVar2.f3561e = y;
                                iVar2.f3565i = 0.0f;
                                iVar2.f3564h = 0.0f;
                                if (iVar2.f3569m.isLongPressDragEnabled()) {
                                    C0872i.this.mo5042a(g, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$h */
    /* compiled from: ItemTouchHelper */
    private static class C0882h implements AnimatorListener {

        /* renamed from: a */
        final float f3594a;

        /* renamed from: b */
        final float f3595b;

        /* renamed from: c */
        final float f3596c;

        /* renamed from: d */
        final float f3597d;

        /* renamed from: e */
        final C0794d0 f3598e;

        /* renamed from: f */
        final int f3599f;

        /* renamed from: g */
        private final ValueAnimator f3600g;

        /* renamed from: h */
        boolean f3601h;

        /* renamed from: i */
        float f3602i;

        /* renamed from: j */
        float f3603j;

        /* renamed from: k */
        boolean f3604k = false;

        /* renamed from: l */
        boolean f3605l = false;

        /* renamed from: m */
        private float f3606m;

        /* renamed from: androidx.recyclerview.widget.i$h$a */
        /* compiled from: ItemTouchHelper */
        class C0883a implements AnimatorUpdateListener {
            C0883a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0882h.this.mo5084a(valueAnimator.getAnimatedFraction());
            }
        }

        C0882h(C0794d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f3599f = i2;
            this.f3598e = d0Var;
            this.f3594a = f;
            this.f3595b = f2;
            this.f3596c = f3;
            this.f3597d = f4;
            this.f3600g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f3600g.addUpdateListener(new C0883a());
            this.f3600g.setTarget(d0Var.itemView);
            this.f3600g.addListener(this);
            mo5084a(0.0f);
        }

        /* renamed from: a */
        public void mo5085a(long j) {
            this.f3600g.setDuration(j);
        }

        /* renamed from: b */
        public void mo5086b() {
            this.f3598e.setIsRecyclable(false);
            this.f3600g.start();
        }

        /* renamed from: c */
        public void mo5087c() {
            float f = this.f3594a;
            float f2 = this.f3596c;
            if (f == f2) {
                this.f3602i = this.f3598e.itemView.getTranslationX();
            } else {
                this.f3602i = f + (this.f3606m * (f2 - f));
            }
            float f3 = this.f3595b;
            float f4 = this.f3597d;
            if (f3 == f4) {
                this.f3603j = this.f3598e.itemView.getTranslationY();
            } else {
                this.f3603j = f3 + (this.f3606m * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo5084a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f3605l) {
                this.f3598e.setIsRecyclable(true);
            }
            this.f3605l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        public void mo5083a() {
            this.f3600g.cancel();
        }

        /* renamed from: a */
        public void mo5084a(float f) {
            this.f3606m = f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i */
    /* compiled from: ItemTouchHelper */
    public interface C0884i {
        /* renamed from: a */
        void mo4329a(View view, View view2, int i, int i2);
    }

    public C0872i(C0878f fVar) {
        this.f3569m = fVar;
    }

    /* renamed from: a */
    private static boolean m4857a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: b */
    private List<C0794d0> m4859b(C0794d0 d0Var) {
        C0794d0 d0Var2 = d0Var;
        List<C0794d0> list = this.f3577u;
        if (list == null) {
            this.f3577u = new ArrayList();
            this.f3578v = new ArrayList();
        } else {
            list.clear();
            this.f3578v.clear();
        }
        int boundingBoxMargin = this.f3569m.getBoundingBoxMargin();
        int round = Math.round(this.f3566j + this.f3564h) - boundingBoxMargin;
        int round2 = Math.round(this.f3567k + this.f3565i) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = d0Var2.itemView.getWidth() + round + i;
        int height = d0Var2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        C0808o layoutManager = this.f3574r.getLayoutManager();
        int e = layoutManager.mo4732e();
        int i4 = 0;
        while (i4 < e) {
            View d = layoutManager.mo4729d(i4);
            if (d != d0Var2.itemView && d.getBottom() >= round2 && d.getTop() <= height && d.getRight() >= round && d.getLeft() <= width) {
                C0794d0 g = this.f3574r.mo4439g(d);
                if (this.f3569m.canDropOver(this.f3574r, this.f3559c, g)) {
                    int abs = Math.abs(i2 - ((d.getLeft() + d.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((d.getTop() + d.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f3577u.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > ((Integer) this.f3578v.get(i6)).intValue()) {
                        i7++;
                        i6++;
                        C0794d0 d0Var3 = d0Var;
                    }
                    this.f3577u.add(i7, g);
                    this.f3578v.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            d0Var2 = d0Var;
        }
        return this.f3577u;
    }

    /* renamed from: d */
    private void m4863d() {
        if (VERSION.SDK_INT < 21) {
            if (this.f3579w == null) {
                this.f3579w = new C0877e();
            }
            this.f3574r.setChildDrawingOrderCallback(this.f3579w);
        }
    }

    /* renamed from: e */
    private void m4864e() {
        this.f3574r.mo4401b((C0807n) this);
        this.f3574r.mo4403b(this.f3554B);
        this.f3574r.mo4402b((C0814q) this);
        for (int size = this.f3572p.size() - 1; size >= 0; size--) {
            this.f3569m.clearView(this.f3574r, ((C0882h) this.f3572p.get(0)).f3598e);
        }
        this.f3572p.clear();
        this.f3580x = null;
        this.f3581y = -1;
        m4865f();
        m4868i();
    }

    /* renamed from: f */
    private void m4865f() {
        VelocityTracker velocityTracker = this.f3576t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3576t = null;
        }
    }

    /* renamed from: g */
    private void m4866g() {
        this.f3573q = ViewConfiguration.get(this.f3574r.getContext()).getScaledTouchSlop();
        this.f3574r.mo4381a((C0807n) this);
        this.f3574r.mo4384a(this.f3554B);
        this.f3574r.mo4383a((C0814q) this);
        m4867h();
    }

    /* renamed from: h */
    private void m4867h() {
        this.f3553A = new C0881g();
        this.f3582z = new C4130d(this.f3574r.getContext(), this.f3553A);
    }

    /* renamed from: i */
    private void m4868i() {
        C0881g gVar = this.f3553A;
        if (gVar != null) {
            gVar.mo5080a();
            this.f3553A = null;
        }
        if (this.f3582z != null) {
            this.f3582z = null;
        }
    }

    /* renamed from: b */
    public void mo4778b(View view) {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5050c() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.f3559c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f3556D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f3556D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3574r
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f3555C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f3555C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f3559c
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f3555C
            r1.mo4695a(r9, r10)
            boolean r9 = r1.mo3862a()
            r10 = 0
            if (r9 == 0) goto L_0x007f
            float r9 = r0.f3566j
            float r11 = r0.f3564h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f3555C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3574r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f3564h
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x0080
        L_0x0059:
            float r11 = r0.f3564h
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f3559c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f3555C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f3574r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3574r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007f
            r12 = r9
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            boolean r1 = r1.mo3882b()
            if (r1 == 0) goto L_0x00c8
            float r1 = r0.f3567k
            float r9 = r0.f3565i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f3555C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f3574r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f3565i
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a3
            if (r9 >= 0) goto L_0x00a3
            r1 = r9
            goto L_0x00c9
        L_0x00a3:
            float r9 = r0.f3565i
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f3559c
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f3555C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f3574r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3574r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r12 == 0) goto L_0x00e2
            androidx.recyclerview.widget.i$f r9 = r0.f3569m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3574r
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f3559c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f3574r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
        L_0x00e2:
            r14 = r12
            if (r1 == 0) goto L_0x0101
            androidx.recyclerview.widget.i$f r9 = r0.f3569m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3574r
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f3559c
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3574r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x0102
        L_0x0101:
            r12 = r14
        L_0x0102:
            if (r12 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r0.f3556D = r3
            return r2
        L_0x010a:
            long r7 = r0.f3556D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            r0.f3556D = r5
        L_0x0112:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3574r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0872i.mo5050c():boolean");
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0788a0 a0Var) {
        rect.setEmpty();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
        float f;
        float f2;
        this.f3581y = -1;
        if (this.f3559c != null) {
            m4856a(this.f3558b);
            float[] fArr = this.f3558b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f3569m.onDraw(canvas, recyclerView, this.f3559c, this.f3572p, this.f3570n, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
        float f;
        float f2;
        if (this.f3559c != null) {
            m4856a(this.f3558b);
            float[] fArr = this.f3558b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f3569m.onDrawOver(canvas, recyclerView, this.f3559c, this.f3572p, this.f3570n, f2, f);
    }

    /* renamed from: a */
    public void mo5044a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3574r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4864e();
            }
            this.f3574r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f3562f = resources.getDimension(C4258a.item_touch_helper_swipe_escape_velocity);
                this.f3563g = resources.getDimension(C4258a.item_touch_helper_swipe_escape_max_velocity);
                m4866g();
            }
        }
    }

    /* renamed from: a */
    private void m4856a(float[] fArr) {
        if ((this.f3571o & 12) != 0) {
            fArr[0] = (this.f3566j + this.f3564h) - ((float) this.f3559c.itemView.getLeft());
        } else {
            fArr[0] = this.f3559c.itemView.getTranslationX();
        }
        if ((this.f3571o & 3) != 0) {
            fArr[1] = (this.f3567k + this.f3565i) - ((float) this.f3559c.itemView.getTop());
        } else {
            fArr[1] = this.f3559c.itemView.getTranslationY();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5042a(androidx.recyclerview.widget.RecyclerView.C0794d0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r11.f3559c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f3570n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f3556D = r0
            int r4 = r11.f3570n
            r14 = 1
            r11.mo5043a(r12, r14)
            r11.f3570n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f3580x = r0
            r23.m4863d()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r11.f3559c
            r8 = 0
            if (r9 == 0) goto L_0x00ee
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00da
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.m4860c(r9)
            r7 = r0
        L_0x004f:
            r23.m4865f()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007b
            if (r7 == r15) goto L_0x007b
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = 0
        L_0x0066:
            r18 = 0
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f3564h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3574r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
            goto L_0x0066
        L_0x007b:
            float r2 = r11.f3565i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3574r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x008e:
            if (r4 != r15) goto L_0x0093
            r6 = 8
            goto L_0x0098
        L_0x0093:
            if (r7 <= 0) goto L_0x0097
            r6 = 2
            goto L_0x0098
        L_0x0097:
            r6 = 4
        L_0x0098:
            float[] r0 = r11.f3558b
            r11.m4856a(r0)
            float[] r0 = r11.f3558b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.i$c r5 = new androidx.recyclerview.widget.i$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.i$f r0 = r11.f3569m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3574r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            r14.mo5085a(r0)
            java.util.List<androidx.recyclerview.widget.i$h> r0 = r11.f3572p
            r0.add(r14)
            r14.mo5086b()
            r8 = 1
            goto L_0x00ea
        L_0x00da:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo5049c(r1)
            androidx.recyclerview.widget.i$f r1 = r11.f3569m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f3574r
            r1.clearView(r2, r0)
            r8 = 0
        L_0x00ea:
            r0 = 0
            r11.f3559c = r0
            goto L_0x00f1
        L_0x00ee:
            r21 = 8
            r8 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0124
            androidx.recyclerview.widget.i$f r0 = r11.f3569m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3574r
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f3570n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f3571o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f3566j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f3567k = r0
            r11.f3559c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0124
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r11.f3559c
            android.view.View r0 = r0.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0125
        L_0x0124:
            r1 = 0
        L_0x0125:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3574r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0135
            androidx.recyclerview.widget.RecyclerView$d0 r2 = r11.f3559c
            if (r2 == 0) goto L_0x0132
            r1 = 1
        L_0x0132:
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0135:
            if (r8 != 0) goto L_0x0140
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3574r
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r0.mo4686B()
        L_0x0140:
            androidx.recyclerview.widget.i$f r0 = r11.f3569m
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r11.f3559c
            int r2 = r11.f3570n
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3574r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0872i.mo5042a(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5048b() {
        VelocityTracker velocityTracker = this.f3576t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f3576t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5047b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C0794d0 d0Var = this.f3559c;
        if (d0Var != null) {
            View view = d0Var.itemView;
            if (m4857a(view, x, y, this.f3566j + this.f3564h, this.f3567k + this.f3565i)) {
                return view;
            }
        }
        for (int size = this.f3572p.size() - 1; size >= 0; size--) {
            C0882h hVar = (C0882h) this.f3572p.get(size);
            View view2 = hVar.f3598e.itemView;
            if (m4857a(view2, x, y, hVar.f3602i, hVar.f3603j)) {
                return view2;
            }
        }
        return this.f3574r.mo4366a(x, y);
    }

    /* renamed from: c */
    private C0794d0 m4862c(MotionEvent motionEvent) {
        C0808o layoutManager = this.f3574r.getLayoutManager();
        int i = this.f3568l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex) - this.f3560d;
        float y = motionEvent.getY(findPointerIndex) - this.f3561e;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        int i2 = this.f3573q;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo3862a()) {
            return null;
        }
        if (abs2 > abs && layoutManager.mo3882b()) {
            return null;
        }
        View b = mo5047b(motionEvent);
        if (b == null) {
            return null;
        }
        return this.f3574r.mo4439g(b);
    }

    /* renamed from: b */
    private int m4858b(C0794d0 d0Var, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.f3564h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f3576t;
            if (velocityTracker != null && this.f3568l > -1) {
                C0878f fVar = this.f3569m;
                float f = this.f3563g;
                fVar.getSwipeVelocityThreshold(f);
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.f3576t.getXVelocity(this.f3568l);
                float yVelocity = this.f3576t.getYVelocity(this.f3568l);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2) {
                    C0878f fVar2 = this.f3569m;
                    float f2 = this.f3562f;
                    fVar2.getSwipeEscapeVelocity(f2);
                    if (abs >= f2 && abs > Math.abs(yVelocity)) {
                        return i2;
                    }
                }
            }
            float width = ((float) this.f3574r.getWidth()) * this.f3569m.getSwipeThreshold(d0Var);
            if ((i & i3) != 0 && Math.abs(this.f3564h) > width) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private int m4860c(C0794d0 d0Var) {
        if (this.f3570n == 2) {
            return 0;
        }
        int movementFlags = this.f3569m.getMovementFlags(this.f3574r, d0Var);
        int convertToAbsoluteDirection = (this.f3569m.convertToAbsoluteDirection(movementFlags, C4187x.m14399n(this.f3574r)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f3564h) > Math.abs(this.f3565i)) {
            int b = m4858b(d0Var, convertToAbsoluteDirection);
            if (b > 0) {
                return (i & b) == 0 ? C0878f.convertToRelativeDirection(b, C4187x.m14399n(this.f3574r)) : b;
            }
            int c = m4861c(d0Var, convertToAbsoluteDirection);
            if (c > 0) {
                return c;
            }
        } else {
            int c2 = m4861c(d0Var, convertToAbsoluteDirection);
            if (c2 > 0) {
                return c2;
            }
            int b2 = m4858b(d0Var, convertToAbsoluteDirection);
            if (b2 > 0) {
                if ((i & b2) == 0) {
                    b2 = C0878f.convertToRelativeDirection(b2, C4187x.m14399n(this.f3574r));
                }
                return b2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5045a(C0882h hVar, int i) {
        this.f3574r.post(new C0876d(hVar, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5046a() {
        int size = this.f3572p.size();
        for (int i = 0; i < size; i++) {
            if (!((C0882h) this.f3572p.get(i)).f3605l) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5041a(C0794d0 d0Var) {
        if (!this.f3574r.isLayoutRequested() && this.f3570n == 2) {
            float moveThreshold = this.f3569m.getMoveThreshold(d0Var);
            int i = (int) (this.f3566j + this.f3564h);
            int i2 = (int) (this.f3567k + this.f3565i);
            if (((float) Math.abs(i2 - d0Var.itemView.getTop())) >= ((float) d0Var.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i - d0Var.itemView.getLeft())) >= ((float) d0Var.itemView.getWidth()) * moveThreshold) {
                List b = m4859b(d0Var);
                if (b.size() != 0) {
                    C0794d0 chooseDropTarget = this.f3569m.chooseDropTarget(d0Var, b, i, i2);
                    if (chooseDropTarget == null) {
                        this.f3577u.clear();
                        this.f3578v.clear();
                        return;
                    }
                    int adapterPosition = chooseDropTarget.getAdapterPosition();
                    int adapterPosition2 = d0Var.getAdapterPosition();
                    if (this.f3569m.onMove(this.f3574r, d0Var, chooseDropTarget)) {
                        this.f3569m.onMoved(this.f3574r, d0Var, adapterPosition2, chooseDropTarget, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private int m4861c(C0794d0 d0Var, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.f3565i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f3576t;
            if (velocityTracker != null && this.f3568l > -1) {
                C0878f fVar = this.f3569m;
                float f = this.f3563g;
                fVar.getSwipeVelocityThreshold(f);
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.f3576t.getXVelocity(this.f3568l);
                float yVelocity = this.f3576t.getYVelocity(this.f3568l);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3) {
                    C0878f fVar2 = this.f3569m;
                    float f2 = this.f3562f;
                    fVar2.getSwipeEscapeVelocity(f2);
                    if (abs >= f2 && abs > Math.abs(xVelocity)) {
                        return i2;
                    }
                }
            }
            float height = ((float) this.f3574r.getHeight()) * this.f3569m.getSwipeThreshold(d0Var);
            if ((i & i3) != 0 && Math.abs(this.f3565i) > height) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo4777a(View view) {
        mo5049c(view);
        C0794d0 g = this.f3574r.mo4439g(view);
        if (g != null) {
            C0794d0 d0Var = this.f3559c;
            if (d0Var == null || g != d0Var) {
                mo5043a(g, false);
                if (this.f3557a.remove(g.itemView)) {
                    this.f3569m.clearView(this.f3574r, g);
                }
            } else {
                mo5042a((C0794d0) null, 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5049c(View view) {
        if (view == this.f3580x) {
            this.f3580x = null;
            if (this.f3579w != null) {
                this.f3574r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5043a(C0794d0 d0Var, boolean z) {
        for (int size = this.f3572p.size() - 1; size >= 0; size--) {
            C0882h hVar = (C0882h) this.f3572p.get(size);
            if (hVar.f3598e == d0Var) {
                hVar.f3604k |= z;
                if (!hVar.f3605l) {
                    hVar.mo5083a();
                }
                this.f3572p.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5039a(int i, MotionEvent motionEvent, int i2) {
        if (this.f3559c == null && i == 2 && this.f3570n != 2 && this.f3569m.isItemViewSwipeEnabled() && this.f3574r.getScrollState() != 1) {
            C0794d0 c = m4862c(motionEvent);
            if (c != null) {
                int absoluteMovementFlags = (this.f3569m.getAbsoluteMovementFlags(this.f3574r, c) & 65280) >> 8;
                if (absoluteMovementFlags != 0) {
                    float x = motionEvent.getX(i2);
                    float f = x - this.f3560d;
                    float y = motionEvent.getY(i2) - this.f3561e;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(y);
                    int i3 = this.f3573q;
                    if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                        if (abs > abs2) {
                            if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                                return;
                            }
                        } else if (y < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        } else {
                            if (y > 0.0f && (absoluteMovementFlags & 2) == 0) {
                                return;
                            }
                        }
                        this.f3565i = 0.0f;
                        this.f3564h = 0.0f;
                        this.f3568l = motionEvent.getPointerId(0);
                        mo5042a(c, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0882h mo5038a(MotionEvent motionEvent) {
        if (this.f3572p.isEmpty()) {
            return null;
        }
        View b = mo5047b(motionEvent);
        for (int size = this.f3572p.size() - 1; size >= 0; size--) {
            C0882h hVar = (C0882h) this.f3572p.get(size);
            if (hVar.f3598e.itemView == b) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5040a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f3564h = x - this.f3560d;
        this.f3565i = y - this.f3561e;
        if ((i & 4) == 0) {
            this.f3564h = Math.max(0.0f, this.f3564h);
        }
        if ((i & 8) == 0) {
            this.f3564h = Math.min(0.0f, this.f3564h);
        }
        if ((i & 1) == 0) {
            this.f3565i = Math.max(0.0f, this.f3565i);
        }
        if ((i & 2) == 0) {
            this.f3565i = Math.min(0.0f, this.f3565i);
        }
    }
}
