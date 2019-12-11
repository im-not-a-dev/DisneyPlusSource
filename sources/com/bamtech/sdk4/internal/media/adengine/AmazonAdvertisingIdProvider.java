package com.bamtech.sdk4.internal.media.adengine;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/AmazonAdvertisingIdProvider;", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "advertisingId", "", "limitAdTracking", "", "getId", "limitTracking", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AmazonAdvertisingIdProvider.kt */
public final class AmazonAdvertisingIdProvider implements AdvertisingIdProvider {
    private final String advertisingId;
    private final boolean limitAdTracking;

    public AmazonAdvertisingIdProvider(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.limitAdTracking = Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
        this.advertisingId = Secure.getString(contentResolver, "advertising_id");
    }

    public String getId() {
        return this.advertisingId;
    }

    public boolean limitTracking() {
        return this.limitAdTracking;
    }
}
