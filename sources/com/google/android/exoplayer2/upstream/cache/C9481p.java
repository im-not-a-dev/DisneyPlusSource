package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.exoplayer2.upstream.cache.p */
/* compiled from: ContentMetadataMutations */
public class C9481p {

    /* renamed from: a */
    private final Map<String, Object> f22063a = new HashMap();

    /* renamed from: b */
    private final List<String> f22064b = new ArrayList();

    /* renamed from: a */
    public static C9481p m29130a(C9481p pVar, long j) {
        pVar.mo24545a("exo_len", j);
        return pVar;
    }

    /* renamed from: b */
    public List<String> mo24548b() {
        return Collections.unmodifiableList(new ArrayList(this.f22064b));
    }

    /* renamed from: a */
    public static C9481p m29131a(C9481p pVar, Uri uri) {
        String str = "exo_redir";
        if (uri == null) {
            pVar.mo24544a(str);
            return pVar;
        }
        pVar.mo24546a(str, uri.toString());
        return pVar;
    }

    /* renamed from: a */
    public C9481p mo24546a(String str, String str2) {
        m29132a(str, (Object) str2);
        return this;
    }

    /* renamed from: a */
    public C9481p mo24545a(String str, long j) {
        m29132a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public C9481p mo24544a(String str) {
        this.f22064b.add(str);
        this.f22063a.remove(str);
        return this;
    }

    /* renamed from: a */
    public Map<String, Object> mo24547a() {
        HashMap hashMap = new HashMap(this.f22063a);
        for (Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private C9481p m29132a(String str, Object obj) {
        Map<String, Object> map = this.f22063a;
        C9537e.m29296a(str);
        C9537e.m29296a(obj);
        map.put(str, obj);
        this.f22064b.remove(str);
        return this;
    }
}
