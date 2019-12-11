package com.appboy.p034ui.inappmessage.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.p025o.p026k.C1515i;
import com.appboy.p030r.C1544n;
import com.appboy.p033s.C1555b;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$color;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.views.InAppMessageViewUtils */
public class InAppMessageViewUtils {
    private static final String TAG = C1557c.m7461a(InAppMessageViewUtils.class);

    public static void closeInAppMessageOnKeycodeBack() {
        C1557c.m7458a(TAG, "Back button intercepted by in-app message view, closing in-app message.");
        AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static boolean isValidIcon(String str) {
        return str != null;
    }

    protected static void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LayoutParams layoutParams = new LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    @TargetApi(21)
    private static void safeSetLayerDrawableBackground(Button button) {
        button.setBackground(new LayerDrawable(new Drawable[]{button.getBackground(), new RippleDrawable(ColorStateList.valueOf(button.getContext().getResources().getColor(R$color.com_appboy_inappmessage_button_ripple)), null, button.getBackground())}));
    }

    public static void setButtons(List<View> list, List<C1544n> list2) {
        for (int i = 0; i < list.size(); i++) {
            if (list2.size() <= i) {
                ((View) list.get(i)).setVisibility(8);
            } else if (list.get(i) instanceof Button) {
                Button button = (Button) list.get(i);
                C1544n nVar = (C1544n) list2.get(i);
                button.setText(nVar.mo6851L());
                Drawable background = button.getBackground();
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    gradientDrawable.setStroke(C1555b.m7448a(button.getContext(), 1), nVar.mo6848I());
                    gradientDrawable.setColor(nVar.mo6847F());
                }
                if (VERSION.SDK_INT >= 21) {
                    safeSetLayerDrawableBackground(button);
                    button.setStateListAnimator(null);
                }
                setTextViewColor(button, nVar.mo6852M());
            }
        }
    }

    public static void setDrawableColor(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21 && (drawable instanceof LayerDrawable)) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                C1557c.m7458a(TAG, "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.");
            } else {
                setDrawableColor(layerDrawable.getDrawable(0), i);
            }
        }
        if (drawable instanceof GradientDrawable) {
            setDrawableColor((GradientDrawable) drawable, i);
        } else {
            drawable.setColorFilter(i, Mode.SRC_ATOP);
        }
    }

    public static void setFrameColor(View view, Integer num) {
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static void setIcon(Context context, String str, int i, int i2, TextView textView) {
        if (isValidIcon(str)) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i);
                if (textView.getBackground() != null) {
                    setDrawableColor(textView.getBackground(), i2);
                } else {
                    setViewBackgroundColor(textView, i2);
                }
            } catch (Exception e) {
                C1557c.m7470c(TAG, "Caught exception setting icon typeface. Not rendering icon.", e);
            }
        }
    }

    public static void setImage(Bitmap bitmap, ImageView imageView) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void setTextAlignment(TextView textView, C1515i iVar) {
        if (iVar.equals(C1515i.START)) {
            textView.setGravity(8388611);
        } else if (iVar.equals(C1515i.END)) {
            textView.setGravity(8388613);
        } else if (iVar.equals(C1515i.CENTER)) {
            textView.setGravity(17);
        }
    }

    public static void setTextViewColor(TextView textView, int i) {
        textView.setTextColor(i);
    }

    public static void setViewBackgroundColor(View view, int i) {
        view.setBackgroundColor(i);
    }

    public static void setViewBackgroundColorFilter(View view, int i) {
        view.getBackground().setColorFilter(i, Mode.SRC_ATOP);
        view.getBackground().setAlpha(Color.alpha(i));
    }

    private static void setDrawableColor(GradientDrawable gradientDrawable, int i) {
        gradientDrawable.setColor(i);
    }
}
