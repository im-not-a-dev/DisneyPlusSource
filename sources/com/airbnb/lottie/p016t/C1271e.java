package com.airbnb.lottie.p016t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.e */
/* compiled from: KeyPath */
public class C1271e {

    /* renamed from: a */
    private final List<String> f4775a;

    /* renamed from: b */
    private C1272f f4776b;

    public C1271e(String... strArr) {
        this.f4775a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public C1271e mo6209a(String str) {
        C1271e eVar = new C1271e(this);
        eVar.f4775a.add(str);
        return eVar;
    }

    /* renamed from: b */
    public int mo6212b(String str, int i) {
        if (m6352b(str)) {
            return 0;
        }
        if (!((String) this.f4775a.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f4775a.size() - 1 && ((String) this.f4775a.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public boolean mo6213c(String str, int i) {
        if (m6352b(str)) {
            return true;
        }
        if (i >= this.f4775a.size()) {
            return false;
        }
        if (((String) this.f4775a.get(i)).equals(str) || ((String) this.f4775a.get(i)).equals("**") || ((String) this.f4775a.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo6214d(String str, int i) {
        boolean z = true;
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f4775a.size() - 1 && !((String) this.f4775a.get(i)).equals("**")) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f4775a);
        sb.append(",resolved=");
        sb.append(this.f4776b != null);
        sb.append('}');
        return sb.toString();
    }

    private C1271e(C1271e eVar) {
        this.f4775a = new ArrayList(eVar.f4775a);
        this.f4776b = eVar.f4776b;
    }

    /* renamed from: a */
    public C1271e mo6208a(C1272f fVar) {
        C1271e eVar = new C1271e(this);
        eVar.f4776b = fVar;
        return eVar;
    }

    /* renamed from: b */
    private boolean m6352b(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C1272f mo6210a() {
        return this.f4776b;
    }

    /* renamed from: b */
    private boolean m6351b() {
        List<String> list = this.f4775a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* renamed from: a */
    public boolean mo6211a(String str, int i) {
        boolean z = false;
        if (i >= this.f4775a.size()) {
            return false;
        }
        boolean z2 = i == this.f4775a.size() - 1;
        String str2 = (String) this.f4775a.get(i);
        if (!str2.equals("**")) {
            boolean z3 = str2.equals(str) || str2.equals("*");
            if ((z2 || (i == this.f4775a.size() - 2 && m6351b())) && z3) {
                z = true;
            }
            return z;
        }
        if (!z2 && ((String) this.f4775a.get(i + 1)).equals(str)) {
            if (i == this.f4775a.size() - 2 || (i == this.f4775a.size() - 3 && m6351b())) {
                z = true;
            }
            return z;
        } else if (z2) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f4775a.size() - 1) {
                return false;
            }
            return ((String) this.f4775a.get(i2)).equals(str);
        }
    }
}
