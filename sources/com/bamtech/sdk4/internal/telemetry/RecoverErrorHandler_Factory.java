package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.shadow.dagger.p048a.C2111c;

public final class RecoverErrorHandler_Factory implements C2111c<RecoverErrorHandler> {
    private static final RecoverErrorHandler_Factory INSTANCE = new RecoverErrorHandler_Factory();

    public static RecoverErrorHandler_Factory create() {
        return INSTANCE;
    }

    public RecoverErrorHandler get() {
        return new RecoverErrorHandler();
    }
}
