package com.appboy.p034ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appboy.p030r.p031o.C1550f;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.R$drawable;
import com.appboy.p034ui.R$id;
import com.appboy.p034ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.view.TextAnnouncementContentCardView */
public class TextAnnouncementContentCardView extends BaseContentCardView<C1550f> {

    /* renamed from: com.appboy.ui.contentcards.view.TextAnnouncementContentCardView$ViewHolder */
    private class ViewHolder extends ContentCardViewHolder {
        private final TextView mDescription;
        private final TextView mTitle;

        ViewHolder(TextAnnouncementContentCardView textAnnouncementContentCardView, View view) {
            super(view, textAnnouncementContentCardView.isUnreadIndicatorEnabled());
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_text_announcement_card_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_text_announcement_card_description);
        }

        /* access modifiers changed from: 0000 */
        public TextView getDescription() {
            return this.mDescription;
        }

        /* access modifiers changed from: 0000 */
        public TextView getTitle() {
            return this.mTitle;
        }
    }

    public TextAnnouncementContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_text_announcement_content_card, viewGroup, false);
        inflate.setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, C1550f fVar) {
        super.bindViewHolder(contentCardViewHolder, fVar);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        viewHolder.getTitle().setText(fVar.mo6890U());
        viewHolder.getDescription().setText(fVar.mo6888S());
        viewHolder.setActionHintText(C1563i.m7490d(fVar.mo6889T()) ? fVar.mo6856O() : fVar.mo6889T());
    }
}
