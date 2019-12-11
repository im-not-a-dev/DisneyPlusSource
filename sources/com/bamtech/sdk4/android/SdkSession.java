package com.bamtech.sdk4.android;

import android.app.Application;
import com.bamtech.sdk4.internal.BaseSession;
import com.bamtech.sdk4.internal.android.AndroidSdkComponent.Builder;
import com.bamtech.sdk4.internal.android.DaggerAndroidSdkComponent;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.JodaTimeAndroid;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo31007d2 = {"Lcom/bamtech/sdk4/android/SdkSession;", "Lcom/bamtech/sdk4/internal/BaseSession;", "()V", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SdkSession.kt */
public final class SdkSession extends BaseSession {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/android/SdkSession$Companion;", "", "()V", "bootstrapper", "Lcom/bamtech/sdk4/android/Bootstrapper;", "application", "Landroid/app/Application;", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "create", "Lcom/bamtech/sdk4/Session;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SdkSession.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Bootstrapper bootstrapper(Application application, MediaCapabilitiesProvider mediaCapabilitiesProvider) {
            JodaTimeAndroid.init(application);
            Builder builder = DaggerAndroidSdkComponent.builder();
            C12880j.m40222a((Object) builder, "DaggerAndroidSdkComponent.builder()");
            return new Bootstrapper(application, builder, mediaCapabilitiesProvider);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
