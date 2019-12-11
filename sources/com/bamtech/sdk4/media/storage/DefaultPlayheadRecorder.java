package com.bamtech.sdk4.media.storage;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.AbstractPlaybackSession;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionProfileInfo;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ:\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/storage/DefaultPlayheadRecorder;", "Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;", "sessionInfoExtension", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "localPlayheadStore", "Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "localBookmarkStore", "Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "(Lcom/bamtech/sdk4/session/SessionInfoExtension;Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;)V", "getLocalBookmarkStore", "()Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "getLocalPlayheadStore", "()Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "getSessionInfoExtension", "()Lcom/bamtech/sdk4/session/SessionInfoExtension;", "recordPlayheadAndBookmark", "Lio/reactivex/Flowable;", "", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentId", "playhead", "", "occurredOn", "playbackUrl", "update", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "currentTime", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayheadRecorder.kt */
public final class DefaultPlayheadRecorder implements PlayheadRecorder {
    private final LocalBookmarkStore localBookmarkStore;
    private final LocalPlayheadStore localPlayheadStore;
    private final SessionInfoExtension sessionInfoExtension;

    public DefaultPlayheadRecorder(SessionInfoExtension sessionInfoExtension2, LocalPlayheadStore localPlayheadStore2, LocalBookmarkStore localBookmarkStore2) {
        this.sessionInfoExtension = sessionInfoExtension2;
        this.localPlayheadStore = localPlayheadStore2;
        this.localBookmarkStore = localBookmarkStore2;
    }

    /* access modifiers changed from: private */
    public final Bookmark update(Bookmark bookmark, long j, long j2) {
        Bookmark bookmark2 = new Bookmark(bookmark.getContentId(), j, bookmark.getRuntime(), bookmark.getProfileId(), j2, bookmark.getCcDefault(), bookmark.getCcMedia());
        return bookmark2;
    }

    public final LocalBookmarkStore getLocalBookmarkStore() {
        return this.localBookmarkStore;
    }

    public final LocalPlayheadStore getLocalPlayheadStore() {
        return this.localPlayheadStore;
    }

    public Flowable<String> recordPlayheadAndBookmark(ServiceTransaction serviceTransaction, String str, long j, long j2, String str2) {
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        String str3 = null;
        if (str == null) {
            String simpleName = C12895y.m40230a(AbstractPlaybackSession.class).getSimpleName();
            if (simpleName != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't save bookmark.  Missing content id ");
                sb.append(str2);
                DefaultImpls.log$default(serviceTransaction, this, simpleName, sb.toString(), null, false, 24, null);
                Flowable<String> i = Flowable.m38209i();
                Intrinsics.checkReturnedValueIsNotNull((Object) i, "Flowable.empty<String>()");
                return i;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        SessionProfileInfo profile = ((SessionInfo) SessionInfoExtension.DefaultImpls.getSessionInfo$default(this.sessionInfoExtension, serviceTransaction, false, 2, null).mo30224c()).getProfile();
        if (profile != null) {
            str3 = profile.getId();
        }
        String str4 = str3;
        Maybe a = Maybe.m38256a((Callable<? extends MaybeSource<? extends T>>) new C2102x2a49a5d4<Object>(str4));
        C2103x2a49a5d5 defaultPlayheadRecorder$recordPlayheadAndBookmark$playheadMaybe$2 = new C2103x2a49a5d5(this, serviceTransaction, str, j, j2);
        Maybe c = a.mo30123c((Consumer<? super T>) defaultPlayheadRecorder$recordPlayheadAndBookmark$playheadMaybe$2);
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Maybe.defer {\n          …t))\n                    }");
        Single fetchBookmarks = this.localBookmarkStore.fetchBookmarks(serviceTransaction, C13183n.m40498a(str));
        C2099x4c5bd572 defaultPlayheadRecorder$recordPlayheadAndBookmark$bookmarkMaybe$1 = new C2099x4c5bd572(this, j, j2, str4, str);
        Maybe f = fetchBookmarks.mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) defaultPlayheadRecorder$recordPlayheadAndBookmark$bookmarkMaybe$1).mo30123c((Consumer<? super T>) new C2100x4c5bd573<Object>(this)).mo30131f(C2101x4c5bd574.INSTANCE);
        Intrinsics.checkReturnedValueIsNotNull((Object) f, "localBookmarkStore.fetch…    .map { it.profileId }");
        Flowable<String> a2 = Maybe.m38251a((MaybeSource<? extends T>) c, (MaybeSource<? extends T>) f);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "Maybe.concat(playheadMaybe, bookmarkMaybe)");
        return a2;
    }
}
