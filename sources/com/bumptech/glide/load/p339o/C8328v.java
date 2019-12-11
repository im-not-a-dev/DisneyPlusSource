package com.bumptech.glide.load.p339o;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.v */
/* compiled from: UnitModelLoader */
public class C8328v<Model> implements C8306n<Model,MODEL> {

    /* renamed from: a */
    private static final C8328v<?> f17805a = new C8328v<>();

    /* renamed from: com.bumptech.glide.load.o.v$a */
    /* compiled from: UnitModelLoader */
    public static class C8329a<Model> implements C8308o<Model,MODEL> {

        /* renamed from: a */
        private static final C8329a<?> f17806a = new C8329a<>();

        /* renamed from: b */
        public static <T> C8329a<T> m24195b() {
            return f17806a;
        }

        /* renamed from: a */
        public C8306n<Model,MODEL> mo19954a(C8314r rVar) {
            return C8328v.m24192a();
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.v$b */
    /* compiled from: UnitModelLoader */
    private static class C8330b<Model> implements C8122d<Model> {

        /* renamed from: c */
        private finalMODEL f17807c;

        C8330b(ModelMODEL) {
            this.f17807c =MODEL;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? superMODEL> aVar) {
            aVar.mo21180a(this.f17807c);
        }

        /* renamed from: b */
        public C8105a mo21142b() {
            return C8105a.LOCAL;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        /* renamed from: a */
        public Class<Model> mo21140a() {
            return this.f17807c.getClass();
        }
    }

    /* renamed from: a */
    public static <T> C8328v<T> m24192a() {
        return f17805a;
    }

    /* renamed from: a */
    public boolean mo19953a(ModelMODEL) {
        return true;
    }

    /* renamed from: a */
    public C8307a<Model> mo19951a(ModelMODEL, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(model), new C8330b(model));
    }
}
