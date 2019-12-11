package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p336b0.C8178a;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p341p.C8349b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p413f.p414a.C10654g;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.C10659l.C10662c;
import p163g.p413f.p414a.C10659l.C10664e;

/* renamed from: com.bumptech.glide.load.n.g */
/* compiled from: DecodeHelper */
final class C8215g<Transcode> {

    /* renamed from: a */
    private final List<C8307a<?>> f17531a = new ArrayList();

    /* renamed from: b */
    private final List<C8111g> f17532b = new ArrayList();

    /* renamed from: c */
    private C10654g f17533c;

    /* renamed from: d */
    private Object f17534d;

    /* renamed from: e */
    private int f17535e;

    /* renamed from: f */
    private int f17536f;

    /* renamed from: g */
    private Class<?> f17537g;

    /* renamed from: h */
    private C8221e f17538h;

    /* renamed from: i */
    private C8115i f17539i;

    /* renamed from: j */
    private Map<Class<?>, C8118l<?>> f17540j;

    /* renamed from: k */
    private Class<Transcode> f17541k;

    /* renamed from: l */
    private boolean f17542l;

    /* renamed from: m */
    private boolean f17543m;

    /* renamed from: n */
    private C8111g f17544n;

    /* renamed from: o */
    private C10657j f17545o;

    /* renamed from: p */
    private C8227j f17546p;

    /* renamed from: q */
    private boolean f17547q;

    /* renamed from: r */
    private boolean f17548r;

    C8215g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <R> void mo21326a(C10654g gVar, Object obj, C8111g gVar2, int i, int i2, C8227j jVar, Class<?> cls, Class<R> cls2, C10657j jVar2, C8115i iVar, Map<Class<?>, C8118l<?>> map, boolean z, boolean z2, C8221e eVar) {
        this.f17533c = gVar;
        this.f17534d = obj;
        this.f17544n = gVar2;
        this.f17535e = i;
        this.f17536f = i2;
        this.f17546p = jVar;
        this.f17537g = cls;
        this.f17538h = eVar;
        this.f17541k = cls2;
        this.f17545o = jVar2;
        this.f17539i = iVar;
        this.f17540j = map;
        this.f17547q = z;
        this.f17548r = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8154b mo21329b() {
        return this.f17533c.mo27534a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo21332c(Class<?> cls) {
        return mo21323a(cls) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8178a mo21333d() {
        return this.f17538h.mo21361a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8227j mo21334e() {
        return this.f17546p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo21335f() {
        return this.f17536f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C8307a<?>> mo21336g() {
        if (!this.f17542l) {
            this.f17542l = true;
            this.f17531a.clear();
            List a = this.f17533c.mo27541f().mo27555a(this.f17534d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C8307a a2 = ((C8306n) a.get(i)).mo19951a(this.f17534d, this.f17535e, this.f17536f, this.f17539i);
                if (a2 != null) {
                    this.f17531a.add(a2);
                }
            }
        }
        return this.f17531a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Class<?> mo21337h() {
        return this.f17534d.getClass();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C8115i mo21338i() {
        return this.f17539i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C10657j mo21339j() {
        return this.f17545o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public List<Class<?>> mo21340k() {
        return this.f17533c.mo27541f().mo27558b(this.f17534d.getClass(), this.f17537g, this.f17541k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C8111g mo21341l() {
        return this.f17544n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Class<?> mo21342m() {
        return this.f17541k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo21343n() {
        return this.f17535e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo21344o() {
        return this.f17548r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Z> C8118l<Z> mo21328b(Class<Z> cls) {
        C8118l<Z> lVar = (C8118l) this.f17540j.get(cls);
        if (lVar == null) {
            Iterator it = this.f17540j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (C8118l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f17540j.isEmpty() || !this.f17547q) {
            return C8349b.m24254a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<C8111g> mo21331c() {
        if (!this.f17543m) {
            this.f17543m = true;
            this.f17532b.clear();
            List g = mo21336g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C8307a aVar = (C8307a) g.get(i);
                if (!this.f17532b.contains(aVar.f17772a)) {
                    this.f17532b.add(aVar.f17772a);
                }
                for (int i2 = 0; i2 < aVar.f17773b.size(); i2++) {
                    if (!this.f17532b.contains(aVar.f17773b.get(i2))) {
                        this.f17532b.add(aVar.f17773b.get(i2));
                    }
                }
            }
        }
        return this.f17532b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21330b(C8258v<?> vVar) {
        return this.f17533c.mo27541f().mo27559b(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21325a() {
        this.f17533c = null;
        this.f17534d = null;
        this.f17544n = null;
        this.f17537g = null;
        this.f17541k = null;
        this.f17539i = null;
        this.f17545o = null;
        this.f17540j = null;
        this.f17546p = null;
        this.f17531a.clear();
        this.f17542l = false;
        this.f17532b.clear();
        this.f17543m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Data> C8255t<Data, ?, Transcode> mo21323a(Class<Data> cls) {
        return this.f17533c.mo27541f().mo27544a(cls, this.f17537g, this.f17541k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Z> C8117k<Z> mo21322a(C8258v<Z> vVar) {
        return this.f17533c.mo27541f().mo27543a(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C8306n<File, ?>> mo21324a(File file) throws C10662c {
        return this.f17533c.mo27541f().mo27555a(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21327a(C8111g gVar) {
        List g = mo21336g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((C8307a) g.get(i)).f17772a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <X> C8108d<X> mo21321a(X x) throws C10664e {
        return this.f17533c.mo27541f().mo27560c(x);
    }
}
