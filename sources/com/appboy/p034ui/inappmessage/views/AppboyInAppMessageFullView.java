package com.appboy.p034ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p030r.C1534d;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.p034ui.inappmessage.IInAppMessageImageView;
import com.appboy.p034ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.p034ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView */
public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyInAppMessageFullView.class);
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setInAppMessageImageViewAttributes(Activity activity, C1534d dVar, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(dVar.mo6796B());
        if (ViewUtils.isRunningOnTablet(activity)) {
            float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
            if (dVar.mo6829G().equals(C1509d.GRAPHIC)) {
                iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
            } else {
                iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
            }
        } else {
            iInAppMessageImageView.setCornersRadiusPx(0.0f);
        }
    }

    public void createAppropriateViews(Activity activity, C1534d dVar) {
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_full_imageview);
        setInAppMessageImageViewAttributes(activity, dVar, this.mAppboyInAppMessageImageView);
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().height;
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_appboy_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_appboy_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_appboy_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_appboy_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(R$id.com_appboy_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    public View getMessageClickableView() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_header_text);
    }

    public TextView getMessageIconView() {
        return null;
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().width;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        findViewById(R$id.com_appboy_inappmessage_full_text_layout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1557c.m7458a(AppboyInAppMessageFullView.TAG, "Passing scrollView click event to message clickable view.");
                AppboyInAppMessageFullView.this.getMessageClickableView().performClick();
            }
        });
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R$id.com_appboy_inappmessage_full), i);
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }
}
