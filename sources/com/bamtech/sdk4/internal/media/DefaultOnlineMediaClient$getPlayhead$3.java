package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.media.PlayheadBookmarkBuilder;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/Playhead;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/media/PlayheadBookmarkBuilder;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getPlayhead$3<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ String $profileId;

    DefaultOnlineMediaClient$getPlayhead$3(String str) {
        this.$profileId = str;
    }

    public final Maybe<Playhead> apply(PlayheadBookmarkBuilder playheadBookmarkBuilder) {
        playheadBookmarkBuilder.setProfileId(this.$profileId);
        Playhead build = playheadBookmarkBuilder.build();
        if (build != null) {
            return Maybe.m38258c(build);
        }
        return Maybe.m38259h();
    }
}
