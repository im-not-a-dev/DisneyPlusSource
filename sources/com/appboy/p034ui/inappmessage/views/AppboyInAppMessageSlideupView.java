package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1506a;
import com.appboy.p030r.C1532b;
import com.appboy.p034ui.R$dimen;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.p034ui.support.ViewUtils;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView */
public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView {
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;

    /* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView$1 */
    static /* synthetic */ class C16141 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[C1506a.values().length];

        static {
            try {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[C1506a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyInAppMessageParameters(C1532b bVar) {
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_slideup_imageview);
        this.mAppboyInAppMessageImageView.setInAppMessageImageCropType(bVar.mo6796B());
    }

    public View getMessageChevronView() {
        return findViewById(R$id.com_appboy_inappmessage_slideup_chevron);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_icon);
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_message);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        boolean z2 = getMessageIconView() == null || getMessageIconView().getText() == null || getMessageIconView().getText().length() == 0;
        if (!z && z2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                ViewUtils.removeViewFromParent(relativeLayout);
            }
            TextView textView = (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_message);
            LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_slideup_left_message_margin_no_image);
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageBackgroundObject(), i);
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public void setMessageChevron(int i, C1506a aVar) {
        if (C16141.$SwitchMap$com$appboy$enums$inappmessage$ClickAction[aVar.ordinal()] != 1) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageChevronView(), i);
        } else {
            getMessageChevronView().setVisibility(8);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_slideup_container);
    }
}
