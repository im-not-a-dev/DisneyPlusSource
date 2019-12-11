package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/HdrType;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "toString", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: HdrType.kt */
public final class HdrType {
    public static final Companion Companion = new Companion(null);
    public static final HdrType DOLBY_VISION = new HdrType("dolbyVision");
    public static final HdrType HDR10 = new HdrType("hdr10");
    private final String type;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/HdrType$Companion;", "", "()V", "DOLBY_VISION", "Lcom/bamtech/sdk4/media/HdrType;", "HDR10", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: HdrType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HdrType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    public String toString() {
        return this.type;
    }
}
