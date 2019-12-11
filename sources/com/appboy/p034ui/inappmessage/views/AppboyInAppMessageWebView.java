package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageWebView */
public class AppboyInAppMessageWebView extends WebView {
    public AppboyInAppMessageWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }
}
