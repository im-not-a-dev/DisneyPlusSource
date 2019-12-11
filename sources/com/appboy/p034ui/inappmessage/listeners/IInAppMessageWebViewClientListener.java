package com.appboy.p034ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.p030r.C1532b;

/* renamed from: com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener */
public interface IInAppMessageWebViewClientListener {
    void onCloseAction(C1532b bVar, String str, Bundle bundle);

    void onCustomEventAction(C1532b bVar, String str, Bundle bundle);

    void onNewsfeedAction(C1532b bVar, String str, Bundle bundle);

    void onOtherUrlAction(C1532b bVar, String str, Bundle bundle);
}
