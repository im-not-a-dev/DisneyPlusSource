package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.Storage.DefaultImpls;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/DefaultSessionInfoStorage;", "Lcom/bamtech/sdk4/session/SessionInfoStorage;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "(Lcom/bamtech/sdk4/internal/core/Storage;)V", "clear", "", "load", "Lcom/bamtech/sdk4/session/SessionInfo;", "save", "sessionInfo", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PreferencesSessionInfoPersistor.kt */
public final class DefaultSessionInfoStorage implements SessionInfoStorage {
    private final Storage storage;

    public DefaultSessionInfoStorage(Storage storage2) {
        this.storage = storage2;
    }

    public void clear() {
        this.storage.remove(PreferencesStorage.Companion.getSESSION_INFO());
    }

    public SessionInfo load() {
        return (SessionInfo) DefaultImpls.get$default(this.storage, PreferencesStorage.Companion.getSESSION_INFO(), C12895y.m40230a(SessionInfo.class), null, 4, null);
    }

    public void save(SessionInfo sessionInfo) {
        DefaultImpls.save$default(this.storage, PreferencesStorage.Companion.getSESSION_INFO(), sessionInfo, null, 4, null);
    }
}
