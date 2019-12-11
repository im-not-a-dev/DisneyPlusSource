package com.bamtech.core.networking.converters;

import kotlin.jvm.internal.C12880j;
import okhttp3.C14258u;

/* renamed from: com.bamtech.core.networking.converters.c */
/* compiled from: StringConverter.kt */
public final class C1686c implements Converter {
    public C1686c(C14258u uVar) {
    }

    /* renamed from: a */
    public <T> T mo7495a(String str, Class<?> cls) {
        if (C12880j.m40224a((Object) cls, (Object) String.class)) {
            return str;
        }
        throw new IllegalStateException("StringConverter can only deserialize to String");
    }

    public <T> String serialize(T t) {
        return String.valueOf(t);
    }

    public /* synthetic */ C1686c(C14258u uVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            uVar = C14258u.m45482b("text/plain");
        }
        this(uVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        kotlin.p580c0.C12724b.m39863a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo7496a(okio.BufferedSource r2, java.lang.Class<?> r3) {
        /*
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r3, r0)
            r0 = 1
            if (r3 != r0) goto L_0x001d
            r3 = 0
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = r2.mo36327e0()     // Catch:{ all -> 0x0015 }
            kotlin.p580c0.C12724b.m39863a(r2, r3)
            r3 = r0
            goto L_0x001c
        L_0x0015:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r2, r3)
            throw r0
        L_0x001c:
            return r3
        L_0x001d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "StringConverter can only deserialize to String"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.core.networking.converters.C1686c.mo7496a(okio.BufferedSource, java.lang.Class):java.lang.Object");
    }
}
