package com.bamtech.sdk4.account;

import com.bamtech.shadow.dagger.MembersInjector;

public final class AccountPlugin_MembersInjector implements MembersInjector<AccountPlugin> {
    public static void injectApi(AccountPlugin accountPlugin, AccountApi accountApi) {
        accountPlugin.api = accountApi;
    }

    public static void injectProfileApi(AccountPlugin accountPlugin, UserProfileApi userProfileApi) {
        accountPlugin.profileApi = userProfileApi;
    }
}
