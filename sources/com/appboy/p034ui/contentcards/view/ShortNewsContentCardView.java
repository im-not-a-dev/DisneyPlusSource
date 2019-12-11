package com.appboy.p034ui.contentcards.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1549e;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.R$style;

/* renamed from: com.appboy.ui.contentcards.view.ShortNewsContentCardView */
public class ShortNewsContentCardView extends BaseContentCardView<C1549e> {

    /* renamed from: com.appboy.ui.contentcards.view.ShortNewsContentCardView$ViewHolder */
    private class ViewHolder extends ContentCardViewHolder {
        private View mCardImage;
        private final TextView mDescription;
        private final TextView mTitle;

        ViewHolder(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = createCardImageWithStyle(shortNewsContentCardView.getContext(), view, R$style.Appboy_ContentCards_ShortNews_ImageContainer_Image, R$id.com_appboy_content_cards_short_news_card_image_container);
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_short_news_card_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_short_news_card_description);
        }

        /* access modifiers changed from: 0000 */
        public TextView getDescription() {
            return this.mDescription;
        }

        /* access modifiers changed from: 0000 */
        public ImageView getImageView() {
            View view = this.mCardImage;
            if (view instanceof ImageView) {
                return (ImageView) view;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public TextView getTitle() {
            return this.mTitle;
        }
    }

    public ShortNewsContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_short_news_content_card, viewGroup, false);
        inflate.setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, C1549e eVar) {
        super.bindViewHolder(contentCardViewHolder, eVar);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        viewHolder.getTitle().setText(eVar.mo6887V());
        viewHolder.getDescription().setText(eVar.mo6884S());
        viewHolder.setActionHintText(C1563i.m7490d(eVar.mo6885T()) ? eVar.mo6856O() : eVar.mo6885T());
        setOptionalCardImage(viewHolder.getImageView(), 1.0f, eVar.mo6886U(), 1.0f);
        if (VERSION.SDK_INT >= 21) {
            safeSetClipToOutline(viewHolder.getImageView());
        }
    }
}
