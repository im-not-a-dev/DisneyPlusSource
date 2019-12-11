package com.appboy.p034ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.appboy.p030r.p031o.C1545a;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.feed.view.BaseFeedCardView;

/* renamed from: com.appboy.ui.widget.BannerImageCardView */
public class BannerImageCardView extends BaseFeedCardView<C1545a> {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(BannerImageCardView.class);
    private float mAspectRatio;
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, C1545a aVar) {
        super(context);
        this.mAspectRatio = 6.0f;
        this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_banner_image_card_imageview_stub);
        this.mImage.setScaleType(ScaleType.CENTER_CROP);
        this.mImage.setAdjustViewBounds(true);
        if (aVar != null) {
            setCard(aVar);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1545a aVar) {
        if (aVar.mo6857S() != 0.0f) {
            this.mAspectRatio = aVar.mo6857S();
        }
        setImageViewToUrl(this.mImage, aVar.mo6858T(), this.mAspectRatio);
        this.mCardAction = BaseCardView.getUriActionForCard(aVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                BannerImageCardView bannerImageCardView = BannerImageCardView.this;
                bannerImageCardView.handleCardClick(bannerImageCardView.mContext, aVar, bannerImageCardView.mCardAction, BannerImageCardView.TAG);
            }
        });
    }
}
