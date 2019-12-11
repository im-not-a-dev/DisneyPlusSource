package com.appboy.p034ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener */
public class SwipeDismissTouchListener implements OnTouchListener {
    private long mAnimationTime;
    /* access modifiers changed from: private */
    public DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private int mMaxFlingVelocity;
    private int mMinFlingVelocity;
    private int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    /* access modifiers changed from: private */
    public Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    /* access modifiers changed from: private */
    public View mView;
    private int mViewWidth = 1;

    /* renamed from: com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$DismissCallbacks */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = (long) view.getContext().getResources().getInteger(17694720);
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        if (r10.mVelocityTracker.getXVelocity() > 0.0f) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            float r11 = r10.mTranslationX
            r0 = 0
            r12.offsetLocation(r11, r0)
            int r11 = r10.mViewWidth
            r1 = 2
            if (r11 >= r1) goto L_0x0013
            android.view.View r11 = r10.mView
            int r11 = r11.getWidth()
            r10.mViewWidth = r11
        L_0x0013:
            int r11 = r12.getActionMasked()
            r2 = 0
            if (r11 == 0) goto L_0x0191
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 1
            if (r11 == r5) goto L_0x00c3
            r6 = 3
            if (r11 == r1) goto L_0x0055
            if (r11 == r6) goto L_0x0027
            goto L_0x0190
        L_0x0027:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            if (r11 != 0) goto L_0x002d
            goto L_0x0190
        L_0x002d:
            android.view.View r11 = r10.mView
            android.view.ViewPropertyAnimator r11 = r11.animate()
            android.view.ViewPropertyAnimator r11 = r11.translationX(r0)
            android.view.ViewPropertyAnimator r11 = r11.alpha(r3)
            long r5 = r10.mAnimationTime
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r5)
            r11.setListener(r4)
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            r11.recycle()
            r10.mVelocityTracker = r4
            r10.mTranslationX = r0
            r10.mDownX = r0
            r10.mDownY = r0
            r10.mSwiping = r2
            goto L_0x0190
        L_0x0055:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            if (r11 != 0) goto L_0x005b
            goto L_0x0190
        L_0x005b:
            r11.addMovement(r12)
            float r11 = r12.getRawX()
            float r1 = r10.mDownX
            float r11 = r11 - r1
            float r1 = r12.getRawY()
            float r3 = r10.mDownY
            float r1 = r1 - r3
            float r3 = java.lang.Math.abs(r11)
            int r4 = r10.mSlop
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b3
            float r1 = java.lang.Math.abs(r1)
            float r3 = java.lang.Math.abs(r11)
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            r10.mSwiping = r5
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            int r0 = r10.mSlop
            goto L_0x0092
        L_0x008f:
            int r0 = r10.mSlop
            int r0 = -r0
        L_0x0092:
            r10.mSwipingSlop = r0
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r12)
            int r12 = r12.getActionIndex()
            int r12 = r12 << 8
            r12 = r12 | r6
            r0.setAction(r12)
            android.view.View r12 = r10.mView
            r12.onTouchEvent(r0)
            r0.recycle()
        L_0x00b3:
            boolean r12 = r10.mSwiping
            if (r12 == 0) goto L_0x0190
            r10.mTranslationX = r11
            android.view.View r12 = r10.mView
            int r0 = r10.mSwipingSlop
            float r0 = (float) r0
            float r11 = r11 - r0
            r12.setTranslationX(r11)
            return r5
        L_0x00c3:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            if (r11 != 0) goto L_0x00c9
            goto L_0x0190
        L_0x00c9:
            float r11 = r12.getRawX()
            float r6 = r10.mDownX
            float r11 = r11 - r6
            android.view.VelocityTracker r6 = r10.mVelocityTracker
            r6.addMovement(r12)
            android.view.VelocityTracker r12 = r10.mVelocityTracker
            r6 = 1000(0x3e8, float:1.401E-42)
            r12.computeCurrentVelocity(r6)
            android.view.VelocityTracker r12 = r10.mVelocityTracker
            float r12 = r12.getXVelocity()
            float r6 = java.lang.Math.abs(r12)
            android.view.VelocityTracker r7 = r10.mVelocityTracker
            float r7 = r7.getYVelocity()
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r11)
            int r9 = r10.mViewWidth
            int r9 = r9 / r1
            float r1 = (float) r9
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x010a
            boolean r1 = r10.mSwiping
            if (r1 == 0) goto L_0x010a
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0106
            r11 = 1
            goto L_0x0107
        L_0x0106:
            r11 = 0
        L_0x0107:
            r5 = r11
            r11 = 1
            goto L_0x0140
        L_0x010a:
            int r1 = r10.mMinFlingVelocity
            float r1 = (float) r1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x013e
            int r1 = r10.mMaxFlingVelocity
            float r1 = (float) r1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x013e
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x013e
            boolean r1 = r10.mSwiping
            if (r1 == 0) goto L_0x013e
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x0126
            r12 = 1
            goto L_0x0127
        L_0x0126:
            r12 = 0
        L_0x0127:
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x012d
            r11 = 1
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            if (r12 != r11) goto L_0x0132
            r11 = 1
            goto L_0x0133
        L_0x0132:
            r11 = 0
        L_0x0133:
            android.view.VelocityTracker r12 = r10.mVelocityTracker
            float r12 = r12.getXVelocity()
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x013f
            goto L_0x0140
        L_0x013e:
            r11 = 0
        L_0x013f:
            r5 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x0166
            android.view.View r11 = r10.mView
            android.view.ViewPropertyAnimator r11 = r11.animate()
            int r12 = r10.mViewWidth
            if (r5 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            int r12 = -r12
        L_0x014e:
            float r12 = (float) r12
            android.view.ViewPropertyAnimator r11 = r11.translationX(r12)
            android.view.ViewPropertyAnimator r11 = r11.alpha(r0)
            long r5 = r10.mAnimationTime
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r5)
            com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$1 r12 = new com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$1
            r12.<init>()
            r11.setListener(r12)
            goto L_0x0181
        L_0x0166:
            boolean r11 = r10.mSwiping
            if (r11 == 0) goto L_0x0181
            android.view.View r11 = r10.mView
            android.view.ViewPropertyAnimator r11 = r11.animate()
            android.view.ViewPropertyAnimator r11 = r11.translationX(r0)
            android.view.ViewPropertyAnimator r11 = r11.alpha(r3)
            long r5 = r10.mAnimationTime
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r5)
            r11.setListener(r4)
        L_0x0181:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            r11.recycle()
            r10.mVelocityTracker = r4
            r10.mTranslationX = r0
            r10.mDownX = r0
            r10.mDownY = r0
            r10.mSwiping = r2
        L_0x0190:
            return r2
        L_0x0191:
            float r11 = r12.getRawX()
            r10.mDownX = r11
            float r11 = r12.getRawY()
            r10.mDownY = r11
            com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$DismissCallbacks r11 = r10.mCallbacks
            java.lang.Object r0 = r10.mToken
            boolean r11 = r11.canDismiss(r0)
            if (r11 == 0) goto L_0x01b2
            android.view.VelocityTracker r11 = android.view.VelocityTracker.obtain()
            r10.mVelocityTracker = r11
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            r11.addMovement(r12)
        L_0x01b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p034ui.inappmessage.listeners.SwipeDismissTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @TargetApi(12)
    public void performDismiss() {
        final LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.start();
    }
}
