package com.appboy.p034ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import com.appboy.C1440a;
import com.appboy.p025o.C1492a;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1543m;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p034ui.inappmessage.views.AppboyInAppMessageSlideupView;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboySlideupViewFactory */
public class AppboySlideupViewFactory implements IInAppMessageViewFactory {
    public AppboyInAppMessageSlideupView createInAppMessageView(Activity activity, C1532b bVar) {
        Context applicationContext = activity.getApplicationContext();
        C1543m mVar = (C1543m) bVar;
        AppboyInAppMessageSlideupView appboyInAppMessageSlideupView = (AppboyInAppMessageSlideupView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_slideup, null);
        appboyInAppMessageSlideupView.applyInAppMessageParameters(bVar);
        String appropriateImageUrl = appboyInAppMessageSlideupView.getAppropriateImageUrl(bVar);
        if (!C1563i.m7491e(appropriateImageUrl)) {
            C1440a.m6921c(applicationContext).mo6578c().mo6660a(applicationContext, appropriateImageUrl, appboyInAppMessageSlideupView.getMessageImageView(), C1492a.IN_APP_MESSAGE_SLIDEUP);
        }
        appboyInAppMessageSlideupView.setMessageBackgroundColor(mVar.mo6800F());
        appboyInAppMessageSlideupView.setMessage(mVar.mo6811j());
        appboyInAppMessageSlideupView.setMessageTextColor(mVar.mo6797C());
        appboyInAppMessageSlideupView.setMessageTextAlign(mVar.mo6832a());
        appboyInAppMessageSlideupView.setMessageIcon(mVar.getIcon(), mVar.mo6816o(), mVar.mo6825x());
        appboyInAppMessageSlideupView.setMessageChevron(mVar.mo6844c(), mVar.mo6798D());
        appboyInAppMessageSlideupView.resetMessageMargins(bVar.mo6812k());
        return appboyInAppMessageSlideupView;
    }
}
