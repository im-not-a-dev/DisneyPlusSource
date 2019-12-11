package com.bamtech.sdk4.session;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionInfoStorage;", "", "clear", "", "load", "Lcom/bamtech/sdk4/session/SessionInfo;", "save", "sessionInfo", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionInfoStorage.kt */
public interface SessionInfoStorage {
    void clear();

    SessionInfo load();

    void save(SessionInfo sessionInfo);
}
