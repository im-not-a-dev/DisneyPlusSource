package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/ContentIdsMissingError;", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
public final class ContentIdsMissingError implements ErrorReason {
    private final String code;
    private final String description;

    public ContentIdsMissingError(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public /* synthetic */ ContentIdsMissingError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "400";
        }
        if ((i & 2) != 0) {
            str2 = "ContentIds should not be empty";
        }
        this(str, str2);
    }
}
