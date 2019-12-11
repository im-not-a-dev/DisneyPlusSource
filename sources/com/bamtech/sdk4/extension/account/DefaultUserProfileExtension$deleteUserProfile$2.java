package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.event.UserProfileEventType;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$deleteUserProfile$2 implements C11945a {
    final /* synthetic */ UserProfile $profile;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$deleteUserProfile$2(DefaultUserProfileExtension defaultUserProfileExtension, UserProfile userProfile) {
        this.this$0 = defaultUserProfileExtension;
        this.$profile = userProfile;
    }

    public final void run() {
        this.this$0.profileEventNotifier.onNext(new UserProfileEvent(this.$profile.getProfileId(), UserProfileEventType.DELETED));
    }
}
