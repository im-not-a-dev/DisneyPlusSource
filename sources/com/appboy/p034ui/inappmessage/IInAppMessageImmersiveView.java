package com.appboy.p034ui.inappmessage;

import android.view.View;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.IInAppMessageImmersiveView */
public interface IInAppMessageImmersiveView extends IInAppMessageView {
    List<View> getMessageButtonViews(int i);

    View getMessageCloseButtonView();
}
