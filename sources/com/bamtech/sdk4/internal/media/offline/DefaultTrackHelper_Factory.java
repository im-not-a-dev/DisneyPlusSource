package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.shadow.dagger.p048a.C2111c;

public final class DefaultTrackHelper_Factory implements C2111c<DefaultTrackHelper> {
    private static final DefaultTrackHelper_Factory INSTANCE = new DefaultTrackHelper_Factory();

    public static DefaultTrackHelper_Factory create() {
        return INSTANCE;
    }

    public DefaultTrackHelper get() {
        return new DefaultTrackHelper();
    }
}
