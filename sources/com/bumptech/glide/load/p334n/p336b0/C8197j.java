package com.bumptech.glide.load.p334n.p336b0;

import com.bumptech.glide.load.C8111g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p424w.C10771g;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;
import p163g.p413f.p414a.p424w.p425l.C10777a;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10781d;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10783f;
import p163g.p413f.p414a.p424w.p425l.C10786c;

/* renamed from: com.bumptech.glide.load.n.b0.j */
/* compiled from: SafeKeyGenerator */
public class C8197j {

    /* renamed from: a */
    private final C10771g<C8111g, String> f17502a = new C10771g<>(1000);

    /* renamed from: b */
    private final C4114f<C8199b> f17503b = C10777a.m34038a(10, (C10781d<T>) new C8198a<T>(this));

    /* renamed from: com.bumptech.glide.load.n.b0.j$a */
    /* compiled from: SafeKeyGenerator */
    class C8198a implements C10781d<C8199b> {
        C8198a(C8197j jVar) {
        }

        public C8199b create() {
            try {
                return new C8199b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C8199b implements C10783f {

        /* renamed from: U */
        private final C10786c f17504U = C10786c.m34054b();

        /* renamed from: c */
        final MessageDigest f17505c;

        C8199b(MessageDigest messageDigest) {
            this.f17505c = messageDigest;
        }

        /* renamed from: d */
        public C10786c mo21296d() {
            return this.f17504U;
        }
    }

    /* renamed from: b */
    private String m23801b(C8111g gVar) {
        Object a = this.f17503b.mo14666a();
        C10774j.m34012a(a);
        C8199b bVar = (C8199b) a;
        try {
            gVar.mo21152a(bVar.f17505c);
            return C10775k.m34025a(bVar.f17505c.digest());
        } finally {
            this.f17503b.mo14667a(bVar);
        }
    }

    /* renamed from: a */
    public String mo21294a(C8111g gVar) {
        String str;
        synchronized (this.f17502a) {
            str = (String) this.f17502a.mo27803a(gVar);
        }
        if (str == null) {
            str = m23801b(gVar);
        }
        synchronized (this.f17502a) {
            this.f17502a.mo27807b(gVar, str);
        }
        return str;
    }
}
