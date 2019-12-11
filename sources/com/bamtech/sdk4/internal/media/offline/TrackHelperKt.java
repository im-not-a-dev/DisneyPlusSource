package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.Streamable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, mo31007d2 = {"name", "", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "getName", "(Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;)Ljava/lang/String;", "findTargetBitrate", "T", "Lcom/bamtech/sdk4/internal/media/Streamable;", "filtered", "", "sorted", "constraintRate", "", "(Ljava/util/List;Ljava/util/List;I)Lcom/bamtech/sdk4/internal/media/Streamable;", "getDownloadSize", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "audioTrackCount", "subtitleTrackCount", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: TrackHelper.kt */
public final class TrackHelperKt {
    public static final <T extends Streamable> T findTargetBitrate(List<? extends T> list, List<? extends T> list2, int i) {
        Object obj;
        Object obj2;
        boolean z;
        T t;
        boolean z2;
        T t2;
        boolean z3;
        boolean z4;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Streamable) obj).getBitrate() <= i) {
                z4 = true;
                continue;
            } else {
                z4 = false;
                continue;
            }
            if (z4) {
                break;
            }
        }
        T t3 = (Streamable) obj;
        if (t3 == null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((Streamable) t2).getBitrate() > i) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            t3 = (Streamable) t2;
        }
        if (t3 == null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (((Streamable) t).getBitrate() <= i) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            t3 = (Streamable) t;
        }
        if (t3 != null) {
            return t3;
        }
        ListIterator listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator2.previous();
            if (((Streamable) obj2).getBitrate() > i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Streamable) obj2;
    }

    public static final String getName(VariantCandidate variantCandidate) {
        String str = variantCandidate.getFormat().f18350c;
        if (str == null || !C12833x.m40151a((CharSequence) str, ':', false, 2, (Object) null)) {
            return "";
        }
        String str2 = variantCandidate.getFormat().f18350c;
        if (str2 != null) {
            C12880j.m40222a((Object) str2, "format.id!!");
            return C12833x.m40136a(str2, ':', (String) null, 2, (Object) null);
        }
        C12880j.m40220a();
        throw null;
    }
}
