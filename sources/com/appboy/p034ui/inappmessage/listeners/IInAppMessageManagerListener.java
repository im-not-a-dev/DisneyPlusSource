package com.appboy.p034ui.inappmessage.listeners;

import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1544n;
import com.appboy.p034ui.inappmessage.InAppMessageCloser;
import com.appboy.p034ui.inappmessage.InAppMessageOperation;

/* renamed from: com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener */
public interface IInAppMessageManagerListener {
    InAppMessageOperation beforeInAppMessageDisplayed(C1532b bVar);

    boolean onInAppMessageButtonClicked(C1544n nVar, InAppMessageCloser inAppMessageCloser);

    boolean onInAppMessageClicked(C1532b bVar, InAppMessageCloser inAppMessageCloser);

    void onInAppMessageDismissed(C1532b bVar);

    @Deprecated
    boolean onInAppMessageReceived(C1532b bVar);
}
