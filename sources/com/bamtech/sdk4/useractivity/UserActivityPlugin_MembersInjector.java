package com.bamtech.sdk4.useractivity;

import com.bamtech.shadow.dagger.MembersInjector;

public final class UserActivityPlugin_MembersInjector implements MembersInjector<UserActivityPlugin> {
    public static void injectApi(UserActivityPlugin userActivityPlugin, UserActivityApi userActivityApi) {
        userActivityPlugin.api = userActivityApi;
    }
}
