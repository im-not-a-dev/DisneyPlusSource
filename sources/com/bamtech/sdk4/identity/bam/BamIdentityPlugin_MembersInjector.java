package com.bamtech.sdk4.identity.bam;

import com.bamtech.shadow.dagger.MembersInjector;

public final class BamIdentityPlugin_MembersInjector implements MembersInjector<BamIdentityPlugin> {
    public static void injectApi(BamIdentityPlugin bamIdentityPlugin, BamIdentityApi bamIdentityApi) {
        bamIdentityPlugin.api = bamIdentityApi;
    }
}
