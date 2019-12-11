package com.airbnb.lottie.p012r.p014c;

import android.graphics.Path;
import com.airbnb.lottie.p016t.p018k.C1296g;
import com.airbnb.lottie.p016t.p018k.C1304l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.g */
/* compiled from: MaskKeyframeAnimation */
public class C1254g {

    /* renamed from: a */
    private final List<C1247a<C1304l, Path>> f4707a;

    /* renamed from: b */
    private final List<C1247a<Integer, Integer>> f4708b;

    /* renamed from: c */
    private final List<C1296g> f4709c;

    public C1254g(List<C1296g> list) {
        this.f4709c = list;
        this.f4707a = new ArrayList(list.size());
        this.f4708b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f4707a.add(((C1296g) list.get(i)).mo6269b().mo6223a());
            this.f4708b.add(((C1296g) list.get(i)).mo6270c().mo6223a());
        }
    }

    /* renamed from: a */
    public List<C1247a<C1304l, Path>> mo6176a() {
        return this.f4707a;
    }

    /* renamed from: b */
    public List<C1296g> mo6177b() {
        return this.f4709c;
    }

    /* renamed from: c */
    public List<C1247a<Integer, Integer>> mo6178c() {
        return this.f4708b;
    }
}
