package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.bamtech.sdk4.media.offline.DownloadError;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/DownloadErrorConverter;", "", "()V", "gson", "Lcom/bamtech/shadow/gson/Gson;", "kotlin.jvm.PlatformType", "toDownloadError", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "value", "", "toString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.DownloadErrorConverter */
/* compiled from: DownloadErrorConverter.kt */
public final class DownloadErrorConverter {
    private static final Gson gson = new GsonBuilder().mo11063a();

    static {
        new DownloadErrorConverter();
    }

    private DownloadErrorConverter() {
    }

    public static final DownloadError toDownloadError(String str) {
        if (C12880j.m40224a((Object) str, (Object) "")) {
            return null;
        }
        return (DownloadError) gson.mo11043a(str, DownloadError.class);
    }

    public static final String toString(DownloadError downloadError) {
        return gson.mo11046a((Object) downloadError);
    }
}
