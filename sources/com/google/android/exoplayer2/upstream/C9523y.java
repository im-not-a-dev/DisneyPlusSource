package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.upstream.y */
/* compiled from: HttpDataSource */
public final /* synthetic */ class C9523y {
    /* renamed from: a */
    public static /* synthetic */ boolean m29269a(String str) {
        String k = C9554k0.m29457k(str);
        return !TextUtils.isEmpty(k) && (!k.contains("text") || k.contains("text/vtt")) && !k.contains("html") && !k.contains("xml");
    }
}
