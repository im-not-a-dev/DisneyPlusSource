package com.appboy.p034ui.contentcards.listeners;

import android.content.Context;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p034ui.actions.IAction;

/* renamed from: com.appboy.ui.contentcards.listeners.IContentCardsActionListener */
public interface IContentCardsActionListener {
    boolean onContentCardClicked(Context context, C1547c cVar, IAction iAction);

    void onContentCardDismissed(Context context, C1547c cVar);
}
