package com.bamtech.sdk4.internal.media.storage.playhead;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.event.UserProfileEventType;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalPlayheadStore.kt */
final class DefaultLocalPlayheadStore$purgeOnProfileChangeOrLogoutInternal$1<T> implements Consumer<Object> {
    final /* synthetic */ DefaultLocalPlayheadStore this$0;

    DefaultLocalPlayheadStore$purgeOnProfileChangeOrLogoutInternal$1(DefaultLocalPlayheadStore defaultLocalPlayheadStore) {
        this.this$0 = defaultLocalPlayheadStore;
    }

    public final void accept(Object obj) {
        if (obj instanceof UserProfileEvent) {
            UserProfileEvent userProfileEvent = (UserProfileEvent) obj;
            if (userProfileEvent.getType() == UserProfileEventType.DELETED) {
                this.this$0.removePlayheadsForProfile(userProfileEvent.getProfileId());
            }
        } else if ((obj instanceof LogoutMode) && obj == LogoutMode.Hard) {
            this.this$0.removeAllPlayheads();
        }
    }
}
