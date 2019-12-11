package com.bamtech.sdk4.internal.media.adengine;

import android.content.Context;
import androidx.annotation.Keep;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.p524d0.C11922d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/GooglePlayAdvertisingIdProvider;", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "advertisingId", "", "limitAdTracking", "", "getId", "limitTracking", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@Keep
/* compiled from: GooglePlayAdvertisingIdProvider.kt */
public final class GooglePlayAdvertisingIdProvider implements AdvertisingIdProvider {
    /* access modifiers changed from: private */
    public String advertisingId;
    /* access modifiers changed from: private */
    public boolean limitAdTracking = true;

    public GooglePlayAdvertisingIdProvider(Context context) {
        try {
            if (GoogleApiAvailability.m30032a().mo24987c(context) == 0) {
                Single b = Single.m38399b(AdvertisingIdClient.getAdvertisingIdInfo(context));
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(AdvertisingI…vertisingIdInfo(context))");
                C11922d.m38478a(b, C19361.INSTANCE, new Function1<Info, C13145v>(this) {
                    final /* synthetic */ GooglePlayAdvertisingIdProvider this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Info) obj);
                        return C13145v.f29587a;
                    }

                    public final void invoke(Info info) {
                        GooglePlayAdvertisingIdProvider googlePlayAdvertisingIdProvider = this.this$0;
                        Intrinsics.checkReturnedValueIsNotNull((Object) info, "info");
                        googlePlayAdvertisingIdProvider.advertisingId = info.getId();
                        this.this$0.limitAdTracking = info.isLimitAdTrackingEnabled();
                    }
                });
            }
        } catch (NoClassDefFoundError unused) {
            System.out.println("Unable to retrieve Google Advertising ID. Have you included the Google Play Services ads library?");
        }
    }

    public String getId() {
        return this.advertisingId;
    }

    public boolean limitTracking() {
        return this.limitAdTracking;
    }
}
