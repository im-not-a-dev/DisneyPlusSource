package com.appboy.p034ui;

import android.content.Context;
import com.appboy.C1482j;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.actions.NewsfeedAction;
import com.appboy.p034ui.actions.UriAction;

/* renamed from: com.appboy.ui.AppboyNavigator */
public class AppboyNavigator implements C1482j {
    private static final String TAG = C1557c.m7461a(AppboyNavigator.class);
    private static volatile C1482j sCustomAppboyNavigator;
    private static volatile C1482j sDefaultAppboyNavigator = new AppboyNavigator();

    public static void executeNewsFeedAction(Context context, NewsfeedAction newsfeedAction) {
        if (newsfeedAction == null) {
            C1557c.m7465b(TAG, "IAppboyNavigator cannot open News feed because the news feed action object was null.");
        } else {
            newsfeedAction.execute(context);
        }
    }

    public static void executeUriAction(Context context, UriAction uriAction) {
        if (uriAction == null) {
            C1557c.m7465b(TAG, "IAppboyNavigator cannot open Uri because the Uri action object was null.");
        } else {
            uriAction.execute(context);
        }
    }

    public static C1482j getAppboyNavigator() {
        if (sCustomAppboyNavigator != null) {
            return sCustomAppboyNavigator;
        }
        return sDefaultAppboyNavigator;
    }

    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        executeNewsFeedAction(context, newsfeedAction);
    }

    public void gotoUri(Context context, UriAction uriAction) {
        executeUriAction(context, uriAction);
    }
}
