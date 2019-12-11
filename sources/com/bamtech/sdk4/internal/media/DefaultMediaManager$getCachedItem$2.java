package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionInfoExtension.DefaultImpls;
import com.bamtech.sdk4.session.SessionProfileInfo;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/Playhead;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getCachedItem$2<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ MediaDescriptor $mediaDescriptor;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getCachedItem$2(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
        this.$mediaDescriptor = mediaDescriptor;
    }

    public final Maybe<Playhead> apply(String str) {
        SessionProfileInfo profile = ((SessionInfo) DefaultImpls.getSessionInfo$default(this.this$0.sessionInfoExtension, this.$transaction, false, 2, null).mo30224c()).getProfile();
        if (profile == null) {
            return null;
        }
        String id = profile.getId();
        if (id == null) {
            return null;
        }
        return this.this$0.onlineMediaClient.getPlayhead(this.$transaction, C13173j0.m40356a(C12907r.m40244a("{contentId}", this.$mediaDescriptor.getCachedMediaId()), C12907r.m40244a("{accessToken}", str)), id);
    }
}
