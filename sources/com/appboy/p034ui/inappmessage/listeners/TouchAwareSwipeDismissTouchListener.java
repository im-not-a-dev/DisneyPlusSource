package com.appboy.p034ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.appboy.p034ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks;

/* renamed from: com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener */
public class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener mTouchListener;

    /* renamed from: com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener$ITouchListener */
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    public TouchAwareSwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        super(view, obj, dismissCallbacks);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener = this.mTouchListener;
            if (iTouchListener != null) {
                iTouchListener.onTouchStartedOrContinued();
            }
        } else if (action == 1 || action == 3) {
            ITouchListener iTouchListener2 = this.mTouchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchEnded();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    public void setTouchListener(ITouchListener iTouchListener) {
        this.mTouchListener = iTouchListener;
    }
}
