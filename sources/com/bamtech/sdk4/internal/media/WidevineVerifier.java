package com.bamtech.sdk4.internal.media;

import android.media.MediaDrm;
import android.media.MediaDrm.KeyRequest;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/WidevineVerifier;", "", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "drmProvider", "Lcom/bamtech/sdk4/internal/media/drm/DefaultWidevineDrmProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/media/drm/DefaultWidevineDrmProvider;)V", "allowL1Security", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "getAllowL1Security$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "setAllowL1Security$sdk_core_api_release", "(Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;)V", "supportsV1", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "verifyV1", "verifyV1$sdk_core_api_release", "Companion", "WidevineBlacklistStatus", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: WidevineVerifier.kt */
public final class WidevineVerifier {
    public static final Companion Companion = new Companion(null);
    private WidevineBlacklistStatus allowL1Security = WidevineBlacklistStatus.Unknown;
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final DefaultWidevineDrmProvider drmProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/WidevineVerifier$Companion;", "", "()V", "DISABLE_DRM_CHECK", "", "IGNORE_DRM_CHECK", "VIDEO_MP4", "generateKeyData", "", "drmBase64String", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: WidevineVerifier.kt */
    public static final class Companion {
        private Companion() {
        }

        public final byte[] generateKeyData(String str) {
            byte[] bArr;
            if (VERSION.SDK_INT < 23) {
                return new byte[0];
            }
            try {
                byte[] decode = Base64.decode(str, 0);
                MediaDrm mediaDrm = new MediaDrm(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
                byte[] openSession = mediaDrm.openSession();
                KeyRequest keyRequest = mediaDrm.getKeyRequest(openSession, decode, "video/mp4", 1, null);
                mediaDrm.closeSession(openSession);
                if (VERSION.SDK_INT >= 28) {
                    mediaDrm.close();
                } else {
                    int i = VERSION.SDK_INT;
                    if (19 <= i) {
                        if (27 >= i) {
                            mediaDrm.release();
                        }
                    }
                }
                C12880j.m40222a((Object) keyRequest, "request");
                bArr = keyRequest.getData();
            } catch (Throwable th) {
                Log.d("WidevineVerifier", "Unable to generate key data", th);
                bArr = new byte[0];
            }
            C12880j.m40222a((Object) bArr, "try {\n                  …rray(0)\n                }");
            return bArr;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[WidevineBlacklistStatus.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[WidevineBlacklistStatus.values().length];

        static {
            $EnumSwitchMapping$0[WidevineBlacklistStatus.Unknown.ordinal()] = 1;
            $EnumSwitchMapping$1[WidevineBlacklistStatus.Whitelisted.ordinal()] = 1;
            $EnumSwitchMapping$1[WidevineBlacklistStatus.Unknown.ordinal()] = 2;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/WidevineVerifier$WidevineBlacklistStatus;", "", "(Ljava/lang/String;I)V", "Whitelisted", "Blacklisted", "Unknown", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: WidevineVerifier.kt */
    public enum WidevineBlacklistStatus {
        Whitelisted,
        Blacklisted,
        Unknown
    }

    public WidevineVerifier(ConfigurationProvider configurationProvider2, DefaultWidevineDrmProvider defaultWidevineDrmProvider) {
        this.configurationProvider = configurationProvider2;
        this.drmProvider = defaultWidevineDrmProvider;
    }

    public final void setAllowL1Security$sdk_core_api_release(WidevineBlacklistStatus widevineBlacklistStatus) {
        this.allowL1Security = widevineBlacklistStatus;
    }

    public final Single<Boolean> supportsV1(ServiceTransaction serviceTransaction) {
        Single single;
        if (WhenMappings.$EnumSwitchMapping$0[this.allowL1Security.ordinal()] != 1) {
            single = Single.m38399b(this.allowL1Security);
            C12880j.m40222a((Object) single, "Single.just(allowL1Security)");
        } else {
            single = verifyV1$sdk_core_api_release(serviceTransaction);
        }
        Single<Boolean> g = single.mo30227d((Consumer<? super T>) new WidevineVerifier$supportsV1$1<Object>(this)).mo30233g(WidevineVerifier$supportsV1$2.INSTANCE);
        C12880j.m40222a((Object) g, "when (allowL1Security) {…      }\n                }");
        return g;
    }

    public final Single<WidevineBlacklistStatus> verifyV1$sdk_core_api_release(ServiceTransaction serviceTransaction) {
        Single<WidevineBlacklistStatus> h = this.configurationProvider.getServiceConfigurations(serviceTransaction, WidevineVerifier$verifyV1$1.INSTANCE, WidevineVerifier$verifyV1$2.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) WidevineVerifier$verifyV1$3.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new WidevineVerifier$verifyV1$4<Object,Object>(this, serviceTransaction)).mo30233g(WidevineVerifier$verifyV1$5.INSTANCE).mo30235h(WidevineVerifier$verifyV1$6.INSTANCE);
        C12880j.m40222a((Object) h, "configurationProvider.ge…      }\n                }");
        return h;
    }
}
