package com.bamtech.sdk4.internal.networking.cookies;

import com.bamtech.shadow.dagger.p048a.C2111c;

public final class DefaultCookieCache_Factory implements C2111c<DefaultCookieCache> {
    private static final DefaultCookieCache_Factory INSTANCE = new DefaultCookieCache_Factory();

    public static DefaultCookieCache_Factory create() {
        return INSTANCE;
    }

    public DefaultCookieCache get() {
        return new DefaultCookieCache();
    }
}
