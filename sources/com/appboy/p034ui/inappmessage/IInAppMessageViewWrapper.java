package com.appboy.p034ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.appboy.p030r.C1532b;

/* renamed from: com.appboy.ui.inappmessage.IInAppMessageViewWrapper */
public interface IInAppMessageViewWrapper {
    void close();

    C1532b getInAppMessage();

    View getInAppMessageView();

    boolean getIsAnimatingClose();

    void open(Activity activity);
}
