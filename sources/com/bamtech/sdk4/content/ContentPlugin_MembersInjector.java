package com.bamtech.sdk4.content;

import com.bamtech.shadow.dagger.MembersInjector;

public final class ContentPlugin_MembersInjector implements MembersInjector<ContentPlugin> {
    public static void injectApi(ContentPlugin contentPlugin, ContentApi contentApi) {
        contentPlugin.api = contentApi;
    }
}
