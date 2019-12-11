package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\"\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\"\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005\"\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\"\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005¨\u0006\u001c"}, mo31007d2 = {"OFFLINE_RELEASE_WIDEVINE_PERM_KEY", "", "PLAY_READY_GET_LICENSE", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getPLAY_READY_GET_LICENSE", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "PLAY_READY_GET_LICENSE_URL", "getPLAY_READY_GET_LICENSE_URL", "PLAY_READY_PROVISION", "getPLAY_READY_PROVISION", "WIDEVINE_GET_CERTIFICATE", "getWIDEVINE_GET_CERTIFICATE", "WIDEVINE_GET_LICENSE", "getWIDEVINE_GET_LICENSE", "WIDEVINE_GET_LICENSE_URL", "getWIDEVINE_GET_LICENSE_URL", "WIDEVINE_GET_OFFLINE_LICENSE", "getWIDEVINE_GET_OFFLINE_LICENSE", "WIDEVINE_GET_OFFLINE_LICENSE_RELEASE_URL", "getWIDEVINE_GET_OFFLINE_LICENSE_RELEASE_URL", "WIDEVINE_GET_OFFLINE_LICENSE_URL", "getWIDEVINE_GET_OFFLINE_LICENSE_URL", "WIDEVINE_RELEASE_OFFLINE_LICENSE", "getWIDEVINE_RELEASE_OFFLINE_LICENSE", "WIDEVINE_RENEW_OFFLINE_LICENSE", "getWIDEVINE_RENEW_OFFLINE_LICENSE", "WIDEVINE_RENEW_OFFLINE_LICENSE_URL", "getWIDEVINE_RENEW_OFFLINE_LICENSE_URL", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DrmServiceConfiguration.kt */
public final class DrmServiceConfigurationKt {
    public static final String getPLAY_READY_GET_LICENSE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:playReadyLicense";
    }

    public static final String getPLAY_READY_GET_LICENSE_URL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:sdk:drm:playReadyLicenseUrl";
    }

    public static final String getPLAY_READY_PROVISION(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:playReadyProvision";
    }

    public static final String getWIDEVINE_GET_CERTIFICATE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:widevineCertificate";
    }

    public static final String getWIDEVINE_GET_LICENSE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:widevineLicense";
    }

    public static final String getWIDEVINE_GET_LICENSE_URL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:sdk:drm:widevineLicenseUrl";
    }

    public static final String getWIDEVINE_GET_OFFLINE_LICENSE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:offlineWidevineLicense";
    }

    public static final String getWIDEVINE_GET_OFFLINE_LICENSE_RELEASE_URL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:sdk:drm:offlineWidevineLicenseReleaseUrl";
    }

    public static final String getWIDEVINE_GET_OFFLINE_LICENSE_URL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:sdk:drm:offlineWidevineLicenseUrl";
    }

    public static final String getWIDEVINE_RELEASE_OFFLINE_LICENSE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:offlineWidevineLicenseRelease";
    }

    public static final String getWIDEVINE_RENEW_OFFLINE_LICENSE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:drm:offlineWidevineLicenseRenew";
    }

    public static final String getWIDEVINE_RENEW_OFFLINE_LICENSE_URL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:sdk:drm:offlineWidevineLicenseRenewUrl";
    }
}
