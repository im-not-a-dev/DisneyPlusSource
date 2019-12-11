package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientExtras;", "", "()V", "urlSizeLimit", "", "(I)V", "getUrlSizeLimit", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentServiceConfiguration.kt */
public final class ContentServiceClientExtras {
    public static final Companion Companion = new Companion(null);
    public static final int URL_SIZE_LIMIT = 8192;
    private final int urlSizeLimit;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientExtras$Companion;", "", "()V", "URL_SIZE_LIMIT", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ContentServiceConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContentServiceClientExtras(int i) {
        this.urlSizeLimit = i;
    }

    public static /* synthetic */ ContentServiceClientExtras copy$default(ContentServiceClientExtras contentServiceClientExtras, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentServiceClientExtras.urlSizeLimit;
        }
        return contentServiceClientExtras.copy(i);
    }

    public final int component1() {
        return this.urlSizeLimit;
    }

    public final ContentServiceClientExtras copy(int i) {
        return new ContentServiceClientExtras(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentServiceClientExtras) {
                if (this.urlSizeLimit == ((ContentServiceClientExtras) obj).urlSizeLimit) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getUrlSizeLimit() {
        return this.urlSizeLimit;
    }

    public int hashCode() {
        return this.urlSizeLimit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentServiceClientExtras(urlSizeLimit=");
        sb.append(this.urlSizeLimit);
        sb.append(")");
        return sb.toString();
    }

    public ContentServiceClientExtras() {
        this(URL_SIZE_LIMIT);
    }
}
