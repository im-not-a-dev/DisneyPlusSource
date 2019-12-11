package com.bamtech.sdk4.internal.media.storage.playhead;

import android.annotation.SuppressLint;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoExtension.DefaultImpls;
import com.bamtech.sdk4.session.SessionProfileInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\r\u0010\u0015\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/storage/playhead/DefaultLocalPlayheadStore;", "Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "sessionManager", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "database", "Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDao;", "logoutNotifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "profileEventNotifier", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "(Lcom/bamtech/sdk4/session/SessionInfoExtension;Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDao;Lio/reactivex/subjects/PublishSubject;Lio/reactivex/subjects/PublishSubject;)V", "fetchPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentId", "", "importPlayhead", "", "playhead", "purgeOnProfileChangeOrLogout", "purgeOnProfileChangeOrLogout$extension_media_release", "purgeOnProfileChangeOrLogoutInternal", "Lio/reactivex/Completable;", "purgeOnProfileChangeOrLogoutInternal$extension_media_release", "removeAllPlayheads", "removePlayheadsForProfile", "profileId", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalPlayheadStore.kt */
public final class DefaultLocalPlayheadStore implements LocalPlayheadStore {
    private final PlayheadDao database;
    private final PublishSubject<LogoutMode> logoutNotifier;
    private final PublishSubject<UserProfileEvent> profileEventNotifier;
    private final SessionInfoExtension sessionManager;

    public DefaultLocalPlayheadStore(SessionInfoExtension sessionInfoExtension, PlayheadDao playheadDao, PublishSubject<LogoutMode> publishSubject, PublishSubject<UserProfileEvent> publishSubject2) {
        this.sessionManager = sessionInfoExtension;
        this.database = playheadDao;
        this.logoutNotifier = publishSubject;
        this.profileEventNotifier = publishSubject2;
        purgeOnProfileChangeOrLogout$extension_media_release();
    }

    public Playhead fetchPlayhead(ServiceTransaction serviceTransaction, String str) {
        SessionProfileInfo profile = ((SessionInfo) DefaultImpls.getSessionInfo$default(this.sessionManager, serviceTransaction, false, 2, null).mo30224c()).getProfile();
        if (profile == null) {
            return null;
        }
        String id = profile.getId();
        if (id == null) {
            return null;
        }
        PlayheadDao playheadDao = this.database;
        if (playheadDao != null) {
            return playheadDao.getPlayhead(id, str);
        }
        return null;
    }

    public void importPlayhead(ServiceTransaction serviceTransaction, Playhead playhead) {
        Playhead fetchPlayhead = fetchPlayhead(serviceTransaction, playhead.getContentId());
        boolean z = true;
        boolean z2 = fetchPlayhead != null && playhead.isNewerThan(fetchPlayhead);
        if (fetchPlayhead != null) {
            z = false;
        }
        if (z2 || z) {
            PlayheadDao playheadDao = this.database;
            if (playheadDao != null) {
                playheadDao.addPlayhead(playhead);
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public final void purgeOnProfileChangeOrLogout$extension_media_release() {
        purgeOnProfileChangeOrLogoutInternal$extension_media_release().mo30051b(C11934b.m38500b()).mo30047a(DefaultLocalPlayheadStore$purgeOnProfileChangeOrLogout$1.INSTANCE, DefaultLocalPlayheadStore$purgeOnProfileChangeOrLogout$2.INSTANCE);
    }

    public final Completable purgeOnProfileChangeOrLogoutInternal$extension_media_release() {
        Completable f = Observable.m38308b((ObservableSource<? extends T>) this.logoutNotifier, (ObservableSource<? extends T>) this.profileEventNotifier).mo30184d((Consumer<? super T>) new DefaultLocalPlayheadStore$purgeOnProfileChangeOrLogoutInternal$1<Object>(this)).mo30190f();
        Intrinsics.checkReturnedValueIsNotNull((Object) f, "Observable.merge(logoutN…        .ignoreElements()");
        return f;
    }

    public void removeAllPlayheads() {
        PlayheadDao playheadDao = this.database;
        if (playheadDao != null) {
            playheadDao.deleteAllPlayheads();
        }
    }

    public void removePlayheadsForProfile(String str) {
        PlayheadDao playheadDao = this.database;
        if (playheadDao != null) {
            playheadDao.deletePlayheadForProfile(str);
        }
    }
}
