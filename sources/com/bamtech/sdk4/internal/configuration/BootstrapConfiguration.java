package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.device.Device;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "applicationId", "getApplicationId", "applicationName", "getApplicationName", "applicationVersion", "getApplicationVersion", "clientId", "getClientId", "configHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "getConfigHostName", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "debugEnabled", "", "getDebugEnabled", "()Z", "device", "Lcom/bamtech/sdk4/internal/device/Device;", "getDevice", "()Lcom/bamtech/sdk4/internal/device/Device;", "enableDebugLogging", "getEnableDebugLogging", "environment", "getEnvironment", "mockBaseUrl", "getMockBaseUrl", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BootstrapConfiguration.kt */
public interface BootstrapConfiguration {
    String getApiKey();

    String getApplicationId();

    String getApplicationName();

    String getApplicationVersion();

    String getClientId();

    ConfigurationHostName getConfigHostName();

    boolean getDebugEnabled();

    Device getDevice();

    boolean getEnableDebugLogging();

    String getEnvironment();

    String getMockBaseUrl();
}
