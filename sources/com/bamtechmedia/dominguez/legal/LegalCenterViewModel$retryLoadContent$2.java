package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$retryLoadContent$2<T> implements Consumer<Throwable> {
    public static final LegalCenterViewModel$retryLoadContent$2 INSTANCE = new LegalCenterViewModel$retryLoadContent$2();

    LegalCenterViewModel$retryLoadContent$2() {
    }

    public final void accept(Throwable th) {
        Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
        throw th;
    }
}
