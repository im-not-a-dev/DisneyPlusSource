package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;

/* renamed from: com.google.android.exoplayer2.upstream.cache.n */
/* compiled from: ContentMetadata */
public final /* synthetic */ class C9479n {
    /* renamed from: a */
    public static long m29126a(C9480o oVar) {
        return oVar.mo24542a("exo_len", -1);
    }

    /* renamed from: b */
    public static Uri m29127b(C9480o oVar) {
        String a = oVar.mo24543a("exo_redir", (String) null);
        if (a == null) {
            return null;
        }
        return Uri.parse(a);
    }
}
