package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/HlsPlaylistVariantConverter;", "", "()V", "toHlsPlaylistVariants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "value", "", "toNullableInt", "", "inputString", "(Ljava/lang/String;)Ljava/lang/Integer;", "toNullableLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "toNullableString", "toString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.HlsPlaylistVariantConverter */
/* compiled from: HlsPlaylistVariantConverter.kt */
public final class HlsPlaylistVariantConverter {
    public static final HlsPlaylistVariantConverter INSTANCE = new HlsPlaylistVariantConverter();

    private HlsPlaylistVariantConverter() {
    }

    public static final List<HlsPlaylistVariant> toHlsPlaylistVariants(String str) {
        String str2 = str;
        ArrayList arrayList = null;
        if (C12880j.m40224a((Object) str2, (Object) "")) {
            return null;
        }
        if (str2 != null) {
            List<String> a = C12833x.m40142a((CharSequence) str, new String[]{"|"}, false, 0, 6, (Object) null);
            ArrayList<List> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) a, 10));
            for (String a2 : a) {
                arrayList2.add(C12833x.m40142a((CharSequence) a2, new String[]{";"}, false, 0, 6, (Object) null));
            }
            ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
            for (List list : arrayList2) {
                HlsPlaylistVariant hlsPlaylistVariant = new HlsPlaylistVariant(Long.parseLong((String) list.get(0)), (String) list.get(1), Long.parseLong((String) list.get(2)), INSTANCE.toNullableLong((String) list.get(3)), INSTANCE.toNullableLong((String) list.get(4)), INSTANCE.toNullableInt((String) list.get(5)), INSTANCE.toNullableString((String) C13199w.m40578d(list, 6)), INSTANCE.toNullableString((String) C13199w.m40578d(list, 7)), INSTANCE.toNullableString((String) C13199w.m40578d(list, 8)), INSTANCE.toNullableString((String) C13199w.m40578d(list, 9)));
                arrayList3.add(hlsPlaylistVariant);
            }
            arrayList = new ArrayList(arrayList3);
        }
        return arrayList;
    }

    private final Integer toNullableInt(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    private final Long toNullableLong(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    private final String toNullableString(String str) {
        if (str == null || C12832w.m40118a(str)) {
            return null;
        }
        return str;
    }

    public static final String toString(List<HlsPlaylistVariant> list) {
        if (list == null) {
            return null;
        }
        return C13199w.m40559a(list, "|", null, null, 0, null, HlsPlaylistVariantConverter$toString$1.INSTANCE, 30, null);
    }
}
