package com.appboy.p034ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.appboy.p025o.C1497e;
import com.appboy.p025o.p026k.C1506a;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1533c;
import com.appboy.p030r.C1534d;
import com.appboy.p030r.C1544n;
import com.appboy.p033s.C1554a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1558d;
import com.appboy.p033s.C1565k;
import com.appboy.p034ui.AppboyNavigator;
import com.appboy.p034ui.actions.ActionFactory;
import com.appboy.p034ui.actions.NewsfeedAction;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p034ui.inappmessage.InAppMessageCloser;

/* renamed from: com.appboy.ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener */
public class AppboyInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageViewLifecycleListener.class);

    /* renamed from: com.appboy.ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener$2 */
    static /* synthetic */ class C16052 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[C1506a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.appboy.o.k.a[] r0 = com.appboy.p025o.p026k.C1506a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction = r0
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$ClickAction     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.k.a r1 = com.appboy.p025o.p026k.C1506a.NEWS_FEED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$ClickAction     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.k.a r1 = com.appboy.p025o.p026k.C1506a.URI     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$ClickAction     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.k.a r1 = com.appboy.p025o.p026k.C1506a.NONE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p034ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener.C16052.<clinit>():void");
        }
    }

    private AppboyInAppMessageManager getInAppMessageManager() {
        return AppboyInAppMessageManager.getInstance();
    }

    private void performClickAction(C1506a aVar, C1532b bVar, InAppMessageCloser inAppMessageCloser, Uri uri, boolean z) {
        if (getInAppMessageManager().getActivity() == null) {
            C1557c.m7473e(TAG, "Can't perform click action because the cached activity is null.");
            return;
        }
        int i = C16052.$SwitchMap$com$appboy$enums$inappmessage$ClickAction[aVar.ordinal()];
        if (i == 1) {
            inAppMessageCloser.close(false);
            AppboyNavigator.getAppboyNavigator().gotoNewsFeed(getInAppMessageManager().getActivity(), new NewsfeedAction(C1558d.m7475a(bVar.getExtras()), C1497e.INAPP_MESSAGE));
        } else if (i == 2) {
            inAppMessageCloser.close(false);
            AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getActivity(), ActionFactory.createUriActionFromUri(uri, C1558d.m7475a(bVar.getExtras()), z, C1497e.INAPP_MESSAGE));
        } else if (i != 3) {
            inAppMessageCloser.close(false);
        } else {
            inAppMessageCloser.close(bVar.mo6819r());
        }
    }

    private void performInAppMessageButtonClicked(C1544n nVar, C1532b bVar, InAppMessageCloser inAppMessageCloser) {
        performClickAction(nVar.mo6846D(), bVar, inAppMessageCloser, nVar.getUri(), nVar.mo6850K());
    }

    private void performInAppMessageClicked(C1532b bVar, InAppMessageCloser inAppMessageCloser) {
        performClickAction(bVar.mo6798D(), bVar, inAppMessageCloser, bVar.getUri(), bVar.mo6817p());
    }

    private void startClearHtmlInAppMessageAssetsThread() {
        new Thread(new Runnable(this) {
            public void run() {
                Activity activity = AppboyInAppMessageManager.getInstance().getActivity();
                if (activity != null) {
                    C1554a.m7443a(C1565k.m7499a(activity));
                }
            }
        }).start();
    }

    public void afterClosed(C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (bVar instanceof C1533c) {
            startClearHtmlInAppMessageAssetsThread();
        }
        bVar.mo6826y();
    }

    public void afterOpened(View view, C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
    }

    public void beforeClosed(View view, C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
    }

    public void beforeOpened(View view, C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
        bVar.mo6827z();
    }

    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, C1544n nVar, C1534d dVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
        dVar.mo6831a(nVar);
        if (!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(nVar, inAppMessageCloser)) {
            performInAppMessageButtonClicked(nVar, dVar, inAppMessageCloser);
        }
    }

    public void onClicked(InAppMessageCloser inAppMessageCloser, View view, C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
        bVar.mo6822u();
        if (!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(bVar, inAppMessageCloser)) {
            performInAppMessageClicked(bVar, inAppMessageCloser);
        }
    }

    public void onDismissed(View view, C1532b bVar) {
        C1557c.m7458a(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(bVar);
    }
}
