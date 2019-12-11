package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/NotifierModule;", "", "()V", "Companion", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NotifierModule.kt */
public abstract class NotifierModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/NotifierModule$Companion;", "", "()V", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "userProfileEventNotifier", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: NotifierModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public final PublishSubject<LogoutMode> notifier() {
            PublishSubject<LogoutMode> q = PublishSubject.m38553q();
            Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create<LogoutMode>()");
            return q;
        }

        public final PublishSubject<UserProfileEvent> userProfileEventNotifier() {
            PublishSubject<UserProfileEvent> q = PublishSubject.m38553q();
            Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create()");
            return q;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final PublishSubject<LogoutMode> notifier() {
        return Companion.notifier();
    }

    public static final PublishSubject<UserProfileEvent> userProfileEventNotifier() {
        return Companion.userProfileEventNotifier();
    }
}
