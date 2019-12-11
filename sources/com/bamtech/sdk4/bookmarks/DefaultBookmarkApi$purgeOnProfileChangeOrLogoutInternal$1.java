package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.event.UserProfileEventType;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "result", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$purgeOnProfileChangeOrLogoutInternal$1<T, R> implements Function<Object, CompletableSource> {
    final /* synthetic */ DefaultBookmarkApi this$0;

    DefaultBookmarkApi$purgeOnProfileChangeOrLogoutInternal$1(DefaultBookmarkApi defaultBookmarkApi) {
        this.this$0 = defaultBookmarkApi;
    }

    public final CompletableSource apply(Object obj) {
        if (obj instanceof UserProfileEvent) {
            UserProfileEvent userProfileEvent = (UserProfileEvent) obj;
            if (userProfileEvent.getType() == UserProfileEventType.DELETED) {
                return this.this$0.localBookmarkStore.removeBookmarksForProfile(userProfileEvent.getProfileId());
            }
        }
        if (!(obj instanceof LogoutMode) || obj != LogoutMode.Hard) {
            return Completable.m38169h();
        }
        return this.this$0.localBookmarkStore.removeAllBookmarks();
    }
}
