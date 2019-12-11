package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import p520io.reactivex.subjects.PublishSubject;

public final class NotifierModule_NotifierFactory implements C2111c<PublishSubject<LogoutMode>> {
    private static final NotifierModule_NotifierFactory INSTANCE = new NotifierModule_NotifierFactory();

    public static NotifierModule_NotifierFactory create() {
        return INSTANCE;
    }

    public PublishSubject<LogoutMode> get() {
        PublishSubject<LogoutMode> notifier = NotifierModule.notifier();
        C2113e.m8178a(notifier, "Cannot return null from a non-@Nullable @Provides method");
        return notifier;
    }
}
