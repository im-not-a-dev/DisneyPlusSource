package com.bamtech.sdk4;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0012\u0010\u0012\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0012\u0010\u0014\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/ThumbnailSet;", "", "()V", "intervalMilliseconds", "", "getIntervalMilliseconds", "()J", "presentations", "", "Lcom/bamtech/sdk4/Presentation;", "getPresentations", "()Ljava/util/List;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getResolution", "()Lcom/bamtech/sdk4/ThumbnailResolution;", "thumbnailHeight", "getThumbnailHeight", "thumbnailWidth", "getThumbnailWidth", "totalBytes", "getTotalBytes", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public abstract class ThumbnailSet {
    public abstract long getIntervalMilliseconds();

    public abstract List<Presentation> getPresentations();

    public abstract ThumbnailResolution getResolution();

    public abstract long getThumbnailHeight();

    public abstract long getThumbnailWidth();

    public abstract long getTotalBytes();
}
