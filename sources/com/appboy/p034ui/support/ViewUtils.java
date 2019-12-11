package com.appboy.p034ui.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.appboy.p033s.C1557c;

/* renamed from: com.appboy.ui.support.ViewUtils */
public class ViewUtils {
    private static final String TAG = C1557c.m7461a(ViewUtils.class);
    private static int sDisplayHeight;

    public static double convertDpToPixels(Context context, double d) {
        return d * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static int getDisplayHeight(Activity activity) {
        int i = sDisplayHeight;
        if (i > 0) {
            return i;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        sDisplayHeight = point.y;
        return sDisplayHeight;
    }

    public static int getTopVisibleCoordinate(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static boolean isRunningOnTablet(Activity activity) {
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static void removeViewFromParent(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            setFocusableInTouchModeAndRequestFocus(viewGroup);
            viewGroup.removeView(view);
        }
    }

    public static void setActivityRequestedOrientation(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set requested orientation ");
            sb.append(i);
            sb.append(" for activity class: ");
            sb.append(activity.getLocalClassName());
            C1557c.m7470c(str, sb.toString(), e);
        }
    }

    public static void setFocusableInTouchModeAndRequestFocus(View view) {
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Caught exception while setting view to focusable in touch mode and requesting focus.", e);
        }
    }

    public static void setHeightOnViewLayoutParams(View view, int i) {
        if (view == null) {
            C1557c.m7473e(TAG, "Cannot set height on null view.");
            return;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
