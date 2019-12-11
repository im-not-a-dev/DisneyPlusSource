package com.appboy.p034ui.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1546b;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.actions.IAction;
import com.appboy.p034ui.feed.view.BaseFeedCardView;

/* renamed from: com.appboy.ui.widget.CaptionedImageCardView */
public class CaptionedImageCardView extends BaseFeedCardView<C1546b> {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(CaptionedImageCardView.class);
    private float mAspectRatio;
    /* access modifiers changed from: private */
    public IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return R$layout.com_appboy_captioned_image_card;
    }

    public CaptionedImageCardView(Context context, C1546b bVar) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        this.mImage = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_captioned_image_card_imageview_stub);
        this.mImage.setScaleType(ScaleType.CENTER_CROP);
        this.mImage.setAdjustViewBounds(true);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_captioned_image_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_captioned_image_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_captioned_image_card_domain);
        if (bVar != null) {
            setCard(bVar);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(final C1546b bVar) {
        this.mTitle.setText(bVar.mo6864W());
        this.mDescription.setText(bVar.mo6861T());
        setOptionalTextView(this.mDomain, bVar.mo6862U());
        this.mCardAction = BaseCardView.getUriActionForCard(bVar);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                CaptionedImageCardView captionedImageCardView = CaptionedImageCardView.this;
                captionedImageCardView.handleCardClick(captionedImageCardView.mContext, bVar, captionedImageCardView.mCardAction, CaptionedImageCardView.TAG);
            }
        });
        if (bVar.mo6860S() != 0.0f) {
            this.mAspectRatio = bVar.mo6860S();
        }
        setImageViewToUrl(this.mImage, bVar.mo6863V(), this.mAspectRatio);
    }
}
