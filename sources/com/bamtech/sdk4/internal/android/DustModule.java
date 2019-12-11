package com.bamtech.sdk4.internal.android;

import android.app.Application;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/DustModule;", "", "()V", "baseDustClient", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "correlationIds", "", "", "dustDir", "Ljava/io/File;", "application", "Landroid/app/Application;", "glimpseDir", "qosDir", "telemetryDir", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustModule.kt */
public final class DustModule {
    public final DustClientConstants baseDustClient(BootstrapConfiguration bootstrapConfiguration, Map<String, String> map) {
        return new DustModule$baseDustClient$1(bootstrapConfiguration, map);
    }

    public final File dustDir(Application application) {
        File file = new File(application.getFilesDir(), "dust");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final File glimpseDir(Application application) {
        File file = new File(application.getFilesDir(), "glimpse");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final File qosDir(Application application) {
        File file = new File(application.getFilesDir(), "qos");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final File telemetryDir(Application application) {
        File file = new File(application.getFilesDir(), "streamsample");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
