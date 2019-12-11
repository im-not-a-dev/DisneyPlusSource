package com.appboy.p034ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.appboy.p034ui.inappmessage.IInAppMessageView;
import com.appboy.p034ui.inappmessage.InAppMessageWebViewClient;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlBaseView */
public abstract class AppboyInAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    public AppboyInAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View getMessageClickableView() {
        return this;
    }

    public abstract WebView getMessageWebView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        getMessageWebView().setWebViewClient(inAppMessageWebViewClient);
    }

    public void setWebViewContent(String str, String str2) {
        WebView messageWebView = getMessageWebView();
        StringBuilder sb = new StringBuilder();
        sb.append("file://");
        sb.append(str2);
        sb.append("/");
        messageWebView.loadDataWithBaseURL(sb.toString(), str, "text/html", "utf-8", null);
    }
}
