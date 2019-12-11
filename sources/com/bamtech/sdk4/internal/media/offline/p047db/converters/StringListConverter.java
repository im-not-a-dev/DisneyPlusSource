package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/StringListConverter;", "", "()V", "fromList", "", "value", "", "fromString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.StringListConverter */
/* compiled from: StringListConverter.kt */
public final class StringListConverter {
    static {
        new StringListConverter();
    }

    private StringListConverter() {
    }

    public static final String fromList(List<String> list) {
        if (list != null) {
            return C13199w.m40559a(list, null, null, null, 0, null, null, 63, null);
        }
        return null;
    }

    public static final List<String> fromString(String str) {
        if (str != null) {
            List<String> a = C12833x.m40142a((CharSequence) str, new String[]{", "}, false, 0, 6, (Object) null);
            if (a != null) {
                return a;
            }
        }
        return C13185o.m40513a();
    }
}
