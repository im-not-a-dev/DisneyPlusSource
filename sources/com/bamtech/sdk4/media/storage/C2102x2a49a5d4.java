package com.bamtech.sdk4.media.storage;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder$recordPlayheadAndBookmark$playheadMaybe$1 */
/* compiled from: PlayheadRecorder.kt */
final class C2102x2a49a5d4<V> implements Callable<MaybeSource<? extends T>> {
    final /* synthetic */ String $profileId;

    C2102x2a49a5d4(String str) {
        this.$profileId = str;
    }

    public final Maybe<String> call() {
        String str = this.$profileId;
        if (str == null) {
            return Maybe.m38259h();
        }
        return Maybe.m38258c(str);
    }
}
