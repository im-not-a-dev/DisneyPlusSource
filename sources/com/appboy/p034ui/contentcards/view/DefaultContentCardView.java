package com.appboy.p034ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p034ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.view.DefaultContentCardView */
public class DefaultContentCardView extends BaseContentCardView<C1547c> {
    public DefaultContentCardView(Context context) {
        super(context);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, C1547c cVar) {
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        return new ContentCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_default_content_card, viewGroup, false), false);
    }
}
