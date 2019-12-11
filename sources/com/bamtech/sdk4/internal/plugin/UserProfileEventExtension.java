package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.plugin.Extension;
import kotlin.Metadata;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/UserProfileEventExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "instance", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "(Lio/reactivex/subjects/PublishSubject;)V", "getInstance", "()Lio/reactivex/subjects/PublishSubject;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensions.kt */
public final class UserProfileEventExtension implements Extension {
    private final PublishSubject<UserProfileEvent> instance;

    public UserProfileEventExtension(PublishSubject<UserProfileEvent> publishSubject) {
        this.instance = publishSubject;
    }

    public final PublishSubject<UserProfileEvent> getInstance() {
        return this.instance;
    }
}
