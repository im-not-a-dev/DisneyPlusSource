package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1515i;
import com.appboy.p030r.C1544n;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.inappmessage.IInAppMessageImmersiveView;
import com.appboy.p034ui.support.ViewUtils;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageImmersiveBaseView */
public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView implements IInAppMessageImmersiveView {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageImmersiveBaseView.class);

    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setLargerCloseButtonClickArea(final View view) {
        if (view == null || view.getParent() == null) {
            C1557c.m7473e(TAG, "Cannot increase click area for view if view and/or parent are null.");
            return;
        }
        if (view.getParent() instanceof View) {
            ((View) view.getParent()).post(new Runnable() {
                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int convertDpToPixels = (int) ViewUtils.convertDpToPixels(AppboyInAppMessageImmersiveBaseView.this.getContext(), 15.0d);
                    int convertDpToPixels2 = (int) ViewUtils.convertDpToPixels(AppboyInAppMessageImmersiveBaseView.this.getContext(), 10.0d);
                    rect.right += convertDpToPixels;
                    rect.bottom += convertDpToPixels2;
                    rect.left -= convertDpToPixels2;
                    rect.top -= convertDpToPixels;
                    ((View) view.getParent()).setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        if (C1563i.m7490d(getMessageTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        if (C1563i.m7490d(getMessageHeaderTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
        setLargerCloseButtonClickArea(getMessageCloseButtonView());
    }

    public void setFrameColor(Integer num) {
        InAppMessageViewUtils.setFrameColor(getFrameView(), num);
    }

    public void setMessageButtons(List<C1544n> list) {
        InAppMessageViewUtils.setButtons(getMessageButtonViews(list != null ? list.size() : 0), list);
    }

    public void setMessageCloseButtonColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageCloseButtonView(), i);
    }

    public void setMessageHeaderText(String str) {
        getMessageHeaderTextView().setText(str);
    }

    public void setMessageHeaderTextAlignment(C1515i iVar) {
        InAppMessageViewUtils.setTextAlignment(getMessageHeaderTextView(), iVar);
    }

    public void setMessageHeaderTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageHeaderTextView(), i);
    }
}
