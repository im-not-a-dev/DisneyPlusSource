package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.WidevineVerifier.WidevineBlacklistStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
final class WidevineVerifier$supportsV1$1<T> implements Consumer<WidevineBlacklistStatus> {
    final /* synthetic */ WidevineVerifier this$0;

    WidevineVerifier$supportsV1$1(WidevineVerifier widevineVerifier) {
        this.this$0 = widevineVerifier;
    }

    public final void accept(WidevineBlacklistStatus widevineBlacklistStatus) {
        if (C13185o.m40520c(WidevineBlacklistStatus.Whitelisted, WidevineBlacklistStatus.Blacklisted).contains(widevineBlacklistStatus)) {
            WidevineVerifier widevineVerifier = this.this$0;
            C12880j.m40222a((Object) widevineBlacklistStatus, "it");
            widevineVerifier.setAllowL1Security$sdk_core_api_release(widevineBlacklistStatus);
        }
    }
}
