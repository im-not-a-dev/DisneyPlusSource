package com.bamtech.sdk4.subscription;

import com.bamtech.shadow.dagger.MembersInjector;

public final class SubscriptionPlugin_MembersInjector implements MembersInjector<SubscriptionPlugin> {
    public static void injectApi(SubscriptionPlugin subscriptionPlugin, SubscriptionApi subscriptionApi) {
        subscriptionPlugin.api = subscriptionApi;
    }
}
