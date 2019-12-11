package com.airbnb.lottie.p012r.p013b;

import android.graphics.Path;
import com.airbnb.lottie.p022w.C1375f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.b */
/* compiled from: CompoundTrimPathContent */
public class C1226b {

    /* renamed from: a */
    private List<C1246t> f4579a = new ArrayList();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6148a(C1246t tVar) {
        this.f4579a.add(tVar);
    }

    /* renamed from: a */
    public void mo6147a(Path path) {
        for (int size = this.f4579a.size() - 1; size >= 0; size--) {
            C1375f.m6737a(path, (C1246t) this.f4579a.get(size));
        }
    }
}
