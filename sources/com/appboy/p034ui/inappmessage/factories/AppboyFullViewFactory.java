package com.appboy.p034ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.appboy.C1440a;
import com.appboy.p025o.C1492a;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p025o.p026k.C1513g;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1538h;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.p034ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p034ui.inappmessage.views.AppboyInAppMessageFullView;
import com.appboy.p034ui.support.ViewUtils;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyFullViewFactory */
public class AppboyFullViewFactory implements IInAppMessageViewFactory {
    /* access modifiers changed from: 0000 */
    @SuppressLint({"InflateParams"})
    public AppboyInAppMessageFullView getAppropriateFullView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full_graphic, null);
        }
        return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full, null);
    }

    /* access modifiers changed from: 0000 */
    public boolean resetLayoutParamsIfAppropriate(Activity activity, C1532b bVar, AppboyInAppMessageFullView appboyInAppMessageFullView) {
        LayoutParams layoutParams;
        if (!(!ViewUtils.isRunningOnTablet(activity) || bVar.mo6821t() == null || bVar.mo6821t() == C1513g.ANY)) {
            int longEdge = appboyInAppMessageFullView.getLongEdge();
            int shortEdge = appboyInAppMessageFullView.getShortEdge();
            if (longEdge > 0 && shortEdge > 0) {
                if (bVar.mo6821t() == C1513g.LANDSCAPE) {
                    layoutParams = new LayoutParams(longEdge, shortEdge);
                } else {
                    layoutParams = new LayoutParams(shortEdge, longEdge);
                }
                layoutParams.addRule(13, -1);
                appboyInAppMessageFullView.getMessageBackgroundObject().setLayoutParams(layoutParams);
                return true;
            }
        }
        return false;
    }

    public AppboyInAppMessageFullView createInAppMessageView(Activity activity, C1532b bVar) {
        final Context applicationContext = activity.getApplicationContext();
        final C1538h hVar = (C1538h) bVar;
        boolean equals = hVar.mo6829G().equals(C1509d.GRAPHIC);
        AppboyInAppMessageFullView appropriateFullView = getAppropriateFullView(activity, equals);
        appropriateFullView.createAppropriateViews(activity, hVar);
        String appropriateImageUrl = appropriateFullView.getAppropriateImageUrl(bVar);
        if (!C1563i.m7491e(appropriateImageUrl)) {
            C1440a.m6921c(applicationContext).mo6578c().mo6660a(applicationContext, appropriateImageUrl, appropriateFullView.getMessageImageView(), C1492a.NO_BOUNDS);
        }
        appropriateFullView.getFrameView().setOnClickListener(null);
        appropriateFullView.setMessageBackgroundColor(hVar.mo6800F());
        appropriateFullView.setFrameColor(hVar.mo6840d());
        appropriateFullView.setMessageButtons(hVar.mo6830H());
        appropriateFullView.setMessageCloseButtonColor(hVar.mo6839c());
        if (!equals) {
            appropriateFullView.setMessage(hVar.mo6811j());
            appropriateFullView.setMessageTextColor(hVar.mo6797C());
            appropriateFullView.setMessageHeaderText(hVar.mo6841e());
            appropriateFullView.setMessageHeaderTextColor(hVar.mo6843g());
            appropriateFullView.setMessageHeaderTextAlignment(hVar.mo6842f());
            appropriateFullView.setMessageTextAlign(hVar.mo6832a());
            appropriateFullView.resetMessageMargins(hVar.mo6812k());
            ((AppboyInAppMessageImageView) appropriateFullView.getMessageImageView()).setToHalfParentHeight(true);
        }
        resetLayoutParamsIfAppropriate(activity, hVar, appropriateFullView);
        View findViewById = appropriateFullView.findViewById(R$id.com_appboy_inappmessage_full_scrollview);
        if (findViewById != null) {
            final View view = (View) findViewById.getParent();
            final View view2 = findViewById;
            final AppboyInAppMessageFullView appboyInAppMessageFullView = appropriateFullView;
            C16031 r0 = new Runnable(this) {
                public void run() {
                    double d;
                    int height = view.getHeight() / 2;
                    if (hVar.mo6830H() == null || hVar.mo6830H().isEmpty()) {
                        d = ViewUtils.convertDpToPixels(applicationContext, 60.0d);
                    } else {
                        d = ViewUtils.convertDpToPixels(applicationContext, 124.0d);
                    }
                    ViewUtils.setHeightOnViewLayoutParams(view2, Math.min(view2.getHeight(), height - ((int) d)));
                    view2.requestLayout();
                    appboyInAppMessageFullView.getMessageImageView().requestLayout();
                }
            };
            findViewById.post(r0);
        }
        return appropriateFullView;
    }
}
