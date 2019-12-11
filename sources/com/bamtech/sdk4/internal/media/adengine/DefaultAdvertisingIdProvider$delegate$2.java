package com.bamtech.sdk4.internal.media.adengine;

import android.app.Application;
import android.content.Context;
import com.bamtech.sdk4.android.BootstrapperKt;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAdvertisingIdProvider.kt */
final class DefaultAdvertisingIdProvider$delegate$2 extends C12881k implements Function0<AdvertisingIdProvider> {
    final /* synthetic */ Application $application;

    DefaultAdvertisingIdProvider$delegate$2(Application application) {
        this.$application = application;
        super(0);
    }

    public final AdvertisingIdProvider invoke() {
        AdvertisingIdProvider amazonAdvertisingIdProvider;
        try {
            if (GoogleApiAvailability.m30032a().mo24987c((Context) this.$application) == 0) {
                amazonAdvertisingIdProvider = new GooglePlayAdvertisingIdProvider(this.$application);
            } else if (!Intrinsics.areEqual((Object) BootstrapperKt.device(this.$application).getManufacturer(), (Object) "amazon")) {
                return null;
            } else {
                amazonAdvertisingIdProvider = new AmazonAdvertisingIdProvider(this.$application);
            }
            return amazonAdvertisingIdProvider;
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
