package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8124e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.t */
/* compiled from: LoadPath */
public class C8255t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final C4114f<List<Throwable>> f17693a;

    /* renamed from: b */
    private final List<? extends C8225i<Data, ResourceType, Transcode>> f17694b;

    /* renamed from: c */
    private final String f17695c;

    public C8255t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C8225i<Data, ResourceType, Transcode>> list, C4114f<List<Throwable>> fVar) {
        this.f17693a = fVar;
        C10774j.m34015a(list);
        this.f17694b = list;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f17695c = sb.toString();
    }

    /* renamed from: a */
    public C8258v<Transcode> mo21435a(C8124e<Data> eVar, C8115i iVar, int i, int i2, C8226a<ResourceType> aVar) throws C8251q {
        Object a = this.f17693a.mo14666a();
        C10774j.m34012a(a);
        List list = (List) a;
        try {
            C8258v<Transcode> a2 = m23990a(eVar, iVar, i, i2, aVar, list);
            return a2;
        } finally {
            this.f17693a.mo14667a(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.f17694b.toArray()));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private C8258v<Transcode> m23990a(C8124e<Data> eVar, C8115i iVar, int i, int i2, C8226a<ResourceType> aVar, List<Throwable> list) throws C8251q {
        List<Throwable> list2 = list;
        int size = this.f17694b.size();
        C8258v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C8225i) this.f17694b.get(i3)).mo21366a(eVar, i, i2, iVar, aVar);
            } catch (C8251q e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C8251q(this.f17695c, (List<Throwable>) new ArrayList<Throwable>(list2));
    }
}
