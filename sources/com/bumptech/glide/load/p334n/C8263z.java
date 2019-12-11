package com.bumptech.glide.load.p334n;

import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p334n.C8213f.C8214a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.util.Collections;
import java.util.List;
import p163g.p413f.p414a.p424w.C10770f;

/* renamed from: com.bumptech.glide.load.n.z */
/* compiled from: SourceGenerator */
class C8263z implements C8213f, C8123a<Object>, C8214a {

    /* renamed from: U */
    private final C8214a f17722U;

    /* renamed from: V */
    private int f17723V;

    /* renamed from: W */
    private C8200c f17724W;

    /* renamed from: X */
    private Object f17725X;

    /* renamed from: Y */
    private volatile C8307a<?> f17726Y;

    /* renamed from: Z */
    private C8210d f17727Z;

    /* renamed from: c */
    private final C8215g<?> f17728c;

    C8263z(C8215g<?> gVar, C8214a aVar) {
        this.f17728c = gVar;
        this.f17722U = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m24008b(Object obj) {
        String str = "SourceGenerator";
        long a = C10770f.m33999a();
        try {
            C8108d a2 = this.f17728c.mo21321a(obj);
            C8212e eVar = new C8212e(a2, obj, this.f17728c.mo21338i());
            this.f17727Z = new C8210d(this.f17726Y.f17772a, this.f17728c.mo21341l());
            this.f17728c.mo21333d().mo21270a(this.f17727Z, eVar);
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f17727Z);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(a2);
                sb.append(", duration: ");
                sb.append(C10770f.m33998a(a));
                Log.v(str, sb.toString());
            }
            this.f17726Y.f17774c.cleanup();
            this.f17724W = new C8200c(Collections.singletonList(this.f17726Y.f17772a), this.f17728c, this);
        } catch (Throwable th) {
            this.f17726Y.f17774c.cleanup();
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m24009c() {
        return this.f17723V < this.f17728c.mo21336g().size();
    }

    /* renamed from: a */
    public boolean mo21297a() {
        Object obj = this.f17725X;
        if (obj != null) {
            this.f17725X = null;
            m24008b(obj);
        }
        C8200c cVar = this.f17724W;
        if (cVar != null && cVar.mo21297a()) {
            return true;
        }
        this.f17724W = null;
        this.f17726Y = null;
        boolean z = false;
        while (!z && m24009c()) {
            List g = this.f17728c.mo21336g();
            int i = this.f17723V;
            this.f17723V = i + 1;
            this.f17726Y = (C8307a) g.get(i);
            if (this.f17726Y != null && (this.f17728c.mo21334e().mo21369a(this.f17726Y.f17774c.mo21142b()) || this.f17728c.mo21332c(this.f17726Y.f17774c.mo21140a()))) {
                this.f17726Y.f17774c.mo21141a(this.f17728c.mo21339j(), this);
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        C8307a<?> aVar = this.f17726Y;
        if (aVar != null) {
            aVar.f17774c.cancel();
        }
    }

    /* renamed from: a */
    public void mo21180a(Object obj) {
        C8227j e = this.f17728c.mo21334e();
        if (obj == null || !e.mo21369a(this.f17726Y.f17774c.mo21142b())) {
            this.f17722U.mo21319a(this.f17726Y.f17772a, obj, this.f17726Y.f17774c, this.f17726Y.f17774c.mo21142b(), this.f17727Z);
            return;
        }
        this.f17725X = obj;
        this.f17722U.mo21320b();
    }

    /* renamed from: b */
    public void mo21320b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo21179a(Exception exc) {
        this.f17722U.mo21318a(this.f17727Z, exc, this.f17726Y.f17774c, this.f17726Y.f17774c.mo21142b());
    }

    /* renamed from: a */
    public void mo21319a(C8111g gVar, Object obj, C8122d<?> dVar, C8105a aVar, C8111g gVar2) {
        this.f17722U.mo21319a(gVar, obj, dVar, this.f17726Y.f17774c.mo21142b(), gVar);
    }

    /* renamed from: a */
    public void mo21318a(C8111g gVar, Exception exc, C8122d<?> dVar, C8105a aVar) {
        this.f17722U.mo21318a(gVar, exc, dVar, this.f17726Y.f17774c.mo21142b());
    }
}
