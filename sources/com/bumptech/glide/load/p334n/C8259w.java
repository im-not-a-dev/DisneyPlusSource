package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p334n.C8213f.C8214a;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.w */
/* compiled from: ResourceCacheGenerator */
class C8259w implements C8213f, C8123a<Object> {

    /* renamed from: U */
    private final C8215g<?> f17701U;

    /* renamed from: V */
    private int f17702V;

    /* renamed from: W */
    private int f17703W = -1;

    /* renamed from: X */
    private C8111g f17704X;

    /* renamed from: Y */
    private List<C8306n<File, ?>> f17705Y;

    /* renamed from: Z */
    private int f17706Z;

    /* renamed from: a0 */
    private volatile C8307a<?> f17707a0;

    /* renamed from: b0 */
    private File f17708b0;

    /* renamed from: c */
    private final C8214a f17709c;

    /* renamed from: c0 */
    private C8260x f17710c0;

    C8259w(C8215g<?> gVar, C8214a aVar) {
        this.f17701U = gVar;
        this.f17709c = aVar;
    }

    /* renamed from: b */
    private boolean m24001b() {
        return this.f17706Z < this.f17705Y.size();
    }

    /* renamed from: a */
    public boolean mo21297a() {
        List c = this.f17701U.mo21331c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List k = this.f17701U.mo21340k();
        if (!k.isEmpty()) {
            while (true) {
                if (this.f17705Y == null || !m24001b()) {
                    this.f17703W++;
                    if (this.f17703W >= k.size()) {
                        this.f17702V++;
                        if (this.f17702V >= c.size()) {
                            return false;
                        }
                        this.f17703W = 0;
                    }
                    C8111g gVar = (C8111g) c.get(this.f17702V);
                    Class cls = (Class) k.get(this.f17703W);
                    C8111g gVar2 = gVar;
                    C8260x xVar = new C8260x(this.f17701U.mo21329b(), gVar2, this.f17701U.mo21341l(), this.f17701U.mo21343n(), this.f17701U.mo21335f(), this.f17701U.mo21328b(cls), cls, this.f17701U.mo21338i());
                    this.f17710c0 = xVar;
                    this.f17708b0 = this.f17701U.mo21333d().mo21269a(this.f17710c0);
                    File file = this.f17708b0;
                    if (file != null) {
                        this.f17704X = gVar;
                        this.f17705Y = this.f17701U.mo21324a(file);
                        this.f17706Z = 0;
                    }
                } else {
                    this.f17707a0 = null;
                    while (!z && m24001b()) {
                        List<C8306n<File, ?>> list = this.f17705Y;
                        int i = this.f17706Z;
                        this.f17706Z = i + 1;
                        this.f17707a0 = ((C8306n) list.get(i)).mo19951a(this.f17708b0, this.f17701U.mo21343n(), this.f17701U.mo21335f(), this.f17701U.mo21338i());
                        if (this.f17707a0 != null && this.f17701U.mo21332c(this.f17707a0.f17774c.mo21140a())) {
                            this.f17707a0.f17774c.mo21141a(this.f17701U.mo21339j(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f17701U.mo21342m())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any load path from ");
            sb.append(this.f17701U.mo21337h());
            sb.append(" to ");
            sb.append(this.f17701U.mo21342m());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void cancel() {
        C8307a<?> aVar = this.f17707a0;
        if (aVar != null) {
            aVar.f17774c.cancel();
        }
    }

    /* renamed from: a */
    public void mo21180a(Object obj) {
        this.f17709c.mo21319a(this.f17704X, obj, this.f17707a0.f17774c, C8105a.RESOURCE_DISK_CACHE, this.f17710c0);
    }

    /* renamed from: a */
    public void mo21179a(Exception exc) {
        this.f17709c.mo21318a(this.f17710c0, exc, this.f17707a0.f17774c, C8105a.RESOURCE_DISK_CACHE);
    }
}
