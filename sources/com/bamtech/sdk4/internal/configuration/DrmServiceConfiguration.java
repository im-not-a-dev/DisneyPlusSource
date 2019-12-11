package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/DrmExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/DrmExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/DrmExtras;", "getOfflineWidevineLicense", "Lcom/bamtech/core/networking/Link;", "getGetOfflineWidevineLicense", "()Lcom/bamtech/core/networking/Link;", "getOfflineWidevineLicensePermanentRelease", "getGetOfflineWidevineLicensePermanentRelease", "getOfflineWidevineLicenseRelease", "getGetOfflineWidevineLicenseRelease", "getOfflineWidevineLicenseRenew", "getGetOfflineWidevineLicenseRenew", "getPlayReadyLicense", "getGetPlayReadyLicense", "getWidevineCertificate", "getGetWidevineCertificate", "getWidevineLicense", "getGetWidevineLicense", "minimumRenewalFrequency", "", "getMinimumRenewalFrequency", "()J", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DrmServiceConfiguration.kt */
public final class DrmServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final DrmExtras extras;

    public DrmServiceConfiguration(ServiceClientDefinition serviceClientDefinition, DrmExtras drmExtras) {
        this.client = serviceClientDefinition;
        this.extras = drmExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getGetOfflineWidevineLicense() {
        return getClient().getLink("offlineWidevineLicense");
    }

    public final Link getGetOfflineWidevineLicensePermanentRelease() {
        String str = "offlineWidevineLicenseRelease";
        if (getClient().containsKey(str)) {
            return getClient().getLink(str);
        }
        return getGetOfflineWidevineLicenseRelease();
    }

    public final Link getGetOfflineWidevineLicenseRelease() {
        return getClient().getLink("offlineWidevineLicenseRelease");
    }

    public final Link getGetOfflineWidevineLicenseRenew() {
        return getClient().getLink("offlineWidevineLicenseRenew");
    }

    public final Link getGetPlayReadyLicense() {
        return getClient().getLink("playReadyLicense");
    }

    public final Link getGetWidevineCertificate() {
        return getClient().getLink("widevineCertificate");
    }

    public final Link getGetWidevineLicense() {
        return getClient().getLink("widevineLicense");
    }

    public final long getMinimumRenewalFrequency() {
        return getExtras().getMinimumRenewalFrequency();
    }

    public DrmServiceConfiguration() {
        this(new ServiceClientDefinition(), new DrmExtras());
    }

    public DrmExtras getExtras() {
        return this.extras;
    }
}
