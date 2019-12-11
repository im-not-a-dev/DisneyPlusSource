package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p030r.C1534d;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$dimen;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.p034ui.inappmessage.IInAppMessageImageView;
import com.appboy.p034ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.p034ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView */
public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyInAppMessageModalView.class);
    private AppboyInAppMessageImageView mAppboyInAppMessageImageView;

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void resizeGraphicFrameIfAppropriate(Context context, C1534d dVar, double d) {
        if (dVar.mo6829G().equals(C1509d.GRAPHIC)) {
            Resources resources = context.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_margin);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_max_width);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_max_height);
            final double d2 = d;
            C16132 r0 = new Runnable() {
                public void run() {
                    double min = (double) Math.min(AppboyInAppMessageModalView.this.getMeasuredWidth() - dimensionPixelSize, dimensionPixelSize2);
                    double min2 = (double) Math.min(AppboyInAppMessageModalView.this.getMeasuredHeight() - dimensionPixelSize, dimensionPixelSize3);
                    double d = min / min2;
                    View findViewById = AppboyInAppMessageModalView.this.findViewById(R$id.com_appboy_inappmessage_modal_graphic_bound);
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    double d2 = d2;
                    if (d2 >= d) {
                        layoutParams.width = (int) min;
                        layoutParams.height = (int) (min / d2);
                    } else {
                        layoutParams.width = (int) (d2 * min2);
                        layoutParams.height = (int) min2;
                    }
                    findViewById.setLayoutParams(layoutParams);
                }
            };
            post(r0);
        }
    }

    private void setInAppMessageImageViewAttributes(Context context, C1534d dVar, IInAppMessageImageView iInAppMessageImageView) {
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, AppboyInAppMessageParams.getModalizedImageRadiusDp());
        if (dVar.mo6829G().equals(C1509d.GRAPHIC)) {
            iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
        iInAppMessageImageView.setInAppMessageImageCropType(dVar.mo6796B());
    }

    public void applyInAppMessageParameters(Context context, C1534d dVar) {
        this.mAppboyInAppMessageImageView = (AppboyInAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_modal_imageview);
        setInAppMessageImageViewAttributes(context, dVar, this.mAppboyInAppMessageImageView);
        if (dVar.mo6829G().equals(C1509d.GRAPHIC) && dVar.mo6818q() != null) {
            resizeGraphicFrameIfAppropriate(context, dVar, ((double) dVar.mo6818q().getWidth()) / ((double) dVar.mo6818q().getHeight()));
        }
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_frame);
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_appboy_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_appboy_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_appboy_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_appboy_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R$id.com_appboy_inappmessage_modal_button_dual_two);
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
        return findViewById(R$id.com_appboy_inappmessage_modal);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView() {
        return this.mAppboyInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_message);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        findViewById(R$id.com_appboy_inappmessage_modal_text_layout).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1557c.m7458a(AppboyInAppMessageModalView.TAG, "Passing scrollView click event to message clickable view.");
                AppboyInAppMessageModalView.this.getMessageClickableView().performClick();
            }
        });
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R$id.com_appboy_inappmessage_modal), i);
    }

    public Drawable getMessageBackgroundObject() {
        return getMessageClickableView().getBackground();
    }
}
