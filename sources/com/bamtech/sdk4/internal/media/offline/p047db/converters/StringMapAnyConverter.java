package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.bamtech.sdk4.internal.networking.DefaultGsonBuilderFactory;
import com.bamtech.shadow.gson.Gson;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007J \u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/StringMapAnyConverter;", "", "()V", "gson", "Lcom/bamtech/shadow/gson/Gson;", "kotlin.jvm.PlatformType", "fromList", "", "value", "", "fromString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.StringMapAnyConverter */
/* compiled from: StringMapAnyConverter.kt */
public final class StringMapAnyConverter {
    private static final Gson gson = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11063a();

    static {
        new StringMapAnyConverter();
    }

    private StringMapAnyConverter() {
    }

    public static final String fromList(Map<String, ? extends Object> map) {
        if (map != null) {
            return gson.mo11046a((Object) map);
        }
        return null;
    }

    public static final Map<String, Object> fromString(String str) {
        if (str != null) {
            return (Map) gson.mo11044a(str, new StringMapAnyConverter$fromString$1$1().getType());
        }
        return null;
    }
}
