package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.BifThumbnailSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "singleList", "", "kotlin.jvm.PlatformType", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getLocalBifThumbnailSets$3<T, R> implements Function<T, R> {
    public static final DefaultOfflineMediaClient$getLocalBifThumbnailSets$3 INSTANCE = new DefaultOfflineMediaClient$getLocalBifThumbnailSets$3();

    DefaultOfflineMediaClient$getLocalBifThumbnailSets$3() {
    }

    public final List<BifThumbnailSet> apply(List<BifThumbnailSet> list) {
        ArrayList arrayList = new ArrayList();
        for (BifThumbnailSet bifThumbnailSet : list) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                BifThumbnailSet bifThumbnailSet2 = (BifThumbnailSet) next;
                if (bifThumbnailSet2.getIntervalMilliseconds() == bifThumbnailSet.getIntervalMilliseconds() && bifThumbnailSet2.getThumbnailWidth() == bifThumbnailSet.getThumbnailWidth()) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            BifThumbnailSet bifThumbnailSet3 = (BifThumbnailSet) C13199w.m40591g((List) arrayList2);
            if (bifThumbnailSet3 == null) {
                C12880j.m40222a((Object) bifThumbnailSet, "singleItemSet");
                arrayList.add(bifThumbnailSet);
            } else {
                List c = C13199w.m40574c((Collection) bifThumbnailSet3.getPresentations());
                c.add(bifThumbnailSet.getPresentations().get(0));
                arrayList.remove(bifThumbnailSet3);
                arrayList.add(BifThumbnailSet.copy$default(bifThumbnailSet3, 0, 0, 0, 0, C13199w.m40606q(c), null, 47, null));
            }
        }
        return C13199w.m40606q(arrayList);
    }
}
