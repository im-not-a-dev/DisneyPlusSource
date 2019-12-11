package p163g.p174d.p178b.p193j0;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5326w;

/* renamed from: g.d.b.j0.d */
/* compiled from: Track.kt */
public class C5290d {

    /* renamed from: a */
    private WeakReference<C5326w> f12658a;

    /* renamed from: b */
    private final Object f12659b;

    /* renamed from: c */
    private final String f12660c;

    /* renamed from: d */
    private final String f12661d;

    public C5290d(Object obj, String str, String str2, C5326w wVar) {
        this.f12659b = obj;
        this.f12660c = str;
        this.f12661d = str2;
        this.f12658a = new WeakReference<>(wVar);
    }

    /* renamed from: a */
    public final String mo16867a() {
        return this.f12661d;
    }

    /* renamed from: b */
    public final String mo16869b() {
        return this.f12660c;
    }

    /* renamed from: c */
    public final Object mo16870c() {
        return this.f12659b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final WeakReference<C5326w> mo16871d() {
        return this.f12658a;
    }

    /* renamed from: e */
    public boolean mo16858e() {
        C5326w wVar = (C5326w) this.f12658a.get();
        if (wVar != null) {
            return wVar.mo7610a(this);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5290d)) {
            return false;
        }
        return Intrinsics.areEqual(((C5290d) obj).f12659b, this.f12659b);
    }

    /* renamed from: f */
    public void mo16859f() {
    }

    public int hashCode() {
        Object obj = this.f12659b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mime: "
            r0.append(r1)
            java.lang.String r1 = r2.f12660c
            r0.append(r1)
            java.lang.String r1 = ", Native: "
            r0.append(r1)
            java.lang.Object r1 = r2.f12659b
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.String r1 = "null"
        L_0x0021:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p193j0.C5290d.toString():java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16868a(WeakReference<C5326w> weakReference) {
        this.f12658a = weakReference;
    }
}
