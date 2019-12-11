package com.bamtech.sdk4.internal.android;

import android.content.SharedPreferences;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PreferencesCookiePersistor_Factory implements C2111c<PreferencesCookiePersistor> {
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public PreferencesCookiePersistor_Factory(Provider<SharedPreferences> provider) {
        this.sharedPreferencesProvider = provider;
    }

    public static PreferencesCookiePersistor_Factory create(Provider<SharedPreferences> provider) {
        return new PreferencesCookiePersistor_Factory(provider);
    }

    public PreferencesCookiePersistor get() {
        return new PreferencesCookiePersistor((SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
