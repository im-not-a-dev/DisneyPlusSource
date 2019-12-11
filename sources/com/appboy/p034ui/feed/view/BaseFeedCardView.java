package com.appboy.p034ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.feed.AppboyFeedManager;
import com.appboy.p034ui.feed.AppboyImageSwitcher;
import com.appboy.p034ui.widget.BaseCardView;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.appboy.ui.feed.view.BaseFeedCardView */
public abstract class BaseFeedCardView<T extends C1547c> extends BaseCardView<T> implements Observer {
    static {
        C1557c.m7461a(BaseCardView.class);
    }

    public BaseFeedCardView(Context context) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher = this.mImageSwitcher;
        if (appboyImageSwitcher != null) {
            appboyImageSwitcher.setFactory(new ViewFactory() {
                public View makeView() {
                    return new ImageView(BaseFeedCardView.this.mContext.getApplicationContext());
                }
            });
        }
        if (!isUnreadIndicatorEnabled()) {
            AppboyImageSwitcher appboyImageSwitcher2 = this.mImageSwitcher;
            if (appboyImageSwitcher2 != null) {
                appboyImageSwitcher2.setVisibility(8);
            }
        }
    }

    public C1547c getCard() {
        return this.mCard;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(R$id.com_appboy_stubbed_feed_image_view);
    }

    /* access modifiers changed from: protected */
    public boolean isClickHandled(Context context, C1547c cVar, IAction iAction) {
        return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, cVar, iAction);
    }

    /* access modifiers changed from: protected */
    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.mCard = t;
        onSetCard(t);
        t.addObserver(this);
        setCardViewedIndicator(this.mImageSwitcher, getCard());
    }

    public void update(Observable observable, Object obj) {
        setCardViewedIndicator(this.mImageSwitcher, getCard());
    }
}
