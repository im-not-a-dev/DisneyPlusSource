package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.RenditionKeysNotFoundException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RenewLicensesWorker.kt */
final class RenewLicensesWorker$doWork$1 extends C12881k implements Function0<C13145v> {
    public static final RenewLicensesWorker$doWork$1 INSTANCE = new RenewLicensesWorker$doWork$1();

    RenewLicensesWorker$doWork$1() {
        super(0);
    }

    public final void invoke() {
        throw new RenditionKeysNotFoundException();
    }
}
