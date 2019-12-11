package com.appboy.p034ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.C1440a;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.C1492a;
import com.appboy.p025o.C1497e;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.AppboyNavigator;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$string;
import com.appboy.p034ui.actions.ActionFactory;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.actions.UriAction;
import com.appboy.p034ui.feed.AppboyImageSwitcher;

/* renamed from: com.appboy.ui.widget.BaseCardView */
public abstract class BaseCardView<T extends C1547c> extends RelativeLayout {
    private static final String TAG = C1557c.m7461a(BaseCardView.class);
    private static Boolean sUnreadCardVisualIndicatorEnabled;
    protected C1489b mAppboyConfigurationProvider;
    protected T mCard;
    private final String mClassLogTag;
    /* access modifiers changed from: protected */
    public final Context mContext;
    protected AppboyImageSwitcher mImageSwitcher = ((AppboyImageSwitcher) findViewById(R$id.com_appboy_newsfeed_item_read_indicator_image_switcher));

    public BaseCardView(Context context) {
        super(context);
        this.mContext = context.getApplicationContext();
        if (this.mAppboyConfigurationProvider == null) {
            this.mAppboyConfigurationProvider = new C1489b(context);
        }
        if (sUnreadCardVisualIndicatorEnabled == null) {
            sUnreadCardVisualIndicatorEnabled = Boolean.valueOf(this.mAppboyConfigurationProvider.mo6720m());
        }
        this.mClassLogTag = C1557c.m7461a(getClass());
    }

    protected static UriAction getUriActionForCard(C1547c cVar) {
        Bundle bundle = new Bundle();
        for (String str : cVar.getExtras().keySet()) {
            bundle.putString(str, (String) cVar.getExtras().get(str));
        }
        return ActionFactory.createUriActionFromUrlString(cVar.mo6856O(), bundle, cVar.mo6881p(), C1497e.NEWS_FEED);
    }

    public String getClassLogTag() {
        return this.mClassLogTag;
    }

    /* access modifiers changed from: protected */
    public void handleCardClick(Context context, C1547c cVar, IAction iAction, String str) {
        cVar.mo6876d(true);
        if (iAction != null) {
            if (cVar.mo6882u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logged click for card: ");
                sb.append(cVar.mo6866K());
                C1557c.m7458a(str, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Logging click failed for card: ");
                sb2.append(cVar.mo6866K());
                C1557c.m7458a(str, sb2.toString());
            }
            if (isClickHandled(context, cVar, iAction)) {
                String str2 = TAG;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Card click was handled by custom listener for card: ");
                sb3.append(cVar.mo6866K());
                C1557c.m7458a(str2, sb3.toString());
            } else if (iAction instanceof UriAction) {
                AppboyNavigator.getAppboyNavigator().gotoUri(context, (UriAction) iAction);
            } else {
                String str3 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Executing non uri action for click on card: ");
                sb4.append(cVar.mo6866K());
                C1557c.m7458a(str3, sb4.toString());
                iAction.execute(context);
            }
        } else {
            String str4 = TAG;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Card action is null. Not performing any click action for card: ");
            sb5.append(cVar.mo6866K());
            C1557c.m7471d(str4, sb5.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean isClickHandled(Context context, C1547c cVar, IAction iAction);

    public boolean isUnreadIndicatorEnabled() {
        return sUnreadCardVisualIndicatorEnabled.booleanValue();
    }

    public void setCardViewedIndicator(AppboyImageSwitcher appboyImageSwitcher, C1547c cVar) {
        if (cVar == null) {
            C1557c.m7458a(getClassLogTag(), "The card is null. Not setting read/unread indicator.");
        } else if (appboyImageSwitcher != null) {
            String str = (String) appboyImageSwitcher.getTag(R$string.com_appboy_image_is_read_tag_key);
            if (str == null) {
                str = "";
            }
            if (cVar.mo6872R()) {
                String str2 = "icon_read";
                if (!str.equals(str2)) {
                    if (appboyImageSwitcher.getReadIcon() != null) {
                        appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getReadIcon());
                    } else {
                        appboyImageSwitcher.setImageResource(R$drawable.icon_read);
                    }
                    appboyImageSwitcher.setTag(R$string.com_appboy_image_is_read_tag_key, str2);
                }
            } else {
                String str3 = "icon_unread";
                if (!str.equals(str3)) {
                    if (appboyImageSwitcher.getUnReadIcon() != null) {
                        appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getUnReadIcon());
                    } else {
                        appboyImageSwitcher.setImageResource(R$drawable.icon_unread);
                    }
                    appboyImageSwitcher.setTag(R$string.com_appboy_image_is_read_tag_key, str3);
                }
            }
        }
    }

    public void setImageViewToUrl(final ImageView imageView, String str, final float f) {
        if (str == null) {
            C1557c.m7473e(TAG, "The image url to render is null. Not setting the card image.");
        } else if (f == 0.0f) {
            C1557c.m7473e(TAG, "The image aspect ratio is 0. Not setting the card image.");
        } else {
            if (!str.equals(imageView.getTag(R$string.com_appboy_image_resize_tag_key))) {
                if (f != 1.0f) {
                    ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                            public void onGlobalLayout() {
                                int width = imageView.getWidth();
                                imageView.setLayoutParams(new LayoutParams(width, (int) (((float) width) / f)));
                                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        });
                    }
                }
                imageView.setImageResource(17170445);
                C1440a.m6921c(getContext()).mo6578c().mo6660a(getContext(), str, imageView, C1492a.BASE_CARD_VIEW);
                imageView.setTag(R$string.com_appboy_image_resize_tag_key, str);
            }
        }
    }

    public void setOptionalTextView(TextView textView, String str) {
        String str2 = "";
        if (str == null || str.trim().equals(str2)) {
            textView.setText(str2);
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }
}
