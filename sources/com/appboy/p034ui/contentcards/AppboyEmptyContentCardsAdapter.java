package com.appboy.p034ui.contentcards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import com.appboy.p034ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter */
public class AppboyEmptyContentCardsAdapter extends C0797g<C0794d0> {

    /* renamed from: com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter$NetworkUnavailableViewHolder */
    class NetworkUnavailableViewHolder extends C0794d0 {
        NetworkUnavailableViewHolder(AppboyEmptyContentCardsAdapter appboyEmptyContentCardsAdapter, View view) {
            super(view);
        }
    }

    public int getItemCount() {
        return 1;
    }

    public void onBindViewHolder(C0794d0 d0Var, int i) {
    }

    public C0794d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NetworkUnavailableViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_content_cards_empty, viewGroup, false));
    }
}
