package com.bamtech.sdk4.media.drm;

import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "", "Lcom/bamtech/sdk4/core/types/JWT;", "accessToken", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSilkDrmProvider.kt */
final class DefaultSilkDrmProvider$getKey$1<T, R> implements Function<T, R> {
    public static final DefaultSilkDrmProvider$getKey$1 INSTANCE = new DefaultSilkDrmProvider$getKey$1();

    DefaultSilkDrmProvider$getKey$1() {
    }

    public final Map<String, String> apply(String str) {
        return C13170i0.m40332a(C12907r.m40244a("{accessToken}", str));
    }
}
