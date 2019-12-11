package com.google.android.gms.common.api;

import com.google.android.gms.common.C9824d;

/* renamed from: com.google.android.gms.common.api.q */
public final class C9815q extends UnsupportedOperationException {

    /* renamed from: c */
    private final C9824d f23018c;

    public C9815q(C9824d dVar) {
        this.f23018c = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f23018c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
