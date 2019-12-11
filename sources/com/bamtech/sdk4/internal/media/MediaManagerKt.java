package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.Presentation;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"THUMBNAIL_ONLINE_DIRECTORY", "", "isLocalFile", "", "Lcom/bamtech/sdk4/Presentation;", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
public final class MediaManagerKt {
    public static final boolean isLocalFile(Presentation presentation) {
        return C12832w.m40123b((String) C13199w.m40589f(presentation.getPaths()), "file://", false, 2, null);
    }
}
