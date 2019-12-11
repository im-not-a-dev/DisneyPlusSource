package com.appboy.p034ui.inappmessage.listeners;

import android.view.View;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1534d;
import com.appboy.p030r.C1544n;
import com.appboy.p034ui.inappmessage.InAppMessageCloser;

/* renamed from: com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener */
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(C1532b bVar);

    void afterOpened(View view, C1532b bVar);

    void beforeClosed(View view, C1532b bVar);

    void beforeOpened(View view, C1532b bVar);

    void onButtonClicked(InAppMessageCloser inAppMessageCloser, C1544n nVar, C1534d dVar);

    void onClicked(InAppMessageCloser inAppMessageCloser, View view, C1532b bVar);

    void onDismissed(View view, C1532b bVar);
}
