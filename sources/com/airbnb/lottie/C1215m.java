package com.airbnb.lottie;

import com.airbnb.lottie.p022w.C1373d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p096e.p113e.C3928b;
import p096e.p121h.p134r.C4112d;

/* renamed from: com.airbnb.lottie.m */
/* compiled from: PerformanceTracker */
public class C1215m {

    /* renamed from: a */
    private boolean f4556a = false;

    /* renamed from: b */
    private final Set<C1217b> f4557b = new C3928b();

    /* renamed from: c */
    private final Map<String, C1373d> f4558c = new HashMap();

    /* renamed from: com.airbnb.lottie.m$a */
    /* compiled from: PerformanceTracker */
    class C1216a implements Comparator<C4112d<String, Float>> {
        C1216a(C1215m mVar) {
        }

        /* renamed from: a */
        public int compare(C4112d<String, Float> dVar, C4112d<String, Float> dVar2) {
            float floatValue = ((Float) dVar.f10380b).floatValue();
            float floatValue2 = ((Float) dVar2.f10380b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: com.airbnb.lottie.m$b */
    /* compiled from: PerformanceTracker */
    public interface C1217b {
        /* renamed from: a */
        void mo6138a(float f);
    }

    public C1215m() {
        new C1216a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6135a(boolean z) {
        this.f4556a = z;
    }

    /* renamed from: a */
    public void mo6134a(String str, float f) {
        if (this.f4556a) {
            C1373d dVar = (C1373d) this.f4558c.get(str);
            if (dVar == null) {
                dVar = new C1373d();
                this.f4558c.put(str, dVar);
            }
            dVar.mo6418a(f);
            if (str.equals("__container")) {
                for (C1217b a : this.f4557b) {
                    a.mo6138a(f);
                }
            }
        }
    }
}
