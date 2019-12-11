package com.appboy.p034ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView */
public class AppboyInAppMessageHtmlFullView extends AppboyInAppMessageHtmlBaseView {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyInAppMessageHtmlFullView.class);
    private WebView mMessageWebView;

    public AppboyInAppMessageHtmlFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    public WebView getMessageWebView() {
        if (this.mMessageWebView == null) {
            this.mMessageWebView = (WebView) findViewById(R$id.com_appboy_inappmessage_html_full_webview);
            WebView webView = this.mMessageWebView;
            if (webView != null) {
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(true);
                settings.setDisplayZoomControls(false);
                this.mMessageWebView.setLayerType(2, null);
                this.mMessageWebView.setBackgroundColor(0);
                this.mMessageWebView.setWebChromeClient(new WebChromeClient(this) {
                    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                        String access$000 = AppboyInAppMessageHtmlFullView.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Html In-app log. Line: ");
                        sb.append(consoleMessage.lineNumber());
                        sb.append(". SourceId: ");
                        sb.append(consoleMessage.sourceId());
                        sb.append(". Log Level: ");
                        sb.append(consoleMessage.messageLevel());
                        sb.append(". Message: ");
                        sb.append(consoleMessage.message());
                        C1557c.m7458a(access$000, sb.toString());
                        return true;
                    }
                });
                this.mMessageWebView.addJavascriptInterface(new AppboyInAppMessageHtmlJavascriptInterface(getContext()), "appboyInternalBridge");
            }
        }
        return this.mMessageWebView;
    }
}
