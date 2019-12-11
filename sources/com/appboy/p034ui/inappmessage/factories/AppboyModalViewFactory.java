package com.appboy.p034ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.appboy.C1440a;
import com.appboy.p025o.C1492a;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1542l;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.p034ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p034ui.inappmessage.views.AppboyInAppMessageModalView;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyModalViewFactory */
public class AppboyModalViewFactory implements IInAppMessageViewFactory {
    @SuppressLint({"InflateParams"})
    private AppboyInAppMessageModalView getAppropriateModalView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal_graphic, null);
        }
        return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal, null);
    }

    public AppboyInAppMessageModalView createInAppMessageView(Activity activity, C1532b bVar) {
        Context applicationContext = activity.getApplicationContext();
        C1542l lVar = (C1542l) bVar;
        boolean equals = lVar.mo6829G().equals(C1509d.GRAPHIC);
        AppboyInAppMessageModalView appropriateModalView = getAppropriateModalView(activity, equals);
        appropriateModalView.applyInAppMessageParameters(applicationContext, lVar);
        String appropriateImageUrl = appropriateModalView.getAppropriateImageUrl(bVar);
        if (!C1563i.m7491e(appropriateImageUrl)) {
            C1440a.m6921c(applicationContext).mo6578c().mo6660a(applicationContext, appropriateImageUrl, appropriateModalView.getMessageImageView(), C1492a.IN_APP_MESSAGE_MODAL);
        }
        appropriateModalView.getFrameView().setOnClickListener(null);
        appropriateModalView.setMessageBackgroundColor(bVar.mo6800F());
        appropriateModalView.setFrameColor(lVar.mo6840d());
        appropriateModalView.setMessageButtons(lVar.mo6830H());
        appropriateModalView.setMessageCloseButtonColor(lVar.mo6839c());
        if (!equals) {
            appropriateModalView.setMessage(bVar.mo6811j());
            appropriateModalView.setMessageTextColor(bVar.mo6797C());
            appropriateModalView.setMessageHeaderText(lVar.mo6841e());
            appropriateModalView.setMessageHeaderTextColor(lVar.mo6843g());
            appropriateModalView.setMessageIcon(bVar.getIcon(), bVar.mo6816o(), bVar.mo6825x());
            appropriateModalView.setMessageHeaderTextAlignment(lVar.mo6842f());
            appropriateModalView.setMessageTextAlign(lVar.mo6832a());
            appropriateModalView.resetMessageMargins(bVar.mo6812k());
            ((AppboyInAppMessageImageView) appropriateModalView.getMessageImageView()).setAspectRatio(2.9f);
        }
        return appropriateModalView;
    }
}
