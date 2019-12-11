package com.bumptech.glide.load.p334n;

import android.util.Log;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p332m.C8124e;
import com.bumptech.glide.load.p341p.p347h.C8429e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.i */
/* compiled from: DecodePath */
public class C8225i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f17602a;

    /* renamed from: b */
    private final List<? extends C8116j<DataType, ResourceType>> f17603b;

    /* renamed from: c */
    private final C8429e<ResourceType, Transcode> f17604c;

    /* renamed from: d */
    private final C4114f<List<Throwable>> f17605d;

    /* renamed from: e */
    private final String f17606e;

    /* renamed from: com.bumptech.glide.load.n.i$a */
    /* compiled from: DecodePath */
    interface C8226a<ResourceType> {
        /* renamed from: a */
        C8258v<ResourceType> mo21356a(C8258v<ResourceType> vVar);
    }

    public C8225i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C8116j<DataType, ResourceType>> list, C8429e<ResourceType, Transcode> eVar, C4114f<List<Throwable>> fVar) {
        this.f17602a = cls;
        this.f17603b = list;
        this.f17604c = eVar;
        this.f17605d = fVar;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f17606e = sb.toString();
    }

    /* renamed from: a */
    public C8258v<Transcode> mo21366a(C8124e<DataType> eVar, int i, int i2, C8115i iVar, C8226a<ResourceType> aVar) throws C8251q {
        return this.f17604c.mo21640a(aVar.mo21356a(m23895a(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.f17602a);
        sb.append(", decoders=");
        sb.append(this.f17603b);
        sb.append(", transcoder=");
        sb.append(this.f17604c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private C8258v<ResourceType> m23895a(C8124e<DataType> eVar, int i, int i2, C8115i iVar) throws C8251q {
        Object a = this.f17605d.mo14666a();
        C10774j.m34012a(a);
        List list = (List) a;
        try {
            C8258v<ResourceType> a2 = m23896a(eVar, i, i2, iVar, list);
            return a2;
        } finally {
            this.f17605d.mo14667a(list);
        }
    }

    /* renamed from: a */
    private C8258v<ResourceType> m23896a(C8124e<DataType> eVar, int i, int i2, C8115i iVar, List<Throwable> list) throws C8251q {
        int size = this.f17603b.size();
        C8258v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C8116j jVar = (C8116j) this.f17603b.get(i3);
            try {
                if (jVar.mo21166a(eVar.mo21181a(), iVar)) {
                    vVar = jVar.mo21165a(eVar.mo21181a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                String str = "DecodePath";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(jVar);
                    Log.v(str, sb.toString(), e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C8251q(this.f17606e, (List<Throwable>) new ArrayList<Throwable>(list));
    }
}
