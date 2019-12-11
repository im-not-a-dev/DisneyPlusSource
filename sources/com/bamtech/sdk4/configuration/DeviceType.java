package com.bamtech.sdk4.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/configuration/DeviceType;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE", "TABLET", "TV", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceType.kt */
public enum DeviceType {
    PHONE,
    TABLET,
    TV;

    public String toString() {
        String name = name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }
}
