package com.bamtech.sdk4.internal.android;

import android.app.Application;
import android.content.SharedPreferences;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class ApplicationModule_CookiePreferencesFactory implements C2111c<SharedPreferences> {
    private final Provider<Application> applicationProvider;
    private final ApplicationModule module;

    public ApplicationModule_CookiePreferencesFactory(ApplicationModule applicationModule, Provider<Application> provider) {
        this.module = applicationModule;
        this.applicationProvider = provider;
    }

    public static ApplicationModule_CookiePreferencesFactory create(ApplicationModule applicationModule, Provider<Application> provider) {
        return new ApplicationModule_CookiePreferencesFactory(applicationModule, provider);
    }

    public SharedPreferences get() {
        SharedPreferences cookiePreferences = this.module.cookiePreferences((Application) this.applicationProvider.get());
        C2113e.m8178a(cookiePreferences, "Cannot return null from a non-@Nullable @Provides method");
        return cookiePreferences;
    }
}
