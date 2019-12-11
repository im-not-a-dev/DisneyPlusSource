package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.c */
public final class C9939c {
    /* renamed from: a */
    public static String m30966a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
