package com.bamtech.sdk4.internal.android;

import android.os.Build;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidConfigurationModule;", "", "()V", "embeddedConfiguration", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "userAgent", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidConfigurationModule.kt */
public final class AndroidConfigurationModule {
    public final EmbeddedConfiguration embeddedConfiguration(BootstrapConfiguration bootstrapConfiguration) {
        return EmbeddedConfiguration.Companion.m45853default(bootstrapConfiguration.getMockBaseUrl());
    }

    public final String userAgent(BootstrapConfiguration bootstrapConfiguration) {
        StringBuilder sb = new StringBuilder();
        sb.append("BAMSDK/v4.7.4 ");
        sb.append('(');
        sb.append(bootstrapConfiguration.getClientId());
        sb.append(' ');
        sb.append(bootstrapConfiguration.getApplicationVersion());
        String str = "; ";
        sb.append(str);
        sb.append("v2.0/v4.7.1; ");
        sb.append(bootstrapConfiguration.getDevice().getApplicationRuntime());
        sb.append(str);
        sb.append(bootstrapConfiguration.getDevice().getDeviceProfile());
        sb.append(") ");
        sb.append(Build.BRAND);
        sb.append(' ');
        sb.append(Build.MODEL);
        sb.append(" (");
        sb.append(Build.DISPLAY);
        sb.append(str);
        sb.append("Linux; ");
        sb.append(VERSION.RELEASE);
        sb.append("; API ");
        sb.append(VERSION.SDK_INT);
        sb.append(')');
        return sb.toString();
    }
}
