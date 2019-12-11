package com.appboy.p034ui.contentcards.handlers;

import android.content.Context;
import android.view.ViewGroup;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p034ui.contentcards.view.ContentCardViewHolder;
import java.util.List;

/* renamed from: com.appboy.ui.contentcards.handlers.IContentCardsViewBindingHandler */
public interface IContentCardsViewBindingHandler {
    int getItemViewType(Context context, List<C1547c> list, int i);

    void onBindViewHolder(Context context, List<C1547c> list, ContentCardViewHolder contentCardViewHolder, int i);

    ContentCardViewHolder onCreateViewHolder(Context context, List<C1547c> list, ViewGroup viewGroup, int i);
}
