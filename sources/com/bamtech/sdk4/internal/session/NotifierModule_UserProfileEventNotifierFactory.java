package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import p520io.reactivex.subjects.PublishSubject;

public final class NotifierModule_UserProfileEventNotifierFactory implements C2111c<PublishSubject<UserProfileEvent>> {
    private static final NotifierModule_UserProfileEventNotifierFactory INSTANCE = new NotifierModule_UserProfileEventNotifierFactory();

    public static NotifierModule_UserProfileEventNotifierFactory create() {
        return INSTANCE;
    }

    public PublishSubject<UserProfileEvent> get() {
        PublishSubject<UserProfileEvent> userProfileEventNotifier = NotifierModule.userProfileEventNotifier();
        C2113e.m8178a(userProfileEventNotifier, "Cannot return null from a non-@Nullable @Provides method");
        return userProfileEventNotifier;
    }
}
