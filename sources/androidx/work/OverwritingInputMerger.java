package androidx.work;

import androidx.work.Data.C1011a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends C1033g {
    /* renamed from: a */
    public Data mo5572a(List<Data> list) {
        C1011a aVar = new C1011a();
        HashMap hashMap = new HashMap();
        for (Data a : list) {
            hashMap.putAll(a.mo5585a());
        }
        aVar.mo5593a((Map<String, Object>) hashMap);
        return aVar.mo5594a();
    }
}
