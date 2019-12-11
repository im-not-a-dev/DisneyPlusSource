package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.c0 */
/* compiled from: ParsingLoadable */
public final class ParsingLoadable<T> implements Loadable {

    /* renamed from: a */
    public final DataSpec f21975a;

    /* renamed from: b */
    public final int f21976b;

    /* renamed from: c */
    private final C9496g0 f21977c;

    /* renamed from: d */
    private final Parser<? extends T> f21978d;

    /* renamed from: e */
    private volatile T f21979e;

    /* renamed from: com.google.android.exoplayer2.upstream.c0$a */
    /* compiled from: ParsingLoadable */
    public interface Parser<T> {
        /* renamed from: a */
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i, Parser<? extends T> aVar) {
        this(dataSource, new DataSpec(uri, 1), i, aVar);
    }

    /* renamed from: a */
    public static <T> T m28986a(DataSource dataSource, Parser<? extends T> aVar, Uri uri, int i) throws IOException {
        ParsingLoadable c0Var = new ParsingLoadable(dataSource, uri, i, aVar);
        c0Var.load();
        T d = c0Var.mo24473d();
        Assertions.checkNotNull(d);
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
            Assertions.checkNotNull(uri);
            this.f21979e = this.f21978d.parse(uri, nVar);
        } finally {
            Util.m29406a((Closeable) nVar);
        }
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i, Parser<? extends T> aVar) {
        this.f21977c = new C9496g0(dataSource);
        this.f21975a = dataSpec;
        this.f21976b = i;
        this.f21978d = aVar;
    }

    /* renamed from: a */
    public static <T> T m28987a(DataSource dataSource, Parser<? extends T> aVar, DataSpec dataSpec, int i) throws IOException {
        ParsingLoadable c0Var = new ParsingLoadable(dataSource, dataSpec, i, aVar);
        c0Var.load();
        T d = c0Var.mo24473d();
        Assertions.checkNotNull(d);
        return d;
    }
}
