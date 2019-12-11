package com.bamtech.sdk4.plugin;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/plugin/PluginInitializationException;", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Plugin.kt */
public final class PluginInitializationException extends Throwable {
    public PluginInitializationException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ PluginInitializationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            th = null;
        }
        this(str, th);
    }
}
