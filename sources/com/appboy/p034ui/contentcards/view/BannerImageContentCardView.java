package com.appboy.p034ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.p030r.p031o.C1545a;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.R$style;

/* renamed from: com.appboy.ui.contentcards.view.BannerImageContentCardView */
public class BannerImageContentCardView extends BaseContentCardView<C1545a> {

    /* renamed from: com.appboy.ui.contentcards.view.BannerImageContentCardView$ViewHolder */
    private class ViewHolder extends ContentCardViewHolder {
        private View mCardImage;

        ViewHolder(BannerImageContentCardView bannerImageContentCardView, View view) {
            super(view, bannerImageContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = createCardImageWithStyle(bannerImageContentCardView.getContext(), view, R$style.Appboy_ContentCards_BannerImage_ImageContainer_Image, R$id.com_appboy_content_cards_banner_image_card_image_container);
        }

        /* access modifiers changed from: 0000 */
        public ImageView getImageView() {
            View view = this.mCardImage;
            if (view instanceof ImageView) {
                return (ImageView) view;
            }
            return null;
        }
    }

    public BannerImageContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_banner_image_content_card, viewGroup, false);
        inflate.setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, C1545a aVar) {
        super.bindViewHolder(contentCardViewHolder, aVar);
        setOptionalCardImage(((ViewHolder) contentCardViewHolder).getImageView(), aVar.mo6857S(), aVar.mo6858T(), 6.0f);
    }
}
