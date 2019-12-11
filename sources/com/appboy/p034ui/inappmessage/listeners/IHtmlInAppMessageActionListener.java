package com.appboy.p034ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.p030r.C1532b;

/* renamed from: com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener */
public interface IHtmlInAppMessageActionListener {
    void onCloseClicked(C1532b bVar, String str, Bundle bundle);

    boolean onCustomEventFired(C1532b bVar, String str, Bundle bundle);

    boolean onNewsfeedClicked(C1532b bVar, String str, Bundle bundle);

    boolean onOtherUrlAction(C1532b bVar, String str, Bundle bundle);
}
