package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.WidevineVerifier.WhenMappings;
import com.bamtech.sdk4.internal.media.WidevineVerifier.WidevineBlacklistStatus;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$supportsV1$2<T, R> implements Function<T, R> {
    public static final WidevineVerifier$supportsV1$2 INSTANCE = new WidevineVerifier$supportsV1$2();

    WidevineVerifier$supportsV1$2() {
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(apply((WidevineBlacklistStatus) obj));
    }

    public final boolean apply(WidevineBlacklistStatus widevineBlacklistStatus) {
        int i = WhenMappings.$EnumSwitchMapping$1[widevineBlacklistStatus.ordinal()];
        return i == 1 || i == 2;
    }
}
