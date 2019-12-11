package com.bumptech.glide.load.p334n.p336b0;

import android.util.Log;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p334n.p336b0.C8178a.C8180b;
import java.io.File;
import java.io.IOException;
import p163g.p413f.p414a.p415p.C10671a;
import p163g.p413f.p414a.p415p.C10671a.C10674c;
import p163g.p413f.p414a.p415p.C10671a.C10676e;

/* renamed from: com.bumptech.glide.load.n.b0.e */
/* compiled from: DiskLruCacheWrapper */
public class C8187e implements C8178a {

    /* renamed from: a */
    private final C8197j f17480a;

    /* renamed from: b */
    private final File f17481b;

    /* renamed from: c */
    private final long f17482c;

    /* renamed from: d */
    private final C8182c f17483d = new C8182c();

    /* renamed from: e */
    private C10671a f17484e;

    @Deprecated
    protected C8187e(File file, long j) {
        this.f17481b = file;
        this.f17482c = j;
        this.f17480a = new C8197j();
    }

    /* renamed from: a */
    public static C8178a m23771a(File file, long j) {
        return new C8187e(file, j);
    }

    /* renamed from: a */
    private synchronized C10671a m23772a() throws IOException {
        if (this.f17484e == null) {
            this.f17484e = C10671a.m33510a(this.f17481b, 1, 1, this.f17482c);
        }
        return this.f17484e;
    }

    /* renamed from: a */
    public File mo21269a(C8111g gVar) {
        String a = this.f17480a.mo21294a(gVar);
        String str = "DiskLruCacheWrapper";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(a);
            sb.append(" for for Key: ");
            sb.append(gVar);
            Log.v(str, sb.toString());
        }
        try {
            C10676e f = m23772a().mo27586f(a);
            if (f != null) {
                return f.mo27597a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo21270a(C8111g gVar, C8180b bVar) {
        C10674c e;
        String str = "DiskLruCacheWrapper";
        String a = this.f17480a.mo21294a(gVar);
        this.f17483d.mo21273a(a);
        try {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(a);
                sb.append(" for for Key: ");
                sb.append(gVar);
                Log.v(str, sb.toString());
            }
            try {
                C10671a a2 = m23772a();
                if (a2.mo27586f(a) == null) {
                    e = a2.mo27585e(a);
                    if (e != null) {
                        if (bVar.mo21272a(e.mo27590a(0))) {
                            e.mo27593c();
                        }
                        e.mo27592b();
                        this.f17483d.mo21274b(a);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Had two simultaneous puts for: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IOException e2) {
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Unable to put to disk cache", e2);
                }
            } catch (Throwable th) {
                e.mo27592b();
                throw th;
            }
        } finally {
            this.f17483d.mo21274b(a);
        }
    }
}
