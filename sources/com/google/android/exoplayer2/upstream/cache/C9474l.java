package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9563q;
import java.io.File;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.upstream.cache.l */
/* compiled from: CachedContent */
final class C9474l {

    /* renamed from: a */
    public final int f22040a;

    /* renamed from: b */
    public final String f22041b;

    /* renamed from: c */
    private final TreeSet<C9486t> f22042c;

    /* renamed from: d */
    private C9482q f22043d;

    /* renamed from: e */
    private boolean f22044e;

    public C9474l(int i, String str) {
        this(i, str, C9482q.f22065c);
    }

    /* renamed from: a */
    public C9482q mo24511a() {
        return this.f22043d;
    }

    /* renamed from: b */
    public TreeSet<C9486t> mo24518b() {
        return this.f22042c;
    }

    /* renamed from: c */
    public boolean mo24519c() {
        return this.f22042c.isEmpty();
    }

    /* renamed from: d */
    public boolean mo24520d() {
        return this.f22044e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9474l.class != obj.getClass()) {
            return false;
        }
        C9474l lVar = (C9474l) obj;
        if (this.f22040a != lVar.f22040a || !this.f22041b.equals(lVar.f22041b) || !this.f22042c.equals(lVar.f22042c) || !this.f22043d.equals(lVar.f22043d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.f22040a * 31) + this.f22041b.hashCode()) * 31) + this.f22043d.hashCode();
    }

    public C9474l(int i, String str, C9482q qVar) {
        this.f22040a = i;
        this.f22041b = str;
        this.f22043d = qVar;
        this.f22042c = new TreeSet<>();
    }

    /* renamed from: a */
    public boolean mo24517a(C9481p pVar) {
        C9482q qVar = this.f22043d;
        this.f22043d = qVar.mo24549a(pVar);
        return !this.f22043d.equals(qVar);
    }

    /* renamed from: a */
    public void mo24515a(boolean z) {
        this.f22044e = z;
    }

    /* renamed from: a */
    public void mo24514a(C9486t tVar) {
        this.f22042c.add(tVar);
    }

    /* renamed from: a */
    public C9486t mo24512a(long j) {
        C9486t tVar;
        C9486t a = C9486t.m29185a(this.f22041b, j);
        C9486t tVar2 = (C9486t) this.f22042c.floor(a);
        if (tVar2 != null && tVar2.f22030U + tVar2.f22031V > j) {
            return tVar2;
        }
        C9486t tVar3 = (C9486t) this.f22042c.ceiling(a);
        if (tVar3 == null) {
            tVar = C9486t.m29189b(this.f22041b, j);
        } else {
            tVar = C9486t.m29186a(this.f22041b, j, tVar3.f22030U - j);
        }
        return tVar;
    }

    /* renamed from: a */
    public long mo24510a(long j, long j2) {
        C9486t a = mo24512a(j);
        if (a.mo24504a()) {
            return -Math.min(a.mo24505b() ? Long.MAX_VALUE : a.f22031V, j2);
        }
        long j3 = j + j2;
        long j4 = a.f22030U + a.f22031V;
        if (j4 < j3) {
            for (C9486t tVar : this.f22042c.tailSet(a, false)) {
                long j5 = tVar.f22030U;
                if (j5 <= j4) {
                    j4 = Math.max(j4, j5 + tVar.f22031V);
                    if (j4 >= j3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j4 - j, j2);
    }

    /* renamed from: a */
    public C9486t mo24513a(C9486t tVar, long j, boolean z) {
        File file;
        C9537e.m29301b(this.f22042c.remove(tVar));
        File file2 = tVar.f22033X;
        if (z) {
            file = C9486t.m29187a(file2.getParentFile(), this.f22040a, tVar.f22030U, j);
            if (!file2.renameTo(file)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to rename ");
                sb.append(file2);
                sb.append(" to ");
                sb.append(file);
                C9563q.m29500d("CachedContent", sb.toString());
            }
            C9486t a = tVar.mo24555a(file, j);
            this.f22042c.add(a);
            return a;
        }
        file = file2;
        C9486t a2 = tVar.mo24555a(file, j);
        this.f22042c.add(a2);
        return a2;
    }

    /* renamed from: a */
    public boolean mo24516a(C9470j jVar) {
        if (!this.f22042c.remove(jVar)) {
            return false;
        }
        jVar.f22033X.delete();
        return true;
    }
}
