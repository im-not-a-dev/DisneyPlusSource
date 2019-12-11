package com.appboy.p034ui.contentcards;

import com.appboy.p034ui.contentcards.listeners.AppboyContentCardsActionListener;
import com.appboy.p034ui.contentcards.listeners.IContentCardsActionListener;

/* renamed from: com.appboy.ui.contentcards.AppboyContentCardsManager */
public class AppboyContentCardsManager {
    private static volatile AppboyContentCardsManager sInstance;
    private IContentCardsActionListener mCustomContentCardsActionListener;
    private IContentCardsActionListener mDefaultContentCardsActionListener = new AppboyContentCardsActionListener();

    public static AppboyContentCardsManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyContentCardsManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyContentCardsManager();
                }
            }
        }
        return sInstance;
    }

    public IContentCardsActionListener getContentCardsActionListener() {
        IContentCardsActionListener iContentCardsActionListener = this.mCustomContentCardsActionListener;
        return iContentCardsActionListener != null ? iContentCardsActionListener : this.mDefaultContentCardsActionListener;
    }
}
