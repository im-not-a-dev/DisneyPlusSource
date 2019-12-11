package com.appboy.p034ui.inappmessage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.p026k.C1508c;
import com.appboy.p025o.p026k.C1514h;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1534d;
import com.appboy.p030r.C1543m;
import com.appboy.p030r.C1544n;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.p034ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks;
import com.appboy.p034ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.appboy.p034ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener;
import com.appboy.p034ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.p034ui.support.ViewUtils;
import java.util.List;
import p096e.p121h.p135s.C4128c;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4182s;
import p096e.p121h.p135s.C4187x;

/* renamed from: com.appboy.ui.inappmessage.InAppMessageViewWrapper */
public class InAppMessageViewWrapper implements IInAppMessageViewWrapper {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(InAppMessageViewWrapper.class);
    private final C1489b mAppboyConfigurationProvider;
    /* access modifiers changed from: private */
    public List<View> mButtons;
    private View mClickableInAppMessageView;
    private View mCloseButton;
    private final Animation mClosingAnimation;
    private FrameLayout mContentFrameLayout;
    /* access modifiers changed from: private */
    public Runnable mDismissRunnable;
    /* access modifiers changed from: private */
    public final C1532b mInAppMessage;
    /* access modifiers changed from: private */
    public final View mInAppMessageView;
    /* access modifiers changed from: private */
    public final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener;
    private boolean mIsAnimatingClose;
    private final Animation mOpeningAnimation;

    public InAppMessageViewWrapper(View view, C1532b bVar, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, C1489b bVar2, Animation animation, Animation animation2, View view2) {
        this.mInAppMessageView = view;
        this.mInAppMessage = bVar;
        this.mInAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.mAppboyConfigurationProvider = bVar2;
        this.mIsAnimatingClose = false;
        if (view2 != null) {
            this.mClickableInAppMessageView = view2;
        } else {
            this.mClickableInAppMessageView = this.mInAppMessageView;
        }
        if (this.mInAppMessage instanceof C1543m) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(view, null, createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            this.mClickableInAppMessageView.setOnTouchListener(touchAwareSwipeDismissTouchListener);
        }
        this.mOpeningAnimation = animation;
        this.mClosingAnimation = animation2;
        this.mClickableInAppMessageView.setOnClickListener(createClickListener());
    }

    /* access modifiers changed from: private */
    public void addDismissRunnable() {
        if (this.mDismissRunnable == null) {
            this.mDismissRunnable = new Runnable(this) {
                public void run() {
                    AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
                }
            };
            this.mInAppMessageView.postDelayed(this.mDismissRunnable, (long) this.mInAppMessage.mo6824w());
        }
    }

    /* access modifiers changed from: private */
    public void announceForAccessibilityIfNecessary() {
        View view = this.mInAppMessageView;
        if (view instanceof IInAppMessageImmersiveView) {
            view.announceForAccessibility(this.mInAppMessage.mo6811j());
        } else if (view instanceof AppboyInAppMessageHtmlBaseView) {
            view.announceForAccessibility("In-app message displayed.");
        }
    }

    /* access modifiers changed from: private */
    public void closeInAppMessageView() {
        C1557c.m7458a(TAG, "Closing in-app message view");
        ViewUtils.removeViewFromParent(this.mInAppMessageView);
        View view = this.mInAppMessageView;
        if (view instanceof AppboyInAppMessageHtmlBaseView) {
            AppboyInAppMessageHtmlBaseView appboyInAppMessageHtmlBaseView = (AppboyInAppMessageHtmlBaseView) view;
            if (appboyInAppMessageHtmlBaseView.getMessageWebView() != null) {
                C1557c.m7458a(TAG, "Called destroy on the AppboyInAppMessageHtmlBaseView WebView");
                appboyInAppMessageHtmlBaseView.getMessageWebView().destroy();
            }
        }
        this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessage);
    }

    private AnimationListener createAnimationListener(boolean z) {
        if (z) {
            return new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (InAppMessageViewWrapper.this.mInAppMessage.mo6813l() == C1508c.AUTO_DISMISS) {
                        InAppMessageViewWrapper.this.addDismissRunnable();
                    }
                    C1557c.m7458a(InAppMessageViewWrapper.TAG, "In-app message animated into view.");
                    ViewUtils.setFocusableInTouchModeAndRequestFocus(InAppMessageViewWrapper.this.mInAppMessageView);
                    InAppMessageViewWrapper.this.announceForAccessibilityIfNecessary();
                    InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.afterOpened(InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        return new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                InAppMessageViewWrapper.this.mInAppMessageView.clearAnimation();
                InAppMessageViewWrapper.this.mInAppMessageView.setVisibility(8);
                InAppMessageViewWrapper.this.closeInAppMessageView();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
    }

    private OnClickListener createButtonClickListener() {
        return new OnClickListener() {
            public void onClick(View view) {
                C1534d dVar = (C1534d) InAppMessageViewWrapper.this.mInAppMessage;
                for (int i = 0; i < InAppMessageViewWrapper.this.mButtons.size(); i++) {
                    if (view.getId() == ((View) InAppMessageViewWrapper.this.mButtons.get(i)).getId()) {
                        InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), (C1544n) dVar.mo6830H().get(i), dVar);
                        return;
                    }
                }
            }
        };
    }

    private OnClickListener createClickListener() {
        return new OnClickListener() {
            public void onClick(View view) {
                if (InAppMessageViewWrapper.this.mInAppMessage instanceof C1534d) {
                    C1534d dVar = (C1534d) InAppMessageViewWrapper.this.mInAppMessage;
                    if (dVar.mo6830H() == null || dVar.mo6830H().size() == 0) {
                        InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
                        return;
                    }
                    return;
                }
                InAppMessageViewWrapper.this.mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.this.mInAppMessageView, InAppMessageViewWrapper.this.mInAppMessage);
            }
        };
    }

    private OnClickListener createCloseInAppMessageClickListener() {
        return new OnClickListener(this) {
            public void onClick(View view) {
                AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    private DismissCallbacks createDismissCallbacks() {
        return new DismissCallbacks() {
            public boolean canDismiss(Object obj) {
                return true;
            }

            public void onDismiss(View view, Object obj) {
                InAppMessageViewWrapper.this.mInAppMessage.mo6806b(false);
                AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    private ITouchListener createTouchAwareListener() {
        return new ITouchListener() {
            public void onTouchEnded() {
                if (InAppMessageViewWrapper.this.mInAppMessage.mo6813l() == C1508c.AUTO_DISMISS) {
                    InAppMessageViewWrapper.this.addDismissRunnable();
                }
            }

            public void onTouchStartedOrContinued() {
                InAppMessageViewWrapper.this.mInAppMessageView.removeCallbacks(InAppMessageViewWrapper.this.mDismissRunnable);
            }
        };
    }

    private LayoutParams getLayoutParams(FrameLayout frameLayout, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        C1532b bVar = this.mInAppMessage;
        if (bVar instanceof C1543m) {
            layoutParams.gravity = ((C1543m) bVar).mo6845d() == C1514h.TOP ? 48 : 80;
        }
        if (i > 0 && i == frameLayout.getHeight()) {
            int topVisibleCoordinate = ViewUtils.getTopVisibleCoordinate(frameLayout);
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Detected status bar height of ");
            sb.append(topVisibleCoordinate);
            sb.append(".");
            C1557c.m7458a(str, sb.toString());
            layoutParams.setMargins(0, topVisibleCoordinate, 0, 0);
        }
        return layoutParams;
    }

    private static void setAllFrameLayoutChildrenAsAccessibilityAuto(FrameLayout frameLayout) {
        if (frameLayout == null) {
            C1557c.m7473e(TAG, "In-app message FrameLayout was null. Not preparing in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < frameLayout.getChildCount(); i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt != null) {
                C4187x.m14390g(childAt, 0);
            }
        }
    }

    private static void setAllFrameLayoutChildrenAsNonAccessibilityImportant(FrameLayout frameLayout) {
        if (frameLayout == null) {
            C1557c.m7473e(TAG, "In-app message FrameLayout was null. Not preparing in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < frameLayout.getChildCount(); i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt != null) {
                C4187x.m14390g(childAt, 4);
            }
        }
    }

    private void setAndStartAnimation(boolean z) {
        Animation animation;
        if (z) {
            animation = this.mOpeningAnimation;
        } else {
            animation = this.mClosingAnimation;
        }
        animation.setAnimationListener(createAnimationListener(z));
        this.mInAppMessageView.clearAnimation();
        this.mInAppMessageView.setAnimation(animation);
        animation.startNow();
        this.mInAppMessageView.invalidate();
    }

    public void close() {
        if (this.mAppboyConfigurationProvider.mo6719l()) {
            setAllFrameLayoutChildrenAsAccessibilityAuto(this.mContentFrameLayout);
        }
        this.mInAppMessageView.removeCallbacks(this.mDismissRunnable);
        this.mInAppMessageViewLifecycleListener.beforeClosed(this.mInAppMessageView, this.mInAppMessage);
        if (this.mInAppMessage.mo6819r()) {
            this.mIsAnimatingClose = true;
            setAndStartAnimation(false);
            return;
        }
        closeInAppMessageView();
    }

    public C1532b getInAppMessage() {
        return this.mInAppMessage;
    }

    public View getInAppMessageView() {
        return this.mInAppMessageView;
    }

    public boolean getIsAnimatingClose() {
        return this.mIsAnimatingClose;
    }

    public void open(Activity activity) {
        final FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView().findViewById(16908290);
        int height = frameLayout.getHeight();
        final int displayHeight = ViewUtils.getDisplayHeight(activity);
        if (this.mAppboyConfigurationProvider.mo6719l()) {
            this.mContentFrameLayout = frameLayout;
            setAllFrameLayoutChildrenAsNonAccessibilityImportant(this.mContentFrameLayout);
        }
        if (height == 0) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        String access$000 = InAppMessageViewWrapper.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Detected root view height of ");
                        sb.append(frameLayout.getHeight());
                        sb.append(", display height of ");
                        sb.append(displayHeight);
                        sb.append(" in onGlobalLayout");
                        C1557c.m7458a(access$000, sb.toString());
                        frameLayout.removeView(InAppMessageViewWrapper.this.mInAppMessageView);
                        InAppMessageViewWrapper.this.open(frameLayout, displayHeight);
                        frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
                return;
            }
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Detected root view height of ");
        sb.append(height);
        sb.append(", display height of ");
        sb.append(displayHeight);
        C1557c.m7458a(str, sb.toString());
        open(frameLayout, displayHeight);
    }

    /* access modifiers changed from: private */
    public void open(FrameLayout frameLayout, int i) {
        this.mInAppMessageViewLifecycleListener.beforeOpened(this.mInAppMessageView, this.mInAppMessage);
        C1557c.m7458a(TAG, "Adding In-app message view to root FrameLayout.");
        frameLayout.addView(this.mInAppMessageView, getLayoutParams(frameLayout, i));
        C4187x.m14345J(frameLayout);
        C4187x.m14361a((View) frameLayout, (C4182s) new C4182s() {
            public C4147h0 onApplyWindowInsets(View view, C4147h0 h0Var) {
                C4128c a = h0Var.mo14719a();
                if (a != null) {
                    ((LayoutParams) InAppMessageViewWrapper.this.mInAppMessageView.getLayoutParams()).setMargins(a.mo14692b(), a.mo14694d(), a.mo14693c(), a.mo14691a());
                }
                return h0Var;
            }
        });
        if (this.mInAppMessage.mo6823v()) {
            C1557c.m7458a(TAG, "In-app message view will animate into the visible area.");
            setAndStartAnimation(true);
            return;
        }
        C1557c.m7458a(TAG, "In-app message view will be placed instantly into the visible area.");
        if (this.mInAppMessage.mo6813l() == C1508c.AUTO_DISMISS) {
            addDismissRunnable();
        }
        ViewUtils.setFocusableInTouchModeAndRequestFocus(this.mInAppMessageView);
        announceForAccessibilityIfNecessary();
        this.mInAppMessageViewLifecycleListener.afterOpened(this.mInAppMessageView, this.mInAppMessage);
    }

    public InAppMessageViewWrapper(View view, C1532b bVar, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, C1489b bVar2, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        this(view, bVar, iInAppMessageViewLifecycleListener, bVar2, animation, animation2, view2);
        if (view3 != null) {
            this.mCloseButton = view3;
            this.mCloseButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        if (list != null) {
            this.mButtons = list;
            for (View onClickListener : this.mButtons) {
                onClickListener.setOnClickListener(createButtonClickListener());
            }
        }
    }
}
