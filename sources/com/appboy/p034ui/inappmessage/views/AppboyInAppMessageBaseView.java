package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1515i;
import com.appboy.p030r.C1532b;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.inappmessage.IInAppMessageView;
import com.appboy.p034ui.support.ViewUtils;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageBaseView */
public abstract class AppboyInAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getAppropriateImageUrl(C1532b bVar) {
        if (!C1563i.m7490d(bVar.mo6799E())) {
            return bVar.mo6799E();
        }
        return bVar.mo6815n();
    }

    public abstract Object getMessageBackgroundObject();

    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean z) {
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                ViewUtils.removeViewFromParent(messageImageView);
            } else {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && C1563i.m7490d((String) getMessageIconView().getText())) {
            ViewUtils.removeViewFromParent(getMessageIconView());
        }
    }

    public void setMessage(String str) {
        getMessageTextView().setText(str);
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColor((View) getMessageBackgroundObject(), i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        if (getMessageIconView() != null) {
            InAppMessageViewUtils.setIcon(getContext(), str, i, i2, getMessageIconView());
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
    }

    public void setMessageTextAlign(C1515i iVar) {
        InAppMessageViewUtils.setTextAlignment(getMessageTextView(), iVar);
    }

    public void setMessageTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
    }
}
