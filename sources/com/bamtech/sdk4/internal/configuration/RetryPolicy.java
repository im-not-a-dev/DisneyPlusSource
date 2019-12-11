package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "", "()V", "retryBasePeriod", "", "retryMultiplier", "retryMaxAttempts", "", "retryMaxPeriod", "(DDII)V", "getRetryBasePeriod", "()D", "getRetryMaxAttempts", "()I", "getRetryMultiplier", "calculateDelay", "attempts", "calculateDelay$sdk_configuration", "getDelay", "toString", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RetryPolicy.kt */
public final class RetryPolicy {
    private final double retryBasePeriod;
    private final int retryMaxAttempts;
    private final int retryMaxPeriod;
    private final double retryMultiplier;

    public RetryPolicy(double d, double d2, int i, int i2) {
        this.retryBasePeriod = d;
        this.retryMultiplier = d2;
        this.retryMaxAttempts = i;
        this.retryMaxPeriod = i2;
    }

    public final double calculateDelay$sdk_configuration(int i) {
        return this.retryBasePeriod * Math.pow(this.retryMultiplier, (double) (i - 1));
    }

    public final int getDelay(int i) {
        double calculateDelay$sdk_configuration = calculateDelay$sdk_configuration(i);
        int i2 = this.retryMaxPeriod;
        if (i2 != 0) {
            calculateDelay$sdk_configuration = Math.min(calculateDelay$sdk_configuration, (double) i2);
        }
        return (int) calculateDelay$sdk_configuration;
    }

    public final double getRetryBasePeriod() {
        return this.retryBasePeriod;
    }

    public final int getRetryMaxAttempts() {
        return this.retryMaxAttempts;
    }

    public final double getRetryMultiplier() {
        return this.retryMultiplier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RetryPolicy(retryBasePeriod=");
        sb.append(this.retryBasePeriod);
        sb.append(", retryMultiplier=");
        sb.append(this.retryMultiplier);
        sb.append(", retryMaxAttempts=");
        sb.append(this.retryMaxAttempts);
        sb.append(", retryMaxPeriod=");
        sb.append(this.retryMaxPeriod);
        sb.append(')');
        return sb.toString();
    }

    public RetryPolicy() {
        this(2.0d, 1.5d, 20, 120);
    }
}
