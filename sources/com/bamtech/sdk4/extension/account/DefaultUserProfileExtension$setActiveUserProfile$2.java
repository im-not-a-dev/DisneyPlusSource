package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.account.CreateAccountGrantResponse;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.event.UserProfileEventType;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
final class DefaultUserProfileExtension$setActiveUserProfile$2<T> implements Consumer<CreateAccountGrantResponse> {
    final /* synthetic */ UserProfile $profile;
    final /* synthetic */ DefaultUserProfileExtension this$0;

    DefaultUserProfileExtension$setActiveUserProfile$2(DefaultUserProfileExtension defaultUserProfileExtension, UserProfile userProfile) {
        this.this$0 = defaultUserProfileExtension;
        this.$profile = userProfile;
    }

    public final void accept(CreateAccountGrantResponse createAccountGrantResponse) {
        this.this$0.profileEventNotifier.onNext(new UserProfileEvent(this.$profile.getProfileId(), UserProfileEventType.ACTIVE));
    }
}
