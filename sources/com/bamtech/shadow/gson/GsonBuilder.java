package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.C2135a;
import com.bamtech.shadow.gson.internal.Excluder;
import com.bamtech.shadow.gson.internal.bind.TreeTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.TypeAdapters;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GsonBuilder {

    /* renamed from: a */
    private Excluder f6109a = Excluder.f6136Z;

    /* renamed from: b */
    private C2238o f6110b = C2238o.DEFAULT;

    /* renamed from: c */
    private C2129e f6111c = C2123d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C2130f<?>> f6112d = new HashMap();

    /* renamed from: e */
    private final List<C2243q> f6113e = new ArrayList();

    /* renamed from: f */
    private final List<C2243q> f6114f = new ArrayList();

    /* renamed from: g */
    private boolean f6115g = false;

    /* renamed from: h */
    private String f6116h;

    /* renamed from: i */
    private int f6117i = 2;

    /* renamed from: j */
    private int f6118j = 2;

    /* renamed from: k */
    private boolean f6119k = false;

    /* renamed from: l */
    private boolean f6120l = false;

    /* renamed from: m */
    private boolean f6121m = true;

    /* renamed from: n */
    private boolean f6122n = false;

    /* renamed from: o */
    private boolean f6123o = false;

    /* renamed from: p */
    private boolean f6124p = false;

    /* renamed from: a */
    public GsonBuilder mo11064a(C2123d dVar) {
        this.f6111c = dVar;
        return this;
    }

    /* renamed from: b */
    public GsonBuilder mo11067b() {
        this.f6121m = false;
        return this;
    }

    /* renamed from: c */
    public GsonBuilder mo11068c() {
        this.f6115g = true;
        return this;
    }

    /* renamed from: d */
    public GsonBuilder mo11069d() {
        this.f6124p = true;
        return this;
    }

    /* renamed from: a */
    public GsonBuilder mo11066a(Type type, Object obj) {
        boolean z = obj instanceof C2236m;
        C2135a.m8283a(z || (obj instanceof C2132h) || (obj instanceof C2130f) || (obj instanceof C2241p));
        if (obj instanceof C2130f) {
            this.f6112d.put(type, (C2130f) obj);
        }
        if (z || (obj instanceof C2132h)) {
            this.f6113e.add(TreeTypeAdapter.m8355a(TypeToken.get(type), obj));
        }
        if (obj instanceof C2241p) {
            this.f6113e.add(TypeAdapters.m8362a(TypeToken.get(type), (C2241p) obj));
        }
        return this;
    }

    /* renamed from: a */
    public GsonBuilder mo11065a(Class<?> cls, Object obj) {
        boolean z = obj instanceof C2236m;
        C2135a.m8283a(z || (obj instanceof C2132h) || (obj instanceof C2241p));
        if ((obj instanceof C2132h) || z) {
            this.f6114f.add(TreeTypeAdapter.m8356a(cls, obj));
        }
        if (obj instanceof C2241p) {
            this.f6113e.add(TypeAdapters.m8365b(cls, (C2241p) obj));
        }
        return this;
    }

    /* renamed from: a */
    public Gson mo11063a() {
        ArrayList arrayList = new ArrayList(this.f6113e.size() + this.f6114f.size() + 3);
        arrayList.addAll(this.f6113e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f6114f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m8228a(this.f6116h, this.f6117i, this.f6118j, arrayList);
        Gson gson = new Gson(this.f6109a, this.f6111c, this.f6112d, this.f6115g, this.f6119k, this.f6123o, this.f6121m, this.f6122n, this.f6124p, this.f6120l, this.f6110b, arrayList);
        return gson;
    }

    /* renamed from: a */
    private void m8228a(String str, int i, int i2, List<C2243q> list) {
        C2120a aVar;
        C2120a aVar2;
        C2120a aVar3;
        if (str != null) {
            if (!"".equals(str.trim())) {
                C2120a aVar4 = new C2120a(Date.class, str);
                aVar = new C2120a(Timestamp.class, str);
                aVar3 = new C2120a(java.sql.Date.class, str);
                aVar2 = aVar4;
                list.add(TypeAdapters.m8363a(Date.class, (C2241p<TT>) aVar2));
                list.add(TypeAdapters.m8363a(Timestamp.class, (C2241p<TT>) aVar));
                list.add(TypeAdapters.m8363a(java.sql.Date.class, (C2241p<TT>) aVar3));
            }
        }
        if (i != 2 && i2 != 2) {
            aVar2 = new C2120a(Date.class, i, i2);
            C2120a aVar5 = new C2120a(Timestamp.class, i, i2);
            C2120a aVar6 = new C2120a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
            list.add(TypeAdapters.m8363a(Date.class, (C2241p<TT>) aVar2));
            list.add(TypeAdapters.m8363a(Timestamp.class, (C2241p<TT>) aVar));
            list.add(TypeAdapters.m8363a(java.sql.Date.class, (C2241p<TT>) aVar3));
        }
    }
}
