package com.bamtechmedia.dominguez.analytics;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.analytics.g0 */
/* compiled from: TransactionIdGenerator.kt */
public final class C2361g0 {
    /* renamed from: a */
    public final String mo11489a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}
