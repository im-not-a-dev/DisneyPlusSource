package com.bamtech.sdk4.internal.sugar;

import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0006\u001aD\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\b¨\u0006\t"}, mo31007d2 = {"plusIfNotNull", "", "T", "U", "key", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "pair", "Lkotlin/Pair;", "sdk-base"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: MapExtensions.kt */
public final class MapExtensionsKt {
    public static final <T, U> Map<T, U> plusIfNotNull(Map<T, ? extends U> map, Pair<? extends T, ? extends U> pair) {
        Object d = pair.mo31016d();
        if (d == null) {
            return map;
        }
        Map a = C13173j0.m40354a((Map) map, C12907r.m40244a(pair.mo31015c(), d));
        return a != null ? a : map;
    }

    public static final <T, U> Map<T, U> plusIfNotNull(Map<T, ? extends U> map, T t, U u) {
        return plusIfNotNull(map, new Pair(t, u));
    }
}
