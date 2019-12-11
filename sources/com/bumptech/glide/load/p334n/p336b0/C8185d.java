package com.bumptech.glide.load.p334n.p336b0;

import com.bumptech.glide.load.p334n.p336b0.C8178a.C8179a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.d */
/* compiled from: DiskLruCacheFactory */
public class C8185d implements C8179a {

    /* renamed from: a */
    private final long f17478a;

    /* renamed from: b */
    private final C8186a f17479b;

    /* renamed from: com.bumptech.glide.load.n.b0.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C8186a {
        /* renamed from: a */
        File mo21277a();
    }

    public C8185d(C8186a aVar, long j) {
        this.f17478a = j;
        this.f17479b = aVar;
    }

    public C8178a build() {
        File a = this.f17479b.mo21277a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C8187e.m23771a(a, this.f17478a);
        }
        return null;
    }
}
