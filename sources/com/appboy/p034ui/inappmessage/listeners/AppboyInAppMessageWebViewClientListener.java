package com.appboy.p034ui.inappmessage.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.C1440a;
import com.appboy.p025o.C1497e;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1533c;
import com.appboy.p030r.p032p.C1551a;
import com.appboy.p033s.C1554a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1558d;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.AppboyNavigator;
import com.appboy.p034ui.actions.ActionFactory;
import com.appboy.p034ui.actions.NewsfeedAction;
import com.appboy.p034ui.actions.UriAction;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;

/* renamed from: com.appboy.ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener */
public class AppboyInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageWebViewClientListener.class);

    private AppboyInAppMessageManager getInAppMessageManager() {
        return AppboyInAppMessageManager.getInstance();
    }

    private void logHtmlInAppMessageClick(C1532b bVar, Bundle bundle) {
        if (bundle != null) {
            String str = "abButtonId";
            if (bundle.containsKey(str)) {
                ((C1533c) bVar).mo6828c(bundle.getString(str));
                return;
            }
        }
        bVar.mo6822u();
    }

    static String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return bundle.getString("name");
    }

    static C1551a parsePropertiesFromQueryBundle(Bundle bundle) {
        C1551a aVar = new C1551a();
        for (String str : bundle.keySet()) {
            if (!str.equals("name")) {
                String string = bundle.getString(str, null);
                if (!C1563i.m7490d(string)) {
                    aVar.mo6892a(str, string);
                }
            }
        }
        return aVar;
    }

    static boolean parseUseWebViewFromQueryBundle(C1532b bVar, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        String str = "abDeepLink";
        if (bundle.containsKey(str)) {
            z = Boolean.parseBoolean(bundle.getString(str));
            z2 = true;
        } else {
            z2 = false;
            z = false;
        }
        String str2 = "abExternalOpen";
        if (bundle.containsKey(str2)) {
            z3 = Boolean.parseBoolean(bundle.getString(str2));
            z2 = true;
        } else {
            z3 = false;
        }
        boolean p = bVar.mo6817p();
        if (z2) {
            return !z && !z3;
        }
        return p;
    }

    public void onCloseAction(C1532b bVar, String str, Bundle bundle) {
        C1557c.m7458a(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
        logHtmlInAppMessageClick(bVar, bundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(bVar, str, bundle);
    }

    public void onCustomEventAction(C1532b bVar, String str, Bundle bundle) {
        C1557c.m7458a(TAG, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            C1557c.m7473e(TAG, "Can't perform custom event action because the activity is null.");
            return;
        }
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(bVar, str, bundle)) {
            String parseCustomEventNameFromQueryBundle = parseCustomEventNameFromQueryBundle(bundle);
            if (!C1563i.m7490d(parseCustomEventNameFromQueryBundle)) {
                C1440a.m6921c((Context) getInAppMessageManager().getActivity()).mo6564a(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle(bundle));
            }
        }
    }

    public void onNewsfeedAction(C1532b bVar, String str, Bundle bundle) {
        C1557c.m7458a(TAG, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            C1557c.m7473e(TAG, "Can't perform news feed action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(bVar, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(bVar, str, bundle)) {
            bVar.mo6806b(false);
            getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
            AppboyNavigator.getAppboyNavigator().gotoNewsFeed(getInAppMessageManager().getActivity(), new NewsfeedAction(C1558d.m7475a(bVar.getExtras()), C1497e.INAPP_MESSAGE));
        }
    }

    public void onOtherUrlAction(C1532b bVar, String str, Bundle bundle) {
        C1557c.m7458a(TAG, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            C1557c.m7473e(TAG, "Can't perform other url action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(bVar, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(bVar, str, bundle)) {
            boolean parseUseWebViewFromQueryBundle = parseUseWebViewFromQueryBundle(bVar, bundle);
            Bundle a = C1558d.m7475a(bVar.getExtras());
            a.putAll(bundle);
            UriAction createUriActionFromUrlString = ActionFactory.createUriActionFromUrlString(str, a, parseUseWebViewFromQueryBundle, C1497e.INAPP_MESSAGE);
            Uri uri = createUriActionFromUrlString.getUri();
            if (uri == null || !C1554a.m7444a(uri)) {
                bVar.mo6806b(false);
                getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
                if (createUriActionFromUrlString != null) {
                    AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getApplicationContext(), createUriActionFromUrlString);
                }
            } else {
                String str2 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Not passing local URI to AppboyNavigator. Got local uri: ");
                sb.append(uri);
                C1557c.m7473e(str2, sb.toString());
            }
        }
    }
}
