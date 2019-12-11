package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p334n.p336b0.C8178a.C8180b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.e */
/* compiled from: DataCacheWriter */
class C8212e<DataType> implements C8180b {

    /* renamed from: a */
    private final C8108d<DataType> f17528a;

    /* renamed from: b */
    private final DataType f17529b;

    /* renamed from: c */
    private final C8115i f17530c;

    C8212e(C8108d<DataType> dVar, DataType datatype, C8115i iVar) {
        this.f17528a = dVar;
        this.f17529b = datatype;
        this.f17530c = iVar;
    }

    /* renamed from: a */
    public boolean mo21272a(File file) {
        return this.f17528a.mo21151a(this.f17529b, file, this.f17530c);
    }
}
