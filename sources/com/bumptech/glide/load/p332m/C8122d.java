package com.bumptech.glide.load.p332m;

import com.bumptech.glide.load.C8105a;
import p163g.p413f.p414a.C10657j;

/* renamed from: com.bumptech.glide.load.m.d */
/* compiled from: DataFetcher */
public interface C8122d<T> {

    /* renamed from: com.bumptech.glide.load.m.d$a */
    /* compiled from: DataFetcher */
    public interface C8123a<T> {
        /* renamed from: a */
        void mo21179a(Exception exc);

        /* renamed from: a */
        void mo21180a(T t);
    }

    /* renamed from: a */
    Class<T> mo21140a();

    /* renamed from: a */
    void mo21141a(C10657j jVar, C8123a<? super T> aVar);

    /* renamed from: b */
    C8105a mo21142b();

    void cancel();

    void cleanup();
}
