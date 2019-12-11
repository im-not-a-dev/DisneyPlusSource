package com.google.android.exoplayer2.p366s0.p368s;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8911f;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.s0.s.d */
/* compiled from: ScriptTagPayloadReader */
final class C8931d extends C8932e {

    /* renamed from: b */
    private long f19218b = -9223372036854775807L;

    public C8931d() {
        super(new C8911f());
    }

    /* renamed from: c */
    private static Date m26221c(C9572w wVar) {
        Date date = new Date((long) m26222d(wVar).doubleValue());
        wVar.mo24695f(2);
        return date;
    }

    /* renamed from: d */
    private static Double m26222d(C9572w wVar) {
        return Double.valueOf(Double.longBitsToDouble(wVar.mo24707r()));
    }

    /* renamed from: e */
    private static HashMap<String, Object> m26223e(C9572w wVar) {
        int z = wVar.mo24715z();
        HashMap<String, Object> hashMap = new HashMap<>(z);
        for (int i = 0; i < z; i++) {
            String h = m26226h(wVar);
            Object a = m26219a(wVar, m26227i(wVar));
            if (a != null) {
                hashMap.put(h, a);
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    private static HashMap<String, Object> m26224f(C9572w wVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String h = m26226h(wVar);
            int i = m26227i(wVar);
            if (i == 9) {
                return hashMap;
            }
            Object a = m26219a(wVar, i);
            if (a != null) {
                hashMap.put(h, a);
            }
        }
    }

    /* renamed from: g */
    private static ArrayList<Object> m26225g(C9572w wVar) {
        int z = wVar.mo24715z();
        ArrayList<Object> arrayList = new ArrayList<>(z);
        for (int i = 0; i < z; i++) {
            Object a = m26219a(wVar, m26227i(wVar));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m26226h(C9572w wVar) {
        int B = wVar.mo24676B();
        int c = wVar.mo24688c();
        wVar.mo24695f(B);
        return new String(wVar.f22333a, c, B);
    }

    /* renamed from: i */
    private static int m26227i(C9572w wVar) {
        return wVar.mo24711v();
    }

    /* renamed from: a */
    public long mo23328a() {
        return this.f19218b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23326a(C9572w wVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo23327b(C9572w wVar, long j) throws C8723g0 {
        if (m26227i(wVar) == 2) {
            if (!"onMetaData".equals(m26226h(wVar)) || m26227i(wVar) != 8) {
                return false;
            }
            HashMap e = m26223e(wVar);
            String str = "duration";
            if (e.containsKey(str)) {
                double doubleValue = ((Double) e.get(str)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f19218b = (long) (doubleValue * 1000000.0d);
                }
            }
            return false;
        }
        throw new C8723g0();
    }

    /* renamed from: a */
    private static Object m26219a(C9572w wVar, int i) {
        if (i == 0) {
            return m26222d(wVar);
        }
        if (i == 1) {
            return m26220b(wVar);
        }
        if (i == 2) {
            return m26226h(wVar);
        }
        if (i == 3) {
            return m26224f(wVar);
        }
        if (i == 8) {
            return m26223e(wVar);
        }
        if (i == 10) {
            return m26225g(wVar);
        }
        if (i != 11) {
            return null;
        }
        return m26221c(wVar);
    }

    /* renamed from: b */
    private static Boolean m26220b(C9572w wVar) {
        boolean z = true;
        if (wVar.mo24711v() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
