package com.appboy.p034ui.inappmessage;

/* renamed from: com.appboy.ui.inappmessage.InAppMessageCloser */
public class InAppMessageCloser {
    private InAppMessageViewWrapper mInAppMessageViewWrapper;

    public InAppMessageCloser(InAppMessageViewWrapper inAppMessageViewWrapper) {
        this.mInAppMessageViewWrapper = inAppMessageViewWrapper;
    }

    public void close(boolean z) {
        if (z) {
            this.mInAppMessageViewWrapper.getInAppMessage().mo6806b(true);
        } else {
            this.mInAppMessageViewWrapper.getInAppMessage().mo6806b(false);
        }
        this.mInAppMessageViewWrapper.close();
    }
}
