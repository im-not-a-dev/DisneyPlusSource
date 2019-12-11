package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.upstream.C9442a0.C9447e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.c0 */
/* compiled from: ParsingLoadable */
public final class C9455c0<T> implements C9447e {

    /* renamed from: a */
    public final DataSpec f21975a;

    /* renamed from: b */
    public final int f21976b;

    /* renamed from: c */
    private final C9496g0 f21977c;

    /* renamed from: d */
    private final C9456a<? extends T> f21978d;

    /* renamed from: e */
    private volatile T f21979e;

    /* renamed from: com.google.android.exoplayer2.upstream.c0$a */
    /* compiled from: ParsingLoadable */
    public interface C9456a<T> {
        /* renamed from: a */
        T mo23036a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C9455c0(DataSource dataSource, Uri uri, int i, C9456a<? extends T> aVar) {
        this(dataSource, new DataSpec(uri, 1), i, aVar);
    }

    /* renamed from: a */
    public static <T> T m28986a(DataSource dataSource, C9456a<? extends T> aVar, Uri uri, int i) throws IOException {
        C9455c0 c0Var = new C9455c0(dataSource, uri, i, aVar);
        c0Var.load();
        T d = c0Var.mo24473d();
        C9537e.m29296a(d);
        return d;
    }

    /* renamed from: a */
    public final void mo23567a() {
    }

    /* renamed from: b */
    public long mo24471b() {
        return this.f21977c.mo24562b();
    }

    /* renamed from: c */
    public Map<String, List<String>> mo24472c() {
        return this.f21977c.mo24564d();
    }

    /* renamed from: d */
    public final T mo24473d() {
        return this.f21979e;
    }

    /* renamed from: e */
    public Uri mo24474e() {
        return this.f21977c.mo24563c();
    }

    public final void load() throws IOException {
        this.f21977c.mo24565e();
        C9508n nVar = new C9508n(this.f21977c, this.f21975a);
        try {
            nVar.mo24570a();
            Uri uri = this.f21977c.getUri();
            C9537e.m29296a(uri);
            this.f21979e = this.f21978d.mo23036a(uri, nVar);
        } finally {
            Util.m29406a((Closeable) nVar);
        }
    }

    public C9455c0(DataSource dataSource, DataSpec dataSpec, int i, C9456a<? extends T> aVar) {
        this.f21977c = new C9496g0(dataSource);
        this.f21975a = dataSpec;
        this.f21976b = i;
        this.f21978d = aVar;
    }

    /* renamed from: a */
    public static <T> T m28987a(DataSource dataSource, C9456a<? extends T> aVar, DataSpec dataSpec, int i) throws IOException {
        C9455c0 c0Var = new C9455c0(dataSource, dataSpec, i, aVar);
        c0Var.load();
        T d = c0Var.mo24473d();
        C9537e.m29296a(d);
        return d;
    }
}
