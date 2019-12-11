package com.bamtech.sdk4.internal.media.offline;

import androidx.work.C1032f;
import androidx.work.C1166l;
import androidx.work.Data;
import androidx.work.Data.C1011a;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.C1015a;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseAllLicensesWorker;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadWorkManagerHelper.kt */
final class DefaultDownloadWorkManagerHelper$removeAllLicenses$1 implements C11945a {
    final /* synthetic */ List $licenses;
    final /* synthetic */ DefaultDownloadWorkManagerHelper this$0;

    DefaultDownloadWorkManagerHelper$removeAllLicenses$1(DefaultDownloadWorkManagerHelper defaultDownloadWorkManagerHelper, List list) {
        this.this$0 = defaultDownloadWorkManagerHelper;
        this.$licenses = list;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Triple triple : this.$licenses) {
            arrayList.add(triple.mo31023d());
            arrayList2.add(triple.mo31024e());
            arrayList3.add(triple.mo31026f());
        }
        C1015a aVar = new C1015a(ReleaseAllLicensesWorker.class);
        Pair[] pairArr = new Pair[3];
        Object[] array = arrayList.toArray(new String[0]);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (array != null) {
            pairArr[0] = C12907r.m40244a("MEDIA_IDS", array);
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                pairArr[1] = C12907r.m40244a("LICENSES", array2);
                Object[] array3 = arrayList3.toArray(new String[0]);
                if (array3 != null) {
                    pairArr[2] = C12907r.m40244a("AUDIO_LICENSES", array3);
                    C1011a aVar2 = new C1011a();
                    for (Pair pair : pairArr) {
                        aVar2.mo5591a((String) pair.mo31015c(), pair.mo31016d());
                    }
                    Data a = aVar2.mo5594a();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "dataBuilder.build()");
                    C1166l a2 = ((C1015a) aVar.mo5954a(a)).mo5958a();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a2, "OneTimeWorkRequestBuilde…                 .build()");
                    this.this$0.workManager.mo5641a("releaseAllLicenses", C1032f.KEEP, (OneTimeWorkRequest) a2).mo5759a();
                    return;
                }
                throw new C13142s(str);
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }
}
