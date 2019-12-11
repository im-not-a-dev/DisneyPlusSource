package com.bamtech.core.networking;

import okhttp3.Response;

/* renamed from: com.bamtech.core.networking.d */
/* compiled from: RequestException.kt */
public final class C1690d extends Throwable {
    public /* synthetic */ C1690d(Response response, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            response = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        this(response, th);
    }

    public C1690d(Response response, Throwable th) {
        super(th);
    }
}
