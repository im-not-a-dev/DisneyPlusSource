package com.bumptech.glide.load.p339o;

import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import java.util.Collections;
import java.util.List;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.o.n */
/* compiled from: ModelLoader */
public interface C8306n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.o.n$a */
    /* compiled from: ModelLoader */
    public static class C8307a<Data> {

        /* renamed from: a */
        public final C8111g f17772a;

        /* renamed from: b */
        public final List<C8111g> f17773b;

        /* renamed from: c */
        public final C8122d<Data> f17774c;

        public C8307a(C8111g gVar, C8122d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C8307a(C8111g gVar, List<C8111g> list, C8122d<Data> dVar) {
            C10774j.m34012a(gVar);
            this.f17772a = gVar;
            C10774j.m34012a(list);
            this.f17773b = list;
            C10774j.m34012a(dVar);
            this.f17774c = dVar;
        }
    }

    /* renamed from: a */
    C8307a<Data> mo19951a(Model model, int i, int i2, C8115i iVar);

    /* renamed from: a */
    boolean mo19953a(Model model);
}
