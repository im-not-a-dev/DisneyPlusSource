package com.bamtech.sdk4.internal.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.ConfigurationHostName;
import com.bamtech.sdk4.internal.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidBootstrapConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "applicationId", "", "applicationVersion", "applicationName", "clientId", "apiKey", "device", "Lcom/bamtech/sdk4/internal/device/Device;", "environment", "debugEnabled", "", "configHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "mockBaseUrl", "enableDebugLogging", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/internal/device/Device;Ljava/lang/String;ZLcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;Ljava/lang/String;Z)V", "getApiKey", "()Ljava/lang/String;", "getApplicationId", "getApplicationName", "getApplicationVersion", "getClientId", "getConfigHostName", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "getDebugEnabled", "()Z", "getDevice", "()Lcom/bamtech/sdk4/internal/device/Device;", "getEnableDebugLogging", "getEnvironment", "getMockBaseUrl", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidBootstrapConfiguration.kt */
public final class AndroidBootstrapConfiguration implements BootstrapConfiguration {
    public static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final String applicationId;
    private final String applicationName;
    private final String applicationVersion;
    private final String clientId;
    private final ConfigurationHostName configHostName;
    private final boolean debugEnabled;
    private final Device device;
    private final boolean enableDebugLogging;
    private final String environment;
    private final String mockBaseUrl;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidBootstrapConfiguration$Companion;", "", "()V", "create", "Lcom/bamtech/sdk4/internal/android/AndroidBootstrapConfiguration;", "app", "Landroid/app/Application;", "clientId", "", "apiKey", "device", "Lcom/bamtech/sdk4/internal/device/Device;", "environment", "debugEnabled", "", "configHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "mockBaseUrl", "enableDebugLogging", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AndroidBootstrapConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"InlinedApi", "ObsoleteSdkInt"})
        public final AndroidBootstrapConfiguration create(Application application, String str, String str2, Device device, String str3, boolean z, ConfigurationHostName configurationHostName, String str4, boolean z2) {
            String str5;
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            String obj = application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString();
            if (VERSION.SDK_INT >= 22) {
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionName);
                sb.append('.');
                sb.append(packageInfo.baseRevisionCode);
                str5 = sb.toString();
            } else {
                str5 = packageInfo.versionName;
            }
            String str6 = str5;
            String packageName = application.getPackageName();
            Intrinsics.checkReturnedValueIsNotNull((Object) packageName, "packageName");
            Intrinsics.checkReturnedValueIsNotNull((Object) str6, "version");
            AndroidBootstrapConfiguration androidBootstrapConfiguration = new AndroidBootstrapConfiguration(packageName, str6, obj, str, str2, device, str3, z, configurationHostName, str4, z2);
            return androidBootstrapConfiguration;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidBootstrapConfiguration(String str, String str2, String str3, String str4, String str5, Device device2, String str6, boolean z, ConfigurationHostName configurationHostName, String str7, boolean z2) {
        this.applicationId = str;
        this.applicationVersion = str2;
        this.applicationName = str3;
        this.clientId = str4;
        this.apiKey = str5;
        this.device = device2;
        this.environment = str6;
        this.debugEnabled = z;
        this.configHostName = configurationHostName;
        this.mockBaseUrl = str7;
        this.enableDebugLogging = z2;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getClientId() {
        return this.clientId;
    }

    public ConfigurationHostName getConfigHostName() {
        return this.configHostName;
    }

    public boolean getDebugEnabled() {
        return this.debugEnabled;
    }

    public Device getDevice() {
        return this.device;
    }

    public boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getMockBaseUrl() {
        return this.mockBaseUrl;
    }
}
