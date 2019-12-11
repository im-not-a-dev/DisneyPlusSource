package com.bamtech.sdk4.internal.configuration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u001a*\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006\u0006"}, mo31007d2 = {"getCommonHeaders", "", "", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "tokenMap", "", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
public final class ConfigurationProviderKt {
    public static final Map<String, String> getCommonHeaders(Configuration configuration, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : configuration.getCommonHeaders().entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            for (Entry entry2 : map.entrySet()) {
                pair = new Pair(pair.mo31015c(), C12832w.m40117a((String) pair.mo31016d(), (String) entry2.getKey(), (String) entry2.getValue(), false, 4, (Object) null));
            }
            linkedHashMap.put(pair.mo31015c(), pair.mo31016d());
        }
        return linkedHashMap;
    }
}
