package com.google.android.exoplayer2.upstream.cache;

import java.io.File;

/* renamed from: com.google.android.exoplayer2.upstream.cache.j */
/* compiled from: CacheSpan */
public class C9470j implements Comparable<C9470j> {

    /* renamed from: U */
    public final long f22030U;

    /* renamed from: V */
    public final long f22031V;

    /* renamed from: W */
    public final boolean f22032W;

    /* renamed from: X */
    public final File f22033X;

    /* renamed from: Y */
    public final long f22034Y;

    /* renamed from: c */
    public final String f22035c;

    public C9470j(String str, long j, long j2, long j3, File file) {
        this.f22035c = str;
        this.f22030U = j;
        this.f22031V = j2;
        this.f22032W = file != null;
        this.f22033X = file;
        this.f22034Y = j3;
    }

    /* renamed from: a */
    public boolean mo24504a() {
        return !this.f22032W;
    }

    /* renamed from: b */
    public boolean mo24505b() {
        return this.f22031V == -1;
    }

    /* renamed from: a */
    public int compareTo(C9470j jVar) {
        if (!this.f22035c.equals(jVar.f22035c)) {
            return this.f22035c.compareTo(jVar.f22035c);
        }
        int i = ((this.f22030U - jVar.f22030U) > 0 ? 1 : ((this.f22030U - jVar.f22030U) == 0 ? 0 : -1));
        int i2 = i == 0 ? 0 : i < 0 ? -1 : 1;
        return i2;
    }
}
