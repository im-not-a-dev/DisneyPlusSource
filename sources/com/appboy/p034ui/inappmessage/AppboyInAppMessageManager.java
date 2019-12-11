package com.appboy.p034ui.inappmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.C1440a;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.p026k.C1510e;
import com.appboy.p025o.p026k.C1513g;
import com.appboy.p027p.C1518c;
import com.appboy.p027p.C1519d;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1538h;
import com.appboy.p030r.C1540j;
import com.appboy.p030r.C1541k;
import com.appboy.p030r.C1542l;
import com.appboy.p030r.C1543m;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.inappmessage.factories.AppboyFullViewFactory;
import com.appboy.p034ui.inappmessage.factories.AppboyHtmlFullViewFactory;
import com.appboy.p034ui.inappmessage.factories.AppboyInAppMessageAnimationFactory;
import com.appboy.p034ui.inappmessage.factories.AppboyModalViewFactory;
import com.appboy.p034ui.inappmessage.factories.AppboySlideupViewFactory;
import com.appboy.p034ui.inappmessage.listeners.AppboyDefaultHtmlInAppMessageActionListener;
import com.appboy.p034ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener;
import com.appboy.p034ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener;
import com.appboy.p034ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener;
import com.appboy.p034ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.p034ui.support.ViewUtils;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManager */
public final class AppboyInAppMessageManager {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageManager.class);
    private static volatile AppboyInAppMessageManager sInstance = null;
    private Activity mActivity;
    private C1489b mAppboyConfigurationProvider;
    private Context mApplicationContext;
    private C1532b mCarryoverInAppMessage;
    private IInAppMessageManagerListener mCustomControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory;
    private IInAppMessageManagerListener mCustomInAppMessageManagerListener;
    private IInAppMessageViewFactory mCustomInAppMessageViewFactory;
    private IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener = new AppboyDefaultHtmlInAppMessageActionListener();
    private IInAppMessageManagerListener mDefaultInAppMessageManagerListener = new AppboyDefaultInAppMessageManagerListener();
    private AtomicBoolean mDisplayingInAppMessage = new AtomicBoolean(false);
    private IInAppMessageAnimationFactory mInAppMessageAnimationFactory = new AppboyInAppMessageAnimationFactory();
    private C1518c<C1519d> mInAppMessageEventSubscriber;
    private IInAppMessageViewFactory mInAppMessageFullViewFactory = new AppboyFullViewFactory();
    private IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory = new AppboyHtmlFullViewFactory(this.mInAppMessageWebViewClientListener);
    private IInAppMessageViewFactory mInAppMessageModalViewFactory = new AppboyModalViewFactory();
    private IInAppMessageViewFactory mInAppMessageSlideupViewFactory = new AppboySlideupViewFactory();
    private final Stack<C1532b> mInAppMessageStack = new Stack<>();
    private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener = new AppboyInAppMessageViewLifecycleListener();
    private IInAppMessageViewWrapper mInAppMessageViewWrapper;
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener = new AppboyInAppMessageWebViewClientListener();
    private Integer mOriginalOrientation;
    private C1532b mUnRegisteredInAppMessage;

    /* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageManager$3 */
    static /* synthetic */ class C15923 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = new int[InAppMessageOperation.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.appboy.ui.inappmessage.InAppMessageOperation[] r0 = com.appboy.p034ui.inappmessage.InAppMessageOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = r0
                int[] r0 = $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p034ui.inappmessage.InAppMessageOperation.DISPLAY_NOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p034ui.inappmessage.InAppMessageOperation.DISPLAY_LATER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.ui.inappmessage.InAppMessageOperation r1 = com.appboy.p034ui.inappmessage.InAppMessageOperation.DISCARD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p034ui.inappmessage.AppboyInAppMessageManager.C15923.<clinit>():void");
        }
    }

    private C1518c<C1519d> createInAppMessageEventSubscriber() {
        return new C1518c<C1519d>() {
            public void trigger(C1519d dVar) {
                if (!AppboyInAppMessageManager.this.getInAppMessageManagerListener().onInAppMessageReceived(dVar.mo6764a())) {
                    AppboyInAppMessageManager.this.addInAppMessage(dVar.mo6764a());
                }
            }
        };
    }

    private boolean currentOrientationIsValid(int i, C1513g gVar) {
        if (i == 2 && gVar == C1513g.LANDSCAPE) {
            C1557c.m7458a(TAG, "Current and preferred orientation are landscape.");
            return true;
        } else if (i == 1 && gVar == C1513g.PORTRAIT) {
            C1557c.m7458a(TAG, "Current and preferred orientation are portrait.");
            return true;
        } else {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Current orientation ");
            sb.append(i);
            sb.append(" and preferred orientation ");
            sb.append(gVar);
            sb.append(" don't match");
            C1557c.m7458a(str, sb.toString());
            return false;
        }
    }

    private IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.mCustomInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory != null ? iInAppMessageAnimationFactory : this.mInAppMessageAnimationFactory;
    }

    private IInAppMessageViewFactory getInAppMessageViewFactory(C1532b bVar) {
        IInAppMessageViewFactory iInAppMessageViewFactory = this.mCustomInAppMessageViewFactory;
        if (iInAppMessageViewFactory != null) {
            return iInAppMessageViewFactory;
        }
        if (bVar instanceof C1543m) {
            return this.mInAppMessageSlideupViewFactory;
        }
        if (bVar instanceof C1542l) {
            return this.mInAppMessageModalViewFactory;
        }
        if (bVar instanceof C1538h) {
            return this.mInAppMessageFullViewFactory;
        }
        if (bVar instanceof C1540j) {
            return this.mInAppMessageHtmlFullViewFactory;
        }
        return null;
    }

    public static AppboyInAppMessageManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyInAppMessageManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyInAppMessageManager();
                }
            }
        }
        return sInstance;
    }

    public void addInAppMessage(C1532b bVar) {
        this.mInAppMessageStack.push(bVar);
        requestDisplayInAppMessage();
    }

    /* access modifiers changed from: 0000 */
    public boolean displayInAppMessage(C1532b bVar, boolean z) {
        C1532b bVar2 = bVar;
        if (!this.mDisplayingInAppMessage.compareAndSet(false, true)) {
            C1557c.m7458a(TAG, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
            this.mInAppMessageStack.push(bVar2);
            return false;
        }
        try {
            if (this.mActivity != null) {
                if (!z) {
                    long s = bVar.mo6820s();
                    if (s > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > s) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("In-app message is expired. Doing nothing. Expiration: $");
                            sb.append(s);
                            sb.append(". Current time: ");
                            sb.append(currentTimeMillis);
                            throw new Exception(sb.toString());
                        }
                    } else {
                        C1557c.m7458a(TAG, "Expiration timestamp not defined. Continuing.");
                    }
                } else {
                    C1557c.m7458a(TAG, "Not checking expiration status for carry-over in-app message.");
                }
                if (!verifyOrientationStatus(bVar)) {
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                } else if (bVar.mo6814m()) {
                    C1557c.m7458a(TAG, "Not displaying control in-app message. Logging impression and ending display execution.");
                    bVar.mo6827z();
                    resetAfterInAppMessageClose();
                    return true;
                } else {
                    IInAppMessageViewFactory inAppMessageViewFactory = getInAppMessageViewFactory(bVar);
                    if (inAppMessageViewFactory != null) {
                        View createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(this.mActivity, bVar2);
                        if (createInAppMessageView == null) {
                            bVar2.mo6804a(C1510e.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        } else if (createInAppMessageView.getParent() == null) {
                            Animation openingAnimation = getInAppMessageAnimationFactory().getOpeningAnimation(bVar2);
                            Animation closingAnimation = getInAppMessageAnimationFactory().getClosingAnimation(bVar2);
                            if (createInAppMessageView instanceof IInAppMessageImmersiveView) {
                                C1557c.m7458a(TAG, "Creating view wrapper for immersive in-app message.");
                                IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                                C1541k kVar = (C1541k) bVar2;
                                InAppMessageViewWrapper inAppMessageViewWrapper = new InAppMessageViewWrapper(createInAppMessageView, bVar, this.mInAppMessageViewLifecycleListener, this.mAppboyConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(kVar.mo6830H() != null ? kVar.mo6830H().size() : 0), iInAppMessageImmersiveView.getMessageCloseButtonView());
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper;
                            } else if (createInAppMessageView instanceof IInAppMessageView) {
                                C1557c.m7458a(TAG, "Creating view wrapper for base in-app message.");
                                InAppMessageViewWrapper inAppMessageViewWrapper2 = new InAppMessageViewWrapper(createInAppMessageView, bVar, this.mInAppMessageViewLifecycleListener, this.mAppboyConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper2;
                            } else {
                                C1557c.m7458a(TAG, "Creating view wrapper for in-app message.");
                                InAppMessageViewWrapper inAppMessageViewWrapper3 = new InAppMessageViewWrapper(createInAppMessageView, bVar, this.mInAppMessageViewLifecycleListener, this.mAppboyConfigurationProvider, openingAnimation, closingAnimation, createInAppMessageView);
                                this.mInAppMessageViewWrapper = inAppMessageViewWrapper3;
                            }
                            this.mInAppMessageViewWrapper.open(this.mActivity);
                            return true;
                        } else {
                            bVar2.mo6804a(C1510e.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                    } else {
                        bVar2.mo6804a(C1510e.DISPLAY_VIEW_GENERATION);
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                }
            } else {
                this.mCarryoverInAppMessage = bVar2;
                throw new Exception("No activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
            }
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Could not display in-app message", e);
            resetAfterInAppMessageClose();
            return false;
        }
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        if (this.mInAppMessageEventSubscriber == null) {
            C1557c.m7458a(TAG, "Subscribing in-app message event subscriber");
            this.mInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
            C1440a.m6921c(context).mo6579c(this.mInAppMessageEventSubscriber);
        }
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.mCustomControlInAppMessageManagerListener;
        return iInAppMessageManagerListener != null ? iInAppMessageManagerListener : this.mDefaultInAppMessageManagerListener;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.mCustomHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener != null ? iHtmlInAppMessageActionListener : this.mDefaultHtmlInAppMessageActionListener;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.mCustomInAppMessageManagerListener;
        return iInAppMessageManagerListener != null ? iInAppMessageManagerListener : this.mDefaultInAppMessageManagerListener;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z) {
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z) {
                this.mInAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public void registerInAppMessageManager(Activity activity) {
        C1557c.m7458a(TAG, "registerInAppMessageManager called");
        this.mActivity = activity;
        Activity activity2 = this.mActivity;
        if (activity2 != null && this.mApplicationContext == null) {
            this.mApplicationContext = activity2.getApplicationContext();
        }
        if (this.mAppboyConfigurationProvider == null) {
            this.mAppboyConfigurationProvider = new C1489b(this.mApplicationContext);
        }
        if (this.mCarryoverInAppMessage != null) {
            C1557c.m7458a(TAG, "Requesting display of carryover in-app message.");
            this.mCarryoverInAppMessage.mo6807c(false);
            displayInAppMessage(this.mCarryoverInAppMessage, true);
            this.mCarryoverInAppMessage = null;
        } else if (this.mUnRegisteredInAppMessage != null) {
            C1557c.m7458a(TAG, "Adding previously unregistered in-app message.");
            addInAppMessage(this.mUnRegisteredInAppMessage);
            this.mUnRegisteredInAppMessage = null;
        }
        ensureSubscribedToInAppMessageEvents(this.mApplicationContext);
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperation;
        try {
            if (this.mActivity == null) {
                if (!this.mInAppMessageStack.empty()) {
                    C1557c.m7473e(TAG, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
                    this.mUnRegisteredInAppMessage = (C1532b) this.mInAppMessageStack.pop();
                } else {
                    C1557c.m7458a(TAG, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
                }
                return false;
            } else if (this.mDisplayingInAppMessage.get()) {
                C1557c.m7458a(TAG, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
                return false;
            } else if (this.mInAppMessageStack.isEmpty()) {
                C1557c.m7458a(TAG, "The in-app message stack is empty. No in-app message will be displayed.");
                return false;
            } else {
                final C1532b bVar = (C1532b) this.mInAppMessageStack.pop();
                if (!bVar.mo6814m()) {
                    inAppMessageOperation = getInAppMessageManagerListener().beforeInAppMessageDisplayed(bVar);
                } else {
                    C1557c.m7458a(TAG, "Using the control in-app message manager listener.");
                    inAppMessageOperation = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(bVar);
                }
                int i = C15923.$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[inAppMessageOperation.ordinal()];
                if (i == 1) {
                    C1557c.m7458a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
                    new Handler(this.mApplicationContext.getMainLooper()).post(new Runnable(this) {
                        public void run() {
                            new AppboyAsyncInAppMessageDisplayer().execute(new C1532b[]{bVar});
                        }
                    });
                    return true;
                } else if (i == 2) {
                    C1557c.m7458a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
                    this.mInAppMessageStack.push(bVar);
                    return false;
                } else if (i != 3) {
                    C1557c.m7465b(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
                    return false;
                } else {
                    C1557c.m7458a(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
                    return false;
                }
            }
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Error running requestDisplayInAppMessage", e);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        C1557c.m7471d(TAG, "Resetting after in-app message close.");
        this.mInAppMessageViewWrapper = null;
        this.mDisplayingInAppMessage.set(false);
        if (this.mActivity != null && this.mOriginalOrientation != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting requested orientation to original orientation ");
            sb.append(this.mOriginalOrientation);
            C1557c.m7458a(str, sb.toString());
            ViewUtils.setActivityRequestedOrientation(this.mActivity, this.mOriginalOrientation.intValue());
            this.mOriginalOrientation = null;
        }
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        C1557c.m7458a(TAG, "Custom InAppMessageManagerListener set");
        this.mCustomInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void unregisterInAppMessageManager(Activity activity) {
        C1557c.m7458a(TAG, "unregisterInAppMessageManager called");
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.mInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            ViewUtils.removeViewFromParent(iInAppMessageViewWrapper.getInAppMessageView());
            if (this.mInAppMessageViewWrapper.getIsAnimatingClose()) {
                this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessageViewWrapper.getInAppMessage());
                this.mCarryoverInAppMessage = null;
            } else {
                this.mCarryoverInAppMessage = this.mInAppMessageViewWrapper.getInAppMessage();
            }
            this.mInAppMessageViewWrapper = null;
        } else {
            this.mCarryoverInAppMessage = null;
        }
        this.mActivity = null;
        this.mDisplayingInAppMessage.set(false);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(C1532b bVar) {
        if (ViewUtils.isRunningOnTablet(this.mActivity)) {
            C1557c.m7458a(TAG, "Running on tablet. In-app message can be displayed in any orientation.");
            return true;
        }
        C1513g t = bVar.mo6821t();
        if (t == null) {
            C1557c.m7458a(TAG, "No orientation specified. In-app message can be displayed in any orientation.");
            return true;
        } else if (t == C1513g.ANY) {
            C1557c.m7458a(TAG, "Any orientation specified. In-app message can be displayed in any orientation.");
            return true;
        } else if (!currentOrientationIsValid(this.mActivity.getResources().getConfiguration().orientation, t)) {
            return false;
        } else {
            if (this.mOriginalOrientation == null) {
                C1557c.m7458a(TAG, "Requesting orientation lock.");
                this.mOriginalOrientation = Integer.valueOf(this.mActivity.getRequestedOrientation());
                ViewUtils.setActivityRequestedOrientation(this.mActivity, 14);
            }
            return true;
        }
    }
}
