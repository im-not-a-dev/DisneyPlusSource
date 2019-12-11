package com.appboy.p034ui.contentcards.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.actions.UriAction;
import com.appboy.p034ui.contentcards.AppboyContentCardsManager;
import com.appboy.p034ui.widget.BaseCardView;

/* renamed from: com.appboy.ui.contentcards.view.BaseContentCardView */
public abstract class BaseContentCardView<T extends C1547c> extends BaseCardView<T> {
    public BaseContentCardView(Context context) {
        super(context);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, final T t) {
        contentCardViewHolder.setPinnedIconVisible(t.mo6868M());
        boolean z = true;
        contentCardViewHolder.setUnreadBarVisible(this.mAppboyConfigurationProvider.mo6733z() && !t.mo6872R());
        final UriAction uriActionForCard = BaseCardView.getUriActionForCard(t);
        contentCardViewHolder.itemView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                BaseContentCardView baseContentCardView = BaseContentCardView.this;
                baseContentCardView.handleCardClick(baseContentCardView.mContext, t, uriActionForCard, BaseContentCardView.this.getClassLogTag());
            }
        });
        if (uriActionForCard == null) {
            z = false;
        }
        contentCardViewHolder.setActionHintVisible(z);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public boolean isClickHandled(Context context, C1547c cVar, IAction iAction) {
        return AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardClicked(context, cVar, iAction);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public void setOptionalCardImage(ImageView imageView, float f, String str, float f2) {
        if (f == 0.0f) {
            f = f2;
        }
        if (imageView != null) {
            setImageViewToUrl(imageView, str, f);
        }
    }
}
