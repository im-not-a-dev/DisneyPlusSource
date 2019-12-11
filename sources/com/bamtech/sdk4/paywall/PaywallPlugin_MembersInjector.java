package com.bamtech.sdk4.paywall;

import com.bamtech.shadow.dagger.MembersInjector;

public final class PaywallPlugin_MembersInjector implements MembersInjector<PaywallPlugin> {
    public static void injectApi(PaywallPlugin paywallPlugin, PaywallApi paywallApi) {
        paywallPlugin.api = paywallApi;
    }
}
