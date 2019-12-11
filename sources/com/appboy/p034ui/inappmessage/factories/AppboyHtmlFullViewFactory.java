package com.appboy.p034ui.inappmessage.factories;

import android.app.Activity;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1540j;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p034ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.p034ui.inappmessage.views.AppboyInAppMessageHtmlFullView;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyHtmlFullViewFactory */
public class AppboyHtmlFullViewFactory implements IInAppMessageViewFactory {
    private IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

    public AppboyHtmlFullViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        this.mInAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    public AppboyInAppMessageHtmlFullView createInAppMessageView(Activity activity, C1532b bVar) {
        AppboyInAppMessageHtmlFullView appboyInAppMessageHtmlFullView = (AppboyInAppMessageHtmlFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_html_full, null);
        appboyInAppMessageHtmlFullView.setWebViewContent(bVar.mo6811j(), ((C1540j) bVar).mo6836d());
        appboyInAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(activity.getApplicationContext(), bVar, this.mInAppMessageWebViewClientListener));
        return appboyInAppMessageHtmlFullView;
    }
}
