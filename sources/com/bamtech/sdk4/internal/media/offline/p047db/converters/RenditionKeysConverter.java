package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import com.bamtech.sdk4.internal.networking.DefaultGsonBuilderFactory;
import com.bamtech.shadow.gson.Gson;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12815k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/RenditionKeysConverter;", "", "()V", "gson", "Lcom/bamtech/shadow/gson/Gson;", "kotlin.jvm.PlatformType", "toRenditionKeys", "Ljava/util/ArrayList;", "Lcom/google/android/exoplayer2/offline/StreamKey;", "Lkotlin/collections/ArrayList;", "value", "", "toString", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.RenditionKeysConverter */
/* compiled from: RenditionKeysConverter.kt */
public final class RenditionKeysConverter {
    private static final Gson gson = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11063a();

    static {
        new RenditionKeysConverter();
    }

    private RenditionKeysConverter() {
    }

    public static final ArrayList<StreamKey> toRenditionKeys(String str) {
        ArrayList<StreamKey> arrayList;
        StreamKeyCompat streamKeyCompat;
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        if (new C12815k("^[0-9].*").mo31141c(str)) {
            List<String> a = C12833x.m40142a((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList<List> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) a, 10));
            for (String a2 : a) {
                arrayList2.add(C12833x.m40142a((CharSequence) a2, new String[]{"."}, false, 0, 6, (Object) null));
            }
            ArrayList<StreamKeyCompat> arrayList3 = new ArrayList<>(C13187p.m40525a((Iterable) arrayList2, 10));
            for (List list : arrayList2) {
                int size = list.size();
                if (size == 2) {
                    streamKeyCompat = new StreamKeyCompat(Integer.parseInt((String) list.get(0)), Integer.parseInt((String) list.get(1)), 0, 4, null);
                } else if (size != 3) {
                    streamKeyCompat = new StreamKeyCompat(0, 0, 0, 4, null);
                } else {
                    streamKeyCompat = new StreamKeyCompat(Integer.parseInt((String) list.get(1)), Integer.parseInt((String) list.get(2)), 0, 4, null);
                }
                arrayList3.add(streamKeyCompat);
            }
            ArrayList arrayList4 = new ArrayList(C13187p.m40525a((Iterable) arrayList3, 10));
            for (StreamKeyCompat streamKey : arrayList3) {
                arrayList4.add(streamKey.toStreamKey());
            }
            arrayList = new ArrayList<>(arrayList4);
        } else {
            ArrayList arrayList5 = (ArrayList) gson.mo11044a(str, new RenditionKeysConverter$toRenditionKeys$compatList$1().getType());
            ArrayList<StreamKey> arrayList6 = new ArrayList<>();
            C12880j.m40222a((Object) arrayList5, "compatList");
            ArrayList<StreamKeyCompat> arrayList7 = new ArrayList<>();
            for (Object next : arrayList5) {
                if (((StreamKeyCompat) next).getFormatVersion() <= 1) {
                    arrayList7.add(next);
                }
            }
            ArrayList arrayList8 = new ArrayList(C13187p.m40525a((Iterable) arrayList7, 10));
            for (StreamKeyCompat streamKey2 : arrayList7) {
                arrayList8.add(streamKey2.toStreamKey());
            }
            arrayList6.addAll(arrayList8);
            arrayList = arrayList6;
        }
        return arrayList;
    }

    public static final String toString(List<StreamKey> list) {
        if (list == null) {
            return null;
        }
        Gson gson2 = gson;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (StreamKey streamKeyCompat : list) {
            arrayList.add(new StreamKeyCompat(streamKeyCompat));
        }
        return gson2.mo11046a((Object) arrayList);
    }
}
