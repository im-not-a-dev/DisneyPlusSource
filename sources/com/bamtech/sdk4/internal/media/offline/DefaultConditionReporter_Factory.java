package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultConditionReporter_Factory implements C2111c<DefaultConditionReporter> {
    private final Provider<Context> contextProvider;

    public DefaultConditionReporter_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static DefaultConditionReporter_Factory create(Provider<Context> provider) {
        return new DefaultConditionReporter_Factory(provider);
    }

    public DefaultConditionReporter get() {
        return new DefaultConditionReporter((Context) this.contextProvider.get());
    }
}
