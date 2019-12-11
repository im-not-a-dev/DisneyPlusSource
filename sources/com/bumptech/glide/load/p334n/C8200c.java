package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p334n.C8213f.C8214a;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.c */
/* compiled from: DataCacheGenerator */
class C8200c implements C8213f, C8123a<Object> {

    /* renamed from: U */
    private final C8215g<?> f17506U;

    /* renamed from: V */
    private final C8214a f17507V;

    /* renamed from: W */
    private int f17508W;

    /* renamed from: X */
    private C8111g f17509X;

    /* renamed from: Y */
    private List<C8306n<File, ?>> f17510Y;

    /* renamed from: Z */
    private int f17511Z;

    /* renamed from: a0 */
    private volatile C8307a<?> f17512a0;

    /* renamed from: b0 */
    private File f17513b0;

    /* renamed from: c */
    private final List<C8111g> f17514c;

    C8200c(C8215g<?> gVar, C8214a aVar) {
        this(gVar.mo21331c(), gVar, aVar);
    }

    /* renamed from: b */
    private boolean m23804b() {
        return this.f17511Z < this.f17510Y.size();
    }

    /* renamed from: a */
    public boolean mo21297a() {
        while (true) {
            boolean z = false;
            if (this.f17510Y == null || !m23804b()) {
                this.f17508W++;
                if (this.f17508W >= this.f17514c.size()) {
                    return false;
                }
                C8111g gVar = (C8111g) this.f17514c.get(this.f17508W);
                this.f17513b0 = this.f17506U.mo21333d().mo21269a(new C8210d(gVar, this.f17506U.mo21341l()));
                File file = this.f17513b0;
                if (file != null) {
                    this.f17509X = gVar;
                    this.f17510Y = this.f17506U.mo21324a(file);
                    this.f17511Z = 0;
                }
            } else {
                this.f17512a0 = null;
                while (!z && m23804b()) {
                    List<C8306n<File, ?>> list = this.f17510Y;
                    int i = this.f17511Z;
                    this.f17511Z = i + 1;
                    this.f17512a0 = ((C8306n) list.get(i)).mo19951a(this.f17513b0, this.f17506U.mo21343n(), this.f17506U.mo21335f(), this.f17506U.mo21338i());
                    if (this.f17512a0 != null && this.f17506U.mo21332c(this.f17512a0.f17774c.mo21140a())) {
                        this.f17512a0.f17774c.mo21141a(this.f17506U.mo21339j(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        C8307a<?> aVar = this.f17512a0;
        if (aVar != null) {
            aVar.f17774c.cancel();
        }
    }

    C8200c(List<C8111g> list, C8215g<?> gVar, C8214a aVar) {
        this.f17508W = -1;
        this.f17514c = list;
        this.f17506U = gVar;
        this.f17507V = aVar;
    }

    /* renamed from: a */
    public void mo21180a(Object obj) {
        this.f17507V.mo21319a(this.f17509X, obj, this.f17512a0.f17774c, C8105a.DATA_DISK_CACHE, this.f17509X);
    }

    /* renamed from: a */
    public void mo21179a(Exception exc) {
        this.f17507V.mo21318a(this.f17509X, exc, this.f17512a0.f17774c, C8105a.DATA_DISK_CACHE);
    }
}
