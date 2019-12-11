package com.appboy.p027p;

import com.appboy.p030r.C1532b;
import org.json.JSONObject;
import p161f.p162a.C4569r3;

/* renamed from: com.appboy.p.d */
public class C1519d {

    /* renamed from: a */
    private final C1532b f5558a;

    public C1519d(C1532b bVar, String str) {
        if (bVar != null) {
            this.f5558a = bVar;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public C1532b mo6764a() {
        return this.f5558a;
    }

    public String toString() {
        return C4569r3.m15868a((JSONObject) this.f5558a.mo6750b());
    }
}
