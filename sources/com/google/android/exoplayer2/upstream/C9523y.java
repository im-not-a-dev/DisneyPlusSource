package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.upstream.y */
/* compiled from: HttpDataSource */
public final /* synthetic */ class C9523y {
    /* renamed from: a */
    public static /* synthetic */ boolean m29269a(String str) {
        String k = Util.m29457k(str);
        return !TextUtils.isEmpty(k) && (!k.contains("text") || k.contains("text/vtt")) && !k.contains("html") && !k.contains("xml");
    }
}
