package com.appboy.p034ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1549e;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.feed.view.BaseFeedCardView;

/* renamed from: com.appboy.ui.widget.ShortNewsCardView */
public class ShortNewsCardView extends BaseFeedCardView<C1549e> {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(ShortNewsCardView.class);
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_short_news_card;
    }

    public ShortNewsCardView(Context context, C1549e eVar) {
        super(context);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_short_news_card_description);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_short_news_card_title);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_short_news_card_domain);
        this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_short_news_card_imageview_stub);
        this.mImage.setScaleType(ScaleType.CENTER_CROP);
        this.mImage.setAdjustViewBounds(true);
        if (eVar != null) {
            setCard(eVar);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1549e eVar) {
        this.mDescription.setText(eVar.mo6884S());
        setOptionalTextView(this.mTitle, eVar.mo6887V());
        setOptionalTextView(this.mDomain, eVar.mo6885T());
        this.mCardAction = BaseCardView.getUriActionForCard(eVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                ShortNewsCardView shortNewsCardView = ShortNewsCardView.this;
                shortNewsCardView.handleCardClick(shortNewsCardView.mContext, eVar, shortNewsCardView.mCardAction, ShortNewsCardView.TAG);
            }
        });
        setImageViewToUrl(this.mImage, eVar.mo6886U(), 1.0f);
    }
}
