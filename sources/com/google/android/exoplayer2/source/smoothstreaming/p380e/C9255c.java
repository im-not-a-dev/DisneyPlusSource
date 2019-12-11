package com.google.android.exoplayer2.source.smoothstreaming.p380e;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.c */
/* compiled from: SsUtil */
public final class C9255c {
    /* renamed from: a */
    public static Uri m27979a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !Util.m29457k(lastPathSegment).matches("manifest(\\(.+\\))?")) {
            return Uri.withAppendedPath(uri, "Manifest");
        }
        return uri;
    }
}
