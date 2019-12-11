package com.appboy.p034ui.inappmessage.listeners;

import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1544n;
import com.appboy.p034ui.inappmessage.InAppMessageCloser;
import com.appboy.p034ui.inappmessage.InAppMessageOperation;

/* renamed from: com.appboy.ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener */
public class AppboyDefaultInAppMessageManagerListener implements IInAppMessageManagerListener {
    public InAppMessageOperation beforeInAppMessageDisplayed(C1532b bVar) {
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public boolean onInAppMessageButtonClicked(C1544n nVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public boolean onInAppMessageClicked(C1532b bVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public void onInAppMessageDismissed(C1532b bVar) {
    }

    @Deprecated
    public boolean onInAppMessageReceived(C1532b bVar) {
        return false;
    }
}
