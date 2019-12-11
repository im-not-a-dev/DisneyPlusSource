package com.bumptech.glide.load.p332m.p333o;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.m.o.b */
/* compiled from: MediaStoreUtil */
public final class C8141b {
    /* renamed from: a */
    public static boolean m23617a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m23618a(Uri uri) {
        return m23619b(uri) && !m23621d(uri);
    }

    /* renamed from: b */
    public static boolean m23619b(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m23620c(Uri uri) {
        return m23619b(uri) && m23621d(uri);
    }

    /* renamed from: d */
    private static boolean m23621d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
