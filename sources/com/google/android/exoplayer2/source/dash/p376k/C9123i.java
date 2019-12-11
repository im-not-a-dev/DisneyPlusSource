package com.google.android.exoplayer2.source.dash.p376k;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.C9103f;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9128a;
import com.google.android.exoplayer2.source.dash.p376k.C9127j.C9132e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.k.i */
/* compiled from: Representation */
public abstract class C9123i {

    /* renamed from: a */
    public final Format f20466a;

    /* renamed from: b */
    public final String f20467b;

    /* renamed from: c */
    public final long f20468c;

    /* renamed from: d */
    public final List<C9118d> f20469d;

    /* renamed from: e */
    private final C9122h f20470e;

    /* renamed from: com.google.android.exoplayer2.source.dash.k.i$b */
    /* compiled from: Representation */
    public static class C9125b extends C9123i implements C9103f {

        /* renamed from: f */
        private final C9128a f20471f;

        public C9125b(long j, Format format, String str, C9128a aVar, List<C9118d> list) {
            super(j, format, str, aVar, list);
            this.f20471f = aVar;
        }

        /* renamed from: a */
        public long mo23635a(long j) {
            return this.f20471f.mo23740b(j);
        }

        /* renamed from: b */
        public C9122h mo23640b(long j) {
            return this.f20471f.mo23738a((C9123i) this, j);
        }

        /* renamed from: c */
        public int mo23641c(long j) {
            return this.f20471f.mo23736a(j);
        }

        /* renamed from: c */
        public String mo23730c() {
            return null;
        }

        /* renamed from: d */
        public C9103f mo23731d() {
            return this;
        }

        /* renamed from: e */
        public C9122h mo23732e() {
            return null;
        }

        /* renamed from: a */
        public long mo23636a(long j, long j2) {
            return this.f20471f.mo23737a(j, j2);
        }

        /* renamed from: b */
        public long mo23639b(long j, long j2) {
            return this.f20471f.mo23741b(j, j2);
        }

        /* renamed from: a */
        public boolean mo23637a() {
            return this.f20471f.mo23742c();
        }

        /* renamed from: b */
        public long mo23638b() {
            return this.f20471f.mo23739b();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.k.i$c */
    /* compiled from: Representation */
    public static class C9126c extends C9123i {

        /* renamed from: f */
        private final String f20472f;

        /* renamed from: g */
        private final C9122h f20473g;

        /* renamed from: h */
        private final C9133k f20474h;

        public C9126c(long j, Format format, String str, C9132e eVar, List<C9118d> list, String str2, long j2) {
            C9133k kVar;
            super(j, format, str, eVar, list);
            Uri.parse(str);
            this.f20473g = eVar.mo23743b();
            this.f20472f = str2;
            if (this.f20473g != null) {
                kVar = null;
            } else {
                C9122h hVar = new C9122h(null, 0, j2);
                kVar = new C9133k(hVar);
            }
            this.f20474h = kVar;
        }

        /* renamed from: c */
        public String mo23730c() {
            return this.f20472f;
        }

        /* renamed from: d */
        public C9103f mo23731d() {
            return this.f20474h;
        }

        /* renamed from: e */
        public C9122h mo23732e() {
            return this.f20473g;
        }
    }

    /* renamed from: a */
    public static C9123i m27331a(long j, Format format, String str, C9127j jVar, List<C9118d> list) {
        return m27332a(j, format, str, jVar, list, null);
    }

    /* renamed from: c */
    public abstract String mo23730c();

    /* renamed from: d */
    public abstract C9103f mo23731d();

    /* renamed from: e */
    public abstract C9122h mo23732e();

    /* renamed from: f */
    public C9122h mo23733f() {
        return this.f20470e;
    }

    private C9123i(long j, Format format, String str, C9127j jVar, List<C9118d> list) {
        List<C9118d> list2;
        this.f20466a = format;
        this.f20467b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f20469d = list2;
        this.f20470e = jVar.mo23735a(this);
        this.f20468c = jVar.mo23734a();
    }

    /* renamed from: a */
    public static C9123i m27332a(long j, Format format, String str, C9127j jVar, List<C9118d> list, String str2) {
        C9127j jVar2 = jVar;
        if (jVar2 instanceof C9132e) {
            C9126c cVar = new C9126c(j, format, str, (C9132e) jVar2, list, str2, -1);
            return cVar;
        } else if (jVar2 instanceof C9128a) {
            C9125b bVar = new C9125b(j, format, str, (C9128a) jVar2, list);
            return bVar;
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }
}
