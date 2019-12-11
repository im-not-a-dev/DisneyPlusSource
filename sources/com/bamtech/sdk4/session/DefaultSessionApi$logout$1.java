package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.event.LogoutMode;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionApi.kt */
final class DefaultSessionApi$logout$1 implements C11945a {
    final /* synthetic */ boolean $soft;
    final /* synthetic */ DefaultSessionApi this$0;

    DefaultSessionApi$logout$1(DefaultSessionApi defaultSessionApi, boolean z) {
        this.this$0 = defaultSessionApi;
        this.$soft = z;
    }

    public final void run() {
        this.this$0.sessionStorage.clear();
        this.this$0.notifier.onNext(this.$soft ? LogoutMode.Soft : LogoutMode.Hard);
    }
}
