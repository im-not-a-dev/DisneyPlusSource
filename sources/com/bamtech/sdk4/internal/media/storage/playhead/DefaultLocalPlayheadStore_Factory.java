package com.bamtech.sdk4.internal.media.storage.playhead;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultLocalPlayheadStore_Factory implements C2111c<DefaultLocalPlayheadStore> {
    private final Provider<PlayheadDao> databaseProvider;
    private final Provider<PublishSubject<LogoutMode>> logoutNotifierProvider;
    private final Provider<PublishSubject<UserProfileEvent>> profileEventNotifierProvider;
    private final Provider<SessionInfoExtension> sessionManagerProvider;

    public DefaultLocalPlayheadStore_Factory(Provider<SessionInfoExtension> provider, Provider<PlayheadDao> provider2, Provider<PublishSubject<LogoutMode>> provider3, Provider<PublishSubject<UserProfileEvent>> provider4) {
        this.sessionManagerProvider = provider;
        this.databaseProvider = provider2;
        this.logoutNotifierProvider = provider3;
        this.profileEventNotifierProvider = provider4;
    }

    public static DefaultLocalPlayheadStore_Factory create(Provider<SessionInfoExtension> provider, Provider<PlayheadDao> provider2, Provider<PublishSubject<LogoutMode>> provider3, Provider<PublishSubject<UserProfileEvent>> provider4) {
        return new DefaultLocalPlayheadStore_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultLocalPlayheadStore get() {
        return new DefaultLocalPlayheadStore((SessionInfoExtension) this.sessionManagerProvider.get(), (PlayheadDao) this.databaseProvider.get(), (PublishSubject) this.logoutNotifierProvider.get(), (PublishSubject) this.profileEventNotifierProvider.get());
    }
}
