package com.appboy.p034ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1546b;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;
import com.appboy.p034ui.R$style;

/* renamed from: com.appboy.ui.contentcards.view.CaptionedImageContentCardView */
public class CaptionedImageContentCardView extends BaseContentCardView<C1546b> {

    /* renamed from: com.appboy.ui.contentcards.view.CaptionedImageContentCardView$ViewHolder */
    private class ViewHolder extends ContentCardViewHolder {
        private View mCardImage;
        private final TextView mDescription;
        private final TextView mTitle;

        ViewHolder(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = createCardImageWithStyle(captionedImageContentCardView.getContext(), view, R$style.Appboy_ContentCards_CaptionedImage_ImageContainer_Image, R$id.com_appboy_content_cards_captioned_image_card_image_container);
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_captioned_image_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_captioned_image_description);
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

    public CaptionedImageContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_captioned_image_content_card, viewGroup, false);
        inflate.setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, C1546b bVar) {
        super.bindViewHolder(contentCardViewHolder, bVar);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        viewHolder.getTitle().setText(bVar.mo6864W());
        viewHolder.getDescription().setText(bVar.mo6861T());
        viewHolder.setActionHintText(C1563i.m7490d(bVar.mo6862U()) ? bVar.mo6856O() : bVar.mo6862U());
        setOptionalCardImage(viewHolder.getImageView(), bVar.mo6860S(), bVar.mo6863V(), 1.3333334f);
    }
}
