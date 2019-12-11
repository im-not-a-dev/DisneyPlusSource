package com.bamtech.sdk4.media.offline;

import android.content.Context;
import com.bamtech.sdk4.plugin.PluginExtra;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/OfflineMediaPluginExtra;", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "applicationContext", "Landroid/content/Context;", "delayInitialization", "", "(Landroid/content/Context;Z)V", "getApplicationContext", "()Landroid/content/Context;", "getDelayInitialization", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaPlugin.kt */
public final class OfflineMediaPluginExtra implements PluginExtra {
    private final Context applicationContext;
    private final boolean delayInitialization;

    public OfflineMediaPluginExtra(Context context, boolean z) {
        this.applicationContext = context;
        this.delayInitialization = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OfflineMediaPluginExtra) {
                OfflineMediaPluginExtra offlineMediaPluginExtra = (OfflineMediaPluginExtra) obj;
                if (C12880j.m40224a((Object) this.applicationContext, (Object) offlineMediaPluginExtra.applicationContext)) {
                    if (this.delayInitialization == offlineMediaPluginExtra.delayInitialization) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final boolean getDelayInitialization() {
        return this.delayInitialization;
    }

    public int hashCode() {
        Context context = this.applicationContext;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        boolean z = this.delayInitialization;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineMediaPluginExtra(applicationContext=");
        sb.append(this.applicationContext);
        sb.append(", delayInitialization=");
        sb.append(this.delayInitialization);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ OfflineMediaPluginExtra(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(context, z);
    }
}
