package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityRequirements;", "", "()V", "enabled", "", "minimumSecurityLevel", "Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;", "(ZLcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;)V", "getEnabled", "()Z", "getMinimumSecurityLevel", "()Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceConfiguration.kt */
public final class WidevineSecurityRequirements {
    private final boolean enabled;
    private final WidevineSecurityLevel minimumSecurityLevel;

    public WidevineSecurityRequirements(boolean z, WidevineSecurityLevel widevineSecurityLevel) {
        this.enabled = z;
        this.minimumSecurityLevel = widevineSecurityLevel;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final WidevineSecurityLevel getMinimumSecurityLevel() {
        return this.minimumSecurityLevel;
    }

    public WidevineSecurityRequirements() {
        this(false, WidevineSecurityLevel.level3);
    }
}
